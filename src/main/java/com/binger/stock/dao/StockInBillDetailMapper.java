package com.binger.stock.dao;

import com.binger.stock.domain.StockInBillDetail;
import com.binger.stock.domain.StockInBillDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StockInBillDetailMapper {
    long countByExample(StockInBillDetailExample example);

    int deleteByExample(StockInBillDetailExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(StockInBillDetail record);

    int insertSelective(StockInBillDetail record);

    List<StockInBillDetail> selectByExampleWithColSelected(StockInBillDetailExample example);

    List<StockInBillDetail> selectByExample(StockInBillDetailExample example);

    StockInBillDetail selectByPrimaryKeyWithColSelected(@Param("id") Integer id, @Param("selectiveField") StockInBillDetailExample.SelectiveField selectiveField);

    StockInBillDetail selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") StockInBillDetail record, @Param("example") StockInBillDetailExample example);

    int updateByExample(@Param("record") StockInBillDetail record, @Param("example") StockInBillDetailExample example);

    int updateByPrimaryKeySelective(StockInBillDetail record);

    int updateByPrimaryKey(StockInBillDetail record);
}