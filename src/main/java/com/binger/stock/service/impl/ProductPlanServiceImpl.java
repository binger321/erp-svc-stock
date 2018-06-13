package com.binger.stock.service.impl;

import com.binger.common.ResponseCode;
import com.binger.common.ServerResponse;
import com.binger.common.enums.BillTypeEnum;
import com.binger.common.exception.BusinessException;
import com.binger.common.util.DozerUtils;
import com.binger.stock.dao.ProductPlanDetailMapper;
import com.binger.stock.dao.ProductPlanMainMapper;
import com.binger.stock.dao.StockCurrentNumberMapper;
import com.binger.stock.dao.StockOutBillDetailMapper;
import com.binger.stock.domain.*;
import com.binger.stock.dto.ret.SkuCurrentStockDto;
import com.binger.stock.dto.ret.StockOutDelayRetDto;
import com.binger.stock.enums.ProductPlanStatusEnum;
import com.binger.stock.remote.RemoteBillCodeCtl;
import com.binger.stock.remote.RemoteSaleOrderCtl;
import com.binger.stock.remote.vo.AverageSaleVo;
import com.binger.stock.remote.vo.SupplierSimpleVo;
import com.binger.stock.service.ProductPlanService;
import com.binger.stock.vo.*;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Created with IntelliJ IDEA.
 * User: zhuyubin
 * Date: 2018/5/24
 * Time: 下午5:11
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Service
public class ProductPlanServiceImpl implements ProductPlanService {

    Logger logger = LoggerFactory.getLogger(ProductPlanServiceImpl.class);
    @Autowired
    ProductPlanMainMapper productPlanMainMapper;

    @Autowired
    ProductPlanDetailMapper productPlanDetailMapper;

    @Autowired
    RemoteBillCodeCtl remoteBillCodeCtl;

    @Autowired
    RemoteSaleOrderCtl remoteSaleOrderCtl;

    @Autowired
    StockOutBillDetailMapper stockOutBillDetailMapper;

    @Autowired
    StockCurrentNumberMapper stockCurrentNumberMapper;

    //平均期货天数
    private static Integer averageDelayDays = 5;

    @Override
    public Long countByExample(ProductPlanMainExample example) {
        return productPlanMainMapper.countByExample(example);
    }

    @Override
    public List<ProductPlanMainVo> selectByExample(ProductPlanMainExample example) {
        List<ProductPlanMain> productPlanMainList = productPlanMainMapper.selectByExample(example);
        if (CollectionUtils.isNotEmpty(productPlanMainList)) {
            return DozerUtils.convertList(productPlanMainList, ProductPlanMainVo.class);
        }
        return null;
    }

    @Override
    public ProductPlanVo findById(Integer id) {
        ProductPlanVo productPlanVo = new ProductPlanVo();
        ProductPlanMain productPlanMain = productPlanMainMapper.selectByPrimaryKey(id);
        if (productPlanMain != null) {
            productPlanVo.setProductPlanMainVo(DozerUtils.convert(productPlanVo, ProductPlanMainVo.class));
        }
        ProductPlanDetailExample example = new ProductPlanDetailExample();
        example.createCriteria().andProductPlanMainIdEqualTo(id);
        List<ProductPlanDetail> productPlanDetailList = productPlanDetailMapper.selectByExample(example);
        if (CollectionUtils.isNotEmpty(productPlanDetailList)) {
            productPlanVo.setProductPlanDetailVoList(DozerUtils.convertList(productPlanDetailList, ProductPlanDetailVo.class));
        }
        return productPlanVo;
    }

    @Override
    @Transactional
    public Boolean generateProductPlan() {
        logger.debug("正在生产计划订单任务！");
        List<AverageSaleVo> saleVoList = remoteGetAverageSale();
        List<Integer> goodsIdList = new ArrayList<>(); //用于查询供应商
        saleVoList.forEach(averageSaleVo -> {
            goodsIdList.add(averageSaleVo.getGoodsId());
        });
        List<SupplierSimpleVo> supplierSimpleVoList = remoteGetSupplier(goodsIdList);
        //修改之前未审核的状态为已过期
        modifyProductPlanStatus();
        //备货计划
        constructProductPlan(supplierSimpleVoList, saleVoList);
        return true;
    }

