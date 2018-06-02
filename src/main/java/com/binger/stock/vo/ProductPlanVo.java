package com.binger.stock.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: zhuyubin
 * Date: 2018/5/25
 * Time: 上午9:23
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@ApiModel(value = "生产计划Vo")
@Data
public class ProductPlanVo {

    @ApiModelProperty("生产计划主表")
    private ProductPlanMainVo productPlanMainVo;

    @ApiModelProperty("生产计划详情表")
    private List<ProductPlanDetailVo> productPlanDetailVoList;
}
