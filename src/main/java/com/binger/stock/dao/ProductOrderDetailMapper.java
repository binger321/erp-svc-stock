package com.binger.stock.dao;

import com.binger.stock.domain.ProductOrderDetail;
import com.binger.stock.domain.ProductOrderDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductOrderDetailMapper {
    long countByExample(ProductOrderDetailExample example);

    int deleteByExample(ProductOrderDetailExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ProductOrderDetail record);

    int insertSelective(ProductOrderDetail record);

    List<ProductOrderDetail> selectByExampleWithColSelected(ProductOrderDetailExample example);

    List<ProductOrderDetail> selectByExample(ProductOrderDetailExample example);

    ProductOrderDetail selectByPrimaryKeyWithColSelected(@Param("id") Integer id, @Param("selectiveField") ProductOrderDetailExample.SelectiveField selectiveField);

    ProductOrderDetail selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ProductOrderDetail record, @Param("example") ProductOrderDetailExample example);

    int updateByExample(@Param("record") ProductOrderDetail record, @Param("example") ProductOrderDetailExample example);

    int updateByPrimaryKeySelective(ProductOrderDetail record);

    int updateByPrimaryKey(ProductOrderDetail record);
}