    private void constructProductPlan(List<SupplierSimpleVo> supplierSimpleVoList, List<AverageSaleVo> saleVoList) {
        Map<Integer, List<SupplierSimpleVo>> supplierGoodsMap = new HashMap<>();
        //根据供应商分组，即根据分组得到需要生成多少生产订单
        supplierSimpleVoList.forEach(supplierSimpleVo -> {
            List<SupplierSimpleVo> list = supplierGoodsMap.get(supplierSimpleVo.getSupplierId());
            if (CollectionUtils.isNotEmpty(list)) {
                 list.add(supplierSimpleVo);
            } else {
                list = new ArrayList<>();
                list.add(supplierSimpleVo);
                supplierGoodsMap.put(supplierSimpleVo.getSupplierId(), list);
            }
        });
        supplierGoodsMap.forEach((supplierId, supplierSimpleVos) -> {
            Integer mainId = insertProductPlanMain(supplierId, supplierSimpleVos);
            insertProductPlanDetail(mainId, supplierSimpleVos, saleVoList);
        });
    }

    /**
     * 修改未查看的备货计划状态为已过期
     */
    private void modifyProductPlanStatus() {
        ProductPlanMain productPlanMain = new ProductPlanMain();
        productPlanMain.setPlanStatus(ProductPlanStatusEnum.EXPIRE.getCode());
        ProductPlanMainExample example = new ProductPlanMainExample();
        example.createCriteria().andPlanStatusEqualTo(ProductPlanStatusEnum.NO_AUDIT.getCode());
        productPlanMainMapper.updateByExampleSelective(productPlanMain, example);
    }

    private void insertProductPlanDetail(Integer mainId, List<SupplierSimpleVo> supplierSimpleVos, List<AverageSaleVo> saleVoList) {
        Set<Integer> goodsIdSet = supplierSimpleVos.stream().map(SupplierSimpleVo::getGoodsId).collect(Collectors.toSet());
        List<AverageSaleVo> averageSaleVoDeleteList = new ArrayList<>();
        saleVoList.forEach(averageSaleVo -> {
            if (goodsIdSet.contains(averageSaleVo.getGoodsId())) {
                averageSaleVoDeleteList.add(averageSaleVo);
                ProductPlanDetail productPlanDetail = DozerUtils.convert(averageSaleVo, ProductPlanDetail.class);
                productPlanDetail.setProductPlanMainId(mainId);
                Integer stockQuantity = calculateStockQuantity(averageSaleVo);
                if (stockQuantity != 0) {
                    productPlanDetail.setStockQuantity(stockQuantity);
                    productPlanDetailMapper.insertSelective(productPlanDetail);
                }
            }
        });
        saleVoList.removeAll(averageSaleVoDeleteList);
    }

    private Integer calculateStockQuantity(AverageSaleVo averageSaleVo) {
        BigDecimal threeAverage = averageSaleVo.getThreeDaysSale();
        BigDecimal sevenAverage = averageSaleVo.getSevenDaysSale();
        Integer delayDays = null;
        List<StockOutDelayRetDto> stockOutDelayRetDtoList = stockOutBillDetailMapper.getDelayDaysBySku(averageSaleVo.getSkuId());
        if (CollectionUtils.isNotEmpty(stockOutDelayRetDtoList)) {
            delayDays = stockOutDelayRetDtoList.get(0).getDelayDays();
        }
        if (null == delayDays){
            delayDays = averageDelayDays;
        }
        //适合库存
        BigDecimal number = threeAverage.add(sevenAverage).divide(new BigDecimal(2)).multiply(new BigDecimal(delayDays));
        //获取仓库实际可用库存
        Integer stockNumber = getUseStockNumber(averageSaleVo);
        Integer planNumber = number.intValue() - stockNumber;
        return planNumber < 0 ? 0 : planNumber;
    }

    private Integer getUseStockNumber(AverageSaleVo averageSaleVo) {
        List<SkuCurrentStockDto> skuCurrentStockDtoList =  stockCurrentNumberMapper.countCurrentStock(averageSaleVo.getSkuId(), null);
        Integer count = 0;
        if (CollectionUtils.isNotEmpty(skuCurrentStockDtoList)) {
            for(SkuCurrentStockDto skuCurrentStockDto : skuCurrentStockDtoList) {
                count = skuCurrentStockDto.getUseQuantity() == null ? 0 : skuCurrentStockDto.getUseQuantity() + count;
            }
        }
        return count;
    }

