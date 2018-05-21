package com.binger.stock.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class StockInBillMainExample {
    /**
     * stock_in_bill_main
     */
    protected String orderByClause;

    /**
     * stock_in_bill_main
     */
    protected boolean distinct;

    /**
     * stock_in_bill_main
     */
    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    private SelectiveField selectiveField;

    public StockInBillMainExample() {
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
     * stock_in_bill_main 2018-05-18
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

        public Criteria andStockInBillMainCodeIsNull() {
            addCriterion("stock_in_bill_main_code is null");
            return (Criteria) this;
        }

        public Criteria andStockInBillMainCodeIsNotNull() {
            addCriterion("stock_in_bill_main_code is not null");
            return (Criteria) this;
        }

        public Criteria andStockInBillMainCodeEqualTo(String value) {
            addCriterion("stock_in_bill_main_code =", value, "stockInBillMainCode");
            return (Criteria) this;
        }

        public Criteria andStockInBillMainCodeNotEqualTo(String value) {
            addCriterion("stock_in_bill_main_code <>", value, "stockInBillMainCode");
            return (Criteria) this;
        }

        public Criteria andStockInBillMainCodeGreaterThan(String value) {
            addCriterion("stock_in_bill_main_code >", value, "stockInBillMainCode");
            return (Criteria) this;
        }

        public Criteria andStockInBillMainCodeGreaterThanOrEqualTo(String value) {
            addCriterion("stock_in_bill_main_code >=", value, "stockInBillMainCode");
            return (Criteria) this;
        }

        public Criteria andStockInBillMainCodeLessThan(String value) {
            addCriterion("stock_in_bill_main_code <", value, "stockInBillMainCode");
            return (Criteria) this;
        }

        public Criteria andStockInBillMainCodeLessThanOrEqualTo(String value) {
            addCriterion("stock_in_bill_main_code <=", value, "stockInBillMainCode");
            return (Criteria) this;
        }

        public Criteria andStockInBillMainCodeLike(String value) {
            addCriterion("stock_in_bill_main_code like", value, "stockInBillMainCode");
            return (Criteria) this;
        }

        public Criteria andStockInBillMainCodeNotLike(String value) {
            addCriterion("stock_in_bill_main_code not like", value, "stockInBillMainCode");
            return (Criteria) this;
        }

        public Criteria andStockInBillMainCodeIn(List<String> values) {
            addCriterion("stock_in_bill_main_code in", values, "stockInBillMainCode");
            return (Criteria) this;
        }

        public Criteria andStockInBillMainCodeNotIn(List<String> values) {
            addCriterion("stock_in_bill_main_code not in", values, "stockInBillMainCode");
            return (Criteria) this;
        }

        public Criteria andStockInBillMainCodeBetween(String value1, String value2) {
            addCriterion("stock_in_bill_main_code between", value1, value2, "stockInBillMainCode");
            return (Criteria) this;
        }

        public Criteria andStockInBillMainCodeNotBetween(String value1, String value2) {
            addCriterion("stock_in_bill_main_code not between", value1, value2, "stockInBillMainCode");
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

        public Criteria andBillTypeIsNull() {
            addCriterion("bill_type is null");
            return (Criteria) this;
        }

        public Criteria andBillTypeIsNotNull() {
            addCriterion("bill_type is not null");
            return (Criteria) this;
        }

        public Criteria andBillTypeEqualTo(Integer value) {
            addCriterion("bill_type =", value, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeNotEqualTo(Integer value) {
            addCriterion("bill_type <>", value, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeGreaterThan(Integer value) {
            addCriterion("bill_type >", value, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("bill_type >=", value, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeLessThan(Integer value) {
            addCriterion("bill_type <", value, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeLessThanOrEqualTo(Integer value) {
            addCriterion("bill_type <=", value, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeIn(List<Integer> values) {
            addCriterion("bill_type in", values, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeNotIn(List<Integer> values) {
            addCriterion("bill_type not in", values, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeBetween(Integer value1, Integer value2) {
            addCriterion("bill_type between", value1, value2, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("bill_type not between", value1, value2, "billType");
            return (Criteria) this;
        }

        public Criteria andStockinDateIsNull() {
            addCriterion("stockin_date is null");
            return (Criteria) this;
        }

        public Criteria andStockinDateIsNotNull() {
            addCriterion("stockin_date is not null");
            return (Criteria) this;
        }

        public Criteria andStockinDateEqualTo(Date value) {
            addCriterion("stockin_date =", value, "stockinDate");
            return (Criteria) this;
        }

        public Criteria andStockinDateNotEqualTo(Date value) {
            addCriterion("stockin_date <>", value, "stockinDate");
            return (Criteria) this;
        }

        public Criteria andStockinDateGreaterThan(Date value) {
            addCriterion("stockin_date >", value, "stockinDate");
            return (Criteria) this;
        }

        public Criteria andStockinDateGreaterThanOrEqualTo(Date value) {
            addCriterion("stockin_date >=", value, "stockinDate");
            return (Criteria) this;
        }

        public Criteria andStockinDateLessThan(Date value) {
            addCriterion("stockin_date <", value, "stockinDate");
            return (Criteria) this;
        }

        public Criteria andStockinDateLessThanOrEqualTo(Date value) {
            addCriterion("stockin_date <=", value, "stockinDate");
            return (Criteria) this;
        }

        public Criteria andStockinDateIn(List<Date> values) {
            addCriterion("stockin_date in", values, "stockinDate");
            return (Criteria) this;
        }

        public Criteria andStockinDateNotIn(List<Date> values) {
            addCriterion("stockin_date not in", values, "stockinDate");
            return (Criteria) this;
        }

        public Criteria andStockinDateBetween(Date value1, Date value2) {
            addCriterion("stockin_date between", value1, value2, "stockinDate");
            return (Criteria) this;
        }

        public Criteria andStockinDateNotBetween(Date value1, Date value2) {
            addCriterion("stockin_date not between", value1, value2, "stockinDate");
            return (Criteria) this;
        }

        public Criteria andAuditorIsNull() {
            addCriterion("auditor is null");
            return (Criteria) this;
        }

        public Criteria andAuditorIsNotNull() {
            addCriterion("auditor is not null");
            return (Criteria) this;
        }

        public Criteria andAuditorEqualTo(String value) {
            addCriterion("auditor =", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorNotEqualTo(String value) {
            addCriterion("auditor <>", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorGreaterThan(String value) {
            addCriterion("auditor >", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorGreaterThanOrEqualTo(String value) {
            addCriterion("auditor >=", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorLessThan(String value) {
            addCriterion("auditor <", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorLessThanOrEqualTo(String value) {
            addCriterion("auditor <=", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorLike(String value) {
            addCriterion("auditor like", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorNotLike(String value) {
            addCriterion("auditor not like", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorIn(List<String> values) {
            addCriterion("auditor in", values, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorNotIn(List<String> values) {
            addCriterion("auditor not in", values, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorBetween(String value1, String value2) {
            addCriterion("auditor between", value1, value2, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorNotBetween(String value1, String value2) {
            addCriterion("auditor not between", value1, value2, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditDateIsNull() {
            addCriterion("audit_date is null");
            return (Criteria) this;
        }

        public Criteria andAuditDateIsNotNull() {
            addCriterion("audit_date is not null");
            return (Criteria) this;
        }

        public Criteria andAuditDateEqualTo(Date value) {
            addCriterion("audit_date =", value, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateNotEqualTo(Date value) {
            addCriterion("audit_date <>", value, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateGreaterThan(Date value) {
            addCriterion("audit_date >", value, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateGreaterThanOrEqualTo(Date value) {
            addCriterion("audit_date >=", value, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateLessThan(Date value) {
            addCriterion("audit_date <", value, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateLessThanOrEqualTo(Date value) {
            addCriterion("audit_date <=", value, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateIn(List<Date> values) {
            addCriterion("audit_date in", values, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateNotIn(List<Date> values) {
            addCriterion("audit_date not in", values, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateBetween(Date value1, Date value2) {
            addCriterion("audit_date between", value1, value2, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateNotBetween(Date value1, Date value2) {
            addCriterion("audit_date not between", value1, value2, "auditDate");
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

        public Criteria andTrackNumberIsNull() {
            addCriterion("track_number is null");
            return (Criteria) this;
        }

        public Criteria andTrackNumberIsNotNull() {
            addCriterion("track_number is not null");
            return (Criteria) this;
        }

        public Criteria andTrackNumberEqualTo(String value) {
            addCriterion("track_number =", value, "trackNumber");
            return (Criteria) this;
        }

        public Criteria andTrackNumberNotEqualTo(String value) {
            addCriterion("track_number <>", value, "trackNumber");
            return (Criteria) this;
        }

        public Criteria andTrackNumberGreaterThan(String value) {
            addCriterion("track_number >", value, "trackNumber");
            return (Criteria) this;
        }

        public Criteria andTrackNumberGreaterThanOrEqualTo(String value) {
            addCriterion("track_number >=", value, "trackNumber");
            return (Criteria) this;
        }

        public Criteria andTrackNumberLessThan(String value) {
            addCriterion("track_number <", value, "trackNumber");
            return (Criteria) this;
        }

        public Criteria andTrackNumberLessThanOrEqualTo(String value) {
            addCriterion("track_number <=", value, "trackNumber");
            return (Criteria) this;
        }

        public Criteria andTrackNumberLike(String value) {
            addCriterion("track_number like", value, "trackNumber");
            return (Criteria) this;
        }

        public Criteria andTrackNumberNotLike(String value) {
            addCriterion("track_number not like", value, "trackNumber");
            return (Criteria) this;
        }

        public Criteria andTrackNumberIn(List<String> values) {
            addCriterion("track_number in", values, "trackNumber");
            return (Criteria) this;
        }

        public Criteria andTrackNumberNotIn(List<String> values) {
            addCriterion("track_number not in", values, "trackNumber");
            return (Criteria) this;
        }

        public Criteria andTrackNumberBetween(String value1, String value2) {
            addCriterion("track_number between", value1, value2, "trackNumber");
            return (Criteria) this;
        }

        public Criteria andTrackNumberNotBetween(String value1, String value2) {
            addCriterion("track_number not between", value1, value2, "trackNumber");
            return (Criteria) this;
        }

        public Criteria andStockinStatusIsNull() {
            addCriterion("stockin_status is null");
            return (Criteria) this;
        }

        public Criteria andStockinStatusIsNotNull() {
            addCriterion("stockin_status is not null");
            return (Criteria) this;
        }

        public Criteria andStockinStatusEqualTo(Integer value) {
            addCriterion("stockin_status =", value, "stockinStatus");
            return (Criteria) this;
        }

        public Criteria andStockinStatusNotEqualTo(Integer value) {
            addCriterion("stockin_status <>", value, "stockinStatus");
            return (Criteria) this;
        }

        public Criteria andStockinStatusGreaterThan(Integer value) {
            addCriterion("stockin_status >", value, "stockinStatus");
            return (Criteria) this;
        }

        public Criteria andStockinStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("stockin_status >=", value, "stockinStatus");
            return (Criteria) this;
        }

        public Criteria andStockinStatusLessThan(Integer value) {
            addCriterion("stockin_status <", value, "stockinStatus");
            return (Criteria) this;
        }

        public Criteria andStockinStatusLessThanOrEqualTo(Integer value) {
            addCriterion("stockin_status <=", value, "stockinStatus");
            return (Criteria) this;
        }

        public Criteria andStockinStatusIn(List<Integer> values) {
            addCriterion("stockin_status in", values, "stockinStatus");
            return (Criteria) this;
        }

        public Criteria andStockinStatusNotIn(List<Integer> values) {
            addCriterion("stockin_status not in", values, "stockinStatus");
            return (Criteria) this;
        }

        public Criteria andStockinStatusBetween(Integer value1, Integer value2) {
            addCriterion("stockin_status between", value1, value2, "stockinStatus");
            return (Criteria) this;
        }

        public Criteria andStockinStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("stockin_status not between", value1, value2, "stockinStatus");
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

        public Criteria andReceiverNameIsNull() {
            addCriterion("receiver_name is null");
            return (Criteria) this;
        }

        public Criteria andReceiverNameIsNotNull() {
            addCriterion("receiver_name is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverNameEqualTo(String value) {
            addCriterion("receiver_name =", value, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameNotEqualTo(String value) {
            addCriterion("receiver_name <>", value, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameGreaterThan(String value) {
            addCriterion("receiver_name >", value, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameGreaterThanOrEqualTo(String value) {
            addCriterion("receiver_name >=", value, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameLessThan(String value) {
            addCriterion("receiver_name <", value, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameLessThanOrEqualTo(String value) {
            addCriterion("receiver_name <=", value, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameLike(String value) {
            addCriterion("receiver_name like", value, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameNotLike(String value) {
            addCriterion("receiver_name not like", value, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameIn(List<String> values) {
            addCriterion("receiver_name in", values, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameNotIn(List<String> values) {
            addCriterion("receiver_name not in", values, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameBetween(String value1, String value2) {
            addCriterion("receiver_name between", value1, value2, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameNotBetween(String value1, String value2) {
            addCriterion("receiver_name not between", value1, value2, "receiverName");
            return (Criteria) this;
        }

        public Criteria andStockInMoneyIsNull() {
            addCriterion("stock_in_money is null");
            return (Criteria) this;
        }

        public Criteria andStockInMoneyIsNotNull() {
            addCriterion("stock_in_money is not null");
            return (Criteria) this;
        }

        public Criteria andStockInMoneyEqualTo(BigDecimal value) {
            addCriterion("stock_in_money =", value, "stockInMoney");
            return (Criteria) this;
        }

        public Criteria andStockInMoneyNotEqualTo(BigDecimal value) {
            addCriterion("stock_in_money <>", value, "stockInMoney");
            return (Criteria) this;
        }

        public Criteria andStockInMoneyGreaterThan(BigDecimal value) {
            addCriterion("stock_in_money >", value, "stockInMoney");
            return (Criteria) this;
        }

        public Criteria andStockInMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("stock_in_money >=", value, "stockInMoney");
            return (Criteria) this;
        }

        public Criteria andStockInMoneyLessThan(BigDecimal value) {
            addCriterion("stock_in_money <", value, "stockInMoney");
            return (Criteria) this;
        }

        public Criteria andStockInMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("stock_in_money <=", value, "stockInMoney");
            return (Criteria) this;
        }

        public Criteria andStockInMoneyIn(List<BigDecimal> values) {
            addCriterion("stock_in_money in", values, "stockInMoney");
            return (Criteria) this;
        }

        public Criteria andStockInMoneyNotIn(List<BigDecimal> values) {
            addCriterion("stock_in_money not in", values, "stockInMoney");
            return (Criteria) this;
        }

        public Criteria andStockInMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("stock_in_money between", value1, value2, "stockInMoney");
            return (Criteria) this;
        }

        public Criteria andStockInMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("stock_in_money not between", value1, value2, "stockInMoney");
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
     * stock_in_bill_main
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * stock_in_bill_main 2018-05-18
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

        private static String allFields = "id,stock_in_bill_main_code,product_order_code,bill_type,stockin_date,auditor,audit_date,warehouse_id,track_number,stockin_status,supplier_id,supplier_code,supplier_name,apply_quantity,quantity,defective_quantity,bill_date,receiver_name,stock_in_money,remark,creator,create_time,modifier,modify_time";

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

        public SelectiveField stockInBillMainCode() {
            fields.add("stock_in_bill_main_code");
            return this;
        }

        public SelectiveField productOrderCode() {
            fields.add("product_order_code");
            return this;
        }

        public SelectiveField billType() {
            fields.add("bill_type");
            return this;
        }

        public SelectiveField stockinDate() {
            fields.add("stockin_date");
            return this;
        }

        public SelectiveField auditor() {
            fields.add("auditor");
            return this;
        }

        public SelectiveField auditDate() {
            fields.add("audit_date");
            return this;
        }

        public SelectiveField warehouseId() {
            fields.add("warehouse_id");
            return this;
        }

        public SelectiveField trackNumber() {
            fields.add("track_number");
            return this;
        }

        public SelectiveField stockinStatus() {
            fields.add("stockin_status");
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

        public SelectiveField applyQuantity() {
            fields.add("apply_quantity");
            return this;
        }

        public SelectiveField quantity() {
            fields.add("quantity");
            return this;
        }

        public SelectiveField defectiveQuantity() {
            fields.add("defective_quantity");
            return this;
        }

        public SelectiveField billDate() {
            fields.add("bill_date");
            return this;
        }

        public SelectiveField receiverName() {
            fields.add("receiver_name");
            return this;
        }

        public SelectiveField stockInMoney() {
            fields.add("stock_in_money");
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