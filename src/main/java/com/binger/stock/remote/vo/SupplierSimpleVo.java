package com.binger.stock.remote.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
 * Created with IntelliJ IDEA.
 * User: zhuyubin
 * Date: 2018/4/25
 * Time: 下午2:49
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@ApiModel(value = "供应商简单vo")
@Data
public class SupplierSimpleVo {

    /**
     * ID
     */
    @ApiModelProperty(value="ID",required = true)
    private Integer id;

    /**
     * goodsId
     */
    private Integer goodsId;

    /**
     * 供应商id
     */
    @ApiModelProperty(value="供应商id",required = true)
    private Integer supplierId;

    /**
     * 供应商代码
     */
    @ApiModelProperty(value="供应商代码",required = true)
    private String supplierCode;

    /**
     * 供应商名称
     */
    @ApiModelProperty(value="供应商名称",required = true)
    private String supplierName;

    /**
     * 进货价
     */
    @ApiModelProperty(value="进货价",required = false)
    private BigDecimal importPrice;

    /**
     * 联系人
     */
    @ApiModelProperty(value="联系人",required = false)
    private String contact;

    /**
     * 联系电话
     */
    @ApiModelProperty(value="联系电话",required = false)
    private String phoneNumber;

    /**
     * 供应商货号
     */
    @ApiModelProperty(value = "供应商货号", required = false)
    private String supplierGoodsCode;

    /**
     * 状态（启用、停用）
     */
    @ApiModelProperty(value="状态（启用、停用）",required = false)
    private Boolean status;

}
