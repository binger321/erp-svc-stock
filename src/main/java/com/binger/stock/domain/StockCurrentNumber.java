package com.binger.stock.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 实时库存明细表
 */
@ApiModel(value="实时库存明细表")
public class StockCurrentNumber implements Serializable {
    /**
     * 库存ID
     */
    @ApiModelProperty(value="库存ID",required = true)
    private Integer id;

    /**
     * 仓库ID
     */
    @ApiModelProperty(value="仓库ID",required = true)
    private Integer warehouseId;

    /**
     * 货号ID
     */
    @ApiModelProperty(value="货号ID",required = false)
    private Integer goodsId;

    /**
     * 货号
     */
    @ApiModelProperty(value="货号",required = false)
    private String goodsCode;

    /**
     * 货号名称
     */
    @ApiModelProperty(value="货号名称",required = false)
    private String goodsName;

    /**
     * SKUID
     */
    @ApiModelProperty(value="SKUID",required = false)
    private Integer skuId;

    /**
     * SKU编码
     */
    @ApiModelProperty(value="SKU编码",required = false)
    private String skuCode;

    /**
     * SKU名称
     */
    @ApiModelProperty(value="SKU名称",required = false)
    private String skuName;

    /**
     * 库存成本
     */
    @ApiModelProperty(value="库存成本",required = false)
    private BigDecimal costPrice;

    /**
     * 总库存
     */
    @ApiModelProperty(value="总库存",required = false)
    private Integer totalNumber;

    /**
     * 可用库存
     */
    @ApiModelProperty(value="可用库存",required = false)
    private Integer useNumber;

    /**
     * 占用库存
     */
    @ApiModelProperty(value="占用库存",required = false)
    private Integer reserveNumber;

    /**
     * 
     */
    @ApiModelProperty(value="",required = false)
    private Boolean isActive;

    /**
     * 尺寸编码ID
     */
    @ApiModelProperty(value="尺寸编码ID",required = false)
    private Integer sizeId;

    /**
     * 尺寸编码
     */
    @ApiModelProperty(value="尺寸编码",required = false)
    private String sizeCode;

    /**
     * 尺寸名称
     */
    @ApiModelProperty(value="尺寸名称",required = false)
    private String sizeName;

    /**
     * 规格
     */
    @ApiModelProperty(value="规格",required = false)
    private String standard;

    /**
     * 颜色ID
     */
    @ApiModelProperty(value="颜色ID",required = false)
    private Integer colorId;

    /**
     * 颜色编码
     */
    @ApiModelProperty(value="颜色编码",required = false)
    private String colorCode;

    /**
     * 颜色名称
     */
    @ApiModelProperty(value="颜色名称",required = false)
    private String colorName;

    /**
     * 商品分类id
     */
    @ApiModelProperty(value="商品分类id",required = false)
    private Integer categoryId;

    /**
     * 商品分类名称
     */
    @ApiModelProperty(value="商品分类名称",required = false)
    private String categoryName;

    /**
     * 商品分类编码
     */
    @ApiModelProperty(value="商品分类编码",required = false)
    private String categoryCode;

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
     * stock_current_number
     */
    private static final long serialVersionUID = 1L;

    /**
     * 库存ID
     * @return id 库存ID
     */
    public Integer getId() {
        return id;
    }

