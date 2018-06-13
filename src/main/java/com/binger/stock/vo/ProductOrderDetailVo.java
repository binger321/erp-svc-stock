package com.binger.stock.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: zhuyubin
 * Date: 2018/5/24
 * Time: 上午10:48
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@ApiModel("生产订单子表")
@Data
public class ProductOrderDetailVo {
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

}
