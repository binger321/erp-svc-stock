package com.binger.stock.service.impl;

import com.binger.common.ResponseCode;
import com.binger.common.ServerResponse;
import com.binger.common.enums.BillTypeEnum;
import com.binger.common.exception.BusinessException;
import com.binger.common.util.DozerUtils;
import com.binger.stock.controller.form.StockOutBillDetailForm;
import com.binger.stock.controller.form.StockOutBillForm;
import com.binger.stock.controller.form.StockOutBillMainForm;
import com.binger.stock.dao.StockOutBillDetailMapper;
import com.binger.stock.dao.StockOutBillMainMapper;
import com.binger.stock.domain.StockOutBillDetail;
import com.binger.stock.domain.StockOutBillDetailExample;
import com.binger.stock.domain.StockOutBillMain;
import com.binger.stock.dto.query.StockOutMainQueryDto;
import com.binger.stock.dto.ret.StockOutMainRetDto;
import com.binger.stock.enums.StockOutStatusEnum;
import com.binger.stock.remote.RemoteBillCodeCtl;
import com.binger.stock.service.StockOutService;
import com.binger.stock.vo.StockOutBillDetailVo;
import com.binger.stock.vo.StockOutBillMainVo;
import com.binger.stock.vo.StockOutBillVo;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: zhuyubin
 * Date: 2018/5/25
 * Time: 下午3:58
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Service
public class StockOutServiceImpl implements StockOutService {

    @Autowired
    private StockOutBillMainMapper stockOutBillMainMapper;
    @Autowired
    private StockOutBillDetailMapper stockOutBillDetailMapper;
    @Autowired
    private RemoteBillCodeCtl remoteBillCodeCtl;

    @Override
    public Long countByQuery(StockOutMainQueryDto stockOutMainQueryDto) {
        return stockOutBillMainMapper.countByQuery(stockOutMainQueryDto);
    }

    @Override
    public List<StockOutBillMainVo> listByQuery(StockOutMainQueryDto stockOutMainQueryDto) {
        List<StockOutMainRetDto> stockOutMainRetDtoList = stockOutBillMainMapper.listByQuery(stockOutMainQueryDto);
        if (CollectionUtils.isNotEmpty(stockOutMainRetDtoList)) {
            return DozerUtils.convertList(stockOutMainRetDtoList, StockOutBillMainVo.class);
        } else {
            return null;
        }
    }

    @Override
    public StockOutBillVo findById(Integer id) {
        StockOutBillVo stockOutBillVo = new StockOutBillVo();
        StockOutBillMain stockOutBillMain = stockOutBillMainMapper.selectByPrimaryKey(id);
        if (stockOutBillMain != null) {
            stockOutBillVo.setStockOutBillMainVo(DozerUtils.convert(stockOutBillMain, StockOutBillMainVo.class));
            StockOutBillDetailExample example = new StockOutBillDetailExample();
            example.createCriteria().andStockOutBillMainCodeEqualTo(stockOutBillMain.getStockoutBillMainCode());
            List<StockOutBillDetail> stockOutBillDetailList = stockOutBillDetailMapper.selectByExample(example);
            if (CollectionUtils.isNotEmpty(stockOutBillDetailList)) {
                stockOutBillVo.setStockOutBillDetailVoList(DozerUtils.convertList(stockOutBillDetailList, StockOutBillDetailVo.class));
            }
        }
        return stockOutBillVo;

    }

    @Override
    public StockOutBillVo insert(StockOutBillForm stockOutBillForm) {
        StockOutBillMainForm stockOutBillMainForm = stockOutBillForm.getStockOutBillMainForm();
        if (stockOutBillMainForm != null) {
            StockOutBillMain stockOutBillMain = DozerUtils.convert(stockOutBillMainForm, StockOutBillMain.class);
            List<StockOutBillDetailForm> stockOutBillDetailFormList = stockOutBillForm.getStockOutBillDetailFormList();
            if (CollectionUtils.isNotEmpty(stockOutBillDetailFormList)) {
                List<StockOutBillDetail> stockOutBillMainList = DozerUtils.convertList(stockOutBillDetailFormList, StockOutBillDetail.class);
                stockOutBillMain.setStockoutBillMainCode(remoteGenerateBillCode(BillTypeEnum.STOCK_OUT_BILL.getBillType()));
                constructInsertDomain(stockOutBillMain, stockOutBillMainList);
                stockOutBillMainMapper.insertSelective(stockOutBillMain);
                stockOutBillMainList.forEach(stockOutBillDetail -> stockOutBillDetailMapper.insertSelective(stockOutBillDetail));
                return findById(stockOutBillMain.getId());
            }
        }

        throw BusinessException.create("新增失败！");


    }

    @Override
    public StockOutBillVo update(StockOutBillForm stockOutBillForm) {
        StockOutBillMainForm stockOutBillMainForm = stockOutBillForm.getStockOutBillMainForm();
        if (stockOutBillForm != null) {
            StockOutBillMain stockOutBillMain = DozerUtils.convert(stockOutBillMainForm, StockOutBillMain.class);
            if (StockOutStatusEnum.FILE.getCode().equals(stockOutBillMain.getBillType())) {
                throw BusinessException.create("该出库单已归档 无法修改！");
            }
            List<StockOutBillDetailForm> stockOutBillDetailFormList = stockOutBillForm.getStockOutBillDetailFormList();
            if (CollectionUtils.isNotEmpty(stockOutBillDetailFormList)) {
                List<StockOutBillDetail> stockOutBillDetailList = DozerUtils.convertList(stockOutBillDetailFormList, StockOutBillDetail.class);
                constructInsertDomain(stockOutBillMain, stockOutBillDetailList);
                stockOutBillMainMapper.updateByPrimaryKeySelective(stockOutBillMain);
                stockOutBillDetailList.forEach(stockOutBillDetail -> stockOutBillDetailMapper.updateByPrimaryKeySelective(stockOutBillDetail));
                return findById(stockOutBillMain.getId());
            }
        }
        throw BusinessException.create("修改失败！");
    }

    private void constructInsertDomain(StockOutBillMain stockOutBillMain, List<StockOutBillDetail> stockOutBillMainList) {
        BigDecimal totalAmount = new BigDecimal(0);
        for (StockOutBillDetail stockOutBillDetail : stockOutBillMainList) {
            Integer quantity = stockOutBillDetail.getQuantity();
            BigDecimal price = stockOutBillDetail.getPrice();
            BigDecimal totalPrice = price.multiply(new BigDecimal(quantity));
            stockOutBillDetail.setStockOutBillMainCode(stockOutBillMain.getStockoutBillMainCode());
            stockOutBillDetail.setTotalMny(totalPrice);
            totalAmount = totalAmount.add(totalPrice);
        }
        stockOutBillMain.setTotalAmount(totalAmount);
    }

    private String remoteGenerateBillCode(String billType) {
        ServerResponse<String> response = remoteBillCodeCtl.generateBill(billType);
        if (ResponseCode.SUCCESS.getCode() == response.getStatus() && StringUtils.isNotBlank(response.getData())) {
            return response.getData();
        } else {
            throw BusinessException.create("远程获取编号失败！");
        }
    }

}
