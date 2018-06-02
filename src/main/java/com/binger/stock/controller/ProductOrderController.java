package com.binger.stock.controller;

import com.binger.common.Const;
import com.binger.common.Page;
import com.binger.common.ServerResponse;
import com.binger.common.util.DozerUtils;
import com.binger.stock.controller.form.ProductOrderForm;
import com.binger.stock.controller.query.ProductOrderMainQuery;
import com.binger.stock.dto.query.ProductOrderMainQueryDto;
import com.binger.stock.service.ProductOrderService;
import com.binger.stock.vo.ProductOrderMainVo;
import com.binger.stock.vo.ProductOrderVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: zhuyubin
 * Date: 2018/5/24
 * Time: 上午9:06
 * To change this template use File | Settings | File Templates.
 * Description:
 */

@Api(value = "生产API", description = "生产订单接口", produces = MediaType.APPLICATION_JSON_VALUE)
@RestController(value = "生产订单API")
@RequestMapping(value = "/erp-svc-stock/productOrder")
public class ProductOrderController {

    @Autowired
    private ProductOrderService productOrderService;
    @ApiOperation(value = "列表")
    @RequestMapping(value = "/list", method = RequestMethod.POST)
    public ServerResponse<List<ProductOrderMainVo>> list(@RequestBody(required = false) ProductOrderMainQuery productOrderMainQuery,
                                                   @RequestParam(required = false) Integer pageNo,
                                                   @RequestParam(required = false) Integer pageSize) {
        ProductOrderMainQueryDto productOrderMainQueryDto = DozerUtils.convert(productOrderMainQuery, ProductOrderMainQueryDto.class);
        if (pageNo != null) {
            Long total = productOrderService.countByQuery(productOrderMainQueryDto);
            Page page = new Page(pageNo, pageSize, total);
            productOrderMainQueryDto.setOffset(page.getOffset());
            productOrderMainQueryDto.setLimit(page.getPageSize());
            List<ProductOrderMainVo> productOrderMainVoList = productOrderService.listByQuery(productOrderMainQueryDto);
            return ServerResponse.createBySuccess(Const.SUCCESS_MSG, productOrderMainVoList);
        } else {
            List<ProductOrderMainVo> productOrderMainVoList = productOrderService.listByQuery(productOrderMainQueryDto);
            return ServerResponse.createBySuccess(Const.SUCCESS_MSG, productOrderMainVoList);
        }
    }

    @ApiOperation(value = "查询")
    @RequestMapping(value = "/findById/{id}", method = RequestMethod.POST)
    public ServerResponse<ProductOrderVo> findById(@PathVariable Integer id) {
        ProductOrderVo productOrderVo = productOrderService.findById(id);
        return ServerResponse.createBySuccess(Const.SUCCESS_MSG, productOrderVo);
    }

    @ApiOperation(value = "新增")
    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public ServerResponse<ProductOrderVo> insert(@RequestBody ProductOrderForm productOrderForm) {
        ProductOrderVo productOrderVo = productOrderService.insert(productOrderForm);
        return ServerResponse.createBySuccess(Const.SUCCESS_MSG, productOrderVo);
    }

    @ApiOperation(value = "修改")
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public ServerResponse<ProductOrderVo> update(@RequestBody ProductOrderForm productOrderForm) {
        ProductOrderVo productOrderVo = productOrderService.update(productOrderForm);
        return ServerResponse.createBySuccess(Const.SUCCESS_MSG, productOrderVo);
    }

    @ApiOperation(value = "审核")
    @RequestMapping(value = "/audit/{id}", method = RequestMethod.POST)
    public ServerResponse<ProductOrderMainVo> audit(@PathVariable Integer id) {
        ProductOrderMainVo productOrderMainVo = productOrderService.audit(id);
        return ServerResponse.createBySuccess(Const.SUCCESS_MSG, productOrderMainVo);
    }
}
