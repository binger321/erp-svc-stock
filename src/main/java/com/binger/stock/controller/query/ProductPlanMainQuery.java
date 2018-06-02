package com.binger.stock.controller.query;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * Created with IntelliJ IDEA.
 * User: zhuyubin
 * Date: 2018/5/24
 * Time: 下午4:49
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@ApiModel("生产计划query")
@Data
public class ProductPlanMainQuery {


    /**
     * 生产计划编号,自己生成
     */
    @ApiModelProperty(value="生产计划编号,自己生成",required = true)
    private String productPlanCode;

    /**
     * 状态,0未审核 50已过期 100已审核
     */
    @ApiModelProperty(value="状态,0未审核 50已过期 100已审核",required = false)
    private Integer planStatus;

    /**
     * 审核人名字
     */
    @ApiModelProperty(value="审核人名字",required = false)
    private String auditUserName;

    /**
     * 供应商ID
     */
    @ApiModelProperty(value="供应商ID",required = false)
    private Integer supplierId;

}
