package com.binger.stock.domain;

import java.io.Serializable;
import java.util.Date;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 主采购计划表
 */
@ApiModel(value="主采购计划表")
public class ProductPlanMain implements Serializable {
    /**
     * 主生产计划ID
     */
    @ApiModelProperty(value="主生产计划ID",required = true)
    private Integer id;

    /**
     * 生产计划编号,自己生成
     */
    @ApiModelProperty(value="生产计划编号,自己生成",required = true)
    private String productPlanCode;

    /**
     * 采购备注
     */
    @ApiModelProperty(value="采购备注",required = false)
    private String productComments;

    /**
     * 状态,0未审核 50已过期 100已审核
     */
    @ApiModelProperty(value="状态,0未审核 50已过期 100已审核",required = false)
    private Integer planStatus;

    /**
     * 是否已分配完
     */
    @ApiModelProperty(value="是否已分配完",required = false)
    private Boolean isAssign;

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
     * 单据日期
     */
    @ApiModelProperty(value="单据日期",required = false)
    private Date billDate;

    /**
     * 供应商ID
     */
    @ApiModelProperty(value="供应商ID",required = false)
    private Integer supplierId;

    /**
     * 供应商代码
     */
    @ApiModelProperty(value="供应商代码",required = false)
    private String supplierCode;

    /**
     * 供应商名称
     */
    @ApiModelProperty(value="供应商名称",required = false)
    private String supplierName;

    /**
     * 创建人
     */
    @ApiModelProperty(value="创建人",required = false)
    private String creator;

    /**
     * 创建时间
     */
    @ApiModelProperty(value="创建时间",required = true)
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
     * product_plan_main
     */
    private static final long serialVersionUID = 1L;

    /**
     * 主生产计划ID
     * @return id 主生产计划ID
     */
    public Integer getId() {
        return id;
    }

    /**
     * 主生产计划ID
     * @param id 主生产计划ID
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 生产计划编号,自己生成
     * @return product_plan_code 生产计划编号,自己生成
     */
    public String getProductPlanCode() {
        return productPlanCode;
    }

    /**
     * 生产计划编号,自己生成
     * @param productPlanCode 生产计划编号,自己生成
     */
    public void setProductPlanCode(String productPlanCode) {
        this.productPlanCode = productPlanCode == null ? null : productPlanCode.trim();
    }

    /**
     * 采购备注
     * @return product_comments 采购备注
     */
    public String getProductComments() {
        return productComments;
    }

    /**
     * 采购备注
     * @param productComments 采购备注
     */
    public void setProductComments(String productComments) {
        this.productComments = productComments == null ? null : productComments.trim();
    }

    /**
     * 状态,0未审核 50已过期 100已审核
     * @return plan_status 状态,0未审核 50已过期 100已审核
     */
    public Integer getPlanStatus() {
        return planStatus;
    }

    /**
     * 状态,0未审核 50已过期 100已审核
     * @param planStatus 状态,0未审核 50已过期 100已审核
     */
    public void setPlanStatus(Integer planStatus) {
        this.planStatus = planStatus;
    }

    /**
     * 是否已分配完
     * @return is_assign 是否已分配完
     */
    public Boolean getIsAssign() {
        return isAssign;
    }

    /**
     * 是否已分配完
     * @param isAssign 是否已分配完
     */
    public void setIsAssign(Boolean isAssign) {
        this.isAssign = isAssign;
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
     * 供应商代码
     * @return supplier_code 供应商代码
     */
    public String getSupplierCode() {
        return supplierCode;
    }

    /**
     * 供应商代码
     * @param supplierCode 供应商代码
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
        ProductPlanMain other = (ProductPlanMain) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getProductPlanCode() == null ? other.getProductPlanCode() == null : this.getProductPlanCode().equals(other.getProductPlanCode()))
            && (this.getProductComments() == null ? other.getProductComments() == null : this.getProductComments().equals(other.getProductComments()))
            && (this.getPlanStatus() == null ? other.getPlanStatus() == null : this.getPlanStatus().equals(other.getPlanStatus()))
            && (this.getIsAssign() == null ? other.getIsAssign() == null : this.getIsAssign().equals(other.getIsAssign()))
            && (this.getAuditTime() == null ? other.getAuditTime() == null : this.getAuditTime().equals(other.getAuditTime()))
            && (this.getAuditUserId() == null ? other.getAuditUserId() == null : this.getAuditUserId().equals(other.getAuditUserId()))
            && (this.getAuditUserName() == null ? other.getAuditUserName() == null : this.getAuditUserName().equals(other.getAuditUserName()))
            && (this.getBillDate() == null ? other.getBillDate() == null : this.getBillDate().equals(other.getBillDate()))
            && (this.getSupplierId() == null ? other.getSupplierId() == null : this.getSupplierId().equals(other.getSupplierId()))
            && (this.getSupplierCode() == null ? other.getSupplierCode() == null : this.getSupplierCode().equals(other.getSupplierCode()))
            && (this.getSupplierName() == null ? other.getSupplierName() == null : this.getSupplierName().equals(other.getSupplierName()))
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
        result = prime * result + ((getProductPlanCode() == null) ? 0 : getProductPlanCode().hashCode());
        result = prime * result + ((getProductComments() == null) ? 0 : getProductComments().hashCode());
        result = prime * result + ((getPlanStatus() == null) ? 0 : getPlanStatus().hashCode());
        result = prime * result + ((getIsAssign() == null) ? 0 : getIsAssign().hashCode());
        result = prime * result + ((getAuditTime() == null) ? 0 : getAuditTime().hashCode());
        result = prime * result + ((getAuditUserId() == null) ? 0 : getAuditUserId().hashCode());
        result = prime * result + ((getAuditUserName() == null) ? 0 : getAuditUserName().hashCode());
        result = prime * result + ((getBillDate() == null) ? 0 : getBillDate().hashCode());
        result = prime * result + ((getSupplierId() == null) ? 0 : getSupplierId().hashCode());
        result = prime * result + ((getSupplierCode() == null) ? 0 : getSupplierCode().hashCode());
        result = prime * result + ((getSupplierName() == null) ? 0 : getSupplierName().hashCode());
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
        sb.append(", productPlanCode=").append(productPlanCode);
        sb.append(", productComments=").append(productComments);
        sb.append(", planStatus=").append(planStatus);
        sb.append(", isAssign=").append(isAssign);
        sb.append(", auditTime=").append(auditTime);
        sb.append(", auditUserId=").append(auditUserId);
        sb.append(", auditUserName=").append(auditUserName);
        sb.append(", billDate=").append(billDate);
        sb.append(", supplierId=").append(supplierId);
        sb.append(", supplierCode=").append(supplierCode);
        sb.append(", supplierName=").append(supplierName);
        sb.append(", creator=").append(creator);
        sb.append(", createTime=").append(createTime);
        sb.append(", modifier=").append(modifier);
        sb.append(", modifyTime=").append(modifyTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}