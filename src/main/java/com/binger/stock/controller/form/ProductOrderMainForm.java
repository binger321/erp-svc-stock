package com.binger.stock.controller.form;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 生产订单主表
 */
@ApiModel(value="生产订单主表")
@Data
public class ProductOrderMainForm {



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
     * 预计付款日期,账期生产时标注预计付款时间，避免财务漏付款。到期要付款了给出提醒
     */
    @ApiModelProperty(value="预计付款日期,账期生产时标注预计付款时间，避免财务漏付款。到期要付款了给出提醒",required = false)
    private Date prePayTime;

    /**
     * 付款时间
     */
    @ApiModelProperty(value="付款时间",required = false)
    private Date payTime;

    /**
     * 付款人名字
     */
    @ApiModelProperty(value="付款人名字",required = false)
    private String payUserName;

    /**
     * 订单本币金额
     */
    @ApiModelProperty(value="订单本币金额",required = false)
    private BigDecimal localTotalMny;

    /**
     * 付款金额
     */
    @ApiModelProperty(value="付款金额",required = false)
    private BigDecimal payTotalMny;

    /**
     * 未付款金额
     */
    @ApiModelProperty(value="未付款金额",required = false)
    private BigDecimal unPayMny;

    /**
     * 生产数量
     */
    @ApiModelProperty(value="生产数量",required = false)
    private Integer quantity;

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
     * 供应商编码
     */
    @ApiModelProperty(value="供应商编码",required = false)
    private String supplierCode;

    /**
     * 供应商名称
     */
    @ApiModelProperty(value="供应商名称",required = false)
    private String supplierName;

    /**
     * 预计到货日期,生产用，生产也可以填
     */
    @ApiModelProperty(value="预计到货日期,生产用，生产也可以填",required = false)
    private Date expDeliveredTime;

    /**
     * 预计到货时间
     */
    @ApiModelProperty(value="预计到货时间",required = false)
    private Date deliveredTime;

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
     * 物流费
     */
    @ApiModelProperty(value="物流费",required = false)
    private BigDecimal logisFee;

    /**
     * 仓库名称
     */
    @ApiModelProperty(value="仓库名称",required = true)
    private Integer warehouseId;

    /**
     * 归档时间
     */
    @ApiModelProperty(value="归档时间",required = false)
    private Date archiveDate;

    /**
     * 单据日期
     */
    @ApiModelProperty(value="单据日期",required = false)
    private Date billDate;


}