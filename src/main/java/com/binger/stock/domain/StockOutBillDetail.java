package com.binger.stock.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 出库表明细表
 */
@ApiModel(value="出库表明细表")
public class StockOutBillDetail implements Serializable {
    /**
     * 
     */
    @ApiModelProperty(value="",required = true)
    private Integer id;

    /**
     * 出库单详情编号
     */
    @ApiModelProperty(value="出库单详情编号",required = false)
    private String stockOutBillDetailCode;

    /**
     * 出库单主表编号
     */
    @ApiModelProperty(value="出库单主表编号",required = false)
    private String stockOutBillMainCode;

    /**
     * 商品货号
     */
    @ApiModelProperty(value="商品货号",required = false)
    private Integer goodsId;

    /**
     * 商品编码
     */
    @ApiModelProperty(value="商品编码",required = false)
    private String goodsCode;

    /**
     * 商品名称
     */
    @ApiModelProperty(value="商品名称",required = false)
    private String goodsName;

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
     * SKU名称
     */
    @ApiModelProperty(value="SKU名称",required = false)
    private String skuName;

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
     * 数量
     */
    @ApiModelProperty(value="数量",required = false)
    private Integer quantity;

    /**
     * 重量
     */
    @ApiModelProperty(value="重量",required = false)
    private BigDecimal weight;

    /**
     * 颜色
     */
    @ApiModelProperty(value="颜色",required = false)
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
     * 属性ID
     */
    @ApiModelProperty(value="属性ID",required = false)
    private Integer attrId;

    /**
     * 属性编码
     */
    @ApiModelProperty(value="属性编码",required = false)
    private String attrCode;

    /**
     * 属性名称
     */
    @ApiModelProperty(value="属性名称",required = false)
    private String attrName;

    /**
     * 计量单位
     */
    @ApiModelProperty(value="计量单位",required = false)
    private String unit;

    /**
     * 成本价
     */
    @ApiModelProperty(value="成本价",required = false)
    private BigDecimal price;

    /**
     * 总价
     */
    @ApiModelProperty(value="总价",required = false)
    private BigDecimal totalMny;

    /**
     * 图片URL
     */
    @ApiModelProperty(value="图片URL",required = false)
    private String mainImgUrl;

    /**
     * 申请出库数量
     */
    @ApiModelProperty(value="申请出库数量",required = false)
    private Integer applyQuantity;

    /**
     * 实际出库数量
     */
    @ApiModelProperty(value="实际出库数量",required = false)
    private Integer outQuantity;

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
     * 商品分类Code
     */
    @ApiModelProperty(value="商品分类Code",required = false)
    private String categoryCode;

    /**
     * 0：没有异步设值价格 1 : 已异步设置价格
     */
    @ApiModelProperty(value="0：没有异步设值价格 1 : 已异步设置价格",required = false)
    private Boolean isSetPrice;

    /**
     * 备注
     */
    @ApiModelProperty(value="备注",required = false)
    private String remark;

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
     * stock_out_bill_detail
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
     * 出库单详情编号
     * @return stock_out_bill_detail_code 出库单详情编号
     */
    public String getStockOutBillDetailCode() {
        return stockOutBillDetailCode;
    }

    /**
     * 出库单详情编号
     * @param stockOutBillDetailCode 出库单详情编号
     */
    public void setStockOutBillDetailCode(String stockOutBillDetailCode) {
        this.stockOutBillDetailCode = stockOutBillDetailCode == null ? null : stockOutBillDetailCode.trim();
    }

    /**
     * 出库单主表编号
     * @return stock_out_bill_main_code 出库单主表编号
     */
    public String getStockOutBillMainCode() {
        return stockOutBillMainCode;
    }

    /**
     * 出库单主表编号
     * @param stockOutBillMainCode 出库单主表编号
     */
    public void setStockOutBillMainCode(String stockOutBillMainCode) {
        this.stockOutBillMainCode = stockOutBillMainCode == null ? null : stockOutBillMainCode.trim();
    }

    /**
     * 商品货号
     * @return goods_id 商品货号
     */
    public Integer getGoodsId() {
        return goodsId;
    }

