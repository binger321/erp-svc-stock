package com.binger.stock.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 子生产计划表
 */
@ApiModel(value="子生产计划表")
public class ProductPlanDetail implements Serializable {
    /**
     * 子生产计划ID
     */
    @ApiModelProperty(value="子生产计划ID",required = true)
    private Integer id;

    /**
     * 主生产计划ID
     */
    @ApiModelProperty(value="主生产计划ID",required = true)
    private Integer productPlanMainId;

    /**
     * 生产计划编号
     */
    @ApiModelProperty(value="生产计划编号",required = true)
    private String productPlanCode;

    /**
     * 子生产计划编码
     */
    @ApiModelProperty(value="子生产计划编码",required = false)
    private String productPlanDetailCode;

    /**
     * 生产订单编号（用于回写生产下达状态）
     */
    @ApiModelProperty(value="生产订单编号（用于回写生产下达状态）",required = false)
    private String productOrderCode;

    /**
     * 生产下达状态
     */
    @ApiModelProperty(value="生产下达状态",required = false)
    private Boolean productStatus;

    /**
     * 商品ID
     */
    @ApiModelProperty(value="商品ID",required = true)
    private Integer goodsId;

    /**
     * 商品货号
     */
    @ApiModelProperty(value="商品货号",required = true)
    private String goodsCode;

    /**
     * 货号名称
     */
    @ApiModelProperty(value="货号名称",required = false)
    private String goodsName;

    /**
     * skuID
     */
    @ApiModelProperty(value="skuID",required = true)
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
     * 商品颜色ID
     */
    @ApiModelProperty(value="商品颜色ID",required = false)
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
     * 主图
     */
    @ApiModelProperty(value="主图",required = false)
    private String mainImgUrl;

    /**
     * SKU图片ID
     */
    @ApiModelProperty(value="SKU图片ID",required = false)
    private Integer goodsImgId;

    /**
     * SKU图片链接
     */
    @ApiModelProperty(value="SKU图片链接",required = false)
    private String goodsImgUrl;

    /**
     * 备货数量
     */
    @ApiModelProperty(value="备货数量",required = false)
    private Integer stockQuantity;

    /**
     * 缺货数量
     */
    @ApiModelProperty(value="缺货数量",required = false)
    private Integer outofstockQuantity;

    /**
     * 生产链接
     */
    @ApiModelProperty(value="生产链接",required = false)
    private String productLink;

    /**
     * 生产单价
     */
    @ApiModelProperty(value="生产单价",required = false)
    private BigDecimal costPrice;

    /**
     * 生产备注
     */
    @ApiModelProperty(value="生产备注",required = false)
    private String productComments;

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
     * product_plan_detail
     */
    private static final long serialVersionUID = 1L;

    /**
     * 子生产计划ID
     * @return id 子生产计划ID
     */
    public Integer getId() {
        return id;
    }

    /**
     * 子生产计划ID
     * @param id 子生产计划ID
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 主生产计划ID
     * @return product_plan_main_id 主生产计划ID
     */
    public Integer getProductPlanMainId() {
        return productPlanMainId;
    }

    /**
     * 主生产计划ID
     * @param productPlanMainId 主生产计划ID
     */
    public void setProductPlanMainId(Integer productPlanMainId) {
        this.productPlanMainId = productPlanMainId;
    }

    /**
     * 生产计划编号
     * @return product_plan_code 生产计划编号
     */
    public String getProductPlanCode() {
        return productPlanCode;
    }

    /**
     * 生产计划编号
     * @param productPlanCode 生产计划编号
     */
    public void setProductPlanCode(String productPlanCode) {
        this.productPlanCode = productPlanCode == null ? null : productPlanCode.trim();
    }

    /**
     * 子生产计划编码
     * @return product_plan_detail_code 子生产计划编码
     */
    public String getProductPlanDetailCode() {
        return productPlanDetailCode;
    }

