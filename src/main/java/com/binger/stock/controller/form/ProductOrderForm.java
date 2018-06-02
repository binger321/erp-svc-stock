package com.binger.stock.controller.form;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: zhuyubin
 * Date: 2018/5/24
 * Time: 下午2:51
 * To change this template use File | Settings | File Templates.
 * Description:
 */

@ApiModel(value = "生产订单")
@Data
public class ProductOrderForm {

    @ApiModelProperty("生产订单主表")
    private ProductOrderMainForm productOrderMainForm;

    @ApiModelProperty("生产订单详情表")
    private List<ProductOrderDetailForm> productOrderDetailFormList;
}
