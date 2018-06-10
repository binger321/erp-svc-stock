package com.binger.stock.controller;

import com.binger.common.Const;
import com.binger.common.Page;
import com.binger.common.ServerResponse;
import com.binger.common.util.DozerUtils;
import com.binger.stock.controller.form.WarehouseForm;
import com.binger.stock.controller.query.WarehouseQuery;
import com.binger.stock.domain.Warehouse;
import com.binger.stock.domain.WarehouseExample;
import com.binger.stock.service.WarehouseService;
import com.binger.stock.vo.WarehouseVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: yb
 * Date: 2018/6/6
 * Time: 21:33
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Api(value = "warehouse", description = "仓库接口", produces = MediaType.APPLICATION_JSON_VALUE)
@RestController(value = "仓库API")
@RequestMapping(value = "/erp-svc-stock/warehouse")
public class WarehouseController {


    @Autowired
    private WarehouseService warehouseService;

    @RequestMapping(value = "/list", method = RequestMethod.POST)
    @ApiOperation(value = "仓库列表")
    public ServerResponse<List<WarehouseVo>> list(@RequestBody(required = false) WarehouseQuery warehouseQuery,
                                                  @RequestParam(value = "pageNo", required = false) Integer pageNo,
                                                  @RequestParam(value = "pageSize", required = false) Integer pageSize) {
        WarehouseExample example = new WarehouseExample();
        WarehouseExample.Criteria criteria = example.createCriteria();
        if (warehouseQuery.getWarehouseCode() != null) {
            criteria.andWarehouseCodeLike("%" + warehouseQuery.getWarehouseCode() + "%");
        }
        if (warehouseQuery.getWarehouseName() != null) {
            criteria.andWarehouseNameLike("%" + warehouseQuery.getWarehouseName() + "%");
        }
        if (warehouseQuery.getCountry() != null) {
            criteria.andWareManagerLike("%" + warehouseQuery.getWareManager() + "%");
        }
        if (warehouseQuery.getState() != null) {
            criteria.andStateLike("%" + warehouseQuery.getState() + "%");
        }
        if (warehouseQuery.getCity() != null) {
            criteria.andCityLike("%" + warehouseQuery.getCity() + "%");
        }
        Long total = warehouseService.countByExample(example);
        if (pageNo != null) {
            Page page = new Page(pageNo, pageSize, total);
            example.setOffset(page.getOffset());
            example.setLimit(page.getPageSize());
            List<WarehouseVo> warehouseVoList= warehouseService.listByExample(example);
            return ServerResponse.createBySuccess(Const.SUCCESS_MSG, warehouseVoList, page);
        } else {
            List<WarehouseVo> warehouseVoList= warehouseService.listByExample(example);
            return ServerResponse.createBySuccess(Const.SUCCESS_MSG, warehouseVoList);

        }
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.POST)
    @ApiOperation(value = "查看详情")
    public ServerResponse<WarehouseVo> findById(@PathVariable Integer id) {
        WarehouseVo warehouseVo = warehouseService.findById(id);
        return ServerResponse.createBySuccess(Const.SUCCESS_MSG, warehouseVo);
    }

    @RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
    @ApiOperation(value = "更新")
    public ServerResponse<WarehouseVo> update(@PathVariable Integer id,
                                              @RequestBody WarehouseForm warehouseForm) {
        Warehouse warehouse = DozerUtils.convert(warehouseForm, Warehouse.class);
        WarehouseVo warehouseVo = warehouseService.update(id, warehouse);
        return ServerResponse.createBySuccess(Const.SUCCESS_MSG, warehouseVo);
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ApiOperation(value = "新增仓库")
    public ServerResponse<WarehouseVo> insert(@RequestBody WarehouseForm warehouseForm) {
        Warehouse warehouse = DozerUtils.convert(warehouseForm, Warehouse.class);
        WarehouseVo warehouseVo= warehouseService.add(warehouse);
        return ServerResponse.createBySuccess(Const.SUCCESS_MSG, warehouseVo);
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.POST)
    @ApiOperation(value = "删除")
    public ServerResponse delete(@PathVariable Integer id) {
        warehouseService.deleteById(id);
        return ServerResponse.createBySuccess(Const.SUCCESS_MSG, null);
    }

}