    private Integer insertProductPlanMain(Integer supplierId, List<SupplierSimpleVo> supplierSimpleVos) {
        ProductPlanMain productPlanMain = new ProductPlanMain();
        productPlanMain.setPlanStatus(ProductPlanStatusEnum.NO_AUDIT.getCode());
        productPlanMain.setProductPlanCode(remoteGenerateBillCode(BillTypeEnum.PRODUCT_PLAN_BILL.getBillType()));
        productPlanMain.setSupplierId(supplierId);
        productPlanMain.setSupplierCode(supplierSimpleVos.get(0).getSupplierCode());
        productPlanMain.setSupplierName(supplierSimpleVos.get(0).getSupplierName());
        productPlanMainMapper.insertSelective(productPlanMain);
        return productPlanMain.getId();
    }

    private String remoteGenerateBillCode(String billType) {
        ServerResponse<String> response = remoteBillCodeCtl.generateBill(billType);
        if (ResponseCode.SUCCESS.getCode() == response.getStatus()) {
            String billCode = response.getData();
            if(StringUtils.isNotBlank(billCode)) {
                return billCode;
            }
        }
        throw BusinessException.create("调用远程获取编号失败！");
    }

    private List<SupplierSimpleVo> remoteGetSupplier(List<Integer> goodsIdList) {
        ServerResponse<List<SupplierSimpleVo>> response = remoteSaleOrderCtl.listSupplierByGoodsIds(goodsIdList);
        if (response.getStatus() == ResponseCode.SUCCESS.getCode() && CollectionUtils.isNotEmpty(response.getData())) {
            return response.getData();
        } else {
            throw BusinessException.create("获取供应商出错");
        }
    }

    private List<AverageSaleVo> remoteGetAverageSale(){
        ServerResponse<List<AverageSaleVo>> response = remoteSaleOrderCtl.getAverageSale();
        if (response.getStatus() == ResponseCode.SUCCESS.getCode()) {
            if (CollectionUtils.isNotEmpty(response.getData())) {
                return response.getData();
            } else {
                logger.debug("最近销量中，没有需要生成生成订单的商品！");
                throw BusinessException.create("最近销量中，没有需要生成生成订单的商品！");
            }
        }else {
            logger.debug("调用微服务失败！");
            throw BusinessException.create("最近销量中，没有需要生成生成订单的商品！");

        }
    }

    @Override
    public ProductPlanVo auditById(Integer id) {
        ProductPlanMain productPlanMain = productPlanMainMapper.selectByPrimaryKey(id);
        if (ProductPlanStatusEnum.NO_AUDIT.getCode().equals(productPlanMain.getPlanStatus())) {
            ProductPlanMain main = new ProductPlanMain();
            main.setId(id);
            main.setPlanStatus(ProductPlanStatusEnum.AUDIT.getCode());
            productPlanMainMapper.updateByPrimaryKeySelective(main);
            return findById(id);
        }
        throw BusinessException.create("请查看当前生产计划状态，已过期无法审核！");
    }

    @Override
    public ProductPlanVo cancelById(Integer id) {
        ProductPlanMain productPlanMain = new ProductPlanMain();
        productPlanMain.setId(id);
        productPlanMain.setPlanStatus(ProductPlanStatusEnum.CANCEL.getCode());
        productPlanMainMapper.updateByPrimaryKeySelective(productPlanMain);
        return findById(id);
    }

    @Override
    public List<ProductPlanDetailVo> findDetailByMainId(Integer id) {
        ProductPlanDetailExample example = new ProductPlanDetailExample();
        example.createCriteria().andProductPlanMainIdEqualTo(id);
        List<ProductPlanDetail> productPlanDetailList = productPlanDetailMapper.selectByExample(example);
        if (CollectionUtils.isNotEmpty(productPlanDetailList)) {
            return DozerUtils.convertList(productPlanDetailList, ProductPlanDetailVo.class);
        }
        throw BusinessException.create("没有详情单!");
    }

}
