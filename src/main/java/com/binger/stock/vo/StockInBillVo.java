package com.binger.stock.vo;

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
@ApiModel(value = "入库单vo")
@Data
public class StockInBillVo {
    @ApiModelProperty("主单")
    private StockInBillMainVo stockInBillMainVo;

    @ApiModelProperty("子单")
    private List<StockInBillDetailVo> stockInBillDetailVoList;

}
