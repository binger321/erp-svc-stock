package com.binger.stock.service;

import com.binger.stock.domain.ProductPlanMainExample;
import com.binger.stock.vo.ProductPlanMainVo;
import com.binger.stock.vo.ProductPlanVo;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: zhuyubin
 * Date: 2018/5/24
 * Time: 下午5:11
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public interface ProductPlanService {

    Long countByExample(ProductPlanMainExample example);

    List<ProductPlanMainVo> selectByExample(ProductPlanMainExample example);

    ProductPlanVo findById(Integer id);

    Boolean generateProductPlan();

    ProductPlanVo auditById(Integer id, Integer planStatus);

    ProductPlanVo cancelById(Integer id);

}
