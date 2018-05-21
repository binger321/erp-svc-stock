package com.binger.stock.controller.form;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: zhuyubin
 * Date: 2018/5/18
 * Time: 上午10:42
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@ApiModel("入库单详情")
@Data
public class StockInBillDetailForm {

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

}
