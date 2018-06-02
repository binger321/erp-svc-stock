package com.binger.stock.service.impl;

import com.binger.common.ResponseCode;
import com.binger.common.ServerResponse;
import com.binger.common.enums.BillTypeEnum;
import com.binger.common.exception.BusinessException;
import com.binger.common.util.DozerUtils;
import com.binger.stock.controller.form.StockInBillDetailForm;
import com.binger.stock.controller.form.StockInBillForm;
import com.binger.stock.controller.form.StockInBillMainForm;
import com.binger.stock.dao.StockInBillDetailMapper;
import com.binger.stock.dao.StockInBillMainMapper;
import com.binger.stock.domain.StockInBillDetail;
import com.binger.stock.domain.StockInBillDetailExample;
import com.binger.stock.domain.StockInBillMain;
import com.binger.stock.domain.StockInBillMainExample;
import com.binger.stock.dto.query.StockInMainQueryDto;
import com.binger.stock.dto.ret.StockInMainRetDto;
import com.binger.stock.enums.StockInBillTypeEnum;
import com.binger.stock.enums.StockInStatusEnum;
import com.binger.stock.remote.RemoteBillCodeCtl;
import com.binger.stock.service.StockInService;
import com.binger.stock.vo.StockInBillDetailVo;
import com.binger.stock.vo.StockInBillMainVo;
import com.binger.stock.vo.StockInBillVo;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.List;

import static java.util.stream.Collectors.toList;