    /**
     * 子生产计划编码
     * @param productPlanDetailCode 子生产计划编码
     */
    public void setProductPlanDetailCode(String productPlanDetailCode) {
        this.productPlanDetailCode = productPlanDetailCode == null ? null : productPlanDetailCode.trim();
    }

    /**
     * 生产订单编号（用于回写生产下达状态）
     * @return product_order_code 生产订单编号（用于回写生产下达状态）
     */
    public String getProductOrderCode() {
        return productOrderCode;
    }

    /**
     * 生产订单编号（用于回写生产下达状态）
     * @param productOrderCode 生产订单编号（用于回写生产下达状态）
     */
    public void setProductOrderCode(String productOrderCode) {
        this.productOrderCode = productOrderCode == null ? null : productOrderCode.trim();
    }

    /**
     * 生产下达状态
     * @return product_status 生产下达状态
     */
    public Boolean getProductStatus() {
        return productStatus;
    }

    /**
     * 生产下达状态
     * @param productStatus 生产下达状态
     */
    public void setProductStatus(Boolean productStatus) {
        this.productStatus = productStatus;
    }

    /**
     * 商品ID
     * @return goods_id 商品ID
     */
    public Integer getGoodsId() {
        return goodsId;
    }

    /**
     * 商品ID
     * @param goodsId 商品ID
     */
    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    /**
     * 商品货号
     * @return goods_code 商品货号
     */
    public String getGoodsCode() {
        return goodsCode;
    }

    /**
     * 商品货号
     * @param goodsCode 商品货号
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
     * skuID
     * @return sku_id skuID
     */
    public Integer getSkuId() {
        return skuId;
    }

    /**
     * skuID
     * @param skuId skuID
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
     * 商品颜色ID
     * @return color_id 商品颜色ID
     */
    public Integer getColorId() {
        return colorId;
    }

    /**
     * 商品颜色ID
     * @param colorId 商品颜色ID
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
     * 主图
     * @return main_img_url 主图
     */
    public String getMainImgUrl() {
        return mainImgUrl;
    }

    /**
     * 主图
     * @param mainImgUrl 主图
     */
    public void setMainImgUrl(String mainImgUrl) {
        this.mainImgUrl = mainImgUrl == null ? null : mainImgUrl.trim();
    }

    /**
     * SKU图片ID
     * @return goods_img_id SKU图片ID
     */
    public Integer getGoodsImgId() {
        return goodsImgId;
    }

    /**
     * SKU图片ID
     * @param goodsImgId SKU图片ID
     */
    public void setGoodsImgId(Integer goodsImgId) {
        this.goodsImgId = goodsImgId;
    }

    /**
     * SKU图片链接
     * @return goods_img_url SKU图片链接
     */
    public String getGoodsImgUrl() {
        return goodsImgUrl;
    }

    /**
     * SKU图片链接
     * @param goodsImgUrl SKU图片链接
     */
    public void setGoodsImgUrl(String goodsImgUrl) {
        this.goodsImgUrl = goodsImgUrl == null ? null : goodsImgUrl.trim();
    }

    /**
     * 备货数量
     * @return stock_quantity 备货数量
     */
    public Integer getStockQuantity() {
        return stockQuantity;
    }

