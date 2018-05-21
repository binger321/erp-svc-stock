package com.binger.stock.domain;

import java.io.Serializable;
import java.util.Date;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 仓库
 */
@ApiModel(value="仓库")
public class Warehouse implements Serializable {
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

    /**
     * warehouse
     */
    private static final long serialVersionUID = 1L;

    /**
     * ID
     * @return id ID
     */
    public Integer getId() {
        return id;
    }

    /**
     * ID
     * @param id ID
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 上级仓库ID
     * @return pid 上级仓库ID
     */
    public Integer getPid() {
        return pid;
    }

    /**
     * 上级仓库ID
     * @param pid 上级仓库ID
     */
    public void setPid(Integer pid) {
        this.pid = pid;
    }

    /**
     * 仓库代码
     * @return warehouse_code 仓库代码
     */
    public String getWarehouseCode() {
        return warehouseCode;
    }

    /**
     * 仓库代码
     * @param warehouseCode 仓库代码
     */
    public void setWarehouseCode(String warehouseCode) {
        this.warehouseCode = warehouseCode == null ? null : warehouseCode.trim();
    }

    /**
     * 仓库名称
     * @return warehouse_name 仓库名称
     */
    public String getWarehouseName() {
        return warehouseName;
    }

    /**
     * 仓库名称
     * @param warehouseName 仓库名称
     */
    public void setWarehouseName(String warehouseName) {
        this.warehouseName = warehouseName == null ? null : warehouseName.trim();
    }

    /**
     * 仓库分类（共有0，私有1）
     * @return warehouse_category 仓库分类（共有0，私有1）
     */
    public String getWarehouseCategory() {
        return warehouseCategory;
    }

    /**
     * 仓库分类（共有0，私有1）
     * @param warehouseCategory 仓库分类（共有0，私有1）
     */
    public void setWarehouseCategory(String warehouseCategory) {
        this.warehouseCategory = warehouseCategory == null ? null : warehouseCategory.trim();
    }

    /**
     * 负责人ID
     * @return ware_manager_id 负责人ID
     */
    public Integer getWareManagerId() {
        return wareManagerId;
    }

    /**
     * 负责人ID
     * @param wareManagerId 负责人ID
     */
    public void setWareManagerId(Integer wareManagerId) {
        this.wareManagerId = wareManagerId;
    }

    /**
     * 负责人
     * @return ware_manager 负责人
     */
    public String getWareManager() {
        return wareManager;
    }

    /**
     * 负责人
     * @param wareManager 负责人
     */
    public void setWareManager(String wareManager) {
        this.wareManager = wareManager == null ? null : wareManager.trim();
    }

    /**
     * 联系电话
     * @return phone_number 联系电话
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * 联系电话
     * @param phoneNumber 联系电话
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber == null ? null : phoneNumber.trim();
    }

    /**
     * 国家ID
     * @return country_id 国家ID
     */
    public Integer getCountryId() {
        return countryId;
    }

    /**
     * 国家ID
     * @param countryId 国家ID
     */
    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    /**
     * 国家
     * @return country 国家
     */
    public String getCountry() {
        return country;
    }

    /**
     * 国家
     * @param country 国家
     */
    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    /**
     * 省份ID
     * @return state_id 省份ID
     */
    public Integer getStateId() {
        return stateId;
    }

    /**
     * 省份ID
     * @param stateId 省份ID
     */
    public void setStateId(Integer stateId) {
        this.stateId = stateId;
    }

    /**
     * 省份
     * @return state 省份
     */
    public String getState() {
        return state;
    }

    /**
     * 省份
     * @param state 省份
     */
    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    /**
     * 城市ID
     * @return city_id 城市ID
     */
    public Integer getCityId() {
        return cityId;
    }

    /**
     * 城市ID
     * @param cityId 城市ID
     */
    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    /**
     * 城市
     * @return city 城市
     */
    public String getCity() {
        return city;
    }

    /**
     * 城市
     * @param city 城市
     */
    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    /**
     * 地址
     * @return address 地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 地址
     * @param address 地址
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * 状态（启用、停用）
     * @return status 状态（启用、停用）
     */
    public Boolean getStatus() {
        return status;
    }

    /**
     * 状态（启用、停用）
     * @param status 状态（启用、停用）
     */
    public void setStatus(Boolean status) {
        this.status = status;
    }

    /**
     * 停用时间
     * @return block_time 停用时间
     */
    public Date getBlockTime() {
        return blockTime;
    }

    /**
     * 停用时间
     * @param blockTime 停用时间
     */
    public void setBlockTime(Date blockTime) {
        this.blockTime = blockTime;
    }

    /**
     * 创建人
     * @return creator 创建人
     */
    public String getCreator() {
        return creator;
    }

    /**
     * 创建人
     * @param creator 创建人
     */
    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    /**
     * 创建时间
     * @return create_time 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 修改人
     * @return modifier 修改人
     */
    public String getModifier() {
        return modifier;
    }

