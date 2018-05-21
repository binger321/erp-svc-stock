package com.binger.stock.dao;

import com.binger.stock.domain.StockInBillMain;
import com.binger.stock.domain.StockInBillMainExample;
import com.binger.stock.dto.query.StockInMainQueryDto;
import com.binger.stock.dto.ret.StockInMainRetDto;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StockInBillMainMapper {
    long countByExample(StockInBillMainExample example);

    int deleteByExample(StockInBillMainExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(StockInBillMain record);

    int insertSelective(StockInBillMain record);

    List<StockInBillMain> selectByExampleWithColSelected(StockInBillMainExample example);

    List<StockInBillMain> selectByExample(StockInBillMainExample example);

    StockInBillMain selectByPrimaryKeyWithColSelected(@Param("id") Integer id, @Param("selectiveField") StockInBillMainExample.SelectiveField selectiveField);

    StockInBillMain selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") StockInBillMain record, @Param("example") StockInBillMainExample example);

    int updateByExample(@Param("record") StockInBillMain record, @Param("example") StockInBillMainExample example);

    int updateByPrimaryKeySelective(StockInBillMain record);

    int updateByPrimaryKey(StockInBillMain record);

    /**
     * 根据条件计数
     * @param stockInMainQueryDto
     * @return
     */
    long countByQueryDto(@Param("queryDto") StockInMainQueryDto stockInMainQueryDto);

    /**
     * 根据条件查询
     * @param stockInMainQueryDto
     * @return
     */
    List<StockInMainRetDto> selectByQuery(@Param("queryDto") StockInMainQueryDto stockInMainQueryDto);
}