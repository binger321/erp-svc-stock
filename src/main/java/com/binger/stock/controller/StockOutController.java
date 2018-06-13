package com.binger.stock.controller;

import com.binger.common.Const;
import com.binger.common.Page;
import com.binger.common.ServerResponse;
import com.binger.common.util.DozerUtils;
import com.binger.stock.controller.form.StockOutBillDetailForm;
import com.binger.stock.controller.form.StockOutBillForm;
import com.binger.stock.controller.form.StockOutBillMainForm;
import com.binger.stock.controller.query.StockOutBillMainQuery;
import com.binger.stock.domain.StockOutBillMain;
import com.binger.stock.dto.query.StockOutMainQueryDto;
import com.binger.stock.service.StockOutService;
import com.binger.stock.vo.StockOutBillDetailVo;
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
    public ServerResponse<StockOutBillMainVo> findById(@PathVariable Integer id) {
        StockOutBillMainVo stockOutBillMainVo = stockOutService.findById(id);
        return ServerResponse.createBySuccess(Const.SUCCESS_MSG, stockOutBillMainVo);
    }

    @ApiOperation("查询所有子单")
    @RequestMapping(value = "/findAllDetail", method = RequestMethod.POST)
    public ServerResponse<List<StockOutBillDetailVo>> findAllDetail(@RequestParam(value = "mainCode") String stockOutBillMainCode) {
        List<StockOutBillDetailVo> stockOutBillDetailVoList = stockOutService.findAllDetail(stockOutBillMainCode);
        return ServerResponse.createBySuccess(Const.SUCCESS_MSG, stockOutBillDetailVoList);
    }

    @ApiOperation("查询单个子单")
    @RequestMapping(value = "/findDetailById/{id}", method = RequestMethod.POST)
    public ServerResponse<StockOutBillDetailVo> findDetailById(@PathVariable Integer id) {
        StockOutBillDetailVo stockOutBillDetailVo = stockOutService.findDetailById(id);
        return ServerResponse.createBySuccess(Const.SUCCESS_MSG, stockOutBillDetailVo);
    }

    @ApiOperation("新增")
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public ServerResponse<StockOutBillMainVo> insert(@RequestBody StockOutBillMainForm stockOutBillMainForm) {
        StockOutBillMainVo stockOutBillMainVo = stockOutService.insert(stockOutBillMainForm);
        return ServerResponse.createBySuccess(Const.SUCCESS_MSG, stockOutBillMainVo);
    }

    @ApiOperation("新增")
    @RequestMapping(value = "/addDetail", method = RequestMethod.POST)
    public ServerResponse<StockOutBillDetailVo> insertDetail(@RequestBody StockOutBillDetailForm stockOutBillDetailForm) {
        StockOutBillDetailVo stockOutBillDetailVo = stockOutService.insertDetail(stockOutBillDetailForm);
        return ServerResponse.createBySuccess(Const.SUCCESS_MSG, stockOutBillDetailVo);
    }

    @ApiModelProperty("修改")
    @RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
    public ServerResponse<StockOutBillMainVo> update(@PathVariable Integer id,
                                                     @RequestBody StockOutBillMainForm stockOutBillMainForm) {
        StockOutBillMain stockOutBillMain = DozerUtils.convert(stockOutBillMainForm, StockOutBillMain.class);
        stockOutBillMain.setId(id);
        StockOutBillMainVo stockOutBillMainVo = stockOutService.update(stockOutBillMain);
        return ServerResponse.createBySuccess(Const.SUCCESS_MSG, stockOutBillMainVo);
    }

    @ApiModelProperty("修改")
    @RequestMapping(value = "/updateDetail/{id}", method = RequestMethod.POST)
    public ServerResponse<StockOutBillDetailVo> update(@PathVariable Integer id,
                                                       @RequestBody StockOutBillDetailForm stockOutBillDetailForm) {
        stockOutBillDetailForm.setId(id);
        StockOutBillDetailVo stockOutBillDetailVo = stockOutService.updateDetail(stockOutBillDetailForm);
        return ServerResponse.createBySuccess(Const.SUCCESS_MSG, stockOutBillDetailVo);
    }


    @ApiModelProperty("修改")
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.POST)
    public ServerResponse delete(@PathVariable Integer id) {
        stockOutService.deleteById(id);
        return ServerResponse.createBySuccess(Const.SUCCESS_MSG, null);
    }


    @ApiModelProperty("修改")
    @RequestMapping(value = "/deleteDetail/{id}", method = RequestMethod.POST)
    public ServerResponse deleteDetail(@PathVariable Integer id) {
        stockOutService.deleteDetailById(id);
        return ServerResponse.createBySuccess(Const.SUCCESS_MSG, null);
    }


}
