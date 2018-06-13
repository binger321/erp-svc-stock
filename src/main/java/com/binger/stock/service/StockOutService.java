package com.binger.stock.service;

import com.binger.stock.controller.form.StockOutBillDetailForm;
import com.binger.stock.controller.form.StockOutBillMainForm;
import com.binger.stock.domain.StockOutBillMain;
import com.binger.stock.dto.query.StockOutMainQueryDto;
import com.binger.stock.vo.StockOutBillDetailVo;
import com.binger.stock.vo.StockOutBillMainVo;

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

    StockOutBillMainVo findById(Integer id);

    StockOutBillMainVo insert(StockOutBillMainForm stockOutBillForm);

    StockOutBillMainVo update(StockOutBillMain stockOutBillForm);

    StockOutBillDetailVo findDetailById(Integer id);

    List<StockOutBillDetailVo> findAllDetail(String stockOutBillMainCode);

    StockOutBillDetailVo insertDetail(StockOutBillDetailForm stockOutBillForm);

    StockOutBillDetailVo updateDetail(StockOutBillDetailForm stockOutBillForm);

    void deleteById(Integer id);

    void deleteDetailById(Integer id);
}
