package com.binger.stock.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 入库表子表
 */
@ApiModel(value="入库表子表")
public class StockInBillDetail implements Serializable {
    /**
     * 入库表子表ID
     */
    @ApiModelProperty(value="入库表子表ID",required = true)
    private Integer id;

    /**
     * 入库单详情编号
     */
    @ApiModelProperty(value="入库单详情编号",required = false)
    private String stockInBillDetailCode;

    /**
     * 入库code
     */
    @ApiModelProperty(value="入库code",required = false)
    private String stockInBillMainCode;

    /**
     * sku
     */
    @ApiModelProperty(value="sku",required = false)
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
     * 货号id
     */
    @ApiModelProperty(value="货号id",required = false)
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
     * 单位
     */
    @ApiModelProperty(value="单位",required = false)
    private String unit;

    /**
     * 重量
     */
    @ApiModelProperty(value="重量",required = false)
    private BigDecimal weight;

    /**
     * 生产数量
     */
    @ApiModelProperty(value="生产数量",required = false)
    private Integer quantity;

    /**
     * 入库数量
     */
    @ApiModelProperty(value="入库数量",required = false)
    private Integer inQuantity;

    /**
     * 退回数
     */
    @ApiModelProperty(value="退回数",required = false)
    private Integer returnQuantity;

    /**
     * 次品数
     */
    @ApiModelProperty(value="次品数",required = false)
    private Integer inferiorQuantity;

    /**
     * 单价
     */
    @ApiModelProperty(value="单价",required = false)
    private BigDecimal price;

    /**
     * 总价
     */
    @ApiModelProperty(value="总价",required = false)
    private BigDecimal totalPrice;

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
     * stock_in_bill_detail
     */
    private static final long serialVersionUID = 1L;

    /**
     * 入库表子表ID
     * @return id 入库表子表ID
     */
    public Integer getId() {
        return id;
    }

    /**
     * 入库表子表ID
     * @param id 入库表子表ID
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 入库单详情编号
     * @return stock_in_bill_detail_code 入库单详情编号
     */
    public String getStockInBillDetailCode() {
        return stockInBillDetailCode;
    }

