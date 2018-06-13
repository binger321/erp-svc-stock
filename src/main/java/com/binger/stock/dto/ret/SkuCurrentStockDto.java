package com.binger.stock.dto.ret;

import lombok.Data;

import java.math.BigDecimal;

/**
 * Created with IntelliJ IDEA.
 * User: yb
 * Date: 2018/6/13
 * Time: 19:04
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Data
public class SkuCurrentStockDto {
    private Integer skuId;
    private Integer warehouseId;
    private Integer quantity;
    private Integer useQuantity;
    private BigDecimal costPrice;
}