    /**
     * 备货数量
     * @param stockQuantity 备货数量
     */
    public void setStockQuantity(Integer stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    /**
     * 缺货数量
     * @return outofstock_quantity 缺货数量
     */
    public Integer getOutofstockQuantity() {
        return outofstockQuantity;
    }

    /**
     * 缺货数量
     * @param outofstockQuantity 缺货数量
     */
    public void setOutofstockQuantity(Integer outofstockQuantity) {
        this.outofstockQuantity = outofstockQuantity;
    }

    /**
     * 生产链接
     * @return product_link 生产链接
     */
    public String getProductLink() {
        return productLink;
    }

    /**
     * 生产链接
     * @param productLink 生产链接
     */
    public void setProductLink(String productLink) {
        this.productLink = productLink == null ? null : productLink.trim();
    }

    /**
     * 生产单价
     * @return cost_price 生产单价
     */
    public BigDecimal getCostPrice() {
        return costPrice;
    }

    /**
     * 生产单价
     * @param costPrice 生产单价
     */
    public void setCostPrice(BigDecimal costPrice) {
        this.costPrice = costPrice;
    }

    /**
     * 生产备注
     * @return product_comments 生产备注
     */
    public String getProductComments() {
        return productComments;
    }

    /**
     * 生产备注
     * @param productComments 生产备注
     */
    public void setProductComments(String productComments) {
        this.productComments = productComments == null ? null : productComments.trim();
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
        ProductPlanDetail other = (ProductPlanDetail) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getProductPlanMainId() == null ? other.getProductPlanMainId() == null : this.getProductPlanMainId().equals(other.getProductPlanMainId()))
            && (this.getProductPlanCode() == null ? other.getProductPlanCode() == null : this.getProductPlanCode().equals(other.getProductPlanCode()))
            && (this.getProductPlanDetailCode() == null ? other.getProductPlanDetailCode() == null : this.getProductPlanDetailCode().equals(other.getProductPlanDetailCode()))
            && (this.getProductOrderCode() == null ? other.getProductOrderCode() == null : this.getProductOrderCode().equals(other.getProductOrderCode()))
            && (this.getProductStatus() == null ? other.getProductStatus() == null : this.getProductStatus().equals(other.getProductStatus()))
            && (this.getGoodsId() == null ? other.getGoodsId() == null : this.getGoodsId().equals(other.getGoodsId()))
            && (this.getGoodsCode() == null ? other.getGoodsCode() == null : this.getGoodsCode().equals(other.getGoodsCode()))
            && (this.getGoodsName() == null ? other.getGoodsName() == null : this.getGoodsName().equals(other.getGoodsName()))
            && (this.getSkuId() == null ? other.getSkuId() == null : this.getSkuId().equals(other.getSkuId()))
            && (this.getSkuCode() == null ? other.getSkuCode() == null : this.getSkuCode().equals(other.getSkuCode()))
            && (this.getSkuName() == null ? other.getSkuName() == null : this.getSkuName().equals(other.getSkuName()))
            && (this.getColorId() == null ? other.getColorId() == null : this.getColorId().equals(other.getColorId()))
            && (this.getColorCode() == null ? other.getColorCode() == null : this.getColorCode().equals(other.getColorCode()))
            && (this.getColorName() == null ? other.getColorName() == null : this.getColorName().equals(other.getColorName()))
            && (this.getSizeId() == null ? other.getSizeId() == null : this.getSizeId().equals(other.getSizeId()))
            && (this.getSizeCode() == null ? other.getSizeCode() == null : this.getSizeCode().equals(other.getSizeCode()))
            && (this.getSizeName() == null ? other.getSizeName() == null : this.getSizeName().equals(other.getSizeName()))
            && (this.getMainImgUrl() == null ? other.getMainImgUrl() == null : this.getMainImgUrl().equals(other.getMainImgUrl()))
            && (this.getGoodsImgId() == null ? other.getGoodsImgId() == null : this.getGoodsImgId().equals(other.getGoodsImgId()))
            && (this.getGoodsImgUrl() == null ? other.getGoodsImgUrl() == null : this.getGoodsImgUrl().equals(other.getGoodsImgUrl()))
            && (this.getStockQuantity() == null ? other.getStockQuantity() == null : this.getStockQuantity().equals(other.getStockQuantity()))
            && (this.getOutofstockQuantity() == null ? other.getOutofstockQuantity() == null : this.getOutofstockQuantity().equals(other.getOutofstockQuantity()))
            && (this.getProductLink() == null ? other.getProductLink() == null : this.getProductLink().equals(other.getProductLink()))
            && (this.getCostPrice() == null ? other.getCostPrice() == null : this.getCostPrice().equals(other.getCostPrice()))
            && (this.getProductComments() == null ? other.getProductComments() == null : this.getProductComments().equals(other.getProductComments()))
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
        result = prime * result + ((getProductPlanMainId() == null) ? 0 : getProductPlanMainId().hashCode());
        result = prime * result + ((getProductPlanCode() == null) ? 0 : getProductPlanCode().hashCode());
        result = prime * result + ((getProductPlanDetailCode() == null) ? 0 : getProductPlanDetailCode().hashCode());
        result = prime * result + ((getProductOrderCode() == null) ? 0 : getProductOrderCode().hashCode());
        result = prime * result + ((getProductStatus() == null) ? 0 : getProductStatus().hashCode());
        result = prime * result + ((getGoodsId() == null) ? 0 : getGoodsId().hashCode());
        result = prime * result + ((getGoodsCode() == null) ? 0 : getGoodsCode().hashCode());
        result = prime * result + ((getGoodsName() == null) ? 0 : getGoodsName().hashCode());
        result = prime * result + ((getSkuId() == null) ? 0 : getSkuId().hashCode());
        result = prime * result + ((getSkuCode() == null) ? 0 : getSkuCode().hashCode());
        result = prime * result + ((getSkuName() == null) ? 0 : getSkuName().hashCode());
        result = prime * result + ((getColorId() == null) ? 0 : getColorId().hashCode());
        result = prime * result + ((getColorCode() == null) ? 0 : getColorCode().hashCode());
        result = prime * result + ((getColorName() == null) ? 0 : getColorName().hashCode());
        result = prime * result + ((getSizeId() == null) ? 0 : getSizeId().hashCode());
        result = prime * result + ((getSizeCode() == null) ? 0 : getSizeCode().hashCode());
        result = prime * result + ((getSizeName() == null) ? 0 : getSizeName().hashCode());
        result = prime * result + ((getMainImgUrl() == null) ? 0 : getMainImgUrl().hashCode());
        result = prime * result + ((getGoodsImgId() == null) ? 0 : getGoodsImgId().hashCode());
        result = prime * result + ((getGoodsImgUrl() == null) ? 0 : getGoodsImgUrl().hashCode());
        result = prime * result + ((getStockQuantity() == null) ? 0 : getStockQuantity().hashCode());
        result = prime * result + ((getOutofstockQuantity() == null) ? 0 : getOutofstockQuantity().hashCode());
        result = prime * result + ((getProductLink() == null) ? 0 : getProductLink().hashCode());
        result = prime * result + ((getCostPrice() == null) ? 0 : getCostPrice().hashCode());
        result = prime * result + ((getProductComments() == null) ? 0 : getProductComments().hashCode());
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
        sb.append(", productPlanMainId=").append(productPlanMainId);
        sb.append(", productPlanCode=").append(productPlanCode);
        sb.append(", productPlanDetailCode=").append(productPlanDetailCode);
        sb.append(", productOrderCode=").append(productOrderCode);
        sb.append(", productStatus=").append(productStatus);
        sb.append(", goodsId=").append(goodsId);
        sb.append(", goodsCode=").append(goodsCode);
        sb.append(", goodsName=").append(goodsName);
        sb.append(", skuId=").append(skuId);
        sb.append(", skuCode=").append(skuCode);
        sb.append(", skuName=").append(skuName);
        sb.append(", colorId=").append(colorId);
        sb.append(", colorCode=").append(colorCode);
        sb.append(", colorName=").append(colorName);
        sb.append(", sizeId=").append(sizeId);
        sb.append(", sizeCode=").append(sizeCode);
        sb.append(", sizeName=").append(sizeName);
        sb.append(", mainImgUrl=").append(mainImgUrl);
        sb.append(", goodsImgId=").append(goodsImgId);
        sb.append(", goodsImgUrl=").append(goodsImgUrl);
        sb.append(", stockQuantity=").append(stockQuantity);
        sb.append(", outofstockQuantity=").append(outofstockQuantity);
        sb.append(", productLink=").append(productLink);
        sb.append(", costPrice=").append(costPrice);
        sb.append(", productComments=").append(productComments);
        sb.append(", creator=").append(creator);
        sb.append(", createTime=").append(createTime);
        sb.append(", modifier=").append(modifier);
        sb.append(", modifyTime=").append(modifyTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}