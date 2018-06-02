package com.binger.stock.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 生产订单详情
 */
@ApiModel(value="生产订单详情")
public class ProductOrderDetail implements Serializable {
    /**
     * 生产订单详情ID
     */
    @ApiModelProperty(value="生产订单详情ID",required = true)
    private Integer id;

    /**
     * 
     */
    @ApiModelProperty(value="",required = true)
    private Integer productOrderMainId;

    /**
     * 生产订单编号
     */
    @ApiModelProperty(value="生产订单编号",required = true)
    private String productOrderMainCode;

    /**
     * 商品货号ID
     */
    @ApiModelProperty(value="商品货号ID",required = true)
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
     * 单位
     */
    @ApiModelProperty(value="单位",required = false)
    private String unit;

    /**
     * 商品主图
     */
    @ApiModelProperty(value="商品主图",required = false)
    private String mainImgUrl;

    /**
     * SKU图片ID
     */
    @ApiModelProperty(value="SKU图片ID",required = false)
    private Integer goodsImgId;

    /**
     * SKU图片链接,商品图片取这个更合适
     */
    @ApiModelProperty(value="SKU图片链接,商品图片取这个更合适",required = false)
    private String goodsImgUrl;

    /**
     * skuid
     */
    @ApiModelProperty(value="skuid",required = true)
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
     * 重量
     */
    @ApiModelProperty(value="重量",required = false)
    private BigDecimal weight;

    /**
     * 上一期生产价格,读取最近一个生产单的价格
     */
    @ApiModelProperty(value="上一期生产价格,读取最近一个生产单的价格",required = false)
    private BigDecimal lastPrice;

    /**
     * 本币单价
     */
    @ApiModelProperty(value="本币单价",required = false)
    private BigDecimal localPrice;

    /**
     * 本币金额
     */
    @ApiModelProperty(value="本币金额",required = false)
    private BigDecimal localAmount;

    /**
     * 是否生成入库单
     */
    @ApiModelProperty(value="是否生成入库单",required = false)
    private Boolean isStorage;

    /**
     * 入库数量
     */
    @ApiModelProperty(value="入库数量",required = false)
    private Integer wareQuantity;

    /**
     * 未入库数量
     */
    @ApiModelProperty(value="未入库数量",required = false)
    private Integer unwareQuantity;

    /**
     * 退货数量
     */
    @ApiModelProperty(value="退货数量",required = false)
    private Integer returnQuantity;

    /**
     * 次品数量
     */
    @ApiModelProperty(value="次品数量",required = false)
    private Integer defectiveQuantity;

    /**
     * 总数量（申请数量）
     */
    @ApiModelProperty(value="总数量（申请数量）",required = false)
    private Integer totalQuantity;

    /**
     * 生产子单备注
     */
    @ApiModelProperty(value="生产子单备注",required = false)
    private String comments;

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
     * product_order_detail
     */
    private static final long serialVersionUID = 1L;

    /**
     * 生产订单详情ID
     * @return id 生产订单详情ID
     */
    public Integer getId() {
        return id;
    }

    /**
     * 生产订单详情ID
     * @param id 生产订单详情ID
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 
     * @return product_order_main_id 
     */
    public Integer getProductOrderMainId() {
        return productOrderMainId;
    }

    /**
     * 
     * @param productOrderMainId 
     */
    public void setProductOrderMainId(Integer productOrderMainId) {
        this.productOrderMainId = productOrderMainId;
    }

    /**
     * 生产订单编号
     * @return product_order_main_code 生产订单编号
     */
    public String getProductOrderMainCode() {
        return productOrderMainCode;
    }

    /**
     * 生产订单编号
     * @param productOrderMainCode 生产订单编号
     */
    public void setProductOrderMainCode(String productOrderMainCode) {
        this.productOrderMainCode = productOrderMainCode == null ? null : productOrderMainCode.trim();
    }

    /**
     * 商品货号ID
     * @return goods_id 商品货号ID
     */
    public Integer getGoodsId() {
        return goodsId;
    }

    /**
     * 商品货号ID
     * @param goodsId 商品货号ID
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
     * 单位
     * @return unit 单位
     */
    public String getUnit() {
        return unit;
    }