    /**
     * 修改人
     * @param modifier 修改人
     */
    public void setModifier(String modifier) {
        this.modifier = modifier == null ? null : modifier.trim();
    }

    /**
     * 修改时间
     * @return modify_time 修改时间
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * 修改时间
     * @param modifyTime 修改时间
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Warehouse other = (Warehouse) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getPid() == null ? other.getPid() == null : this.getPid().equals(other.getPid()))
            && (this.getWarehouseCode() == null ? other.getWarehouseCode() == null : this.getWarehouseCode().equals(other.getWarehouseCode()))
            && (this.getWarehouseName() == null ? other.getWarehouseName() == null : this.getWarehouseName().equals(other.getWarehouseName()))
            && (this.getWarehouseCategory() == null ? other.getWarehouseCategory() == null : this.getWarehouseCategory().equals(other.getWarehouseCategory()))
            && (this.getWareManagerId() == null ? other.getWareManagerId() == null : this.getWareManagerId().equals(other.getWareManagerId()))
            && (this.getWareManager() == null ? other.getWareManager() == null : this.getWareManager().equals(other.getWareManager()))
            && (this.getPhoneNumber() == null ? other.getPhoneNumber() == null : this.getPhoneNumber().equals(other.getPhoneNumber()))
            && (this.getCountryId() == null ? other.getCountryId() == null : this.getCountryId().equals(other.getCountryId()))
            && (this.getCountry() == null ? other.getCountry() == null : this.getCountry().equals(other.getCountry()))
            && (this.getStateId() == null ? other.getStateId() == null : this.getStateId().equals(other.getStateId()))
            && (this.getState() == null ? other.getState() == null : this.getState().equals(other.getState()))
            && (this.getCityId() == null ? other.getCityId() == null : this.getCityId().equals(other.getCityId()))
            && (this.getCity() == null ? other.getCity() == null : this.getCity().equals(other.getCity()))
            && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getBlockTime() == null ? other.getBlockTime() == null : this.getBlockTime().equals(other.getBlockTime()))
            && (this.getCreator() == null ? other.getCreator() == null : this.getCreator().equals(other.getCreator()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getModifier() == null ? other.getModifier() == null : this.getModifier().equals(other.getModifier()))
            && (this.getModifyTime() == null ? other.getModifyTime() == null : this.getModifyTime().equals(other.getModifyTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getPid() == null) ? 0 : getPid().hashCode());
        result = prime * result + ((getWarehouseCode() == null) ? 0 : getWarehouseCode().hashCode());
        result = prime * result + ((getWarehouseName() == null) ? 0 : getWarehouseName().hashCode());
        result = prime * result + ((getWarehouseCategory() == null) ? 0 : getWarehouseCategory().hashCode());
        result = prime * result + ((getWareManagerId() == null) ? 0 : getWareManagerId().hashCode());
        result = prime * result + ((getWareManager() == null) ? 0 : getWareManager().hashCode());
        result = prime * result + ((getPhoneNumber() == null) ? 0 : getPhoneNumber().hashCode());
        result = prime * result + ((getCountryId() == null) ? 0 : getCountryId().hashCode());
        result = prime * result + ((getCountry() == null) ? 0 : getCountry().hashCode());
        result = prime * result + ((getStateId() == null) ? 0 : getStateId().hashCode());
        result = prime * result + ((getState() == null) ? 0 : getState().hashCode());
        result = prime * result + ((getCityId() == null) ? 0 : getCityId().hashCode());
        result = prime * result + ((getCity() == null) ? 0 : getCity().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getBlockTime() == null) ? 0 : getBlockTime().hashCode());
        result = prime * result + ((getCreator() == null) ? 0 : getCreator().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getModifier() == null) ? 0 : getModifier().hashCode());
        result = prime * result + ((getModifyTime() == null) ? 0 : getModifyTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", pid=").append(pid);
        sb.append(", warehouseCode=").append(warehouseCode);
        sb.append(", warehouseName=").append(warehouseName);
        sb.append(", warehouseCategory=").append(warehouseCategory);
        sb.append(", wareManagerId=").append(wareManagerId);
        sb.append(", wareManager=").append(wareManager);
        sb.append(", phoneNumber=").append(phoneNumber);
        sb.append(", countryId=").append(countryId);
        sb.append(", country=").append(country);
        sb.append(", stateId=").append(stateId);
        sb.append(", state=").append(state);
        sb.append(", cityId=").append(cityId);
        sb.append(", city=").append(city);
        sb.append(", address=").append(address);
        sb.append(", status=").append(status);
        sb.append(", blockTime=").append(blockTime);
        sb.append(", creator=").append(creator);
        sb.append(", createTime=").append(createTime);
        sb.append(", modifier=").append(modifier);
        sb.append(", modifyTime=").append(modifyTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}