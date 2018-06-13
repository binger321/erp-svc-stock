package com.binger.stock.remote;

import com.binger.common.ServerResponse;
import io.swagger.annotations.ApiOperation;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created with IntelliJ IDEA.
 * User: zhuyubin
 * Date: 2018/5/18
 * Time: 下午1:46
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@FeignClient(name = "erp-svc-goods1", fallback = RemoteBillCodeCtlFallbak.class)
@Component
public interface RemoteBillCodeCtl {
    /**
     * 根据单据类型获取单号
     */
    @ApiOperation(value = "根据单据类型获取单号")
    @RequestMapping(value = "/erp-svc-goods/billCode/generateBill", method = RequestMethod.POST)
    ServerResponse<String> generateBill(@RequestBody String billType);

}
