package com.binger.stock.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 入库表主表
 */
@ApiModel(value="入库表主表")
public class StockInBillMain implements Serializable {
    /**
     * 入库ID
     */
    @ApiModelProperty(value="入库ID",required = true)
    private Integer id;

    /**
     * 入库code
     */
    @ApiModelProperty(value="入库code",required = false)
    private String stockInBillMainCode;

    /**
     * 生产单号,针对生产单有
     */
    @ApiModelProperty(value="生产单号,针对生产单有",required = false)
    private String productOrderCode;

    /**
     * 入库类型,100订单入库-生产入库, 300其他入库-盘盈 301 销售订单退货入库 400其他入库-捐赠 401 其他入库-其他 402 其他入库-样衣 500返修入库 600调拨入库 700残次品入库
     */
    @ApiModelProperty(value="入库类型,100订单入库-生产入库, 300其他入库-盘盈 301 销售订单退货入库 400其他入库-捐赠 401 其他入库-其他 402 其他入库-样衣 500返修入库 600调拨入库 700残次品入库",required = false)
    private Integer billType;

    /**
     * 入库日期
     */
    @ApiModelProperty(value="入库日期",required = false)
    private Date stockinDate;

    /**
     * 审核人名字
     */
    @ApiModelProperty(value="审核人名字",required = false)
    private String auditor;

    /**
     * 审核时间
     */
    @ApiModelProperty(value="审核时间",required = false)
    private Date auditDate;

    /**
     * 仓库ID
     */
    @ApiModelProperty(value="仓库ID",required = true)
    private Integer warehouseId;

    /**
     * 跟踪号
     */
    @ApiModelProperty(value="跟踪号",required = false)
    private String trackNumber;

    /**
     * 入库状态,100保存 200审核 300取消审核
     */
    @ApiModelProperty(value="入库状态,100保存 200审核 300取消审核",required = false)
    private Integer stockinStatus;

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
     * 申请入库数量
     */
    @ApiModelProperty(value="申请入库数量",required = false)
    private Integer applyQuantity;

    /**
     * 实际入库数量
     */
    @ApiModelProperty(value="实际入库数量",required = false)
    private Integer quantity;

    /**
     * 次品数量
     */
    @ApiModelProperty(value="次品数量",required = false)
    private Integer defectiveQuantity;

    /**
     * 单据日期
     */
    @ApiModelProperty(value="单据日期",required = false)
    private Date billDate;

    /**
     * 入库员名称
     */
    @ApiModelProperty(value="入库员名称",required = false)
    private String receiverName;

    /**
     * 入库金额
     */
    @ApiModelProperty(value="入库金额",required = false)
    private BigDecimal stockInMoney;

    /**
     * 备注
     */
    @ApiModelProperty(value="备注",required = false)
    private String remark;

    /**
     * 创建人
     */
    @ApiModelProperty(value="创建人",required = false)
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
     * stock_in_bill_main
     */
    private static final long serialVersionUID = 1L;

    /**
     * 入库ID
     * @return id 入库ID
     */
    public Integer getId() {
        return id;
    }

    /**
     * 入库ID
     * @param id 入库ID
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 入库code
     * @return stock_in_bill_main_code 入库code
     */
    public String getStockInBillMainCode() {
        return stockInBillMainCode;
    }

    /**
     * 入库code
     * @param stockInBillMainCode 入库code
     */
    public void setStockInBillMainCode(String stockInBillMainCode) {
        this.stockInBillMainCode = stockInBillMainCode == null ? null : stockInBillMainCode.trim();
    }

    /**
     * 生产单号,针对生产单有
     * @return product_order_code 生产单号,针对生产单有
     */
    public String getProductOrderCode() {
        return productOrderCode;
    }

    /**
     * 生产单号,针对生产单有
     * @param productOrderCode 生产单号,针对生产单有
     */
    public void setProductOrderCode(String productOrderCode) {
        this.productOrderCode = productOrderCode == null ? null : productOrderCode.trim();
    }

    /**
     * 入库类型,100订单入库-生产入库, 300其他入库-盘盈 301 销售订单退货入库 400其他入库-捐赠 401 其他入库-其他 402 其他入库-样衣 500返修入库 600调拨入库 700残次品入库
     * @return bill_type 入库类型,100订单入库-生产入库, 300其他入库-盘盈 301 销售订单退货入库 400其他入库-捐赠 401 其他入库-其他 402 其他入库-样衣 500返修入库 600调拨入库 700残次品入库
     */
    public Integer getBillType() {
        return billType;
    }

