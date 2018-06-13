package com.binger.stock.dto.ret;

import lombok.Data;

/**
 * Created with IntelliJ IDEA.
 * User: yb
 * Date: 2018/6/13
 * Time: 15:39
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Data
public class StockOutDelayRetDto {
    /**
     * skuId
     */
    private Integer skuId;

    /**
     * delay_day
     */
    private Integer delayDays;
}