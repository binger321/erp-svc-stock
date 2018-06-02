package com.binger.stock.service.impl;

import com.binger.common.ResponseCode;
import com.binger.common.ServerResponse;
import com.binger.common.enums.BillTypeEnum;
import com.binger.common.exception.BusinessException;
import com.binger.common.util.DozerUtils;
import com.binger.stock.controller.form.ProductOrderDetailForm;
import com.binger.stock.controller.form.ProductOrderForm;
import com.binger.stock.controller.form.ProductOrderMainForm;
import com.binger.stock.dao.ProductOrderDetailMapper;
import com.binger.stock.dao.ProductOrderMainMapper;
import com.binger.stock.domain.ProductOrderDetail;
import com.binger.stock.domain.ProductOrderDetailExample;
import com.binger.stock.domain.ProductOrderMain;
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
    public ProductOrderVo insert(ProductOrderForm productOrderForm) {
        ProductOrderMainForm productOrderMainForm = productOrderForm.getProductOrderMainForm();
        if (productOrderMainForm == null) {
            throw BusinessException.create("生产订单编号不能为空！");
        }
        ProductOrderMain productOrderMain = DozerUtils.convert(productOrderMainForm, ProductOrderMain.class);
        List<ProductOrderDetailForm> productOrderDetailFormList = productOrderForm.getProductOrderDetailFormList();
        List<ProductOrderDetail> productOrderDetailList = null;
        if (CollectionUtils.isNotEmpty(productOrderDetailFormList)) {
            productOrderDetailList = DozerUtils.convertList(productOrderDetailFormList, ProductOrderDetail.class);
        }
        constructForm(productOrderMain, productOrderDetailList);
        productOrderMain.setProductOrderCode(remoteGenerateBillCode(BillTypeEnum.PRODUCT_ORDER_BILL.getBillType()));
        productOrderMainMapper.insert(productOrderMain);
        String billCode = productOrderMain.getProductOrderCode();
        Integer id = productOrderMain.getId();
        if (CollectionUtils.isNotEmpty(productOrderDetailList)) {
            productOrderDetailList.forEach(productOrderDetail -> {
                productOrderDetail.setProductOrderMainCode(billCode);
                productOrderDetail.setProductOrderMainId(id);
                productOrderDetailMapper.insert(productOrderDetail);
            });
        }
        return findById(id);
    }

    @Override
    public ProductOrderVo update(ProductOrderForm productOrderForm) {
        ProductOrderMain productOrderMain = DozerUtils.convert(productOrderForm.getProductOrderMainForm(), ProductOrderMain.class);
        List<ProductOrderDetail> productOrderDetailList = DozerUtils.convertList(productOrderForm.getProductOrderDetailFormList(), ProductOrderDetail.class);
        constructForm(productOrderMain, productOrderDetailList);
        productOrderMainMapper.updateByPrimaryKeySelective(productOrderMain);
        if (CollectionUtils.isNotEmpty(productOrderDetailList)) {
            productOrderDetailList.forEach(productOrderDetail ->
                productOrderDetailMapper.updateByPrimaryKeySelective(productOrderDetail)
            );
        }
        return findById(productOrderMain.getId());

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

    private void constructForm(ProductOrderMain productOrderMain, List<ProductOrderDetail> productOrderDetailList) {
        BigDecimal amount = new BigDecimal(0);
        Integer count = 0;
        for (ProductOrderDetail productOrderDetail : productOrderDetailList) {
            BigDecimal pricePer = productOrderDetail.getLocalPrice();
            Integer c = productOrderDetail.getTotalQuantity();
            BigDecimal price = pricePer.multiply(new BigDecimal(c));
            productOrderDetail.setLocalAmount(price);
            count = count + c;
        }
        productOrderMain.setQuantity(count);
        productOrderMain.setLocalTotalMny(amount);
    }
}