    /**
     * 商品货号
     * @param goodsId 商品货号
     */
    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    /**
     * 商品编码
     * @return goods_code 商品编码
     */
    public String getGoodsCode() {
        return goodsCode;
    }

    /**
     * 商品编码
     * @param goodsCode 商品编码
     */
    public void setGoodsCode(String goodsCode) {
        this.goodsCode = goodsCode == null ? null : goodsCode.trim();
    }

    /**
     * 商品名称
     * @return goods_name 商品名称
     */
    public String getGoodsName() {
        return goodsName;
    }

    /**
     * 商品名称
     * @param goodsName 商品名称
     */
    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
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
     * 重量
     * @return weight 重量
     */
    public BigDecimal getWeight() {
        return weight;
    }

    /**
     * 重量
     * @param weight 重量
     */
    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    /**
     * 颜色
     * @return color_id 颜色
     */
    public Integer getColorId() {
        return colorId;
    }

    /**
     * 颜色
     * @param colorId 颜色
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
     * 属性ID
     * @return attr_id 属性ID
     */
    public Integer getAttrId() {
        return attrId;
    }

    /**
     * 属性ID
     * @param attrId 属性ID
     */
    public void setAttrId(Integer attrId) {
        this.attrId = attrId;
    }

    /**
     * 属性编码
     * @return attr_code 属性编码
     */
    public String getAttrCode() {
        return attrCode;
    }

    /**
     * 属性编码
     * @param attrCode 属性编码
     */
    public void setAttrCode(String attrCode) {
        this.attrCode = attrCode == null ? null : attrCode.trim();
    }

    /**
     * 属性名称
     * @return attr_name 属性名称
     */
    public String getAttrName() {
        return attrName;
    }

    /**
     * 属性名称
     * @param attrName 属性名称
     */
    public void setAttrName(String attrName) {
        this.attrName = attrName == null ? null : attrName.trim();
    }

    /**
     * 计量单位
     * @return unit 计量单位
     */
    public String getUnit() {
        return unit;
    }

    /**
     * 计量单位
     * @param unit 计量单位
     */
    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    /**
     * 成本价
     * @return price 成本价
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * 成本价
     * @param price 成本价
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * 总价
     * @return total_mny 总价
     */
    public BigDecimal getTotalMny() {
        return totalMny;
    }

    /**
     * 总价
     * @param totalMny 总价
     */
    public void setTotalMny(BigDecimal totalMny) {
        this.totalMny = totalMny;
    }

    /**
     * 图片URL
     * @return main_img_url 图片URL
     */
    public String getMainImgUrl() {
        return mainImgUrl;
    }

    /**
     * 图片URL
     * @param mainImgUrl 图片URL
     */
    public void setMainImgUrl(String mainImgUrl) {
        this.mainImgUrl = mainImgUrl == null ? null : mainImgUrl.trim();
    }

    /**
     * 申请出库数量
     * @return apply_quantity 申请出库数量
     */
    public Integer getApplyQuantity() {
        return applyQuantity;
    }

    /**
     * 申请出库数量
     * @param applyQuantity 申请出库数量
     */
    public void setApplyQuantity(Integer applyQuantity) {
        this.applyQuantity = applyQuantity;
    }

    /**
     * 实际出库数量
     * @return out_quantity 实际出库数量
     */
    public Integer getOutQuantity() {
        return outQuantity;
    }

    /**
     * 实际出库数量
     * @param outQuantity 实际出库数量
     */
    public void setOutQuantity(Integer outQuantity) {
        this.outQuantity = outQuantity;
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
     * 商品分类Code
     * @return category_code 商品分类Code
     */
    public String getCategoryCode() {
        return categoryCode;
    }

    /**
     * 商品分类Code
     * @param categoryCode 商品分类Code
     */
    public void setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode == null ? null : categoryCode.trim();
    }

    /**
     * 0：没有异步设值价格 1 : 已异步设置价格
     * @return is_set_price 0：没有异步设值价格 1 : 已异步设置价格
     */
    public Boolean getIsSetPrice() {
        return isSetPrice;
    }

