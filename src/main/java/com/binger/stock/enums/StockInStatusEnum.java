package com.binger.stock.enums;

/**
 * Created with IntelliJ IDEA.
 * User: zhuyubin
 * Date: 2018/5/18
 * Time: 上午10:14
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public enum StockInStatusEnum {

    STOCK_IN_BILL_SAVE(100, "保存"),
    STOCK_IN_BILL_CHECK(200, "审核"),
    STOCK_IN_BILL_CANCEL(300, "取消审核");



    private Integer code;
    private String status;

    public Integer getCode() {
        return code;
    }

    public String getStatus() {
        return status;
    }

    StockInStatusEnum() {
    }

    StockInStatusEnum(Integer code, String status) {
        this.code = code;
        this.status = status;
    }

    public static StockInStatusEnum getStockInStatusByCode(Integer code) {
        if (code == null) {
            return STOCK_IN_BILL_SAVE;
        }
        for (StockInStatusEnum stockInStatusEnum : StockInStatusEnum.values()) {
            if (code.equals(stockInStatusEnum.code)) {
                return stockInStatusEnum;
            }
        }
        return STOCK_IN_BILL_SAVE;
    }



}
