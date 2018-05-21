package com.binger.stock.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class StockOutBillDetailExample {
    /**
     * stock_out_bill_detail
     */
    protected String orderByClause;

    /**
     * stock_out_bill_detail
     */
    protected boolean distinct;

    /**
     * stock_out_bill_detail
     */
    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    private SelectiveField selectiveField;

    public StockOutBillDetailExample() {
        oredCriteria = new ArrayList<Criteria>();
        selectiveField = SelectiveField.select();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getOffset() {
        return offset;
    }

    public SelectiveField getSelectiveField() {
        return this.selectiveField;
    }

    public void setSelectiveField(SelectiveField selectiveField) {
        this.selectiveField = selectiveField;
    }

    /**
     * stock_out_bill_detail 2018-05-17
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andStockOutBillDetailCodeIsNull() {
            addCriterion("stock_out_bill_detail_code is null");
            return (Criteria) this;
        }

        public Criteria andStockOutBillDetailCodeIsNotNull() {
            addCriterion("stock_out_bill_detail_code is not null");
            return (Criteria) this;
        }

        public Criteria andStockOutBillDetailCodeEqualTo(String value) {
            addCriterion("stock_out_bill_detail_code =", value, "stockOutBillDetailCode");
            return (Criteria) this;
        }

        public Criteria andStockOutBillDetailCodeNotEqualTo(String value) {
            addCriterion("stock_out_bill_detail_code <>", value, "stockOutBillDetailCode");
            return (Criteria) this;
        }

        public Criteria andStockOutBillDetailCodeGreaterThan(String value) {
            addCriterion("stock_out_bill_detail_code >", value, "stockOutBillDetailCode");
            return (Criteria) this;
        }

        public Criteria andStockOutBillDetailCodeGreaterThanOrEqualTo(String value) {
            addCriterion("stock_out_bill_detail_code >=", value, "stockOutBillDetailCode");
            return (Criteria) this;
        }

        public Criteria andStockOutBillDetailCodeLessThan(String value) {
            addCriterion("stock_out_bill_detail_code <", value, "stockOutBillDetailCode");
            return (Criteria) this;
        }

        public Criteria andStockOutBillDetailCodeLessThanOrEqualTo(String value) {
            addCriterion("stock_out_bill_detail_code <=", value, "stockOutBillDetailCode");
            return (Criteria) this;
        }

        public Criteria andStockOutBillDetailCodeLike(String value) {
            addCriterion("stock_out_bill_detail_code like", value, "stockOutBillDetailCode");
            return (Criteria) this;
        }

        public Criteria andStockOutBillDetailCodeNotLike(String value) {
            addCriterion("stock_out_bill_detail_code not like", value, "stockOutBillDetailCode");
            return (Criteria) this;
        }

        public Criteria andStockOutBillDetailCodeIn(List<String> values) {
            addCriterion("stock_out_bill_detail_code in", values, "stockOutBillDetailCode");
            return (Criteria) this;
        }

        public Criteria andStockOutBillDetailCodeNotIn(List<String> values) {
            addCriterion("stock_out_bill_detail_code not in", values, "stockOutBillDetailCode");
            return (Criteria) this;
        }

        public Criteria andStockOutBillDetailCodeBetween(String value1, String value2) {
            addCriterion("stock_out_bill_detail_code between", value1, value2, "stockOutBillDetailCode");
            return (Criteria) this;
        }

        public Criteria andStockOutBillDetailCodeNotBetween(String value1, String value2) {
            addCriterion("stock_out_bill_detail_code not between", value1, value2, "stockOutBillDetailCode");
            return (Criteria) this;
        }

        public Criteria andStockOutBillMainCodeIsNull() {
            addCriterion("stock_out_bill_main_code is null");
            return (Criteria) this;
        }

        public Criteria andStockOutBillMainCodeIsNotNull() {
            addCriterion("stock_out_bill_main_code is not null");
            return (Criteria) this;
        }

        public Criteria andStockOutBillMainCodeEqualTo(String value) {
            addCriterion("stock_out_bill_main_code =", value, "stockOutBillMainCode");
            return (Criteria) this;
        }

        public Criteria andStockOutBillMainCodeNotEqualTo(String value) {
            addCriterion("stock_out_bill_main_code <>", value, "stockOutBillMainCode");
            return (Criteria) this;
        }

        public Criteria andStockOutBillMainCodeGreaterThan(String value) {
            addCriterion("stock_out_bill_main_code >", value, "stockOutBillMainCode");
            return (Criteria) this;
        }

        public Criteria andStockOutBillMainCodeGreaterThanOrEqualTo(String value) {
            addCriterion("stock_out_bill_main_code >=", value, "stockOutBillMainCode");
            return (Criteria) this;
        }

        public Criteria andStockOutBillMainCodeLessThan(String value) {
            addCriterion("stock_out_bill_main_code <", value, "stockOutBillMainCode");
            return (Criteria) this;
        }

        public Criteria andStockOutBillMainCodeLessThanOrEqualTo(String value) {
            addCriterion("stock_out_bill_main_code <=", value, "stockOutBillMainCode");
            return (Criteria) this;
        }

        public Criteria andStockOutBillMainCodeLike(String value) {
            addCriterion("stock_out_bill_main_code like", value, "stockOutBillMainCode");
            return (Criteria) this;
        }

        public Criteria andStockOutBillMainCodeNotLike(String value) {
            addCriterion("stock_out_bill_main_code not like", value, "stockOutBillMainCode");
            return (Criteria) this;
        }

        public Criteria andStockOutBillMainCodeIn(List<String> values) {
            addCriterion("stock_out_bill_main_code in", values, "stockOutBillMainCode");
            return (Criteria) this;
        }

        public Criteria andStockOutBillMainCodeNotIn(List<String> values) {
            addCriterion("stock_out_bill_main_code not in", values, "stockOutBillMainCode");
            return (Criteria) this;
        }

        public Criteria andStockOutBillMainCodeBetween(String value1, String value2) {
            addCriterion("stock_out_bill_main_code between", value1, value2, "stockOutBillMainCode");
            return (Criteria) this;
        }

        public Criteria andStockOutBillMainCodeNotBetween(String value1, String value2) {
            addCriterion("stock_out_bill_main_code not between", value1, value2, "stockOutBillMainCode");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNull() {
            addCriterion("goods_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNotNull() {
            addCriterion("goods_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdEqualTo(Integer value) {
            addCriterion("goods_id =", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotEqualTo(Integer value) {
            addCriterion("goods_id <>", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThan(Integer value) {
            addCriterion("goods_id >", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_id >=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThan(Integer value) {
            addCriterion("goods_id <", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThanOrEqualTo(Integer value) {
            addCriterion("goods_id <=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIn(List<Integer> values) {
            addCriterion("goods_id in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotIn(List<Integer> values) {
            addCriterion("goods_id not in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdBetween(Integer value1, Integer value2) {
            addCriterion("goods_id between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_id not between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeIsNull() {
            addCriterion("goods_code is null");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeIsNotNull() {
            addCriterion("goods_code is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeEqualTo(String value) {
            addCriterion("goods_code =", value, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeNotEqualTo(String value) {
            addCriterion("goods_code <>", value, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeGreaterThan(String value) {
            addCriterion("goods_code >", value, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeGreaterThanOrEqualTo(String value) {
            addCriterion("goods_code >=", value, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeLessThan(String value) {
            addCriterion("goods_code <", value, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeLessThanOrEqualTo(String value) {
            addCriterion("goods_code <=", value, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeLike(String value) {
            addCriterion("goods_code like", value, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeNotLike(String value) {
            addCriterion("goods_code not like", value, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeIn(List<String> values) {
            addCriterion("goods_code in", values, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeNotIn(List<String> values) {
            addCriterion("goods_code not in", values, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeBetween(String value1, String value2) {
            addCriterion("goods_code between", value1, value2, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeNotBetween(String value1, String value2) {
            addCriterion("goods_code not between", value1, value2, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNull() {
            addCriterion("goods_name is null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNotNull() {
            addCriterion("goods_name is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameEqualTo(String value) {
            addCriterion("goods_name =", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotEqualTo(String value) {
            addCriterion("goods_name <>", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThan(String value) {
            addCriterion("goods_name >", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThanOrEqualTo(String value) {
            addCriterion("goods_name >=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThan(String value) {
            addCriterion("goods_name <", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThanOrEqualTo(String value) {
            addCriterion("goods_name <=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLike(String value) {
            addCriterion("goods_name like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotLike(String value) {
            addCriterion("goods_name not like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIn(List<String> values) {
            addCriterion("goods_name in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotIn(List<String> values) {
            addCriterion("goods_name not in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameBetween(String value1, String value2) {
            addCriterion("goods_name between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotBetween(String value1, String value2) {
            addCriterion("goods_name not between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andSkuIdIsNull() {
            addCriterion("sku_id is null");
            return (Criteria) this;
        }

        public Criteria andSkuIdIsNotNull() {
            addCriterion("sku_id is not null");
            return (Criteria) this;
        }

        public Criteria andSkuIdEqualTo(Integer value) {
            addCriterion("sku_id =", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdNotEqualTo(Integer value) {
            addCriterion("sku_id <>", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdGreaterThan(Integer value) {
            addCriterion("sku_id >", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sku_id >=", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdLessThan(Integer value) {
            addCriterion("sku_id <", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdLessThanOrEqualTo(Integer value) {
            addCriterion("sku_id <=", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdIn(List<Integer> values) {
            addCriterion("sku_id in", values, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdNotIn(List<Integer> values) {
            addCriterion("sku_id not in", values, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdBetween(Integer value1, Integer value2) {
            addCriterion("sku_id between", value1, value2, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sku_id not between", value1, value2, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuCodeIsNull() {
            addCriterion("sku_code is null");
            return (Criteria) this;
        }

        public Criteria andSkuCodeIsNotNull() {
            addCriterion("sku_code is not null");
            return (Criteria) this;
        }

        public Criteria andSkuCodeEqualTo(String value) {
            addCriterion("sku_code =", value, "skuCode");
            return (Criteria) this;
        }

        public Criteria andSkuCodeNotEqualTo(String value) {
            addCriterion("sku_code <>", value, "skuCode");
            return (Criteria) this;
        }

        public Criteria andSkuCodeGreaterThan(String value) {
            addCriterion("sku_code >", value, "skuCode");
            return (Criteria) this;
        }

        public Criteria andSkuCodeGreaterThanOrEqualTo(String value) {
            addCriterion("sku_code >=", value, "skuCode");
            return (Criteria) this;
        }

        public Criteria andSkuCodeLessThan(String value) {
            addCriterion("sku_code <", value, "skuCode");
            return (Criteria) this;
        }

        public Criteria andSkuCodeLessThanOrEqualTo(String value) {
            addCriterion("sku_code <=", value, "skuCode");
            return (Criteria) this;
        }

        public Criteria andSkuCodeLike(String value) {
            addCriterion("sku_code like", value, "skuCode");
            return (Criteria) this;
        }

        public Criteria andSkuCodeNotLike(String value) {
            addCriterion("sku_code not like", value, "skuCode");
            return (Criteria) this;
        }

        public Criteria andSkuCodeIn(List<String> values) {
            addCriterion("sku_code in", values, "skuCode");
            return (Criteria) this;
        }

        public Criteria andSkuCodeNotIn(List<String> values) {
            addCriterion("sku_code not in", values, "skuCode");
            return (Criteria) this;
        }

        public Criteria andSkuCodeBetween(String value1, String value2) {
            addCriterion("sku_code between", value1, value2, "skuCode");
            return (Criteria) this;
        }

        public Criteria andSkuCodeNotBetween(String value1, String value2) {
            addCriterion("sku_code not between", value1, value2, "skuCode");
            return (Criteria) this;
        }

        public Criteria andSkuNameIsNull() {
            addCriterion("sku_name is null");
            return (Criteria) this;
        }

        public Criteria andSkuNameIsNotNull() {
            addCriterion("sku_name is not null");
            return (Criteria) this;
        }

        public Criteria andSkuNameEqualTo(String value) {
            addCriterion("sku_name =", value, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuNameNotEqualTo(String value) {
            addCriterion("sku_name <>", value, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuNameGreaterThan(String value) {
            addCriterion("sku_name >", value, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuNameGreaterThanOrEqualTo(String value) {
            addCriterion("sku_name >=", value, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuNameLessThan(String value) {
            addCriterion("sku_name <", value, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuNameLessThanOrEqualTo(String value) {
            addCriterion("sku_name <=", value, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuNameLike(String value) {
            addCriterion("sku_name like", value, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuNameNotLike(String value) {
            addCriterion("sku_name not like", value, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuNameIn(List<String> values) {
            addCriterion("sku_name in", values, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuNameNotIn(List<String> values) {
            addCriterion("sku_name not in", values, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuNameBetween(String value1, String value2) {
            addCriterion("sku_name between", value1, value2, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuNameNotBetween(String value1, String value2) {
            addCriterion("sku_name not between", value1, value2, "skuName");
            return (Criteria) this;
        }

        public Criteria andSizeIdIsNull() {
            addCriterion("size_id is null");
            return (Criteria) this;
        }

        public Criteria andSizeIdIsNotNull() {
            addCriterion("size_id is not null");
            return (Criteria) this;
        }

        public Criteria andSizeIdEqualTo(Integer value) {
            addCriterion("size_id =", value, "sizeId");
            return (Criteria) this;
        }

        public Criteria andSizeIdNotEqualTo(Integer value) {
            addCriterion("size_id <>", value, "sizeId");
            return (Criteria) this;
        }

        public Criteria andSizeIdGreaterThan(Integer value) {
            addCriterion("size_id >", value, "sizeId");
            return (Criteria) this;
        }

        public Criteria andSizeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("size_id >=", value, "sizeId");
            return (Criteria) this;
        }

        public Criteria andSizeIdLessThan(Integer value) {
            addCriterion("size_id <", value, "sizeId");
            return (Criteria) this;
        }

        public Criteria andSizeIdLessThanOrEqualTo(Integer value) {
            addCriterion("size_id <=", value, "sizeId");
            return (Criteria) this;
        }

        public Criteria andSizeIdIn(List<Integer> values) {
            addCriterion("size_id in", values, "sizeId");
            return (Criteria) this;
        }

        public Criteria andSizeIdNotIn(List<Integer> values) {
            addCriterion("size_id not in", values, "sizeId");
            return (Criteria) this;
        }

        public Criteria andSizeIdBetween(Integer value1, Integer value2) {
            addCriterion("size_id between", value1, value2, "sizeId");
            return (Criteria) this;
        }

        public Criteria andSizeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("size_id not between", value1, value2, "sizeId");
            return (Criteria) this;
        }

        public Criteria andSizeCodeIsNull() {
            addCriterion("size_code is null");
            return (Criteria) this;
        }

        public Criteria andSizeCodeIsNotNull() {
            addCriterion("size_code is not null");
            return (Criteria) this;
        }

        public Criteria andSizeCodeEqualTo(String value) {
            addCriterion("size_code =", value, "sizeCode");
            return (Criteria) this;
        }

        public Criteria andSizeCodeNotEqualTo(String value) {
            addCriterion("size_code <>", value, "sizeCode");
            return (Criteria) this;
        }

        public Criteria andSizeCodeGreaterThan(String value) {
            addCriterion("size_code >", value, "sizeCode");
            return (Criteria) this;
        }

        public Criteria andSizeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("size_code >=", value, "sizeCode");
            return (Criteria) this;
        }

        public Criteria andSizeCodeLessThan(String value) {
            addCriterion("size_code <", value, "sizeCode");
            return (Criteria) this;
        }

        public Criteria andSizeCodeLessThanOrEqualTo(String value) {
            addCriterion("size_code <=", value, "sizeCode");
            return (Criteria) this;
        }

        public Criteria andSizeCodeLike(String value) {
            addCriterion("size_code like", value, "sizeCode");
            return (Criteria) this;
        }

        public Criteria andSizeCodeNotLike(String value) {
            addCriterion("size_code not like", value, "sizeCode");
            return (Criteria) this;
        }

        public Criteria andSizeCodeIn(List<String> values) {
            addCriterion("size_code in", values, "sizeCode");
            return (Criteria) this;
        }

        public Criteria andSizeCodeNotIn(List<String> values) {
            addCriterion("size_code not in", values, "sizeCode");
            return (Criteria) this;
        }

        public Criteria andSizeCodeBetween(String value1, String value2) {
            addCriterion("size_code between", value1, value2, "sizeCode");
            return (Criteria) this;
        }

        public Criteria andSizeCodeNotBetween(String value1, String value2) {
            addCriterion("size_code not between", value1, value2, "sizeCode");
            return (Criteria) this;
        }

        public Criteria andSizeNameIsNull() {
            addCriterion("size_name is null");
            return (Criteria) this;
        }

        public Criteria andSizeNameIsNotNull() {
            addCriterion("size_name is not null");
            return (Criteria) this;
        }

        public Criteria andSizeNameEqualTo(String value) {
            addCriterion("size_name =", value, "sizeName");
            return (Criteria) this;
        }

        public Criteria andSizeNameNotEqualTo(String value) {
            addCriterion("size_name <>", value, "sizeName");
            return (Criteria) this;
        }

        public Criteria andSizeNameGreaterThan(String value) {
            addCriterion("size_name >", value, "sizeName");
            return (Criteria) this;
        }

        public Criteria andSizeNameGreaterThanOrEqualTo(String value) {
            addCriterion("size_name >=", value, "sizeName");
            return (Criteria) this;
        }

        public Criteria andSizeNameLessThan(String value) {
            addCriterion("size_name <", value, "sizeName");
            return (Criteria) this;
        }

        public Criteria andSizeNameLessThanOrEqualTo(String value) {
            addCriterion("size_name <=", value, "sizeName");
            return (Criteria) this;
        }

        public Criteria andSizeNameLike(String value) {
            addCriterion("size_name like", value, "sizeName");
            return (Criteria) this;
        }

        public Criteria andSizeNameNotLike(String value) {
            addCriterion("size_name not like", value, "sizeName");
            return (Criteria) this;
        }

        public Criteria andSizeNameIn(List<String> values) {
            addCriterion("size_name in", values, "sizeName");
            return (Criteria) this;
        }

        public Criteria andSizeNameNotIn(List<String> values) {
            addCriterion("size_name not in", values, "sizeName");
            return (Criteria) this;
        }

        public Criteria andSizeNameBetween(String value1, String value2) {
            addCriterion("size_name between", value1, value2, "sizeName");
            return (Criteria) this;
        }

        public Criteria andSizeNameNotBetween(String value1, String value2) {
            addCriterion("size_name not between", value1, value2, "sizeName");
            return (Criteria) this;
        }

        public Criteria andQuantityIsNull() {
            addCriterion("quantity is null");
            return (Criteria) this;
        }

        public Criteria andQuantityIsNotNull() {
            addCriterion("quantity is not null");
            return (Criteria) this;
        }

        public Criteria andQuantityEqualTo(Integer value) {
            addCriterion("quantity =", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotEqualTo(Integer value) {
            addCriterion("quantity <>", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThan(Integer value) {
            addCriterion("quantity >", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("quantity >=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThan(Integer value) {
            addCriterion("quantity <", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThanOrEqualTo(Integer value) {
            addCriterion("quantity <=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityIn(List<Integer> values) {
            addCriterion("quantity in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotIn(List<Integer> values) {
            addCriterion("quantity not in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityBetween(Integer value1, Integer value2) {
            addCriterion("quantity between", value1, value2, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotBetween(Integer value1, Integer value2) {
            addCriterion("quantity not between", value1, value2, "quantity");
            return (Criteria) this;
        }

        public Criteria andWeightIsNull() {
            addCriterion("weight is null");
            return (Criteria) this;
        }

        public Criteria andWeightIsNotNull() {
            addCriterion("weight is not null");
            return (Criteria) this;
        }

        public Criteria andWeightEqualTo(BigDecimal value) {
            addCriterion("weight =", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotEqualTo(BigDecimal value) {
            addCriterion("weight <>", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThan(BigDecimal value) {
            addCriterion("weight >", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("weight >=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThan(BigDecimal value) {
            addCriterion("weight <", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("weight <=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightIn(List<BigDecimal> values) {
            addCriterion("weight in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotIn(List<BigDecimal> values) {
            addCriterion("weight not in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("weight between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("weight not between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andColorIdIsNull() {
            addCriterion("color_id is null");
            return (Criteria) this;
        }

        public Criteria andColorIdIsNotNull() {
            addCriterion("color_id is not null");
            return (Criteria) this;
        }

        public Criteria andColorIdEqualTo(Integer value) {
            addCriterion("color_id =", value, "colorId");
            return (Criteria) this;
        }

        public Criteria andColorIdNotEqualTo(Integer value) {
            addCriterion("color_id <>", value, "colorId");
            return (Criteria) this;
        }

        public Criteria andColorIdGreaterThan(Integer value) {
            addCriterion("color_id >", value, "colorId");
            return (Criteria) this;
        }

        public Criteria andColorIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("color_id >=", value, "colorId");
            return (Criteria) this;
        }

        public Criteria andColorIdLessThan(Integer value) {
            addCriterion("color_id <", value, "colorId");
            return (Criteria) this;
        }

        public Criteria andColorIdLessThanOrEqualTo(Integer value) {
            addCriterion("color_id <=", value, "colorId");
            return (Criteria) this;
        }

        public Criteria andColorIdIn(List<Integer> values) {
            addCriterion("color_id in", values, "colorId");
            return (Criteria) this;
        }

        public Criteria andColorIdNotIn(List<Integer> values) {
            addCriterion("color_id not in", values, "colorId");
            return (Criteria) this;
        }

        public Criteria andColorIdBetween(Integer value1, Integer value2) {
            addCriterion("color_id between", value1, value2, "colorId");
            return (Criteria) this;
        }

        public Criteria andColorIdNotBetween(Integer value1, Integer value2) {
            addCriterion("color_id not between", value1, value2, "colorId");
            return (Criteria) this;
        }

        public Criteria andColorCodeIsNull() {
            addCriterion("color_code is null");
            return (Criteria) this;
        }

        public Criteria andColorCodeIsNotNull() {
            addCriterion("color_code is not null");
            return (Criteria) this;
        }

        public Criteria andColorCodeEqualTo(String value) {
            addCriterion("color_code =", value, "colorCode");
            return (Criteria) this;
        }

        public Criteria andColorCodeNotEqualTo(String value) {
            addCriterion("color_code <>", value, "colorCode");
            return (Criteria) this;
        }

        public Criteria andColorCodeGreaterThan(String value) {
            addCriterion("color_code >", value, "colorCode");
            return (Criteria) this;
        }

        public Criteria andColorCodeGreaterThanOrEqualTo(String value) {
            addCriterion("color_code >=", value, "colorCode");
            return (Criteria) this;
        }

        public Criteria andColorCodeLessThan(String value) {
            addCriterion("color_code <", value, "colorCode");
            return (Criteria) this;
        }

        public Criteria andColorCodeLessThanOrEqualTo(String value) {
            addCriterion("color_code <=", value, "colorCode");
            return (Criteria) this;
        }

        public Criteria andColorCodeLike(String value) {
            addCriterion("color_code like", value, "colorCode");
            return (Criteria) this;
        }

        public Criteria andColorCodeNotLike(String value) {
            addCriterion("color_code not like", value, "colorCode");
            return (Criteria) this;
        }

        public Criteria andColorCodeIn(List<String> values) {
            addCriterion("color_code in", values, "colorCode");
            return (Criteria) this;
        }

        public Criteria andColorCodeNotIn(List<String> values) {
            addCriterion("color_code not in", values, "colorCode");
            return (Criteria) this;
        }

        public Criteria andColorCodeBetween(String value1, String value2) {
            addCriterion("color_code between", value1, value2, "colorCode");
            return (Criteria) this;
        }

        public Criteria andColorCodeNotBetween(String value1, String value2) {
            addCriterion("color_code not between", value1, value2, "colorCode");
            return (Criteria) this;
        }

        public Criteria andColorNameIsNull() {
            addCriterion("color_name is null");
            return (Criteria) this;
        }

        public Criteria andColorNameIsNotNull() {
            addCriterion("color_name is not null");
            return (Criteria) this;
        }

        public Criteria andColorNameEqualTo(String value) {
            addCriterion("color_name =", value, "colorName");
            return (Criteria) this;
        }

        public Criteria andColorNameNotEqualTo(String value) {
            addCriterion("color_name <>", value, "colorName");
            return (Criteria) this;
        }

        public Criteria andColorNameGreaterThan(String value) {
            addCriterion("color_name >", value, "colorName");
            return (Criteria) this;
        }

        public Criteria andColorNameGreaterThanOrEqualTo(String value) {
            addCriterion("color_name >=", value, "colorName");
            return (Criteria) this;
        }

        public Criteria andColorNameLessThan(String value) {
            addCriterion("color_name <", value, "colorName");
            return (Criteria) this;
        }

        public Criteria andColorNameLessThanOrEqualTo(String value) {
            addCriterion("color_name <=", value, "colorName");
            return (Criteria) this;
        }

        public Criteria andColorNameLike(String value) {
            addCriterion("color_name like", value, "colorName");
            return (Criteria) this;
        }

        public Criteria andColorNameNotLike(String value) {
            addCriterion("color_name not like", value, "colorName");
            return (Criteria) this;
        }

        public Criteria andColorNameIn(List<String> values) {
            addCriterion("color_name in", values, "colorName");
            return (Criteria) this;
        }

        public Criteria andColorNameNotIn(List<String> values) {
            addCriterion("color_name not in", values, "colorName");
            return (Criteria) this;
        }

        public Criteria andColorNameBetween(String value1, String value2) {
            addCriterion("color_name between", value1, value2, "colorName");
            return (Criteria) this;
        }

        public Criteria andColorNameNotBetween(String value1, String value2) {
            addCriterion("color_name not between", value1, value2, "colorName");
            return (Criteria) this;
        }

        public Criteria andAttrIdIsNull() {
            addCriterion("attr_id is null");
            return (Criteria) this;
        }

        public Criteria andAttrIdIsNotNull() {
            addCriterion("attr_id is not null");
            return (Criteria) this;
        }

        public Criteria andAttrIdEqualTo(Integer value) {
            addCriterion("attr_id =", value, "attrId");
            return (Criteria) this;
        }

        public Criteria andAttrIdNotEqualTo(Integer value) {
            addCriterion("attr_id <>", value, "attrId");
            return (Criteria) this;
        }

        public Criteria andAttrIdGreaterThan(Integer value) {
            addCriterion("attr_id >", value, "attrId");
            return (Criteria) this;
        }

        public Criteria andAttrIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("attr_id >=", value, "attrId");
            return (Criteria) this;
        }

        public Criteria andAttrIdLessThan(Integer value) {
            addCriterion("attr_id <", value, "attrId");
            return (Criteria) this;
        }

        public Criteria andAttrIdLessThanOrEqualTo(Integer value) {
            addCriterion("attr_id <=", value, "attrId");
            return (Criteria) this;
        }

        public Criteria andAttrIdIn(List<Integer> values) {
            addCriterion("attr_id in", values, "attrId");
            return (Criteria) this;
        }

        public Criteria andAttrIdNotIn(List<Integer> values) {
            addCriterion("attr_id not in", values, "attrId");
            return (Criteria) this;
        }

        public Criteria andAttrIdBetween(Integer value1, Integer value2) {
            addCriterion("attr_id between", value1, value2, "attrId");
            return (Criteria) this;
        }

        public Criteria andAttrIdNotBetween(Integer value1, Integer value2) {
            addCriterion("attr_id not between", value1, value2, "attrId");
            return (Criteria) this;
        }

        public Criteria andAttrCodeIsNull() {
            addCriterion("attr_code is null");
            return (Criteria) this;
        }

        public Criteria andAttrCodeIsNotNull() {
            addCriterion("attr_code is not null");
            return (Criteria) this;
        }

        public Criteria andAttrCodeEqualTo(String value) {
            addCriterion("attr_code =", value, "attrCode");
            return (Criteria) this;
        }

        public Criteria andAttrCodeNotEqualTo(String value) {
            addCriterion("attr_code <>", value, "attrCode");
            return (Criteria) this;
        }

        public Criteria andAttrCodeGreaterThan(String value) {
            addCriterion("attr_code >", value, "attrCode");
            return (Criteria) this;
        }

        public Criteria andAttrCodeGreaterThanOrEqualTo(String value) {
            addCriterion("attr_code >=", value, "attrCode");
            return (Criteria) this;
        }

        public Criteria andAttrCodeLessThan(String value) {
            addCriterion("attr_code <", value, "attrCode");
            return (Criteria) this;
        }

        public Criteria andAttrCodeLessThanOrEqualTo(String value) {
            addCriterion("attr_code <=", value, "attrCode");
            return (Criteria) this;
        }

        public Criteria andAttrCodeLike(String value) {
            addCriterion("attr_code like", value, "attrCode");
            return (Criteria) this;
        }

        public Criteria andAttrCodeNotLike(String value) {
            addCriterion("attr_code not like", value, "attrCode");
            return (Criteria) this;
        }

        public Criteria andAttrCodeIn(List<String> values) {
            addCriterion("attr_code in", values, "attrCode");
            return (Criteria) this;
        }

        public Criteria andAttrCodeNotIn(List<String> values) {
            addCriterion("attr_code not in", values, "attrCode");
            return (Criteria) this;
        }

        public Criteria andAttrCodeBetween(String value1, String value2) {
            addCriterion("attr_code between", value1, value2, "attrCode");
            return (Criteria) this;
        }

        public Criteria andAttrCodeNotBetween(String value1, String value2) {
            addCriterion("attr_code not between", value1, value2, "attrCode");
            return (Criteria) this;
        }

        public Criteria andAttrNameIsNull() {
            addCriterion("attr_name is null");
            return (Criteria) this;
        }

        public Criteria andAttrNameIsNotNull() {
            addCriterion("attr_name is not null");
            return (Criteria) this;
        }

        public Criteria andAttrNameEqualTo(String value) {
            addCriterion("attr_name =", value, "attrName");
            return (Criteria) this;
        }

        public Criteria andAttrNameNotEqualTo(String value) {
            addCriterion("attr_name <>", value, "attrName");
            return (Criteria) this;
        }

        public Criteria andAttrNameGreaterThan(String value) {
            addCriterion("attr_name >", value, "attrName");
            return (Criteria) this;
        }

        public Criteria andAttrNameGreaterThanOrEqualTo(String value) {
            addCriterion("attr_name >=", value, "attrName");
            return (Criteria) this;
        }

        public Criteria andAttrNameLessThan(String value) {
            addCriterion("attr_name <", value, "attrName");
            return (Criteria) this;
        }

        public Criteria andAttrNameLessThanOrEqualTo(String value) {
            addCriterion("attr_name <=", value, "attrName");
            return (Criteria) this;
        }

        public Criteria andAttrNameLike(String value) {
            addCriterion("attr_name like", value, "attrName");
            return (Criteria) this;
        }

        public Criteria andAttrNameNotLike(String value) {
            addCriterion("attr_name not like", value, "attrName");
            return (Criteria) this;
        }

        public Criteria andAttrNameIn(List<String> values) {
            addCriterion("attr_name in", values, "attrName");
            return (Criteria) this;
        }

        public Criteria andAttrNameNotIn(List<String> values) {
            addCriterion("attr_name not in", values, "attrName");
            return (Criteria) this;
        }

        public Criteria andAttrNameBetween(String value1, String value2) {
            addCriterion("attr_name between", value1, value2, "attrName");
            return (Criteria) this;
        }

        public Criteria andAttrNameNotBetween(String value1, String value2) {
            addCriterion("attr_name not between", value1, value2, "attrName");
            return (Criteria) this;
        }

        public Criteria andUnitIsNull() {
            addCriterion("unit is null");
            return (Criteria) this;
        }

        public Criteria andUnitIsNotNull() {
            addCriterion("unit is not null");
            return (Criteria) this;
        }

        public Criteria andUnitEqualTo(String value) {
            addCriterion("unit =", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotEqualTo(String value) {
            addCriterion("unit <>", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThan(String value) {
            addCriterion("unit >", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThanOrEqualTo(String value) {
            addCriterion("unit >=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThan(String value) {
            addCriterion("unit <", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThanOrEqualTo(String value) {
            addCriterion("unit <=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLike(String value) {
            addCriterion("unit like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotLike(String value) {
            addCriterion("unit not like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitIn(List<String> values) {
            addCriterion("unit in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotIn(List<String> values) {
            addCriterion("unit not in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitBetween(String value1, String value2) {
            addCriterion("unit between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotBetween(String value1, String value2) {
            addCriterion("unit not between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(BigDecimal value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(BigDecimal value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(BigDecimal value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(BigDecimal value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<BigDecimal> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<BigDecimal> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andTotalMnyIsNull() {
            addCriterion("total_mny is null");
            return (Criteria) this;
        }

        public Criteria andTotalMnyIsNotNull() {
            addCriterion("total_mny is not null");
            return (Criteria) this;
        }

        public Criteria andTotalMnyEqualTo(BigDecimal value) {
            addCriterion("total_mny =", value, "totalMny");
            return (Criteria) this;
        }

        public Criteria andTotalMnyNotEqualTo(BigDecimal value) {
            addCriterion("total_mny <>", value, "totalMny");
            return (Criteria) this;
        }

        public Criteria andTotalMnyGreaterThan(BigDecimal value) {
            addCriterion("total_mny >", value, "totalMny");
            return (Criteria) this;
        }

        public Criteria andTotalMnyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("total_mny >=", value, "totalMny");
            return (Criteria) this;
        }

        public Criteria andTotalMnyLessThan(BigDecimal value) {
            addCriterion("total_mny <", value, "totalMny");
            return (Criteria) this;
        }

        public Criteria andTotalMnyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("total_mny <=", value, "totalMny");
            return (Criteria) this;
        }

        public Criteria andTotalMnyIn(List<BigDecimal> values) {
            addCriterion("total_mny in", values, "totalMny");
            return (Criteria) this;
        }

        public Criteria andTotalMnyNotIn(List<BigDecimal> values) {
            addCriterion("total_mny not in", values, "totalMny");
            return (Criteria) this;
        }

        public Criteria andTotalMnyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_mny between", value1, value2, "totalMny");
            return (Criteria) this;
        }

        public Criteria andTotalMnyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_mny not between", value1, value2, "totalMny");
            return (Criteria) this;
        }

        public Criteria andMainImgUrlIsNull() {
            addCriterion("main_img_url is null");
            return (Criteria) this;
        }

        public Criteria andMainImgUrlIsNotNull() {
            addCriterion("main_img_url is not null");
            return (Criteria) this;
        }

        public Criteria andMainImgUrlEqualTo(String value) {
            addCriterion("main_img_url =", value, "mainImgUrl");
            return (Criteria) this;
        }

        public Criteria andMainImgUrlNotEqualTo(String value) {
            addCriterion("main_img_url <>", value, "mainImgUrl");
            return (Criteria) this;
        }

        public Criteria andMainImgUrlGreaterThan(String value) {
            addCriterion("main_img_url >", value, "mainImgUrl");
            return (Criteria) this;
        }

        public Criteria andMainImgUrlGreaterThanOrEqualTo(String value) {
            addCriterion("main_img_url >=", value, "mainImgUrl");
            return (Criteria) this;
        }

        public Criteria andMainImgUrlLessThan(String value) {
            addCriterion("main_img_url <", value, "mainImgUrl");
            return (Criteria) this;
        }

        public Criteria andMainImgUrlLessThanOrEqualTo(String value) {
            addCriterion("main_img_url <=", value, "mainImgUrl");
            return (Criteria) this;
        }

        public Criteria andMainImgUrlLike(String value) {
            addCriterion("main_img_url like", value, "mainImgUrl");
            return (Criteria) this;
        }

        public Criteria andMainImgUrlNotLike(String value) {
            addCriterion("main_img_url not like", value, "mainImgUrl");
            return (Criteria) this;
        }

        public Criteria andMainImgUrlIn(List<String> values) {
            addCriterion("main_img_url in", values, "mainImgUrl");
            return (Criteria) this;
        }

        public Criteria andMainImgUrlNotIn(List<String> values) {
            addCriterion("main_img_url not in", values, "mainImgUrl");
            return (Criteria) this;
        }

        public Criteria andMainImgUrlBetween(String value1, String value2) {
            addCriterion("main_img_url between", value1, value2, "mainImgUrl");
            return (Criteria) this;
        }

        public Criteria andMainImgUrlNotBetween(String value1, String value2) {
            addCriterion("main_img_url not between", value1, value2, "mainImgUrl");
            return (Criteria) this;
        }

        public Criteria andApplyQuantityIsNull() {
            addCriterion("apply_quantity is null");
            return (Criteria) this;
        }

        public Criteria andApplyQuantityIsNotNull() {
            addCriterion("apply_quantity is not null");
            return (Criteria) this;
        }

        public Criteria andApplyQuantityEqualTo(Integer value) {
            addCriterion("apply_quantity =", value, "applyQuantity");
            return (Criteria) this;
        }

        public Criteria andApplyQuantityNotEqualTo(Integer value) {
            addCriterion("apply_quantity <>", value, "applyQuantity");
            return (Criteria) this;
        }

        public Criteria andApplyQuantityGreaterThan(Integer value) {
            addCriterion("apply_quantity >", value, "applyQuantity");
            return (Criteria) this;
        }

        public Criteria andApplyQuantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("apply_quantity >=", value, "applyQuantity");
            return (Criteria) this;
        }

        public Criteria andApplyQuantityLessThan(Integer value) {
            addCriterion("apply_quantity <", value, "applyQuantity");
            return (Criteria) this;
        }

        public Criteria andApplyQuantityLessThanOrEqualTo(Integer value) {
            addCriterion("apply_quantity <=", value, "applyQuantity");
            return (Criteria) this;
        }

        public Criteria andApplyQuantityIn(List<Integer> values) {
            addCriterion("apply_quantity in", values, "applyQuantity");
            return (Criteria) this;
        }

        public Criteria andApplyQuantityNotIn(List<Integer> values) {
            addCriterion("apply_quantity not in", values, "applyQuantity");
            return (Criteria) this;
        }

        public Criteria andApplyQuantityBetween(Integer value1, Integer value2) {
            addCriterion("apply_quantity between", value1, value2, "applyQuantity");
            return (Criteria) this;
        }

        public Criteria andApplyQuantityNotBetween(Integer value1, Integer value2) {
            addCriterion("apply_quantity not between", value1, value2, "applyQuantity");
            return (Criteria) this;
        }

        public Criteria andOutQuantityIsNull() {
            addCriterion("out_quantity is null");
            return (Criteria) this;
        }

        public Criteria andOutQuantityIsNotNull() {
            addCriterion("out_quantity is not null");
            return (Criteria) this;
        }

        public Criteria andOutQuantityEqualTo(Integer value) {
            addCriterion("out_quantity =", value, "outQuantity");
            return (Criteria) this;
        }

        public Criteria andOutQuantityNotEqualTo(Integer value) {
            addCriterion("out_quantity <>", value, "outQuantity");
            return (Criteria) this;
        }

        public Criteria andOutQuantityGreaterThan(Integer value) {
            addCriterion("out_quantity >", value, "outQuantity");
            return (Criteria) this;
        }

        public Criteria andOutQuantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("out_quantity >=", value, "outQuantity");
            return (Criteria) this;
        }

        public Criteria andOutQuantityLessThan(Integer value) {
            addCriterion("out_quantity <", value, "outQuantity");
            return (Criteria) this;
        }

        public Criteria andOutQuantityLessThanOrEqualTo(Integer value) {
            addCriterion("out_quantity <=", value, "outQuantity");
            return (Criteria) this;
        }

        public Criteria andOutQuantityIn(List<Integer> values) {
            addCriterion("out_quantity in", values, "outQuantity");
            return (Criteria) this;
        }

        public Criteria andOutQuantityNotIn(List<Integer> values) {
            addCriterion("out_quantity not in", values, "outQuantity");
            return (Criteria) this;
        }

        public Criteria andOutQuantityBetween(Integer value1, Integer value2) {
            addCriterion("out_quantity between", value1, value2, "outQuantity");
            return (Criteria) this;
        }

        public Criteria andOutQuantityNotBetween(Integer value1, Integer value2) {
            addCriterion("out_quantity not between", value1, value2, "outQuantity");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIsNull() {
            addCriterion("category_id is null");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIsNotNull() {
            addCriterion("category_id is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryIdEqualTo(Integer value) {
            addCriterion("category_id =", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotEqualTo(Integer value) {
            addCriterion("category_id <>", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdGreaterThan(Integer value) {
            addCriterion("category_id >", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("category_id >=", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdLessThan(Integer value) {
            addCriterion("category_id <", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdLessThanOrEqualTo(Integer value) {
            addCriterion("category_id <=", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIn(List<Integer> values) {
            addCriterion("category_id in", values, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotIn(List<Integer> values) {
            addCriterion("category_id not in", values, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdBetween(Integer value1, Integer value2) {
            addCriterion("category_id between", value1, value2, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("category_id not between", value1, value2, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryNameIsNull() {
            addCriterion("category_name is null");
            return (Criteria) this;
        }

        public Criteria andCategoryNameIsNotNull() {
            addCriterion("category_name is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryNameEqualTo(String value) {
            addCriterion("category_name =", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameNotEqualTo(String value) {
            addCriterion("category_name <>", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameGreaterThan(String value) {
            addCriterion("category_name >", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameGreaterThanOrEqualTo(String value) {
            addCriterion("category_name >=", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameLessThan(String value) {
            addCriterion("category_name <", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameLessThanOrEqualTo(String value) {
            addCriterion("category_name <=", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameLike(String value) {
            addCriterion("category_name like", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameNotLike(String value) {
            addCriterion("category_name not like", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameIn(List<String> values) {
            addCriterion("category_name in", values, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameNotIn(List<String> values) {
            addCriterion("category_name not in", values, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameBetween(String value1, String value2) {
            addCriterion("category_name between", value1, value2, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameNotBetween(String value1, String value2) {
            addCriterion("category_name not between", value1, value2, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeIsNull() {
            addCriterion("category_code is null");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeIsNotNull() {
            addCriterion("category_code is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeEqualTo(String value) {
            addCriterion("category_code =", value, "categoryCode");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeNotEqualTo(String value) {
            addCriterion("category_code <>", value, "categoryCode");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeGreaterThan(String value) {
            addCriterion("category_code >", value, "categoryCode");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeGreaterThanOrEqualTo(String value) {
            addCriterion("category_code >=", value, "categoryCode");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeLessThan(String value) {
            addCriterion("category_code <", value, "categoryCode");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeLessThanOrEqualTo(String value) {
            addCriterion("category_code <=", value, "categoryCode");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeLike(String value) {
            addCriterion("category_code like", value, "categoryCode");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeNotLike(String value) {
            addCriterion("category_code not like", value, "categoryCode");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeIn(List<String> values) {
            addCriterion("category_code in", values, "categoryCode");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeNotIn(List<String> values) {
            addCriterion("category_code not in", values, "categoryCode");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeBetween(String value1, String value2) {
            addCriterion("category_code between", value1, value2, "categoryCode");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeNotBetween(String value1, String value2) {
            addCriterion("category_code not between", value1, value2, "categoryCode");
            return (Criteria) this;
        }

        public Criteria andIsSetPriceIsNull() {
            addCriterion("is_set_price is null");
            return (Criteria) this;
        }

        public Criteria andIsSetPriceIsNotNull() {
            addCriterion("is_set_price is not null");
            return (Criteria) this;
        }

        public Criteria andIsSetPriceEqualTo(Boolean value) {
            addCriterion("is_set_price =", value, "isSetPrice");
            return (Criteria) this;
        }

        public Criteria andIsSetPriceNotEqualTo(Boolean value) {
            addCriterion("is_set_price <>", value, "isSetPrice");
            return (Criteria) this;
        }

        public Criteria andIsSetPriceGreaterThan(Boolean value) {
            addCriterion("is_set_price >", value, "isSetPrice");
            return (Criteria) this;
        }

        public Criteria andIsSetPriceGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_set_price >=", value, "isSetPrice");
            return (Criteria) this;
        }

        public Criteria andIsSetPriceLessThan(Boolean value) {
            addCriterion("is_set_price <", value, "isSetPrice");
            return (Criteria) this;
        }

        public Criteria andIsSetPriceLessThanOrEqualTo(Boolean value) {
            addCriterion("is_set_price <=", value, "isSetPrice");
            return (Criteria) this;
        }

        public Criteria andIsSetPriceIn(List<Boolean> values) {
            addCriterion("is_set_price in", values, "isSetPrice");
            return (Criteria) this;
        }

        public Criteria andIsSetPriceNotIn(List<Boolean> values) {
            addCriterion("is_set_price not in", values, "isSetPrice");
            return (Criteria) this;
        }

        public Criteria andIsSetPriceBetween(Boolean value1, Boolean value2) {
            addCriterion("is_set_price between", value1, value2, "isSetPrice");
            return (Criteria) this;
        }

        public Criteria andIsSetPriceNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_set_price not between", value1, value2, "isSetPrice");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNull() {
            addCriterion("creator is null");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNotNull() {
            addCriterion("creator is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorEqualTo(String value) {
            addCriterion("creator =", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotEqualTo(String value) {
            addCriterion("creator <>", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThan(String value) {
            addCriterion("creator >", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThanOrEqualTo(String value) {
            addCriterion("creator >=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThan(String value) {
            addCriterion("creator <", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThanOrEqualTo(String value) {
            addCriterion("creator <=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLike(String value) {
            addCriterion("creator like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotLike(String value) {
            addCriterion("creator not like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorIn(List<String> values) {
            addCriterion("creator in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotIn(List<String> values) {
            addCriterion("creator not in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorBetween(String value1, String value2) {
            addCriterion("creator between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotBetween(String value1, String value2) {
            addCriterion("creator not between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andModifierIsNull() {
            addCriterion("modifier is null");
            return (Criteria) this;
        }

        public Criteria andModifierIsNotNull() {
            addCriterion("modifier is not null");
            return (Criteria) this;
        }

        public Criteria andModifierEqualTo(String value) {
            addCriterion("modifier =", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotEqualTo(String value) {
            addCriterion("modifier <>", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierGreaterThan(String value) {
            addCriterion("modifier >", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierGreaterThanOrEqualTo(String value) {
            addCriterion("modifier >=", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierLessThan(String value) {
            addCriterion("modifier <", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierLessThanOrEqualTo(String value) {
            addCriterion("modifier <=", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierLike(String value) {
            addCriterion("modifier like", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotLike(String value) {
            addCriterion("modifier not like", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierIn(List<String> values) {
            addCriterion("modifier in", values, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotIn(List<String> values) {
            addCriterion("modifier not in", values, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierBetween(String value1, String value2) {
            addCriterion("modifier between", value1, value2, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotBetween(String value1, String value2) {
            addCriterion("modifier not between", value1, value2, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNull() {
            addCriterion("modify_time is null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNotNull() {
            addCriterion("modify_time is not null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeEqualTo(Date value) {
            addCriterion("modify_time =", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotEqualTo(Date value) {
            addCriterion("modify_time <>", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThan(Date value) {
            addCriterion("modify_time >", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("modify_time >=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThan(Date value) {
            addCriterion("modify_time <", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("modify_time <=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIn(List<Date> values) {
            addCriterion("modify_time in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotIn(List<Date> values) {
            addCriterion("modify_time not in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeBetween(Date value1, Date value2) {
            addCriterion("modify_time between", value1, value2, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("modify_time not between", value1, value2, "modifyTime");
            return (Criteria) this;
        }
    }

    /**
     * stock_out_bill_detail
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * stock_out_bill_detail 2018-05-17
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }

    public static class SelectiveField {
        private Set<String> fields;

        private static String allFields = "id,stock_out_bill_detail_code,stock_out_bill_main_code,goods_id,goods_code,goods_name,sku_id,sku_code,sku_name,size_id,size_code,size_name,quantity,weight,color_id,color_code,color_name,attr_id,attr_code,attr_name,unit,price,total_mny,main_img_url,apply_quantity,out_quantity,category_id,category_name,category_code,is_set_price,remark,creator,create_time,modifier,modify_time";

        private SelectiveField() {
            fields = new HashSet<>();
        }

        public static SelectiveField select() {
            return new SelectiveField();
        }

        public SelectiveField id() {
            fields.add("id");
            return this;
        }

        public SelectiveField stockOutBillDetailCode() {
            fields.add("stock_out_bill_detail_code");
            return this;
        }

        public SelectiveField stockOutBillMainCode() {
            fields.add("stock_out_bill_main_code");
            return this;
        }

        public SelectiveField goodsId() {
            fields.add("goods_id");
            return this;
        }

        public SelectiveField goodsCode() {
            fields.add("goods_code");
            return this;
        }

        public SelectiveField goodsName() {
            fields.add("goods_name");
            return this;
        }

        public SelectiveField skuId() {
            fields.add("sku_id");
            return this;
        }

        public SelectiveField skuCode() {
            fields.add("sku_code");
            return this;
        }

        public SelectiveField skuName() {
            fields.add("sku_name");
            return this;
        }

        public SelectiveField sizeId() {
            fields.add("size_id");
            return this;
        }

        public SelectiveField sizeCode() {
            fields.add("size_code");
            return this;
        }

        public SelectiveField sizeName() {
            fields.add("size_name");
            return this;
        }

        public SelectiveField quantity() {
            fields.add("quantity");
            return this;
        }

        public SelectiveField weight() {
            fields.add("weight");
            return this;
        }

        public SelectiveField colorId() {
            fields.add("color_id");
            return this;
        }

        public SelectiveField colorCode() {
            fields.add("color_code");
            return this;
        }

        public SelectiveField colorName() {
            fields.add("color_name");
            return this;
        }

        public SelectiveField attrId() {
            fields.add("attr_id");
            return this;
        }

        public SelectiveField attrCode() {
            fields.add("attr_code");
            return this;
        }

        public SelectiveField attrName() {
            fields.add("attr_name");
            return this;
        }

        public SelectiveField unit() {
            fields.add("unit");
            return this;
        }

        public SelectiveField price() {
            fields.add("price");
            return this;
        }

        public SelectiveField totalMny() {
            fields.add("total_mny");
            return this;
        }

        public SelectiveField mainImgUrl() {
            fields.add("main_img_url");
            return this;
        }

        public SelectiveField applyQuantity() {
            fields.add("apply_quantity");
            return this;
        }

        public SelectiveField outQuantity() {
            fields.add("out_quantity");
            return this;
        }

        public SelectiveField categoryId() {
            fields.add("category_id");
            return this;
        }

        public SelectiveField categoryName() {
            fields.add("category_name");
            return this;
        }

        public SelectiveField categoryCode() {
            fields.add("category_code");
            return this;
        }

        public SelectiveField isSetPrice() {
            fields.add("is_set_price");
            return this;
        }

        public SelectiveField remark() {
            fields.add("remark");
            return this;
        }

        public SelectiveField creator() {
            fields.add("creator");
            return this;
        }

        public SelectiveField createTime() {
            fields.add("create_time");
            return this;
        }

        public SelectiveField modifier() {
            fields.add("modifier");
            return this;
        }

        public SelectiveField modifyTime() {
            fields.add("modify_time");
            return this;
        }

        @Override
        public String toString() {
            if(fields.isEmpty()) return allFields;
            StringBuilder sb = new StringBuilder();
            char seperator = ',';
            Iterator<String> fieldInterator = fields.iterator();
            int i = 0;
            while(fieldInterator.hasNext()){
                if(i>0) sb.append(seperator);
                sb.append(fieldInterator.next());
                i++;
            }
            return sb.toString();
        }
    }
}