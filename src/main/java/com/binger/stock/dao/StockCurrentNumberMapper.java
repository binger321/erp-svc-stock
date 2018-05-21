package com.binger.stock.dao;

import com.binger.stock.domain.StockCurrentNumber;
import com.binger.stock.domain.StockCurrentNumberExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StockCurrentNumberMapper {
    long countByExample(StockCurrentNumberExample example);

    int deleteByExample(StockCurrentNumberExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(StockCurrentNumber record);

    int insertSelective(StockCurrentNumber record);

    List<StockCurrentNumber> selectByExampleWithColSelected(StockCurrentNumberExample example);

    List<StockCurrentNumber> selectByExample(StockCurrentNumberExample example);

    StockCurrentNumber selectByPrimaryKeyWithColSelected(@Param("id") Integer id, @Param("selectiveField") StockCurrentNumberExample.SelectiveField selectiveField);

    StockCurrentNumber selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") StockCurrentNumber record, @Param("example") StockCurrentNumberExample example);

    int updateByExample(@Param("record") StockCurrentNumber record, @Param("example") StockCurrentNumberExample example);

    int updateByPrimaryKeySelective(StockCurrentNumber record);

    int updateByPrimaryKey(StockCurrentNumber record);
}