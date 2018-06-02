package com.binger.stock.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 子生产计划表
 */
@Data
@ApiModel(value="子生产计划表")
public class ProductPlanDetailVo implements Serializable {
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
     * 生产订单编号（用于回写生产下达状态）
     */
    @ApiModelProperty(value="生产订单编号（用于回写生产下达状态）",required = false)
    private String productOrderCode;

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
}