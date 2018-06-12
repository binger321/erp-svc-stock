package com.binger.stock.controller.form;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
 * Created with IntelliJ IDEA.
 * User: zhuyubin
 * Date: 2018/5/25
 * Time: 下午5:24
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Data
@ApiModel(value = "出库表主表Form")
public class StockOutBillMainForm {
    /**
     *
     */
    @ApiModelProperty(value="",required = true)
    private Integer id;

    /**
     * 单据编号
     */
    @ApiModelProperty(value="单据编号",required = true)
    private String stockOutBillMainCode;

    /**
     * 退货单号
     */
    @ApiModelProperty(value="退货单号",required = false)
    private String returnProductReturnCode;

    /**
     * 销售订单号
     */
    @ApiModelProperty(value="销售订单号",required = false)
    private String orderSaleCode;

    /**
     * 出库仓库
     */
    @ApiModelProperty(value="出库仓库",required = false)
    private Integer warehouseId;

    /**
     * '出库类型,100订单出库-发货出库 200其他出库-报废出库 300返修出库,默认残次品库出库 400调拨出库 500其他出库-改码'
     */
    @ApiModelProperty(value="'出库类型,100订单出库-发货出库 200其他出库-报废出库 300返修出库,默认残次品库出库 400调拨出库 500其他出库-改码'",required = false)
    private Integer billType;

    /**
     * 审核人名字
     */
    @ApiModelProperty(value="审核人名字",required = false)
    private String auditor;

    /**
     * 数量
     */
    @ApiModelProperty(value="数量",required = false)
    private Integer quantity;

    /**
     * 出库状态,100保存 200审核 900归档 9挂起
     */
    @ApiModelProperty(value="出库状态,100保存 200审核 900归档 9挂起",required = false)
    private Integer stockoutStatus;

    /**
     * 客户姓名,不一致不允许合并
     */
    @ApiModelProperty(value="客户姓名,不一致不允许合并",required = false)
    private String customerName;

    /**
     * 国家
     */
    @ApiModelProperty(value="国家",required = false)
    private String countryName;

    /**
     * 邮寄地址1
     */
    @ApiModelProperty(value="邮寄地址1",required = false)
    private String address1;

    /**
     * 延迟时间,订单过来的时候，当前时间减去下单时间
     */
    @ApiModelProperty(value="延迟时间,订单过来的时候，当前时间减去下单时间",required = false)
    private Integer delayDays;

    /**
     * 物流状态,430未揽收 500已揽收
     */
    @ApiModelProperty(value="物流状态,430未揽收 500已揽收",required = false)
    private Integer logistStatus;

    /**
     * 物流公司名称(暂时只应用于发货出库单、调拨出库单)
     */
    @ApiModelProperty(value="物流公司名称(暂时只应用于发货出库单、调拨出库单)",required = false)
    private String logistCompanyName;

    /**
     * 物流跟踪号
     */
    @ApiModelProperty(value="物流跟踪号",required = false)
    private String trackNumber;

    /**
     * 物流费用(只应用于发货出库单)
     */
    @ApiModelProperty(value="物流费用(只应用于发货出库单)",required = false)
    private BigDecimal logistMoney;

    /**
     * 出库总金额
     */
    @ApiModelProperty(value="出库总金额",required = false)
    private BigDecimal totalAmount;

    /**
     * 备注
     */
    @ApiModelProperty(value="备注",required = false)
    private String remark;

}
