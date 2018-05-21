package com.binger.stock.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 生产订单主表
 */
@ApiModel(value="生产订单主表")
public class ProductOrderMain implements Serializable {
    /**
     * 生产订单号
     */
    @ApiModelProperty(value="生产订单号",required = true)
    private Integer id;

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
     * 审核人ID
     */
    @ApiModelProperty(value="审核人ID",required = false)
    private Integer auditUserId;

    /**
     * 审核人名字
     */
    @ApiModelProperty(value="审核人名字",required = false)
    private String auditUserName;

    /**
     * 生产单生成时间
     */
    @ApiModelProperty(value="生产单生成时间",required = false)
    private Date productCreateDate;

    /**
     * 货号ID,生产单必填，其他单子类型必空
     */
    @ApiModelProperty(value="货号ID,生产单必填，其他单子类型必空",required = false)
    private Integer goodsId;

    /**
     * 货号编码
     */
    @ApiModelProperty(value="货号编码",required = false)
    private String goodsCode;

    /**
     * 货号
     */
    @ApiModelProperty(value="货号",required = false)
    private String goodsName;

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
     * 付款人
     */
    @ApiModelProperty(value="付款人",required = false)
    private Integer payUserId;

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
     * 累计收票金额
     */
    @ApiModelProperty(value="累计收票金额",required = false)
    private BigDecimal totalInvoiceMny;

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
     * 未收票金额
     */
    @ApiModelProperty(value="未收票金额",required = false)
    private BigDecimal nonInvoiceMny;

    /**
     * 预计到货时间
     */
    @ApiModelProperty(value="预计到货时间",required = false)
    private Date deliveredTime;

    /**
     * 运单号,有多个的时候用逗号隔开
     */
    @ApiModelProperty(value="运单号,有多个的时候用逗号隔开",required = false)
    private String logisNo;

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
     * 下单总数量,将明细的SKU数累加，用户需要快速查看生产单大小
     */
    @ApiModelProperty(value="下单总数量,将明细的SKU数累加，用户需要快速查看生产单大小",required = false)
    private Integer orderNumber;

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
     * 归档编码
     */
    @ApiModelProperty(value="归档编码",required = false)
    private String archiveReasonCode;

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

    /**
     * product_order_main
     */
    private static final long serialVersionUID = 1L;

    /**
     * 生产订单号
     * @return id 生产订单号
     */
    public Integer getId() {
        return id;
    }

    /**
     * 生产订单号
     * @param id 生产订单号
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 生产订单编号,从规则表里生成
     * @return product_order_code 生产订单编号,从规则表里生成
     */
    public String getProductOrderCode() {
        return productOrderCode;
    }

    /**
     * 生产订单编号,从规则表里生成
     * @param productOrderCode 生产订单编号,从规则表里生成
     */
    public void setProductOrderCode(String productOrderCode) {
        this.productOrderCode = productOrderCode == null ? null : productOrderCode.trim();
    }

    /**
     * 审核时间
     * @return audit_time 审核时间
     */
    public Date getAuditTime() {
        return auditTime;
    }

    /**
     * 审核时间
     * @param auditTime 审核时间
     */
    public void setAuditTime(Date auditTime) {
        this.auditTime = auditTime;
    }

    /**
     * 审核人ID
     * @return audit_user_id 审核人ID
     */
    public Integer getAuditUserId() {
        return auditUserId;
    }

    /**
     * 审核人ID
     * @param auditUserId 审核人ID
     */
    public void setAuditUserId(Integer auditUserId) {
        this.auditUserId = auditUserId;
    }

    /**
     * 审核人名字
     * @return audit_user_name 审核人名字
     */
    public String getAuditUserName() {
        return auditUserName;
    }

    /**
     * 审核人名字
     * @param auditUserName 审核人名字
     */
    public void setAuditUserName(String auditUserName) {
        this.auditUserName = auditUserName == null ? null : auditUserName.trim();
    }

    /**
     * 生产单生成时间
     * @return product_create_date 生产单生成时间
     */
    public Date getProductCreateDate() {
        return productCreateDate;
    }

