package com.binger.stock.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ProductOrderDetailExample {
    /**
     * product_order_detail
     */
    protected String orderByClause;

    /**
     * product_order_detail
     */
    protected boolean distinct;

    /**
     * product_order_detail
     */
    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    private SelectiveField selectiveField;

    public ProductOrderDetailExample() {
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
     * product_order_detail 2018-05-17
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

        public Criteria andProductOrderMainIdIsNull() {
            addCriterion("product_order_main_id is null");
            return (Criteria) this;
        }

        public Criteria andProductOrderMainIdIsNotNull() {
            addCriterion("product_order_main_id is not null");
            return (Criteria) this;
        }

        public Criteria andProductOrderMainIdEqualTo(String value) {
            addCriterion("product_order_main_id =", value, "productOrderMainId");
            return (Criteria) this;
        }

        public Criteria andProductOrderMainIdNotEqualTo(String value) {
            addCriterion("product_order_main_id <>", value, "productOrderMainId");
            return (Criteria) this;
        }

        public Criteria andProductOrderMainIdGreaterThan(String value) {
            addCriterion("product_order_main_id >", value, "productOrderMainId");
            return (Criteria) this;
        }

        public Criteria andProductOrderMainIdGreaterThanOrEqualTo(String value) {
            addCriterion("product_order_main_id >=", value, "productOrderMainId");
            return (Criteria) this;
        }

        public Criteria andProductOrderMainIdLessThan(String value) {
            addCriterion("product_order_main_id <", value, "productOrderMainId");
            return (Criteria) this;
        }

        public Criteria andProductOrderMainIdLessThanOrEqualTo(String value) {
            addCriterion("product_order_main_id <=", value, "productOrderMainId");
            return (Criteria) this;
        }

        public Criteria andProductOrderMainIdLike(String value) {
            addCriterion("product_order_main_id like", value, "productOrderMainId");
            return (Criteria) this;
        }

        public Criteria andProductOrderMainIdNotLike(String value) {
            addCriterion("product_order_main_id not like", value, "productOrderMainId");
            return (Criteria) this;
        }

        public Criteria andProductOrderMainIdIn(List<String> values) {
            addCriterion("product_order_main_id in", values, "productOrderMainId");
            return (Criteria) this;
        }

        public Criteria andProductOrderMainIdNotIn(List<String> values) {
            addCriterion("product_order_main_id not in", values, "productOrderMainId");
            return (Criteria) this;
        }

        public Criteria andProductOrderMainIdBetween(String value1, String value2) {
            addCriterion("product_order_main_id between", value1, value2, "productOrderMainId");
            return (Criteria) this;
        }

        public Criteria andProductOrderMainIdNotBetween(String value1, String value2) {
            addCriterion("product_order_main_id not between", value1, value2, "productOrderMainId");
            return (Criteria) this;
        }

        public Criteria andProductOrderSubCodeIsNull() {
            addCriterion("product_order_sub_code is null");
            return (Criteria) this;
        }

        public Criteria andProductOrderSubCodeIsNotNull() {
            addCriterion("product_order_sub_code is not null");
            return (Criteria) this;
        }

        public Criteria andProductOrderSubCodeEqualTo(String value) {
            addCriterion("product_order_sub_code =", value, "productOrderSubCode");
            return (Criteria) this;
        }

        public Criteria andProductOrderSubCodeNotEqualTo(String value) {
            addCriterion("product_order_sub_code <>", value, "productOrderSubCode");
            return (Criteria) this;
        }

        public Criteria andProductOrderSubCodeGreaterThan(String value) {
            addCriterion("product_order_sub_code >", value, "productOrderSubCode");
            return (Criteria) this;
        }

        public Criteria andProductOrderSubCodeGreaterThanOrEqualTo(String value) {
            addCriterion("product_order_sub_code >=", value, "productOrderSubCode");
            return (Criteria) this;
        }

        public Criteria andProductOrderSubCodeLessThan(String value) {
            addCriterion("product_order_sub_code <", value, "productOrderSubCode");
            return (Criteria) this;
        }

        public Criteria andProductOrderSubCodeLessThanOrEqualTo(String value) {
            addCriterion("product_order_sub_code <=", value, "productOrderSubCode");
            return (Criteria) this;
        }

        public Criteria andProductOrderSubCodeLike(String value) {
            addCriterion("product_order_sub_code like", value, "productOrderSubCode");
            return (Criteria) this;
        }

        public Criteria andProductOrderSubCodeNotLike(String value) {
            addCriterion("product_order_sub_code not like", value, "productOrderSubCode");
            return (Criteria) this;
        }

        public Criteria andProductOrderSubCodeIn(List<String> values) {
            addCriterion("product_order_sub_code in", values, "productOrderSubCode");
            return (Criteria) this;
        }

        public Criteria andProductOrderSubCodeNotIn(List<String> values) {
            addCriterion("product_order_sub_code not in", values, "productOrderSubCode");
            return (Criteria) this;
        }

        public Criteria andProductOrderSubCodeBetween(String value1, String value2) {
            addCriterion("product_order_sub_code between", value1, value2, "productOrderSubCode");
            return (Criteria) this;
        }

        public Criteria andProductOrderSubCodeNotBetween(String value1, String value2) {
            addCriterion("product_order_sub_code not between", value1, value2, "productOrderSubCode");
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

        public Criteria andOutOfStockQuantityIsNull() {
            addCriterion("out_of_stock_quantity is null");
            return (Criteria) this;
        }

        public Criteria andOutOfStockQuantityIsNotNull() {
            addCriterion("out_of_stock_quantity is not null");
            return (Criteria) this;
        }

        public Criteria andOutOfStockQuantityEqualTo(Integer value) {
            addCriterion("out_of_stock_quantity =", value, "outOfStockQuantity");
            return (Criteria) this;
        }

        public Criteria andOutOfStockQuantityNotEqualTo(Integer value) {
            addCriterion("out_of_stock_quantity <>", value, "outOfStockQuantity");
            return (Criteria) this;
        }

        public Criteria andOutOfStockQuantityGreaterThan(Integer value) {
            addCriterion("out_of_stock_quantity >", value, "outOfStockQuantity");
            return (Criteria) this;
        }

        public Criteria andOutOfStockQuantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("out_of_stock_quantity >=", value, "outOfStockQuantity");
            return (Criteria) this;
        }

        public Criteria andOutOfStockQuantityLessThan(Integer value) {
            addCriterion("out_of_stock_quantity <", value, "outOfStockQuantity");
            return (Criteria) this;
        }

        public Criteria andOutOfStockQuantityLessThanOrEqualTo(Integer value) {
            addCriterion("out_of_stock_quantity <=", value, "outOfStockQuantity");
            return (Criteria) this;
        }

        public Criteria andOutOfStockQuantityIn(List<Integer> values) {
            addCriterion("out_of_stock_quantity in", values, "outOfStockQuantity");
            return (Criteria) this;
        }

        public Criteria andOutOfStockQuantityNotIn(List<Integer> values) {
            addCriterion("out_of_stock_quantity not in", values, "outOfStockQuantity");
            return (Criteria) this;
        }

        public Criteria andOutOfStockQuantityBetween(Integer value1, Integer value2) {
            addCriterion("out_of_stock_quantity between", value1, value2, "outOfStockQuantity");
            return (Criteria) this;
        }

        public Criteria andOutOfStockQuantityNotBetween(Integer value1, Integer value2) {
            addCriterion("out_of_stock_quantity not between", value1, value2, "outOfStockQuantity");
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

        public Criteria andLastPriceIsNull() {
            addCriterion("last_price is null");
            return (Criteria) this;
        }

        public Criteria andLastPriceIsNotNull() {
            addCriterion("last_price is not null");
            return (Criteria) this;
        }

        public Criteria andLastPriceEqualTo(BigDecimal value) {
            addCriterion("last_price =", value, "lastPrice");
            return (Criteria) this;
        }

        public Criteria andLastPriceNotEqualTo(BigDecimal value) {
            addCriterion("last_price <>", value, "lastPrice");
            return (Criteria) this;
        }

        public Criteria andLastPriceGreaterThan(BigDecimal value) {
            addCriterion("last_price >", value, "lastPrice");
            return (Criteria) this;
        }

        public Criteria andLastPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("last_price >=", value, "lastPrice");
            return (Criteria) this;
        }

        public Criteria andLastPriceLessThan(BigDecimal value) {
            addCriterion("last_price <", value, "lastPrice");
            return (Criteria) this;
        }

        public Criteria andLastPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("last_price <=", value, "lastPrice");
            return (Criteria) this;
        }

        public Criteria andLastPriceIn(List<BigDecimal> values) {
            addCriterion("last_price in", values, "lastPrice");
            return (Criteria) this;
        }

        public Criteria andLastPriceNotIn(List<BigDecimal> values) {
            addCriterion("last_price not in", values, "lastPrice");
            return (Criteria) this;
        }

        public Criteria andLastPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("last_price between", value1, value2, "lastPrice");
            return (Criteria) this;
        }

        public Criteria andLastPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("last_price not between", value1, value2, "lastPrice");
            return (Criteria) this;
        }

        public Criteria andLocalPriceIsNull() {
            addCriterion("local_price is null");
            return (Criteria) this;
        }

        public Criteria andLocalPriceIsNotNull() {
            addCriterion("local_price is not null");
            return (Criteria) this;
        }

        public Criteria andLocalPriceEqualTo(BigDecimal value) {
            addCriterion("local_price =", value, "localPrice");
            return (Criteria) this;
        }

        public Criteria andLocalPriceNotEqualTo(BigDecimal value) {
            addCriterion("local_price <>", value, "localPrice");
            return (Criteria) this;
        }

        public Criteria andLocalPriceGreaterThan(BigDecimal value) {
            addCriterion("local_price >", value, "localPrice");
            return (Criteria) this;
        }

        public Criteria andLocalPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("local_price >=", value, "localPrice");
            return (Criteria) this;
        }

        public Criteria andLocalPriceLessThan(BigDecimal value) {
            addCriterion("local_price <", value, "localPrice");
            return (Criteria) this;
        }

        public Criteria andLocalPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("local_price <=", value, "localPrice");
            return (Criteria) this;
        }

        public Criteria andLocalPriceIn(List<BigDecimal> values) {
            addCriterion("local_price in", values, "localPrice");
            return (Criteria) this;
        }

        public Criteria andLocalPriceNotIn(List<BigDecimal> values) {
            addCriterion("local_price not in", values, "localPrice");
            return (Criteria) this;
        }

        public Criteria andLocalPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("local_price between", value1, value2, "localPrice");
            return (Criteria) this;
        }

        public Criteria andLocalPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("local_price not between", value1, value2, "localPrice");
            return (Criteria) this;
        }

        public Criteria andLocalAmountIsNull() {
            addCriterion("local_amount is null");
            return (Criteria) this;
        }

        public Criteria andLocalAmountIsNotNull() {
            addCriterion("local_amount is not null");
            return (Criteria) this;
        }

        public Criteria andLocalAmountEqualTo(BigDecimal value) {
            addCriterion("local_amount =", value, "localAmount");
            return (Criteria) this;
        }

        public Criteria andLocalAmountNotEqualTo(BigDecimal value) {
            addCriterion("local_amount <>", value, "localAmount");
            return (Criteria) this;
        }

        public Criteria andLocalAmountGreaterThan(BigDecimal value) {
            addCriterion("local_amount >", value, "localAmount");
            return (Criteria) this;
        }

        public Criteria andLocalAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("local_amount >=", value, "localAmount");
            return (Criteria) this;
        }

        public Criteria andLocalAmountLessThan(BigDecimal value) {
            addCriterion("local_amount <", value, "localAmount");
            return (Criteria) this;
        }

        public Criteria andLocalAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("local_amount <=", value, "localAmount");
            return (Criteria) this;
        }

        public Criteria andLocalAmountIn(List<BigDecimal> values) {
            addCriterion("local_amount in", values, "localAmount");
            return (Criteria) this;
        }

        public Criteria andLocalAmountNotIn(List<BigDecimal> values) {
            addCriterion("local_amount not in", values, "localAmount");
            return (Criteria) this;
        }

        public Criteria andLocalAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("local_amount between", value1, value2, "localAmount");
            return (Criteria) this;
        }

        public Criteria andLocalAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("local_amount not between", value1, value2, "localAmount");
            return (Criteria) this;
        }

        public Criteria andWareQuantityIsNull() {
            addCriterion("ware_quantity is null");
            return (Criteria) this;
        }

        public Criteria andWareQuantityIsNotNull() {
            addCriterion("ware_quantity is not null");
            return (Criteria) this;
        }

        public Criteria andWareQuantityEqualTo(Integer value) {
            addCriterion("ware_quantity =", value, "wareQuantity");
            return (Criteria) this;
        }

        public Criteria andWareQuantityNotEqualTo(Integer value) {
            addCriterion("ware_quantity <>", value, "wareQuantity");
            return (Criteria) this;
        }

        public Criteria andWareQuantityGreaterThan(Integer value) {
            addCriterion("ware_quantity >", value, "wareQuantity");
            return (Criteria) this;
        }

        public Criteria andWareQuantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("ware_quantity >=", value, "wareQuantity");
            return (Criteria) this;
        }

        public Criteria andWareQuantityLessThan(Integer value) {
            addCriterion("ware_quantity <", value, "wareQuantity");
            return (Criteria) this;
        }

        public Criteria andWareQuantityLessThanOrEqualTo(Integer value) {
            addCriterion("ware_quantity <=", value, "wareQuantity");
            return (Criteria) this;
        }

        public Criteria andWareQuantityIn(List<Integer> values) {
            addCriterion("ware_quantity in", values, "wareQuantity");
            return (Criteria) this;
        }

        public Criteria andWareQuantityNotIn(List<Integer> values) {
            addCriterion("ware_quantity not in", values, "wareQuantity");
            return (Criteria) this;
        }

        public Criteria andWareQuantityBetween(Integer value1, Integer value2) {
            addCriterion("ware_quantity between", value1, value2, "wareQuantity");
            return (Criteria) this;
        }

        public Criteria andWareQuantityNotBetween(Integer value1, Integer value2) {
            addCriterion("ware_quantity not between", value1, value2, "wareQuantity");
            return (Criteria) this;
        }

        public Criteria andUnwareQuantityIsNull() {
            addCriterion("unware_quantity is null");
            return (Criteria) this;
        }

        public Criteria andUnwareQuantityIsNotNull() {
            addCriterion("unware_quantity is not null");
            return (Criteria) this;
        }

        public Criteria andUnwareQuantityEqualTo(Integer value) {
            addCriterion("unware_quantity =", value, "unwareQuantity");
            return (Criteria) this;
        }

        public Criteria andUnwareQuantityNotEqualTo(Integer value) {
            addCriterion("unware_quantity <>", value, "unwareQuantity");
            return (Criteria) this;
        }

        public Criteria andUnwareQuantityGreaterThan(Integer value) {
            addCriterion("unware_quantity >", value, "unwareQuantity");
            return (Criteria) this;
        }

        public Criteria andUnwareQuantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("unware_quantity >=", value, "unwareQuantity");
            return (Criteria) this;
        }

        public Criteria andUnwareQuantityLessThan(Integer value) {
            addCriterion("unware_quantity <", value, "unwareQuantity");
            return (Criteria) this;
        }

        public Criteria andUnwareQuantityLessThanOrEqualTo(Integer value) {
            addCriterion("unware_quantity <=", value, "unwareQuantity");
            return (Criteria) this;
        }

        public Criteria andUnwareQuantityIn(List<Integer> values) {
            addCriterion("unware_quantity in", values, "unwareQuantity");
            return (Criteria) this;
        }

        public Criteria andUnwareQuantityNotIn(List<Integer> values) {
            addCriterion("unware_quantity not in", values, "unwareQuantity");
            return (Criteria) this;
        }

        public Criteria andUnwareQuantityBetween(Integer value1, Integer value2) {
            addCriterion("unware_quantity between", value1, value2, "unwareQuantity");
            return (Criteria) this;
        }

        public Criteria andUnwareQuantityNotBetween(Integer value1, Integer value2) {
            addCriterion("unware_quantity not between", value1, value2, "unwareQuantity");
            return (Criteria) this;
        }

        public Criteria andIsStorageIsNull() {
            addCriterion("is_storage is null");
            return (Criteria) this;
        }

        public Criteria andIsStorageIsNotNull() {
            addCriterion("is_storage is not null");
            return (Criteria) this;
        }

        public Criteria andIsStorageEqualTo(Boolean value) {
            addCriterion("is_storage =", value, "isStorage");
            return (Criteria) this;
        }

        public Criteria andIsStorageNotEqualTo(Boolean value) {
            addCriterion("is_storage <>", value, "isStorage");
            return (Criteria) this;
        }

        public Criteria andIsStorageGreaterThan(Boolean value) {
            addCriterion("is_storage >", value, "isStorage");
            return (Criteria) this;
        }

        public Criteria andIsStorageGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_storage >=", value, "isStorage");
            return (Criteria) this;
        }

        public Criteria andIsStorageLessThan(Boolean value) {
            addCriterion("is_storage <", value, "isStorage");
            return (Criteria) this;
        }

        public Criteria andIsStorageLessThanOrEqualTo(Boolean value) {
            addCriterion("is_storage <=", value, "isStorage");
            return (Criteria) this;
        }

        public Criteria andIsStorageIn(List<Boolean> values) {
            addCriterion("is_storage in", values, "isStorage");
            return (Criteria) this;
        }

        public Criteria andIsStorageNotIn(List<Boolean> values) {
            addCriterion("is_storage not in", values, "isStorage");
            return (Criteria) this;
        }

        public Criteria andIsStorageBetween(Boolean value1, Boolean value2) {
            addCriterion("is_storage between", value1, value2, "isStorage");
            return (Criteria) this;
        }

        public Criteria andIsStorageNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_storage not between", value1, value2, "isStorage");
            return (Criteria) this;
        }

        public Criteria andCommentsIsNull() {
            addCriterion("comments is null");
            return (Criteria) this;
        }

        public Criteria andCommentsIsNotNull() {
            addCriterion("comments is not null");
            return (Criteria) this;
        }

        public Criteria andCommentsEqualTo(String value) {
            addCriterion("comments =", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsNotEqualTo(String value) {
            addCriterion("comments <>", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsGreaterThan(String value) {
            addCriterion("comments >", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsGreaterThanOrEqualTo(String value) {
            addCriterion("comments >=", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsLessThan(String value) {
            addCriterion("comments <", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsLessThanOrEqualTo(String value) {
            addCriterion("comments <=", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsLike(String value) {
            addCriterion("comments like", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsNotLike(String value) {
            addCriterion("comments not like", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsIn(List<String> values) {
            addCriterion("comments in", values, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsNotIn(List<String> values) {
            addCriterion("comments not in", values, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsBetween(String value1, String value2) {
            addCriterion("comments between", value1, value2, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsNotBetween(String value1, String value2) {
            addCriterion("comments not between", value1, value2, "comments");
            return (Criteria) this;
        }

        public Criteria andReturnQuantityIsNull() {
            addCriterion("return_quantity is null");
            return (Criteria) this;
        }

        public Criteria andReturnQuantityIsNotNull() {
            addCriterion("return_quantity is not null");
            return (Criteria) this;
        }

        public Criteria andReturnQuantityEqualTo(Integer value) {
            addCriterion("return_quantity =", value, "returnQuantity");
            return (Criteria) this;
        }

        public Criteria andReturnQuantityNotEqualTo(Integer value) {
            addCriterion("return_quantity <>", value, "returnQuantity");
            return (Criteria) this;
        }

        public Criteria andReturnQuantityGreaterThan(Integer value) {
            addCriterion("return_quantity >", value, "returnQuantity");
            return (Criteria) this;
        }

        public Criteria andReturnQuantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("return_quantity >=", value, "returnQuantity");
            return (Criteria) this;
        }

        public Criteria andReturnQuantityLessThan(Integer value) {
            addCriterion("return_quantity <", value, "returnQuantity");
            return (Criteria) this;
        }

        public Criteria andReturnQuantityLessThanOrEqualTo(Integer value) {
            addCriterion("return_quantity <=", value, "returnQuantity");
            return (Criteria) this;
        }

        public Criteria andReturnQuantityIn(List<Integer> values) {
            addCriterion("return_quantity in", values, "returnQuantity");
            return (Criteria) this;
        }

        public Criteria andReturnQuantityNotIn(List<Integer> values) {
            addCriterion("return_quantity not in", values, "returnQuantity");
            return (Criteria) this;
        }

        public Criteria andReturnQuantityBetween(Integer value1, Integer value2) {
            addCriterion("return_quantity between", value1, value2, "returnQuantity");
            return (Criteria) this;
        }

        public Criteria andReturnQuantityNotBetween(Integer value1, Integer value2) {
            addCriterion("return_quantity not between", value1, value2, "returnQuantity");
            return (Criteria) this;
        }

        public Criteria andDefectiveQuantityIsNull() {
            addCriterion("defective_quantity is null");
            return (Criteria) this;
        }

        public Criteria andDefectiveQuantityIsNotNull() {
            addCriterion("defective_quantity is not null");
            return (Criteria) this;
        }

        public Criteria andDefectiveQuantityEqualTo(Integer value) {
            addCriterion("defective_quantity =", value, "defectiveQuantity");
            return (Criteria) this;
        }

        public Criteria andDefectiveQuantityNotEqualTo(Integer value) {
            addCriterion("defective_quantity <>", value, "defectiveQuantity");
            return (Criteria) this;
        }

        public Criteria andDefectiveQuantityGreaterThan(Integer value) {
            addCriterion("defective_quantity >", value, "defectiveQuantity");
            return (Criteria) this;
        }

        public Criteria andDefectiveQuantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("defective_quantity >=", value, "defectiveQuantity");
            return (Criteria) this;
        }

        public Criteria andDefectiveQuantityLessThan(Integer value) {
            addCriterion("defective_quantity <", value, "defectiveQuantity");
            return (Criteria) this;
        }

        public Criteria andDefectiveQuantityLessThanOrEqualTo(Integer value) {
            addCriterion("defective_quantity <=", value, "defectiveQuantity");
            return (Criteria) this;
        }

        public Criteria andDefectiveQuantityIn(List<Integer> values) {
            addCriterion("defective_quantity in", values, "defectiveQuantity");
            return (Criteria) this;
        }

        public Criteria andDefectiveQuantityNotIn(List<Integer> values) {
            addCriterion("defective_quantity not in", values, "defectiveQuantity");
            return (Criteria) this;
        }

        public Criteria andDefectiveQuantityBetween(Integer value1, Integer value2) {
            addCriterion("defective_quantity between", value1, value2, "defectiveQuantity");
            return (Criteria) this;
        }

        public Criteria andDefectiveQuantityNotBetween(Integer value1, Integer value2) {
            addCriterion("defective_quantity not between", value1, value2, "defectiveQuantity");
            return (Criteria) this;
        }

        public Criteria andTotalWareQuantityIsNull() {
            addCriterion("total_ware_quantity is null");
            return (Criteria) this;
        }

        public Criteria andTotalWareQuantityIsNotNull() {
            addCriterion("total_ware_quantity is not null");
            return (Criteria) this;
        }

        public Criteria andTotalWareQuantityEqualTo(Integer value) {
            addCriterion("total_ware_quantity =", value, "totalWareQuantity");
            return (Criteria) this;
        }

        public Criteria andTotalWareQuantityNotEqualTo(Integer value) {
            addCriterion("total_ware_quantity <>", value, "totalWareQuantity");
            return (Criteria) this;
        }

        public Criteria andTotalWareQuantityGreaterThan(Integer value) {
            addCriterion("total_ware_quantity >", value, "totalWareQuantity");
            return (Criteria) this;
        }

        public Criteria andTotalWareQuantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("total_ware_quantity >=", value, "totalWareQuantity");
            return (Criteria) this;
        }

        public Criteria andTotalWareQuantityLessThan(Integer value) {
            addCriterion("total_ware_quantity <", value, "totalWareQuantity");
            return (Criteria) this;
        }

        public Criteria andTotalWareQuantityLessThanOrEqualTo(Integer value) {
            addCriterion("total_ware_quantity <=", value, "totalWareQuantity");
            return (Criteria) this;
        }

        public Criteria andTotalWareQuantityIn(List<Integer> values) {
            addCriterion("total_ware_quantity in", values, "totalWareQuantity");
            return (Criteria) this;
        }

        public Criteria andTotalWareQuantityNotIn(List<Integer> values) {
            addCriterion("total_ware_quantity not in", values, "totalWareQuantity");
            return (Criteria) this;
        }

        public Criteria andTotalWareQuantityBetween(Integer value1, Integer value2) {
            addCriterion("total_ware_quantity between", value1, value2, "totalWareQuantity");
            return (Criteria) this;
        }

        public Criteria andTotalWareQuantityNotBetween(Integer value1, Integer value2) {
            addCriterion("total_ware_quantity not between", value1, value2, "totalWareQuantity");
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
     * product_order_detail
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * product_order_detail 2018-05-17
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

        private static String allFields = "id,product_order_main_id,product_order_sub_code,goods_id,goods_code,goods_name,unit,main_img_url,goods_img_id,goods_img_url,sku_id,sku_code,sku_name,color_id,color_code,color_name,size_id,size_code,size_name,quantity,stock_quantity,out_of_stock_quantity,weight,last_price,local_price,local_amount,ware_quantity,unware_quantity,is_storage,comments,return_quantity,defective_quantity,total_ware_quantity,creator,create_time,modifier,modify_time";

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

        public SelectiveField productOrderMainId() {
            fields.add("product_order_main_id");
            return this;
        }

        public SelectiveField productOrderSubCode() {
            fields.add("product_order_sub_code");
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

        public SelectiveField unit() {
            fields.add("unit");
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

        public SelectiveField quantity() {
            fields.add("quantity");
            return this;
        }

        public SelectiveField stockQuantity() {
            fields.add("stock_quantity");
            return this;
        }

        public SelectiveField outOfStockQuantity() {
            fields.add("out_of_stock_quantity");
            return this;
        }

        public SelectiveField weight() {
            fields.add("weight");
            return this;
        }

        public SelectiveField lastPrice() {
            fields.add("last_price");
            return this;
        }

        public SelectiveField localPrice() {
            fields.add("local_price");
            return this;
        }

        public SelectiveField localAmount() {
            fields.add("local_amount");
            return this;
        }

        public SelectiveField wareQuantity() {
            fields.add("ware_quantity");
            return this;
        }

        public SelectiveField unwareQuantity() {
            fields.add("unware_quantity");
            return this;
        }

        public SelectiveField isStorage() {
            fields.add("is_storage");
            return this;
        }

        public SelectiveField comments() {
            fields.add("comments");
            return this;
        }

        public SelectiveField returnQuantity() {
            fields.add("return_quantity");
            return this;
        }

        public SelectiveField defectiveQuantity() {
            fields.add("defective_quantity");
            return this;
        }

        public SelectiveField totalWareQuantity() {
            fields.add("total_ware_quantity");
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