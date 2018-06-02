package com.binger.stock.controller.form;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: zhuyubin
 * Date: 2018/5/25
 * Time: 下午5:24
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Data
@ApiModel("出库单详情表Form")
public class StockOutBillDetailForm {

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

}
