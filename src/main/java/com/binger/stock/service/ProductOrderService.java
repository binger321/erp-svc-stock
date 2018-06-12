package com.binger.stock.service;

import com.binger.stock.controller.form.ProductOrderDetailForm;
import com.binger.stock.controller.form.ProductOrderMainForm;
import com.binger.stock.dto.query.ProductOrderMainQueryDto;
import com.binger.stock.vo.ProductOrderDetailVo;
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

    ProductOrderMainVo findOrderMainById(Integer id);

    ProductOrderDetailVo findOrderDetailById(Integer id);



    ProductOrderMainVo insertOrderMain(ProductOrderMainForm productOrderMainForm);

    ProductOrderDetailVo insertOrderDetail(ProductOrderDetailForm productOrderDetailForm);



    ProductOrderMainVo updateOrderMain(ProductOrderMainForm productOrderMainForm, Integer id);

    ProductOrderDetailVo updateOrderDetail(ProductOrderDetailForm productOrderDetailForm, Integer id);


    ProductOrderMainVo audit(Integer id);

    int deleteOrderMain(Integer id);

    int deleteOrderDetail(Integer id);
}