    /**
     * 入库类型,100订单入库-生产入库, 300其他入库-盘盈 301 销售订单退货入库 400其他入库-捐赠 401 其他入库-其他 402 其他入库-样衣 500返修入库 600调拨入库 700残次品入库
     * @param billType 入库类型,100订单入库-生产入库, 300其他入库-盘盈 301 销售订单退货入库 400其他入库-捐赠 401 其他入库-其他 402 其他入库-样衣 500返修入库 600调拨入库 700残次品入库
     */
    public void setBillType(Integer billType) {
        this.billType = billType;
    }

    /**
     * 入库日期
     * @return stockin_date 入库日期
     */
    public Date getStockinDate() {
        return stockinDate;
    }

    /**
     * 入库日期
     * @param stockinDate 入库日期
     */
    public void setStockinDate(Date stockinDate) {
        this.stockinDate = stockinDate;
    }

    /**
     * 审核人名字
     * @return auditor 审核人名字
     */
    public String getAuditor() {
        return auditor;
    }

    /**
     * 审核人名字
     * @param auditor 审核人名字
     */
    public void setAuditor(String auditor) {
        this.auditor = auditor == null ? null : auditor.trim();
    }

    /**
     * 审核时间
     * @return audit_date 审核时间
     */
    public Date getAuditDate() {
        return auditDate;
    }

    /**
     * 审核时间
     * @param auditDate 审核时间
     */
    public void setAuditDate(Date auditDate) {
        this.auditDate = auditDate;
    }

    /**
     * 仓库ID
     * @return warehouse_id 仓库ID
     */
    public Integer getWarehouseId() {
        return warehouseId;
    }

    /**
     * 仓库ID
     * @param warehouseId 仓库ID
     */
    public void setWarehouseId(Integer warehouseId) {
        this.warehouseId = warehouseId;
    }

    /**
     * 跟踪号
     * @return track_number 跟踪号
     */
    public String getTrackNumber() {
        return trackNumber;
    }

    /**
     * 跟踪号
     * @param trackNumber 跟踪号
     */
    public void setTrackNumber(String trackNumber) {
        this.trackNumber = trackNumber == null ? null : trackNumber.trim();
    }

    /**
     * 入库状态,100保存 200审核 300取消审核
     * @return stockin_status 入库状态,100保存 200审核 300取消审核
     */
    public Integer getStockinStatus() {
        return stockinStatus;
    }

