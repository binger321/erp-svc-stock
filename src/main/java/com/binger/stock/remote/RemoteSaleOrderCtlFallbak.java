package com.binger.stock.remote;

import com.binger.common.ServerResponse;
import com.binger.common.apimock.RemoteCtrlFallbackBase;
import com.binger.stock.remote.vo.AverageSaleVo;
import com.binger.stock.remote.vo.SupplierSimpleVo;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: yb
 * Date: 2018/6/13
 * Time: 13:35
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Component
public class RemoteSaleOrderCtlFallbak extends RemoteCtrlFallbackBase implements RemoteSaleOrderCtl{

    @Override
    public ServerResponse<List<AverageSaleVo>> getAverageSale() {
        return getFallbackResponseForList(AverageSaleVo.class);
    }

    @Override
    public ServerResponse<List<SupplierSimpleVo>> listSupplierByGoodsIds(List<Integer> goodsIdList) {
        return getFallbackResponseForList(SupplierSimpleVo.class);
    }
}