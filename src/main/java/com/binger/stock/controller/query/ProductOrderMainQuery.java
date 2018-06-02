package com.binger.stock.controller.query;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 生产订单主表
 */
@ApiModel(value="生产订单主表")
@Data
public class ProductOrderMainQuery {
    /**
     * 生产订单号
     */
    @ApiModelProperty(value="生产订单号",required = true)
    private Integer id;

    /**
     * 生产计划单据号（如果从生产计划制定生产订单）
     */
    @ApiModelProperty(value="生产计划单据号（如果从生产计划制定生产订单）",required = false)
    private String productPlanCode;

    /**
     * 生产订单编号,从规则表里生成
     */
    @ApiModelProperty(value="生产订单编号,从规则表里生成",required = true)
    private String productOrderCode;

    /**
     * 审核人名字
     */
    @ApiModelProperty(value="审核人名字",required = false)
    private String auditUserName;

    /**
     * 付款人名字
     */
    @ApiModelProperty(value="付款人名字",required = false)
    private String payUserName;

    /**
     * 结算方式,账期 月结 现付
     */
    @ApiModelProperty(value="结算方式,账期 月结 现付",required = false)
    private String settlement;

    /**
     * 供应商ID
     */
    @ApiModelProperty(value="供应商ID",required = false)
    private Integer supplierId;

    /**
     * 运单号,有多个的时候用逗号隔开
     */
    @ApiModelProperty(value="运单号,有多个的时候用逗号隔开",required = false)
    private String logistNo;

    /**
     * 物流公司名称
     */
    @ApiModelProperty(value="物流公司名称",required = false)
    private String logistCompanyName;

    /**
     * 仓库名称
     */
    @ApiModelProperty(value="仓库名称",required = true)
    private Integer warehouseId;

    /**
     * 生产状态：0准备生产,100开始生产,200在途,900已入库,9供应商取消
     */
    @ApiModelProperty(value="生产状态：0准备生产,100开始生产,200在途,900已入库,9供应商取消",required = false)
    private Integer productStatus;

    /**
     * 状态,100保存 200审核 900归档 9取消
     */
    @ApiModelProperty(value="状态,100保存 200审核 900归档 9取消",required = false)
    private Integer orderStatus;

}