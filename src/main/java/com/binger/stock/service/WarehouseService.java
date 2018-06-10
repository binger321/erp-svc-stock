package com.binger.stock.service;

import com.binger.stock.domain.Warehouse;
import com.binger.stock.domain.WarehouseExample;
import com.binger.stock.vo.WarehouseVo;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: yb
 * Date: 2018/6/6
 * Time: 21:59
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public interface WarehouseService {
    List<WarehouseVo> listByExample(WarehouseExample example);

    Long countByExample(WarehouseExample example);

    WarehouseVo findById(Integer id);

    WarehouseVo update(Integer id, Warehouse warehouse);

    WarehouseVo add(Warehouse warehouse);

    void deleteById(Integer id);
}