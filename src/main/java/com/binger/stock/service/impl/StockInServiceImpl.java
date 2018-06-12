package com.binger.stock.service.impl;

import com.binger.common.ResponseCode;
import com.binger.common.ServerResponse;
import com.binger.common.enums.BillTypeEnum;
import com.binger.common.exception.BusinessException;
import com.binger.common.util.DozerUtils;
import com.binger.stock.controller.form.StockInBillDetailForm;
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
    public StockInBillMainVo findById(Integer id) {
        StockInBillMain stockInBillMain = stockInBillMainMapper.selectByPrimaryKey(id);
        if (stockInBillMain != null) {
            StockInBillMainVo stockInBillMainVo = DozerUtils.convert(stockInBillMain, StockInBillMainVo.class);
            stockInBillMainVo.setStockinStatusStr(StockInStatusEnum.getStockInStatusByCode(stockInBillMainVo.getStockinStatus()).getStatus());
            stockInBillMainVo.setBillTypeStr(StockInBillTypeEnum.getBillTypeByCode(stockInBillMainVo.getBillType()).getType());
            return stockInBillMainVo;
        }
        return null;
    }

    @Override
    @Transactional
    public StockInBillMainVo insert(StockInBillMainForm stockInBillMainForm) {
        StockInBillMain stockInBillMain = DozerUtils.convert(stockInBillMainForm, StockInBillMain.class);
        checkUnique(stockInBillMain.getProductOrderCode(), null);
        //远程调用获取单据编号
        String billCode = remoteGenerateBillCode(BillTypeEnum.STOCK_IN_BILL.getBillType());
        stockInBillMain.setStockInBillMainCode(billCode);
        stockInBillMainMapper.insert(stockInBillMain);
        StockInBillMain main = stockInBillMainMapper.selectByPrimaryKey(stockInBillMain.getId());
        if (main != null) {
            return DozerUtils.convert(main, StockInBillMainVo.class);
        }
        return null;
    }

    @Override
    @Transactional
    public StockInBillMainVo update(StockInBillMain stockInBillMain) {
        checkUnique(stockInBillMain.getProductOrderCode(), stockInBillMain.getId());
        stockInBillMainMapper.updateByPrimaryKeySelective(stockInBillMain);
        return findById(stockInBillMain.getId());

    }

    @Override
    public List<StockInBillDetailVo> findAllDetailById(Integer id) {
        StockInBillMain stockInBillMain = stockInBillMainMapper.selectByPrimaryKey(id);
        StockInBillDetailExample stockInBillDetailExample = new StockInBillDetailExample();
        StockInBillDetailExample.Criteria criteria = stockInBillDetailExample.createCriteria();
        criteria.andStockInBillMainCodeEqualTo(stockInBillMain.getStockInBillMainCode());
        List<StockInBillDetail> stockInBillDetailList = stockInBillDetailMapper.selectByExample(stockInBillDetailExample);
        if (CollectionUtils.isNotEmpty(stockInBillDetailList)) {
            return DozerUtils.convertList(stockInBillDetailList, StockInBillDetailVo.class);
        }
        return null;
    }

    @Override
    public StockInBillDetailVo insertDetail(StockInBillDetailForm stockInBillDetailForm, String stockInBillMainCode) {
        StockInBillDetail stockInBillDetail = DozerUtils.convert(stockInBillDetailForm, StockInBillDetail.class);
        stockInBillDetail.setTotalPrice(stockInBillDetail.getPrice().multiply(new BigDecimal(stockInBillDetail.getQuantity())));
        stockInBillDetail.setStockInBillDetailCode(remoteGenerateBillCode(BillTypeEnum.STOCK_IN_DETAIL_BILL.getBillType()));
        stockInBillDetail.setStockInBillMainCode(stockInBillMainCode);
        stockInBillDetailMapper.insertSelective(stockInBillDetail);
        updateMain(stockInBillMainCode);

        StockInBillDetail detail = stockInBillDetailMapper.selectByPrimaryKey(stockInBillDetail.getId());
        if (detail != null) {
            return DozerUtils.convert(detail, StockInBillDetailVo.class);
        }
        return null;
    }

    private void updateMain(String stockInBillMainCode) {
        StockInBillDetailExample example = new StockInBillDetailExample();
        example.createCriteria().andStockInBillMainCodeEqualTo(stockInBillMainCode);
        List<StockInBillDetail> stockInBillDetailList = stockInBillDetailMapper.selectByExample(example);
        if (CollectionUtils.isNotEmpty(stockInBillDetailList)) {
            StockInBillMainExample mainExample = new StockInBillMainExample();
            mainExample.createCriteria().andStockInBillMainCodeEqualTo(stockInBillMainCode);
            List<StockInBillMain> stockInBillMainList = stockInBillMainMapper.selectByExample(mainExample);
            if (CollectionUtils.isNotEmpty(stockInBillMainList)) {
                StockInBillMain stockInBillMain = stockInBillMainList.get(0);
                constructUpdateDto(stockInBillMain, stockInBillDetailList);
                stockInBillMainMapper.updateByPrimaryKeySelective(stockInBillMain);
            }
        }
    }

    @Override
    public StockInBillDetailVo updateDetail(StockInBillDetailForm stockInBillDetailForm, String stockInBillMainCode) {
        StockInBillDetail stockInBillDetail = DozerUtils.convert(stockInBillDetailForm, StockInBillDetail.class);
        stockInBillDetail.setTotalPrice(stockInBillDetail.getPrice().multiply(new BigDecimal(stockInBillDetail.getQuantity())));
        stockInBillDetailMapper.updateByPrimaryKeySelective(stockInBillDetail);
        updateMain(stockInBillMainCode);
        StockInBillDetail detail = stockInBillDetailMapper.selectByPrimaryKey(stockInBillDetailForm.getId());
        if (detail != null) {
            return DozerUtils.convert(detail, StockInBillDetailVo.class);
        }
        return null;
    }

    @Override
    @Transactional
    public void deleteById(Integer id) {
        StockInBillMain stockInBillMain = stockInBillMainMapper.selectByPrimaryKey(id);
        StockInBillDetailExample example = new StockInBillDetailExample();
        example.createCriteria().andStockInBillDetailCodeEqualTo(stockInBillMain.getStockInBillMainCode());
        int count = stockInBillDetailMapper.deleteByExample(example);
        int countMain = stockInBillMainMapper.deleteByPrimaryKey(id);
        if (countMain == 0) {
            throw BusinessException.create("删除失败");
        }
    }

    @Override
    public void deleteDetailById(Integer id) {
        StockInBillDetail stockInBillDetail = stockInBillDetailMapper.selectByPrimaryKey(id);
        int count = stockInBillDetailMapper.deleteByPrimaryKey(id);
        if (count == 0) {
            throw BusinessException.create("删除失败");
        }
        updateMain(stockInBillDetail.getStockInBillMainCode());
    }

    @Override
    public StockInBillDetailVo findDetailById(Integer id) {
        StockInBillDetail stockInBillDetail = stockInBillDetailMapper.selectByPrimaryKey(id);
        if (stockInBillDetail != null) {
            return DozerUtils.convert(stockInBillDetail, StockInBillDetailVo.class);
        }
        return null;
    }

    /**
     * 拼装插入的内容
     * @param stockInBillMain
     * @param stockInBillDetailList
     */
    private void constructUpdateDto(StockInBillMain stockInBillMain, List<StockInBillDetail> stockInBillDetailList) {
        String billMainCode = stockInBillMain.getStockInBillMainCode();
        Integer totalQuantity = 0;
        Integer quantity = 0;
        Integer defectiveQuantity = 0;
        BigDecimal totalPrice = new BigDecimal(0);
        if (CollectionUtils.isNotEmpty(stockInBillDetailList)) {
            for (StockInBillDetail stockInBillDetail : stockInBillDetailList) {
                stockInBillDetail.setStockInBillMainCode(billMainCode);
                totalQuantity = totalQuantity + stockInBillDetail.getQuantity();
                quantity = stockInBillDetail.getInQuantity() == null ? 0: stockInBillDetail.getInQuantity() + quantity;
                defectiveQuantity = stockInBillDetail.getInferiorQuantity() == null?0:stockInBillDetail.getInferiorQuantity()+ defectiveQuantity;
                stockInBillDetail.setTotalPrice(stockInBillDetail.getPrice().multiply(new BigDecimal(stockInBillDetail.getQuantity())));
                stockInBillDetail.setStockInBillDetailCode(remoteGenerateBillCode(BillTypeEnum.STOCK_IN_DETAIL_BILL.getBillType()));
                totalPrice = totalPrice.add(stockInBillDetail.getTotalPrice());
            }
        }
        stockInBillMain.setApplyQuantity(totalQuantity);
        stockInBillMain.setStockInMoney(totalPrice);
        stockInBillMain.setQuantity(quantity);
        stockInBillMain.setDefectiveQuantity(defectiveQuantity);

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
