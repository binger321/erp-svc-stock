package com.binger.stock.service.impl;

import com.binger.common.ResponseCode;
import com.binger.common.ServerResponse;
import com.binger.common.enums.BillTypeEnum;
import com.binger.common.exception.BusinessException;
import com.binger.common.util.DozerUtils;
import com.binger.stock.controller.form.ProductOrderDetailForm;
import com.binger.stock.controller.form.ProductOrderMainForm;
import com.binger.stock.dao.ProductOrderDetailMapper;
import com.binger.stock.dao.ProductOrderMainMapper;
import com.binger.stock.domain.ProductOrderDetail;
import com.binger.stock.domain.ProductOrderDetailExample;
import com.binger.stock.domain.ProductOrderMain;
import com.binger.stock.domain.ProductOrderMainExample;
import com.binger.stock.dto.query.ProductOrderMainQueryDto;
import com.binger.stock.dto.ret.ProductOrderMainRetDto;
import com.binger.stock.enums.ProductOrderStatusEnum;
import com.binger.stock.remote.RemoteBillCodeCtl;
import com.binger.stock.service.ProductOrderService;
import com.binger.stock.vo.ProductOrderDetailVo;
import com.binger.stock.vo.ProductOrderMainVo;
import com.binger.stock.vo.ProductOrderVo;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: zhuyubin
 * Date: 2018/5/24
 * Time: 上午9:58
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Service
public class ProductOrderServiceImpl implements ProductOrderService {

    @Autowired
    private ProductOrderMainMapper productOrderMainMapper;

    @Autowired
    private ProductOrderDetailMapper productOrderDetailMapper;

    @Autowired
    private RemoteBillCodeCtl remoteBillCodeCtl;

    @Override
    public Long countByQuery(ProductOrderMainQueryDto productOrderMainQueryDto) {
        return productOrderMainMapper.countByQuery(productOrderMainQueryDto);
    }

    @Override
    public List<ProductOrderMainVo> listByQuery(ProductOrderMainQueryDto productOrderMainQueryDto) {
        List<ProductOrderMainRetDto> productOrderMainRetDtoList = productOrderMainMapper.listByQuery(productOrderMainQueryDto);
        if (CollectionUtils.isNotEmpty(productOrderMainRetDtoList)) {
            return DozerUtils.convertList(productOrderMainRetDtoList, ProductOrderMainVo.class);
        }
        return null;
    }

    @Override
    public ProductOrderVo findById(Integer id) {
        ProductOrderMain productOrderMain = productOrderMainMapper.selectByPrimaryKey(id);
        ProductOrderVo productOrderVo = new ProductOrderVo();
        if (productOrderMain != null) {
            productOrderVo.setProductOrderMainVo(DozerUtils.convert(productOrderMain, ProductOrderMainVo.class));
        }
        ProductOrderDetailExample example = new ProductOrderDetailExample();
        example.createCriteria().andProductOrderMainIdEqualTo(id);
        List<ProductOrderDetail> productOrderDetailList = productOrderDetailMapper.selectByExample(example);
        if (CollectionUtils.isNotEmpty(productOrderDetailList)) {
            List<ProductOrderDetailVo> productOrderDetailVoList = DozerUtils.convertList(productOrderDetailList, ProductOrderDetailVo.class);
            productOrderVo.setProductOrderDetailVo(productOrderDetailVoList);
        }
        return productOrderVo;

    }

    @Override
    public ProductOrderMainVo findOrderMainById(Integer id) {

        ProductOrderMain productOrderMain = productOrderMainMapper.selectByPrimaryKey(id);

        return DozerUtils.convert(productOrderMain, ProductOrderMainVo.class);
    }

    @Override
    public ProductOrderDetailVo findOrderDetailById(Integer id) {

        ProductOrderDetail productOrderDetail =  productOrderDetailMapper.selectByPrimaryKey(id);

        return DozerUtils.convert(productOrderDetail, ProductOrderDetailVo.class);
    }


    @Override
    public ProductOrderMainVo insertOrderMain(ProductOrderMainForm productOrderMainForm) {
        if (productOrderMainForm == null) {
            throw BusinessException.create("不能添加空的生产订单主表！");
        }
        ProductOrderMain productOrderMain = DozerUtils.convert(productOrderMainForm, ProductOrderMain.class);
        productOrderMain.setProductOrderCode(remoteGenerateBillCode(BillTypeEnum.PRODUCT_ORDER_BILL.getBillType()));
        productOrderMainMapper.insert(productOrderMain);
        return DozerUtils.convert(productOrderMain,ProductOrderMainVo.class);
    }

    @Override

    public ProductOrderDetailVo insertOrderDetail(ProductOrderDetailForm productOrderDetailForm) {
        if (productOrderDetailForm == null) {
            throw BusinessException.create("不能添加空的生产订单子表！");
        }
        ProductOrderDetail productOrderDetail = DozerUtils.convert(productOrderDetailForm, ProductOrderDetail.class);
        productOrderDetailMapper.insert(productOrderDetail);

        constructForm(productOrderDetailForm.getProductOrderMainId());

        return DozerUtils.convert(productOrderDetail,ProductOrderDetailVo.class);

    }





    private Integer getOrderMainStatusByOrderMainId(Integer id){
        ProductOrderMainExample example = new ProductOrderMainExample();
        example.createCriteria().andIdEqualTo(id);
        example.getSelectiveField().orderStatus();
        List<ProductOrderMain> productOrderMainList = productOrderMainMapper.selectByExample(example);
        if (productOrderMainList == null || productOrderMainList.size()==0){
            throw BusinessException.create("没有这个生产订单主表！");
        }

        return productOrderMainList.get(0).getOrderStatus();
    }

