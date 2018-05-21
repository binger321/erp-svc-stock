package com.binger.stock.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ProductOrderMainExample {
    /**
     * product_order_main
     */
    protected String orderByClause;

    /**
     * product_order_main
     */
    protected boolean distinct;

    /**
     * product_order_main
     */
    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    private SelectiveField selectiveField;

    public ProductOrderMainExample() {
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
     * product_order_main 2018-05-17
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

        public Criteria andAuditTimeIsNull() {
            addCriterion("audit_time is null");
            return (Criteria) this;
        }

        public Criteria andAuditTimeIsNotNull() {
            addCriterion("audit_time is not null");
            return (Criteria) this;
        }

        public Criteria andAuditTimeEqualTo(Date value) {
            addCriterion("audit_time =", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeNotEqualTo(Date value) {
            addCriterion("audit_time <>", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeGreaterThan(Date value) {
            addCriterion("audit_time >", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("audit_time >=", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeLessThan(Date value) {
            addCriterion("audit_time <", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeLessThanOrEqualTo(Date value) {
            addCriterion("audit_time <=", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeIn(List<Date> values) {
            addCriterion("audit_time in", values, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeNotIn(List<Date> values) {
            addCriterion("audit_time not in", values, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeBetween(Date value1, Date value2) {
            addCriterion("audit_time between", value1, value2, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeNotBetween(Date value1, Date value2) {
            addCriterion("audit_time not between", value1, value2, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditUserIdIsNull() {
            addCriterion("audit_user_id is null");
            return (Criteria) this;
        }

        public Criteria andAuditUserIdIsNotNull() {
            addCriterion("audit_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andAuditUserIdEqualTo(Integer value) {
            addCriterion("audit_user_id =", value, "auditUserId");
            return (Criteria) this;
        }

        public Criteria andAuditUserIdNotEqualTo(Integer value) {
            addCriterion("audit_user_id <>", value, "auditUserId");
            return (Criteria) this;
        }

        public Criteria andAuditUserIdGreaterThan(Integer value) {
            addCriterion("audit_user_id >", value, "auditUserId");
            return (Criteria) this;
        }

        public Criteria andAuditUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("audit_user_id >=", value, "auditUserId");
            return (Criteria) this;
        }

        public Criteria andAuditUserIdLessThan(Integer value) {
            addCriterion("audit_user_id <", value, "auditUserId");
            return (Criteria) this;
        }

        public Criteria andAuditUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("audit_user_id <=", value, "auditUserId");
            return (Criteria) this;
        }

        public Criteria andAuditUserIdIn(List<Integer> values) {
            addCriterion("audit_user_id in", values, "auditUserId");
            return (Criteria) this;
        }

        public Criteria andAuditUserIdNotIn(List<Integer> values) {
            addCriterion("audit_user_id not in", values, "auditUserId");
            return (Criteria) this;
        }

        public Criteria andAuditUserIdBetween(Integer value1, Integer value2) {
            addCriterion("audit_user_id between", value1, value2, "auditUserId");
            return (Criteria) this;
        }

        public Criteria andAuditUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("audit_user_id not between", value1, value2, "auditUserId");
            return (Criteria) this;
        }

        public Criteria andAuditUserNameIsNull() {
            addCriterion("audit_user_name is null");
            return (Criteria) this;
        }

        public Criteria andAuditUserNameIsNotNull() {
            addCriterion("audit_user_name is not null");
            return (Criteria) this;
        }

        public Criteria andAuditUserNameEqualTo(String value) {
            addCriterion("audit_user_name =", value, "auditUserName");
            return (Criteria) this;
        }

        public Criteria andAuditUserNameNotEqualTo(String value) {
            addCriterion("audit_user_name <>", value, "auditUserName");
            return (Criteria) this;
        }

        public Criteria andAuditUserNameGreaterThan(String value) {
            addCriterion("audit_user_name >", value, "auditUserName");
            return (Criteria) this;
        }

        public Criteria andAuditUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("audit_user_name >=", value, "auditUserName");
            return (Criteria) this;
        }

        public Criteria andAuditUserNameLessThan(String value) {
            addCriterion("audit_user_name <", value, "auditUserName");
            return (Criteria) this;
        }

        public Criteria andAuditUserNameLessThanOrEqualTo(String value) {
            addCriterion("audit_user_name <=", value, "auditUserName");
            return (Criteria) this;
        }

        public Criteria andAuditUserNameLike(String value) {
            addCriterion("audit_user_name like", value, "auditUserName");
            return (Criteria) this;
        }

        public Criteria andAuditUserNameNotLike(String value) {
            addCriterion("audit_user_name not like", value, "auditUserName");
            return (Criteria) this;
        }

        public Criteria andAuditUserNameIn(List<String> values) {
            addCriterion("audit_user_name in", values, "auditUserName");
            return (Criteria) this;
        }

        public Criteria andAuditUserNameNotIn(List<String> values) {
            addCriterion("audit_user_name not in", values, "auditUserName");
            return (Criteria) this;
        }

        public Criteria andAuditUserNameBetween(String value1, String value2) {
            addCriterion("audit_user_name between", value1, value2, "auditUserName");
            return (Criteria) this;
        }

        public Criteria andAuditUserNameNotBetween(String value1, String value2) {
            addCriterion("audit_user_name not between", value1, value2, "auditUserName");
            return (Criteria) this;
        }

        public Criteria andProductCreateDateIsNull() {
            addCriterion("product_create_date is null");
            return (Criteria) this;
        }

        public Criteria andProductCreateDateIsNotNull() {
            addCriterion("product_create_date is not null");
            return (Criteria) this;
        }

        public Criteria andProductCreateDateEqualTo(Date value) {
            addCriterion("product_create_date =", value, "productCreateDate");
            return (Criteria) this;
        }

        public Criteria andProductCreateDateNotEqualTo(Date value) {
            addCriterion("product_create_date <>", value, "productCreateDate");
            return (Criteria) this;
        }

        public Criteria andProductCreateDateGreaterThan(Date value) {
            addCriterion("product_create_date >", value, "productCreateDate");
            return (Criteria) this;
        }

        public Criteria andProductCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("product_create_date >=", value, "productCreateDate");
            return (Criteria) this;
        }

        public Criteria andProductCreateDateLessThan(Date value) {
            addCriterion("product_create_date <", value, "productCreateDate");
            return (Criteria) this;
        }

        public Criteria andProductCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("product_create_date <=", value, "productCreateDate");
            return (Criteria) this;
        }

        public Criteria andProductCreateDateIn(List<Date> values) {
            addCriterion("product_create_date in", values, "productCreateDate");
            return (Criteria) this;
        }

        public Criteria andProductCreateDateNotIn(List<Date> values) {
            addCriterion("product_create_date not in", values, "productCreateDate");
            return (Criteria) this;
        }

        public Criteria andProductCreateDateBetween(Date value1, Date value2) {
            addCriterion("product_create_date between", value1, value2, "productCreateDate");
            return (Criteria) this;
        }

        public Criteria andProductCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("product_create_date not between", value1, value2, "productCreateDate");
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

        public Criteria andPrePayTimeIsNull() {
            addCriterion("pre_pay_time is null");
            return (Criteria) this;
        }

        public Criteria andPrePayTimeIsNotNull() {
            addCriterion("pre_pay_time is not null");
            return (Criteria) this;
        }

        public Criteria andPrePayTimeEqualTo(Date value) {
            addCriterion("pre_pay_time =", value, "prePayTime");
            return (Criteria) this;
        }

        public Criteria andPrePayTimeNotEqualTo(Date value) {
            addCriterion("pre_pay_time <>", value, "prePayTime");
            return (Criteria) this;
        }

        public Criteria andPrePayTimeGreaterThan(Date value) {
            addCriterion("pre_pay_time >", value, "prePayTime");
            return (Criteria) this;
        }

        public Criteria andPrePayTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("pre_pay_time >=", value, "prePayTime");
            return (Criteria) this;
        }

        public Criteria andPrePayTimeLessThan(Date value) {
            addCriterion("pre_pay_time <", value, "prePayTime");
            return (Criteria) this;
        }

        public Criteria andPrePayTimeLessThanOrEqualTo(Date value) {
            addCriterion("pre_pay_time <=", value, "prePayTime");
            return (Criteria) this;
        }

        public Criteria andPrePayTimeIn(List<Date> values) {
            addCriterion("pre_pay_time in", values, "prePayTime");
            return (Criteria) this;
        }

        public Criteria andPrePayTimeNotIn(List<Date> values) {
            addCriterion("pre_pay_time not in", values, "prePayTime");
            return (Criteria) this;
        }

        public Criteria andPrePayTimeBetween(Date value1, Date value2) {
            addCriterion("pre_pay_time between", value1, value2, "prePayTime");
            return (Criteria) this;
        }

        public Criteria andPrePayTimeNotBetween(Date value1, Date value2) {
            addCriterion("pre_pay_time not between", value1, value2, "prePayTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeIsNull() {
            addCriterion("pay_time is null");
            return (Criteria) this;
        }

        public Criteria andPayTimeIsNotNull() {
            addCriterion("pay_time is not null");
            return (Criteria) this;
        }

        public Criteria andPayTimeEqualTo(Date value) {
            addCriterion("pay_time =", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotEqualTo(Date value) {
            addCriterion("pay_time <>", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeGreaterThan(Date value) {
            addCriterion("pay_time >", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("pay_time >=", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeLessThan(Date value) {
            addCriterion("pay_time <", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeLessThanOrEqualTo(Date value) {
            addCriterion("pay_time <=", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeIn(List<Date> values) {
            addCriterion("pay_time in", values, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotIn(List<Date> values) {
            addCriterion("pay_time not in", values, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeBetween(Date value1, Date value2) {
            addCriterion("pay_time between", value1, value2, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotBetween(Date value1, Date value2) {
            addCriterion("pay_time not between", value1, value2, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayUserIdIsNull() {
            addCriterion("pay_user_id is null");
            return (Criteria) this;
        }

        public Criteria andPayUserIdIsNotNull() {
            addCriterion("pay_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andPayUserIdEqualTo(Integer value) {
            addCriterion("pay_user_id =", value, "payUserId");
            return (Criteria) this;
        }

        public Criteria andPayUserIdNotEqualTo(Integer value) {
            addCriterion("pay_user_id <>", value, "payUserId");
            return (Criteria) this;
        }

        public Criteria andPayUserIdGreaterThan(Integer value) {
            addCriterion("pay_user_id >", value, "payUserId");
            return (Criteria) this;
        }

        public Criteria andPayUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("pay_user_id >=", value, "payUserId");
            return (Criteria) this;
        }

        public Criteria andPayUserIdLessThan(Integer value) {
            addCriterion("pay_user_id <", value, "payUserId");
            return (Criteria) this;
        }

        public Criteria andPayUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("pay_user_id <=", value, "payUserId");
            return (Criteria) this;
        }

        public Criteria andPayUserIdIn(List<Integer> values) {
            addCriterion("pay_user_id in", values, "payUserId");
            return (Criteria) this;
        }

        public Criteria andPayUserIdNotIn(List<Integer> values) {
            addCriterion("pay_user_id not in", values, "payUserId");
            return (Criteria) this;
        }

        public Criteria andPayUserIdBetween(Integer value1, Integer value2) {
            addCriterion("pay_user_id between", value1, value2, "payUserId");
            return (Criteria) this;
        }

        public Criteria andPayUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("pay_user_id not between", value1, value2, "payUserId");
            return (Criteria) this;
        }

        public Criteria andPayUserNameIsNull() {
            addCriterion("pay_user_name is null");
            return (Criteria) this;
        }

        public Criteria andPayUserNameIsNotNull() {
            addCriterion("pay_user_name is not null");
            return (Criteria) this;
        }

        public Criteria andPayUserNameEqualTo(String value) {
            addCriterion("pay_user_name =", value, "payUserName");
            return (Criteria) this;
        }

        public Criteria andPayUserNameNotEqualTo(String value) {
            addCriterion("pay_user_name <>", value, "payUserName");
            return (Criteria) this;
        }

        public Criteria andPayUserNameGreaterThan(String value) {
            addCriterion("pay_user_name >", value, "payUserName");
            return (Criteria) this;
        }

        public Criteria andPayUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("pay_user_name >=", value, "payUserName");
            return (Criteria) this;
        }

        public Criteria andPayUserNameLessThan(String value) {
            addCriterion("pay_user_name <", value, "payUserName");
            return (Criteria) this;
        }

        public Criteria andPayUserNameLessThanOrEqualTo(String value) {
            addCriterion("pay_user_name <=", value, "payUserName");
            return (Criteria) this;
        }

        public Criteria andPayUserNameLike(String value) {
            addCriterion("pay_user_name like", value, "payUserName");
            return (Criteria) this;
        }

        public Criteria andPayUserNameNotLike(String value) {
            addCriterion("pay_user_name not like", value, "payUserName");
            return (Criteria) this;
        }

        public Criteria andPayUserNameIn(List<String> values) {
            addCriterion("pay_user_name in", values, "payUserName");
            return (Criteria) this;
        }

        public Criteria andPayUserNameNotIn(List<String> values) {
            addCriterion("pay_user_name not in", values, "payUserName");
            return (Criteria) this;
        }

        public Criteria andPayUserNameBetween(String value1, String value2) {
            addCriterion("pay_user_name between", value1, value2, "payUserName");
            return (Criteria) this;
        }

        public Criteria andPayUserNameNotBetween(String value1, String value2) {
            addCriterion("pay_user_name not between", value1, value2, "payUserName");
            return (Criteria) this;
        }

        public Criteria andLocalTotalMnyIsNull() {
            addCriterion("local_total_mny is null");
            return (Criteria) this;
        }

        public Criteria andLocalTotalMnyIsNotNull() {
            addCriterion("local_total_mny is not null");
            return (Criteria) this;
        }

        public Criteria andLocalTotalMnyEqualTo(BigDecimal value) {
            addCriterion("local_total_mny =", value, "localTotalMny");
            return (Criteria) this;
        }

        public Criteria andLocalTotalMnyNotEqualTo(BigDecimal value) {
            addCriterion("local_total_mny <>", value, "localTotalMny");
            return (Criteria) this;
        }

        public Criteria andLocalTotalMnyGreaterThan(BigDecimal value) {
            addCriterion("local_total_mny >", value, "localTotalMny");
            return (Criteria) this;
        }

        public Criteria andLocalTotalMnyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("local_total_mny >=", value, "localTotalMny");
            return (Criteria) this;
        }

        public Criteria andLocalTotalMnyLessThan(BigDecimal value) {
            addCriterion("local_total_mny <", value, "localTotalMny");
            return (Criteria) this;
        }

        public Criteria andLocalTotalMnyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("local_total_mny <=", value, "localTotalMny");
            return (Criteria) this;
        }

        public Criteria andLocalTotalMnyIn(List<BigDecimal> values) {
            addCriterion("local_total_mny in", values, "localTotalMny");
            return (Criteria) this;
        }

        public Criteria andLocalTotalMnyNotIn(List<BigDecimal> values) {
            addCriterion("local_total_mny not in", values, "localTotalMny");
            return (Criteria) this;
        }

        public Criteria andLocalTotalMnyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("local_total_mny between", value1, value2, "localTotalMny");
            return (Criteria) this;
        }

        public Criteria andLocalTotalMnyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("local_total_mny not between", value1, value2, "localTotalMny");
            return (Criteria) this;
        }

        public Criteria andPayTotalMnyIsNull() {
            addCriterion("pay_total_mny is null");
            return (Criteria) this;
        }

        public Criteria andPayTotalMnyIsNotNull() {
            addCriterion("pay_total_mny is not null");
            return (Criteria) this;
        }

        public Criteria andPayTotalMnyEqualTo(BigDecimal value) {
            addCriterion("pay_total_mny =", value, "payTotalMny");
            return (Criteria) this;
        }

        public Criteria andPayTotalMnyNotEqualTo(BigDecimal value) {
            addCriterion("pay_total_mny <>", value, "payTotalMny");
            return (Criteria) this;
        }

        public Criteria andPayTotalMnyGreaterThan(BigDecimal value) {
            addCriterion("pay_total_mny >", value, "payTotalMny");
            return (Criteria) this;
        }

        public Criteria andPayTotalMnyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("pay_total_mny >=", value, "payTotalMny");
            return (Criteria) this;
        }

        public Criteria andPayTotalMnyLessThan(BigDecimal value) {
            addCriterion("pay_total_mny <", value, "payTotalMny");
            return (Criteria) this;
        }

        public Criteria andPayTotalMnyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("pay_total_mny <=", value, "payTotalMny");
            return (Criteria) this;
        }

        public Criteria andPayTotalMnyIn(List<BigDecimal> values) {
            addCriterion("pay_total_mny in", values, "payTotalMny");
            return (Criteria) this;
        }

        public Criteria andPayTotalMnyNotIn(List<BigDecimal> values) {
            addCriterion("pay_total_mny not in", values, "payTotalMny");
            return (Criteria) this;
        }

        public Criteria andPayTotalMnyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pay_total_mny between", value1, value2, "payTotalMny");
            return (Criteria) this;
        }

        public Criteria andPayTotalMnyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pay_total_mny not between", value1, value2, "payTotalMny");
            return (Criteria) this;
        }

        public Criteria andUnPayMnyIsNull() {
            addCriterion("un_pay_mny is null");
            return (Criteria) this;
        }

        public Criteria andUnPayMnyIsNotNull() {
            addCriterion("un_pay_mny is not null");
            return (Criteria) this;
        }

        public Criteria andUnPayMnyEqualTo(BigDecimal value) {
            addCriterion("un_pay_mny =", value, "unPayMny");
            return (Criteria) this;
        }

        public Criteria andUnPayMnyNotEqualTo(BigDecimal value) {
            addCriterion("un_pay_mny <>", value, "unPayMny");
            return (Criteria) this;
        }

        public Criteria andUnPayMnyGreaterThan(BigDecimal value) {
            addCriterion("un_pay_mny >", value, "unPayMny");
            return (Criteria) this;
        }

        public Criteria andUnPayMnyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("un_pay_mny >=", value, "unPayMny");
            return (Criteria) this;
        }

        public Criteria andUnPayMnyLessThan(BigDecimal value) {
            addCriterion("un_pay_mny <", value, "unPayMny");
            return (Criteria) this;
        }

        public Criteria andUnPayMnyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("un_pay_mny <=", value, "unPayMny");
            return (Criteria) this;
        }

        public Criteria andUnPayMnyIn(List<BigDecimal> values) {
            addCriterion("un_pay_mny in", values, "unPayMny");
            return (Criteria) this;
        }

        public Criteria andUnPayMnyNotIn(List<BigDecimal> values) {
            addCriterion("un_pay_mny not in", values, "unPayMny");
            return (Criteria) this;
        }

        public Criteria andUnPayMnyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("un_pay_mny between", value1, value2, "unPayMny");
            return (Criteria) this;
        }

        public Criteria andUnPayMnyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("un_pay_mny not between", value1, value2, "unPayMny");
            return (Criteria) this;
        }

        public Criteria andTotalInvoiceMnyIsNull() {
            addCriterion("total_invoice_mny is null");
            return (Criteria) this;
        }

        public Criteria andTotalInvoiceMnyIsNotNull() {
            addCriterion("total_invoice_mny is not null");
            return (Criteria) this;
        }

        public Criteria andTotalInvoiceMnyEqualTo(BigDecimal value) {
            addCriterion("total_invoice_mny =", value, "totalInvoiceMny");
            return (Criteria) this;
        }

        public Criteria andTotalInvoiceMnyNotEqualTo(BigDecimal value) {
            addCriterion("total_invoice_mny <>", value, "totalInvoiceMny");
            return (Criteria) this;
        }

        public Criteria andTotalInvoiceMnyGreaterThan(BigDecimal value) {
            addCriterion("total_invoice_mny >", value, "totalInvoiceMny");
            return (Criteria) this;
        }

        public Criteria andTotalInvoiceMnyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("total_invoice_mny >=", value, "totalInvoiceMny");
            return (Criteria) this;
        }

        public Criteria andTotalInvoiceMnyLessThan(BigDecimal value) {
            addCriterion("total_invoice_mny <", value, "totalInvoiceMny");
            return (Criteria) this;
        }

        public Criteria andTotalInvoiceMnyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("total_invoice_mny <=", value, "totalInvoiceMny");
            return (Criteria) this;
        }

        public Criteria andTotalInvoiceMnyIn(List<BigDecimal> values) {
            addCriterion("total_invoice_mny in", values, "totalInvoiceMny");
            return (Criteria) this;
        }

        public Criteria andTotalInvoiceMnyNotIn(List<BigDecimal> values) {
            addCriterion("total_invoice_mny not in", values, "totalInvoiceMny");
            return (Criteria) this;
        }

        public Criteria andTotalInvoiceMnyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_invoice_mny between", value1, value2, "totalInvoiceMny");
            return (Criteria) this;
        }

        public Criteria andTotalInvoiceMnyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_invoice_mny not between", value1, value2, "totalInvoiceMny");
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

        public Criteria andSettlementIsNull() {
            addCriterion("settlement is null");
            return (Criteria) this;
        }

        public Criteria andSettlementIsNotNull() {
            addCriterion("settlement is not null");
            return (Criteria) this;
        }

        public Criteria andSettlementEqualTo(String value) {
            addCriterion("settlement =", value, "settlement");
            return (Criteria) this;
        }

        public Criteria andSettlementNotEqualTo(String value) {
            addCriterion("settlement <>", value, "settlement");
            return (Criteria) this;
        }

        public Criteria andSettlementGreaterThan(String value) {
            addCriterion("settlement >", value, "settlement");
            return (Criteria) this;
        }

        public Criteria andSettlementGreaterThanOrEqualTo(String value) {
            addCriterion("settlement >=", value, "settlement");
            return (Criteria) this;
        }

        public Criteria andSettlementLessThan(String value) {
            addCriterion("settlement <", value, "settlement");
            return (Criteria) this;
        }

        public Criteria andSettlementLessThanOrEqualTo(String value) {
            addCriterion("settlement <=", value, "settlement");
            return (Criteria) this;
        }

        public Criteria andSettlementLike(String value) {
            addCriterion("settlement like", value, "settlement");
            return (Criteria) this;
        }

        public Criteria andSettlementNotLike(String value) {
            addCriterion("settlement not like", value, "settlement");
            return (Criteria) this;
        }

        public Criteria andSettlementIn(List<String> values) {
            addCriterion("settlement in", values, "settlement");
            return (Criteria) this;
        }

        public Criteria andSettlementNotIn(List<String> values) {
            addCriterion("settlement not in", values, "settlement");
            return (Criteria) this;
        }

        public Criteria andSettlementBetween(String value1, String value2) {
            addCriterion("settlement between", value1, value2, "settlement");
            return (Criteria) this;
        }

        public Criteria andSettlementNotBetween(String value1, String value2) {
            addCriterion("settlement not between", value1, value2, "settlement");
            return (Criteria) this;
        }

        public Criteria andSupplierIdIsNull() {
            addCriterion("supplier_id is null");
            return (Criteria) this;
        }

        public Criteria andSupplierIdIsNotNull() {
            addCriterion("supplier_id is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierIdEqualTo(Integer value) {
            addCriterion("supplier_id =", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotEqualTo(Integer value) {
            addCriterion("supplier_id <>", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdGreaterThan(Integer value) {
            addCriterion("supplier_id >", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("supplier_id >=", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdLessThan(Integer value) {
            addCriterion("supplier_id <", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdLessThanOrEqualTo(Integer value) {
            addCriterion("supplier_id <=", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdIn(List<Integer> values) {
            addCriterion("supplier_id in", values, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotIn(List<Integer> values) {
            addCriterion("supplier_id not in", values, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdBetween(Integer value1, Integer value2) {
            addCriterion("supplier_id between", value1, value2, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotBetween(Integer value1, Integer value2) {
            addCriterion("supplier_id not between", value1, value2, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierCodeIsNull() {
            addCriterion("supplier_code is null");
            return (Criteria) this;
        }

        public Criteria andSupplierCodeIsNotNull() {
            addCriterion("supplier_code is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierCodeEqualTo(String value) {
            addCriterion("supplier_code =", value, "supplierCode");
            return (Criteria) this;
        }

        public Criteria andSupplierCodeNotEqualTo(String value) {
            addCriterion("supplier_code <>", value, "supplierCode");
            return (Criteria) this;
        }

        public Criteria andSupplierCodeGreaterThan(String value) {
            addCriterion("supplier_code >", value, "supplierCode");
            return (Criteria) this;
        }

        public Criteria andSupplierCodeGreaterThanOrEqualTo(String value) {
            addCriterion("supplier_code >=", value, "supplierCode");
            return (Criteria) this;
        }

        public Criteria andSupplierCodeLessThan(String value) {
            addCriterion("supplier_code <", value, "supplierCode");
            return (Criteria) this;
        }

        public Criteria andSupplierCodeLessThanOrEqualTo(String value) {
            addCriterion("supplier_code <=", value, "supplierCode");
            return (Criteria) this;
        }

        public Criteria andSupplierCodeLike(String value) {
            addCriterion("supplier_code like", value, "supplierCode");
            return (Criteria) this;
        }

        public Criteria andSupplierCodeNotLike(String value) {
            addCriterion("supplier_code not like", value, "supplierCode");
            return (Criteria) this;
        }

        public Criteria andSupplierCodeIn(List<String> values) {
            addCriterion("supplier_code in", values, "supplierCode");
            return (Criteria) this;
        }

        public Criteria andSupplierCodeNotIn(List<String> values) {
            addCriterion("supplier_code not in", values, "supplierCode");
            return (Criteria) this;
        }

        public Criteria andSupplierCodeBetween(String value1, String value2) {
            addCriterion("supplier_code between", value1, value2, "supplierCode");
            return (Criteria) this;
        }

        public Criteria andSupplierCodeNotBetween(String value1, String value2) {
            addCriterion("supplier_code not between", value1, value2, "supplierCode");
            return (Criteria) this;
        }

        public Criteria andSupplierNameIsNull() {
            addCriterion("supplier_name is null");
            return (Criteria) this;
        }

        public Criteria andSupplierNameIsNotNull() {
            addCriterion("supplier_name is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierNameEqualTo(String value) {
            addCriterion("supplier_name =", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameNotEqualTo(String value) {
            addCriterion("supplier_name <>", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameGreaterThan(String value) {
            addCriterion("supplier_name >", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameGreaterThanOrEqualTo(String value) {
            addCriterion("supplier_name >=", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameLessThan(String value) {
            addCriterion("supplier_name <", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameLessThanOrEqualTo(String value) {
            addCriterion("supplier_name <=", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameLike(String value) {
            addCriterion("supplier_name like", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameNotLike(String value) {
            addCriterion("supplier_name not like", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameIn(List<String> values) {
            addCriterion("supplier_name in", values, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameNotIn(List<String> values) {
            addCriterion("supplier_name not in", values, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameBetween(String value1, String value2) {
            addCriterion("supplier_name between", value1, value2, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameNotBetween(String value1, String value2) {
            addCriterion("supplier_name not between", value1, value2, "supplierName");
            return (Criteria) this;
        }

        public Criteria andExpDeliveredTimeIsNull() {
            addCriterion("exp_delivered_time is null");
            return (Criteria) this;
        }

        public Criteria andExpDeliveredTimeIsNotNull() {
            addCriterion("exp_delivered_time is not null");
            return (Criteria) this;
        }

        public Criteria andExpDeliveredTimeEqualTo(Date value) {
            addCriterion("exp_delivered_time =", value, "expDeliveredTime");
            return (Criteria) this;
        }

        public Criteria andExpDeliveredTimeNotEqualTo(Date value) {
            addCriterion("exp_delivered_time <>", value, "expDeliveredTime");
            return (Criteria) this;
        }

        public Criteria andExpDeliveredTimeGreaterThan(Date value) {
            addCriterion("exp_delivered_time >", value, "expDeliveredTime");
            return (Criteria) this;
        }

        public Criteria andExpDeliveredTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("exp_delivered_time >=", value, "expDeliveredTime");
            return (Criteria) this;
        }

        public Criteria andExpDeliveredTimeLessThan(Date value) {
            addCriterion("exp_delivered_time <", value, "expDeliveredTime");
            return (Criteria) this;
        }

        public Criteria andExpDeliveredTimeLessThanOrEqualTo(Date value) {
            addCriterion("exp_delivered_time <=", value, "expDeliveredTime");
            return (Criteria) this;
        }

        public Criteria andExpDeliveredTimeIn(List<Date> values) {
            addCriterion("exp_delivered_time in", values, "expDeliveredTime");
            return (Criteria) this;
        }

        public Criteria andExpDeliveredTimeNotIn(List<Date> values) {
            addCriterion("exp_delivered_time not in", values, "expDeliveredTime");
            return (Criteria) this;
        }

        public Criteria andExpDeliveredTimeBetween(Date value1, Date value2) {
            addCriterion("exp_delivered_time between", value1, value2, "expDeliveredTime");
            return (Criteria) this;
        }

        public Criteria andExpDeliveredTimeNotBetween(Date value1, Date value2) {
            addCriterion("exp_delivered_time not between", value1, value2, "expDeliveredTime");
            return (Criteria) this;
        }

        public Criteria andNonInvoiceMnyIsNull() {
            addCriterion("non_invoice_mny is null");
            return (Criteria) this;
        }

        public Criteria andNonInvoiceMnyIsNotNull() {
            addCriterion("non_invoice_mny is not null");
            return (Criteria) this;
        }

        public Criteria andNonInvoiceMnyEqualTo(BigDecimal value) {
            addCriterion("non_invoice_mny =", value, "nonInvoiceMny");
            return (Criteria) this;
        }

        public Criteria andNonInvoiceMnyNotEqualTo(BigDecimal value) {
            addCriterion("non_invoice_mny <>", value, "nonInvoiceMny");
            return (Criteria) this;
        }

        public Criteria andNonInvoiceMnyGreaterThan(BigDecimal value) {
            addCriterion("non_invoice_mny >", value, "nonInvoiceMny");
            return (Criteria) this;
        }

        public Criteria andNonInvoiceMnyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("non_invoice_mny >=", value, "nonInvoiceMny");
            return (Criteria) this;
        }

        public Criteria andNonInvoiceMnyLessThan(BigDecimal value) {
            addCriterion("non_invoice_mny <", value, "nonInvoiceMny");
            return (Criteria) this;
        }

        public Criteria andNonInvoiceMnyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("non_invoice_mny <=", value, "nonInvoiceMny");
            return (Criteria) this;
        }

        public Criteria andNonInvoiceMnyIn(List<BigDecimal> values) {
            addCriterion("non_invoice_mny in", values, "nonInvoiceMny");
            return (Criteria) this;
        }

        public Criteria andNonInvoiceMnyNotIn(List<BigDecimal> values) {
            addCriterion("non_invoice_mny not in", values, "nonInvoiceMny");
            return (Criteria) this;
        }

        public Criteria andNonInvoiceMnyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("non_invoice_mny between", value1, value2, "nonInvoiceMny");
            return (Criteria) this;
        }

        public Criteria andNonInvoiceMnyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("non_invoice_mny not between", value1, value2, "nonInvoiceMny");
            return (Criteria) this;
        }

        public Criteria andDeliveredTimeIsNull() {
            addCriterion("delivered_time is null");
            return (Criteria) this;
        }

        public Criteria andDeliveredTimeIsNotNull() {
            addCriterion("delivered_time is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveredTimeEqualTo(Date value) {
            addCriterion("delivered_time =", value, "deliveredTime");
            return (Criteria) this;
        }

        public Criteria andDeliveredTimeNotEqualTo(Date value) {
            addCriterion("delivered_time <>", value, "deliveredTime");
            return (Criteria) this;
        }

        public Criteria andDeliveredTimeGreaterThan(Date value) {
            addCriterion("delivered_time >", value, "deliveredTime");
            return (Criteria) this;
        }

        public Criteria andDeliveredTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("delivered_time >=", value, "deliveredTime");
            return (Criteria) this;
        }

        public Criteria andDeliveredTimeLessThan(Date value) {
            addCriterion("delivered_time <", value, "deliveredTime");
            return (Criteria) this;
        }

        public Criteria andDeliveredTimeLessThanOrEqualTo(Date value) {
            addCriterion("delivered_time <=", value, "deliveredTime");
            return (Criteria) this;
        }

        public Criteria andDeliveredTimeIn(List<Date> values) {
            addCriterion("delivered_time in", values, "deliveredTime");
            return (Criteria) this;
        }

        public Criteria andDeliveredTimeNotIn(List<Date> values) {
            addCriterion("delivered_time not in", values, "deliveredTime");
            return (Criteria) this;
        }

        public Criteria andDeliveredTimeBetween(Date value1, Date value2) {
            addCriterion("delivered_time between", value1, value2, "deliveredTime");
            return (Criteria) this;
        }

        public Criteria andDeliveredTimeNotBetween(Date value1, Date value2) {
            addCriterion("delivered_time not between", value1, value2, "deliveredTime");
            return (Criteria) this;
        }

        public Criteria andLogisNoIsNull() {
            addCriterion("logis_no is null");
            return (Criteria) this;
        }

        public Criteria andLogisNoIsNotNull() {
            addCriterion("logis_no is not null");
            return (Criteria) this;
        }

        public Criteria andLogisNoEqualTo(String value) {
            addCriterion("logis_no =", value, "logisNo");
            return (Criteria) this;
        }

        public Criteria andLogisNoNotEqualTo(String value) {
            addCriterion("logis_no <>", value, "logisNo");
            return (Criteria) this;
        }

        public Criteria andLogisNoGreaterThan(String value) {
            addCriterion("logis_no >", value, "logisNo");
            return (Criteria) this;
        }

        public Criteria andLogisNoGreaterThanOrEqualTo(String value) {
            addCriterion("logis_no >=", value, "logisNo");
            return (Criteria) this;
        }

        public Criteria andLogisNoLessThan(String value) {
            addCriterion("logis_no <", value, "logisNo");
            return (Criteria) this;
        }

        public Criteria andLogisNoLessThanOrEqualTo(String value) {
            addCriterion("logis_no <=", value, "logisNo");
            return (Criteria) this;
        }

        public Criteria andLogisNoLike(String value) {
            addCriterion("logis_no like", value, "logisNo");
            return (Criteria) this;
        }

        public Criteria andLogisNoNotLike(String value) {
            addCriterion("logis_no not like", value, "logisNo");
            return (Criteria) this;
        }

        public Criteria andLogisNoIn(List<String> values) {
            addCriterion("logis_no in", values, "logisNo");
            return (Criteria) this;
        }

        public Criteria andLogisNoNotIn(List<String> values) {
            addCriterion("logis_no not in", values, "logisNo");
            return (Criteria) this;
        }

        public Criteria andLogisNoBetween(String value1, String value2) {
            addCriterion("logis_no between", value1, value2, "logisNo");
            return (Criteria) this;
        }

        public Criteria andLogisNoNotBetween(String value1, String value2) {
            addCriterion("logis_no not between", value1, value2, "logisNo");
            return (Criteria) this;
        }

        public Criteria andLogistCompanyNameIsNull() {
            addCriterion("logist_company_name is null");
            return (Criteria) this;
        }

        public Criteria andLogistCompanyNameIsNotNull() {
            addCriterion("logist_company_name is not null");
            return (Criteria) this;
        }

        public Criteria andLogistCompanyNameEqualTo(String value) {
            addCriterion("logist_company_name =", value, "logistCompanyName");
            return (Criteria) this;
        }

        public Criteria andLogistCompanyNameNotEqualTo(String value) {
            addCriterion("logist_company_name <>", value, "logistCompanyName");
            return (Criteria) this;
        }

        public Criteria andLogistCompanyNameGreaterThan(String value) {
            addCriterion("logist_company_name >", value, "logistCompanyName");
            return (Criteria) this;
        }

        public Criteria andLogistCompanyNameGreaterThanOrEqualTo(String value) {
            addCriterion("logist_company_name >=", value, "logistCompanyName");
            return (Criteria) this;
        }

        public Criteria andLogistCompanyNameLessThan(String value) {
            addCriterion("logist_company_name <", value, "logistCompanyName");
            return (Criteria) this;
        }

        public Criteria andLogistCompanyNameLessThanOrEqualTo(String value) {
            addCriterion("logist_company_name <=", value, "logistCompanyName");
            return (Criteria) this;
        }

        public Criteria andLogistCompanyNameLike(String value) {
            addCriterion("logist_company_name like", value, "logistCompanyName");
            return (Criteria) this;
        }

        public Criteria andLogistCompanyNameNotLike(String value) {
            addCriterion("logist_company_name not like", value, "logistCompanyName");
            return (Criteria) this;
        }

        public Criteria andLogistCompanyNameIn(List<String> values) {
            addCriterion("logist_company_name in", values, "logistCompanyName");
            return (Criteria) this;
        }

        public Criteria andLogistCompanyNameNotIn(List<String> values) {
            addCriterion("logist_company_name not in", values, "logistCompanyName");
            return (Criteria) this;
        }

        public Criteria andLogistCompanyNameBetween(String value1, String value2) {
            addCriterion("logist_company_name between", value1, value2, "logistCompanyName");
            return (Criteria) this;
        }

        public Criteria andLogistCompanyNameNotBetween(String value1, String value2) {
            addCriterion("logist_company_name not between", value1, value2, "logistCompanyName");
            return (Criteria) this;
        }

        public Criteria andLogisFeeIsNull() {
            addCriterion("logis_fee is null");
            return (Criteria) this;
        }

        public Criteria andLogisFeeIsNotNull() {
            addCriterion("logis_fee is not null");
            return (Criteria) this;
        }

        public Criteria andLogisFeeEqualTo(BigDecimal value) {
            addCriterion("logis_fee =", value, "logisFee");
            return (Criteria) this;
        }

        public Criteria andLogisFeeNotEqualTo(BigDecimal value) {
            addCriterion("logis_fee <>", value, "logisFee");
            return (Criteria) this;
        }

        public Criteria andLogisFeeGreaterThan(BigDecimal value) {
            addCriterion("logis_fee >", value, "logisFee");
            return (Criteria) this;
        }

        public Criteria andLogisFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("logis_fee >=", value, "logisFee");
            return (Criteria) this;
        }

        public Criteria andLogisFeeLessThan(BigDecimal value) {
            addCriterion("logis_fee <", value, "logisFee");
            return (Criteria) this;
        }

        public Criteria andLogisFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("logis_fee <=", value, "logisFee");
            return (Criteria) this;
        }

        public Criteria andLogisFeeIn(List<BigDecimal> values) {
            addCriterion("logis_fee in", values, "logisFee");
            return (Criteria) this;
        }

        public Criteria andLogisFeeNotIn(List<BigDecimal> values) {
            addCriterion("logis_fee not in", values, "logisFee");
            return (Criteria) this;
        }

        public Criteria andLogisFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("logis_fee between", value1, value2, "logisFee");
            return (Criteria) this;
        }

        public Criteria andLogisFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("logis_fee not between", value1, value2, "logisFee");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdIsNull() {
            addCriterion("warehouse_id is null");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdIsNotNull() {
            addCriterion("warehouse_id is not null");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdEqualTo(Integer value) {
            addCriterion("warehouse_id =", value, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdNotEqualTo(Integer value) {
            addCriterion("warehouse_id <>", value, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdGreaterThan(Integer value) {
            addCriterion("warehouse_id >", value, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("warehouse_id >=", value, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdLessThan(Integer value) {
            addCriterion("warehouse_id <", value, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdLessThanOrEqualTo(Integer value) {
            addCriterion("warehouse_id <=", value, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdIn(List<Integer> values) {
            addCriterion("warehouse_id in", values, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdNotIn(List<Integer> values) {
            addCriterion("warehouse_id not in", values, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdBetween(Integer value1, Integer value2) {
            addCriterion("warehouse_id between", value1, value2, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdNotBetween(Integer value1, Integer value2) {
            addCriterion("warehouse_id not between", value1, value2, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andOrderNumberIsNull() {
            addCriterion("order_number is null");
            return (Criteria) this;
        }

        public Criteria andOrderNumberIsNotNull() {
            addCriterion("order_number is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNumberEqualTo(Integer value) {
            addCriterion("order_number =", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberNotEqualTo(Integer value) {
            addCriterion("order_number <>", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberGreaterThan(Integer value) {
            addCriterion("order_number >", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_number >=", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberLessThan(Integer value) {
            addCriterion("order_number <", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberLessThanOrEqualTo(Integer value) {
            addCriterion("order_number <=", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberIn(List<Integer> values) {
            addCriterion("order_number in", values, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberNotIn(List<Integer> values) {
            addCriterion("order_number not in", values, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberBetween(Integer value1, Integer value2) {
            addCriterion("order_number between", value1, value2, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("order_number not between", value1, value2, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andArchiveDateIsNull() {
            addCriterion("archive_date is null");
            return (Criteria) this;
        }

        public Criteria andArchiveDateIsNotNull() {
            addCriterion("archive_date is not null");
            return (Criteria) this;
        }

        public Criteria andArchiveDateEqualTo(Date value) {
            addCriterion("archive_date =", value, "archiveDate");
            return (Criteria) this;
        }

        public Criteria andArchiveDateNotEqualTo(Date value) {
            addCriterion("archive_date <>", value, "archiveDate");
            return (Criteria) this;
        }

        public Criteria andArchiveDateGreaterThan(Date value) {
            addCriterion("archive_date >", value, "archiveDate");
            return (Criteria) this;
        }

        public Criteria andArchiveDateGreaterThanOrEqualTo(Date value) {
            addCriterion("archive_date >=", value, "archiveDate");
            return (Criteria) this;
        }

        public Criteria andArchiveDateLessThan(Date value) {
            addCriterion("archive_date <", value, "archiveDate");
            return (Criteria) this;
        }

        public Criteria andArchiveDateLessThanOrEqualTo(Date value) {
            addCriterion("archive_date <=", value, "archiveDate");
            return (Criteria) this;
        }

        public Criteria andArchiveDateIn(List<Date> values) {
            addCriterion("archive_date in", values, "archiveDate");
            return (Criteria) this;
        }

        public Criteria andArchiveDateNotIn(List<Date> values) {
            addCriterion("archive_date not in", values, "archiveDate");
            return (Criteria) this;
        }

        public Criteria andArchiveDateBetween(Date value1, Date value2) {
            addCriterion("archive_date between", value1, value2, "archiveDate");
            return (Criteria) this;
        }

        public Criteria andArchiveDateNotBetween(Date value1, Date value2) {
            addCriterion("archive_date not between", value1, value2, "archiveDate");
            return (Criteria) this;
        }

        public Criteria andBillDateIsNull() {
            addCriterion("bill_date is null");
            return (Criteria) this;
        }

        public Criteria andBillDateIsNotNull() {
            addCriterion("bill_date is not null");
            return (Criteria) this;
        }

        public Criteria andBillDateEqualTo(Date value) {
            addCriterion("bill_date =", value, "billDate");
            return (Criteria) this;
        }

        public Criteria andBillDateNotEqualTo(Date value) {
            addCriterion("bill_date <>", value, "billDate");
            return (Criteria) this;
        }

        public Criteria andBillDateGreaterThan(Date value) {
            addCriterion("bill_date >", value, "billDate");
            return (Criteria) this;
        }

        public Criteria andBillDateGreaterThanOrEqualTo(Date value) {
            addCriterion("bill_date >=", value, "billDate");
            return (Criteria) this;
        }

        public Criteria andBillDateLessThan(Date value) {
            addCriterion("bill_date <", value, "billDate");
            return (Criteria) this;
        }

        public Criteria andBillDateLessThanOrEqualTo(Date value) {
            addCriterion("bill_date <=", value, "billDate");
            return (Criteria) this;
        }

        public Criteria andBillDateIn(List<Date> values) {
            addCriterion("bill_date in", values, "billDate");
            return (Criteria) this;
        }

        public Criteria andBillDateNotIn(List<Date> values) {
            addCriterion("bill_date not in", values, "billDate");
            return (Criteria) this;
        }

        public Criteria andBillDateBetween(Date value1, Date value2) {
            addCriterion("bill_date between", value1, value2, "billDate");
            return (Criteria) this;
        }

        public Criteria andBillDateNotBetween(Date value1, Date value2) {
            addCriterion("bill_date not between", value1, value2, "billDate");
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

        public Criteria andProductStatusEqualTo(Integer value) {
            addCriterion("product_status =", value, "productStatus");
            return (Criteria) this;
        }

        public Criteria andProductStatusNotEqualTo(Integer value) {
            addCriterion("product_status <>", value, "productStatus");
            return (Criteria) this;
        }

        public Criteria andProductStatusGreaterThan(Integer value) {
            addCriterion("product_status >", value, "productStatus");
            return (Criteria) this;
        }

        public Criteria andProductStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("product_status >=", value, "productStatus");
            return (Criteria) this;
        }

        public Criteria andProductStatusLessThan(Integer value) {
            addCriterion("product_status <", value, "productStatus");
            return (Criteria) this;
        }

        public Criteria andProductStatusLessThanOrEqualTo(Integer value) {
            addCriterion("product_status <=", value, "productStatus");
            return (Criteria) this;
        }

        public Criteria andProductStatusIn(List<Integer> values) {
            addCriterion("product_status in", values, "productStatus");
            return (Criteria) this;
        }

        public Criteria andProductStatusNotIn(List<Integer> values) {
            addCriterion("product_status not in", values, "productStatus");
            return (Criteria) this;
        }

        public Criteria andProductStatusBetween(Integer value1, Integer value2) {
            addCriterion("product_status between", value1, value2, "productStatus");
            return (Criteria) this;
        }

        public Criteria andProductStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("product_status not between", value1, value2, "productStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNull() {
            addCriterion("order_status is null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNotNull() {
            addCriterion("order_status is not null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusEqualTo(Integer value) {
            addCriterion("order_status =", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotEqualTo(Integer value) {
            addCriterion("order_status <>", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThan(Integer value) {
            addCriterion("order_status >", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_status >=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThan(Integer value) {
            addCriterion("order_status <", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThanOrEqualTo(Integer value) {
            addCriterion("order_status <=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIn(List<Integer> values) {
            addCriterion("order_status in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotIn(List<Integer> values) {
            addCriterion("order_status not in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusBetween(Integer value1, Integer value2) {
            addCriterion("order_status between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("order_status not between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andCancelTimeIsNull() {
            addCriterion("cancel_time is null");
            return (Criteria) this;
        }

        public Criteria andCancelTimeIsNotNull() {
            addCriterion("cancel_time is not null");
            return (Criteria) this;
        }

        public Criteria andCancelTimeEqualTo(Date value) {
            addCriterion("cancel_time =", value, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeNotEqualTo(Date value) {
            addCriterion("cancel_time <>", value, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeGreaterThan(Date value) {
            addCriterion("cancel_time >", value, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("cancel_time >=", value, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeLessThan(Date value) {
            addCriterion("cancel_time <", value, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeLessThanOrEqualTo(Date value) {
            addCriterion("cancel_time <=", value, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeIn(List<Date> values) {
            addCriterion("cancel_time in", values, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeNotIn(List<Date> values) {
            addCriterion("cancel_time not in", values, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeBetween(Date value1, Date value2) {
            addCriterion("cancel_time between", value1, value2, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeNotBetween(Date value1, Date value2) {
            addCriterion("cancel_time not between", value1, value2, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelReasonIsNull() {
            addCriterion("cancel_reason is null");
            return (Criteria) this;
        }

        public Criteria andCancelReasonIsNotNull() {
            addCriterion("cancel_reason is not null");
            return (Criteria) this;
        }

        public Criteria andCancelReasonEqualTo(String value) {
            addCriterion("cancel_reason =", value, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andCancelReasonNotEqualTo(String value) {
            addCriterion("cancel_reason <>", value, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andCancelReasonGreaterThan(String value) {
            addCriterion("cancel_reason >", value, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andCancelReasonGreaterThanOrEqualTo(String value) {
            addCriterion("cancel_reason >=", value, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andCancelReasonLessThan(String value) {
            addCriterion("cancel_reason <", value, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andCancelReasonLessThanOrEqualTo(String value) {
            addCriterion("cancel_reason <=", value, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andCancelReasonLike(String value) {
            addCriterion("cancel_reason like", value, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andCancelReasonNotLike(String value) {
            addCriterion("cancel_reason not like", value, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andCancelReasonIn(List<String> values) {
            addCriterion("cancel_reason in", values, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andCancelReasonNotIn(List<String> values) {
            addCriterion("cancel_reason not in", values, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andCancelReasonBetween(String value1, String value2) {
            addCriterion("cancel_reason between", value1, value2, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andCancelReasonNotBetween(String value1, String value2) {
            addCriterion("cancel_reason not between", value1, value2, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andArchiveReasonNameIsNull() {
            addCriterion("archive_reason_name is null");
            return (Criteria) this;
        }

        public Criteria andArchiveReasonNameIsNotNull() {
            addCriterion("archive_reason_name is not null");
            return (Criteria) this;
        }

        public Criteria andArchiveReasonNameEqualTo(String value) {
            addCriterion("archive_reason_name =", value, "archiveReasonName");
            return (Criteria) this;
        }

        public Criteria andArchiveReasonNameNotEqualTo(String value) {
            addCriterion("archive_reason_name <>", value, "archiveReasonName");
            return (Criteria) this;
        }

        public Criteria andArchiveReasonNameGreaterThan(String value) {
            addCriterion("archive_reason_name >", value, "archiveReasonName");
            return (Criteria) this;
        }

        public Criteria andArchiveReasonNameGreaterThanOrEqualTo(String value) {
            addCriterion("archive_reason_name >=", value, "archiveReasonName");
            return (Criteria) this;
        }

        public Criteria andArchiveReasonNameLessThan(String value) {
            addCriterion("archive_reason_name <", value, "archiveReasonName");
            return (Criteria) this;
        }

        public Criteria andArchiveReasonNameLessThanOrEqualTo(String value) {
            addCriterion("archive_reason_name <=", value, "archiveReasonName");
            return (Criteria) this;
        }

        public Criteria andArchiveReasonNameLike(String value) {
            addCriterion("archive_reason_name like", value, "archiveReasonName");
            return (Criteria) this;
        }

        public Criteria andArchiveReasonNameNotLike(String value) {
            addCriterion("archive_reason_name not like", value, "archiveReasonName");
            return (Criteria) this;
        }

        public Criteria andArchiveReasonNameIn(List<String> values) {
            addCriterion("archive_reason_name in", values, "archiveReasonName");
            return (Criteria) this;
        }

        public Criteria andArchiveReasonNameNotIn(List<String> values) {
            addCriterion("archive_reason_name not in", values, "archiveReasonName");
            return (Criteria) this;
        }

        public Criteria andArchiveReasonNameBetween(String value1, String value2) {
            addCriterion("archive_reason_name between", value1, value2, "archiveReasonName");
            return (Criteria) this;
        }

        public Criteria andArchiveReasonNameNotBetween(String value1, String value2) {
            addCriterion("archive_reason_name not between", value1, value2, "archiveReasonName");
            return (Criteria) this;
        }

        public Criteria andArchiveReasonCodeIsNull() {
            addCriterion("archive_reason_code is null");
            return (Criteria) this;
        }

        public Criteria andArchiveReasonCodeIsNotNull() {
            addCriterion("archive_reason_code is not null");
            return (Criteria) this;
        }

        public Criteria andArchiveReasonCodeEqualTo(String value) {
            addCriterion("archive_reason_code =", value, "archiveReasonCode");
            return (Criteria) this;
        }

        public Criteria andArchiveReasonCodeNotEqualTo(String value) {
            addCriterion("archive_reason_code <>", value, "archiveReasonCode");
            return (Criteria) this;
        }

        public Criteria andArchiveReasonCodeGreaterThan(String value) {
            addCriterion("archive_reason_code >", value, "archiveReasonCode");
            return (Criteria) this;
        }

        public Criteria andArchiveReasonCodeGreaterThanOrEqualTo(String value) {
            addCriterion("archive_reason_code >=", value, "archiveReasonCode");
            return (Criteria) this;
        }

        public Criteria andArchiveReasonCodeLessThan(String value) {
            addCriterion("archive_reason_code <", value, "archiveReasonCode");
            return (Criteria) this;
        }

        public Criteria andArchiveReasonCodeLessThanOrEqualTo(String value) {
            addCriterion("archive_reason_code <=", value, "archiveReasonCode");
            return (Criteria) this;
        }

        public Criteria andArchiveReasonCodeLike(String value) {
            addCriterion("archive_reason_code like", value, "archiveReasonCode");
            return (Criteria) this;
        }

        public Criteria andArchiveReasonCodeNotLike(String value) {
            addCriterion("archive_reason_code not like", value, "archiveReasonCode");
            return (Criteria) this;
        }

        public Criteria andArchiveReasonCodeIn(List<String> values) {
            addCriterion("archive_reason_code in", values, "archiveReasonCode");
            return (Criteria) this;
        }

        public Criteria andArchiveReasonCodeNotIn(List<String> values) {
            addCriterion("archive_reason_code not in", values, "archiveReasonCode");
            return (Criteria) this;
        }

        public Criteria andArchiveReasonCodeBetween(String value1, String value2) {
            addCriterion("archive_reason_code between", value1, value2, "archiveReasonCode");
            return (Criteria) this;
        }

        public Criteria andArchiveReasonCodeNotBetween(String value1, String value2) {
            addCriterion("archive_reason_code not between", value1, value2, "archiveReasonCode");
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
     * product_order_main
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * product_order_main 2018-05-17
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

        private static String allFields = "id,product_order_code,audit_time,audit_user_id,audit_user_name,product_create_date,goods_id,goods_code,goods_name,pre_pay_time,pay_time,pay_user_id,pay_user_name,local_total_mny,pay_total_mny,un_pay_mny,total_invoice_mny,quantity,settlement,supplier_id,supplier_code,supplier_name,exp_delivered_time,non_invoice_mny,delivered_time,logis_no,logist_company_name,logis_fee,warehouse_id,order_number,archive_date,bill_date,product_status,order_status,cancel_time,cancel_reason,archive_reason_name,archive_reason_code,creator,create_time,modifier,modify_time";

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

        public SelectiveField productOrderCode() {
            fields.add("product_order_code");
            return this;
        }

        public SelectiveField auditTime() {
            fields.add("audit_time");
            return this;
        }

        public SelectiveField auditUserId() {
            fields.add("audit_user_id");
            return this;
        }

        public SelectiveField auditUserName() {
            fields.add("audit_user_name");
            return this;
        }

        public SelectiveField productCreateDate() {
            fields.add("product_create_date");
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

        public SelectiveField prePayTime() {
            fields.add("pre_pay_time");
            return this;
        }

        public SelectiveField payTime() {
            fields.add("pay_time");
            return this;
        }

        public SelectiveField payUserId() {
            fields.add("pay_user_id");
            return this;
        }

        public SelectiveField payUserName() {
            fields.add("pay_user_name");
            return this;
        }

        public SelectiveField localTotalMny() {
            fields.add("local_total_mny");
            return this;
        }

        public SelectiveField payTotalMny() {
            fields.add("pay_total_mny");
            return this;
        }

        public SelectiveField unPayMny() {
            fields.add("un_pay_mny");
            return this;
        }

        public SelectiveField totalInvoiceMny() {
            fields.add("total_invoice_mny");
            return this;
        }

        public SelectiveField quantity() {
            fields.add("quantity");
            return this;
        }

        public SelectiveField settlement() {
            fields.add("settlement");
            return this;
        }

        public SelectiveField supplierId() {
            fields.add("supplier_id");
            return this;
        }

        public SelectiveField supplierCode() {
            fields.add("supplier_code");
            return this;
        }

        public SelectiveField supplierName() {
            fields.add("supplier_name");
            return this;
        }

        public SelectiveField expDeliveredTime() {
            fields.add("exp_delivered_time");
            return this;
        }

        public SelectiveField nonInvoiceMny() {
            fields.add("non_invoice_mny");
            return this;
        }

        public SelectiveField deliveredTime() {
            fields.add("delivered_time");
            return this;
        }

        public SelectiveField logisNo() {
            fields.add("logis_no");
            return this;
        }

        public SelectiveField logistCompanyName() {
            fields.add("logist_company_name");
            return this;
        }

        public SelectiveField logisFee() {
            fields.add("logis_fee");
            return this;
        }

        public SelectiveField warehouseId() {
            fields.add("warehouse_id");
            return this;
        }

        public SelectiveField orderNumber() {
            fields.add("order_number");
            return this;
        }

        public SelectiveField archiveDate() {
            fields.add("archive_date");
            return this;
        }

        public SelectiveField billDate() {
            fields.add("bill_date");
            return this;
        }

        public SelectiveField productStatus() {
            fields.add("product_status");
            return this;
        }

        public SelectiveField orderStatus() {
            fields.add("order_status");
            return this;
        }

        public SelectiveField cancelTime() {
            fields.add("cancel_time");
            return this;
        }

        public SelectiveField cancelReason() {
            fields.add("cancel_reason");
            return this;
        }

        public SelectiveField archiveReasonName() {
            fields.add("archive_reason_name");
            return this;
        }

        public SelectiveField archiveReasonCode() {
            fields.add("archive_reason_code");
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