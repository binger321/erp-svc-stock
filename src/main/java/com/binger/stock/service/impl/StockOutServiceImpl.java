package com.binger.stock.service.impl;

import com.binger.common.ResponseCode;
import com.binger.common.ServerResponse;
import com.binger.common.enums.BillTypeEnum;
import com.binger.common.exception.BusinessException;
import com.binger.common.util.DozerUtils;
import com.binger.stock.controller.form.StockOutBillDetailForm;
import com.binger.stock.controller.form.StockOutBillMainForm;
import com.binger.stock.dao.StockOutBillDetailMapper;
import com.binger.stock.dao.StockOutBillMainMapper;
import com.binger.stock.domain.StockOutBillDetail;
import com.binger.stock.domain.StockOutBillDetailExample;
import com.binger.stock.domain.StockOutBillMain;
import com.binger.stock.domain.StockOutBillMainExample;
import com.binger.stock.dto.query.StockOutMainQueryDto;
import com.binger.stock.dto.ret.StockOutMainRetDto;
import com.binger.stock.enums.StockOutStatusEnum;
import com.binger.stock.remote.RemoteBillCodeCtl;
import com.binger.stock.service.StockOutService;
import com.binger.stock.vo.StockOutBillDetailVo;
import com.binger.stock.vo.StockOutBillMainVo;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
    public StockOutBillMainVo findById(Integer id) {
        StockOutBillMain stockOutBillMain = stockOutBillMainMapper.selectByPrimaryKey(id);
        if (stockOutBillMain != null) {
            return DozerUtils.convert(stockOutBillMain, StockOutBillMainVo.class);
        }
        return null;

    }

    @Override
    public StockOutBillMainVo insert(StockOutBillMainForm stockOutBillMainForm) {
        StockOutBillMain stockOutBillMain = DozerUtils.convert(stockOutBillMainForm, StockOutBillMain.class);
        stockOutBillMain.setStockOutBillMainCode(remoteGenerateBillCode(BillTypeEnum.STOCK_OUT_BILL.getBillType()));
        stockOutBillMain.setStockoutStatus(StockOutStatusEnum.SAVE.getCode());
        stockOutBillMainMapper.insertSelective(stockOutBillMain);
        StockOutBillMain main = stockOutBillMainMapper.selectByPrimaryKey(stockOutBillMain.getId());
        if (main != null) {
            return DozerUtils.convert(main,StockOutBillMainVo.class);
        }
        throw BusinessException.create("新增失败！");
    }

    @Override
    public StockOutBillMainVo update(StockOutBillMain stockOutBillMain) {
        if (StockOutStatusEnum.FILE.getCode().equals(stockOutBillMain.getBillType())) {
            throw BusinessException.create("该出库单已归档 无法修改！");
        } else {
            stockOutBillMainMapper.updateByPrimaryKeySelective(stockOutBillMain);
            StockOutBillMain billMain = stockOutBillMainMapper.selectByPrimaryKey(stockOutBillMain.getId());
            if (billMain != null) {
                return DozerUtils.convert(billMain, StockOutBillMainVo.class);
            }
            return null;
        }
    }


    @Override
    public List<StockOutBillDetailVo> findAllDetail(String stockOutBillMainCode) {

        StockOutBillDetailExample example = new StockOutBillDetailExample();
        example.createCriteria().andStockOutBillMainCodeEqualTo(stockOutBillMainCode);
        List<StockOutBillDetail> stockOutBillDetailList = stockOutBillDetailMapper.selectByExample(example);
        if (CollectionUtils.isNotEmpty(stockOutBillDetailList)) {
            return DozerUtils.convertList(stockOutBillDetailList, StockOutBillDetailVo.class);
        }
        return null;
    }

    @Override
    public StockOutBillDetailVo insertDetail(StockOutBillDetailForm stockOutBillDetailForm) {
        StockOutBillDetail stockOutBillDetail = DozerUtils.convert(stockOutBillDetailForm, StockOutBillDetail.class);
        Integer outQuantity = avoidNullForInteger(stockOutBillDetail.getOutQuantity());
        BigDecimal price = avoidNullForBigDecimal(stockOutBillDetail.getPrice());
        BigDecimal totalPrice = price.multiply(new BigDecimal(outQuantity));
        stockOutBillDetail.setTotalMny(totalPrice);
        stockOutBillDetail.setStockOutBillDetailCode(remoteGenerateBillCode(BillTypeEnum.STOCK_OUT_DETAIL_BILL.getBillType()));
        stockOutBillDetailMapper.insertSelective(stockOutBillDetail);
        constructUpdateMain(stockOutBillDetailForm.getStockOutBillMainCode());
        StockOutBillDetail detail = stockOutBillDetailMapper.selectByPrimaryKey(stockOutBillDetailForm.getId());
        if (detail != null) {
            return DozerUtils.convert(detail, StockOutBillDetailVo.class);
        }
        return null;
    }

    @Override
    @Transactional
    public StockOutBillDetailVo updateDetail(StockOutBillDetailForm stockOutBillDetailForm) {
        StockOutBillDetail stockOutBillDetail = DozerUtils.convert(stockOutBillDetailForm, StockOutBillDetail.class);
        Integer outQuantity = avoidNullForInteger(stockOutBillDetail.getOutQuantity());
        BigDecimal price = avoidNullForBigDecimal(stockOutBillDetail.getPrice());
        BigDecimal totalPrice = price.multiply(new BigDecimal(outQuantity));
        stockOutBillDetail.setTotalMny(totalPrice);
        stockOutBillDetailMapper.updateByPrimaryKeySelective(stockOutBillDetail);
        StockOutBillDetail detail = stockOutBillDetailMapper.selectByPrimaryKey(stockOutBillDetailForm.getId());
        if (detail != null) {
            constructUpdateMain(detail.getStockOutBillMainCode());
            return DozerUtils.convert(detail, StockOutBillDetailVo.class);
        }
        throw BusinessException.create("更新出错！");
    }

    @Override
    @Transactional
    public void deleteById(Integer id) {
        StockOutBillMain stockOutBillMain = stockOutBillMainMapper.selectByPrimaryKey(id);
        StockOutBillDetailExample example = new StockOutBillDetailExample();
        example.createCriteria().andStockOutBillMainCodeEqualTo(stockOutBillMain.getStockOutBillMainCode());
        stockOutBillDetailMapper.deleteByExample(example);
        int countMain = stockOutBillMainMapper.deleteByPrimaryKey(id);
        if (countMain == 0) {
            throw BusinessException.create("删除出错!");
        }
    }

    @Override
    public void deleteDetailById(Integer id) {
        StockOutBillDetail stockOutBillDetail = stockOutBillDetailMapper.selectByPrimaryKey(id);
        if (stockOutBillDetail == null) {
            throw BusinessException.create("已删除！刷新后重试！");
        } else {
            int count = stockOutBillDetailMapper.deleteByPrimaryKey(id);
            if (count == 0) {
                throw BusinessException.create("删除出错!");
            }
            constructUpdateMain(stockOutBillDetail.getStockOutBillMainCode());
        }
    }

    @Override
    public StockOutBillDetailVo findDetailById(Integer id) {
        StockOutBillDetail stockOutBillDetail = stockOutBillDetailMapper.selectByPrimaryKey(id);
        if (stockOutBillDetail != null) {
            return DozerUtils.convert(stockOutBillDetail, StockOutBillDetailVo.class);
        }
        return null;
    }

    private void constructUpdateMain(String stockOutBillMainCode) {
        StockOutBillDetailExample example = new StockOutBillDetailExample();
        example.createCriteria().andStockOutBillMainCodeEqualTo(stockOutBillMainCode);
        List<StockOutBillDetail> stockOutBillDetailList = stockOutBillDetailMapper.selectByExample(example);
        BigDecimal totalAmount = new BigDecimal(0);
        Integer totalQuantity = 0;
        for (StockOutBillDetail stockOutBillDetail : stockOutBillDetailList) {
            Integer quantity = avoidNullForInteger(stockOutBillDetail.getOutQuantity());
            totalQuantity = totalQuantity + quantity;
            totalAmount = totalAmount.add(avoidNullForBigDecimal(stockOutBillDetail.getTotalMny()));
        }
        StockOutBillMain stockOutBillMain = new StockOutBillMain();
        stockOutBillMain.setTotalAmount(totalAmount);
        stockOutBillMain.setQuantity(totalQuantity);
        StockOutBillMainExample mainExample = new StockOutBillMainExample();
        mainExample.createCriteria().andStockOutBillMainCodeEqualTo(stockOutBillMainCode);
        stockOutBillMainMapper.updateByExampleSelective(stockOutBillMain, mainExample);
    }

    private String remoteGenerateBillCode(String billType) {
        ServerResponse<String> response = remoteBillCodeCtl.generateBill(billType);
        if (ResponseCode.SUCCESS.getCode() == response.getStatus() && StringUtils.isNotBlank(response.getData())) {
            return response.getData();
        } else {
            throw BusinessException.create("远程获取编号失败！");
        }
    }

    private Integer avoidNullForInteger(Integer integer) {
        return integer == null ? 0 : integer;
    }
    private BigDecimal avoidNullForBigDecimal(BigDecimal decimal) {
        return decimal == null ? new BigDecimal(0) : decimal;
    }

}
