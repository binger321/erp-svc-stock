package com.binger.stock.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class StockOutBillMainExample {
    /**
     * stock_out_bill_main
     */
    protected String orderByClause;

    /**
     * stock_out_bill_main
     */
    protected boolean distinct;

    /**
     * stock_out_bill_main
     */
    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    private SelectiveField selectiveField;

    public StockOutBillMainExample() {
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
     * stock_out_bill_main 2018-05-17
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

        public Criteria andStockoutBillMainCodeIsNull() {
            addCriterion("stockout_bill_main_code is null");
            return (Criteria) this;
        }

        public Criteria andStockoutBillMainCodeIsNotNull() {
            addCriterion("stockout_bill_main_code is not null");
            return (Criteria) this;
        }

        public Criteria andStockoutBillMainCodeEqualTo(String value) {
            addCriterion("stockout_bill_main_code =", value, "stockoutBillMainCode");
            return (Criteria) this;
        }

        public Criteria andStockoutBillMainCodeNotEqualTo(String value) {
            addCriterion("stockout_bill_main_code <>", value, "stockoutBillMainCode");
            return (Criteria) this;
        }

        public Criteria andStockoutBillMainCodeGreaterThan(String value) {
            addCriterion("stockout_bill_main_code >", value, "stockoutBillMainCode");
            return (Criteria) this;
        }

        public Criteria andStockoutBillMainCodeGreaterThanOrEqualTo(String value) {
            addCriterion("stockout_bill_main_code >=", value, "stockoutBillMainCode");
            return (Criteria) this;
        }

        public Criteria andStockoutBillMainCodeLessThan(String value) {
            addCriterion("stockout_bill_main_code <", value, "stockoutBillMainCode");
            return (Criteria) this;
        }

        public Criteria andStockoutBillMainCodeLessThanOrEqualTo(String value) {
            addCriterion("stockout_bill_main_code <=", value, "stockoutBillMainCode");
            return (Criteria) this;
        }

        public Criteria andStockoutBillMainCodeLike(String value) {
            addCriterion("stockout_bill_main_code like", value, "stockoutBillMainCode");
            return (Criteria) this;
        }

        public Criteria andStockoutBillMainCodeNotLike(String value) {
            addCriterion("stockout_bill_main_code not like", value, "stockoutBillMainCode");
            return (Criteria) this;
        }

        public Criteria andStockoutBillMainCodeIn(List<String> values) {
            addCriterion("stockout_bill_main_code in", values, "stockoutBillMainCode");
            return (Criteria) this;
        }

        public Criteria andStockoutBillMainCodeNotIn(List<String> values) {
            addCriterion("stockout_bill_main_code not in", values, "stockoutBillMainCode");
            return (Criteria) this;
        }

        public Criteria andStockoutBillMainCodeBetween(String value1, String value2) {
            addCriterion("stockout_bill_main_code between", value1, value2, "stockoutBillMainCode");
            return (Criteria) this;
        }

        public Criteria andStockoutBillMainCodeNotBetween(String value1, String value2) {
            addCriterion("stockout_bill_main_code not between", value1, value2, "stockoutBillMainCode");
            return (Criteria) this;
        }

        public Criteria andOrderSaleCodeIsNull() {
            addCriterion("order_sale_code is null");
            return (Criteria) this;
        }

        public Criteria andOrderSaleCodeIsNotNull() {
            addCriterion("order_sale_code is not null");
            return (Criteria) this;
        }

        public Criteria andOrderSaleCodeEqualTo(String value) {
            addCriterion("order_sale_code =", value, "orderSaleCode");
            return (Criteria) this;
        }

        public Criteria andOrderSaleCodeNotEqualTo(String value) {
            addCriterion("order_sale_code <>", value, "orderSaleCode");
            return (Criteria) this;
        }

        public Criteria andOrderSaleCodeGreaterThan(String value) {
            addCriterion("order_sale_code >", value, "orderSaleCode");
            return (Criteria) this;
        }

        public Criteria andOrderSaleCodeGreaterThanOrEqualTo(String value) {
            addCriterion("order_sale_code >=", value, "orderSaleCode");
            return (Criteria) this;
        }

        public Criteria andOrderSaleCodeLessThan(String value) {
            addCriterion("order_sale_code <", value, "orderSaleCode");
            return (Criteria) this;
        }

        public Criteria andOrderSaleCodeLessThanOrEqualTo(String value) {
            addCriterion("order_sale_code <=", value, "orderSaleCode");
            return (Criteria) this;
        }

        public Criteria andOrderSaleCodeLike(String value) {
            addCriterion("order_sale_code like", value, "orderSaleCode");
            return (Criteria) this;
        }

        public Criteria andOrderSaleCodeNotLike(String value) {
            addCriterion("order_sale_code not like", value, "orderSaleCode");
            return (Criteria) this;
        }

        public Criteria andOrderSaleCodeIn(List<String> values) {
            addCriterion("order_sale_code in", values, "orderSaleCode");
            return (Criteria) this;
        }

        public Criteria andOrderSaleCodeNotIn(List<String> values) {
            addCriterion("order_sale_code not in", values, "orderSaleCode");
            return (Criteria) this;
        }

        public Criteria andOrderSaleCodeBetween(String value1, String value2) {
            addCriterion("order_sale_code between", value1, value2, "orderSaleCode");
            return (Criteria) this;
        }

        public Criteria andOrderSaleCodeNotBetween(String value1, String value2) {
            addCriterion("order_sale_code not between", value1, value2, "orderSaleCode");
            return (Criteria) this;
        }

        public Criteria andShipmentIdIsNull() {
            addCriterion("shipment_id is null");
            return (Criteria) this;
        }

        public Criteria andShipmentIdIsNotNull() {
            addCriterion("shipment_id is not null");
            return (Criteria) this;
        }

        public Criteria andShipmentIdEqualTo(Integer value) {
            addCriterion("shipment_id =", value, "shipmentId");
            return (Criteria) this;
        }

        public Criteria andShipmentIdNotEqualTo(Integer value) {
            addCriterion("shipment_id <>", value, "shipmentId");
            return (Criteria) this;
        }

        public Criteria andShipmentIdGreaterThan(Integer value) {
            addCriterion("shipment_id >", value, "shipmentId");
            return (Criteria) this;
        }

        public Criteria andShipmentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("shipment_id >=", value, "shipmentId");
            return (Criteria) this;
        }

        public Criteria andShipmentIdLessThan(Integer value) {
            addCriterion("shipment_id <", value, "shipmentId");
            return (Criteria) this;
        }

        public Criteria andShipmentIdLessThanOrEqualTo(Integer value) {
            addCriterion("shipment_id <=", value, "shipmentId");
            return (Criteria) this;
        }

        public Criteria andShipmentIdIn(List<Integer> values) {
            addCriterion("shipment_id in", values, "shipmentId");
            return (Criteria) this;
        }

        public Criteria andShipmentIdNotIn(List<Integer> values) {
            addCriterion("shipment_id not in", values, "shipmentId");
            return (Criteria) this;
        }

        public Criteria andShipmentIdBetween(Integer value1, Integer value2) {
            addCriterion("shipment_id between", value1, value2, "shipmentId");
            return (Criteria) this;
        }

        public Criteria andShipmentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("shipment_id not between", value1, value2, "shipmentId");
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

        public Criteria andStockoutDateIsNull() {
            addCriterion("stockout_date is null");
            return (Criteria) this;
        }

        public Criteria andStockoutDateIsNotNull() {
            addCriterion("stockout_date is not null");
            return (Criteria) this;
        }

        public Criteria andStockoutDateEqualTo(Date value) {
            addCriterion("stockout_date =", value, "stockoutDate");
            return (Criteria) this;
        }

        public Criteria andStockoutDateNotEqualTo(Date value) {
            addCriterion("stockout_date <>", value, "stockoutDate");
            return (Criteria) this;
        }

        public Criteria andStockoutDateGreaterThan(Date value) {
            addCriterion("stockout_date >", value, "stockoutDate");
            return (Criteria) this;
        }

        public Criteria andStockoutDateGreaterThanOrEqualTo(Date value) {
            addCriterion("stockout_date >=", value, "stockoutDate");
            return (Criteria) this;
        }

        public Criteria andStockoutDateLessThan(Date value) {
            addCriterion("stockout_date <", value, "stockoutDate");
            return (Criteria) this;
        }

        public Criteria andStockoutDateLessThanOrEqualTo(Date value) {
            addCriterion("stockout_date <=", value, "stockoutDate");
            return (Criteria) this;
        }

        public Criteria andStockoutDateIn(List<Date> values) {
            addCriterion("stockout_date in", values, "stockoutDate");
            return (Criteria) this;
        }

        public Criteria andStockoutDateNotIn(List<Date> values) {
            addCriterion("stockout_date not in", values, "stockoutDate");
            return (Criteria) this;
        }

        public Criteria andStockoutDateBetween(Date value1, Date value2) {
            addCriterion("stockout_date between", value1, value2, "stockoutDate");
            return (Criteria) this;
        }

        public Criteria andStockoutDateNotBetween(Date value1, Date value2) {
            addCriterion("stockout_date not between", value1, value2, "stockoutDate");
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

        public Criteria andAuditPersonIdIsNull() {
            addCriterion("audit_person_id is null");
            return (Criteria) this;
        }

        public Criteria andAuditPersonIdIsNotNull() {
            addCriterion("audit_person_id is not null");
            return (Criteria) this;
        }

        public Criteria andAuditPersonIdEqualTo(Integer value) {
            addCriterion("audit_person_id =", value, "auditPersonId");
            return (Criteria) this;
        }

        public Criteria andAuditPersonIdNotEqualTo(Integer value) {
            addCriterion("audit_person_id <>", value, "auditPersonId");
            return (Criteria) this;
        }

        public Criteria andAuditPersonIdGreaterThan(Integer value) {
            addCriterion("audit_person_id >", value, "auditPersonId");
            return (Criteria) this;
        }

        public Criteria andAuditPersonIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("audit_person_id >=", value, "auditPersonId");
            return (Criteria) this;
        }

        public Criteria andAuditPersonIdLessThan(Integer value) {
            addCriterion("audit_person_id <", value, "auditPersonId");
            return (Criteria) this;
        }

        public Criteria andAuditPersonIdLessThanOrEqualTo(Integer value) {
            addCriterion("audit_person_id <=", value, "auditPersonId");
            return (Criteria) this;
        }

        public Criteria andAuditPersonIdIn(List<Integer> values) {
            addCriterion("audit_person_id in", values, "auditPersonId");
            return (Criteria) this;
        }

        public Criteria andAuditPersonIdNotIn(List<Integer> values) {
            addCriterion("audit_person_id not in", values, "auditPersonId");
            return (Criteria) this;
        }

        public Criteria andAuditPersonIdBetween(Integer value1, Integer value2) {
            addCriterion("audit_person_id between", value1, value2, "auditPersonId");
            return (Criteria) this;
        }

        public Criteria andAuditPersonIdNotBetween(Integer value1, Integer value2) {
            addCriterion("audit_person_id not between", value1, value2, "auditPersonId");
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

        public Criteria andStockoutTimeIsNull() {
            addCriterion("stockout_time is null");
            return (Criteria) this;
        }

        public Criteria andStockoutTimeIsNotNull() {
            addCriterion("stockout_time is not null");
            return (Criteria) this;
        }

        public Criteria andStockoutTimeEqualTo(Date value) {
            addCriterion("stockout_time =", value, "stockoutTime");
            return (Criteria) this;
        }

        public Criteria andStockoutTimeNotEqualTo(Date value) {
            addCriterion("stockout_time <>", value, "stockoutTime");
            return (Criteria) this;
        }

        public Criteria andStockoutTimeGreaterThan(Date value) {
            addCriterion("stockout_time >", value, "stockoutTime");
            return (Criteria) this;
        }

        public Criteria andStockoutTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("stockout_time >=", value, "stockoutTime");
            return (Criteria) this;
        }

        public Criteria andStockoutTimeLessThan(Date value) {
            addCriterion("stockout_time <", value, "stockoutTime");
            return (Criteria) this;
        }

        public Criteria andStockoutTimeLessThanOrEqualTo(Date value) {
            addCriterion("stockout_time <=", value, "stockoutTime");
            return (Criteria) this;
        }

        public Criteria andStockoutTimeIn(List<Date> values) {
            addCriterion("stockout_time in", values, "stockoutTime");
            return (Criteria) this;
        }

        public Criteria andStockoutTimeNotIn(List<Date> values) {
            addCriterion("stockout_time not in", values, "stockoutTime");
            return (Criteria) this;
        }

        public Criteria andStockoutTimeBetween(Date value1, Date value2) {
            addCriterion("stockout_time between", value1, value2, "stockoutTime");
            return (Criteria) this;
        }

        public Criteria andStockoutTimeNotBetween(Date value1, Date value2) {
            addCriterion("stockout_time not between", value1, value2, "stockoutTime");
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

        public Criteria andStockoutStatusIsNull() {
            addCriterion("stockout_status is null");
            return (Criteria) this;
        }

        public Criteria andStockoutStatusIsNotNull() {
            addCriterion("stockout_status is not null");
            return (Criteria) this;
        }

        public Criteria andStockoutStatusEqualTo(Integer value) {
            addCriterion("stockout_status =", value, "stockoutStatus");
            return (Criteria) this;
        }

        public Criteria andStockoutStatusNotEqualTo(Integer value) {
            addCriterion("stockout_status <>", value, "stockoutStatus");
            return (Criteria) this;
        }

        public Criteria andStockoutStatusGreaterThan(Integer value) {
            addCriterion("stockout_status >", value, "stockoutStatus");
            return (Criteria) this;
        }

        public Criteria andStockoutStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("stockout_status >=", value, "stockoutStatus");
            return (Criteria) this;
        }

        public Criteria andStockoutStatusLessThan(Integer value) {
            addCriterion("stockout_status <", value, "stockoutStatus");
            return (Criteria) this;
        }

        public Criteria andStockoutStatusLessThanOrEqualTo(Integer value) {
            addCriterion("stockout_status <=", value, "stockoutStatus");
            return (Criteria) this;
        }

        public Criteria andStockoutStatusIn(List<Integer> values) {
            addCriterion("stockout_status in", values, "stockoutStatus");
            return (Criteria) this;
        }

        public Criteria andStockoutStatusNotIn(List<Integer> values) {
            addCriterion("stockout_status not in", values, "stockoutStatus");
            return (Criteria) this;
        }

        public Criteria andStockoutStatusBetween(Integer value1, Integer value2) {
            addCriterion("stockout_status between", value1, value2, "stockoutStatus");
            return (Criteria) this;
        }

        public Criteria andStockoutStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("stockout_status not between", value1, value2, "stockoutStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIsNull() {
            addCriterion("customer_name is null");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIsNotNull() {
            addCriterion("customer_name is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerNameEqualTo(String value) {
            addCriterion("customer_name =", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotEqualTo(String value) {
            addCriterion("customer_name <>", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameGreaterThan(String value) {
            addCriterion("customer_name >", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameGreaterThanOrEqualTo(String value) {
            addCriterion("customer_name >=", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLessThan(String value) {
            addCriterion("customer_name <", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLessThanOrEqualTo(String value) {
            addCriterion("customer_name <=", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLike(String value) {
            addCriterion("customer_name like", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotLike(String value) {
            addCriterion("customer_name not like", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIn(List<String> values) {
            addCriterion("customer_name in", values, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotIn(List<String> values) {
            addCriterion("customer_name not in", values, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameBetween(String value1, String value2) {
            addCriterion("customer_name between", value1, value2, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotBetween(String value1, String value2) {
            addCriterion("customer_name not between", value1, value2, "customerName");
            return (Criteria) this;
        }

        public Criteria andCountryIdIsNull() {
            addCriterion("country_id is null");
            return (Criteria) this;
        }

        public Criteria andCountryIdIsNotNull() {
            addCriterion("country_id is not null");
            return (Criteria) this;
        }

        public Criteria andCountryIdEqualTo(Integer value) {
            addCriterion("country_id =", value, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdNotEqualTo(Integer value) {
            addCriterion("country_id <>", value, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdGreaterThan(Integer value) {
            addCriterion("country_id >", value, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("country_id >=", value, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdLessThan(Integer value) {
            addCriterion("country_id <", value, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdLessThanOrEqualTo(Integer value) {
            addCriterion("country_id <=", value, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdIn(List<Integer> values) {
            addCriterion("country_id in", values, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdNotIn(List<Integer> values) {
            addCriterion("country_id not in", values, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdBetween(Integer value1, Integer value2) {
            addCriterion("country_id between", value1, value2, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("country_id not between", value1, value2, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryCodeIsNull() {
            addCriterion("country_code is null");
            return (Criteria) this;
        }

        public Criteria andCountryCodeIsNotNull() {
            addCriterion("country_code is not null");
            return (Criteria) this;
        }

        public Criteria andCountryCodeEqualTo(String value) {
            addCriterion("country_code =", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeNotEqualTo(String value) {
            addCriterion("country_code <>", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeGreaterThan(String value) {
            addCriterion("country_code >", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeGreaterThanOrEqualTo(String value) {
            addCriterion("country_code >=", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeLessThan(String value) {
            addCriterion("country_code <", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeLessThanOrEqualTo(String value) {
            addCriterion("country_code <=", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeLike(String value) {
            addCriterion("country_code like", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeNotLike(String value) {
            addCriterion("country_code not like", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeIn(List<String> values) {
            addCriterion("country_code in", values, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeNotIn(List<String> values) {
            addCriterion("country_code not in", values, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeBetween(String value1, String value2) {
            addCriterion("country_code between", value1, value2, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeNotBetween(String value1, String value2) {
            addCriterion("country_code not between", value1, value2, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryNameIsNull() {
            addCriterion("country_name is null");
            return (Criteria) this;
        }

        public Criteria andCountryNameIsNotNull() {
            addCriterion("country_name is not null");
            return (Criteria) this;
        }

        public Criteria andCountryNameEqualTo(String value) {
            addCriterion("country_name =", value, "countryName");
            return (Criteria) this;
        }

        public Criteria andCountryNameNotEqualTo(String value) {
            addCriterion("country_name <>", value, "countryName");
            return (Criteria) this;
        }

        public Criteria andCountryNameGreaterThan(String value) {
            addCriterion("country_name >", value, "countryName");
            return (Criteria) this;
        }

        public Criteria andCountryNameGreaterThanOrEqualTo(String value) {
            addCriterion("country_name >=", value, "countryName");
            return (Criteria) this;
        }

        public Criteria andCountryNameLessThan(String value) {
            addCriterion("country_name <", value, "countryName");
            return (Criteria) this;
        }

        public Criteria andCountryNameLessThanOrEqualTo(String value) {
            addCriterion("country_name <=", value, "countryName");
            return (Criteria) this;
        }

        public Criteria andCountryNameLike(String value) {
            addCriterion("country_name like", value, "countryName");
            return (Criteria) this;
        }

        public Criteria andCountryNameNotLike(String value) {
            addCriterion("country_name not like", value, "countryName");
            return (Criteria) this;
        }

        public Criteria andCountryNameIn(List<String> values) {
            addCriterion("country_name in", values, "countryName");
            return (Criteria) this;
        }

        public Criteria andCountryNameNotIn(List<String> values) {
            addCriterion("country_name not in", values, "countryName");
            return (Criteria) this;
        }

        public Criteria andCountryNameBetween(String value1, String value2) {
            addCriterion("country_name between", value1, value2, "countryName");
            return (Criteria) this;
        }

        public Criteria andCountryNameNotBetween(String value1, String value2) {
            addCriterion("country_name not between", value1, value2, "countryName");
            return (Criteria) this;
        }

        public Criteria andAddress1IsNull() {
            addCriterion("address1 is null");
            return (Criteria) this;
        }

        public Criteria andAddress1IsNotNull() {
            addCriterion("address1 is not null");
            return (Criteria) this;
        }

        public Criteria andAddress1EqualTo(String value) {
            addCriterion("address1 =", value, "address1");
            return (Criteria) this;
        }

        public Criteria andAddress1NotEqualTo(String value) {
            addCriterion("address1 <>", value, "address1");
            return (Criteria) this;
        }

        public Criteria andAddress1GreaterThan(String value) {
            addCriterion("address1 >", value, "address1");
            return (Criteria) this;
        }

        public Criteria andAddress1GreaterThanOrEqualTo(String value) {
            addCriterion("address1 >=", value, "address1");
            return (Criteria) this;
        }

        public Criteria andAddress1LessThan(String value) {
            addCriterion("address1 <", value, "address1");
            return (Criteria) this;
        }

        public Criteria andAddress1LessThanOrEqualTo(String value) {
            addCriterion("address1 <=", value, "address1");
            return (Criteria) this;
        }

        public Criteria andAddress1Like(String value) {
            addCriterion("address1 like", value, "address1");
            return (Criteria) this;
        }

        public Criteria andAddress1NotLike(String value) {
            addCriterion("address1 not like", value, "address1");
            return (Criteria) this;
        }

        public Criteria andAddress1In(List<String> values) {
            addCriterion("address1 in", values, "address1");
            return (Criteria) this;
        }

        public Criteria andAddress1NotIn(List<String> values) {
            addCriterion("address1 not in", values, "address1");
            return (Criteria) this;
        }

        public Criteria andAddress1Between(String value1, String value2) {
            addCriterion("address1 between", value1, value2, "address1");
            return (Criteria) this;
        }

        public Criteria andAddress1NotBetween(String value1, String value2) {
            addCriterion("address1 not between", value1, value2, "address1");
            return (Criteria) this;
        }

        public Criteria andDelayDaysIsNull() {
            addCriterion("delay_days is null");
            return (Criteria) this;
        }

        public Criteria andDelayDaysIsNotNull() {
            addCriterion("delay_days is not null");
            return (Criteria) this;
        }

        public Criteria andDelayDaysEqualTo(Integer value) {
            addCriterion("delay_days =", value, "delayDays");
            return (Criteria) this;
        }

        public Criteria andDelayDaysNotEqualTo(Integer value) {
            addCriterion("delay_days <>", value, "delayDays");
            return (Criteria) this;
        }

        public Criteria andDelayDaysGreaterThan(Integer value) {
            addCriterion("delay_days >", value, "delayDays");
            return (Criteria) this;
        }

        public Criteria andDelayDaysGreaterThanOrEqualTo(Integer value) {
            addCriterion("delay_days >=", value, "delayDays");
            return (Criteria) this;
        }

        public Criteria andDelayDaysLessThan(Integer value) {
            addCriterion("delay_days <", value, "delayDays");
            return (Criteria) this;
        }

        public Criteria andDelayDaysLessThanOrEqualTo(Integer value) {
            addCriterion("delay_days <=", value, "delayDays");
            return (Criteria) this;
        }

        public Criteria andDelayDaysIn(List<Integer> values) {
            addCriterion("delay_days in", values, "delayDays");
            return (Criteria) this;
        }

        public Criteria andDelayDaysNotIn(List<Integer> values) {
            addCriterion("delay_days not in", values, "delayDays");
            return (Criteria) this;
        }

        public Criteria andDelayDaysBetween(Integer value1, Integer value2) {
            addCriterion("delay_days between", value1, value2, "delayDays");
            return (Criteria) this;
        }

        public Criteria andDelayDaysNotBetween(Integer value1, Integer value2) {
            addCriterion("delay_days not between", value1, value2, "delayDays");
            return (Criteria) this;
        }

        public Criteria andLogistStatusIsNull() {
            addCriterion("logist_status is null");
            return (Criteria) this;
        }

        public Criteria andLogistStatusIsNotNull() {
            addCriterion("logist_status is not null");
            return (Criteria) this;
        }

        public Criteria andLogistStatusEqualTo(Integer value) {
            addCriterion("logist_status =", value, "logistStatus");
            return (Criteria) this;
        }

        public Criteria andLogistStatusNotEqualTo(Integer value) {
            addCriterion("logist_status <>", value, "logistStatus");
            return (Criteria) this;
        }

        public Criteria andLogistStatusGreaterThan(Integer value) {
            addCriterion("logist_status >", value, "logistStatus");
            return (Criteria) this;
        }

        public Criteria andLogistStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("logist_status >=", value, "logistStatus");
            return (Criteria) this;
        }

        public Criteria andLogistStatusLessThan(Integer value) {
            addCriterion("logist_status <", value, "logistStatus");
            return (Criteria) this;
        }

        public Criteria andLogistStatusLessThanOrEqualTo(Integer value) {
            addCriterion("logist_status <=", value, "logistStatus");
            return (Criteria) this;
        }

        public Criteria andLogistStatusIn(List<Integer> values) {
            addCriterion("logist_status in", values, "logistStatus");
            return (Criteria) this;
        }

        public Criteria andLogistStatusNotIn(List<Integer> values) {
            addCriterion("logist_status not in", values, "logistStatus");
            return (Criteria) this;
        }

        public Criteria andLogistStatusBetween(Integer value1, Integer value2) {
            addCriterion("logist_status between", value1, value2, "logistStatus");
            return (Criteria) this;
        }

        public Criteria andLogistStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("logist_status not between", value1, value2, "logistStatus");
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

        public Criteria andLogistMoneyIsNull() {
            addCriterion("logist_money is null");
            return (Criteria) this;
        }

        public Criteria andLogistMoneyIsNotNull() {
            addCriterion("logist_money is not null");
            return (Criteria) this;
        }

        public Criteria andLogistMoneyEqualTo(BigDecimal value) {
            addCriterion("logist_money =", value, "logistMoney");
            return (Criteria) this;
        }

        public Criteria andLogistMoneyNotEqualTo(BigDecimal value) {
            addCriterion("logist_money <>", value, "logistMoney");
            return (Criteria) this;
        }

        public Criteria andLogistMoneyGreaterThan(BigDecimal value) {
            addCriterion("logist_money >", value, "logistMoney");
            return (Criteria) this;
        }

        public Criteria andLogistMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("logist_money >=", value, "logistMoney");
            return (Criteria) this;
        }

        public Criteria andLogistMoneyLessThan(BigDecimal value) {
            addCriterion("logist_money <", value, "logistMoney");
            return (Criteria) this;
        }

        public Criteria andLogistMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("logist_money <=", value, "logistMoney");
            return (Criteria) this;
        }

        public Criteria andLogistMoneyIn(List<BigDecimal> values) {
            addCriterion("logist_money in", values, "logistMoney");
            return (Criteria) this;
        }

        public Criteria andLogistMoneyNotIn(List<BigDecimal> values) {
            addCriterion("logist_money not in", values, "logistMoney");
            return (Criteria) this;
        }

        public Criteria andLogistMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("logist_money between", value1, value2, "logistMoney");
            return (Criteria) this;
        }

        public Criteria andLogistMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("logist_money not between", value1, value2, "logistMoney");
            return (Criteria) this;
        }

        public Criteria andPackingCostIsNull() {
            addCriterion("packing_cost is null");
            return (Criteria) this;
        }

        public Criteria andPackingCostIsNotNull() {
            addCriterion("packing_cost is not null");
            return (Criteria) this;
        }

        public Criteria andPackingCostEqualTo(BigDecimal value) {
            addCriterion("packing_cost =", value, "packingCost");
            return (Criteria) this;
        }

        public Criteria andPackingCostNotEqualTo(BigDecimal value) {
            addCriterion("packing_cost <>", value, "packingCost");
            return (Criteria) this;
        }

        public Criteria andPackingCostGreaterThan(BigDecimal value) {
            addCriterion("packing_cost >", value, "packingCost");
            return (Criteria) this;
        }

        public Criteria andPackingCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("packing_cost >=", value, "packingCost");
            return (Criteria) this;
        }

        public Criteria andPackingCostLessThan(BigDecimal value) {
            addCriterion("packing_cost <", value, "packingCost");
            return (Criteria) this;
        }

        public Criteria andPackingCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("packing_cost <=", value, "packingCost");
            return (Criteria) this;
        }

        public Criteria andPackingCostIn(List<BigDecimal> values) {
            addCriterion("packing_cost in", values, "packingCost");
            return (Criteria) this;
        }

        public Criteria andPackingCostNotIn(List<BigDecimal> values) {
            addCriterion("packing_cost not in", values, "packingCost");
            return (Criteria) this;
        }

        public Criteria andPackingCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("packing_cost between", value1, value2, "packingCost");
            return (Criteria) this;
        }

        public Criteria andPackingCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("packing_cost not between", value1, value2, "packingCost");
            return (Criteria) this;
        }

        public Criteria andReturnGoodsCodeIsNull() {
            addCriterion("return_goods_code is null");
            return (Criteria) this;
        }

        public Criteria andReturnGoodsCodeIsNotNull() {
            addCriterion("return_goods_code is not null");
            return (Criteria) this;
        }

        public Criteria andReturnGoodsCodeEqualTo(String value) {
            addCriterion("return_goods_code =", value, "returnGoodsCode");
            return (Criteria) this;
        }

        public Criteria andReturnGoodsCodeNotEqualTo(String value) {
            addCriterion("return_goods_code <>", value, "returnGoodsCode");
            return (Criteria) this;
        }

        public Criteria andReturnGoodsCodeGreaterThan(String value) {
            addCriterion("return_goods_code >", value, "returnGoodsCode");
            return (Criteria) this;
        }

        public Criteria andReturnGoodsCodeGreaterThanOrEqualTo(String value) {
            addCriterion("return_goods_code >=", value, "returnGoodsCode");
            return (Criteria) this;
        }

        public Criteria andReturnGoodsCodeLessThan(String value) {
            addCriterion("return_goods_code <", value, "returnGoodsCode");
            return (Criteria) this;
        }

        public Criteria andReturnGoodsCodeLessThanOrEqualTo(String value) {
            addCriterion("return_goods_code <=", value, "returnGoodsCode");
            return (Criteria) this;
        }

        public Criteria andReturnGoodsCodeLike(String value) {
            addCriterion("return_goods_code like", value, "returnGoodsCode");
            return (Criteria) this;
        }

        public Criteria andReturnGoodsCodeNotLike(String value) {
            addCriterion("return_goods_code not like", value, "returnGoodsCode");
            return (Criteria) this;
        }

        public Criteria andReturnGoodsCodeIn(List<String> values) {
            addCriterion("return_goods_code in", values, "returnGoodsCode");
            return (Criteria) this;
        }

        public Criteria andReturnGoodsCodeNotIn(List<String> values) {
            addCriterion("return_goods_code not in", values, "returnGoodsCode");
            return (Criteria) this;
        }

        public Criteria andReturnGoodsCodeBetween(String value1, String value2) {
            addCriterion("return_goods_code between", value1, value2, "returnGoodsCode");
            return (Criteria) this;
        }

        public Criteria andReturnGoodsCodeNotBetween(String value1, String value2) {
            addCriterion("return_goods_code not between", value1, value2, "returnGoodsCode");
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
     * stock_out_bill_main
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * stock_out_bill_main 2018-05-17
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

        private static String allFields = "id,stockout_bill_main_code,order_sale_code,shipment_id,warehouse_id,bill_type,stockout_date,audit_date,audit_person_id,auditor,stockout_time,quantity,remark,stockout_status,customer_name,country_id,country_code,country_name,address1,delay_days,logist_status,logist_company_name,track_number,logist_money,packing_cost,return_goods_code,bill_date,creator,create_time,modifier,modify_time";

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

        public SelectiveField stockoutBillMainCode() {
            fields.add("stockout_bill_main_code");
            return this;
        }

        public SelectiveField orderSaleCode() {
            fields.add("order_sale_code");
            return this;
        }

        public SelectiveField shipmentId() {
            fields.add("shipment_id");
            return this;
        }

        public SelectiveField warehouseId() {
            fields.add("warehouse_id");
            return this;
        }

        public SelectiveField billType() {
            fields.add("bill_type");
            return this;
        }

        public SelectiveField stockoutDate() {
            fields.add("stockout_date");
            return this;
        }

        public SelectiveField auditDate() {
            fields.add("audit_date");
            return this;
        }

        public SelectiveField auditPersonId() {
            fields.add("audit_person_id");
            return this;
        }

        public SelectiveField auditor() {
            fields.add("auditor");
            return this;
        }

        public SelectiveField stockoutTime() {
            fields.add("stockout_time");
            return this;
        }

        public SelectiveField quantity() {
            fields.add("quantity");
            return this;
        }

        public SelectiveField remark() {
            fields.add("remark");
            return this;
        }

        public SelectiveField stockoutStatus() {
            fields.add("stockout_status");
            return this;
        }

        public SelectiveField customerName() {
            fields.add("customer_name");
            return this;
        }

        public SelectiveField countryId() {
            fields.add("country_id");
            return this;
        }

        public SelectiveField countryCode() {
            fields.add("country_code");
            return this;
        }

        public SelectiveField countryName() {
            fields.add("country_name");
            return this;
        }

        public SelectiveField address1() {
            fields.add("address1");
            return this;
        }

        public SelectiveField delayDays() {
            fields.add("delay_days");
            return this;
        }

        public SelectiveField logistStatus() {
            fields.add("logist_status");
            return this;
        }

        public SelectiveField logistCompanyName() {
            fields.add("logist_company_name");
            return this;
        }

        public SelectiveField trackNumber() {
            fields.add("track_number");
            return this;
        }

        public SelectiveField logistMoney() {
            fields.add("logist_money");
            return this;
        }

        public SelectiveField packingCost() {
            fields.add("packing_cost");
            return this;
        }

        public SelectiveField returnGoodsCode() {
            fields.add("return_goods_code");
            return this;
        }

        public SelectiveField billDate() {
            fields.add("bill_date");
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