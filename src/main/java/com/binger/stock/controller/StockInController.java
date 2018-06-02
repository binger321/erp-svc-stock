package com.binger.stock.controller;

import com.binger.common.Const;
import com.binger.common.Page;
import com.binger.common.ServerResponse;
import com.binger.common.util.DozerUtils;
import com.binger.stock.controller.form.StockInBillForm;
import com.binger.stock.controller.query.StockInMainQuery;
import com.binger.stock.dto.query.StockInMainQueryDto;
import com.binger.stock.service.StockInService;
import com.binger.stock.vo.StockInBillMainVo;
import com.binger.stock.vo.StockInBillVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: zhuyubin
 * Date: 2018/5/17
 * Time: 下午4:45
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Api(value = "stockIn", description = "库存入库接口", produces = MediaType.APPLICATION_JSON_VALUE)
@RestController(value = "入库API")
@RequestMapping(value = "/erp-svc-stock/stockIn")
public class StockInController {

    @Autowired
    private StockInService stockInService;

    @ApiOperation(value = "入库主列表")
    @RequestMapping(value = "/list", method = RequestMethod.POST)
    public ServerResponse<List<StockInBillMainVo>> list(@RequestBody(required = false) StockInMainQuery stockInMainQuery,
                                                        @RequestParam(required = false) Integer pageNo,
                                                        @RequestParam(required = false) Integer pageSize) {
        StockInMainQueryDto stockInMainQueryDto = DozerUtils.convert(stockInMainQuery, StockInMainQueryDto.class);
        if (pageNo != null) {
            long total = stockInService.countByQuery(stockInMainQueryDto);
            Page page = new Page(pageNo, pageSize, total);
            stockInMainQueryDto.setOffset(page.getOffset());
            stockInMainQueryDto.setLimit(page.getPageSize());
            List<StockInBillMainVo> stockInBillMainVoList = stockInService.listByQuery(stockInMainQueryDto);
            return ServerResponse.createBySuccess(Const.SUCCESS_MSG, stockInBillMainVoList, page);
        } else {
            List<StockInBillMainVo> stockInBillMainVoList = stockInService.listByQuery(stockInMainQueryDto);
            return ServerResponse.createBySuccess(Const.SUCCESS_MSG, stockInBillMainVoList);
        }
    }

    @ApiOperation(value = "根据id查询入库")
    @RequestMapping(value = "/find/{id}", method = RequestMethod.POST)
    public ServerResponse<StockInBillVo> find(@PathVariable Integer id) {
        StockInBillVo stockInBillVo = stockInService.findById(id);
        return ServerResponse.createBySuccess(Const.SUCCESS_MSG, stockInBillVo);
    }

    @ApiOperation(value = "新增入库单")
    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public ServerResponse<StockInBillMainVo> insert(@RequestBody StockInBillForm stockInBillMainForm) {
        StockInBillMainVo stockInBillMainVo = stockInService.insert(stockInBillMainForm);
        return ServerResponse.createBySuccess(Const.SUCCESS_MSG, stockInBillMainVo);
    }

    @ApiOperation(value = "更新入库单")
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public ServerResponse<StockInBillVo> update(@RequestBody StockInBillForm stockInBillForm) {
        StockInBillVo stockInBillVo = stockInService.update(stockInBillForm);
        return ServerResponse.createBySuccess(Const.SUCCESS_MSG, stockInBillVo);
    }
}