    /**
     * 入库状态,100保存 200审核 300取消审核
     * @param stockinStatus 入库状态,100保存 200审核 300取消审核
     */
    public void setStockinStatus(Integer stockinStatus) {
        this.stockinStatus = stockinStatus;
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
     * 申请入库数量
     * @return apply_quantity 申请入库数量
     */
    public Integer getApplyQuantity() {
        return applyQuantity;
    }

    /**
     * 申请入库数量
     * @param applyQuantity 申请入库数量
     */
    public void setApplyQuantity(Integer applyQuantity) {
        this.applyQuantity = applyQuantity;
    }

    /**
     * 实际入库数量
     * @return quantity 实际入库数量
     */
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * 实际入库数量
     * @param quantity 实际入库数量
     */
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    /**
     * 次品数量
     * @return defective_quantity 次品数量
     */
    public Integer getDefectiveQuantity() {
        return defectiveQuantity;
    }

    /**
     * 次品数量
     * @param defectiveQuantity 次品数量
     */
    public void setDefectiveQuantity(Integer defectiveQuantity) {
        this.defectiveQuantity = defectiveQuantity;
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
     * 入库员名称
     * @return receiver_name 入库员名称
     */
    public String getReceiverName() {
        return receiverName;
    }

    /**
     * 入库员名称
     * @param receiverName 入库员名称
     */
    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName == null ? null : receiverName.trim();
    }

    /**
     * 入库金额
     * @return stock_in_money 入库金额
     */
    public BigDecimal getStockInMoney() {
        return stockInMoney;
    }

    /**
     * 入库金额
     * @param stockInMoney 入库金额
     */
    public void setStockInMoney(BigDecimal stockInMoney) {
        this.stockInMoney = stockInMoney;
    }

    /**
     * 备注
     * @return remark 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 备注
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
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
        StockInBillMain other = (StockInBillMain) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getStockInBillMainCode() == null ? other.getStockInBillMainCode() == null : this.getStockInBillMainCode().equals(other.getStockInBillMainCode()))
            && (this.getProductOrderCode() == null ? other.getProductOrderCode() == null : this.getProductOrderCode().equals(other.getProductOrderCode()))
            && (this.getBillType() == null ? other.getBillType() == null : this.getBillType().equals(other.getBillType()))
            && (this.getStockinDate() == null ? other.getStockinDate() == null : this.getStockinDate().equals(other.getStockinDate()))
            && (this.getAuditor() == null ? other.getAuditor() == null : this.getAuditor().equals(other.getAuditor()))
            && (this.getAuditDate() == null ? other.getAuditDate() == null : this.getAuditDate().equals(other.getAuditDate()))
            && (this.getWarehouseId() == null ? other.getWarehouseId() == null : this.getWarehouseId().equals(other.getWarehouseId()))
            && (this.getTrackNumber() == null ? other.getTrackNumber() == null : this.getTrackNumber().equals(other.getTrackNumber()))
            && (this.getStockinStatus() == null ? other.getStockinStatus() == null : this.getStockinStatus().equals(other.getStockinStatus()))
            && (this.getSupplierId() == null ? other.getSupplierId() == null : this.getSupplierId().equals(other.getSupplierId()))
            && (this.getSupplierCode() == null ? other.getSupplierCode() == null : this.getSupplierCode().equals(other.getSupplierCode()))
            && (this.getSupplierName() == null ? other.getSupplierName() == null : this.getSupplierName().equals(other.getSupplierName()))
            && (this.getApplyQuantity() == null ? other.getApplyQuantity() == null : this.getApplyQuantity().equals(other.getApplyQuantity()))
            && (this.getQuantity() == null ? other.getQuantity() == null : this.getQuantity().equals(other.getQuantity()))
            && (this.getDefectiveQuantity() == null ? other.getDefectiveQuantity() == null : this.getDefectiveQuantity().equals(other.getDefectiveQuantity()))
            && (this.getBillDate() == null ? other.getBillDate() == null : this.getBillDate().equals(other.getBillDate()))
            && (this.getReceiverName() == null ? other.getReceiverName() == null : this.getReceiverName().equals(other.getReceiverName()))
            && (this.getStockInMoney() == null ? other.getStockInMoney() == null : this.getStockInMoney().equals(other.getStockInMoney()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
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
        result = prime * result + ((getStockInBillMainCode() == null) ? 0 : getStockInBillMainCode().hashCode());
        result = prime * result + ((getProductOrderCode() == null) ? 0 : getProductOrderCode().hashCode());
        result = prime * result + ((getBillType() == null) ? 0 : getBillType().hashCode());
        result = prime * result + ((getStockinDate() == null) ? 0 : getStockinDate().hashCode());
        result = prime * result + ((getAuditor() == null) ? 0 : getAuditor().hashCode());
        result = prime * result + ((getAuditDate() == null) ? 0 : getAuditDate().hashCode());
        result = prime * result + ((getWarehouseId() == null) ? 0 : getWarehouseId().hashCode());
        result = prime * result + ((getTrackNumber() == null) ? 0 : getTrackNumber().hashCode());
        result = prime * result + ((getStockinStatus() == null) ? 0 : getStockinStatus().hashCode());
        result = prime * result + ((getSupplierId() == null) ? 0 : getSupplierId().hashCode());
        result = prime * result + ((getSupplierCode() == null) ? 0 : getSupplierCode().hashCode());
        result = prime * result + ((getSupplierName() == null) ? 0 : getSupplierName().hashCode());
        result = prime * result + ((getApplyQuantity() == null) ? 0 : getApplyQuantity().hashCode());
        result = prime * result + ((getQuantity() == null) ? 0 : getQuantity().hashCode());
        result = prime * result + ((getDefectiveQuantity() == null) ? 0 : getDefectiveQuantity().hashCode());
        result = prime * result + ((getBillDate() == null) ? 0 : getBillDate().hashCode());
        result = prime * result + ((getReceiverName() == null) ? 0 : getReceiverName().hashCode());
        result = prime * result + ((getStockInMoney() == null) ? 0 : getStockInMoney().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
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
        sb.append(", stockInBillMainCode=").append(stockInBillMainCode);
        sb.append(", productOrderCode=").append(productOrderCode);
        sb.append(", billType=").append(billType);
        sb.append(", stockinDate=").append(stockinDate);
        sb.append(", auditor=").append(auditor);
        sb.append(", auditDate=").append(auditDate);
        sb.append(", warehouseId=").append(warehouseId);
        sb.append(", trackNumber=").append(trackNumber);
        sb.append(", stockinStatus=").append(stockinStatus);
        sb.append(", supplierId=").append(supplierId);
        sb.append(", supplierCode=").append(supplierCode);
        sb.append(", supplierName=").append(supplierName);
        sb.append(", applyQuantity=").append(applyQuantity);
        sb.append(", quantity=").append(quantity);
        sb.append(", defectiveQuantity=").append(defectiveQuantity);
        sb.append(", billDate=").append(billDate);
        sb.append(", receiverName=").append(receiverName);
        sb.append(", stockInMoney=").append(stockInMoney);
        sb.append(", remark=").append(remark);
        sb.append(", creator=").append(creator);
        sb.append(", createTime=").append(createTime);
        sb.append(", modifier=").append(modifier);
        sb.append(", modifyTime=").append(modifyTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}