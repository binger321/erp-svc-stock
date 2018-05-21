package com.binger.stock.dao;

import com.binger.stock.domain.ProductPlanMain;
import com.binger.stock.domain.ProductPlanMainExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductPlanMainMapper {
    long countByExample(ProductPlanMainExample example);

    int deleteByExample(ProductPlanMainExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ProductPlanMain record);

    int insertSelective(ProductPlanMain record);

    List<ProductPlanMain> selectByExampleWithColSelected(ProductPlanMainExample example);

    List<ProductPlanMain> selectByExample(ProductPlanMainExample example);

    ProductPlanMain selectByPrimaryKeyWithColSelected(@Param("id") Integer id, @Param("selectiveField") ProductPlanMainExample.SelectiveField selectiveField);

    ProductPlanMain selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ProductPlanMain record, @Param("example") ProductPlanMainExample example);

    int updateByExample(@Param("record") ProductPlanMain record, @Param("example") ProductPlanMainExample example);

    int updateByPrimaryKeySelective(ProductPlanMain record);

    int updateByPrimaryKey(ProductPlanMain record);
}