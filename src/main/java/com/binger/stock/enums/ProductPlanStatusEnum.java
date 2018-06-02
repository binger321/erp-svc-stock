package com.binger.stock.enums;

/**
 * Created with IntelliJ IDEA.
 * User: zhuyubin
 * Date: 2018/5/25
 * Time: 下午1:47
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public enum  ProductPlanStatusEnum {
    NO_AUDIT(0, "未审核"),
    EXPIRE(50, "已过期"),
    AUDIT(100, "已审核"),
    CANCEL(999, "取消");
    private Integer code;
    private String status;

    ProductPlanStatusEnum(Integer code, String status) {
        this.code = code;
        this.status = status;
    }

    public Integer getCode() {
        return code;
    }

    public String getStatus() {
        return status;
    }

    public ProductPlanStatusEnum getStatusByCode(Integer code) {
        for (ProductPlanStatusEnum  productPlanStatusEnum : ProductPlanStatusEnum.values()) {
            if (productPlanStatusEnum.getCode().equals(code)) {
                return productPlanStatusEnum;
            }
        }
        return null;
    }
}
