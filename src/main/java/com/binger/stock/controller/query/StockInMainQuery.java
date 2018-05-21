package com.binger.stock.controller.query;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: zhuyubin
 * Date: 2018/5/17
 * Time: 下午5:00
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@ApiModel("入库单查询条件")
@Data
public class StockInMainQuery {

    /**
     * 入库ID
     */
    @ApiModelProperty(value="入库ID",required = true)
    private Integer id;

    /**
     * 入库code
     */
    @ApiModelProperty(value="入库code",required = false)
    private String stockInBillMainCode;

    /**
     * 生产单号,针对生产单有
     */
    @ApiModelProperty(value="生产单号,针对生产单有",required = false)
    private String productOrderCode;

    /**
     * 调拨出库单号,针对调拨出库才有
     */
    @ApiModelProperty(value="调拨出库单号,针对调拨出库才有",required = false)
    private String allocateOutCode;

    /**
     * 入库类型,100订单入库-生产入库, 300其他入库-盘盈 301 销售订单退货入库 400其他入库-捐赠 401 其他入库-其他 402 其他入库-样衣 500返修入库 600调拨入库 700残次品入库
     */
    @ApiModelProperty(value="入库类型,100订单入库-生产入库, 300其他入库-盘盈 301 销售订单退货入库 400其他入库-捐赠 401 其他入库-其他 402 其他入库-样衣 500返修入库 600调拨入库 700残次品入库",required = false)
    private Integer billType;

    /**
     * 入库日期
     */
    @ApiModelProperty(value="入库日期",required = false)
    private Date stockinDate;

    /**
     * 审核时间
     */
    @ApiModelProperty(value="审核时间",required = false)
    private Date auditDate;

    /**
     * 仓库ID
     */
    @ApiModelProperty(value="仓库ID",required = true)
    private Integer warehouseId;

    /**
     * 备注
     */
    @ApiModelProperty(value="备注",required = false)
    private String remark;

    /**
     * 跟踪号
     */
    @ApiModelProperty(value="跟踪号",required = false)
    private String trackNumber;

    /**
     * 入库状态,100保存 200审核 300取消审核
     */
    @ApiModelProperty(value="入库状态,100保存 200审核 300取消审核",required = false)
    private Integer stockinStatus;

    /**
     * 供应商ID
     */
    @ApiModelProperty(value="供应商ID",required = false)
    private Integer supplierId;

    /**
     * 供应商编码
     */
    @ApiModelProperty(value="供应商编码",required = false)
    private String supplierCode;

    /**
     * 供应商名称
     */
    @ApiModelProperty(value="供应商名称",required = false)
    private String supplierName;

    /**
     * 实际入库数量
     */
    @ApiModelProperty(value="实际入库数量",required = false)
    private Integer quantity;

    /**
     * 申请入库数量
     */
    @ApiModelProperty(value="申请入库数量",required = false)
    private Integer applyQuantity;

    /**
     * 次品数量
     */
    @ApiModelProperty(value="次品数量",required = false)
    private Integer defectiveQuantity;

    /**
     * 单据日期
     */
    @ApiModelProperty(value="单据日期",required = false)
    private Date billDate;

    /**
     * 入库员编号
     */
    @ApiModelProperty(value="入库员编号",required = false)
    private Integer receiverPersonId;

    /**
     * 入库名称
     */
    @ApiModelProperty(value="入库名称",required = false)
    private String receiverName;

    /**
     * 入库金额
     */
    @ApiModelProperty(value="入库金额",required = false)
    private BigDecimal stockInMoney;

}