    /**
     * 单位
     * @param unit 单位
     */
    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    /**
     * 商品主图
     * @return main_img_url 商品主图
     */
    public String getMainImgUrl() {
        return mainImgUrl;
    }

    /**
     * 商品主图
     * @param mainImgUrl 商品主图
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
     * SKU图片链接,商品图片取这个更合适
     * @return goods_img_url SKU图片链接,商品图片取这个更合适
     */
    public String getGoodsImgUrl() {
        return goodsImgUrl;
    }

    /**
     * SKU图片链接,商品图片取这个更合适
     * @param goodsImgUrl SKU图片链接,商品图片取这个更合适
     */
    public void setGoodsImgUrl(String goodsImgUrl) {
        this.goodsImgUrl = goodsImgUrl == null ? null : goodsImgUrl.trim();
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
     * 上一期生产价格,读取最近一个生产单的价格
     * @return last_price 上一期生产价格,读取最近一个生产单的价格
     */
    public BigDecimal getLastPrice() {
        return lastPrice;
    }

    /**
     * 上一期生产价格,读取最近一个生产单的价格
     * @param lastPrice 上一期生产价格,读取最近一个生产单的价格
     */
    public void setLastPrice(BigDecimal lastPrice) {
        this.lastPrice = lastPrice;
    }

    /**
     * 本币单价
     * @return local_price 本币单价
     */
    public BigDecimal getLocalPrice() {
        return localPrice;
    }

    /**
     * 本币单价
     * @param localPrice 本币单价
     */
    public void setLocalPrice(BigDecimal localPrice) {
        this.localPrice = localPrice;
    }

    /**
     * 本币金额
     * @return local_amount 本币金额
     */
    public BigDecimal getLocalAmount() {
        return localAmount;
    }

    /**
     * 本币金额
     * @param localAmount 本币金额
     */
    public void setLocalAmount(BigDecimal localAmount) {
        this.localAmount = localAmount;
    }

    /**
     * 是否生成入库单
     * @return is_storage 是否生成入库单
     */
    public Boolean getIsStorage() {
        return isStorage;
    }

    /**
     * 是否生成入库单
     * @param isStorage 是否生成入库单
     */
    public void setIsStorage(Boolean isStorage) {
        this.isStorage = isStorage;
    }

    /**
     * 入库数量
     * @return ware_quantity 入库数量
     */
    public Integer getWareQuantity() {
        return wareQuantity;
    }

    /**
     * 入库数量
     * @param wareQuantity 入库数量
     */
    public void setWareQuantity(Integer wareQuantity) {
        this.wareQuantity = wareQuantity;
    }

    /**
     * 未入库数量
     * @return unware_quantity 未入库数量
     */
    public Integer getUnwareQuantity() {
        return unwareQuantity;
    }

    /**
     * 未入库数量
     * @param unwareQuantity 未入库数量
     */
    public void setUnwareQuantity(Integer unwareQuantity) {
        this.unwareQuantity = unwareQuantity;
    }

    /**
     * 退货数量
     * @return return_quantity 退货数量
     */
    public Integer getReturnQuantity() {
        return returnQuantity;
    }

    /**
     * 退货数量
     * @param returnQuantity 退货数量
     */
    public void setReturnQuantity(Integer returnQuantity) {
        this.returnQuantity = returnQuantity;
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
     * 总数量（申请数量）
     * @return total_quantity 总数量（申请数量）
     */
    public Integer getTotalQuantity() {
        return totalQuantity;
    }

    /**
     * 总数量（申请数量）
     * @param totalQuantity 总数量（申请数量）
     */
    public void setTotalQuantity(Integer totalQuantity) {
        this.totalQuantity = totalQuantity;
    }

    /**
     * 生产子单备注
     * @return comments 生产子单备注
     */
    public String getComments() {
        return comments;
    }

    /**
     * 生产子单备注
     * @param comments 生产子单备注
     */
    public void setComments(String comments) {
        this.comments = comments == null ? null : comments.trim();
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
        ProductOrderDetail other = (ProductOrderDetail) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getProductOrderMainId() == null ? other.getProductOrderMainId() == null : this.getProductOrderMainId().equals(other.getProductOrderMainId()))
            && (this.getProductOrderMainCode() == null ? other.getProductOrderMainCode() == null : this.getProductOrderMainCode().equals(other.getProductOrderMainCode()))
            && (this.getGoodsId() == null ? other.getGoodsId() == null : this.getGoodsId().equals(other.getGoodsId()))
            && (this.getGoodsCode() == null ? other.getGoodsCode() == null : this.getGoodsCode().equals(other.getGoodsCode()))
            && (this.getGoodsName() == null ? other.getGoodsName() == null : this.getGoodsName().equals(other.getGoodsName()))
            && (this.getUnit() == null ? other.getUnit() == null : this.getUnit().equals(other.getUnit()))
            && (this.getMainImgUrl() == null ? other.getMainImgUrl() == null : this.getMainImgUrl().equals(other.getMainImgUrl()))
            && (this.getGoodsImgId() == null ? other.getGoodsImgId() == null : this.getGoodsImgId().equals(other.getGoodsImgId()))
            && (this.getGoodsImgUrl() == null ? other.getGoodsImgUrl() == null : this.getGoodsImgUrl().equals(other.getGoodsImgUrl()))
            && (this.getSkuId() == null ? other.getSkuId() == null : this.getSkuId().equals(other.getSkuId()))
            && (this.getSkuCode() == null ? other.getSkuCode() == null : this.getSkuCode().equals(other.getSkuCode()))
            && (this.getSkuName() == null ? other.getSkuName() == null : this.getSkuName().equals(other.getSkuName()))
            && (this.getColorId() == null ? other.getColorId() == null : this.getColorId().equals(other.getColorId()))
            && (this.getColorCode() == null ? other.getColorCode() == null : this.getColorCode().equals(other.getColorCode()))
            && (this.getColorName() == null ? other.getColorName() == null : this.getColorName().equals(other.getColorName()))
            && (this.getSizeId() == null ? other.getSizeId() == null : this.getSizeId().equals(other.getSizeId()))
            && (this.getSizeCode() == null ? other.getSizeCode() == null : this.getSizeCode().equals(other.getSizeCode()))
            && (this.getSizeName() == null ? other.getSizeName() == null : this.getSizeName().equals(other.getSizeName()))
            && (this.getWeight() == null ? other.getWeight() == null : this.getWeight().equals(other.getWeight()))
            && (this.getLastPrice() == null ? other.getLastPrice() == null : this.getLastPrice().equals(other.getLastPrice()))
            && (this.getLocalPrice() == null ? other.getLocalPrice() == null : this.getLocalPrice().equals(other.getLocalPrice()))
            && (this.getLocalAmount() == null ? other.getLocalAmount() == null : this.getLocalAmount().equals(other.getLocalAmount()))
            && (this.getIsStorage() == null ? other.getIsStorage() == null : this.getIsStorage().equals(other.getIsStorage()))
            && (this.getWareQuantity() == null ? other.getWareQuantity() == null : this.getWareQuantity().equals(other.getWareQuantity()))
            && (this.getUnwareQuantity() == null ? other.getUnwareQuantity() == null : this.getUnwareQuantity().equals(other.getUnwareQuantity()))
            && (this.getReturnQuantity() == null ? other.getReturnQuantity() == null : this.getReturnQuantity().equals(other.getReturnQuantity()))
            && (this.getDefectiveQuantity() == null ? other.getDefectiveQuantity() == null : this.getDefectiveQuantity().equals(other.getDefectiveQuantity()))
            && (this.getTotalQuantity() == null ? other.getTotalQuantity() == null : this.getTotalQuantity().equals(other.getTotalQuantity()))
            && (this.getComments() == null ? other.getComments() == null : this.getComments().equals(other.getComments()))
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
        result = prime * result + ((getProductOrderMainId() == null) ? 0 : getProductOrderMainId().hashCode());
        result = prime * result + ((getProductOrderMainCode() == null) ? 0 : getProductOrderMainCode().hashCode());
        result = prime * result + ((getGoodsId() == null) ? 0 : getGoodsId().hashCode());
        result = prime * result + ((getGoodsCode() == null) ? 0 : getGoodsCode().hashCode());
        result = prime * result + ((getGoodsName() == null) ? 0 : getGoodsName().hashCode());
        result = prime * result + ((getUnit() == null) ? 0 : getUnit().hashCode());
        result = prime * result + ((getMainImgUrl() == null) ? 0 : getMainImgUrl().hashCode());
        result = prime * result + ((getGoodsImgId() == null) ? 0 : getGoodsImgId().hashCode());
        result = prime * result + ((getGoodsImgUrl() == null) ? 0 : getGoodsImgUrl().hashCode());
        result = prime * result + ((getSkuId() == null) ? 0 : getSkuId().hashCode());
        result = prime * result + ((getSkuCode() == null) ? 0 : getSkuCode().hashCode());
        result = prime * result + ((getSkuName() == null) ? 0 : getSkuName().hashCode());
        result = prime * result + ((getColorId() == null) ? 0 : getColorId().hashCode());
        result = prime * result + ((getColorCode() == null) ? 0 : getColorCode().hashCode());
        result = prime * result + ((getColorName() == null) ? 0 : getColorName().hashCode());
        result = prime * result + ((getSizeId() == null) ? 0 : getSizeId().hashCode());
        result = prime * result + ((getSizeCode() == null) ? 0 : getSizeCode().hashCode());
        result = prime * result + ((getSizeName() == null) ? 0 : getSizeName().hashCode());
        result = prime * result + ((getWeight() == null) ? 0 : getWeight().hashCode());
        result = prime * result + ((getLastPrice() == null) ? 0 : getLastPrice().hashCode());
        result = prime * result + ((getLocalPrice() == null) ? 0 : getLocalPrice().hashCode());
        result = prime * result + ((getLocalAmount() == null) ? 0 : getLocalAmount().hashCode());
        result = prime * result + ((getIsStorage() == null) ? 0 : getIsStorage().hashCode());
        result = prime * result + ((getWareQuantity() == null) ? 0 : getWareQuantity().hashCode());
        result = prime * result + ((getUnwareQuantity() == null) ? 0 : getUnwareQuantity().hashCode());
        result = prime * result + ((getReturnQuantity() == null) ? 0 : getReturnQuantity().hashCode());
        result = prime * result + ((getDefectiveQuantity() == null) ? 0 : getDefectiveQuantity().hashCode());
        result = prime * result + ((getTotalQuantity() == null) ? 0 : getTotalQuantity().hashCode());
        result = prime * result + ((getComments() == null) ? 0 : getComments().hashCode());
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
        sb.append(", productOrderMainId=").append(productOrderMainId);
        sb.append(", productOrderMainCode=").append(productOrderMainCode);
        sb.append(", goodsId=").append(goodsId);
        sb.append(", goodsCode=").append(goodsCode);
        sb.append(", goodsName=").append(goodsName);
        sb.append(", unit=").append(unit);
        sb.append(", mainImgUrl=").append(mainImgUrl);
        sb.append(", goodsImgId=").append(goodsImgId);
        sb.append(", goodsImgUrl=").append(goodsImgUrl);
        sb.append(", skuId=").append(skuId);
        sb.append(", skuCode=").append(skuCode);
        sb.append(", skuName=").append(skuName);
        sb.append(", colorId=").append(colorId);
        sb.append(", colorCode=").append(colorCode);
        sb.append(", colorName=").append(colorName);
        sb.append(", sizeId=").append(sizeId);
        sb.append(", sizeCode=").append(sizeCode);
        sb.append(", sizeName=").append(sizeName);
        sb.append(", weight=").append(weight);
        sb.append(", lastPrice=").append(lastPrice);
        sb.append(", localPrice=").append(localPrice);
        sb.append(", localAmount=").append(localAmount);
        sb.append(", isStorage=").append(isStorage);
        sb.append(", wareQuantity=").append(wareQuantity);
        sb.append(", unwareQuantity=").append(unwareQuantity);
        sb.append(", returnQuantity=").append(returnQuantity);
        sb.append(", defectiveQuantity=").append(defectiveQuantity);
        sb.append(", totalQuantity=").append(totalQuantity);
        sb.append(", comments=").append(comments);
        sb.append(", creator=").append(creator);
        sb.append(", createTime=").append(createTime);
        sb.append(", modifier=").append(modifier);
        sb.append(", modifyTime=").append(modifyTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}