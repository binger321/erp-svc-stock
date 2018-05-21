package com.binger.stock.dao;

import com.binger.stock.domain.Warehouse;
import com.binger.stock.domain.WarehouseExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WarehouseMapper {
    long countByExample(WarehouseExample example);

    int deleteByExample(WarehouseExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Warehouse record);

    int insertSelective(Warehouse record);

    List<Warehouse> selectByExampleWithColSelected(WarehouseExample example);

    List<Warehouse> selectByExample(WarehouseExample example);

    Warehouse selectByPrimaryKeyWithColSelected(@Param("id") Integer id, @Param("selectiveField") WarehouseExample.SelectiveField selectiveField);

    Warehouse selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Warehouse record, @Param("example") WarehouseExample example);

    int updateByExample(@Param("record") Warehouse record, @Param("example") WarehouseExample example);

    int updateByPrimaryKeySelective(Warehouse record);

    int updateByPrimaryKey(Warehouse record);
}