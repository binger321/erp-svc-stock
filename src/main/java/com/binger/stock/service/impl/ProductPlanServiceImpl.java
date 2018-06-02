package com.binger.stock.service.impl;

import com.binger.common.exception.BusinessException;
import com.binger.common.util.DozerUtils;
import com.binger.stock.dao.ProductPlanDetailMapper;
import com.binger.stock.dao.ProductPlanMainMapper;
import com.binger.stock.domain.ProductPlanDetail;
import com.binger.stock.domain.ProductPlanDetailExample;
import com.binger.stock.domain.ProductPlanMain;
import com.binger.stock.domain.ProductPlanMainExample;
import com.binger.stock.enums.ProductPlanStatusEnum;
import com.binger.stock.service.ProductPlanService;
import com.binger.stock.vo.*;
import org.apache.commons.collections.CollectionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
    public Boolean generateProductPlan() {
        logger.debug("正在生产计划订单任务！");
        return true;
    }

    @Override
    public ProductPlanVo auditById(Integer id, Integer planStatus) {
        if (ProductPlanStatusEnum.NO_AUDIT.getCode().equals(planStatus)) {
            ProductPlanMain productPlanMain = new ProductPlanMain();
            productPlanMain.setId(id);
            productPlanMain.setPlanStatus(ProductPlanStatusEnum.AUDIT.getCode());
            productPlanMainMapper.updateByPrimaryKeySelective(productPlanMain);
            return findById(id);
        }
        throw BusinessException.create("请查看当前生产计划状态，已取消或已过期无法审核！");
    }

    @Override
    public ProductPlanVo cancelById(Integer id) {
        ProductPlanMain productPlanMain = new ProductPlanMain();
        productPlanMain.setId(id);
        productPlanMain.setPlanStatus(ProductPlanStatusEnum.CANCEL.getCode());
        productPlanMainMapper.updateByPrimaryKeySelective(productPlanMain);
        return findById(id);
    }

}
