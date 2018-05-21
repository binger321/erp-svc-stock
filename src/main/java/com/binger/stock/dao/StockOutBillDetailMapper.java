package com.binger.stock.dao;

import com.binger.stock.domain.StockOutBillDetail;
import com.binger.stock.domain.StockOutBillDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StockOutBillDetailMapper {
    long countByExample(StockOutBillDetailExample example);

    int deleteByExample(StockOutBillDetailExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(StockOutBillDetail record);

    int insertSelective(StockOutBillDetail record);

    List<StockOutBillDetail> selectByExampleWithColSelected(StockOutBillDetailExample example);

    List<StockOutBillDetail> selectByExample(StockOutBillDetailExample example);

    StockOutBillDetail selectByPrimaryKeyWithColSelected(@Param("id") Integer id, @Param("selectiveField") StockOutBillDetailExample.SelectiveField selectiveField);

    StockOutBillDetail selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") StockOutBillDetail record, @Param("example") StockOutBillDetailExample example);

    int updateByExample(@Param("record") StockOutBillDetail record, @Param("example") StockOutBillDetailExample example);

    int updateByPrimaryKeySelective(StockOutBillDetail record);

    int updateByPrimaryKey(StockOutBillDetail record);
}