package com.example.demo.modular.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TblFundExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TblFundExample() {
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

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andFundNameIsNull() {
            addCriterion("fund_name is null");
            return (Criteria) this;
        }

        public Criteria andFundNameIsNotNull() {
            addCriterion("fund_name is not null");
            return (Criteria) this;
        }

        public Criteria andFundNameEqualTo(String value) {
            addCriterion("fund_name =", value, "fundName");
            return (Criteria) this;
        }

        public Criteria andFundNameNotEqualTo(String value) {
            addCriterion("fund_name <>", value, "fundName");
            return (Criteria) this;
        }

        public Criteria andFundNameGreaterThan(String value) {
            addCriterion("fund_name >", value, "fundName");
            return (Criteria) this;
        }

        public Criteria andFundNameGreaterThanOrEqualTo(String value) {
            addCriterion("fund_name >=", value, "fundName");
            return (Criteria) this;
        }

        public Criteria andFundNameLessThan(String value) {
            addCriterion("fund_name <", value, "fundName");
            return (Criteria) this;
        }

        public Criteria andFundNameLessThanOrEqualTo(String value) {
            addCriterion("fund_name <=", value, "fundName");
            return (Criteria) this;
        }

        public Criteria andFundNameLike(String value) {
            addCriterion("fund_name like", value, "fundName");
            return (Criteria) this;
        }

        public Criteria andFundNameNotLike(String value) {
            addCriterion("fund_name not like", value, "fundName");
            return (Criteria) this;
        }

        public Criteria andFundNameIn(List<String> values) {
            addCriterion("fund_name in", values, "fundName");
            return (Criteria) this;
        }

        public Criteria andFundNameNotIn(List<String> values) {
            addCriterion("fund_name not in", values, "fundName");
            return (Criteria) this;
        }

        public Criteria andFundNameBetween(String value1, String value2) {
            addCriterion("fund_name between", value1, value2, "fundName");
            return (Criteria) this;
        }

        public Criteria andFundNameNotBetween(String value1, String value2) {
            addCriterion("fund_name not between", value1, value2, "fundName");
            return (Criteria) this;
        }

        public Criteria andFundFullnameIsNull() {
            addCriterion("fund_fullname is null");
            return (Criteria) this;
        }

        public Criteria andFundFullnameIsNotNull() {
            addCriterion("fund_fullname is not null");
            return (Criteria) this;
        }

        public Criteria andFundFullnameEqualTo(String value) {
            addCriterion("fund_fullname =", value, "fundFullname");
            return (Criteria) this;
        }

        public Criteria andFundFullnameNotEqualTo(String value) {
            addCriterion("fund_fullname <>", value, "fundFullname");
            return (Criteria) this;
        }

        public Criteria andFundFullnameGreaterThan(String value) {
            addCriterion("fund_fullname >", value, "fundFullname");
            return (Criteria) this;
        }

        public Criteria andFundFullnameGreaterThanOrEqualTo(String value) {
            addCriterion("fund_fullname >=", value, "fundFullname");
            return (Criteria) this;
        }

        public Criteria andFundFullnameLessThan(String value) {
            addCriterion("fund_fullname <", value, "fundFullname");
            return (Criteria) this;
        }

        public Criteria andFundFullnameLessThanOrEqualTo(String value) {
            addCriterion("fund_fullname <=", value, "fundFullname");
            return (Criteria) this;
        }

        public Criteria andFundFullnameLike(String value) {
            addCriterion("fund_fullname like", value, "fundFullname");
            return (Criteria) this;
        }

        public Criteria andFundFullnameNotLike(String value) {
            addCriterion("fund_fullname not like", value, "fundFullname");
            return (Criteria) this;
        }

        public Criteria andFundFullnameIn(List<String> values) {
            addCriterion("fund_fullname in", values, "fundFullname");
            return (Criteria) this;
        }

        public Criteria andFundFullnameNotIn(List<String> values) {
            addCriterion("fund_fullname not in", values, "fundFullname");
            return (Criteria) this;
        }

        public Criteria andFundFullnameBetween(String value1, String value2) {
            addCriterion("fund_fullname between", value1, value2, "fundFullname");
            return (Criteria) this;
        }

        public Criteria andFundFullnameNotBetween(String value1, String value2) {
            addCriterion("fund_fullname not between", value1, value2, "fundFullname");
            return (Criteria) this;
        }

        public Criteria andFundCategoryIsNull() {
            addCriterion("fund_category is null");
            return (Criteria) this;
        }

        public Criteria andFundCategoryIsNotNull() {
            addCriterion("fund_category is not null");
            return (Criteria) this;
        }

        public Criteria andFundCategoryEqualTo(String value) {
            addCriterion("fund_category =", value, "fundCategory");
            return (Criteria) this;
        }

        public Criteria andFundCategoryNotEqualTo(String value) {
            addCriterion("fund_category <>", value, "fundCategory");
            return (Criteria) this;
        }

        public Criteria andFundCategoryGreaterThan(String value) {
            addCriterion("fund_category >", value, "fundCategory");
            return (Criteria) this;
        }

        public Criteria andFundCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("fund_category >=", value, "fundCategory");
            return (Criteria) this;
        }

        public Criteria andFundCategoryLessThan(String value) {
            addCriterion("fund_category <", value, "fundCategory");
            return (Criteria) this;
        }

        public Criteria andFundCategoryLessThanOrEqualTo(String value) {
            addCriterion("fund_category <=", value, "fundCategory");
            return (Criteria) this;
        }

        public Criteria andFundCategoryLike(String value) {
            addCriterion("fund_category like", value, "fundCategory");
            return (Criteria) this;
        }

        public Criteria andFundCategoryNotLike(String value) {
            addCriterion("fund_category not like", value, "fundCategory");
            return (Criteria) this;
        }

        public Criteria andFundCategoryIn(List<String> values) {
            addCriterion("fund_category in", values, "fundCategory");
            return (Criteria) this;
        }

        public Criteria andFundCategoryNotIn(List<String> values) {
            addCriterion("fund_category not in", values, "fundCategory");
            return (Criteria) this;
        }

        public Criteria andFundCategoryBetween(String value1, String value2) {
            addCriterion("fund_category between", value1, value2, "fundCategory");
            return (Criteria) this;
        }

        public Criteria andFundCategoryNotBetween(String value1, String value2) {
            addCriterion("fund_category not between", value1, value2, "fundCategory");
            return (Criteria) this;
        }

        public Criteria andFundTypeIsNull() {
            addCriterion("fund_type is null");
            return (Criteria) this;
        }

        public Criteria andFundTypeIsNotNull() {
            addCriterion("fund_type is not null");
            return (Criteria) this;
        }

        public Criteria andFundTypeEqualTo(String value) {
            addCriterion("fund_type =", value, "fundType");
            return (Criteria) this;
        }

        public Criteria andFundTypeNotEqualTo(String value) {
            addCriterion("fund_type <>", value, "fundType");
            return (Criteria) this;
        }

        public Criteria andFundTypeGreaterThan(String value) {
            addCriterion("fund_type >", value, "fundType");
            return (Criteria) this;
        }

        public Criteria andFundTypeGreaterThanOrEqualTo(String value) {
            addCriterion("fund_type >=", value, "fundType");
            return (Criteria) this;
        }

        public Criteria andFundTypeLessThan(String value) {
            addCriterion("fund_type <", value, "fundType");
            return (Criteria) this;
        }

        public Criteria andFundTypeLessThanOrEqualTo(String value) {
            addCriterion("fund_type <=", value, "fundType");
            return (Criteria) this;
        }

        public Criteria andFundTypeLike(String value) {
            addCriterion("fund_type like", value, "fundType");
            return (Criteria) this;
        }

        public Criteria andFundTypeNotLike(String value) {
            addCriterion("fund_type not like", value, "fundType");
            return (Criteria) this;
        }

        public Criteria andFundTypeIn(List<String> values) {
            addCriterion("fund_type in", values, "fundType");
            return (Criteria) this;
        }

        public Criteria andFundTypeNotIn(List<String> values) {
            addCriterion("fund_type not in", values, "fundType");
            return (Criteria) this;
        }

        public Criteria andFundTypeBetween(String value1, String value2) {
            addCriterion("fund_type between", value1, value2, "fundType");
            return (Criteria) this;
        }

        public Criteria andFundTypeNotBetween(String value1, String value2) {
            addCriterion("fund_type not between", value1, value2, "fundType");
            return (Criteria) this;
        }

        public Criteria andFundStateIsNull() {
            addCriterion("fund_state is null");
            return (Criteria) this;
        }

        public Criteria andFundStateIsNotNull() {
            addCriterion("fund_state is not null");
            return (Criteria) this;
        }

        public Criteria andFundStateEqualTo(Byte value) {
            addCriterion("fund_state =", value, "fundState");
            return (Criteria) this;
        }

        public Criteria andFundStateNotEqualTo(Byte value) {
            addCriterion("fund_state <>", value, "fundState");
            return (Criteria) this;
        }

        public Criteria andFundStateGreaterThan(Byte value) {
            addCriterion("fund_state >", value, "fundState");
            return (Criteria) this;
        }

        public Criteria andFundStateGreaterThanOrEqualTo(Byte value) {
            addCriterion("fund_state >=", value, "fundState");
            return (Criteria) this;
        }

        public Criteria andFundStateLessThan(Byte value) {
            addCriterion("fund_state <", value, "fundState");
            return (Criteria) this;
        }

        public Criteria andFundStateLessThanOrEqualTo(Byte value) {
            addCriterion("fund_state <=", value, "fundState");
            return (Criteria) this;
        }

        public Criteria andFundStateIn(List<Byte> values) {
            addCriterion("fund_state in", values, "fundState");
            return (Criteria) this;
        }

        public Criteria andFundStateNotIn(List<Byte> values) {
            addCriterion("fund_state not in", values, "fundState");
            return (Criteria) this;
        }

        public Criteria andFundStateBetween(Byte value1, Byte value2) {
            addCriterion("fund_state between", value1, value2, "fundState");
            return (Criteria) this;
        }

        public Criteria andFundStateNotBetween(Byte value1, Byte value2) {
            addCriterion("fund_state not between", value1, value2, "fundState");
            return (Criteria) this;
        }

        public Criteria andTreeTypeIsNull() {
            addCriterion("tree_type is null");
            return (Criteria) this;
        }

        public Criteria andTreeTypeIsNotNull() {
            addCriterion("tree_type is not null");
            return (Criteria) this;
        }

        public Criteria andTreeTypeEqualTo(String value) {
            addCriterion("tree_type =", value, "treeType");
            return (Criteria) this;
        }

        public Criteria andTreeTypeNotEqualTo(String value) {
            addCriterion("tree_type <>", value, "treeType");
            return (Criteria) this;
        }

        public Criteria andTreeTypeGreaterThan(String value) {
            addCriterion("tree_type >", value, "treeType");
            return (Criteria) this;
        }

        public Criteria andTreeTypeGreaterThanOrEqualTo(String value) {
            addCriterion("tree_type >=", value, "treeType");
            return (Criteria) this;
        }

        public Criteria andTreeTypeLessThan(String value) {
            addCriterion("tree_type <", value, "treeType");
            return (Criteria) this;
        }

        public Criteria andTreeTypeLessThanOrEqualTo(String value) {
            addCriterion("tree_type <=", value, "treeType");
            return (Criteria) this;
        }

        public Criteria andTreeTypeLike(String value) {
            addCriterion("tree_type like", value, "treeType");
            return (Criteria) this;
        }

        public Criteria andTreeTypeNotLike(String value) {
            addCriterion("tree_type not like", value, "treeType");
            return (Criteria) this;
        }

        public Criteria andTreeTypeIn(List<String> values) {
            addCriterion("tree_type in", values, "treeType");
            return (Criteria) this;
        }

        public Criteria andTreeTypeNotIn(List<String> values) {
            addCriterion("tree_type not in", values, "treeType");
            return (Criteria) this;
        }

        public Criteria andTreeTypeBetween(String value1, String value2) {
            addCriterion("tree_type between", value1, value2, "treeType");
            return (Criteria) this;
        }

        public Criteria andTreeTypeNotBetween(String value1, String value2) {
            addCriterion("tree_type not between", value1, value2, "treeType");
            return (Criteria) this;
        }

        public Criteria andFundScaleIsNull() {
            addCriterion("fund_scale is null");
            return (Criteria) this;
        }

        public Criteria andFundScaleIsNotNull() {
            addCriterion("fund_scale is not null");
            return (Criteria) this;
        }

        public Criteria andFundScaleEqualTo(Double value) {
            addCriterion("fund_scale =", value, "fundScale");
            return (Criteria) this;
        }

        public Criteria andFundScaleNotEqualTo(Double value) {
            addCriterion("fund_scale <>", value, "fundScale");
            return (Criteria) this;
        }

        public Criteria andFundScaleGreaterThan(Double value) {
            addCriterion("fund_scale >", value, "fundScale");
            return (Criteria) this;
        }

        public Criteria andFundScaleGreaterThanOrEqualTo(Double value) {
            addCriterion("fund_scale >=", value, "fundScale");
            return (Criteria) this;
        }

        public Criteria andFundScaleLessThan(Double value) {
            addCriterion("fund_scale <", value, "fundScale");
            return (Criteria) this;
        }

        public Criteria andFundScaleLessThanOrEqualTo(Double value) {
            addCriterion("fund_scale <=", value, "fundScale");
            return (Criteria) this;
        }

        public Criteria andFundScaleIn(List<Double> values) {
            addCriterion("fund_scale in", values, "fundScale");
            return (Criteria) this;
        }

        public Criteria andFundScaleNotIn(List<Double> values) {
            addCriterion("fund_scale not in", values, "fundScale");
            return (Criteria) this;
        }

        public Criteria andFundScaleBetween(Double value1, Double value2) {
            addCriterion("fund_scale between", value1, value2, "fundScale");
            return (Criteria) this;
        }

        public Criteria andFundScaleNotBetween(Double value1, Double value2) {
            addCriterion("fund_scale not between", value1, value2, "fundScale");
            return (Criteria) this;
        }

        public Criteria andEstablishTimeIsNull() {
            addCriterion("establish_time is null");
            return (Criteria) this;
        }

        public Criteria andEstablishTimeIsNotNull() {
            addCriterion("establish_time is not null");
            return (Criteria) this;
        }

        public Criteria andEstablishTimeEqualTo(Date value) {
            addCriterion("establish_time =", value, "establishTime");
            return (Criteria) this;
        }

        public Criteria andEstablishTimeNotEqualTo(Date value) {
            addCriterion("establish_time <>", value, "establishTime");
            return (Criteria) this;
        }

        public Criteria andEstablishTimeGreaterThan(Date value) {
            addCriterion("establish_time >", value, "establishTime");
            return (Criteria) this;
        }

        public Criteria andEstablishTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("establish_time >=", value, "establishTime");
            return (Criteria) this;
        }

        public Criteria andEstablishTimeLessThan(Date value) {
            addCriterion("establish_time <", value, "establishTime");
            return (Criteria) this;
        }

        public Criteria andEstablishTimeLessThanOrEqualTo(Date value) {
            addCriterion("establish_time <=", value, "establishTime");
            return (Criteria) this;
        }

        public Criteria andEstablishTimeIn(List<Date> values) {
            addCriterion("establish_time in", values, "establishTime");
            return (Criteria) this;
        }

        public Criteria andEstablishTimeNotIn(List<Date> values) {
            addCriterion("establish_time not in", values, "establishTime");
            return (Criteria) this;
        }

        public Criteria andEstablishTimeBetween(Date value1, Date value2) {
            addCriterion("establish_time between", value1, value2, "establishTime");
            return (Criteria) this;
        }

        public Criteria andEstablishTimeNotBetween(Date value1, Date value2) {
            addCriterion("establish_time not between", value1, value2, "establishTime");
            return (Criteria) this;
        }

        public Criteria andInvestmentPeriodIsNull() {
            addCriterion("investment_period is null");
            return (Criteria) this;
        }

        public Criteria andInvestmentPeriodIsNotNull() {
            addCriterion("investment_period is not null");
            return (Criteria) this;
        }

        public Criteria andInvestmentPeriodEqualTo(String value) {
            addCriterion("investment_period =", value, "investmentPeriod");
            return (Criteria) this;
        }

        public Criteria andInvestmentPeriodNotEqualTo(String value) {
            addCriterion("investment_period <>", value, "investmentPeriod");
            return (Criteria) this;
        }

        public Criteria andInvestmentPeriodGreaterThan(String value) {
            addCriterion("investment_period >", value, "investmentPeriod");
            return (Criteria) this;
        }

        public Criteria andInvestmentPeriodGreaterThanOrEqualTo(String value) {
            addCriterion("investment_period >=", value, "investmentPeriod");
            return (Criteria) this;
        }

        public Criteria andInvestmentPeriodLessThan(String value) {
            addCriterion("investment_period <", value, "investmentPeriod");
            return (Criteria) this;
        }

        public Criteria andInvestmentPeriodLessThanOrEqualTo(String value) {
            addCriterion("investment_period <=", value, "investmentPeriod");
            return (Criteria) this;
        }

        public Criteria andInvestmentPeriodLike(String value) {
            addCriterion("investment_period like", value, "investmentPeriod");
            return (Criteria) this;
        }

        public Criteria andInvestmentPeriodNotLike(String value) {
            addCriterion("investment_period not like", value, "investmentPeriod");
            return (Criteria) this;
        }

        public Criteria andInvestmentPeriodIn(List<String> values) {
            addCriterion("investment_period in", values, "investmentPeriod");
            return (Criteria) this;
        }

        public Criteria andInvestmentPeriodNotIn(List<String> values) {
            addCriterion("investment_period not in", values, "investmentPeriod");
            return (Criteria) this;
        }

        public Criteria andInvestmentPeriodBetween(String value1, String value2) {
            addCriterion("investment_period between", value1, value2, "investmentPeriod");
            return (Criteria) this;
        }

        public Criteria andInvestmentPeriodNotBetween(String value1, String value2) {
            addCriterion("investment_period not between", value1, value2, "investmentPeriod");
            return (Criteria) this;
        }

        public Criteria andExitPeriodIsNull() {
            addCriterion("exit_period is null");
            return (Criteria) this;
        }

        public Criteria andExitPeriodIsNotNull() {
            addCriterion("exit_period is not null");
            return (Criteria) this;
        }

        public Criteria andExitPeriodEqualTo(String value) {
            addCriterion("exit_period =", value, "exitPeriod");
            return (Criteria) this;
        }

        public Criteria andExitPeriodNotEqualTo(String value) {
            addCriterion("exit_period <>", value, "exitPeriod");
            return (Criteria) this;
        }

        public Criteria andExitPeriodGreaterThan(String value) {
            addCriterion("exit_period >", value, "exitPeriod");
            return (Criteria) this;
        }

        public Criteria andExitPeriodGreaterThanOrEqualTo(String value) {
            addCriterion("exit_period >=", value, "exitPeriod");
            return (Criteria) this;
        }

        public Criteria andExitPeriodLessThan(String value) {
            addCriterion("exit_period <", value, "exitPeriod");
            return (Criteria) this;
        }

        public Criteria andExitPeriodLessThanOrEqualTo(String value) {
            addCriterion("exit_period <=", value, "exitPeriod");
            return (Criteria) this;
        }

        public Criteria andExitPeriodLike(String value) {
            addCriterion("exit_period like", value, "exitPeriod");
            return (Criteria) this;
        }

        public Criteria andExitPeriodNotLike(String value) {
            addCriterion("exit_period not like", value, "exitPeriod");
            return (Criteria) this;
        }

        public Criteria andExitPeriodIn(List<String> values) {
            addCriterion("exit_period in", values, "exitPeriod");
            return (Criteria) this;
        }

        public Criteria andExitPeriodNotIn(List<String> values) {
            addCriterion("exit_period not in", values, "exitPeriod");
            return (Criteria) this;
        }

        public Criteria andExitPeriodBetween(String value1, String value2) {
            addCriterion("exit_period between", value1, value2, "exitPeriod");
            return (Criteria) this;
        }

        public Criteria andExitPeriodNotBetween(String value1, String value2) {
            addCriterion("exit_period not between", value1, value2, "exitPeriod");
            return (Criteria) this;
        }

        public Criteria andExitTimeIsNull() {
            addCriterion("exit_time is null");
            return (Criteria) this;
        }

        public Criteria andExitTimeIsNotNull() {
            addCriterion("exit_time is not null");
            return (Criteria) this;
        }

        public Criteria andExitTimeEqualTo(Date value) {
            addCriterion("exit_time =", value, "exitTime");
            return (Criteria) this;
        }

        public Criteria andExitTimeNotEqualTo(Date value) {
            addCriterion("exit_time <>", value, "exitTime");
            return (Criteria) this;
        }

        public Criteria andExitTimeGreaterThan(Date value) {
            addCriterion("exit_time >", value, "exitTime");
            return (Criteria) this;
        }

        public Criteria andExitTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("exit_time >=", value, "exitTime");
            return (Criteria) this;
        }

        public Criteria andExitTimeLessThan(Date value) {
            addCriterion("exit_time <", value, "exitTime");
            return (Criteria) this;
        }

        public Criteria andExitTimeLessThanOrEqualTo(Date value) {
            addCriterion("exit_time <=", value, "exitTime");
            return (Criteria) this;
        }

        public Criteria andExitTimeIn(List<Date> values) {
            addCriterion("exit_time in", values, "exitTime");
            return (Criteria) this;
        }

        public Criteria andExitTimeNotIn(List<Date> values) {
            addCriterion("exit_time not in", values, "exitTime");
            return (Criteria) this;
        }

        public Criteria andExitTimeBetween(Date value1, Date value2) {
            addCriterion("exit_time between", value1, value2, "exitTime");
            return (Criteria) this;
        }

        public Criteria andExitTimeNotBetween(Date value1, Date value2) {
            addCriterion("exit_time not between", value1, value2, "exitTime");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdIsNull() {
            addCriterion("create_user_id is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdIsNotNull() {
            addCriterion("create_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdEqualTo(String value) {
            addCriterion("create_user_id =", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotEqualTo(String value) {
            addCriterion("create_user_id <>", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdGreaterThan(String value) {
            addCriterion("create_user_id >", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("create_user_id >=", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdLessThan(String value) {
            addCriterion("create_user_id <", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdLessThanOrEqualTo(String value) {
            addCriterion("create_user_id <=", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdLike(String value) {
            addCriterion("create_user_id like", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotLike(String value) {
            addCriterion("create_user_id not like", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdIn(List<String> values) {
            addCriterion("create_user_id in", values, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotIn(List<String> values) {
            addCriterion("create_user_id not in", values, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdBetween(String value1, String value2) {
            addCriterion("create_user_id between", value1, value2, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotBetween(String value1, String value2) {
            addCriterion("create_user_id not between", value1, value2, "createUserId");
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

        public Criteria andUpdateUserIdIsNull() {
            addCriterion("update_user_id is null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdIsNotNull() {
            addCriterion("update_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdEqualTo(String value) {
            addCriterion("update_user_id =", value, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdNotEqualTo(String value) {
            addCriterion("update_user_id <>", value, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdGreaterThan(String value) {
            addCriterion("update_user_id >", value, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("update_user_id >=", value, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdLessThan(String value) {
            addCriterion("update_user_id <", value, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdLessThanOrEqualTo(String value) {
            addCriterion("update_user_id <=", value, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdLike(String value) {
            addCriterion("update_user_id like", value, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdNotLike(String value) {
            addCriterion("update_user_id not like", value, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdIn(List<String> values) {
            addCriterion("update_user_id in", values, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdNotIn(List<String> values) {
            addCriterion("update_user_id not in", values, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdBetween(String value1, String value2) {
            addCriterion("update_user_id between", value1, value2, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdNotBetween(String value1, String value2) {
            addCriterion("update_user_id not between", value1, value2, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andDeleteStatusIsNull() {
            addCriterion("delete_status is null");
            return (Criteria) this;
        }

        public Criteria andDeleteStatusIsNotNull() {
            addCriterion("delete_status is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteStatusEqualTo(Byte value) {
            addCriterion("delete_status =", value, "deleteStatus");
            return (Criteria) this;
        }

        public Criteria andDeleteStatusNotEqualTo(Byte value) {
            addCriterion("delete_status <>", value, "deleteStatus");
            return (Criteria) this;
        }

        public Criteria andDeleteStatusGreaterThan(Byte value) {
            addCriterion("delete_status >", value, "deleteStatus");
            return (Criteria) this;
        }

        public Criteria andDeleteStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("delete_status >=", value, "deleteStatus");
            return (Criteria) this;
        }

        public Criteria andDeleteStatusLessThan(Byte value) {
            addCriterion("delete_status <", value, "deleteStatus");
            return (Criteria) this;
        }

        public Criteria andDeleteStatusLessThanOrEqualTo(Byte value) {
            addCriterion("delete_status <=", value, "deleteStatus");
            return (Criteria) this;
        }

        public Criteria andDeleteStatusIn(List<Byte> values) {
            addCriterion("delete_status in", values, "deleteStatus");
            return (Criteria) this;
        }

        public Criteria andDeleteStatusNotIn(List<Byte> values) {
            addCriterion("delete_status not in", values, "deleteStatus");
            return (Criteria) this;
        }

        public Criteria andDeleteStatusBetween(Byte value1, Byte value2) {
            addCriterion("delete_status between", value1, value2, "deleteStatus");
            return (Criteria) this;
        }

        public Criteria andDeleteStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("delete_status not between", value1, value2, "deleteStatus");
            return (Criteria) this;
        }
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