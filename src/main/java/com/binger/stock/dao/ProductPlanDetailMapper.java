package com.binger.stock.dao;

import com.binger.stock.domain.ProductPlanDetail;
import com.binger.stock.domain.ProductPlanDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductPlanDetailMapper {
    long countByExample(ProductPlanDetailExample example);

    int deleteByExample(ProductPlanDetailExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ProductPlanDetail record);

    int insertSelective(ProductPlanDetail record);

    List<ProductPlanDetail> selectByExampleWithColSelected(ProductPlanDetailExample example);

    List<ProductPlanDetail> selectByExample(ProductPlanDetailExample example);

    ProductPlanDetail selectByPrimaryKeyWithColSelected(@Param("id") Integer id, @Param("selectiveField") ProductPlanDetailExample.SelectiveField selectiveField);

    ProductPlanDetail selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ProductPlanDetail record, @Param("example") ProductPlanDetailExample example);

    int updateByExample(@Param("record") ProductPlanDetail record, @Param("example") ProductPlanDetailExample example);

    int updateByPrimaryKeySelective(ProductPlanDetail record);

    int updateByPrimaryKey(ProductPlanDetail record);
}