    /**
     * 生产单生成时间
     * @param productCreateDate 生产单生成时间
     */
    public void setProductCreateDate(Date productCreateDate) {
        this.productCreateDate = productCreateDate;
    }

    /**
     * 货号ID,生产单必填，其他单子类型必空
     * @return goods_id 货号ID,生产单必填，其他单子类型必空
     */
    public Integer getGoodsId() {
        return goodsId;
    }

    /**
     * 货号ID,生产单必填，其他单子类型必空
     * @param goodsId 货号ID,生产单必填，其他单子类型必空
     */
    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    /**
     * 货号编码
     * @return goods_code 货号编码
     */
    public String getGoodsCode() {
        return goodsCode;
    }

    /**
     * 货号编码
     * @param goodsCode 货号编码
     */
    public void setGoodsCode(String goodsCode) {
        this.goodsCode = goodsCode == null ? null : goodsCode.trim();
    }

    /**
     * 货号
     * @return goods_name 货号
     */
    public String getGoodsName() {
        return goodsName;
    }

    /**
     * 货号
     * @param goodsName 货号
     */
    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    /**
     * 预计付款日期,账期生产时标注预计付款时间，避免财务漏付款。到期要付款了给出提醒
     * @return pre_pay_time 预计付款日期,账期生产时标注预计付款时间，避免财务漏付款。到期要付款了给出提醒
     */
    public Date getPrePayTime() {
        return prePayTime;
    }

    /**
     * 预计付款日期,账期生产时标注预计付款时间，避免财务漏付款。到期要付款了给出提醒
     * @param prePayTime 预计付款日期,账期生产时标注预计付款时间，避免财务漏付款。到期要付款了给出提醒
     */
    public void setPrePayTime(Date prePayTime) {
        this.prePayTime = prePayTime;
    }

    /**
     * 付款时间
     * @return pay_time 付款时间
     */
    public Date getPayTime() {
        return payTime;
    }

    /**
     * 付款时间
     * @param payTime 付款时间
     */
    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    /**
     * 付款人
     * @return pay_user_id 付款人
     */
    public Integer getPayUserId() {
        return payUserId;
    }

    /**
     * 付款人
     * @param payUserId 付款人
     */
    public void setPayUserId(Integer payUserId) {
        this.payUserId = payUserId;
    }

    /**
     * 付款人名字
     * @return pay_user_name 付款人名字
     */
    public String getPayUserName() {
        return payUserName;
    }

    /**
     * 付款人名字
     * @param payUserName 付款人名字
     */
    public void setPayUserName(String payUserName) {
        this.payUserName = payUserName == null ? null : payUserName.trim();
    }

    /**
     * 订单本币金额
     * @return local_total_mny 订单本币金额
     */
    public BigDecimal getLocalTotalMny() {
        return localTotalMny;
    }

    /**
     * 订单本币金额
     * @param localTotalMny 订单本币金额
     */
    public void setLocalTotalMny(BigDecimal localTotalMny) {
        this.localTotalMny = localTotalMny;
    }

    /**
     * 付款金额
     * @return pay_total_mny 付款金额
     */
    public BigDecimal getPayTotalMny() {
        return payTotalMny;
    }

    /**
     * 付款金额
     * @param payTotalMny 付款金额
     */
    public void setPayTotalMny(BigDecimal payTotalMny) {
        this.payTotalMny = payTotalMny;
    }

    /**
     * 未付款金额
     * @return un_pay_mny 未付款金额
     */
    public BigDecimal getUnPayMny() {
        return unPayMny;
    }

    /**
     * 未付款金额
     * @param unPayMny 未付款金额
     */
    public void setUnPayMny(BigDecimal unPayMny) {
        this.unPayMny = unPayMny;
    }

    /**
     * 累计收票金额
     * @return total_invoice_mny 累计收票金额
     */
    public BigDecimal getTotalInvoiceMny() {
        return totalInvoiceMny;
    }

    /**
     * 累计收票金额
     * @param totalInvoiceMny 累计收票金额
     */
    public void setTotalInvoiceMny(BigDecimal totalInvoiceMny) {
        this.totalInvoiceMny = totalInvoiceMny;
    }