    /**
     * 0：没有异步设值价格 1 : 已异步设置价格
     * @param isSetPrice 0：没有异步设值价格 1 : 已异步设置价格
     */
    public void setIsSetPrice(Boolean isSetPrice) {
        this.isSetPrice = isSetPrice;
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
        StockOutBillDetail other = (StockOutBillDetail) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getStockOutBillDetailCode() == null ? other.getStockOutBillDetailCode() == null : this.getStockOutBillDetailCode().equals(other.getStockOutBillDetailCode()))
            && (this.getStockOutBillMainCode() == null ? other.getStockOutBillMainCode() == null : this.getStockOutBillMainCode().equals(other.getStockOutBillMainCode()))
            && (this.getGoodsId() == null ? other.getGoodsId() == null : this.getGoodsId().equals(other.getGoodsId()))
            && (this.getGoodsCode() == null ? other.getGoodsCode() == null : this.getGoodsCode().equals(other.getGoodsCode()))
            && (this.getGoodsName() == null ? other.getGoodsName() == null : this.getGoodsName().equals(other.getGoodsName()))
            && (this.getSkuId() == null ? other.getSkuId() == null : this.getSkuId().equals(other.getSkuId()))
            && (this.getSkuCode() == null ? other.getSkuCode() == null : this.getSkuCode().equals(other.getSkuCode()))
            && (this.getSkuName() == null ? other.getSkuName() == null : this.getSkuName().equals(other.getSkuName()))
            && (this.getSizeId() == null ? other.getSizeId() == null : this.getSizeId().equals(other.getSizeId()))
            && (this.getSizeCode() == null ? other.getSizeCode() == null : this.getSizeCode().equals(other.getSizeCode()))
            && (this.getSizeName() == null ? other.getSizeName() == null : this.getSizeName().equals(other.getSizeName()))
            && (this.getQuantity() == null ? other.getQuantity() == null : this.getQuantity().equals(other.getQuantity()))
            && (this.getWeight() == null ? other.getWeight() == null : this.getWeight().equals(other.getWeight()))
            && (this.getColorId() == null ? other.getColorId() == null : this.getColorId().equals(other.getColorId()))
            && (this.getColorCode() == null ? other.getColorCode() == null : this.getColorCode().equals(other.getColorCode()))
            && (this.getColorName() == null ? other.getColorName() == null : this.getColorName().equals(other.getColorName()))
            && (this.getAttrId() == null ? other.getAttrId() == null : this.getAttrId().equals(other.getAttrId()))
            && (this.getAttrCode() == null ? other.getAttrCode() == null : this.getAttrCode().equals(other.getAttrCode()))
            && (this.getAttrName() == null ? other.getAttrName() == null : this.getAttrName().equals(other.getAttrName()))
            && (this.getUnit() == null ? other.getUnit() == null : this.getUnit().equals(other.getUnit()))
            && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()))
            && (this.getTotalMny() == null ? other.getTotalMny() == null : this.getTotalMny().equals(other.getTotalMny()))
            && (this.getMainImgUrl() == null ? other.getMainImgUrl() == null : this.getMainImgUrl().equals(other.getMainImgUrl()))
            && (this.getApplyQuantity() == null ? other.getApplyQuantity() == null : this.getApplyQuantity().equals(other.getApplyQuantity()))
            && (this.getOutQuantity() == null ? other.getOutQuantity() == null : this.getOutQuantity().equals(other.getOutQuantity()))
            && (this.getCategoryId() == null ? other.getCategoryId() == null : this.getCategoryId().equals(other.getCategoryId()))
            && (this.getCategoryName() == null ? other.getCategoryName() == null : this.getCategoryName().equals(other.getCategoryName()))
            && (this.getCategoryCode() == null ? other.getCategoryCode() == null : this.getCategoryCode().equals(other.getCategoryCode()))
            && (this.getIsSetPrice() == null ? other.getIsSetPrice() == null : this.getIsSetPrice().equals(other.getIsSetPrice()))
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
        result = prime * result + ((getStockOutBillDetailCode() == null) ? 0 : getStockOutBillDetailCode().hashCode());
        result = prime * result + ((getStockOutBillMainCode() == null) ? 0 : getStockOutBillMainCode().hashCode());
        result = prime * result + ((getGoodsId() == null) ? 0 : getGoodsId().hashCode());
        result = prime * result + ((getGoodsCode() == null) ? 0 : getGoodsCode().hashCode());
        result = prime * result + ((getGoodsName() == null) ? 0 : getGoodsName().hashCode());
        result = prime * result + ((getSkuId() == null) ? 0 : getSkuId().hashCode());
        result = prime * result + ((getSkuCode() == null) ? 0 : getSkuCode().hashCode());
        result = prime * result + ((getSkuName() == null) ? 0 : getSkuName().hashCode());
        result = prime * result + ((getSizeId() == null) ? 0 : getSizeId().hashCode());
        result = prime * result + ((getSizeCode() == null) ? 0 : getSizeCode().hashCode());
        result = prime * result + ((getSizeName() == null) ? 0 : getSizeName().hashCode());
        result = prime * result + ((getQuantity() == null) ? 0 : getQuantity().hashCode());
        result = prime * result + ((getWeight() == null) ? 0 : getWeight().hashCode());
        result = prime * result + ((getColorId() == null) ? 0 : getColorId().hashCode());
        result = prime * result + ((getColorCode() == null) ? 0 : getColorCode().hashCode());
        result = prime * result + ((getColorName() == null) ? 0 : getColorName().hashCode());
        result = prime * result + ((getAttrId() == null) ? 0 : getAttrId().hashCode());
        result = prime * result + ((getAttrCode() == null) ? 0 : getAttrCode().hashCode());
        result = prime * result + ((getAttrName() == null) ? 0 : getAttrName().hashCode());
        result = prime * result + ((getUnit() == null) ? 0 : getUnit().hashCode());
        result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
        result = prime * result + ((getTotalMny() == null) ? 0 : getTotalMny().hashCode());
        result = prime * result + ((getMainImgUrl() == null) ? 0 : getMainImgUrl().hashCode());
        result = prime * result + ((getApplyQuantity() == null) ? 0 : getApplyQuantity().hashCode());
        result = prime * result + ((getOutQuantity() == null) ? 0 : getOutQuantity().hashCode());
        result = prime * result + ((getCategoryId() == null) ? 0 : getCategoryId().hashCode());
        result = prime * result + ((getCategoryName() == null) ? 0 : getCategoryName().hashCode());
        result = prime * result + ((getCategoryCode() == null) ? 0 : getCategoryCode().hashCode());
        result = prime * result + ((getIsSetPrice() == null) ? 0 : getIsSetPrice().hashCode());
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
        sb.append(", stockOutBillDetailCode=").append(stockOutBillDetailCode);
        sb.append(", stockOutBillMainCode=").append(stockOutBillMainCode);
        sb.append(", goodsId=").append(goodsId);
        sb.append(", goodsCode=").append(goodsCode);
        sb.append(", goodsName=").append(goodsName);
        sb.append(", skuId=").append(skuId);
        sb.append(", skuCode=").append(skuCode);
        sb.append(", skuName=").append(skuName);
        sb.append(", sizeId=").append(sizeId);
        sb.append(", sizeCode=").append(sizeCode);
        sb.append(", sizeName=").append(sizeName);
        sb.append(", quantity=").append(quantity);
        sb.append(", weight=").append(weight);
        sb.append(", colorId=").append(colorId);
        sb.append(", colorCode=").append(colorCode);
        sb.append(", colorName=").append(colorName);
        sb.append(", attrId=").append(attrId);
        sb.append(", attrCode=").append(attrCode);
        sb.append(", attrName=").append(attrName);
        sb.append(", unit=").append(unit);
        sb.append(", price=").append(price);
        sb.append(", totalMny=").append(totalMny);
        sb.append(", mainImgUrl=").append(mainImgUrl);
        sb.append(", applyQuantity=").append(applyQuantity);
        sb.append(", outQuantity=").append(outQuantity);
        sb.append(", categoryId=").append(categoryId);
        sb.append(", categoryName=").append(categoryName);
        sb.append(", categoryCode=").append(categoryCode);
        sb.append(", isSetPrice=").append(isSetPrice);
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