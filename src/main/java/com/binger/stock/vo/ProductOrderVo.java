package com.binger.stock.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: zhuyubin
 * Date: 2018/5/24
 * Time: 上午10:45
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@ApiModel("生产订单详情Vo")
@Data
public class ProductOrderVo {
    @ApiModelProperty("主表")
    private ProductOrderMainVo productOrderMainVo;

    @ApiModelProperty("详情表")
    private List<ProductOrderDetailVo> productOrderDetailVo;

}
