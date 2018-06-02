package com.binger.stock.controller.form;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: zhuyubin
 * Date: 2018/5/25
 * Time: 下午5:23
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Data
@ApiModel(value = "出库表Form")
public class StockOutBillForm {

    @ApiModelProperty(value = "出库表主表", required = true)
    private StockOutBillMainForm stockOutBillMainForm;

    @ApiModelProperty(value = "出库子表",required = true)
    private List<StockOutBillDetailForm> stockOutBillDetailFormList;
}
