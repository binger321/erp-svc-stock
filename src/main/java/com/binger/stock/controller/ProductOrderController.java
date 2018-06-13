package com.binger.stock.controller;

import com.binger.common.Const;
import com.binger.common.Page;
import com.binger.common.ServerResponse;
import com.binger.common.util.DozerUtils;
import com.binger.stock.controller.form.ProductOrderDetailForm;
import com.binger.stock.controller.form.ProductOrderMainForm;
import com.binger.stock.controller.query.ProductOrderMainQuery;
import com.binger.stock.dto.query.ProductOrderMainQueryDto;
import com.binger.stock.service.ProductOrderService;
import com.binger.stock.vo.ProductOrderDetailVo;
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

    @ApiOperation(value = "通过主表id查询主表")
    @RequestMapping(value = "/orderMain/findById/{id}", method = RequestMethod.POST)
    public ServerResponse<ProductOrderMainVo> findOrderMainById(@PathVariable Integer id) {
        ProductOrderMainVo productOrderMainVo = productOrderService.findOrderMainById(id);
        return ServerResponse.createBySuccess(Const.SUCCESS_MSG, productOrderMainVo);
    }
    @ApiOperation(value = "通过子表id查询子表")
    @RequestMapping(value = "/orderDetail/findById/{id}", method = RequestMethod.POST)
    public ServerResponse<ProductOrderDetailVo> findById(@PathVariable Integer id) {
        ProductOrderDetailVo productOrderDetaVo = productOrderService.findOrderDetailById(id);
        return ServerResponse.createBySuccess(Const.SUCCESS_MSG, productOrderDetaVo);
    }


    @ApiOperation(value = "新增主表")
    @RequestMapping(value = "/orderMain/insert", method = RequestMethod.POST)
    public ServerResponse<ProductOrderMainVo> insert(@RequestBody ProductOrderMainForm productOrderMainForm) {
        ProductOrderMainVo productOrderMainVo = productOrderService.insertOrderMain(productOrderMainForm);
        return ServerResponse.createBySuccess(Const.SUCCESS_MSG, productOrderMainVo);
    }
    @ApiOperation(value = "新增子表")
    @RequestMapping(value = "/orderDetail/insert", method = RequestMethod.POST)
    public ServerResponse<ProductOrderDetailVo> insertOrderDetail(@RequestBody ProductOrderDetailForm productOrderDetailForm) {
        ProductOrderDetailVo productOrderDetailVo = productOrderService.insertOrderDetail(productOrderDetailForm);
        return ServerResponse.createBySuccess(Const.SUCCESS_MSG, productOrderDetailVo);
    }
    @ApiOperation(value = "修改主表")
    @RequestMapping(value = "/orderMain/update/{id}", method = RequestMethod.POST)
    public ServerResponse<ProductOrderMainVo> updateOrderMain(@RequestBody ProductOrderMainForm productOrderMainForm,@PathVariable("id") Integer id) {
        ProductOrderMainVo productOrderMainVo = productOrderService.updateOrderMain(productOrderMainForm,id);
        return ServerResponse.createBySuccess(Const.SUCCESS_MSG, productOrderMainVo);
    }

    @ApiOperation(value = "修改子表")
    @RequestMapping(value = "/orderDetail/update/{id}", method = RequestMethod.POST)
    public ServerResponse<ProductOrderDetailVo> updateOrderDetail(@RequestBody ProductOrderDetailForm productOrderDetailForm,@PathVariable("id") Integer id) {
        ProductOrderDetailVo productOrderDetailVo = productOrderService.updateOrderDetail(productOrderDetailForm,id);
        return ServerResponse.createBySuccess(Const.SUCCESS_MSG, productOrderDetailVo);
    }


    @ApiOperation(value = "删除主表")
    @RequestMapping(value = "/orderMain/delete/{id}", method = RequestMethod.POST)
    public ServerResponse deleteOrderMail(@PathVariable("id") Integer id) {
        if(productOrderService.deleteOrderMain(id)==1){
            return ServerResponse.createBySuccess(Const.SUCCESS_MSG,null);
        }
        return ServerResponse.createBySuccess(Const.FAIL_MSG, null);
    }

    @ApiOperation(value = "删除子表")
    @RequestMapping(value = "/orderDetail/delete/{id}", method = RequestMethod.POST)
    public ServerResponse updateOrderDetail(@PathVariable("id") Integer id) {
       if (productOrderService.deleteOrderDetail(id)==1){
           return ServerResponse.createBySuccess(Const.SUCCESS_MSG,null);
       }
        return ServerResponse.createBySuccess(Const.FAIL_MSG, null);
    }



    @ApiOperation(value = "审核")
    @RequestMapping(value = "/audit/{id}", method = RequestMethod.POST)
    public ServerResponse<ProductOrderMainVo> audit(@PathVariable Integer id) {
        ProductOrderMainVo productOrderMainVo = productOrderService.audit(id);
        return ServerResponse.createBySuccess(Const.SUCCESS_MSG, productOrderMainVo);
    }

}
