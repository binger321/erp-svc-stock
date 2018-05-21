package com.binger.stock.dao;

import com.binger.stock.domain.ProductOrderMain;
import com.binger.stock.domain.ProductOrderMainExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProductOrderMainMapper {
    long countByExample(ProductOrderMainExample example);

    int deleteByExample(ProductOrderMainExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ProductOrderMain record);

    int insertSelective(ProductOrderMain record);

    List<ProductOrderMain> selectByExampleWithColSelected(ProductOrderMainExample example);

    List<ProductOrderMain> selectByExample(ProductOrderMainExample example);

    ProductOrderMain selectByPrimaryKeyWithColSelected(@Param("id") Integer id, @Param("selectiveField") ProductOrderMainExample.SelectiveField selectiveField);

    ProductOrderMain selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ProductOrderMain record, @Param("example") ProductOrderMainExample example);

    int updateByExample(@Param("record") ProductOrderMain record, @Param("example") ProductOrderMainExample example);

    int updateByPrimaryKeySelective(ProductOrderMain record);

    int updateByPrimaryKey(ProductOrderMain record);
}