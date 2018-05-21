package com.binger.stock.domain;

import java.io.Serializable;
import java.util.Date;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 库存占用日志
 */
@ApiModel(value="库存占用日志")
public class StockReserveLog implements Serializable {
    /**
     * id
     */
    @ApiModelProperty(value="id",required = true)
    private Integer id;

    /**
     * 单据编号
     */
    @ApiModelProperty(value="单据编号",required = false)
    private String billCode;

    /**
     * 单据类型,销售单 调拨单 保存态出库单占用
     */
    @ApiModelProperty(value="单据类型,销售单 调拨单 保存态出库单占用",required = false)
    private String billType;

    /**
     * 库存占用ID
     */
    @ApiModelProperty(value="库存占用ID",required = false)
    private Integer currentNumberId;

    /**
     * skuid
     */
    @ApiModelProperty(value="skuid",required = false)
    private Integer skuId;

    /**
     * sku编码
     */
    @ApiModelProperty(value="sku编码",required = false)
    private String skuCode;

    /**
     * sku名称
     */
    @ApiModelProperty(value="sku名称",required = false)
    private String skuName;

    /**
     * 占用库存（对于出库单就是释放库存）
     */
    @ApiModelProperty(value="占用库存（对于出库单就是释放库存）",required = false)
    private Integer reserveNumber;

    /**
     * 占用的库存是否已释放
     */
    @ApiModelProperty(value="占用的库存是否已释放",required = false)
    private Boolean isStockout;

    /**
     * 销售订单是否已经揽收、调拨单或者其他出库单审核
     */
    @ApiModelProperty(value="销售订单是否已经揽收、调拨单或者其他出库单审核",required = false)
    private Boolean isLanshou;

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
     * stock_reserve_log
     */
    private static final long serialVersionUID = 1L;

    /**
     * id
     * @return id id
     */
    public Integer getId() {
        return id;
    }

    /**
     * id
     * @param id id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 单据编号
     * @return bill_code 单据编号
     */
    public String getBillCode() {
        return billCode;
    }

    /**
     * 单据编号
     * @param billCode 单据编号
     */
    public void setBillCode(String billCode) {
        this.billCode = billCode == null ? null : billCode.trim();
    }

    /**
     * 单据类型,销售单 调拨单 保存态出库单占用
     * @return bill_type 单据类型,销售单 调拨单 保存态出库单占用
     */
    public String getBillType() {
        return billType;
    }

    /**
     * 单据类型,销售单 调拨单 保存态出库单占用
     * @param billType 单据类型,销售单 调拨单 保存态出库单占用
     */
    public void setBillType(String billType) {
        this.billType = billType == null ? null : billType.trim();
    }

    /**
     * 库存占用ID
     * @return current_number_id 库存占用ID
     */
    public Integer getCurrentNumberId() {
        return currentNumberId;
    }

    /**
     * 库存占用ID
     * @param currentNumberId 库存占用ID
     */
    public void setCurrentNumberId(Integer currentNumberId) {
        this.currentNumberId = currentNumberId;
    }

    /**
     * skuid
     * @return sku_id skuid
     */
    public Integer getSkuId() {
        return skuId;
    }

    /**
     * skuid
     * @param skuId skuid
     */
    public void setSkuId(Integer skuId) {
        this.skuId = skuId;
    }

    /**
     * sku编码
     * @return sku_code sku编码
     */
    public String getSkuCode() {
        return skuCode;
    }

    /**
     * sku编码
     * @param skuCode sku编码
     */
    public void setSkuCode(String skuCode) {
        this.skuCode = skuCode == null ? null : skuCode.trim();
    }

    /**
     * sku名称
     * @return sku_name sku名称
     */
    public String getSkuName() {
        return skuName;
    }

    /**
     * sku名称
     * @param skuName sku名称
     */
    public void setSkuName(String skuName) {
        this.skuName = skuName == null ? null : skuName.trim();
    }

    /**
     * 占用库存（对于出库单就是释放库存）
     * @return reserve_number 占用库存（对于出库单就是释放库存）
     */
    public Integer getReserveNumber() {
        return reserveNumber;
    }

