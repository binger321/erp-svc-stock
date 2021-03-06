package com.binger.stock.service;

import com.binger.stock.controller.form.StockInBillDetailForm;
import com.binger.stock.controller.form.StockInBillMainForm;
import com.binger.stock.domain.StockInBillMain;
import com.binger.stock.dto.query.StockInMainQueryDto;
import com.binger.stock.vo.StockInBillDetailVo;
import com.binger.stock.vo.StockInBillMainVo;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: zhuyubin
 * Date: 2018/5/18
 * Time: 上午8:53
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public interface StockInService {


    /**
     * 计数
     * @param stockInMainQueryDto
     * @return
     */
    long countByQuery(StockInMainQueryDto stockInMainQueryDto);


    /**
     * 列表
     * @param stockInMainQueryDto
     * @return
     */
    List<StockInBillMainVo> listByQuery(StockInMainQueryDto stockInMainQueryDto);

    /**
     * 根据id查询
     * @param id
     * @return
     */
    StockInBillMainVo findById(Integer id);

    /**
     * 新增form
     * @param stockInBillForm
     * @return
     */
    StockInBillMainVo insert(StockInBillMainForm stockInBillForm);

    /**
     * 修改form
     * @param stockInBillForm
     * @return
     */
    StockInBillMainVo update(StockInBillMain stockInBillForm);

    List<StockInBillDetailVo> findAllDetailById(Integer id);

    StockInBillDetailVo insertDetail(StockInBillDetailForm stockInBillMainForm, String stockInBillMainCode);

    StockInBillDetailVo updateDetail(StockInBillDetailForm stockInBillDetailForm, String stockInBillMainCode);

    void deleteById(Integer id);

    void deleteDetailById(Integer id);

    StockInBillDetailVo findDetailById(Integer id);
}
