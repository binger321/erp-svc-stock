package com.binger.stock.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: zhuyubin
 * Date: 2018/5/25
 * Time: 下午4:34
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Data
@ApiModel(value = "出库表Vo")
public class StockOutBillVo {
    @ApiModelProperty(value = "出库表主表")
    private StockOutBillMainVo stockOutBillMainVo;

    @ApiModelProperty(value = "出库单详情表")
    private List<StockOutBillDetailVo> stockOutBillDetailVoList;
}
