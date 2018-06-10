package com.binger.stock.service.impl;

import com.binger.common.exception.BusinessException;
import com.binger.common.util.DozerUtils;
import com.binger.stock.dao.WarehouseMapper;
import com.binger.stock.domain.Warehouse;
import com.binger.stock.domain.WarehouseExample;
import com.binger.stock.service.WarehouseService;
import com.binger.stock.vo.WarehouseVo;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: yb
 * Date: 2018/6/6
 * Time: 21:59
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Service
public class WarehouseServiceImpl implements WarehouseService {

    @Autowired
    private WarehouseMapper warehouseMapper;

    @Override
    public List<WarehouseVo> listByExample(WarehouseExample example) {
        List<Warehouse> warehouseList = warehouseMapper.selectByExample(example);
        if (CollectionUtils.isNotEmpty(warehouseList)) {
            return DozerUtils.convertList(warehouseList, WarehouseVo.class);
        }
        return null;
    }

    @Override
    public Long countByExample(WarehouseExample example) {
        return warehouseMapper.countByExample(example);
    }

    @Override
    public WarehouseVo findById(Integer id) {
        Warehouse warehouse = warehouseMapper.selectByPrimaryKey(id);
        if ( warehouse != null) {
            return DozerUtils.convert(warehouse, WarehouseVo.class);
        }
        return null;
    }

    @Override
    public WarehouseVo update(Integer id, Warehouse warehouse) {
        checkUnique(warehouse,id);
        warehouse.setId(id);
        int count = warehouseMapper.updateByPrimaryKeySelective(warehouse);
        if (count > 0) {
            return DozerUtils.convert(warehouseMapper.selectByPrimaryKey(id), WarehouseVo.class);
        } else {
            throw BusinessException.create("更新失败，可能重复操作！");
        }
    }

    @Override
    public WarehouseVo add(Warehouse warehouse) {
        checkUnique(warehouse, null);
        warehouseMapper.insertSelective(warehouse);
        Warehouse warehouse1 = warehouseMapper.selectByPrimaryKey(warehouse.getId());
        if (warehouse1 != null) {
            return DozerUtils.convert(warehouse1, WarehouseVo.class);
        } else {
            throw BusinessException.create("新增有误，请检查！");
        }
    }

    @Override
    public void deleteById(Integer id) {
        int count = warehouseMapper.deleteByPrimaryKey(id);
        if (count < 0) {
            throw BusinessException.create("删除失败，可能重复操作！");
        }
    }

    private void checkUnique(Warehouse warehouse, Integer id) {
        WarehouseExample example = new WarehouseExample();
        WarehouseExample.Criteria criteria = example.createCriteria();
        criteria.andWarehouseCodeEqualTo(warehouse.getWarehouseCode());
        if (id != null){
            criteria.andIdNotEqualTo(id);
        }
        Long count = warehouseMapper.countByExample(example);
        if (count > 0) {
            throw BusinessException.create("仓库编号已存在!");
        }

    }
}