package com.binger.stock.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 出库表主表
 */
@ApiModel(value="出库表主表")
public class StockOutBillMain implements Serializable {
    /**
     * 
     */
    @ApiModelProperty(value="",required = true)
    private Integer id;

    /**
     * 单据编号
     */
    @ApiModelProperty(value="单据编号",required = true)
    private String stockOutBillMainCode;

    /**
     * 退货单号
     */
    @ApiModelProperty(value="退货单号",required = false)
    private String returnProductReturnCode;

    /**
     * 销售订单号
     */
    @ApiModelProperty(value="销售订单号",required = false)
    private String orderSaleCode;

    /**
     * 出库仓库
     */
    @ApiModelProperty(value="出库仓库",required = false)
    private Integer warehouseId;

    /**
     * '出库类型,100订单出库-发货出库 200其他出库-报废出库 300返修出库,默认残次品库出库 400调拨出库 500其他出库-改码'
     */
    @ApiModelProperty(value="'出库类型,100订单出库-发货出库 200其他出库-报废出库 300返修出库,默认残次品库出库 400调拨出库 500其他出库-改码'",required = false)
    private Integer billType;

    /**
     * 审核时间
     */
    @ApiModelProperty(value="审核时间",required = false)
    private Date auditDate;

    /**
     * 审核人名字
     */
    @ApiModelProperty(value="审核人名字",required = false)
    private String auditor;

    /**
     * 出库时间
     */
    @ApiModelProperty(value="出库时间",required = false)
    private Date stockoutTime;

    /**
     * 数量
     */
    @ApiModelProperty(value="数量",required = false)
    private Integer quantity;

    /**
     * 出库状态,100保存 200审核 900归档 9挂起
     */
    @ApiModelProperty(value="出库状态,100保存 200审核 900归档 9挂起",required = false)
    private Integer stockoutStatus;

    /**
     * 客户姓名,不一致不允许合并
     */
    @ApiModelProperty(value="客户姓名,不一致不允许合并",required = false)
    private String customerName;

    /**
     * 国家ID
     */
    @ApiModelProperty(value="国家ID",required = false)
    private Integer countryId;

    /**
     * 国家编码
     */
    @ApiModelProperty(value="国家编码",required = false)
    private String countryCode;

    /**
     * 国家
     */
    @ApiModelProperty(value="国家",required = false)
    private String countryName;

    /**
     * 邮寄地址1
     */
    @ApiModelProperty(value="邮寄地址1",required = false)
    private String address1;

    /**
     * 延迟时间,订单过来的时候，当前时间减去下单时间
     */
    @ApiModelProperty(value="延迟时间,订单过来的时候，当前时间减去下单时间",required = false)
    private Integer delayDays;

    /**
     * 物流状态,430未揽收 500已揽收
     */
    @ApiModelProperty(value="物流状态,430未揽收 500已揽收",required = false)
    private Integer logistStatus;

    /**
     * 物流公司名称(暂时只应用于发货出库单、调拨出库单)
     */
    @ApiModelProperty(value="物流公司名称(暂时只应用于发货出库单、调拨出库单)",required = false)
    private String logistCompanyName;

    /**
     * 物流跟踪号
     */
    @ApiModelProperty(value="物流跟踪号",required = false)
    private String trackNumber;

    /**
     * 物流费用(只应用于发货出库单)
     */
    @ApiModelProperty(value="物流费用(只应用于发货出库单)",required = false)
    private BigDecimal logistMoney;

    /**
     * 出库总金额
     */
    @ApiModelProperty(value="出库总金额",required = false)
    private BigDecimal totalAmount;

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
     * stock_out_bill_main
     */
    private static final long serialVersionUID = 1L;

    /**
     * 
     * @return id 
     */
    public Integer getId() {
        return id;
    }

    /**
     * 
     * @param id 
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 单据编号
     * @return stock_out_bill_main_code 单据编号
     */
    public String getStockOutBillMainCode() {
        return stockOutBillMainCode;
    }

    /**
     * 单据编号
     * @param stockOutBillMainCode 单据编号
     */
    public void setStockOutBillMainCode(String stockOutBillMainCode) {
        this.stockOutBillMainCode = stockOutBillMainCode == null ? null : stockOutBillMainCode.trim();
    }

