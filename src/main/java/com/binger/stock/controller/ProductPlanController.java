package com.binger.stock.controller;

import com.binger.common.Const;
import com.binger.common.Page;
import com.binger.common.ServerResponse;
import com.binger.stock.controller.query.ProductPlanMainQuery;
import com.binger.stock.domain.ProductPlanMainExample;
import com.binger.stock.service.ProductPlanService;
import com.binger.stock.vo.ProductPlanDetailVo;
import com.binger.stock.vo.ProductPlanMainVo;
import com.binger.stock.vo.ProductPlanVo;
import com.ctc.wstx.util.StringUtil;
import com.mysql.fabric.Server;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: zhuyubin
 * Date: 2018/5/24
 * Time: 下午4:42
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Api(value = "生产计划API", description = "生产计划", produces = MediaType.APPLICATION_JSON_VALUE)
@RestController(value = "生产计划controller")
@RequestMapping(value = "/erp-svc-stock/productPlan")
public class ProductPlanController {
    @Autowired
    private ProductPlanService productPlanService;

    @ApiOperation(value = "列表")
    @RequestMapping(value = "/list", method = RequestMethod.POST)
    public ServerResponse<List<ProductPlanMainVo>> list(@RequestBody(required = false) ProductPlanMainQuery productPlanMainQuery,
                                                       @RequestParam(required = false) Integer pageNo,
                                                       @RequestParam(required = false) Integer pageSize){
        ProductPlanMainExample example = new ProductPlanMainExample();
        ProductPlanMainExample.Criteria criteria= example.createCriteria();
        if (StringUtils.isNotBlank(productPlanMainQuery.getProductPlanCode())) {
            criteria.andProductPlanCodeLike("%"+productPlanMainQuery.getProductPlanCode()+"%");
        }
        if (productPlanMainQuery.getPlanStatus() != null) {
            criteria.andPlanStatusEqualTo(productPlanMainQuery.getPlanStatus());
        }
        if (productPlanMainQuery.getSupplierId() != null) {
            criteria.andSupplierIdEqualTo(productPlanMainQuery.getSupplierId());
        }
        if (pageNo != null) {
            Long total = productPlanService.countByExample(example);
            Page page = new Page(pageNo, pageSize, total);
            example.setLimit(page.getPageSize());
            example.setOffset(page.getOffset());
            List<ProductPlanMainVo> productPlanMainVoList = productPlanService.selectByExample(example);
            return ServerResponse.createBySuccess(Const.SUCCESS_MSG, productPlanMainVoList, page);
        } else {
            List<ProductPlanMainVo> productPlanMainVoList = productPlanService.selectByExample(example);
            return ServerResponse.createBySuccess(Const.SUCCESS_MSG, productPlanMainVoList);
        }

    }

    @ApiOperation(value = "查看详情")
    @RequestMapping(value = "/findById/{id}", method = RequestMethod.POST)
    public ServerResponse<List<ProductPlanDetailVo>> findById(@PathVariable Integer id) {
        List<ProductPlanDetailVo> productPlanDetailVoList = productPlanService.findDetailByMainId(id);
        return ServerResponse.createBySuccess(Const.SUCCESS_MSG, productPlanDetailVoList);
    }

    @ApiOperation(value = "取消")
    @RequestMapping(value = "/cancel/{id}", method = RequestMethod.POST)
    public ServerResponse<ProductPlanVo> cancelById(@PathVariable Integer id) {
        ProductPlanVo productPlanVo = productPlanService.cancelById(id);
        return ServerResponse.createBySuccess(Const.SUCCESS_MSG, productPlanVo);
    }

    @ApiOperation(value = "生成对应的生产订单")
    @RequestMapping(value = "/audit/{id}", method = RequestMethod.POST)
    public ServerResponse<ProductPlanVo> auditById(@PathVariable Integer id) {
        ProductPlanVo productPlanVo = productPlanService.auditById(id);
        return ServerResponse.createBySuccess(Const.SUCCESS_MSG, productPlanVo);
    }

    @ApiOperation(value = "手动执行备货计划")
    @RequestMapping(value = "/stockPlan", method = RequestMethod.POST)
    public ServerResponse<Boolean> stockPlan(){
        Boolean b = productPlanService.generateProductPlan();
        return ServerResponse.createBySuccess(Const.SUCCESS_MSG, b);
    }


}
