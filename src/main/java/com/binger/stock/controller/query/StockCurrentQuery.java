package com.binger.stock.controller.query;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * Created with IntelliJ IDEA.
 * User: yb
 * Date: 2018/6/13
 * Time: 22:47
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Data
@ApiModel("当前库存query")
public class StockCurrentQuery {

    @ApiModelProperty("仓库id")
    private Integer warehouseId;

    @ApiModelProperty("商品id")
    private Integer goodsId;

    @ApiModelProperty("sku编码")
    private String skuCode;
}