package com.binger.stock.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
 * Created with IntelliJ IDEA.
 * User: yb
 * Date: 2018/6/13
 * Time: 22:52
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Data
public class StockCurrentVo {
    /**
     * id
     */
    private Integer id;

    /**
     * ID
     */
    @ApiModelProperty(value="ID",required = true)
    private Integer warehouseId;


    /**
     * 仓库代码
     */
    @ApiModelProperty(value="仓库代码",required = true)
    private String warehouseCode;

    /**
     * 仓库名称
     */
    @ApiModelProperty(value="仓库名称",required = true)
    private String warehouseName;

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

}