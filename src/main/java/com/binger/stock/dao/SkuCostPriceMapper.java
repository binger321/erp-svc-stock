package com.binger.stock.dao;

import com.binger.stock.domain.SkuCostPrice;
import com.binger.stock.domain.SkuCostPriceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SkuCostPriceMapper {
    long countByExample(SkuCostPriceExample example);

    int deleteByExample(SkuCostPriceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SkuCostPrice record);

    int insertSelective(SkuCostPrice record);

    List<SkuCostPrice> selectByExampleWithColSelected(SkuCostPriceExample example);

    List<SkuCostPrice> selectByExample(SkuCostPriceExample example);

    SkuCostPrice selectByPrimaryKeyWithColSelected(@Param("id") Integer id, @Param("selectiveField") SkuCostPriceExample.SelectiveField selectiveField);

    SkuCostPrice selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SkuCostPrice record, @Param("example") SkuCostPriceExample example);

    int updateByExample(@Param("record") SkuCostPrice record, @Param("example") SkuCostPriceExample example);

    int updateByPrimaryKeySelective(SkuCostPrice record);

    int updateByPrimaryKey(SkuCostPrice record);
}