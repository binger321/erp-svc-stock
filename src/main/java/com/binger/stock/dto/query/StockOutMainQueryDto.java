package com.binger.stock.dto.query;

import com.binger.common.QueryDtoBase;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * Created with IntelliJ IDEA.
 * User: zhuyubin
 * Date: 2018/5/25
 * Time: 下午2:48
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@ApiModel(value = "出库单query")
@Data
public class StockOutMainQueryDto extends QueryDtoBase {

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
     * 物流公司名称(暂时只应用于发货出库单、调拨出库单)
     */
    @ApiModelProperty(value="物流公司名称(暂时只应用于发货出库单、调拨出库单)",required = false)
    private String logistCompanyName;

    /**
     * 物流跟踪号
     */
    @ApiModelProperty(value="物流跟踪号",required = false)
    private String trackNumber;

}
