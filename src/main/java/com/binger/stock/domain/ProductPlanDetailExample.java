package com.binger.stock.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ProductPlanDetailExample {
    /**
     * product_plan_detail
     */
    protected String orderByClause;

    /**
     * product_plan_detail
     */
    protected boolean distinct;

    /**
     * product_plan_detail
     */
    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    private SelectiveField selectiveField;

    public ProductPlanDetailExample() {
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
     * product_plan_detail 2018-05-17
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

        public Criteria andProductPlanMainIdIsNull() {
            addCriterion("product_plan_main_id is null");
            return (Criteria) this;
        }

        public Criteria andProductPlanMainIdIsNotNull() {
            addCriterion("product_plan_main_id is not null");
            return (Criteria) this;
        }

        public Criteria andProductPlanMainIdEqualTo(Integer value) {
            addCriterion("product_plan_main_id =", value, "productPlanMainId");
            return (Criteria) this;
        }

        public Criteria andProductPlanMainIdNotEqualTo(Integer value) {
            addCriterion("product_plan_main_id <>", value, "productPlanMainId");
            return (Criteria) this;
        }

        public Criteria andProductPlanMainIdGreaterThan(Integer value) {
            addCriterion("product_plan_main_id >", value, "productPlanMainId");
            return (Criteria) this;
        }

        public Criteria andProductPlanMainIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("product_plan_main_id >=", value, "productPlanMainId");
            return (Criteria) this;
        }

        public Criteria andProductPlanMainIdLessThan(Integer value) {
            addCriterion("product_plan_main_id <", value, "productPlanMainId");
            return (Criteria) this;
        }

        public Criteria andProductPlanMainIdLessThanOrEqualTo(Integer value) {
            addCriterion("product_plan_main_id <=", value, "productPlanMainId");
            return (Criteria) this;
        }

        public Criteria andProductPlanMainIdIn(List<Integer> values) {
            addCriterion("product_plan_main_id in", values, "productPlanMainId");
            return (Criteria) this;
        }

        public Criteria andProductPlanMainIdNotIn(List<Integer> values) {
            addCriterion("product_plan_main_id not in", values, "productPlanMainId");
            return (Criteria) this;
        }

        public Criteria andProductPlanMainIdBetween(Integer value1, Integer value2) {
            addCriterion("product_plan_main_id between", value1, value2, "productPlanMainId");
            return (Criteria) this;
        }

        public Criteria andProductPlanMainIdNotBetween(Integer value1, Integer value2) {
            addCriterion("product_plan_main_id not between", value1, value2, "productPlanMainId");
            return (Criteria) this;
        }

        public Criteria andProductPlanCodeIsNull() {
            addCriterion("product_plan_code is null");
            return (Criteria) this;
        }

        public Criteria andProductPlanCodeIsNotNull() {
            addCriterion("product_plan_code is not null");
            return (Criteria) this;
        }

        public Criteria andProductPlanCodeEqualTo(String value) {
            addCriterion("product_plan_code =", value, "productPlanCode");
            return (Criteria) this;
        }

        public Criteria andProductPlanCodeNotEqualTo(String value) {
            addCriterion("product_plan_code <>", value, "productPlanCode");
            return (Criteria) this;
        }

        public Criteria andProductPlanCodeGreaterThan(String value) {
            addCriterion("product_plan_code >", value, "productPlanCode");
            return (Criteria) this;
        }

        public Criteria andProductPlanCodeGreaterThanOrEqualTo(String value) {
            addCriterion("product_plan_code >=", value, "productPlanCode");
            return (Criteria) this;
        }

        public Criteria andProductPlanCodeLessThan(String value) {
            addCriterion("product_plan_code <", value, "productPlanCode");
            return (Criteria) this;
        }

        public Criteria andProductPlanCodeLessThanOrEqualTo(String value) {
            addCriterion("product_plan_code <=", value, "productPlanCode");
            return (Criteria) this;
        }

        public Criteria andProductPlanCodeLike(String value) {
            addCriterion("product_plan_code like", value, "productPlanCode");
            return (Criteria) this;
        }

        public Criteria andProductPlanCodeNotLike(String value) {
            addCriterion("product_plan_code not like", value, "productPlanCode");
            return (Criteria) this;
        }

        public Criteria andProductPlanCodeIn(List<String> values) {
            addCriterion("product_plan_code in", values, "productPlanCode");
            return (Criteria) this;
        }

        public Criteria andProductPlanCodeNotIn(List<String> values) {
            addCriterion("product_plan_code not in", values, "productPlanCode");
            return (Criteria) this;
        }

        public Criteria andProductPlanCodeBetween(String value1, String value2) {
            addCriterion("product_plan_code between", value1, value2, "productPlanCode");
            return (Criteria) this;
        }

        public Criteria andProductPlanCodeNotBetween(String value1, String value2) {
            addCriterion("product_plan_code not between", value1, value2, "productPlanCode");
            return (Criteria) this;
        }

        public Criteria andProductPlanDetailCodeIsNull() {
            addCriterion("product_plan_detail_code is null");
            return (Criteria) this;
        }

        public Criteria andProductPlanDetailCodeIsNotNull() {
            addCriterion("product_plan_detail_code is not null");
            return (Criteria) this;
        }

        public Criteria andProductPlanDetailCodeEqualTo(String value) {
            addCriterion("product_plan_detail_code =", value, "productPlanDetailCode");
            return (Criteria) this;
        }

        public Criteria andProductPlanDetailCodeNotEqualTo(String value) {
            addCriterion("product_plan_detail_code <>", value, "productPlanDetailCode");
            return (Criteria) this;
        }

        public Criteria andProductPlanDetailCodeGreaterThan(String value) {
            addCriterion("product_plan_detail_code >", value, "productPlanDetailCode");
            return (Criteria) this;
        }

        public Criteria andProductPlanDetailCodeGreaterThanOrEqualTo(String value) {
            addCriterion("product_plan_detail_code >=", value, "productPlanDetailCode");
            return (Criteria) this;
        }

        public Criteria andProductPlanDetailCodeLessThan(String value) {
            addCriterion("product_plan_detail_code <", value, "productPlanDetailCode");
            return (Criteria) this;
        }

        public Criteria andProductPlanDetailCodeLessThanOrEqualTo(String value) {
            addCriterion("product_plan_detail_code <=", value, "productPlanDetailCode");
            return (Criteria) this;
        }

        public Criteria andProductPlanDetailCodeLike(String value) {
            addCriterion("product_plan_detail_code like", value, "productPlanDetailCode");
            return (Criteria) this;
        }

        public Criteria andProductPlanDetailCodeNotLike(String value) {
            addCriterion("product_plan_detail_code not like", value, "productPlanDetailCode");
            return (Criteria) this;
        }

        public Criteria andProductPlanDetailCodeIn(List<String> values) {
            addCriterion("product_plan_detail_code in", values, "productPlanDetailCode");
            return (Criteria) this;
        }

        public Criteria andProductPlanDetailCodeNotIn(List<String> values) {
            addCriterion("product_plan_detail_code not in", values, "productPlanDetailCode");
            return (Criteria) this;
        }

        public Criteria andProductPlanDetailCodeBetween(String value1, String value2) {
            addCriterion("product_plan_detail_code between", value1, value2, "productPlanDetailCode");
            return (Criteria) this;
        }

        public Criteria andProductPlanDetailCodeNotBetween(String value1, String value2) {
            addCriterion("product_plan_detail_code not between", value1, value2, "productPlanDetailCode");
            return (Criteria) this;
        }

        public Criteria andProductOrderCodeIsNull() {
            addCriterion("product_order_code is null");
            return (Criteria) this;
        }

        public Criteria andProductOrderCodeIsNotNull() {
            addCriterion("product_order_code is not null");
            return (Criteria) this;
        }

        public Criteria andProductOrderCodeEqualTo(String value) {
            addCriterion("product_order_code =", value, "productOrderCode");
            return (Criteria) this;
        }

        public Criteria andProductOrderCodeNotEqualTo(String value) {
            addCriterion("product_order_code <>", value, "productOrderCode");
            return (Criteria) this;
        }

        public Criteria andProductOrderCodeGreaterThan(String value) {
            addCriterion("product_order_code >", value, "productOrderCode");
            return (Criteria) this;
        }

        public Criteria andProductOrderCodeGreaterThanOrEqualTo(String value) {
            addCriterion("product_order_code >=", value, "productOrderCode");
            return (Criteria) this;
        }

        public Criteria andProductOrderCodeLessThan(String value) {
            addCriterion("product_order_code <", value, "productOrderCode");
            return (Criteria) this;
        }

        public Criteria andProductOrderCodeLessThanOrEqualTo(String value) {
            addCriterion("product_order_code <=", value, "productOrderCode");
            return (Criteria) this;
        }

        public Criteria andProductOrderCodeLike(String value) {
            addCriterion("product_order_code like", value, "productOrderCode");
            return (Criteria) this;
        }

        public Criteria andProductOrderCodeNotLike(String value) {
            addCriterion("product_order_code not like", value, "productOrderCode");
            return (Criteria) this;
        }

        public Criteria andProductOrderCodeIn(List<String> values) {
            addCriterion("product_order_code in", values, "productOrderCode");
            return (Criteria) this;
        }

        public Criteria andProductOrderCodeNotIn(List<String> values) {
            addCriterion("product_order_code not in", values, "productOrderCode");
            return (Criteria) this;
        }

        public Criteria andProductOrderCodeBetween(String value1, String value2) {
            addCriterion("product_order_code between", value1, value2, "productOrderCode");
            return (Criteria) this;
        }

        public Criteria andProductOrderCodeNotBetween(String value1, String value2) {
            addCriterion("product_order_code not between", value1, value2, "productOrderCode");
            return (Criteria) this;
        }

        public Criteria andProductStatusIsNull() {
            addCriterion("product_status is null");
            return (Criteria) this;
        }

        public Criteria andProductStatusIsNotNull() {
            addCriterion("product_status is not null");
            return (Criteria) this;
        }

        public Criteria andProductStatusEqualTo(Boolean value) {
            addCriterion("product_status =", value, "productStatus");
            return (Criteria) this;
        }

        public Criteria andProductStatusNotEqualTo(Boolean value) {
            addCriterion("product_status <>", value, "productStatus");
            return (Criteria) this;
        }

        public Criteria andProductStatusGreaterThan(Boolean value) {
            addCriterion("product_status >", value, "productStatus");
            return (Criteria) this;
        }

        public Criteria andProductStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("product_status >=", value, "productStatus");
            return (Criteria) this;
        }

        public Criteria andProductStatusLessThan(Boolean value) {
            addCriterion("product_status <", value, "productStatus");
            return (Criteria) this;
        }

        public Criteria andProductStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("product_status <=", value, "productStatus");
            return (Criteria) this;
        }

        public Criteria andProductStatusIn(List<Boolean> values) {
            addCriterion("product_status in", values, "productStatus");
            return (Criteria) this;
        }

        public Criteria andProductStatusNotIn(List<Boolean> values) {
            addCriterion("product_status not in", values, "productStatus");
            return (Criteria) this;
        }

        public Criteria andProductStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("product_status between", value1, value2, "productStatus");
            return (Criteria) this;
        }

        public Criteria andProductStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("product_status not between", value1, value2, "productStatus");
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

        public Criteria andGoodsImgIdIsNull() {
            addCriterion("goods_img_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsImgIdIsNotNull() {
            addCriterion("goods_img_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsImgIdEqualTo(Integer value) {
            addCriterion("goods_img_id =", value, "goodsImgId");
            return (Criteria) this;
        }

        public Criteria andGoodsImgIdNotEqualTo(Integer value) {
            addCriterion("goods_img_id <>", value, "goodsImgId");
            return (Criteria) this;
        }

        public Criteria andGoodsImgIdGreaterThan(Integer value) {
            addCriterion("goods_img_id >", value, "goodsImgId");
            return (Criteria) this;
        }

        public Criteria andGoodsImgIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_img_id >=", value, "goodsImgId");
            return (Criteria) this;
        }

        public Criteria andGoodsImgIdLessThan(Integer value) {
            addCriterion("goods_img_id <", value, "goodsImgId");
            return (Criteria) this;
        }

        public Criteria andGoodsImgIdLessThanOrEqualTo(Integer value) {
            addCriterion("goods_img_id <=", value, "goodsImgId");
            return (Criteria) this;
        }

        public Criteria andGoodsImgIdIn(List<Integer> values) {
            addCriterion("goods_img_id in", values, "goodsImgId");
            return (Criteria) this;
        }

        public Criteria andGoodsImgIdNotIn(List<Integer> values) {
            addCriterion("goods_img_id not in", values, "goodsImgId");
            return (Criteria) this;
        }

        public Criteria andGoodsImgIdBetween(Integer value1, Integer value2) {
            addCriterion("goods_img_id between", value1, value2, "goodsImgId");
            return (Criteria) this;
        }

        public Criteria andGoodsImgIdNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_img_id not between", value1, value2, "goodsImgId");
            return (Criteria) this;
        }

        public Criteria andGoodsImgUrlIsNull() {
            addCriterion("goods_img_url is null");
            return (Criteria) this;
        }

        public Criteria andGoodsImgUrlIsNotNull() {
            addCriterion("goods_img_url is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsImgUrlEqualTo(String value) {
            addCriterion("goods_img_url =", value, "goodsImgUrl");
            return (Criteria) this;
        }

        public Criteria andGoodsImgUrlNotEqualTo(String value) {
            addCriterion("goods_img_url <>", value, "goodsImgUrl");
            return (Criteria) this;
        }

        public Criteria andGoodsImgUrlGreaterThan(String value) {
            addCriterion("goods_img_url >", value, "goodsImgUrl");
            return (Criteria) this;
        }

        public Criteria andGoodsImgUrlGreaterThanOrEqualTo(String value) {
            addCriterion("goods_img_url >=", value, "goodsImgUrl");
            return (Criteria) this;
        }

        public Criteria andGoodsImgUrlLessThan(String value) {
            addCriterion("goods_img_url <", value, "goodsImgUrl");
            return (Criteria) this;
        }

        public Criteria andGoodsImgUrlLessThanOrEqualTo(String value) {
            addCriterion("goods_img_url <=", value, "goodsImgUrl");
            return (Criteria) this;
        }

        public Criteria andGoodsImgUrlLike(String value) {
            addCriterion("goods_img_url like", value, "goodsImgUrl");
            return (Criteria) this;
        }

        public Criteria andGoodsImgUrlNotLike(String value) {
            addCriterion("goods_img_url not like", value, "goodsImgUrl");
            return (Criteria) this;
        }

        public Criteria andGoodsImgUrlIn(List<String> values) {
            addCriterion("goods_img_url in", values, "goodsImgUrl");
            return (Criteria) this;
        }

        public Criteria andGoodsImgUrlNotIn(List<String> values) {
            addCriterion("goods_img_url not in", values, "goodsImgUrl");
            return (Criteria) this;
        }

        public Criteria andGoodsImgUrlBetween(String value1, String value2) {
            addCriterion("goods_img_url between", value1, value2, "goodsImgUrl");
            return (Criteria) this;
        }

        public Criteria andGoodsImgUrlNotBetween(String value1, String value2) {
            addCriterion("goods_img_url not between", value1, value2, "goodsImgUrl");
            return (Criteria) this;
        }

        public Criteria andStockQuantityIsNull() {
            addCriterion("stock_quantity is null");
            return (Criteria) this;
        }

        public Criteria andStockQuantityIsNotNull() {
            addCriterion("stock_quantity is not null");
            return (Criteria) this;
        }

        public Criteria andStockQuantityEqualTo(Integer value) {
            addCriterion("stock_quantity =", value, "stockQuantity");
            return (Criteria) this;
        }

        public Criteria andStockQuantityNotEqualTo(Integer value) {
            addCriterion("stock_quantity <>", value, "stockQuantity");
            return (Criteria) this;
        }

        public Criteria andStockQuantityGreaterThan(Integer value) {
            addCriterion("stock_quantity >", value, "stockQuantity");
            return (Criteria) this;
        }

        public Criteria andStockQuantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("stock_quantity >=", value, "stockQuantity");
            return (Criteria) this;
        }

        public Criteria andStockQuantityLessThan(Integer value) {
            addCriterion("stock_quantity <", value, "stockQuantity");
            return (Criteria) this;
        }

        public Criteria andStockQuantityLessThanOrEqualTo(Integer value) {
            addCriterion("stock_quantity <=", value, "stockQuantity");
            return (Criteria) this;
        }

        public Criteria andStockQuantityIn(List<Integer> values) {
            addCriterion("stock_quantity in", values, "stockQuantity");
            return (Criteria) this;
        }

        public Criteria andStockQuantityNotIn(List<Integer> values) {
            addCriterion("stock_quantity not in", values, "stockQuantity");
            return (Criteria) this;
        }

        public Criteria andStockQuantityBetween(Integer value1, Integer value2) {
            addCriterion("stock_quantity between", value1, value2, "stockQuantity");
            return (Criteria) this;
        }

        public Criteria andStockQuantityNotBetween(Integer value1, Integer value2) {
            addCriterion("stock_quantity not between", value1, value2, "stockQuantity");
            return (Criteria) this;
        }

        public Criteria andOutofstockQuantityIsNull() {
            addCriterion("outofstock_quantity is null");
            return (Criteria) this;
        }

        public Criteria andOutofstockQuantityIsNotNull() {
            addCriterion("outofstock_quantity is not null");
            return (Criteria) this;
        }

        public Criteria andOutofstockQuantityEqualTo(Integer value) {
            addCriterion("outofstock_quantity =", value, "outofstockQuantity");
            return (Criteria) this;
        }

        public Criteria andOutofstockQuantityNotEqualTo(Integer value) {
            addCriterion("outofstock_quantity <>", value, "outofstockQuantity");
            return (Criteria) this;
        }

        public Criteria andOutofstockQuantityGreaterThan(Integer value) {
            addCriterion("outofstock_quantity >", value, "outofstockQuantity");
            return (Criteria) this;
        }

        public Criteria andOutofstockQuantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("outofstock_quantity >=", value, "outofstockQuantity");
            return (Criteria) this;
        }

        public Criteria andOutofstockQuantityLessThan(Integer value) {
            addCriterion("outofstock_quantity <", value, "outofstockQuantity");
            return (Criteria) this;
        }

        public Criteria andOutofstockQuantityLessThanOrEqualTo(Integer value) {
            addCriterion("outofstock_quantity <=", value, "outofstockQuantity");
            return (Criteria) this;
        }

        public Criteria andOutofstockQuantityIn(List<Integer> values) {
            addCriterion("outofstock_quantity in", values, "outofstockQuantity");
            return (Criteria) this;
        }

        public Criteria andOutofstockQuantityNotIn(List<Integer> values) {
            addCriterion("outofstock_quantity not in", values, "outofstockQuantity");
            return (Criteria) this;
        }

        public Criteria andOutofstockQuantityBetween(Integer value1, Integer value2) {
            addCriterion("outofstock_quantity between", value1, value2, "outofstockQuantity");
            return (Criteria) this;
        }

        public Criteria andOutofstockQuantityNotBetween(Integer value1, Integer value2) {
            addCriterion("outofstock_quantity not between", value1, value2, "outofstockQuantity");
            return (Criteria) this;
        }

        public Criteria andProductLinkIsNull() {
            addCriterion("product_link is null");
            return (Criteria) this;
        }

        public Criteria andProductLinkIsNotNull() {
            addCriterion("product_link is not null");
            return (Criteria) this;
        }

        public Criteria andProductLinkEqualTo(String value) {
            addCriterion("product_link =", value, "productLink");
            return (Criteria) this;
        }

        public Criteria andProductLinkNotEqualTo(String value) {
            addCriterion("product_link <>", value, "productLink");
            return (Criteria) this;
        }

        public Criteria andProductLinkGreaterThan(String value) {
            addCriterion("product_link >", value, "productLink");
            return (Criteria) this;
        }

        public Criteria andProductLinkGreaterThanOrEqualTo(String value) {
            addCriterion("product_link >=", value, "productLink");
            return (Criteria) this;
        }

        public Criteria andProductLinkLessThan(String value) {
            addCriterion("product_link <", value, "productLink");
            return (Criteria) this;
        }

        public Criteria andProductLinkLessThanOrEqualTo(String value) {
            addCriterion("product_link <=", value, "productLink");
            return (Criteria) this;
        }

        public Criteria andProductLinkLike(String value) {
            addCriterion("product_link like", value, "productLink");
            return (Criteria) this;
        }

        public Criteria andProductLinkNotLike(String value) {
            addCriterion("product_link not like", value, "productLink");
            return (Criteria) this;
        }

        public Criteria andProductLinkIn(List<String> values) {
            addCriterion("product_link in", values, "productLink");
            return (Criteria) this;
        }

        public Criteria andProductLinkNotIn(List<String> values) {
            addCriterion("product_link not in", values, "productLink");
            return (Criteria) this;
        }

        public Criteria andProductLinkBetween(String value1, String value2) {
            addCriterion("product_link between", value1, value2, "productLink");
            return (Criteria) this;
        }

        public Criteria andProductLinkNotBetween(String value1, String value2) {
            addCriterion("product_link not between", value1, value2, "productLink");
            return (Criteria) this;
        }

        public Criteria andCostPriceIsNull() {
            addCriterion("cost_price is null");
            return (Criteria) this;
        }

        public Criteria andCostPriceIsNotNull() {
            addCriterion("cost_price is not null");
            return (Criteria) this;
        }

        public Criteria andCostPriceEqualTo(BigDecimal value) {
            addCriterion("cost_price =", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceNotEqualTo(BigDecimal value) {
            addCriterion("cost_price <>", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceGreaterThan(BigDecimal value) {
            addCriterion("cost_price >", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("cost_price >=", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceLessThan(BigDecimal value) {
            addCriterion("cost_price <", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("cost_price <=", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceIn(List<BigDecimal> values) {
            addCriterion("cost_price in", values, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceNotIn(List<BigDecimal> values) {
            addCriterion("cost_price not in", values, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cost_price between", value1, value2, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cost_price not between", value1, value2, "costPrice");
            return (Criteria) this;
        }

        public Criteria andProductCommentsIsNull() {
            addCriterion("product_comments is null");
            return (Criteria) this;
        }

        public Criteria andProductCommentsIsNotNull() {
            addCriterion("product_comments is not null");
            return (Criteria) this;
        }

        public Criteria andProductCommentsEqualTo(String value) {
            addCriterion("product_comments =", value, "productComments");
            return (Criteria) this;
        }

        public Criteria andProductCommentsNotEqualTo(String value) {
            addCriterion("product_comments <>", value, "productComments");
            return (Criteria) this;
        }

        public Criteria andProductCommentsGreaterThan(String value) {
            addCriterion("product_comments >", value, "productComments");
            return (Criteria) this;
        }

        public Criteria andProductCommentsGreaterThanOrEqualTo(String value) {
            addCriterion("product_comments >=", value, "productComments");
            return (Criteria) this;
        }

        public Criteria andProductCommentsLessThan(String value) {
            addCriterion("product_comments <", value, "productComments");
            return (Criteria) this;
        }

        public Criteria andProductCommentsLessThanOrEqualTo(String value) {
            addCriterion("product_comments <=", value, "productComments");
            return (Criteria) this;
        }

        public Criteria andProductCommentsLike(String value) {
            addCriterion("product_comments like", value, "productComments");
            return (Criteria) this;
        }

        public Criteria andProductCommentsNotLike(String value) {
            addCriterion("product_comments not like", value, "productComments");
            return (Criteria) this;
        }

        public Criteria andProductCommentsIn(List<String> values) {
            addCriterion("product_comments in", values, "productComments");
            return (Criteria) this;
        }

        public Criteria andProductCommentsNotIn(List<String> values) {
            addCriterion("product_comments not in", values, "productComments");
            return (Criteria) this;
        }

        public Criteria andProductCommentsBetween(String value1, String value2) {
            addCriterion("product_comments between", value1, value2, "productComments");
            return (Criteria) this;
        }

        public Criteria andProductCommentsNotBetween(String value1, String value2) {
            addCriterion("product_comments not between", value1, value2, "productComments");
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
     * product_plan_detail
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * product_plan_detail 2018-05-17
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

        private static String allFields = "id,product_plan_main_id,product_plan_code,product_plan_detail_code,product_order_code,product_status,goods_id,goods_code,goods_name,sku_id,sku_code,sku_name,color_id,color_code,color_name,size_id,size_code,size_name,main_img_url,goods_img_id,goods_img_url,stock_quantity,outofstock_quantity,product_link,cost_price,product_comments,creator,create_time,modifier,modify_time";

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

        public SelectiveField productPlanMainId() {
            fields.add("product_plan_main_id");
            return this;
        }

        public SelectiveField productPlanCode() {
            fields.add("product_plan_code");
            return this;
        }

        public SelectiveField productPlanDetailCode() {
            fields.add("product_plan_detail_code");
            return this;
        }

        public SelectiveField productOrderCode() {
            fields.add("product_order_code");
            return this;
        }

        public SelectiveField productStatus() {
            fields.add("product_status");
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

        public SelectiveField mainImgUrl() {
            fields.add("main_img_url");
            return this;
        }

        public SelectiveField goodsImgId() {
            fields.add("goods_img_id");
            return this;
        }

        public SelectiveField goodsImgUrl() {
            fields.add("goods_img_url");
            return this;
        }

        public SelectiveField stockQuantity() {
            fields.add("stock_quantity");
            return this;
        }

        public SelectiveField outofstockQuantity() {
            fields.add("outofstock_quantity");
            return this;
        }

        public SelectiveField productLink() {
            fields.add("product_link");
            return this;
        }

        public SelectiveField costPrice() {
            fields.add("cost_price");
            return this;
        }

        public SelectiveField productComments() {
            fields.add("product_comments");
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