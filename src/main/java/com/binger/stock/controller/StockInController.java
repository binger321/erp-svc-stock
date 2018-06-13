package com.binger.stock.controller;

import com.binger.common.Const;
import com.binger.common.Page;
import com.binger.common.ServerResponse;
import com.binger.common.util.DozerUtils;
import com.binger.stock.controller.form.StockInBillDetailForm;
import com.binger.stock.controller.form.StockInBillForm;
import com.binger.stock.controller.form.StockInBillMainForm;
import com.binger.stock.controller.query.StockInMainQuery;
import com.binger.stock.domain.StockInBillDetail;
import com.binger.stock.domain.StockInBillMain;
import com.binger.stock.dto.query.StockInMainQueryDto;
import com.binger.stock.service.StockInService;
import com.binger.stock.vo.StockInBillDetailVo;
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
    public ServerResponse<StockInBillMainVo> find(@PathVariable Integer id) {
        StockInBillMainVo stockInBillMainVo = stockInService.findById(id);
        return ServerResponse.createBySuccess(Const.SUCCESS_MSG, stockInBillMainVo);
    }

    @ApiOperation(value = "根据主单查询全部入库详情")
    @RequestMapping(value = "/findAllDetail/{id}", method = RequestMethod.POST)
    public ServerResponse<List<StockInBillDetailVo>> findAllDetail(@PathVariable Integer id) {
        List<StockInBillDetailVo> stockInBillDetailVoList = stockInService.findAllDetailById(id);
        return ServerResponse.createBySuccess(Const.SUCCESS_MSG, stockInBillDetailVoList);
    }

    @ApiOperation(value = "根据id查询入库详情")
    @RequestMapping(value = "/findDetail/{id}", method = RequestMethod.POST)
    public ServerResponse<StockInBillDetailVo> findDetail(@PathVariable Integer id) {
        StockInBillDetailVo stockInBillDetailVo = stockInService.findDetailById(id);
        return ServerResponse.createBySuccess(Const.SUCCESS_MSG, stockInBillDetailVo);
    }

    @ApiOperation(value = "新增入库单")
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public ServerResponse<StockInBillMainVo> insert(@RequestBody StockInBillMainForm stockInBillMainForm) {
        StockInBillMainVo stockInBillMainVo = stockInService.insert(stockInBillMainForm);
        return ServerResponse.createBySuccess(Const.SUCCESS_MSG, stockInBillMainVo);
    }

    @ApiOperation(value = "新增入库单详情")
    @RequestMapping(value = "/addDetail", method = RequestMethod.POST)
    public ServerResponse<StockInBillDetailVo> insertDetail(@RequestBody StockInBillDetailForm stockInBillDetailForm,
                                                            @RequestParam(value = "mainCode") String stockInBillMainCode) {
        StockInBillDetailVo stockInBillDetailVo = stockInService.insertDetail(stockInBillDetailForm, stockInBillMainCode);
        return ServerResponse.createBySuccess(Const.SUCCESS_MSG, stockInBillDetailVo);
    }

    @ApiOperation(value = "更新入库单")
    @RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
    public ServerResponse<StockInBillMainVo> update(@PathVariable Integer id,
                                                    @RequestBody StockInBillMainForm stockInBillMainForm) {
        stockInBillMainForm.setId(id);
        StockInBillMain stockInBillMain = DozerUtils.convert(stockInBillMainForm, StockInBillMain.class);
        StockInBillMainVo stockInBillMainVo = stockInService.update(stockInBillMain);
        return ServerResponse.createBySuccess(Const.SUCCESS_MSG, stockInBillMainVo);
    }

    @ApiOperation(value = "更新入库单详情")
    @RequestMapping(value = "/updateDetail/{id}", method = RequestMethod.POST)
    public ServerResponse<StockInBillDetailVo> updateDetail(@PathVariable Integer id,
                                                            @RequestBody StockInBillDetailForm stockInBillDetailForm,
                                                            @RequestParam(value = "mainCode") String stockInBillMainCode) {
        stockInBillDetailForm.setId(id);
        StockInBillDetailVo stockInBillDetailVo = stockInService.updateDetail(stockInBillDetailForm, stockInBillMainCode);
        return ServerResponse.createBySuccess(Const.SUCCESS_MSG, stockInBillDetailVo);
    }

    @ApiOperation(value = "删除入库单")
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.POST)
    public ServerResponse delete(@PathVariable Integer id) {
        stockInService.deleteById(id);
        return ServerResponse.createBySuccess(Const.SUCCESS_MSG, null);
    }


    @ApiOperation(value = "删除入库单")
    @RequestMapping(value = "/deleteDetail/{id}", method = RequestMethod.POST)
    public ServerResponse deleteDetail(@PathVariable Integer id) {
        stockInService.deleteDetailById(id);
        return ServerResponse.createBySuccess(Const.SUCCESS_MSG, null);
    }
}
