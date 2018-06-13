package com.binger.stock.remote;

import com.binger.common.ServerResponse;
import com.binger.stock.remote.vo.AverageSaleVo;
import com.binger.stock.remote.vo.SupplierSimpleVo;
import io.swagger.annotations.ApiOperation;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: yb
 * Date: 2018/6/13
 * Time: 13:35
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@FeignClient(name = "erp-svc-goods1", fallback = RemoteSaleOrderCtlFallbak.class)
@Component
public interface RemoteSaleOrderCtl {

    @ApiOperation(value = "获取平均销量")
    @RequestMapping(value = "/erp-svc-goods/saleOrder/getAverageSale", method = RequestMethod.POST)
    ServerResponse<List<AverageSaleVo>> getAverageSale();

    @ApiOperation(value = "获取goods对应的供应商")
    @RequestMapping(value = "/erp-svc-goods/goodsSupplier/listSupplierByGoodsIds", method = RequestMethod.POST)
    ServerResponse<List<SupplierSimpleVo>> listSupplierByGoodsIds(@RequestBody List<Integer> goodsIdList);
}