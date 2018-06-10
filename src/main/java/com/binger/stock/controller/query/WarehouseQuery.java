package com.binger.stock.controller.query;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: yb
 * Date: 2018/6/6
 * Time: 21:41
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@ApiModel("仓库query")
@Data
public class WarehouseQuery {
    /**
     * ID
     */
    @ApiModelProperty(value="ID",required = true)
    private Integer id;

    /**
     * 上级仓库ID
     */
    @ApiModelProperty(value="上级仓库ID",required = false)
    private Integer pid;

    /**
     * 仓库代码
     */
    @ApiModelProperty(value="仓库代码",required = true)
    private String warehouseCode;

    /**
     * 仓库名称
     */
    @ApiModelProperty(value="仓库名称",required = true)
    private String warehouseName;

    /**
     * 仓库分类（共有0，私有1）
     */
    @ApiModelProperty(value="仓库分类（共有0，私有1）",required = false)
    private String warehouseCategory;

    /**
     * 负责人ID
     */
    @ApiModelProperty(value="负责人ID",required = false)
    private Integer wareManagerId;

    /**
     * 负责人
     */
    @ApiModelProperty(value="负责人",required = false)
    private String wareManager;

    /**
     * 联系电话
     */
    @ApiModelProperty(value="联系电话",required = false)
    private String phoneNumber;

    /**
     * 国家ID
     */
    @ApiModelProperty(value="国家ID",required = false)
    private Integer countryId;

    /**
     * 国家
     */
    @ApiModelProperty(value="国家",required = false)
    private String country;

    /**
     * 省份ID
     */
    @ApiModelProperty(value="省份ID",required = false)
    private Integer stateId;

    /**
     * 省份
     */
    @ApiModelProperty(value="省份",required = false)
    private String state;

    /**
     * 城市ID
     */
    @ApiModelProperty(value="城市ID",required = false)
    private Integer cityId;

    /**
     * 城市
     */
    @ApiModelProperty(value="城市",required = false)
    private String city;

    /**
     * 地址
     */
    @ApiModelProperty(value="地址",required = false)
    private String address;

    /**
     * 状态（启用、停用）
     */
    @ApiModelProperty(value="状态（启用、停用）",required = false)
    private Boolean status;

    /**
     * 停用时间
     */
    @ApiModelProperty(value="停用时间",required = false)
    private Date blockTime;

    /**
     * 创建人
     */
    @ApiModelProperty(value="创建人",required = true)
    private String creator;

    /**
     * 创建时间
     */
    @ApiModelProperty(value="创建时间",required = false)
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