    /**
     * 占用库存（对于出库单就是释放库存）
     * @param reserveNumber 占用库存（对于出库单就是释放库存）
     */
    public void setReserveNumber(Integer reserveNumber) {
        this.reserveNumber = reserveNumber;
    }

    /**
     * 占用的库存是否已释放
     * @return is_stockout 占用的库存是否已释放
     */
    public Boolean getIsStockout() {
        return isStockout;
    }

    /**
     * 占用的库存是否已释放
     * @param isStockout 占用的库存是否已释放
     */
    public void setIsStockout(Boolean isStockout) {
        this.isStockout = isStockout;
    }

    /**
     * 销售订单是否已经揽收、调拨单或者其他出库单审核
     * @return is_lanshou 销售订单是否已经揽收、调拨单或者其他出库单审核
     */
    public Boolean getIsLanshou() {
        return isLanshou;
    }

    /**
     * 销售订单是否已经揽收、调拨单或者其他出库单审核
     * @param isLanshou 销售订单是否已经揽收、调拨单或者其他出库单审核
     */
    public void setIsLanshou(Boolean isLanshou) {
        this.isLanshou = isLanshou;
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
        StockReserveLog other = (StockReserveLog) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getBillCode() == null ? other.getBillCode() == null : this.getBillCode().equals(other.getBillCode()))
            && (this.getBillType() == null ? other.getBillType() == null : this.getBillType().equals(other.getBillType()))
            && (this.getCurrentNumberId() == null ? other.getCurrentNumberId() == null : this.getCurrentNumberId().equals(other.getCurrentNumberId()))
            && (this.getSkuId() == null ? other.getSkuId() == null : this.getSkuId().equals(other.getSkuId()))
            && (this.getSkuCode() == null ? other.getSkuCode() == null : this.getSkuCode().equals(other.getSkuCode()))
            && (this.getSkuName() == null ? other.getSkuName() == null : this.getSkuName().equals(other.getSkuName()))
            && (this.getReserveNumber() == null ? other.getReserveNumber() == null : this.getReserveNumber().equals(other.getReserveNumber()))
            && (this.getIsStockout() == null ? other.getIsStockout() == null : this.getIsStockout().equals(other.getIsStockout()))
            && (this.getIsLanshou() == null ? other.getIsLanshou() == null : this.getIsLanshou().equals(other.getIsLanshou()))
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
        result = prime * result + ((getBillCode() == null) ? 0 : getBillCode().hashCode());
        result = prime * result + ((getBillType() == null) ? 0 : getBillType().hashCode());
        result = prime * result + ((getCurrentNumberId() == null) ? 0 : getCurrentNumberId().hashCode());
        result = prime * result + ((getSkuId() == null) ? 0 : getSkuId().hashCode());
        result = prime * result + ((getSkuCode() == null) ? 0 : getSkuCode().hashCode());
        result = prime * result + ((getSkuName() == null) ? 0 : getSkuName().hashCode());
        result = prime * result + ((getReserveNumber() == null) ? 0 : getReserveNumber().hashCode());
        result = prime * result + ((getIsStockout() == null) ? 0 : getIsStockout().hashCode());
        result = prime * result + ((getIsLanshou() == null) ? 0 : getIsLanshou().hashCode());
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
        sb.append(", billCode=").append(billCode);
        sb.append(", billType=").append(billType);
        sb.append(", currentNumberId=").append(currentNumberId);
        sb.append(", skuId=").append(skuId);
        sb.append(", skuCode=").append(skuCode);
        sb.append(", skuName=").append(skuName);
        sb.append(", reserveNumber=").append(reserveNumber);
        sb.append(", isStockout=").append(isStockout);
        sb.append(", isLanshou=").append(isLanshou);
        sb.append(", creator=").append(creator);
        sb.append(", createTime=").append(createTime);
        sb.append(", modifier=").append(modifier);
        sb.append(", modifyTime=").append(modifyTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}