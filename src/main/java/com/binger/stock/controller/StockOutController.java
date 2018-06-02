package com.binger.stock.controller;

import com.binger.common.Const;
import com.binger.common.Page;
import com.binger.common.ServerResponse;
import com.binger.common.util.DozerUtils;
import com.binger.stock.controller.form.StockOutBillForm;
import com.binger.stock.controller.query.StockOutBillMainQuery;
import com.binger.stock.dto.query.StockOutMainQueryDto;
import com.binger.stock.service.StockOutService;
import com.binger.stock.vo.StockOutBillMainVo;
import com.binger.stock.vo.StockOutBillVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: zhuyubin
 * Date: 2018/5/25
 * Time: 下午2:39
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Api(value = "stockOut", description = "库存出库接口", produces = MediaType.APPLICATION_JSON_VALUE)
@RestController(value = "出库API")
@RequestMapping(value = "/erp-svc-stock/stockOut")
public class StockOutController {

    @Autowired
    private StockOutService stockOutService;

    @ApiOperation("列表")
    @RequestMapping(value = "/list", method = RequestMethod.POST)
    public ServerResponse<List<StockOutBillMainVo>> list(@RequestBody(required = false) StockOutBillMainQuery query,
                                                         @RequestParam(value = "pageNo", required = false) Integer pageNo,
                                                         @RequestParam(value = "pageSize", required = false) Integer pageSize) {
        StockOutMainQueryDto stockOutMainQueryDto = DozerUtils.convert(query, StockOutMainQueryDto.class);
        if (pageNo != null) {
            Long total = stockOutService.countByQuery(stockOutMainQueryDto);
            Page page = new Page(pageNo, pageSize, total);
            stockOutMainQueryDto.setOffset(page.getOffset());
            stockOutMainQueryDto.setLimit(page.getPageSize());
            List<StockOutBillMainVo> stockOutBillMainVoList = stockOutService.listByQuery(stockOutMainQueryDto);
            return ServerResponse.createBySuccess(Const.SUCCESS_MSG, stockOutBillMainVoList);
        } else {
            List<StockOutBillMainVo> stockOutBillMainVoList = stockOutService.listByQuery(stockOutMainQueryDto);
            return ServerResponse.createBySuccess(Const.SUCCESS_MSG, stockOutBillMainVoList);
        }
    }

    @ApiOperation("查询")
    @RequestMapping(value = "/findById/{id}", method = RequestMethod.POST)
    public ServerResponse<StockOutBillVo> findById(@PathVariable Integer id) {
        StockOutBillVo stockOutBillVo = stockOutService.findById(id);
        return ServerResponse.createBySuccess(Const.SUCCESS_MSG, stockOutBillVo);
    }

    @ApiOperation("新增")
    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public ServerResponse<StockOutBillVo> insert(@RequestBody StockOutBillForm stockOutBillForm) {
        StockOutBillVo stockOutBillVo = stockOutService.insert(stockOutBillForm);
        return ServerResponse.createBySuccess(Const.SUCCESS_MSG, stockOutBillVo);
    }

    @ApiModelProperty("修改")
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public ServerResponse<StockOutBillVo> update(@RequestBody StockOutBillForm stockOutBillForm) {
        StockOutBillVo stockOutBillVo = stockOutService.update(stockOutBillForm);
        return ServerResponse.createBySuccess(Const.SUCCESS_MSG, stockOutBillVo);
    }
}