    /**
     * 退货单号
     * @return return_product_return_code 退货单号
     */
    public String getReturnProductReturnCode() {
        return returnProductReturnCode;
    }

    /**
     * 退货单号
     * @param returnProductReturnCode 退货单号
     */
    public void setReturnProductReturnCode(String returnProductReturnCode) {
        this.returnProductReturnCode = returnProductReturnCode == null ? null : returnProductReturnCode.trim();
    }

    /**
     * 销售订单号
     * @return order_sale_code 销售订单号
     */
    public String getOrderSaleCode() {
        return orderSaleCode;
    }

    /**
     * 销售订单号
     * @param orderSaleCode 销售订单号
     */
    public void setOrderSaleCode(String orderSaleCode) {
        this.orderSaleCode = orderSaleCode == null ? null : orderSaleCode.trim();
    }

    /**
     * 出库仓库
     * @return warehouse_id 出库仓库
     */
    public Integer getWarehouseId() {
        return warehouseId;
    }

    /**
     * 出库仓库
     * @param warehouseId 出库仓库
     */
    public void setWarehouseId(Integer warehouseId) {
        this.warehouseId = warehouseId;
    }

    /**
     * '出库类型,100订单出库-发货出库 200其他出库-报废出库 300返修出库,默认残次品库出库 400调拨出库 500其他出库-改码'
     * @return bill_type '出库类型,100订单出库-发货出库 200其他出库-报废出库 300返修出库,默认残次品库出库 400调拨出库 500其他出库-改码'
     */
    public Integer getBillType() {
        return billType;
    }

    /**
     * '出库类型,100订单出库-发货出库 200其他出库-报废出库 300返修出库,默认残次品库出库 400调拨出库 500其他出库-改码'
     * @param billType '出库类型,100订单出库-发货出库 200其他出库-报废出库 300返修出库,默认残次品库出库 400调拨出库 500其他出库-改码'
     */
    public void setBillType(Integer billType) {
        this.billType = billType;
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
     * 出库时间
     * @return stockout_time 出库时间
     */
    public Date getStockoutTime() {
        return stockoutTime;
    }

    /**
     * 出库时间
     * @param stockoutTime 出库时间
     */
    public void setStockoutTime(Date stockoutTime) {
        this.stockoutTime = stockoutTime;
    }

    /**
     * 数量
     * @return quantity 数量
     */
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * 数量
     * @param quantity 数量
     */
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    /**
     * 出库状态,100保存 200审核 900归档 9挂起
     * @return stockout_status 出库状态,100保存 200审核 900归档 9挂起
     */
    public Integer getStockoutStatus() {
        return stockoutStatus;
    }

    /**
     * 出库状态,100保存 200审核 900归档 9挂起
     * @param stockoutStatus 出库状态,100保存 200审核 900归档 9挂起
     */
    public void setStockoutStatus(Integer stockoutStatus) {
        this.stockoutStatus = stockoutStatus;
    }

    /**
     * 客户姓名,不一致不允许合并
     * @return customer_name 客户姓名,不一致不允许合并
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * 客户姓名,不一致不允许合并
     * @param customerName 客户姓名,不一致不允许合并
     */
    public void setCustomerName(String customerName) {
        this.customerName = customerName == null ? null : customerName.trim();
    }

    /**
     * 国家ID
     * @return country_id 国家ID
     */
    public Integer getCountryId() {
        return countryId;
    }

    /**
     * 国家ID
     * @param countryId 国家ID
     */
    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    /**
     * 国家编码
     * @return country_code 国家编码
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * 国家编码
     * @param countryCode 国家编码
     */
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode == null ? null : countryCode.trim();
    }

    /**
     * 国家
     * @return country_name 国家
     */
    public String getCountryName() {
        return countryName;
    }

    /**
     * 国家
     * @param countryName 国家
     */
    public void setCountryName(String countryName) {
        this.countryName = countryName == null ? null : countryName.trim();
    }

    /**
     * 邮寄地址1
     * @return address1 邮寄地址1
     */
    public String getAddress1() {
        return address1;
    }

    /**
     * 邮寄地址1
     * @param address1 邮寄地址1
     */
    public void setAddress1(String address1) {
        this.address1 = address1 == null ? null : address1.trim();
    }

    /**
     * 延迟时间,订单过来的时候，当前时间减去下单时间
     * @return delay_days 延迟时间,订单过来的时候，当前时间减去下单时间
     */
    public Integer getDelayDays() {
        return delayDays;
    }