    /**
     * 入库单详情编号
     * @param stockInBillDetailCode 入库单详情编号
     */
    public void setStockInBillDetailCode(String stockInBillDetailCode) {
        this.stockInBillDetailCode = stockInBillDetailCode == null ? null : stockInBillDetailCode.trim();
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
     * sku
     * @return sku_id sku
     */
    public Integer getSkuId() {
        return skuId;
    }

    /**
     * sku
     * @param skuId sku
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
     * 货号id
     * @return goods_id 货号id
     */
    public Integer getGoodsId() {
        return goodsId;
    }

    /**
     * 货号id
     * @param goodsId 货号id
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
     * 入库数量
     * @return in_quantity 入库数量
     */
    public Integer getInQuantity() {
        return inQuantity;
    }

    /**
     * 入库数量
     * @param inQuantity 入库数量
     */
    public void setInQuantity(Integer inQuantity) {
        this.inQuantity = inQuantity;
    }

    /**
     * 退回数
     * @return return_quantity 退回数
     */
    public Integer getReturnQuantity() {
        return returnQuantity;
    }

    /**
     * 退回数
     * @param returnQuantity 退回数
     */
    public void setReturnQuantity(Integer returnQuantity) {
        this.returnQuantity = returnQuantity;
    }

    /**
     * 次品数
     * @return inferior_quantity 次品数
     */
    public Integer getInferiorQuantity() {
        return inferiorQuantity;
    }

    /**
     * 次品数
     * @param inferiorQuantity 次品数
     */
    public void setInferiorQuantity(Integer inferiorQuantity) {
        this.inferiorQuantity = inferiorQuantity;
    }

    /**
     * 单价
     * @return price 单价
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * 单价
     * @param price 单价
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * 总价
     * @return total_price 总价
     */
    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    /**
     * 总价
     * @param totalPrice 总价
     */
    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
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
        StockInBillDetail other = (StockInBillDetail) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getStockInBillDetailCode() == null ? other.getStockInBillDetailCode() == null : this.getStockInBillDetailCode().equals(other.getStockInBillDetailCode()))
            && (this.getStockInBillMainCode() == null ? other.getStockInBillMainCode() == null : this.getStockInBillMainCode().equals(other.getStockInBillMainCode()))
            && (this.getSkuId() == null ? other.getSkuId() == null : this.getSkuId().equals(other.getSkuId()))
            && (this.getSkuCode() == null ? other.getSkuCode() == null : this.getSkuCode().equals(other.getSkuCode()))
            && (this.getSkuName() == null ? other.getSkuName() == null : this.getSkuName().equals(other.getSkuName()))
            && (this.getGoodsId() == null ? other.getGoodsId() == null : this.getGoodsId().equals(other.getGoodsId()))
            && (this.getGoodsCode() == null ? other.getGoodsCode() == null : this.getGoodsCode().equals(other.getGoodsCode()))
            && (this.getGoodsName() == null ? other.getGoodsName() == null : this.getGoodsName().equals(other.getGoodsName()))
            && (this.getColorId() == null ? other.getColorId() == null : this.getColorId().equals(other.getColorId()))
            && (this.getColorCode() == null ? other.getColorCode() == null : this.getColorCode().equals(other.getColorCode()))
            && (this.getColorName() == null ? other.getColorName() == null : this.getColorName().equals(other.getColorName()))
            && (this.getSizeId() == null ? other.getSizeId() == null : this.getSizeId().equals(other.getSizeId()))
            && (this.getSizeCode() == null ? other.getSizeCode() == null : this.getSizeCode().equals(other.getSizeCode()))
            && (this.getSizeName() == null ? other.getSizeName() == null : this.getSizeName().equals(other.getSizeName()))
            && (this.getUnit() == null ? other.getUnit() == null : this.getUnit().equals(other.getUnit()))
            && (this.getWeight() == null ? other.getWeight() == null : this.getWeight().equals(other.getWeight()))
            && (this.getQuantity() == null ? other.getQuantity() == null : this.getQuantity().equals(other.getQuantity()))
            && (this.getInQuantity() == null ? other.getInQuantity() == null : this.getInQuantity().equals(other.getInQuantity()))
            && (this.getReturnQuantity() == null ? other.getReturnQuantity() == null : this.getReturnQuantity().equals(other.getReturnQuantity()))
            && (this.getInferiorQuantity() == null ? other.getInferiorQuantity() == null : this.getInferiorQuantity().equals(other.getInferiorQuantity()))
            && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()))
            && (this.getTotalPrice() == null ? other.getTotalPrice() == null : this.getTotalPrice().equals(other.getTotalPrice()))
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
        result = prime * result + ((getStockInBillDetailCode() == null) ? 0 : getStockInBillDetailCode().hashCode());
        result = prime * result + ((getStockInBillMainCode() == null) ? 0 : getStockInBillMainCode().hashCode());
        result = prime * result + ((getSkuId() == null) ? 0 : getSkuId().hashCode());
        result = prime * result + ((getSkuCode() == null) ? 0 : getSkuCode().hashCode());
        result = prime * result + ((getSkuName() == null) ? 0 : getSkuName().hashCode());
        result = prime * result + ((getGoodsId() == null) ? 0 : getGoodsId().hashCode());
        result = prime * result + ((getGoodsCode() == null) ? 0 : getGoodsCode().hashCode());
        result = prime * result + ((getGoodsName() == null) ? 0 : getGoodsName().hashCode());
        result = prime * result + ((getColorId() == null) ? 0 : getColorId().hashCode());
        result = prime * result + ((getColorCode() == null) ? 0 : getColorCode().hashCode());
        result = prime * result + ((getColorName() == null) ? 0 : getColorName().hashCode());
        result = prime * result + ((getSizeId() == null) ? 0 : getSizeId().hashCode());
        result = prime * result + ((getSizeCode() == null) ? 0 : getSizeCode().hashCode());
        result = prime * result + ((getSizeName() == null) ? 0 : getSizeName().hashCode());
        result = prime * result + ((getUnit() == null) ? 0 : getUnit().hashCode());
        result = prime * result + ((getWeight() == null) ? 0 : getWeight().hashCode());
        result = prime * result + ((getQuantity() == null) ? 0 : getQuantity().hashCode());
        result = prime * result + ((getInQuantity() == null) ? 0 : getInQuantity().hashCode());
        result = prime * result + ((getReturnQuantity() == null) ? 0 : getReturnQuantity().hashCode());
        result = prime * result + ((getInferiorQuantity() == null) ? 0 : getInferiorQuantity().hashCode());
        result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
        result = prime * result + ((getTotalPrice() == null) ? 0 : getTotalPrice().hashCode());
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
        sb.append(", stockInBillDetailCode=").append(stockInBillDetailCode);
        sb.append(", stockInBillMainCode=").append(stockInBillMainCode);
        sb.append(", skuId=").append(skuId);
        sb.append(", skuCode=").append(skuCode);
        sb.append(", skuName=").append(skuName);
        sb.append(", goodsId=").append(goodsId);
        sb.append(", goodsCode=").append(goodsCode);
        sb.append(", goodsName=").append(goodsName);
        sb.append(", colorId=").append(colorId);
        sb.append(", colorCode=").append(colorCode);
        sb.append(", colorName=").append(colorName);
        sb.append(", sizeId=").append(sizeId);
        sb.append(", sizeCode=").append(sizeCode);
        sb.append(", sizeName=").append(sizeName);
        sb.append(", unit=").append(unit);
        sb.append(", weight=").append(weight);
        sb.append(", quantity=").append(quantity);
        sb.append(", inQuantity=").append(inQuantity);
        sb.append(", returnQuantity=").append(returnQuantity);
        sb.append(", inferiorQuantity=").append(inferiorQuantity);
        sb.append(", price=").append(price);
        sb.append(", totalPrice=").append(totalPrice);
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