/**
 * Created with IntelliJ IDEA.
 * User: zhuyubin
 * Date: 2018/5/18
 * Time: 上午8:54
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Service
public class StockInServiceImpl implements StockInService {

    @Autowired
    private StockInBillMainMapper stockInBillMainMapper;
    @Autowired
    private StockInBillDetailMapper stockInBillDetailMapper;
    @Autowired
    private RemoteBillCodeCtl remoteBillCodeCtl;

    @Override
    public long countByQuery(StockInMainQueryDto stockInMainQueryDto) {
        return stockInBillMainMapper.countByQueryDto(stockInMainQueryDto);
    }

    @Override
    public List<StockInBillMainVo> listByQuery(StockInMainQueryDto stockInMainQueryDto) {
        stockInMainQueryDto.setOrderByClause("id DESC");
        List<StockInMainRetDto> stockInMainRetDtoList = stockInBillMainMapper.selectByQuery(stockInMainQueryDto);
        if (CollectionUtils.isNotEmpty(stockInMainRetDtoList)) {
            List<StockInBillMainVo> stockInBillMainVoList =
                    stockInMainRetDtoList
                    .stream()
                    .map(stockInMainRetDto -> {
                        StockInBillMainVo stockInBillMainVo = DozerUtils.convert(stockInMainRetDto, StockInBillMainVo.class);
                        stockInBillMainVo.setBillTypeStr(StockInBillTypeEnum.getBillTypeByCode(stockInBillMainVo.getBillType()).getType());
                        stockInBillMainVo.setStockinStatusStr(StockInStatusEnum.getStockInStatusByCode(stockInBillMainVo.getStockinStatus()).getStatus());
                        return stockInBillMainVo; })
                    .collect(toList());
            return stockInBillMainVoList;
        } else {
            return null;
        }
    }

    @Override
    public StockInBillVo findById(Integer id) {
        StockInBillVo stockInBillVo = new StockInBillVo();

        StockInBillMain stockInBillMain = stockInBillMainMapper.selectByPrimaryKey(id);
        if (stockInBillMain != null) {
            stockInBillVo.setStockInBillMainVo(DozerUtils.convert(stockInBillMain, StockInBillMainVo.class));
            StockInBillDetailExample stockInBillDetailExample = new StockInBillDetailExample();
            StockInBillDetailExample.Criteria criteria = stockInBillDetailExample.createCriteria();
            criteria.andStockInBillMainCodeEqualTo(stockInBillMain.getStockInBillMainCode());
            List<StockInBillDetail> stockInBillDetailList = stockInBillDetailMapper.selectByExample(stockInBillDetailExample);
            if (CollectionUtils.isNotEmpty(stockInBillDetailList)) {
                stockInBillVo.setStockInBillDetailVoList(DozerUtils.convertList(stockInBillDetailList, StockInBillDetailVo.class));
            }
        }
        return stockInBillVo;
    }

    @Override
    @Transactional
    public StockInBillMainVo insert(StockInBillForm stockInBillForm) {
        StockInBillMain stockInBillMain = DozerUtils.convert(stockInBillForm.getStockInBillMainForm(), StockInBillMain.class);
        checkUnique(stockInBillMain.getProductOrderCode(), null);
        //远程调用获取单据编号
        String billCode = remoteGenerateBillCode(BillTypeEnum.STOCK_IN_BILL.getBillType());
        stockInBillMain.setStockInBillMainCode(billCode);
        List<StockInBillDetailForm> stockInBillDetailFormList = stockInBillForm.getStockInBillDetailFormList();
        List<StockInBillDetail> stockInBillDetailList = null;
        if (CollectionUtils.isNotEmpty(stockInBillDetailFormList)) {
            stockInBillDetailList = DozerUtils.convertList(stockInBillForm.getStockInBillDetailFormList(), StockInBillDetail.class);
        }
        constructInsertDto(stockInBillMain, stockInBillDetailList);
        stockInBillMainMapper.insert(stockInBillMain);
        if (CollectionUtils.isNotEmpty(stockInBillDetailList)) {
            stockInBillDetailList.forEach(stockInBillDetail -> stockInBillDetailMapper.insert(stockInBillDetail));
        }
        StockInBillMain stockInBillMain1 = stockInBillMainMapper.selectByPrimaryKey(stockInBillMain.getId());
        if (stockInBillMain1 != null) {
            return DozerUtils.convert(stockInBillMain1, StockInBillMainVo.class);
        }
        return null;
    }

    @Override
    @Transactional
    public StockInBillVo update(StockInBillForm stockInBillForm) {
        StockInBillMainForm stockInBillMainForm = stockInBillForm.getStockInBillMainForm();
        StockInBillMain stockInBillMain = DozerUtils.convert(stockInBillMainForm, StockInBillMain.class);
        stockInBillMainMapper.updateByPrimaryKey(stockInBillMain);
        List<StockInBillDetailForm> stockInBillDetailFormList = stockInBillForm.getStockInBillDetailFormList();
        if (CollectionUtils.isNotEmpty(stockInBillDetailFormList)) {
            stockInBillDetailFormList.forEach(stockInBillDetailForm -> {
                StockInBillDetail stockInBillDetail = DozerUtils.convert(stockInBillDetailForm, StockInBillDetail.class);
                stockInBillDetailMapper.updateByPrimaryKey(stockInBillDetail);
            });
        }
        return findById(stockInBillMainForm.getId());

    }

    /**
     * 拼装插入的内容
     * @param stockInBillMain
     * @param stockInBillDetailList
     */
    private void constructInsertDto(StockInBillMain stockInBillMain, List<StockInBillDetail> stockInBillDetailList) {
        String billMainCode = stockInBillMain.getStockInBillMainCode();
        stockInBillMain.setStockinStatus(StockInStatusEnum.STOCK_IN_BILL_SAVE.getCode());
        Integer totalQuantity = 0;
        BigDecimal totalPrice = new BigDecimal(0);
        if (CollectionUtils.isNotEmpty(stockInBillDetailList)) {
            for (StockInBillDetail stockInBillDetail : stockInBillDetailList) {
                stockInBillDetail.setStockInBillMainCode(billMainCode);
                totalQuantity = totalQuantity + stockInBillDetail.getQuantity();
                stockInBillDetail.setTotalPrice(stockInBillDetail.getPrice().multiply(new BigDecimal(stockInBillDetail.getQuantity())));
                stockInBillDetail.setStockInBillDetailCode(remoteGenerateBillCode(BillTypeEnum.STOCK_IN_DETAIL_BILL.getBillType()));
                totalPrice = totalPrice.add(stockInBillDetail.getTotalPrice());
            }
        }
        stockInBillMain.setApplyQuantity(totalQuantity);
        stockInBillMain.setStockInMoney(totalPrice);



    }

    private String remoteGenerateBillCode(String billType) {
        ServerResponse<String> response = remoteBillCodeCtl.generateBill(billType);
        if (response.getStatus() == ResponseCode.SUCCESS.getCode() && StringUtils.isNotBlank(response.getData())) {
            return response.getData();
        } else {
            throw BusinessException.create("远程调用获取编号失败!");
        }
    }

    private void checkUnique(String productOrderCode, Integer id) {
        if (StringUtils.isBlank(productOrderCode)) {
            return;
        }
        StockInBillMainExample example = new StockInBillMainExample();
        StockInBillMainExample.Criteria criteria = example.createCriteria();
        criteria.andStockInBillMainCodeEqualTo(productOrderCode);
        if (id != null) {
            criteria.andIdNotEqualTo(id);
        }
        long count = stockInBillMainMapper.countByExample(example);
        if (count > 0) {
            throw BusinessException.create("该入库单编号已存在！");
        }
    }
}
