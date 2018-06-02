package com.binger.stock.enums;

/**
 * Created with IntelliJ IDEA.
 * User: zhuyubin
 * Date: 2018/5/25
 * Time: 下午7:29
 * To change this template use File | Settings | File Templates.
 * Description:出库状态,100保存 200审核 900归档 9挂起
 */
public enum  StockOutStatusEnum {
    SAVE(100, "保存"),
    AUDIT(200, "审核"),
    FILE(900, "归档"),
    HANG_UP(9, "挂起");
    private Integer code;
    private String status;

    StockOutStatusEnum(Integer code, String status) {
        this.code = code;
        this.status = status;
    }

    public Integer getCode() {
        return code;
    }

    public String getStatus() {
        return status;
    }

}
