package com.binger.stock.controller.form;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: zhuyubin
 * Date: 2018/5/18
 * Time: 上午10:40
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@ApiModel(value = "入库单form")
@Data
public class StockInBillForm {
    @ApiModelProperty("主单")
    private StockInBillMainForm stockInBillMainForm;

    @ApiModelProperty("子单")
    private List<StockInBillDetailForm> stockInBillDetailFormList;

}
