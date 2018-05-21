package com.binger.stock.remote;

import com.binger.common.ServerResponse;
import com.binger.common.apimock.RemoteCtrlFallbackBase;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 * User: zhuyubin
 * Date: 2018/5/18
 * Time: 下午1:47
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Component
public class RemoteBillCodeCtlFallbak extends RemoteCtrlFallbackBase implements RemoteBillCodeCtl{
    @Override
    public ServerResponse<String> generateBill(String billType) {
        return getFallbackResponseForSingle(String.class);
    }
}
