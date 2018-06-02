package com.binger.stock.service;

import com.binger.stock.controller.form.StockOutBillForm;
import com.binger.stock.dto.query.StockOutMainQueryDto;
import com.binger.stock.vo.StockOutBillMainVo;
import com.binger.stock.vo.StockOutBillVo;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: zhuyubin
 * Date: 2018/5/25
 * Time: 下午3:58
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public interface StockOutService {
    Long countByQuery(StockOutMainQueryDto stockOutMainQueryDto);

    List<StockOutBillMainVo> listByQuery(StockOutMainQueryDto stockOutMainQueryDto);

    StockOutBillVo findById(Integer id);

    StockOutBillVo insert(StockOutBillForm stockOutBillForm);

    StockOutBillVo update(StockOutBillForm stockOutBillForm);
}