    /**
     * 生产数量
     * @return quantity 生产数量
     */
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * 生产数量
     * @param quantity 生产数量
     */
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    /**
     * 结算方式,账期 月结 现付
     * @return settlement 结算方式,账期 月结 现付
     */
    public String getSettlement() {
        return settlement;
    }

    /**
     * 结算方式,账期 月结 现付
     * @param settlement 结算方式,账期 月结 现付
     */
    public void setSettlement(String settlement) {
        this.settlement = settlement == null ? null : settlement.trim();
    }

    /**
     * 供应商ID
     * @return supplier_id 供应商ID
     */
    public Integer getSupplierId() {
        return supplierId;
    }

    /**
     * 供应商ID
     * @param supplierId 供应商ID
     */
    public void setSupplierId(Integer supplierId) {
        this.supplierId = supplierId;
    }

    /**
     * 供应商编码
     * @return supplier_code 供应商编码
     */
    public String getSupplierCode() {
        return supplierCode;
    }

    /**
     * 供应商编码
     * @param supplierCode 供应商编码
     */
    public void setSupplierCode(String supplierCode) {
        this.supplierCode = supplierCode == null ? null : supplierCode.trim();
    }

    /**
     * 供应商名称
     * @return supplier_name 供应商名称
     */
    public String getSupplierName() {
        return supplierName;
    }

