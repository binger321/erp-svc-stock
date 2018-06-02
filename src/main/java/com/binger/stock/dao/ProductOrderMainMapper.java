package com.binger.stock.dao;

import com.binger.stock.domain.ProductOrderMain;
import com.binger.stock.domain.ProductOrderMainExample;
import com.binger.stock.dto.query.ProductOrderMainQueryDto;
import com.binger.stock.dto.ret.ProductOrderMainRetDto;
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

    /**
     * 根据条件来计数
     * @param productOrderMainQueryDto
     * @return
     */
    Long countByQuery(@Param("queryDto") ProductOrderMainQueryDto productOrderMainQueryDto);

    /**
     * 根据条件列表
     * @param productOrderMainQueryDto
     * @return
     */
    List<ProductOrderMainRetDto> listByQuery(@Param("queryDto") ProductOrderMainQueryDto productOrderMainQueryDto);
}