package com.binger.stock.enums;

/**
 * Created with IntelliJ IDEA.
 * User: zhuyubin
 * Date: 2018/5/24
 * Time: 下午3:57
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public enum  ProductOrderStatusEnum {
    SAVE(100, "保存"),
    AUDIT(200, "审核"),
    FILE(900, "归档"),
    CANCEL(0, "取消");
    private Integer code;
    private String status;

    ProductOrderStatusEnum(Integer code, String status) {
        this.code = code;
        this.status = status;
    }

    public Integer getCode() {
        return code;
    }

    public String getStatus() {
        return status;
    }

    public ProductOrderStatusEnum getStatusByCode(Integer code) {
        for (ProductOrderStatusEnum  productOrderStatusEnum : ProductOrderStatusEnum.values()) {
            if (productOrderStatusEnum.getCode().equals(code)) {
                return productOrderStatusEnum;
            }
        }
        return null;
    }
}
