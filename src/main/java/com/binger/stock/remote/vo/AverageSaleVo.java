package com.binger.stock.remote.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
 * Created with IntelliJ IDEA.
 * User: yb
 * Date: 2018/6/13
 * Time: 10:57
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@ApiModel("平均销量")
@Data
public class AverageSaleVo {

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
     * 七天平均销量
     */
    private BigDecimal sevenDaysSale;

    /**
     * 三天平均销量
     */
    private BigDecimal threeDaysSale;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AverageSaleVo)) return false;
        if (!super.equals(o)) return false;

        AverageSaleVo that = (AverageSaleVo) o;

        if (skuId != null ? !skuId.equals(that.skuId) : that.skuId != null) return false;
        if (goodsId != null ? !goodsId.equals(that.goodsId) : that.goodsId != null) return false;
        if (colorId != null ? !colorId.equals(that.colorId) : that.colorId != null) return false;
        if (sizeId != null ? !sizeId.equals(that.sizeId) : that.sizeId != null) return false;
        if (sevenDaysSale != null ? !sevenDaysSale.equals(that.sevenDaysSale) : that.sevenDaysSale != null)
            return false;
        return threeDaysSale != null ? threeDaysSale.equals(that.threeDaysSale) : that.threeDaysSale == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (skuId != null ? skuId.hashCode() : 0);
        result = 31 * result + (goodsId != null ? goodsId.hashCode() : 0);
        result = 31 * result + (colorId != null ? colorId.hashCode() : 0);
        result = 31 * result + (sizeId != null ? sizeId.hashCode() : 0);
        result = 31 * result + (sevenDaysSale != null ? sevenDaysSale.hashCode() : 0);
        result = 31 * result + (threeDaysSale != null ? threeDaysSale.hashCode() : 0);
        return result;
    }
}