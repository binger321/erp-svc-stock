package com.binger.stock.dao;

import com.binger.stock.domain.StockReserveLog;
import com.binger.stock.domain.StockReserveLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StockReserveLogMapper {
    long countByExample(StockReserveLogExample example);

    int deleteByExample(StockReserveLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(StockReserveLog record);

    int insertSelective(StockReserveLog record);

    List<StockReserveLog> selectByExampleWithColSelected(StockReserveLogExample example);

    List<StockReserveLog> selectByExample(StockReserveLogExample example);

    StockReserveLog selectByPrimaryKeyWithColSelected(@Param("id") Integer id, @Param("selectiveField") StockReserveLogExample.SelectiveField selectiveField);

    StockReserveLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") StockReserveLog record, @Param("example") StockReserveLogExample example);

    int updateByExample(@Param("record") StockReserveLog record, @Param("example") StockReserveLogExample example);

    int updateByPrimaryKeySelective(StockReserveLog record);

    int updateByPrimaryKey(StockReserveLog record);
}