    /**
     * 库存ID
     * @param id 库存ID
     */
    public void setId(Integer id) {
        this.id = id;
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
     * 货号ID
     * @return goods_id 货号ID
     */
    public Integer getGoodsId() {
        return goodsId;
    }

    /**
     * 货号ID
     * @param goodsId 货号ID
     */
    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    /**
     * 货号
     * @return goods_code 货号
     */
    public String getGoodsCode() {
        return goodsCode;
    }

    /**
     * 货号
     * @param goodsCode 货号
     */
    public void setGoodsCode(String goodsCode) {
        this.goodsCode = goodsCode == null ? null : goodsCode.trim();
    }

    /**
     * 货号名称
     * @return goods_name 货号名称
     */
    public String getGoodsName() {
        return goodsName;
    }

    /**
     * 货号名称
     * @param goodsName 货号名称
     */
    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    /**
     * SKUID
     * @return sku_id SKUID
     */
    public Integer getSkuId() {
        return skuId;
    }

    /**
     * SKUID
     * @param skuId SKUID
     */
    public void setSkuId(Integer skuId) {
        this.skuId = skuId;
    }

    /**
     * SKU编码
     * @return sku_code SKU编码
     */
    public String getSkuCode() {
        return skuCode;
    }

    /**
     * SKU编码
     * @param skuCode SKU编码
     */
    public void setSkuCode(String skuCode) {
        this.skuCode = skuCode == null ? null : skuCode.trim();
    }

    /**
     * SKU名称
     * @return sku_name SKU名称
     */
    public String getSkuName() {
        return skuName;
    }

    /**
     * SKU名称
     * @param skuName SKU名称
     */
    public void setSkuName(String skuName) {
        this.skuName = skuName == null ? null : skuName.trim();
    }

    /**
     * 库存成本
     * @return cost_price 库存成本
     */
    public BigDecimal getCostPrice() {
        return costPrice;
    }

    /**
     * 库存成本
     * @param costPrice 库存成本
     */
    public void setCostPrice(BigDecimal costPrice) {
        this.costPrice = costPrice;
    }

    /**
     * 总库存
     * @return total_number 总库存
     */
    public Integer getTotalNumber() {
        return totalNumber;
    }

    /**
     * 总库存
     * @param totalNumber 总库存
     */
    public void setTotalNumber(Integer totalNumber) {
        this.totalNumber = totalNumber;
    }

    /**
     * 可用库存
     * @return use_number 可用库存
     */
    public Integer getUseNumber() {
        return useNumber;
    }

    /**
     * 可用库存
     * @param useNumber 可用库存
     */
    public void setUseNumber(Integer useNumber) {
        this.useNumber = useNumber;
    }

    /**
     * 占用库存
     * @return reserve_number 占用库存
     */
    public Integer getReserveNumber() {
        return reserveNumber;
    }

    /**
     * 占用库存
     * @param reserveNumber 占用库存
     */
    public void setReserveNumber(Integer reserveNumber) {
        this.reserveNumber = reserveNumber;
    }

    /**
     * 
     * @return is_active 
     */
    public Boolean getIsActive() {
        return isActive;
    }

    /**
     * 
     * @param isActive 
     */
    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    /**
     * 尺寸编码ID
     * @return size_id 尺寸编码ID
     */
    public Integer getSizeId() {
        return sizeId;
    }

    /**
     * 尺寸编码ID
     * @param sizeId 尺寸编码ID
     */
    public void setSizeId(Integer sizeId) {
        this.sizeId = sizeId;
    }

    /**
     * 尺寸编码
     * @return size_code 尺寸编码
     */
    public String getSizeCode() {
        return sizeCode;
    }

    /**
     * 尺寸编码
     * @param sizeCode 尺寸编码
     */
    public void setSizeCode(String sizeCode) {
        this.sizeCode = sizeCode == null ? null : sizeCode.trim();
    }

    /**
     * 尺寸名称
     * @return size_name 尺寸名称
     */
    public String getSizeName() {
        return sizeName;
    }

    /**
     * 尺寸名称
     * @param sizeName 尺寸名称
     */
    public void setSizeName(String sizeName) {
        this.sizeName = sizeName == null ? null : sizeName.trim();
    }

    /**
     * 规格
     * @return standard 规格
     */
    public String getStandard() {
        return standard;
    }

    /**
     * 规格
     * @param standard 规格
     */
    public void setStandard(String standard) {
        this.standard = standard == null ? null : standard.trim();
    }

    /**
     * 颜色ID
     * @return color_id 颜色ID
     */
    public Integer getColorId() {
        return colorId;
    }

    /**
     * 颜色ID
     * @param colorId 颜色ID
     */
    public void setColorId(Integer colorId) {
        this.colorId = colorId;
    }

    /**
     * 颜色编码
     * @return color_code 颜色编码
     */
    public String getColorCode() {
        return colorCode;
    }

    /**
     * 颜色编码
     * @param colorCode 颜色编码
     */
    public void setColorCode(String colorCode) {
        this.colorCode = colorCode == null ? null : colorCode.trim();
    }

    /**
     * 颜色名称
     * @return color_name 颜色名称
     */
    public String getColorName() {
        return colorName;
    }

    /**
     * 颜色名称
     * @param colorName 颜色名称
     */
    public void setColorName(String colorName) {
        this.colorName = colorName == null ? null : colorName.trim();
    }

    /**
     * 商品分类id
     * @return category_id 商品分类id
     */
    public Integer getCategoryId() {
        return categoryId;
    }

    /**
     * 商品分类id
     * @param categoryId 商品分类id
     */
    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * 商品分类名称
     * @return category_name 商品分类名称
     */
    public String getCategoryName() {
        return categoryName;
    }

    /**
     * 商品分类名称
     * @param categoryName 商品分类名称
     */
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName == null ? null : categoryName.trim();
    }