    /**
     * 延迟时间,订单过来的时候，当前时间减去下单时间
     * @param delayDays 延迟时间,订单过来的时候，当前时间减去下单时间
     */
    public void setDelayDays(Integer delayDays) {
        this.delayDays = delayDays;
    }

    /**
     * 物流状态,430未揽收 500已揽收
     * @return logist_status 物流状态,430未揽收 500已揽收
     */
    public Integer getLogistStatus() {
        return logistStatus;
    }

    /**
     * 物流状态,430未揽收 500已揽收
     * @param logistStatus 物流状态,430未揽收 500已揽收
     */
    public void setLogistStatus(Integer logistStatus) {
        this.logistStatus = logistStatus;
    }

    /**
     * 物流公司名称(暂时只应用于发货出库单、调拨出库单)
     * @return logist_company_name 物流公司名称(暂时只应用于发货出库单、调拨出库单)
     */
    public String getLogistCompanyName() {
        return logistCompanyName;
    }

    /**
     * 物流公司名称(暂时只应用于发货出库单、调拨出库单)
     * @param logistCompanyName 物流公司名称(暂时只应用于发货出库单、调拨出库单)
     */
    public void setLogistCompanyName(String logistCompanyName) {
        this.logistCompanyName = logistCompanyName == null ? null : logistCompanyName.trim();
    }

    /**
     * 物流跟踪号
     * @return track_number 物流跟踪号
     */
    public String getTrackNumber() {
        return trackNumber;
    }

    /**
     * 物流跟踪号
     * @param trackNumber 物流跟踪号
     */
    public void setTrackNumber(String trackNumber) {
        this.trackNumber = trackNumber == null ? null : trackNumber.trim();
    }

    /**
     * 物流费用(只应用于发货出库单)
     * @return logist_money 物流费用(只应用于发货出库单)
     */
    public BigDecimal getLogistMoney() {
        return logistMoney;
    }

    /**
     * 物流费用(只应用于发货出库单)
     * @param logistMoney 物流费用(只应用于发货出库单)
     */
    public void setLogistMoney(BigDecimal logistMoney) {
        this.logistMoney = logistMoney;
    }

