package com.binger.stock.dto.query;

import com.binger.common.QueryDtoBase;
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
@ApiModel("入库单查询条件Dto")
@Data
public class StockInMainQueryDto extends QueryDtoBase{

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
     * 审核人名字
     */
    @ApiModelProperty(value="审核人名字",required = false)
    private String auditor;

    /**
     * 仓库ID
     */
    @ApiModelProperty(value="仓库ID",required = true)
    private Integer warehouseId;

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
     * 入库员名称
     */
    @ApiModelProperty(value="入库员名称",required = false)
    private String receiverName;

    /**
     * 入库金额
     */
    @ApiModelProperty(value="入库金额",required = false)
    private BigDecimal stockInMoney;

    /**
     * 备注
     */
    @ApiModelProperty(value="备注",required = false)
    private String remark;

}
