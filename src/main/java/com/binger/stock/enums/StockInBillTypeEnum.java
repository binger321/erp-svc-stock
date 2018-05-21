package com.binger.stock.enums;

/**
 * Created with IntelliJ IDEA.
 * User: zhuyubin
 * Date: 2018/5/18
 * Time: 上午10:03
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public enum  StockInBillTypeEnum {

    PRODUCT_STOCK_IN(100, "生产入库"),
    RETURN_STOCK_IN(200, "销售订单退货入库"),
    REPAIR_STOCK_IN(300, "返修入库");


    private Integer code;
    private String type;

    StockInBillTypeEnum() {
    }

    StockInBillTypeEnum(Integer code, String type) {
        this.code = code;
        this.type = type;
    }

    public Integer getCode() {
        return code;
    }

    public String getType() {
        return type;
    }

    public static StockInBillTypeEnum getBillTypeByCode(Integer code) {
        if (code == null) {
            return PRODUCT_STOCK_IN;
        }
        for (StockInBillTypeEnum stockInBillTypeEnum : StockInBillTypeEnum.values()) {
            if (code.equals(stockInBillTypeEnum.code)) {
                return stockInBillTypeEnum;
            }
        }
        return PRODUCT_STOCK_IN;
    }
}
