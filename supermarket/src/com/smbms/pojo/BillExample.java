package com.smbms.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BillExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BillExample() {
        oredCriteria = new ArrayList<Criteria>();
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andBillCodeIsNull() {
            addCriterion("billCode is null");
            return (Criteria) this;
        }

        public Criteria andBillCodeIsNotNull() {
            addCriterion("billCode is not null");
            return (Criteria) this;
        }

        public Criteria andBillCodeEqualTo(String value) {
            addCriterion("billCode =", value, "billCode");
            return (Criteria) this;
        }

        public Criteria andBillCodeNotEqualTo(String value) {
            addCriterion("billCode <>", value, "billCode");
            return (Criteria) this;
        }

        public Criteria andBillCodeGreaterThan(String value) {
            addCriterion("billCode >", value, "billCode");
            return (Criteria) this;
        }

        public Criteria andBillCodeGreaterThanOrEqualTo(String value) {
            addCriterion("billCode >=", value, "billCode");
            return (Criteria) this;
        }

        public Criteria andBillCodeLessThan(String value) {
            addCriterion("billCode <", value, "billCode");
            return (Criteria) this;
        }

        public Criteria andBillCodeLessThanOrEqualTo(String value) {
            addCriterion("billCode <=", value, "billCode");
            return (Criteria) this;
        }

        public Criteria andBillCodeLike(String value) {
            addCriterion("billCode like", value, "billCode");
            return (Criteria) this;
        }

        public Criteria andBillCodeNotLike(String value) {
            addCriterion("billCode not like", value, "billCode");
            return (Criteria) this;
        }

        public Criteria andBillCodeIn(List<String> values) {
            addCriterion("billCode in", values, "billCode");
            return (Criteria) this;
        }

        public Criteria andBillCodeNotIn(List<String> values) {
            addCriterion("billCode not in", values, "billCode");
            return (Criteria) this;
        }

        public Criteria andBillCodeBetween(String value1, String value2) {
            addCriterion("billCode between", value1, value2, "billCode");
            return (Criteria) this;
        }

        public Criteria andBillCodeNotBetween(String value1, String value2) {
            addCriterion("billCode not between", value1, value2, "billCode");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNull() {
            addCriterion("productName is null");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNotNull() {
            addCriterion("productName is not null");
            return (Criteria) this;
        }

        public Criteria andProductNameEqualTo(String value) {
            addCriterion("productName =", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotEqualTo(String value) {
            addCriterion("productName <>", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThan(String value) {
            addCriterion("productName >", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThanOrEqualTo(String value) {
            addCriterion("productName >=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThan(String value) {
            addCriterion("productName <", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThanOrEqualTo(String value) {
            addCriterion("productName <=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLike(String value) {
            addCriterion("productName like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotLike(String value) {
            addCriterion("productName not like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameIn(List<String> values) {
            addCriterion("productName in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotIn(List<String> values) {
            addCriterion("productName not in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameBetween(String value1, String value2) {
            addCriterion("productName between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotBetween(String value1, String value2) {
            addCriterion("productName not between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andProductInsuranceIsNull() {
            addCriterion("productInsurance is null");
            return (Criteria) this;
        }

        public Criteria andProductInsuranceIsNotNull() {
            addCriterion("productInsurance is not null");
            return (Criteria) this;
        }

        public Criteria andProductInsuranceEqualTo(Integer value) {
            addCriterion("productInsurance =", value, "productInsurance");
            return (Criteria) this;
        }

        public Criteria andProductInsuranceNotEqualTo(Integer value) {
            addCriterion("productInsurance <>", value, "productInsurance");
            return (Criteria) this;
        }

        public Criteria andProductInsuranceGreaterThan(Integer value) {
            addCriterion("productInsurance >", value, "productInsurance");
            return (Criteria) this;
        }

        public Criteria andProductInsuranceGreaterThanOrEqualTo(Integer value) {
            addCriterion("productInsurance >=", value, "productInsurance");
            return (Criteria) this;
        }

        public Criteria andProductInsuranceLessThan(Integer value) {
            addCriterion("productInsurance <", value, "productInsurance");
            return (Criteria) this;
        }

        public Criteria andProductInsuranceLessThanOrEqualTo(Integer value) {
            addCriterion("productInsurance <=", value, "productInsurance");
            return (Criteria) this;
        }

        public Criteria andProductInsuranceIn(List<Integer> values) {
            addCriterion("productInsurance in", values, "productInsurance");
            return (Criteria) this;
        }

        public Criteria andProductInsuranceNotIn(List<Integer> values) {
            addCriterion("productInsurance not in", values, "productInsurance");
            return (Criteria) this;
        }

        public Criteria andProductInsuranceBetween(Integer value1, Integer value2) {
            addCriterion("productInsurance between", value1, value2, "productInsurance");
            return (Criteria) this;
        }

        public Criteria andProductInsuranceNotBetween(Integer value1, Integer value2) {
            addCriterion("productInsurance not between", value1, value2, "productInsurance");
            return (Criteria) this;
        }

        public Criteria andProductDescIsNull() {
            addCriterion("productDesc is null");
            return (Criteria) this;
        }

        public Criteria andProductDescIsNotNull() {
            addCriterion("productDesc is not null");
            return (Criteria) this;
        }

        public Criteria andProductDescEqualTo(String value) {
            addCriterion("productDesc =", value, "productDesc");
            return (Criteria) this;
        }

        public Criteria andProductDescNotEqualTo(String value) {
            addCriterion("productDesc <>", value, "productDesc");
            return (Criteria) this;
        }

        public Criteria andProductDescGreaterThan(String value) {
            addCriterion("productDesc >", value, "productDesc");
            return (Criteria) this;
        }

        public Criteria andProductDescGreaterThanOrEqualTo(String value) {
            addCriterion("productDesc >=", value, "productDesc");
            return (Criteria) this;
        }

        public Criteria andProductDescLessThan(String value) {
            addCriterion("productDesc <", value, "productDesc");
            return (Criteria) this;
        }

        public Criteria andProductDescLessThanOrEqualTo(String value) {
            addCriterion("productDesc <=", value, "productDesc");
            return (Criteria) this;
        }

        public Criteria andProductDescLike(String value) {
            addCriterion("productDesc like", value, "productDesc");
            return (Criteria) this;
        }

        public Criteria andProductDescNotLike(String value) {
            addCriterion("productDesc not like", value, "productDesc");
            return (Criteria) this;
        }

        public Criteria andProductDescIn(List<String> values) {
            addCriterion("productDesc in", values, "productDesc");
            return (Criteria) this;
        }

        public Criteria andProductDescNotIn(List<String> values) {
            addCriterion("productDesc not in", values, "productDesc");
            return (Criteria) this;
        }

        public Criteria andProductDescBetween(String value1, String value2) {
            addCriterion("productDesc between", value1, value2, "productDesc");
            return (Criteria) this;
        }

        public Criteria andProductDescNotBetween(String value1, String value2) {
            addCriterion("productDesc not between", value1, value2, "productDesc");
            return (Criteria) this;
        }

        public Criteria andProductUnitIsNull() {
            addCriterion("productUnit is null");
            return (Criteria) this;
        }

        public Criteria andProductUnitIsNotNull() {
            addCriterion("productUnit is not null");
            return (Criteria) this;
        }

        public Criteria andProductUnitEqualTo(String value) {
            addCriterion("productUnit =", value, "productUnit");
            return (Criteria) this;
        }

        public Criteria andProductUnitNotEqualTo(String value) {
            addCriterion("productUnit <>", value, "productUnit");
            return (Criteria) this;
        }

        public Criteria andProductUnitGreaterThan(String value) {
            addCriterion("productUnit >", value, "productUnit");
            return (Criteria) this;
        }

        public Criteria andProductUnitGreaterThanOrEqualTo(String value) {
            addCriterion("productUnit >=", value, "productUnit");
            return (Criteria) this;
        }

        public Criteria andProductUnitLessThan(String value) {
            addCriterion("productUnit <", value, "productUnit");
            return (Criteria) this;
        }

        public Criteria andProductUnitLessThanOrEqualTo(String value) {
            addCriterion("productUnit <=", value, "productUnit");
            return (Criteria) this;
        }

        public Criteria andProductUnitLike(String value) {
            addCriterion("productUnit like", value, "productUnit");
            return (Criteria) this;
        }

        public Criteria andProductUnitNotLike(String value) {
            addCriterion("productUnit not like", value, "productUnit");
            return (Criteria) this;
        }

        public Criteria andProductUnitIn(List<String> values) {
            addCriterion("productUnit in", values, "productUnit");
            return (Criteria) this;
        }

        public Criteria andProductUnitNotIn(List<String> values) {
            addCriterion("productUnit not in", values, "productUnit");
            return (Criteria) this;
        }

        public Criteria andProductUnitBetween(String value1, String value2) {
            addCriterion("productUnit between", value1, value2, "productUnit");
            return (Criteria) this;
        }

        public Criteria andProductUnitNotBetween(String value1, String value2) {
            addCriterion("productUnit not between", value1, value2, "productUnit");
            return (Criteria) this;
        }

        public Criteria andProductCountIsNull() {
            addCriterion("productCount is null");
            return (Criteria) this;
        }

        public Criteria andProductCountIsNotNull() {
            addCriterion("productCount is not null");
            return (Criteria) this;
        }

        public Criteria andProductCountEqualTo(Integer value) {
            addCriterion("productCount =", value, "productCount");
            return (Criteria) this;
        }

        public Criteria andProductCountNotEqualTo(Integer value) {
            addCriterion("productCount <>", value, "productCount");
            return (Criteria) this;
        }

        public Criteria andProductCountGreaterThan(Integer value) {
            addCriterion("productCount >", value, "productCount");
            return (Criteria) this;
        }

        public Criteria andProductCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("productCount >=", value, "productCount");
            return (Criteria) this;
        }

        public Criteria andProductCountLessThan(Integer value) {
            addCriterion("productCount <", value, "productCount");
            return (Criteria) this;
        }

        public Criteria andProductCountLessThanOrEqualTo(Integer value) {
            addCriterion("productCount <=", value, "productCount");
            return (Criteria) this;
        }

        public Criteria andProductCountIn(List<Integer> values) {
            addCriterion("productCount in", values, "productCount");
            return (Criteria) this;
        }

        public Criteria andProductCountNotIn(List<Integer> values) {
            addCriterion("productCount not in", values, "productCount");
            return (Criteria) this;
        }

        public Criteria andProductCountBetween(Integer value1, Integer value2) {
            addCriterion("productCount between", value1, value2, "productCount");
            return (Criteria) this;
        }

        public Criteria andProductCountNotBetween(Integer value1, Integer value2) {
            addCriterion("productCount not between", value1, value2, "productCount");
            return (Criteria) this;
        }

        public Criteria andTotalPriceIsNull() {
            addCriterion("totalPrice is null");
            return (Criteria) this;
        }

        public Criteria andTotalPriceIsNotNull() {
            addCriterion("totalPrice is not null");
            return (Criteria) this;
        }

        public Criteria andTotalPriceEqualTo(Double value) {
            addCriterion("totalPrice =", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceNotEqualTo(Double value) {
            addCriterion("totalPrice <>", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceGreaterThan(Double value) {
            addCriterion("totalPrice >", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("totalPrice >=", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceLessThan(Double value) {
            addCriterion("totalPrice <", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceLessThanOrEqualTo(Double value) {
            addCriterion("totalPrice <=", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceIn(List<Double> values) {
            addCriterion("totalPrice in", values, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceNotIn(List<Double> values) {
            addCriterion("totalPrice not in", values, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceBetween(Double value1, Double value2) {
            addCriterion("totalPrice between", value1, value2, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceNotBetween(Double value1, Double value2) {
            addCriterion("totalPrice not between", value1, value2, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIsNull() {
            addCriterion("customerName is null");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIsNotNull() {
            addCriterion("customerName is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerNameEqualTo(String value) {
            addCriterion("customerName =", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotEqualTo(String value) {
            addCriterion("customerName <>", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameGreaterThan(String value) {
            addCriterion("customerName >", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameGreaterThanOrEqualTo(String value) {
            addCriterion("customerName >=", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLessThan(String value) {
            addCriterion("customerName <", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLessThanOrEqualTo(String value) {
            addCriterion("customerName <=", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLike(String value) {
            addCriterion("customerName like", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotLike(String value) {
            addCriterion("customerName not like", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIn(List<String> values) {
            addCriterion("customerName in", values, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotIn(List<String> values) {
            addCriterion("customerName not in", values, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameBetween(String value1, String value2) {
            addCriterion("customerName between", value1, value2, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotBetween(String value1, String value2) {
            addCriterion("customerName not between", value1, value2, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerAddressIsNull() {
            addCriterion("customerAddress is null");
            return (Criteria) this;
        }

        public Criteria andCustomerAddressIsNotNull() {
            addCriterion("customerAddress is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerAddressEqualTo(String value) {
            addCriterion("customerAddress =", value, "customerAddress");
            return (Criteria) this;
        }

        public Criteria andCustomerAddressNotEqualTo(String value) {
            addCriterion("customerAddress <>", value, "customerAddress");
            return (Criteria) this;
        }

        public Criteria andCustomerAddressGreaterThan(String value) {
            addCriterion("customerAddress >", value, "customerAddress");
            return (Criteria) this;
        }

        public Criteria andCustomerAddressGreaterThanOrEqualTo(String value) {
            addCriterion("customerAddress >=", value, "customerAddress");
            return (Criteria) this;
        }

        public Criteria andCustomerAddressLessThan(String value) {
            addCriterion("customerAddress <", value, "customerAddress");
            return (Criteria) this;
        }

        public Criteria andCustomerAddressLessThanOrEqualTo(String value) {
            addCriterion("customerAddress <=", value, "customerAddress");
            return (Criteria) this;
        }

        public Criteria andCustomerAddressLike(String value) {
            addCriterion("customerAddress like", value, "customerAddress");
            return (Criteria) this;
        }

        public Criteria andCustomerAddressNotLike(String value) {
            addCriterion("customerAddress not like", value, "customerAddress");
            return (Criteria) this;
        }

        public Criteria andCustomerAddressIn(List<String> values) {
            addCriterion("customerAddress in", values, "customerAddress");
            return (Criteria) this;
        }

        public Criteria andCustomerAddressNotIn(List<String> values) {
            addCriterion("customerAddress not in", values, "customerAddress");
            return (Criteria) this;
        }

        public Criteria andCustomerAddressBetween(String value1, String value2) {
            addCriterion("customerAddress between", value1, value2, "customerAddress");
            return (Criteria) this;
        }

        public Criteria andCustomerAddressNotBetween(String value1, String value2) {
            addCriterion("customerAddress not between", value1, value2, "customerAddress");
            return (Criteria) this;
        }

        public Criteria andCustomerTelIsNull() {
            addCriterion("customerTel is null");
            return (Criteria) this;
        }

        public Criteria andCustomerTelIsNotNull() {
            addCriterion("customerTel is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerTelEqualTo(String value) {
            addCriterion("customerTel =", value, "customerTel");
            return (Criteria) this;
        }

        public Criteria andCustomerTelNotEqualTo(String value) {
            addCriterion("customerTel <>", value, "customerTel");
            return (Criteria) this;
        }

        public Criteria andCustomerTelGreaterThan(String value) {
            addCriterion("customerTel >", value, "customerTel");
            return (Criteria) this;
        }

        public Criteria andCustomerTelGreaterThanOrEqualTo(String value) {
            addCriterion("customerTel >=", value, "customerTel");
            return (Criteria) this;
        }

        public Criteria andCustomerTelLessThan(String value) {
            addCriterion("customerTel <", value, "customerTel");
            return (Criteria) this;
        }

        public Criteria andCustomerTelLessThanOrEqualTo(String value) {
            addCriterion("customerTel <=", value, "customerTel");
            return (Criteria) this;
        }

        public Criteria andCustomerTelLike(String value) {
            addCriterion("customerTel like", value, "customerTel");
            return (Criteria) this;
        }

        public Criteria andCustomerTelNotLike(String value) {
            addCriterion("customerTel not like", value, "customerTel");
            return (Criteria) this;
        }

        public Criteria andCustomerTelIn(List<String> values) {
            addCriterion("customerTel in", values, "customerTel");
            return (Criteria) this;
        }

        public Criteria andCustomerTelNotIn(List<String> values) {
            addCriterion("customerTel not in", values, "customerTel");
            return (Criteria) this;
        }

        public Criteria andCustomerTelBetween(String value1, String value2) {
            addCriterion("customerTel between", value1, value2, "customerTel");
            return (Criteria) this;
        }

        public Criteria andCustomerTelNotBetween(String value1, String value2) {
            addCriterion("customerTel not between", value1, value2, "customerTel");
            return (Criteria) this;
        }

        public Criteria andDockPeopleIsNull() {
            addCriterion("dockPeople is null");
            return (Criteria) this;
        }

        public Criteria andDockPeopleIsNotNull() {
            addCriterion("dockPeople is not null");
            return (Criteria) this;
        }

        public Criteria andDockPeopleEqualTo(String value) {
            addCriterion("dockPeople =", value, "dockPeople");
            return (Criteria) this;
        }

        public Criteria andDockPeopleNotEqualTo(String value) {
            addCriterion("dockPeople <>", value, "dockPeople");
            return (Criteria) this;
        }

        public Criteria andDockPeopleGreaterThan(String value) {
            addCriterion("dockPeople >", value, "dockPeople");
            return (Criteria) this;
        }

        public Criteria andDockPeopleGreaterThanOrEqualTo(String value) {
            addCriterion("dockPeople >=", value, "dockPeople");
            return (Criteria) this;
        }

        public Criteria andDockPeopleLessThan(String value) {
            addCriterion("dockPeople <", value, "dockPeople");
            return (Criteria) this;
        }

        public Criteria andDockPeopleLessThanOrEqualTo(String value) {
            addCriterion("dockPeople <=", value, "dockPeople");
            return (Criteria) this;
        }

        public Criteria andDockPeopleLike(String value) {
            addCriterion("dockPeople like", value, "dockPeople");
            return (Criteria) this;
        }

        public Criteria andDockPeopleNotLike(String value) {
            addCriterion("dockPeople not like", value, "dockPeople");
            return (Criteria) this;
        }

        public Criteria andDockPeopleIn(List<String> values) {
            addCriterion("dockPeople in", values, "dockPeople");
            return (Criteria) this;
        }

        public Criteria andDockPeopleNotIn(List<String> values) {
            addCriterion("dockPeople not in", values, "dockPeople");
            return (Criteria) this;
        }

        public Criteria andDockPeopleBetween(String value1, String value2) {
            addCriterion("dockPeople between", value1, value2, "dockPeople");
            return (Criteria) this;
        }

        public Criteria andDockPeopleNotBetween(String value1, String value2) {
            addCriterion("dockPeople not between", value1, value2, "dockPeople");
            return (Criteria) this;
        }

        public Criteria andSaleDockIsNull() {
            addCriterion("saleDock is null");
            return (Criteria) this;
        }

        public Criteria andSaleDockIsNotNull() {
            addCriterion("saleDock is not null");
            return (Criteria) this;
        }

        public Criteria andSaleDockEqualTo(String value) {
            addCriterion("saleDock =", value, "saleDock");
            return (Criteria) this;
        }

        public Criteria andSaleDockNotEqualTo(String value) {
            addCriterion("saleDock <>", value, "saleDock");
            return (Criteria) this;
        }

        public Criteria andSaleDockGreaterThan(String value) {
            addCriterion("saleDock >", value, "saleDock");
            return (Criteria) this;
        }

        public Criteria andSaleDockGreaterThanOrEqualTo(String value) {
            addCriterion("saleDock >=", value, "saleDock");
            return (Criteria) this;
        }

        public Criteria andSaleDockLessThan(String value) {
            addCriterion("saleDock <", value, "saleDock");
            return (Criteria) this;
        }

        public Criteria andSaleDockLessThanOrEqualTo(String value) {
            addCriterion("saleDock <=", value, "saleDock");
            return (Criteria) this;
        }

        public Criteria andSaleDockLike(String value) {
            addCriterion("saleDock like", value, "saleDock");
            return (Criteria) this;
        }

        public Criteria andSaleDockNotLike(String value) {
            addCriterion("saleDock not like", value, "saleDock");
            return (Criteria) this;
        }

        public Criteria andSaleDockIn(List<String> values) {
            addCriterion("saleDock in", values, "saleDock");
            return (Criteria) this;
        }

        public Criteria andSaleDockNotIn(List<String> values) {
            addCriterion("saleDock not in", values, "saleDock");
            return (Criteria) this;
        }

        public Criteria andSaleDockBetween(String value1, String value2) {
            addCriterion("saleDock between", value1, value2, "saleDock");
            return (Criteria) this;
        }

        public Criteria andSaleDockNotBetween(String value1, String value2) {
            addCriterion("saleDock not between", value1, value2, "saleDock");
            return (Criteria) this;
        }

        public Criteria andPayWayIsNull() {
            addCriterion("payWay is null");
            return (Criteria) this;
        }

        public Criteria andPayWayIsNotNull() {
            addCriterion("payWay is not null");
            return (Criteria) this;
        }

        public Criteria andPayWayEqualTo(Integer value) {
            addCriterion("payWay =", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayNotEqualTo(Integer value) {
            addCriterion("payWay <>", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayGreaterThan(Integer value) {
            addCriterion("payWay >", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayGreaterThanOrEqualTo(Integer value) {
            addCriterion("payWay >=", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayLessThan(Integer value) {
            addCriterion("payWay <", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayLessThanOrEqualTo(Integer value) {
            addCriterion("payWay <=", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayIn(List<Integer> values) {
            addCriterion("payWay in", values, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayNotIn(List<Integer> values) {
            addCriterion("payWay not in", values, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayBetween(Integer value1, Integer value2) {
            addCriterion("payWay between", value1, value2, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayNotBetween(Integer value1, Integer value2) {
            addCriterion("payWay not between", value1, value2, "payWay");
            return (Criteria) this;
        }

        public Criteria andTransactionNumIsNull() {
            addCriterion("transactionNum is null");
            return (Criteria) this;
        }

        public Criteria andTransactionNumIsNotNull() {
            addCriterion("transactionNum is not null");
            return (Criteria) this;
        }

        public Criteria andTransactionNumEqualTo(Long value) {
            addCriterion("transactionNum =", value, "transactionNum");
            return (Criteria) this;
        }

        public Criteria andTransactionNumNotEqualTo(Long value) {
            addCriterion("transactionNum <>", value, "transactionNum");
            return (Criteria) this;
        }

        public Criteria andTransactionNumGreaterThan(Long value) {
            addCriterion("transactionNum >", value, "transactionNum");
            return (Criteria) this;
        }

        public Criteria andTransactionNumGreaterThanOrEqualTo(Long value) {
            addCriterion("transactionNum >=", value, "transactionNum");
            return (Criteria) this;
        }

        public Criteria andTransactionNumLessThan(Long value) {
            addCriterion("transactionNum <", value, "transactionNum");
            return (Criteria) this;
        }

        public Criteria andTransactionNumLessThanOrEqualTo(Long value) {
            addCriterion("transactionNum <=", value, "transactionNum");
            return (Criteria) this;
        }

        public Criteria andTransactionNumIn(List<Long> values) {
            addCriterion("transactionNum in", values, "transactionNum");
            return (Criteria) this;
        }

        public Criteria andTransactionNumNotIn(List<Long> values) {
            addCriterion("transactionNum not in", values, "transactionNum");
            return (Criteria) this;
        }

        public Criteria andTransactionNumBetween(Long value1, Long value2) {
            addCriterion("transactionNum between", value1, value2, "transactionNum");
            return (Criteria) this;
        }

        public Criteria andTransactionNumNotBetween(Long value1, Long value2) {
            addCriterion("transactionNum not between", value1, value2, "transactionNum");
            return (Criteria) this;
        }

        public Criteria andPayNumIsNull() {
            addCriterion("payNum is null");
            return (Criteria) this;
        }

        public Criteria andPayNumIsNotNull() {
            addCriterion("payNum is not null");
            return (Criteria) this;
        }

        public Criteria andPayNumEqualTo(Long value) {
            addCriterion("payNum =", value, "payNum");
            return (Criteria) this;
        }

        public Criteria andPayNumNotEqualTo(Long value) {
            addCriterion("payNum <>", value, "payNum");
            return (Criteria) this;
        }

        public Criteria andPayNumGreaterThan(Long value) {
            addCriterion("payNum >", value, "payNum");
            return (Criteria) this;
        }

        public Criteria andPayNumGreaterThanOrEqualTo(Long value) {
            addCriterion("payNum >=", value, "payNum");
            return (Criteria) this;
        }

        public Criteria andPayNumLessThan(Long value) {
            addCriterion("payNum <", value, "payNum");
            return (Criteria) this;
        }

        public Criteria andPayNumLessThanOrEqualTo(Long value) {
            addCriterion("payNum <=", value, "payNum");
            return (Criteria) this;
        }

        public Criteria andPayNumIn(List<Long> values) {
            addCriterion("payNum in", values, "payNum");
            return (Criteria) this;
        }

        public Criteria andPayNumNotIn(List<Long> values) {
            addCriterion("payNum not in", values, "payNum");
            return (Criteria) this;
        }

        public Criteria andPayNumBetween(Long value1, Long value2) {
            addCriterion("payNum between", value1, value2, "payNum");
            return (Criteria) this;
        }

        public Criteria andPayNumNotBetween(Long value1, Long value2) {
            addCriterion("payNum not between", value1, value2, "payNum");
            return (Criteria) this;
        }

        public Criteria andIsFreeShipIsNull() {
            addCriterion("isFreeShip is null");
            return (Criteria) this;
        }

        public Criteria andIsFreeShipIsNotNull() {
            addCriterion("isFreeShip is not null");
            return (Criteria) this;
        }

        public Criteria andIsFreeShipEqualTo(Integer value) {
            addCriterion("isFreeShip =", value, "isFreeShip");
            return (Criteria) this;
        }

        public Criteria andIsFreeShipNotEqualTo(Integer value) {
            addCriterion("isFreeShip <>", value, "isFreeShip");
            return (Criteria) this;
        }

        public Criteria andIsFreeShipGreaterThan(Integer value) {
            addCriterion("isFreeShip >", value, "isFreeShip");
            return (Criteria) this;
        }

        public Criteria andIsFreeShipGreaterThanOrEqualTo(Integer value) {
            addCriterion("isFreeShip >=", value, "isFreeShip");
            return (Criteria) this;
        }

        public Criteria andIsFreeShipLessThan(Integer value) {
            addCriterion("isFreeShip <", value, "isFreeShip");
            return (Criteria) this;
        }

        public Criteria andIsFreeShipLessThanOrEqualTo(Integer value) {
            addCriterion("isFreeShip <=", value, "isFreeShip");
            return (Criteria) this;
        }

        public Criteria andIsFreeShipIn(List<Integer> values) {
            addCriterion("isFreeShip in", values, "isFreeShip");
            return (Criteria) this;
        }

        public Criteria andIsFreeShipNotIn(List<Integer> values) {
            addCriterion("isFreeShip not in", values, "isFreeShip");
            return (Criteria) this;
        }

        public Criteria andIsFreeShipBetween(Integer value1, Integer value2) {
            addCriterion("isFreeShip between", value1, value2, "isFreeShip");
            return (Criteria) this;
        }

        public Criteria andIsFreeShipNotBetween(Integer value1, Integer value2) {
            addCriterion("isFreeShip not between", value1, value2, "isFreeShip");
            return (Criteria) this;
        }

        public Criteria andMyFreightIsNull() {
            addCriterion("myFreight is null");
            return (Criteria) this;
        }

        public Criteria andMyFreightIsNotNull() {
            addCriterion("myFreight is not null");
            return (Criteria) this;
        }

        public Criteria andMyFreightEqualTo(String value) {
            addCriterion("myFreight =", value, "myFreight");
            return (Criteria) this;
        }

        public Criteria andMyFreightNotEqualTo(String value) {
            addCriterion("myFreight <>", value, "myFreight");
            return (Criteria) this;
        }

        public Criteria andMyFreightGreaterThan(String value) {
            addCriterion("myFreight >", value, "myFreight");
            return (Criteria) this;
        }

        public Criteria andMyFreightGreaterThanOrEqualTo(String value) {
            addCriterion("myFreight >=", value, "myFreight");
            return (Criteria) this;
        }

        public Criteria andMyFreightLessThan(String value) {
            addCriterion("myFreight <", value, "myFreight");
            return (Criteria) this;
        }

        public Criteria andMyFreightLessThanOrEqualTo(String value) {
            addCriterion("myFreight <=", value, "myFreight");
            return (Criteria) this;
        }

        public Criteria andMyFreightLike(String value) {
            addCriterion("myFreight like", value, "myFreight");
            return (Criteria) this;
        }

        public Criteria andMyFreightNotLike(String value) {
            addCriterion("myFreight not like", value, "myFreight");
            return (Criteria) this;
        }

        public Criteria andMyFreightIn(List<String> values) {
            addCriterion("myFreight in", values, "myFreight");
            return (Criteria) this;
        }

        public Criteria andMyFreightNotIn(List<String> values) {
            addCriterion("myFreight not in", values, "myFreight");
            return (Criteria) this;
        }

        public Criteria andMyFreightBetween(String value1, String value2) {
            addCriterion("myFreight between", value1, value2, "myFreight");
            return (Criteria) this;
        }

        public Criteria andMyFreightNotBetween(String value1, String value2) {
            addCriterion("myFreight not between", value1, value2, "myFreight");
            return (Criteria) this;
        }

        public Criteria andSeliverStatusIsNull() {
            addCriterion("seliverStatus is null");
            return (Criteria) this;
        }

        public Criteria andSeliverStatusIsNotNull() {
            addCriterion("seliverStatus is not null");
            return (Criteria) this;
        }

        public Criteria andSeliverStatusEqualTo(Integer value) {
            addCriterion("seliverStatus =", value, "seliverStatus");
            return (Criteria) this;
        }

        public Criteria andSeliverStatusNotEqualTo(Integer value) {
            addCriterion("seliverStatus <>", value, "seliverStatus");
            return (Criteria) this;
        }

        public Criteria andSeliverStatusGreaterThan(Integer value) {
            addCriterion("seliverStatus >", value, "seliverStatus");
            return (Criteria) this;
        }

        public Criteria andSeliverStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("seliverStatus >=", value, "seliverStatus");
            return (Criteria) this;
        }

        public Criteria andSeliverStatusLessThan(Integer value) {
            addCriterion("seliverStatus <", value, "seliverStatus");
            return (Criteria) this;
        }

        public Criteria andSeliverStatusLessThanOrEqualTo(Integer value) {
            addCriterion("seliverStatus <=", value, "seliverStatus");
            return (Criteria) this;
        }

        public Criteria andSeliverStatusIn(List<Integer> values) {
            addCriterion("seliverStatus in", values, "seliverStatus");
            return (Criteria) this;
        }

        public Criteria andSeliverStatusNotIn(List<Integer> values) {
            addCriterion("seliverStatus not in", values, "seliverStatus");
            return (Criteria) this;
        }

        public Criteria andSeliverStatusBetween(Integer value1, Integer value2) {
            addCriterion("seliverStatus between", value1, value2, "seliverStatus");
            return (Criteria) this;
        }

        public Criteria andSeliverStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("seliverStatus not between", value1, value2, "seliverStatus");
            return (Criteria) this;
        }

        public Criteria andIsPaymentIsNull() {
            addCriterion("isPayment is null");
            return (Criteria) this;
        }

        public Criteria andIsPaymentIsNotNull() {
            addCriterion("isPayment is not null");
            return (Criteria) this;
        }

        public Criteria andIsPaymentEqualTo(Integer value) {
            addCriterion("isPayment =", value, "isPayment");
            return (Criteria) this;
        }

        public Criteria andIsPaymentNotEqualTo(Integer value) {
            addCriterion("isPayment <>", value, "isPayment");
            return (Criteria) this;
        }

        public Criteria andIsPaymentGreaterThan(Integer value) {
            addCriterion("isPayment >", value, "isPayment");
            return (Criteria) this;
        }

        public Criteria andIsPaymentGreaterThanOrEqualTo(Integer value) {
            addCriterion("isPayment >=", value, "isPayment");
            return (Criteria) this;
        }

        public Criteria andIsPaymentLessThan(Integer value) {
            addCriterion("isPayment <", value, "isPayment");
            return (Criteria) this;
        }

        public Criteria andIsPaymentLessThanOrEqualTo(Integer value) {
            addCriterion("isPayment <=", value, "isPayment");
            return (Criteria) this;
        }

        public Criteria andIsPaymentIn(List<Integer> values) {
            addCriterion("isPayment in", values, "isPayment");
            return (Criteria) this;
        }

        public Criteria andIsPaymentNotIn(List<Integer> values) {
            addCriterion("isPayment not in", values, "isPayment");
            return (Criteria) this;
        }

        public Criteria andIsPaymentBetween(Integer value1, Integer value2) {
            addCriterion("isPayment between", value1, value2, "isPayment");
            return (Criteria) this;
        }

        public Criteria andIsPaymentNotBetween(Integer value1, Integer value2) {
            addCriterion("isPayment not between", value1, value2, "isPayment");
            return (Criteria) this;
        }

        public Criteria andWaybillIsNull() {
            addCriterion("waybill is null");
            return (Criteria) this;
        }

        public Criteria andWaybillIsNotNull() {
            addCriterion("waybill is not null");
            return (Criteria) this;
        }

        public Criteria andWaybillEqualTo(String value) {
            addCriterion("waybill =", value, "waybill");
            return (Criteria) this;
        }

        public Criteria andWaybillNotEqualTo(String value) {
            addCriterion("waybill <>", value, "waybill");
            return (Criteria) this;
        }

        public Criteria andWaybillGreaterThan(String value) {
            addCriterion("waybill >", value, "waybill");
            return (Criteria) this;
        }

        public Criteria andWaybillGreaterThanOrEqualTo(String value) {
            addCriterion("waybill >=", value, "waybill");
            return (Criteria) this;
        }

        public Criteria andWaybillLessThan(String value) {
            addCriterion("waybill <", value, "waybill");
            return (Criteria) this;
        }

        public Criteria andWaybillLessThanOrEqualTo(String value) {
            addCriterion("waybill <=", value, "waybill");
            return (Criteria) this;
        }

        public Criteria andWaybillLike(String value) {
            addCriterion("waybill like", value, "waybill");
            return (Criteria) this;
        }

        public Criteria andWaybillNotLike(String value) {
            addCriterion("waybill not like", value, "waybill");
            return (Criteria) this;
        }

        public Criteria andWaybillIn(List<String> values) {
            addCriterion("waybill in", values, "waybill");
            return (Criteria) this;
        }

        public Criteria andWaybillNotIn(List<String> values) {
            addCriterion("waybill not in", values, "waybill");
            return (Criteria) this;
        }

        public Criteria andWaybillBetween(String value1, String value2) {
            addCriterion("waybill between", value1, value2, "waybill");
            return (Criteria) this;
        }

        public Criteria andWaybillNotBetween(String value1, String value2) {
            addCriterion("waybill not between", value1, value2, "waybill");
            return (Criteria) this;
        }

        public Criteria andSeliverDateIsNull() {
            addCriterion("seliverDate is null");
            return (Criteria) this;
        }

        public Criteria andSeliverDateIsNotNull() {
            addCriterion("seliverDate is not null");
            return (Criteria) this;
        }

        public Criteria andSeliverDateEqualTo(Date value) {
            addCriterion("seliverDate =", value, "seliverDate");
            return (Criteria) this;
        }

        public Criteria andSeliverDateNotEqualTo(Date value) {
            addCriterion("seliverDate <>", value, "seliverDate");
            return (Criteria) this;
        }

        public Criteria andSeliverDateGreaterThan(Date value) {
            addCriterion("seliverDate >", value, "seliverDate");
            return (Criteria) this;
        }

        public Criteria andSeliverDateGreaterThanOrEqualTo(Date value) {
            addCriterion("seliverDate >=", value, "seliverDate");
            return (Criteria) this;
        }

        public Criteria andSeliverDateLessThan(Date value) {
            addCriterion("seliverDate <", value, "seliverDate");
            return (Criteria) this;
        }

        public Criteria andSeliverDateLessThanOrEqualTo(Date value) {
            addCriterion("seliverDate <=", value, "seliverDate");
            return (Criteria) this;
        }

        public Criteria andSeliverDateIn(List<Date> values) {
            addCriterion("seliverDate in", values, "seliverDate");
            return (Criteria) this;
        }

        public Criteria andSeliverDateNotIn(List<Date> values) {
            addCriterion("seliverDate not in", values, "seliverDate");
            return (Criteria) this;
        }

        public Criteria andSeliverDateBetween(Date value1, Date value2) {
            addCriterion("seliverDate between", value1, value2, "seliverDate");
            return (Criteria) this;
        }

        public Criteria andSeliverDateNotBetween(Date value1, Date value2) {
            addCriterion("seliverDate not between", value1, value2, "seliverDate");
            return (Criteria) this;
        }

        public Criteria andIsPayCheckIsNull() {
            addCriterion("isPayCheck is null");
            return (Criteria) this;
        }

        public Criteria andIsPayCheckIsNotNull() {
            addCriterion("isPayCheck is not null");
            return (Criteria) this;
        }

        public Criteria andIsPayCheckEqualTo(Integer value) {
            addCriterion("isPayCheck =", value, "isPayCheck");
            return (Criteria) this;
        }

        public Criteria andIsPayCheckNotEqualTo(Integer value) {
            addCriterion("isPayCheck <>", value, "isPayCheck");
            return (Criteria) this;
        }

        public Criteria andIsPayCheckGreaterThan(Integer value) {
            addCriterion("isPayCheck >", value, "isPayCheck");
            return (Criteria) this;
        }

        public Criteria andIsPayCheckGreaterThanOrEqualTo(Integer value) {
            addCriterion("isPayCheck >=", value, "isPayCheck");
            return (Criteria) this;
        }

        public Criteria andIsPayCheckLessThan(Integer value) {
            addCriterion("isPayCheck <", value, "isPayCheck");
            return (Criteria) this;
        }

        public Criteria andIsPayCheckLessThanOrEqualTo(Integer value) {
            addCriterion("isPayCheck <=", value, "isPayCheck");
            return (Criteria) this;
        }

        public Criteria andIsPayCheckIn(List<Integer> values) {
            addCriterion("isPayCheck in", values, "isPayCheck");
            return (Criteria) this;
        }

        public Criteria andIsPayCheckNotIn(List<Integer> values) {
            addCriterion("isPayCheck not in", values, "isPayCheck");
            return (Criteria) this;
        }

        public Criteria andIsPayCheckBetween(Integer value1, Integer value2) {
            addCriterion("isPayCheck between", value1, value2, "isPayCheck");
            return (Criteria) this;
        }

        public Criteria andIsPayCheckNotBetween(Integer value1, Integer value2) {
            addCriterion("isPayCheck not between", value1, value2, "isPayCheck");
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

        public Criteria andCreatedByIsNull() {
            addCriterion("createdBy is null");
            return (Criteria) this;
        }

        public Criteria andCreatedByIsNotNull() {
            addCriterion("createdBy is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedByEqualTo(Long value) {
            addCriterion("createdBy =", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotEqualTo(Long value) {
            addCriterion("createdBy <>", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThan(Long value) {
            addCriterion("createdBy >", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThanOrEqualTo(Long value) {
            addCriterion("createdBy >=", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThan(Long value) {
            addCriterion("createdBy <", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThanOrEqualTo(Long value) {
            addCriterion("createdBy <=", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByIn(List<Long> values) {
            addCriterion("createdBy in", values, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotIn(List<Long> values) {
            addCriterion("createdBy not in", values, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByBetween(Long value1, Long value2) {
            addCriterion("createdBy between", value1, value2, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotBetween(Long value1, Long value2) {
            addCriterion("createdBy not between", value1, value2, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreationDateIsNull() {
            addCriterion("creationDate is null");
            return (Criteria) this;
        }

        public Criteria andCreationDateIsNotNull() {
            addCriterion("creationDate is not null");
            return (Criteria) this;
        }

        public Criteria andCreationDateEqualTo(Date value) {
            addCriterion("creationDate =", value, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateNotEqualTo(Date value) {
            addCriterion("creationDate <>", value, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateGreaterThan(Date value) {
            addCriterion("creationDate >", value, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateGreaterThanOrEqualTo(Date value) {
            addCriterion("creationDate >=", value, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateLessThan(Date value) {
            addCriterion("creationDate <", value, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateLessThanOrEqualTo(Date value) {
            addCriterion("creationDate <=", value, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateIn(List<Date> values) {
            addCriterion("creationDate in", values, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateNotIn(List<Date> values) {
            addCriterion("creationDate not in", values, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateBetween(Date value1, Date value2) {
            addCriterion("creationDate between", value1, value2, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateNotBetween(Date value1, Date value2) {
            addCriterion("creationDate not between", value1, value2, "creationDate");
            return (Criteria) this;
        }

        public Criteria andModifyByIsNull() {
            addCriterion("modifyBy is null");
            return (Criteria) this;
        }

        public Criteria andModifyByIsNotNull() {
            addCriterion("modifyBy is not null");
            return (Criteria) this;
        }

        public Criteria andModifyByEqualTo(Long value) {
            addCriterion("modifyBy =", value, "modifyBy");
            return (Criteria) this;
        }

        public Criteria andModifyByNotEqualTo(Long value) {
            addCriterion("modifyBy <>", value, "modifyBy");
            return (Criteria) this;
        }

        public Criteria andModifyByGreaterThan(Long value) {
            addCriterion("modifyBy >", value, "modifyBy");
            return (Criteria) this;
        }

        public Criteria andModifyByGreaterThanOrEqualTo(Long value) {
            addCriterion("modifyBy >=", value, "modifyBy");
            return (Criteria) this;
        }

        public Criteria andModifyByLessThan(Long value) {
            addCriterion("modifyBy <", value, "modifyBy");
            return (Criteria) this;
        }

        public Criteria andModifyByLessThanOrEqualTo(Long value) {
            addCriterion("modifyBy <=", value, "modifyBy");
            return (Criteria) this;
        }

        public Criteria andModifyByIn(List<Long> values) {
            addCriterion("modifyBy in", values, "modifyBy");
            return (Criteria) this;
        }

        public Criteria andModifyByNotIn(List<Long> values) {
            addCriterion("modifyBy not in", values, "modifyBy");
            return (Criteria) this;
        }

        public Criteria andModifyByBetween(Long value1, Long value2) {
            addCriterion("modifyBy between", value1, value2, "modifyBy");
            return (Criteria) this;
        }

        public Criteria andModifyByNotBetween(Long value1, Long value2) {
            addCriterion("modifyBy not between", value1, value2, "modifyBy");
            return (Criteria) this;
        }

        public Criteria andModifyDateIsNull() {
            addCriterion("modifyDate is null");
            return (Criteria) this;
        }

        public Criteria andModifyDateIsNotNull() {
            addCriterion("modifyDate is not null");
            return (Criteria) this;
        }

        public Criteria andModifyDateEqualTo(Date value) {
            addCriterion("modifyDate =", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateNotEqualTo(Date value) {
            addCriterion("modifyDate <>", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateGreaterThan(Date value) {
            addCriterion("modifyDate >", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateGreaterThanOrEqualTo(Date value) {
            addCriterion("modifyDate >=", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateLessThan(Date value) {
            addCriterion("modifyDate <", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateLessThanOrEqualTo(Date value) {
            addCriterion("modifyDate <=", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateIn(List<Date> values) {
            addCriterion("modifyDate in", values, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateNotIn(List<Date> values) {
            addCriterion("modifyDate not in", values, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateBetween(Date value1, Date value2) {
            addCriterion("modifyDate between", value1, value2, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateNotBetween(Date value1, Date value2) {
            addCriterion("modifyDate not between", value1, value2, "modifyDate");
            return (Criteria) this;
        }

      /*  public Criteria andProviderIdIsNull() {
            addCriterion("providerId is null");
            return (Criteria) this;
        }

        public Criteria andProviderIdIsNotNull() {
            addCriterion("providerId is not null");
            return (Criteria) this;
        }

        public Criteria andProviderIdEqualTo(Long value) {
            addCriterion("providerId =", value, "providerId");
            return (Criteria) this;
        }

        public Criteria andProviderIdNotEqualTo(Long value) {
            addCriterion("providerId <>", value, "providerId");
            return (Criteria) this;
        }

        public Criteria andProviderIdGreaterThan(Long value) {
            addCriterion("providerId >", value, "providerId");
            return (Criteria) this;
        }

        public Criteria andProviderIdGreaterThanOrEqualTo(Long value) {
            addCriterion("providerId >=", value, "providerId");
            return (Criteria) this;
        }

        public Criteria andProviderIdLessThan(Long value) {
            addCriterion("providerId <", value, "providerId");
            return (Criteria) this;
        }

        public Criteria andProviderIdLessThanOrEqualTo(Long value) {
            addCriterion("providerId <=", value, "providerId");
            return (Criteria) this;
        }

        public Criteria andProviderIdIn(List<Long> values) {
            addCriterion("providerId in", values, "providerId");
            return (Criteria) this;
        }

        public Criteria andProviderIdNotIn(List<Long> values) {
            addCriterion("providerId not in", values, "providerId");
            return (Criteria) this;
        }

        public Criteria andProviderIdBetween(Long value1, Long value2) {
            addCriterion("providerId between", value1, value2, "providerId");
            return (Criteria) this;
        }

        public Criteria andProviderIdNotBetween(Long value1, Long value2) {
            addCriterion("providerId not between", value1, value2, "providerId");
            return (Criteria) this;
        }*/
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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
}