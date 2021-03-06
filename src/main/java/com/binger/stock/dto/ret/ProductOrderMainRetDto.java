package com.binger.stock.dto.ret;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 生产订单主表dto
 */
@ApiModel(value="生产订单主表dto")
@Data
public class ProductOrderMainRetDto {
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
     * 审核时间
     */
    @ApiModelProperty(value="审核时间",required = false)
    private Date auditTime;

    /**
     * 审核人名字
     */
    @ApiModelProperty(value="审核人名字",required = false)
    private String auditUserName;

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
     * 仓库编号
     */
    @ApiModelProperty(value = "仓库编号", required = false)
    private String warehouseCode;

    /**
     * 仓库名称
     */
    @ApiModelProperty(value = "仓库名称", required = false)
    private String warehouseName;

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

    /**
     * 取消时间
     */
    @ApiModelProperty(value="取消时间",required = false)
    private Date cancelTime;

    /**
     * 取消原因
     */
    @ApiModelProperty(value="取消原因",required = false)
    private String cancelReason;

    /**
     * 归档原因
     */
    @ApiModelProperty(value="归档原因",required = false)
    private String archiveReasonName;

    /**
     * 创建人
     */
    @ApiModelProperty(value="创建人",required = true)
    private String creator;

    /**
     * 创建时间
     */
    @ApiModelProperty(value="创建时间",required = false)
    private Date createTime;

    /**
     * 修改人
     */
    @ApiModelProperty(value="修改人",required = false)
    private String modifier;

    /**
     * 修改时间
     */
    @ApiModelProperty(value="修改时间",required = false)
    private Date modifyTime;

}