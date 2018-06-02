package com.binger.stock.service;

import com.binger.stock.controller.form.ProductOrderForm;
import com.binger.stock.dto.query.ProductOrderMainQueryDto;
import com.binger.stock.vo.ProductOrderMainVo;
import com.binger.stock.vo.ProductOrderVo;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: zhuyubin
 * Date: 2018/5/24
 * Time: 上午9:57
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public interface ProductOrderService {

    Long countByQuery(ProductOrderMainQueryDto productOrderMainQueryDto);

    List<ProductOrderMainVo> listByQuery(ProductOrderMainQueryDto productOrderMainQueryDto);

    ProductOrderVo findById(Integer id);

    ProductOrderVo insert(ProductOrderForm productOrderForm);

    ProductOrderVo update(ProductOrderForm productOrderForm);

    ProductOrderMainVo audit(Integer id);
}
