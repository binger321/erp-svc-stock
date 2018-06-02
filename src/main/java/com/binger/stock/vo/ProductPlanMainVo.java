package com.binger.stock.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 主采购计划表
 */
@Data
@ApiModel(value="主采购计划表")
public class ProductPlanMainVo implements Serializable {
    /**
     * 主生产计划ID
     */
    @ApiModelProperty(value="主生产计划ID",required = true)
    private Integer id;

    /**
     * 生产计划编号,自己生成
     */
    @ApiModelProperty(value="生产计划编号,自己生成",required = true)
    private String productPlanCode;

    /**
     * 计划备注
     */
    @ApiModelProperty(value="计划备注",required = false)
    private String productComments;

    /**
     * 状态,0未审核 50已过期 100已审核
     */
    @ApiModelProperty(value="状态,0未审核 50已过期 100已审核",required = false)
    private Integer planStatus;

    /**
     * 审核时间
     */
    @ApiModelProperty(value="审核时间",required = false)
    private Date auditTime;

    /**
     * 审核人名字
     */
    @ApiModelProperty(value="审核人名字",required = false)
    private String auditUserName;

    /**
     * 单据日期
     */
    @ApiModelProperty(value="单据日期",required = false)
    private Date billDate;

    /**
     * 供应商ID
     */
    @ApiModelProperty(value="供应商ID",required = false)
    private Integer supplierId;

    /**
     * 供应商代码
     */
    @ApiModelProperty(value="供应商代码",required = false)
    private String supplierCode;

    /**
     * 供应商名称
     */
    @ApiModelProperty(value="供应商名称",required = false)
    private String supplierName;

    /**
     * 创建人
     */
    @ApiModelProperty(value="创建人",required = false)
    private String creator;

    /**
     * 创建时间
     */
    @ApiModelProperty(value="创建时间",required = true)
    private Date createTime;

    /**
     * 修改人
     */
    @ApiModelProperty(value="修改人",required = false)
    private String modifier;

    /**
     * 修改时间
     */
    @ApiModelProperty(value="修改时间",required = false)
    private Date modifyTime;

}