    /**
     * 出库总金额
     * @return total_amount 出库总金额
     */
    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    /**
     * 出库总金额
     * @param totalAmount 出库总金额
     */
    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
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
        StockOutBillMain other = (StockOutBillMain) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getStockOutBillMainCode() == null ? other.getStockOutBillMainCode() == null : this.getStockOutBillMainCode().equals(other.getStockOutBillMainCode()))
            && (this.getReturnProductReturnCode() == null ? other.getReturnProductReturnCode() == null : this.getReturnProductReturnCode().equals(other.getReturnProductReturnCode()))
            && (this.getOrderSaleCode() == null ? other.getOrderSaleCode() == null : this.getOrderSaleCode().equals(other.getOrderSaleCode()))
            && (this.getWarehouseId() == null ? other.getWarehouseId() == null : this.getWarehouseId().equals(other.getWarehouseId()))
            && (this.getBillType() == null ? other.getBillType() == null : this.getBillType().equals(other.getBillType()))
            && (this.getAuditDate() == null ? other.getAuditDate() == null : this.getAuditDate().equals(other.getAuditDate()))
            && (this.getAuditor() == null ? other.getAuditor() == null : this.getAuditor().equals(other.getAuditor()))
            && (this.getStockoutTime() == null ? other.getStockoutTime() == null : this.getStockoutTime().equals(other.getStockoutTime()))
            && (this.getQuantity() == null ? other.getQuantity() == null : this.getQuantity().equals(other.getQuantity()))
            && (this.getStockoutStatus() == null ? other.getStockoutStatus() == null : this.getStockoutStatus().equals(other.getStockoutStatus()))
            && (this.getCustomerName() == null ? other.getCustomerName() == null : this.getCustomerName().equals(other.getCustomerName()))
            && (this.getCountryId() == null ? other.getCountryId() == null : this.getCountryId().equals(other.getCountryId()))
            && (this.getCountryCode() == null ? other.getCountryCode() == null : this.getCountryCode().equals(other.getCountryCode()))
            && (this.getCountryName() == null ? other.getCountryName() == null : this.getCountryName().equals(other.getCountryName()))
            && (this.getAddress1() == null ? other.getAddress1() == null : this.getAddress1().equals(other.getAddress1()))
            && (this.getDelayDays() == null ? other.getDelayDays() == null : this.getDelayDays().equals(other.getDelayDays()))
            && (this.getLogistStatus() == null ? other.getLogistStatus() == null : this.getLogistStatus().equals(other.getLogistStatus()))
            && (this.getLogistCompanyName() == null ? other.getLogistCompanyName() == null : this.getLogistCompanyName().equals(other.getLogistCompanyName()))
            && (this.getTrackNumber() == null ? other.getTrackNumber() == null : this.getTrackNumber().equals(other.getTrackNumber()))
            && (this.getLogistMoney() == null ? other.getLogistMoney() == null : this.getLogistMoney().equals(other.getLogistMoney()))
            && (this.getTotalAmount() == null ? other.getTotalAmount() == null : this.getTotalAmount().equals(other.getTotalAmount()))
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
        result = prime * result + ((getStockOutBillMainCode() == null) ? 0 : getStockOutBillMainCode().hashCode());
        result = prime * result + ((getReturnProductReturnCode() == null) ? 0 : getReturnProductReturnCode().hashCode());
        result = prime * result + ((getOrderSaleCode() == null) ? 0 : getOrderSaleCode().hashCode());
        result = prime * result + ((getWarehouseId() == null) ? 0 : getWarehouseId().hashCode());
        result = prime * result + ((getBillType() == null) ? 0 : getBillType().hashCode());
        result = prime * result + ((getAuditDate() == null) ? 0 : getAuditDate().hashCode());
        result = prime * result + ((getAuditor() == null) ? 0 : getAuditor().hashCode());
        result = prime * result + ((getStockoutTime() == null) ? 0 : getStockoutTime().hashCode());
        result = prime * result + ((getQuantity() == null) ? 0 : getQuantity().hashCode());
        result = prime * result + ((getStockoutStatus() == null) ? 0 : getStockoutStatus().hashCode());
        result = prime * result + ((getCustomerName() == null) ? 0 : getCustomerName().hashCode());
        result = prime * result + ((getCountryId() == null) ? 0 : getCountryId().hashCode());
        result = prime * result + ((getCountryCode() == null) ? 0 : getCountryCode().hashCode());
        result = prime * result + ((getCountryName() == null) ? 0 : getCountryName().hashCode());
        result = prime * result + ((getAddress1() == null) ? 0 : getAddress1().hashCode());
        result = prime * result + ((getDelayDays() == null) ? 0 : getDelayDays().hashCode());
        result = prime * result + ((getLogistStatus() == null) ? 0 : getLogistStatus().hashCode());
        result = prime * result + ((getLogistCompanyName() == null) ? 0 : getLogistCompanyName().hashCode());
        result = prime * result + ((getTrackNumber() == null) ? 0 : getTrackNumber().hashCode());
        result = prime * result + ((getLogistMoney() == null) ? 0 : getLogistMoney().hashCode());
        result = prime * result + ((getTotalAmount() == null) ? 0 : getTotalAmount().hashCode());
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
        sb.append(", stockOutBillMainCode=").append(stockOutBillMainCode);
        sb.append(", returnProductReturnCode=").append(returnProductReturnCode);
        sb.append(", orderSaleCode=").append(orderSaleCode);
        sb.append(", warehouseId=").append(warehouseId);
        sb.append(", billType=").append(billType);
        sb.append(", auditDate=").append(auditDate);
        sb.append(", auditor=").append(auditor);
        sb.append(", stockoutTime=").append(stockoutTime);
        sb.append(", quantity=").append(quantity);
        sb.append(", stockoutStatus=").append(stockoutStatus);
        sb.append(", customerName=").append(customerName);
        sb.append(", countryId=").append(countryId);
        sb.append(", countryCode=").append(countryCode);
        sb.append(", countryName=").append(countryName);
        sb.append(", address1=").append(address1);
        sb.append(", delayDays=").append(delayDays);
        sb.append(", logistStatus=").append(logistStatus);
        sb.append(", logistCompanyName=").append(logistCompanyName);
        sb.append(", trackNumber=").append(trackNumber);
        sb.append(", logistMoney=").append(logistMoney);
        sb.append(", totalAmount=").append(totalAmount);
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