    private Integer getOrderMainIdByOrderDerailId(Integer orderDetailId){
        ProductOrderDetailExample example = new ProductOrderDetailExample();
        example.createCriteria().andIdEqualTo(orderDetailId);
        example.getSelectiveField().productOrderMainId();
        List<ProductOrderDetail> productOrderDetailList = productOrderDetailMapper.selectByExample(example);
        if (productOrderDetailList == null || productOrderDetailList.size()==0){
            throw BusinessException.create("没有这个生产订单子表！");
        }

        return productOrderDetailList.get(0).getProductOrderMainId();

    }



    @Override
    public ProductOrderMainVo updateOrderMain(ProductOrderMainForm productOrderMainForm, Integer id) {
        Integer status = getOrderMainStatusByOrderMainId(id);

        if (status.equals(ProductOrderStatusEnum.AUDIT.getCode())){
            throw BusinessException.create("已审核无法修改");
        }
        ProductOrderMain productOrderMain = DozerUtils.convert(productOrderMainForm, ProductOrderMain.class);
        productOrderMain.setId(id);
        productOrderMainMapper.updateByPrimaryKeySelective(productOrderMain);
        return findOrderMainById(productOrderMain.getId());
    }


    @Override
    public ProductOrderDetailVo updateOrderDetail(ProductOrderDetailForm productOrderDetailForm, Integer id) {
        Integer orderMainId = getOrderMainIdByOrderDerailId(id);
        Integer status = getOrderMainStatusByOrderMainId(orderMainId);
        if (status.equals(ProductOrderStatusEnum.AUDIT.getCode())){
            throw BusinessException.create("已审核无法修改");
        }
        ProductOrderDetail productOrderDetail = DozerUtils.convert(productOrderDetailForm,ProductOrderDetail.class);
        productOrderDetail.setId(id);
        productOrderDetailMapper.updateByPrimaryKeySelective(productOrderDetail);
        return findOrderDetailById(productOrderDetail.getId());
    }

    @Override
    public int deleteOrderMain(Integer id) {
        Integer status = getOrderMainStatusByOrderMainId(id);
        if (status.equals(ProductOrderStatusEnum.SAVE.getCode())){
            throw BusinessException.create("无法删除");
        }
        ProductOrderDetailExample example = new ProductOrderDetailExample();
        example.createCriteria().andProductOrderMainIdEqualTo(id);
        productOrderDetailMapper.deleteByExample(example);
        return  productOrderMainMapper.deleteByPrimaryKey(id);
    }

    @Override
    @Transactional(rollbackFor = {RuntimeException.class, Exception.class})
    public int deleteOrderDetail(Integer id) {

        Integer orderMainId = getOrderMainIdByOrderDerailId(id);
        Integer status = getOrderMainStatusByOrderMainId(orderMainId);
        if (!status.equals(ProductOrderStatusEnum.SAVE.getCode())){
            throw BusinessException.create("无法删除");
        }
        int result =productOrderDetailMapper.deleteByPrimaryKey(id);
        constructForm(orderMainId);
        return result;
    }

    @Override
    public ProductOrderMainVo audit(Integer id) {
        ProductOrderMain productOrderMain = new ProductOrderMain();
        productOrderMain.setAuditTime(new Date());
        productOrderMain.setId(id);
        productOrderMain.setOrderStatus(ProductOrderStatusEnum.AUDIT.getCode());
        productOrderMainMapper.updateByPrimaryKeySelective(productOrderMain);
        ProductOrderMain productOrderMain1 = productOrderMainMapper.selectByPrimaryKey(id);
        if (productOrderMain1 != null) {
            return DozerUtils.convert(productOrderMain1, ProductOrderMainVo.class);
        }
        return null;
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

    private void constructForm(Integer orderMainId) {
        ProductOrderDetailExample example = new ProductOrderDetailExample();
        example.createCriteria().andProductOrderMainIdEqualTo(orderMainId);
        List<ProductOrderDetail> productOrderDetailList = productOrderDetailMapper.selectByExample(example);
        BigDecimal amount = new BigDecimal(0);
        Integer count = 0;
        for (ProductOrderDetail productOrderDetail : productOrderDetailList) {
            BigDecimal pricePer = productOrderDetail.getLocalPrice();
            Integer c = productOrderDetail.getTotalQuantity();
            BigDecimal price = pricePer.multiply(new BigDecimal(c));
            productOrderDetail.setLocalAmount(price);
            count = count + c;
        }
        ProductOrderMain main = new ProductOrderMain();
        main.setId(orderMainId);
        main.setQuantity(1);
        main.setLocalTotalMny(amount);
        productOrderMainMapper.updateByPrimaryKeySelective(main);

    }

    @Override
    public List<ProductOrderDetailVo> findAllOrderDetailByOrderMainId(Integer id) {
        ProductOrderDetailExample example = new ProductOrderDetailExample();
        example.createCriteria().andProductOrderMainIdEqualTo(id);
        List<ProductOrderDetail> productOrderDetailList = productOrderDetailMapper.selectByExample(example);
        List<ProductOrderDetailVo> productOrderDetailVos = DozerUtils.convertList(productOrderDetailList,ProductOrderDetailVo.class);
        return productOrderDetailVos;
    }
}
