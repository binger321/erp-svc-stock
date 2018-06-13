package com.binger.stock.dao;

import com.binger.stock.domain.StockOutBillMain;
import com.binger.stock.domain.StockOutBillMainExample;
import java.util.List;
import com.binger.stock.dto.query.StockOutMainQueryDto;
import com.binger.stock.dto.ret.StockOutMainRetDto;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface StockOutBillMainMapper {
    long countByExample(StockOutBillMainExample example);

    int deleteByExample(StockOutBillMainExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(StockOutBillMain record);

    int insertSelective(StockOutBillMain record);

    List<StockOutBillMain> selectByExampleWithColSelected(StockOutBillMainExample example);

    List<StockOutBillMain> selectByExample(StockOutBillMainExample example);

    StockOutBillMain selectByPrimaryKeyWithColSelected(@Param("id") Integer id, @Param("selectiveField") StockOutBillMainExample.SelectiveField selectiveField);

    StockOutBillMain selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") StockOutBillMain record, @Param("example") StockOutBillMainExample example);

    int updateByExample(@Param("record") StockOutBillMain record, @Param("example") StockOutBillMainExample example);

    int updateByPrimaryKeySelective(StockOutBillMain record);

    int updateByPrimaryKey(StockOutBillMain record);


    Long countByQuery(@Param("queryDto") StockOutMainQueryDto stockOutMainQueryDto);

    List<StockOutMainRetDto> listByQuery(@Param("queryDto") StockOutMainQueryDto stockOutMainQueryDto);
}