    /**
     * 商品分类编码
     * @return category_code 商品分类编码
     */
    public String getCategoryCode() {
        return categoryCode;
    }

    /**
     * 商品分类编码
     * @param categoryCode 商品分类编码
     */
    public void setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode == null ? null : categoryCode.trim();
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
        StockCurrentNumber other = (StockCurrentNumber) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getWarehouseId() == null ? other.getWarehouseId() == null : this.getWarehouseId().equals(other.getWarehouseId()))
            && (this.getGoodsId() == null ? other.getGoodsId() == null : this.getGoodsId().equals(other.getGoodsId()))
            && (this.getGoodsCode() == null ? other.getGoodsCode() == null : this.getGoodsCode().equals(other.getGoodsCode()))
            && (this.getGoodsName() == null ? other.getGoodsName() == null : this.getGoodsName().equals(other.getGoodsName()))
            && (this.getSkuId() == null ? other.getSkuId() == null : this.getSkuId().equals(other.getSkuId()))
            && (this.getSkuCode() == null ? other.getSkuCode() == null : this.getSkuCode().equals(other.getSkuCode()))
            && (this.getSkuName() == null ? other.getSkuName() == null : this.getSkuName().equals(other.getSkuName()))
            && (this.getCostPrice() == null ? other.getCostPrice() == null : this.getCostPrice().equals(other.getCostPrice()))
            && (this.getTotalNumber() == null ? other.getTotalNumber() == null : this.getTotalNumber().equals(other.getTotalNumber()))
            && (this.getUseNumber() == null ? other.getUseNumber() == null : this.getUseNumber().equals(other.getUseNumber()))
            && (this.getReserveNumber() == null ? other.getReserveNumber() == null : this.getReserveNumber().equals(other.getReserveNumber()))
            && (this.getIsActive() == null ? other.getIsActive() == null : this.getIsActive().equals(other.getIsActive()))
            && (this.getSizeId() == null ? other.getSizeId() == null : this.getSizeId().equals(other.getSizeId()))
            && (this.getSizeCode() == null ? other.getSizeCode() == null : this.getSizeCode().equals(other.getSizeCode()))
            && (this.getSizeName() == null ? other.getSizeName() == null : this.getSizeName().equals(other.getSizeName()))
            && (this.getStandard() == null ? other.getStandard() == null : this.getStandard().equals(other.getStandard()))
            && (this.getColorId() == null ? other.getColorId() == null : this.getColorId().equals(other.getColorId()))
            && (this.getColorCode() == null ? other.getColorCode() == null : this.getColorCode().equals(other.getColorCode()))
            && (this.getColorName() == null ? other.getColorName() == null : this.getColorName().equals(other.getColorName()))
            && (this.getCategoryId() == null ? other.getCategoryId() == null : this.getCategoryId().equals(other.getCategoryId()))
            && (this.getCategoryName() == null ? other.getCategoryName() == null : this.getCategoryName().equals(other.getCategoryName()))
            && (this.getCategoryCode() == null ? other.getCategoryCode() == null : this.getCategoryCode().equals(other.getCategoryCode()))
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
        result = prime * result + ((getWarehouseId() == null) ? 0 : getWarehouseId().hashCode());
        result = prime * result + ((getGoodsId() == null) ? 0 : getGoodsId().hashCode());
        result = prime * result + ((getGoodsCode() == null) ? 0 : getGoodsCode().hashCode());
        result = prime * result + ((getGoodsName() == null) ? 0 : getGoodsName().hashCode());
        result = prime * result + ((getSkuId() == null) ? 0 : getSkuId().hashCode());
        result = prime * result + ((getSkuCode() == null) ? 0 : getSkuCode().hashCode());
        result = prime * result + ((getSkuName() == null) ? 0 : getSkuName().hashCode());
        result = prime * result + ((getCostPrice() == null) ? 0 : getCostPrice().hashCode());
        result = prime * result + ((getTotalNumber() == null) ? 0 : getTotalNumber().hashCode());
        result = prime * result + ((getUseNumber() == null) ? 0 : getUseNumber().hashCode());
        result = prime * result + ((getReserveNumber() == null) ? 0 : getReserveNumber().hashCode());
        result = prime * result + ((getIsActive() == null) ? 0 : getIsActive().hashCode());
        result = prime * result + ((getSizeId() == null) ? 0 : getSizeId().hashCode());
        result = prime * result + ((getSizeCode() == null) ? 0 : getSizeCode().hashCode());
        result = prime * result + ((getSizeName() == null) ? 0 : getSizeName().hashCode());
        result = prime * result + ((getStandard() == null) ? 0 : getStandard().hashCode());
        result = prime * result + ((getColorId() == null) ? 0 : getColorId().hashCode());
        result = prime * result + ((getColorCode() == null) ? 0 : getColorCode().hashCode());
        result = prime * result + ((getColorName() == null) ? 0 : getColorName().hashCode());
        result = prime * result + ((getCategoryId() == null) ? 0 : getCategoryId().hashCode());
        result = prime * result + ((getCategoryName() == null) ? 0 : getCategoryName().hashCode());
        result = prime * result + ((getCategoryCode() == null) ? 0 : getCategoryCode().hashCode());
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
        sb.append(", warehouseId=").append(warehouseId);
        sb.append(", goodsId=").append(goodsId);
        sb.append(", goodsCode=").append(goodsCode);
        sb.append(", goodsName=").append(goodsName);
        sb.append(", skuId=").append(skuId);
        sb.append(", skuCode=").append(skuCode);
        sb.append(", skuName=").append(skuName);
        sb.append(", costPrice=").append(costPrice);
        sb.append(", totalNumber=").append(totalNumber);
        sb.append(", useNumber=").append(useNumber);
        sb.append(", reserveNumber=").append(reserveNumber);
        sb.append(", isActive=").append(isActive);
        sb.append(", sizeId=").append(sizeId);
        sb.append(", sizeCode=").append(sizeCode);
        sb.append(", sizeName=").append(sizeName);
        sb.append(", standard=").append(standard);
        sb.append(", colorId=").append(colorId);
        sb.append(", colorCode=").append(colorCode);
        sb.append(", colorName=").append(colorName);
        sb.append(", categoryId=").append(categoryId);
        sb.append(", categoryName=").append(categoryName);
        sb.append(", categoryCode=").append(categoryCode);
        sb.append(", creator=").append(creator);
        sb.append(", createTime=").append(createTime);
        sb.append(", modifier=").append(modifier);
        sb.append(", modifyTime=").append(modifyTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}