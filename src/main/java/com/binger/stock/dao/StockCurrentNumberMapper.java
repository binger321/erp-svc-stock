package com.binger.stock.dao;

import com.binger.stock.controller.query.StockCurrentQuery;
import com.binger.stock.domain.StockCurrentNumber;
import com.binger.stock.domain.StockCurrentNumberExample;
import java.util.List;

import com.binger.stock.dto.ret.SkuCurrentStockDto;
import com.binger.stock.vo.StockCurrentVo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
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

    List<SkuCurrentStockDto> countCurrentStock(@Param("skuId") Integer skuId, @Param("warehouseId") Integer warehouseId);

    List<StockCurrentVo> listByQuery(@Param("queryDto") StockCurrentQuery stockCurrentQuery);
}