    /**
     * 供应商名称
     * @param supplierName 供应商名称
     */
    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName == null ? null : supplierName.trim();
    }

    /**
     * 预计到货日期,生产用，生产也可以填
     * @return exp_delivered_time 预计到货日期,生产用，生产也可以填
     */
    public Date getExpDeliveredTime() {
        return expDeliveredTime;
    }

    /**
     * 预计到货日期,生产用，生产也可以填
     * @param expDeliveredTime 预计到货日期,生产用，生产也可以填
     */
    public void setExpDeliveredTime(Date expDeliveredTime) {
        this.expDeliveredTime = expDeliveredTime;
    }

    /**
     * 未收票金额
     * @return non_invoice_mny 未收票金额
     */
    public BigDecimal getNonInvoiceMny() {
        return nonInvoiceMny;
    }

    /**
     * 未收票金额
     * @param nonInvoiceMny 未收票金额
     */
    public void setNonInvoiceMny(BigDecimal nonInvoiceMny) {
        this.nonInvoiceMny = nonInvoiceMny;
    }

    /**
     * 预计到货时间
     * @return delivered_time 预计到货时间
     */
    public Date getDeliveredTime() {
        return deliveredTime;
    }

    /**
     * 预计到货时间
     * @param deliveredTime 预计到货时间
     */
    public void setDeliveredTime(Date deliveredTime) {
        this.deliveredTime = deliveredTime;
    }

    /**
     * 运单号,有多个的时候用逗号隔开
     * @return logis_no 运单号,有多个的时候用逗号隔开
     */
    public String getLogisNo() {
        return logisNo;
    }

    /**
     * 运单号,有多个的时候用逗号隔开
     * @param logisNo 运单号,有多个的时候用逗号隔开
     */
    public void setLogisNo(String logisNo) {
        this.logisNo = logisNo == null ? null : logisNo.trim();
    }

    /**
     * 物流公司名称
     * @return logist_company_name 物流公司名称
     */
    public String getLogistCompanyName() {
        return logistCompanyName;
    }

    /**
     * 物流公司名称
     * @param logistCompanyName 物流公司名称
     */
    public void setLogistCompanyName(String logistCompanyName) {
        this.logistCompanyName = logistCompanyName == null ? null : logistCompanyName.trim();
    }

    /**
     * 物流费
     * @return logis_fee 物流费
     */
    public BigDecimal getLogisFee() {
        return logisFee;
    }

    /**
     * 物流费
     * @param logisFee 物流费
     */
    public void setLogisFee(BigDecimal logisFee) {
        this.logisFee = logisFee;
    }

    /**
     * 仓库名称
     * @return warehouse_id 仓库名称
     */
    public Integer getWarehouseId() {
        return warehouseId;
    }

    /**
     * 仓库名称
     * @param warehouseId 仓库名称
     */
    public void setWarehouseId(Integer warehouseId) {
        this.warehouseId = warehouseId;
    }

    /**
     * 下单总数量,将明细的SKU数累加，用户需要快速查看生产单大小
     * @return order_number 下单总数量,将明细的SKU数累加，用户需要快速查看生产单大小
     */
    public Integer getOrderNumber() {
        return orderNumber;
    }

    /**
     * 下单总数量,将明细的SKU数累加，用户需要快速查看生产单大小
     * @param orderNumber 下单总数量,将明细的SKU数累加，用户需要快速查看生产单大小
     */
    public void setOrderNumber(Integer orderNumber) {
        this.orderNumber = orderNumber;
    }

    /**
     * 归档时间
     * @return archive_date 归档时间
     */
    public Date getArchiveDate() {
        return archiveDate;
    }

    /**
     * 归档时间
     * @param archiveDate 归档时间
     */
    public void setArchiveDate(Date archiveDate) {
        this.archiveDate = archiveDate;
    }

    /**
     * 单据日期
     * @return bill_date 单据日期
     */
    public Date getBillDate() {
        return billDate;
    }

    /**
     * 单据日期
     * @param billDate 单据日期
     */
    public void setBillDate(Date billDate) {
        this.billDate = billDate;
    }

    /**
     * 生产状态：0准备生产,100开始生产,200在途,900已入库,9供应商取消
     * @return product_status 生产状态：0准备生产,100开始生产,200在途,900已入库,9供应商取消
     */
    public Integer getProductStatus() {
        return productStatus;
    }

    /**
     * 生产状态：0准备生产,100开始生产,200在途,900已入库,9供应商取消
     * @param productStatus 生产状态：0准备生产,100开始生产,200在途,900已入库,9供应商取消
     */
    public void setProductStatus(Integer productStatus) {
        this.productStatus = productStatus;
    }

    /**
     * 状态,100保存 200审核 900归档 9取消
     * @return order_status 状态,100保存 200审核 900归档 9取消
     */
    public Integer getOrderStatus() {
        return orderStatus;
    }

    /**
     * 状态,100保存 200审核 900归档 9取消
     * @param orderStatus 状态,100保存 200审核 900归档 9取消
     */
    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    /**
     * 取消时间
     * @return cancel_time 取消时间
     */
    public Date getCancelTime() {
        return cancelTime;
    }

    /**
     * 取消时间
     * @param cancelTime 取消时间
     */
    public void setCancelTime(Date cancelTime) {
        this.cancelTime = cancelTime;
    }

    /**
     * 取消原因
     * @return cancel_reason 取消原因
     */
    public String getCancelReason() {
        return cancelReason;
    }

    /**
     * 取消原因
     * @param cancelReason 取消原因
     */
    public void setCancelReason(String cancelReason) {
        this.cancelReason = cancelReason == null ? null : cancelReason.trim();
    }

    /**
     * 归档原因
     * @return archive_reason_name 归档原因
     */
    public String getArchiveReasonName() {
        return archiveReasonName;
    }

    /**
     * 归档原因
     * @param archiveReasonName 归档原因
     */
    public void setArchiveReasonName(String archiveReasonName) {
        this.archiveReasonName = archiveReasonName == null ? null : archiveReasonName.trim();
    }

    /**
     * 归档编码
     * @return archive_reason_code 归档编码
     */
    public String getArchiveReasonCode() {
        return archiveReasonCode;
    }

    /**
     * 归档编码
     * @param archiveReasonCode 归档编码
     */
    public void setArchiveReasonCode(String archiveReasonCode) {
        this.archiveReasonCode = archiveReasonCode == null ? null : archiveReasonCode.trim();
    }

    /**
     * 创建人
     * @return creator 创建人
     */
    public String getCreator() {
        return creator;
    }

    /**
     * 创建人
     * @param creator 创建人
     */
    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    /**
     * 创建时间
     * @return create_time 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 修改人
     * @return modifier 修改人
     */
    public String getModifier() {
        return modifier;
    }

    /**
     * 修改人
     * @param modifier 修改人
     */
    public void setModifier(String modifier) {
        this.modifier = modifier == null ? null : modifier.trim();
    }

    /**
     * 修改时间
     * @return modify_time 修改时间
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * 修改时间
     * @param modifyTime 修改时间
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        ProductOrderMain other = (ProductOrderMain) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getProductOrderCode() == null ? other.getProductOrderCode() == null : this.getProductOrderCode().equals(other.getProductOrderCode()))
            && (this.getAuditTime() == null ? other.getAuditTime() == null : this.getAuditTime().equals(other.getAuditTime()))
            && (this.getAuditUserId() == null ? other.getAuditUserId() == null : this.getAuditUserId().equals(other.getAuditUserId()))
            && (this.getAuditUserName() == null ? other.getAuditUserName() == null : this.getAuditUserName().equals(other.getAuditUserName()))
            && (this.getProductCreateDate() == null ? other.getProductCreateDate() == null : this.getProductCreateDate().equals(other.getProductCreateDate()))
            && (this.getGoodsId() == null ? other.getGoodsId() == null : this.getGoodsId().equals(other.getGoodsId()))
            && (this.getGoodsCode() == null ? other.getGoodsCode() == null : this.getGoodsCode().equals(other.getGoodsCode()))
            && (this.getGoodsName() == null ? other.getGoodsName() == null : this.getGoodsName().equals(other.getGoodsName()))
            && (this.getPrePayTime() == null ? other.getPrePayTime() == null : this.getPrePayTime().equals(other.getPrePayTime()))
            && (this.getPayTime() == null ? other.getPayTime() == null : this.getPayTime().equals(other.getPayTime()))
            && (this.getPayUserId() == null ? other.getPayUserId() == null : this.getPayUserId().equals(other.getPayUserId()))
            && (this.getPayUserName() == null ? other.getPayUserName() == null : this.getPayUserName().equals(other.getPayUserName()))
            && (this.getLocalTotalMny() == null ? other.getLocalTotalMny() == null : this.getLocalTotalMny().equals(other.getLocalTotalMny()))
            && (this.getPayTotalMny() == null ? other.getPayTotalMny() == null : this.getPayTotalMny().equals(other.getPayTotalMny()))
            && (this.getUnPayMny() == null ? other.getUnPayMny() == null : this.getUnPayMny().equals(other.getUnPayMny()))
            && (this.getTotalInvoiceMny() == null ? other.getTotalInvoiceMny() == null : this.getTotalInvoiceMny().equals(other.getTotalInvoiceMny()))
            && (this.getQuantity() == null ? other.getQuantity() == null : this.getQuantity().equals(other.getQuantity()))
            && (this.getSettlement() == null ? other.getSettlement() == null : this.getSettlement().equals(other.getSettlement()))
            && (this.getSupplierId() == null ? other.getSupplierId() == null : this.getSupplierId().equals(other.getSupplierId()))
            && (this.getSupplierCode() == null ? other.getSupplierCode() == null : this.getSupplierCode().equals(other.getSupplierCode()))
            && (this.getSupplierName() == null ? other.getSupplierName() == null : this.getSupplierName().equals(other.getSupplierName()))
            && (this.getExpDeliveredTime() == null ? other.getExpDeliveredTime() == null : this.getExpDeliveredTime().equals(other.getExpDeliveredTime()))
            && (this.getNonInvoiceMny() == null ? other.getNonInvoiceMny() == null : this.getNonInvoiceMny().equals(other.getNonInvoiceMny()))
            && (this.getDeliveredTime() == null ? other.getDeliveredTime() == null : this.getDeliveredTime().equals(other.getDeliveredTime()))
            && (this.getLogisNo() == null ? other.getLogisNo() == null : this.getLogisNo().equals(other.getLogisNo()))
            && (this.getLogistCompanyName() == null ? other.getLogistCompanyName() == null : this.getLogistCompanyName().equals(other.getLogistCompanyName()))
            && (this.getLogisFee() == null ? other.getLogisFee() == null : this.getLogisFee().equals(other.getLogisFee()))
            && (this.getWarehouseId() == null ? other.getWarehouseId() == null : this.getWarehouseId().equals(other.getWarehouseId()))
            && (this.getOrderNumber() == null ? other.getOrderNumber() == null : this.getOrderNumber().equals(other.getOrderNumber()))
            && (this.getArchiveDate() == null ? other.getArchiveDate() == null : this.getArchiveDate().equals(other.getArchiveDate()))
            && (this.getBillDate() == null ? other.getBillDate() == null : this.getBillDate().equals(other.getBillDate()))
            && (this.getProductStatus() == null ? other.getProductStatus() == null : this.getProductStatus().equals(other.getProductStatus()))
            && (this.getOrderStatus() == null ? other.getOrderStatus() == null : this.getOrderStatus().equals(other.getOrderStatus()))
            && (this.getCancelTime() == null ? other.getCancelTime() == null : this.getCancelTime().equals(other.getCancelTime()))
            && (this.getCancelReason() == null ? other.getCancelReason() == null : this.getCancelReason().equals(other.getCancelReason()))
            && (this.getArchiveReasonName() == null ? other.getArchiveReasonName() == null : this.getArchiveReasonName().equals(other.getArchiveReasonName()))
            && (this.getArchiveReasonCode() == null ? other.getArchiveReasonCode() == null : this.getArchiveReasonCode().equals(other.getArchiveReasonCode()))
            && (this.getCreator() == null ? other.getCreator() == null : this.getCreator().equals(other.getCreator()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getModifier() == null ? other.getModifier() == null : this.getModifier().equals(other.getModifier()))
            && (this.getModifyTime() == null ? other.getModifyTime() == null : this.getModifyTime().equals(other.getModifyTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getProductOrderCode() == null) ? 0 : getProductOrderCode().hashCode());
        result = prime * result + ((getAuditTime() == null) ? 0 : getAuditTime().hashCode());
        result = prime * result + ((getAuditUserId() == null) ? 0 : getAuditUserId().hashCode());
        result = prime * result + ((getAuditUserName() == null) ? 0 : getAuditUserName().hashCode());
        result = prime * result + ((getProductCreateDate() == null) ? 0 : getProductCreateDate().hashCode());
        result = prime * result + ((getGoodsId() == null) ? 0 : getGoodsId().hashCode());
        result = prime * result + ((getGoodsCode() == null) ? 0 : getGoodsCode().hashCode());
        result = prime * result + ((getGoodsName() == null) ? 0 : getGoodsName().hashCode());
        result = prime * result + ((getPrePayTime() == null) ? 0 : getPrePayTime().hashCode());
        result = prime * result + ((getPayTime() == null) ? 0 : getPayTime().hashCode());
        result = prime * result + ((getPayUserId() == null) ? 0 : getPayUserId().hashCode());
        result = prime * result + ((getPayUserName() == null) ? 0 : getPayUserName().hashCode());
        result = prime * result + ((getLocalTotalMny() == null) ? 0 : getLocalTotalMny().hashCode());
        result = prime * result + ((getPayTotalMny() == null) ? 0 : getPayTotalMny().hashCode());
        result = prime * result + ((getUnPayMny() == null) ? 0 : getUnPayMny().hashCode());
        result = prime * result + ((getTotalInvoiceMny() == null) ? 0 : getTotalInvoiceMny().hashCode());
        result = prime * result + ((getQuantity() == null) ? 0 : getQuantity().hashCode());
        result = prime * result + ((getSettlement() == null) ? 0 : getSettlement().hashCode());
        result = prime * result + ((getSupplierId() == null) ? 0 : getSupplierId().hashCode());
        result = prime * result + ((getSupplierCode() == null) ? 0 : getSupplierCode().hashCode());
        result = prime * result + ((getSupplierName() == null) ? 0 : getSupplierName().hashCode());
        result = prime * result + ((getExpDeliveredTime() == null) ? 0 : getExpDeliveredTime().hashCode());
        result = prime * result + ((getNonInvoiceMny() == null) ? 0 : getNonInvoiceMny().hashCode());
        result = prime * result + ((getDeliveredTime() == null) ? 0 : getDeliveredTime().hashCode());
        result = prime * result + ((getLogisNo() == null) ? 0 : getLogisNo().hashCode());
        result = prime * result + ((getLogistCompanyName() == null) ? 0 : getLogistCompanyName().hashCode());
        result = prime * result + ((getLogisFee() == null) ? 0 : getLogisFee().hashCode());
        result = prime * result + ((getWarehouseId() == null) ? 0 : getWarehouseId().hashCode());
        result = prime * result + ((getOrderNumber() == null) ? 0 : getOrderNumber().hashCode());
        result = prime * result + ((getArchiveDate() == null) ? 0 : getArchiveDate().hashCode());
        result = prime * result + ((getBillDate() == null) ? 0 : getBillDate().hashCode());
        result = prime * result + ((getProductStatus() == null) ? 0 : getProductStatus().hashCode());
        result = prime * result + ((getOrderStatus() == null) ? 0 : getOrderStatus().hashCode());
        result = prime * result + ((getCancelTime() == null) ? 0 : getCancelTime().hashCode());
        result = prime * result + ((getCancelReason() == null) ? 0 : getCancelReason().hashCode());
        result = prime * result + ((getArchiveReasonName() == null) ? 0 : getArchiveReasonName().hashCode());
        result = prime * result + ((getArchiveReasonCode() == null) ? 0 : getArchiveReasonCode().hashCode());
        result = prime * result + ((getCreator() == null) ? 0 : getCreator().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getModifier() == null) ? 0 : getModifier().hashCode());
        result = prime * result + ((getModifyTime() == null) ? 0 : getModifyTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", productOrderCode=").append(productOrderCode);
        sb.append(", auditTime=").append(auditTime);
        sb.append(", auditUserId=").append(auditUserId);
        sb.append(", auditUserName=").append(auditUserName);
        sb.append(", productCreateDate=").append(productCreateDate);
        sb.append(", goodsId=").append(goodsId);
        sb.append(", goodsCode=").append(goodsCode);
        sb.append(", goodsName=").append(goodsName);
        sb.append(", prePayTime=").append(prePayTime);
        sb.append(", payTime=").append(payTime);
        sb.append(", payUserId=").append(payUserId);
        sb.append(", payUserName=").append(payUserName);
        sb.append(", localTotalMny=").append(localTotalMny);
        sb.append(", payTotalMny=").append(payTotalMny);
        sb.append(", unPayMny=").append(unPayMny);
        sb.append(", totalInvoiceMny=").append(totalInvoiceMny);
        sb.append(", quantity=").append(quantity);
        sb.append(", settlement=").append(settlement);
        sb.append(", supplierId=").append(supplierId);
        sb.append(", supplierCode=").append(supplierCode);
        sb.append(", supplierName=").append(supplierName);
        sb.append(", expDeliveredTime=").append(expDeliveredTime);
        sb.append(", nonInvoiceMny=").append(nonInvoiceMny);
        sb.append(", deliveredTime=").append(deliveredTime);
        sb.append(", logisNo=").append(logisNo);
        sb.append(", logistCompanyName=").append(logistCompanyName);
        sb.append(", logisFee=").append(logisFee);
        sb.append(", warehouseId=").append(warehouseId);
        sb.append(", orderNumber=").append(orderNumber);
        sb.append(", archiveDate=").append(archiveDate);
        sb.append(", billDate=").append(billDate);
        sb.append(", productStatus=").append(productStatus);
        sb.append(", orderStatus=").append(orderStatus);
        sb.append(", cancelTime=").append(cancelTime);
        sb.append(", cancelReason=").append(cancelReason);
        sb.append(", archiveReasonName=").append(archiveReasonName);
        sb.append(", archiveReasonCode=").append(archiveReasonCode);
        sb.append(", creator=").append(creator);
        sb.append(", createTime=").append(createTime);
        sb.append(", modifier=").append(modifier);
        sb.append(", modifyTime=").append(modifyTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}