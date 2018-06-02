package com.binger.stock.controller;

import com.binger.common.Const;
import com.binger.common.Page;
import com.binger.common.ServerResponse;
import com.binger.stock.controller.query.ProductPlanMainQuery;
import com.binger.stock.domain.ProductPlanMainExample;
import com.binger.stock.service.ProductPlanService;
import com.binger.stock.vo.ProductPlanMainVo;
import com.binger.stock.vo.ProductPlanVo;
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
 * Time: 下午4:42
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Api(value = "生产计划API", description = "生产计划", produces = MediaType.APPLICATION_JSON_VALUE)
@RestController(value = "生产计划controller")
@RequestMapping(value = "/productPlan")
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
        criteria.andProductPlanCodeLike("%"+productPlanMainQuery.getProductPlanCode()+"%");
        criteria.andPlanStatusEqualTo(productPlanMainQuery.getPlanStatus());
        criteria.andAuditUserNameLike(productPlanMainQuery.getAuditUserName());
        criteria.andSupplierIdEqualTo(productPlanMainQuery.getSupplierId());
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
    public ServerResponse<ProductPlanVo> findById(@PathVariable Integer id) {
        ProductPlanVo productPlanVo = productPlanService.findById(id);
        return ServerResponse.createBySuccess(Const.SUCCESS_MSG, productPlanVo);
    }

    @ApiOperation(value = "取消")
    @RequestMapping(value = "/cancel/{id}", method = RequestMethod.POST)
    public ServerResponse<ProductPlanVo> cancelById(@PathVariable Integer id) {
        ProductPlanVo productPlanVo = productPlanService.cancelById(id);
        return ServerResponse.createBySuccess(Const.SUCCESS_MSG, productPlanVo);
    }

    @ApiOperation(value = "生成对应的生产订单")
    @RequestMapping(value = "/audit/{id}", method = RequestMethod.POST)
    public ServerResponse<ProductPlanVo> auditById(@PathVariable Integer id,
                                                   @RequestParam(value = "planStatus") Integer planStatus) {
        ProductPlanVo productPlanVo = productPlanService.auditById(id, planStatus);
        return ServerResponse.createBySuccess(Const.SUCCESS_MSG, productPlanVo);
    }


}
