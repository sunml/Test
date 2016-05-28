package mybatis.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class PeiziDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PeiziDetailExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andPzIdIsNull() {
            addCriterion("pz_id is null");
            return (Criteria) this;
        }

        public Criteria andPzIdIsNotNull() {
            addCriterion("pz_id is not null");
            return (Criteria) this;
        }

        public Criteria andPzIdEqualTo(String value) {
            addCriterion("pz_id =", value, "pzId");
            return (Criteria) this;
        }

        public Criteria andPzIdNotEqualTo(String value) {
            addCriterion("pz_id <>", value, "pzId");
            return (Criteria) this;
        }

        public Criteria andPzIdGreaterThan(String value) {
            addCriterion("pz_id >", value, "pzId");
            return (Criteria) this;
        }

        public Criteria andPzIdGreaterThanOrEqualTo(String value) {
            addCriterion("pz_id >=", value, "pzId");
            return (Criteria) this;
        }

        public Criteria andPzIdLessThan(String value) {
            addCriterion("pz_id <", value, "pzId");
            return (Criteria) this;
        }

        public Criteria andPzIdLessThanOrEqualTo(String value) {
            addCriterion("pz_id <=", value, "pzId");
            return (Criteria) this;
        }

        public Criteria andPzIdLike(String value) {
            addCriterion("pz_id like", value, "pzId");
            return (Criteria) this;
        }

        public Criteria andPzIdNotLike(String value) {
            addCriterion("pz_id not like", value, "pzId");
            return (Criteria) this;
        }

        public Criteria andPzIdIn(List<String> values) {
            addCriterion("pz_id in", values, "pzId");
            return (Criteria) this;
        }

        public Criteria andPzIdNotIn(List<String> values) {
            addCriterion("pz_id not in", values, "pzId");
            return (Criteria) this;
        }

        public Criteria andPzIdBetween(String value1, String value2) {
            addCriterion("pz_id between", value1, value2, "pzId");
            return (Criteria) this;
        }

        public Criteria andPzIdNotBetween(String value1, String value2) {
            addCriterion("pz_id not between", value1, value2, "pzId");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNull() {
            addCriterion("product_id is null");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNotNull() {
            addCriterion("product_id is not null");
            return (Criteria) this;
        }

        public Criteria andProductIdEqualTo(Integer value) {
            addCriterion("product_id =", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotEqualTo(Integer value) {
            addCriterion("product_id <>", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThan(Integer value) {
            addCriterion("product_id >", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("product_id >=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThan(Integer value) {
            addCriterion("product_id <", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThanOrEqualTo(Integer value) {
            addCriterion("product_id <=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdIn(List<Integer> values) {
            addCriterion("product_id in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotIn(List<Integer> values) {
            addCriterion("product_id not in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdBetween(Integer value1, Integer value2) {
            addCriterion("product_id between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotBetween(Integer value1, Integer value2) {
            addCriterion("product_id not between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andPolicyIdIsNull() {
            addCriterion("policy_id is null");
            return (Criteria) this;
        }

        public Criteria andPolicyIdIsNotNull() {
            addCriterion("policy_id is not null");
            return (Criteria) this;
        }

        public Criteria andPolicyIdEqualTo(Integer value) {
            addCriterion("policy_id =", value, "policyId");
            return (Criteria) this;
        }

        public Criteria andPolicyIdNotEqualTo(Integer value) {
            addCriterion("policy_id <>", value, "policyId");
            return (Criteria) this;
        }

        public Criteria andPolicyIdGreaterThan(Integer value) {
            addCriterion("policy_id >", value, "policyId");
            return (Criteria) this;
        }

        public Criteria andPolicyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("policy_id >=", value, "policyId");
            return (Criteria) this;
        }

        public Criteria andPolicyIdLessThan(Integer value) {
            addCriterion("policy_id <", value, "policyId");
            return (Criteria) this;
        }

        public Criteria andPolicyIdLessThanOrEqualTo(Integer value) {
            addCriterion("policy_id <=", value, "policyId");
            return (Criteria) this;
        }

        public Criteria andPolicyIdIn(List<Integer> values) {
            addCriterion("policy_id in", values, "policyId");
            return (Criteria) this;
        }

        public Criteria andPolicyIdNotIn(List<Integer> values) {
            addCriterion("policy_id not in", values, "policyId");
            return (Criteria) this;
        }

        public Criteria andPolicyIdBetween(Integer value1, Integer value2) {
            addCriterion("policy_id between", value1, value2, "policyId");
            return (Criteria) this;
        }

        public Criteria andPolicyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("policy_id not between", value1, value2, "policyId");
            return (Criteria) this;
        }

        public Criteria andFeeRateIsNull() {
            addCriterion("fee_rate is null");
            return (Criteria) this;
        }

        public Criteria andFeeRateIsNotNull() {
            addCriterion("fee_rate is not null");
            return (Criteria) this;
        }

        public Criteria andFeeRateEqualTo(Float value) {
            addCriterion("fee_rate =", value, "feeRate");
            return (Criteria) this;
        }

        public Criteria andFeeRateNotEqualTo(Float value) {
            addCriterion("fee_rate <>", value, "feeRate");
            return (Criteria) this;
        }

        public Criteria andFeeRateGreaterThan(Float value) {
            addCriterion("fee_rate >", value, "feeRate");
            return (Criteria) this;
        }

        public Criteria andFeeRateGreaterThanOrEqualTo(Float value) {
            addCriterion("fee_rate >=", value, "feeRate");
            return (Criteria) this;
        }

        public Criteria andFeeRateLessThan(Float value) {
            addCriterion("fee_rate <", value, "feeRate");
            return (Criteria) this;
        }

        public Criteria andFeeRateLessThanOrEqualTo(Float value) {
            addCriterion("fee_rate <=", value, "feeRate");
            return (Criteria) this;
        }

        public Criteria andFeeRateIn(List<Float> values) {
            addCriterion("fee_rate in", values, "feeRate");
            return (Criteria) this;
        }

        public Criteria andFeeRateNotIn(List<Float> values) {
            addCriterion("fee_rate not in", values, "feeRate");
            return (Criteria) this;
        }

        public Criteria andFeeRateBetween(Float value1, Float value2) {
            addCriterion("fee_rate between", value1, value2, "feeRate");
            return (Criteria) this;
        }

        public Criteria andFeeRateNotBetween(Float value1, Float value2) {
            addCriterion("fee_rate not between", value1, value2, "feeRate");
            return (Criteria) this;
        }

        public Criteria andRiskAssureMoneyIsNull() {
            addCriterion("risk_assure_money is null");
            return (Criteria) this;
        }

        public Criteria andRiskAssureMoneyIsNotNull() {
            addCriterion("risk_assure_money is not null");
            return (Criteria) this;
        }

        public Criteria andRiskAssureMoneyEqualTo(BigDecimal value) {
            addCriterion("risk_assure_money =", value, "riskAssureMoney");
            return (Criteria) this;
        }

        public Criteria andRiskAssureMoneyNotEqualTo(BigDecimal value) {
            addCriterion("risk_assure_money <>", value, "riskAssureMoney");
            return (Criteria) this;
        }

        public Criteria andRiskAssureMoneyGreaterThan(BigDecimal value) {
            addCriterion("risk_assure_money >", value, "riskAssureMoney");
            return (Criteria) this;
        }

        public Criteria andRiskAssureMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("risk_assure_money >=", value, "riskAssureMoney");
            return (Criteria) this;
        }

        public Criteria andRiskAssureMoneyLessThan(BigDecimal value) {
            addCriterion("risk_assure_money <", value, "riskAssureMoney");
            return (Criteria) this;
        }

        public Criteria andRiskAssureMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("risk_assure_money <=", value, "riskAssureMoney");
            return (Criteria) this;
        }

        public Criteria andRiskAssureMoneyIn(List<BigDecimal> values) {
            addCriterion("risk_assure_money in", values, "riskAssureMoney");
            return (Criteria) this;
        }

        public Criteria andRiskAssureMoneyNotIn(List<BigDecimal> values) {
            addCriterion("risk_assure_money not in", values, "riskAssureMoney");
            return (Criteria) this;
        }

        public Criteria andRiskAssureMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("risk_assure_money between", value1, value2, "riskAssureMoney");
            return (Criteria) this;
        }

        public Criteria andRiskAssureMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("risk_assure_money not between", value1, value2, "riskAssureMoney");
            return (Criteria) this;
        }

        public Criteria andBorrowMoneyIsNull() {
            addCriterion("borrow_money is null");
            return (Criteria) this;
        }

        public Criteria andBorrowMoneyIsNotNull() {
            addCriterion("borrow_money is not null");
            return (Criteria) this;
        }

        public Criteria andBorrowMoneyEqualTo(BigDecimal value) {
            addCriterion("borrow_money =", value, "borrowMoney");
            return (Criteria) this;
        }

        public Criteria andBorrowMoneyNotEqualTo(BigDecimal value) {
            addCriterion("borrow_money <>", value, "borrowMoney");
            return (Criteria) this;
        }

        public Criteria andBorrowMoneyGreaterThan(BigDecimal value) {
            addCriterion("borrow_money >", value, "borrowMoney");
            return (Criteria) this;
        }

        public Criteria andBorrowMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("borrow_money >=", value, "borrowMoney");
            return (Criteria) this;
        }

        public Criteria andBorrowMoneyLessThan(BigDecimal value) {
            addCriterion("borrow_money <", value, "borrowMoney");
            return (Criteria) this;
        }

        public Criteria andBorrowMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("borrow_money <=", value, "borrowMoney");
            return (Criteria) this;
        }

        public Criteria andBorrowMoneyIn(List<BigDecimal> values) {
            addCriterion("borrow_money in", values, "borrowMoney");
            return (Criteria) this;
        }

        public Criteria andBorrowMoneyNotIn(List<BigDecimal> values) {
            addCriterion("borrow_money not in", values, "borrowMoney");
            return (Criteria) this;
        }

        public Criteria andBorrowMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("borrow_money between", value1, value2, "borrowMoney");
            return (Criteria) this;
        }

        public Criteria andBorrowMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("borrow_money not between", value1, value2, "borrowMoney");
            return (Criteria) this;
        }

        public Criteria andDtsMobileIsNull() {
            addCriterion("dts_mobile is null");
            return (Criteria) this;
        }

        public Criteria andDtsMobileIsNotNull() {
            addCriterion("dts_mobile is not null");
            return (Criteria) this;
        }

        public Criteria andDtsMobileEqualTo(String value) {
            addCriterion("dts_mobile =", value, "dtsMobile");
            return (Criteria) this;
        }

        public Criteria andDtsMobileNotEqualTo(String value) {
            addCriterion("dts_mobile <>", value, "dtsMobile");
            return (Criteria) this;
        }

        public Criteria andDtsMobileGreaterThan(String value) {
            addCriterion("dts_mobile >", value, "dtsMobile");
            return (Criteria) this;
        }

        public Criteria andDtsMobileGreaterThanOrEqualTo(String value) {
            addCriterion("dts_mobile >=", value, "dtsMobile");
            return (Criteria) this;
        }

        public Criteria andDtsMobileLessThan(String value) {
            addCriterion("dts_mobile <", value, "dtsMobile");
            return (Criteria) this;
        }

        public Criteria andDtsMobileLessThanOrEqualTo(String value) {
            addCriterion("dts_mobile <=", value, "dtsMobile");
            return (Criteria) this;
        }

        public Criteria andDtsMobileLike(String value) {
            addCriterion("dts_mobile like", value, "dtsMobile");
            return (Criteria) this;
        }

        public Criteria andDtsMobileNotLike(String value) {
            addCriterion("dts_mobile not like", value, "dtsMobile");
            return (Criteria) this;
        }

        public Criteria andDtsMobileIn(List<String> values) {
            addCriterion("dts_mobile in", values, "dtsMobile");
            return (Criteria) this;
        }

        public Criteria andDtsMobileNotIn(List<String> values) {
            addCriterion("dts_mobile not in", values, "dtsMobile");
            return (Criteria) this;
        }

        public Criteria andDtsMobileBetween(String value1, String value2) {
            addCriterion("dts_mobile between", value1, value2, "dtsMobile");
            return (Criteria) this;
        }

        public Criteria andDtsMobileNotBetween(String value1, String value2) {
            addCriterion("dts_mobile not between", value1, value2, "dtsMobile");
            return (Criteria) this;
        }

        public Criteria andDtsGUserIdIsNull() {
            addCriterion("dts_g_user_id is null");
            return (Criteria) this;
        }

        public Criteria andDtsGUserIdIsNotNull() {
            addCriterion("dts_g_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andDtsGUserIdEqualTo(Integer value) {
            addCriterion("dts_g_user_id =", value, "dtsGUserId");
            return (Criteria) this;
        }

        public Criteria andDtsGUserIdNotEqualTo(Integer value) {
            addCriterion("dts_g_user_id <>", value, "dtsGUserId");
            return (Criteria) this;
        }

        public Criteria andDtsGUserIdGreaterThan(Integer value) {
            addCriterion("dts_g_user_id >", value, "dtsGUserId");
            return (Criteria) this;
        }

        public Criteria andDtsGUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("dts_g_user_id >=", value, "dtsGUserId");
            return (Criteria) this;
        }

        public Criteria andDtsGUserIdLessThan(Integer value) {
            addCriterion("dts_g_user_id <", value, "dtsGUserId");
            return (Criteria) this;
        }

        public Criteria andDtsGUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("dts_g_user_id <=", value, "dtsGUserId");
            return (Criteria) this;
        }

        public Criteria andDtsGUserIdIn(List<Integer> values) {
            addCriterion("dts_g_user_id in", values, "dtsGUserId");
            return (Criteria) this;
        }

        public Criteria andDtsGUserIdNotIn(List<Integer> values) {
            addCriterion("dts_g_user_id not in", values, "dtsGUserId");
            return (Criteria) this;
        }

        public Criteria andDtsGUserIdBetween(Integer value1, Integer value2) {
            addCriterion("dts_g_user_id between", value1, value2, "dtsGUserId");
            return (Criteria) this;
        }

        public Criteria andDtsGUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("dts_g_user_id not between", value1, value2, "dtsGUserId");
            return (Criteria) this;
        }

        public Criteria andDtsDtsSystemIdIsNull() {
            addCriterion("dts_dts_system_id is null");
            return (Criteria) this;
        }

        public Criteria andDtsDtsSystemIdIsNotNull() {
            addCriterion("dts_dts_system_id is not null");
            return (Criteria) this;
        }

        public Criteria andDtsDtsSystemIdEqualTo(Integer value) {
            addCriterion("dts_dts_system_id =", value, "dtsDtsSystemId");
            return (Criteria) this;
        }

        public Criteria andDtsDtsSystemIdNotEqualTo(Integer value) {
            addCriterion("dts_dts_system_id <>", value, "dtsDtsSystemId");
            return (Criteria) this;
        }

        public Criteria andDtsDtsSystemIdGreaterThan(Integer value) {
            addCriterion("dts_dts_system_id >", value, "dtsDtsSystemId");
            return (Criteria) this;
        }

        public Criteria andDtsDtsSystemIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("dts_dts_system_id >=", value, "dtsDtsSystemId");
            return (Criteria) this;
        }

        public Criteria andDtsDtsSystemIdLessThan(Integer value) {
            addCriterion("dts_dts_system_id <", value, "dtsDtsSystemId");
            return (Criteria) this;
        }

        public Criteria andDtsDtsSystemIdLessThanOrEqualTo(Integer value) {
            addCriterion("dts_dts_system_id <=", value, "dtsDtsSystemId");
            return (Criteria) this;
        }

        public Criteria andDtsDtsSystemIdIn(List<Integer> values) {
            addCriterion("dts_dts_system_id in", values, "dtsDtsSystemId");
            return (Criteria) this;
        }

        public Criteria andDtsDtsSystemIdNotIn(List<Integer> values) {
            addCriterion("dts_dts_system_id not in", values, "dtsDtsSystemId");
            return (Criteria) this;
        }

        public Criteria andDtsDtsSystemIdBetween(Integer value1, Integer value2) {
            addCriterion("dts_dts_system_id between", value1, value2, "dtsDtsSystemId");
            return (Criteria) this;
        }

        public Criteria andDtsDtsSystemIdNotBetween(Integer value1, Integer value2) {
            addCriterion("dts_dts_system_id not between", value1, value2, "dtsDtsSystemId");
            return (Criteria) this;
        }

        public Criteria andDtsWebservicesUrlIsNull() {
            addCriterion("dts_webservices_url is null");
            return (Criteria) this;
        }

        public Criteria andDtsWebservicesUrlIsNotNull() {
            addCriterion("dts_webservices_url is not null");
            return (Criteria) this;
        }

        public Criteria andDtsWebservicesUrlEqualTo(String value) {
            addCriterion("dts_webservices_url =", value, "dtsWebservicesUrl");
            return (Criteria) this;
        }

        public Criteria andDtsWebservicesUrlNotEqualTo(String value) {
            addCriterion("dts_webservices_url <>", value, "dtsWebservicesUrl");
            return (Criteria) this;
        }

        public Criteria andDtsWebservicesUrlGreaterThan(String value) {
            addCriterion("dts_webservices_url >", value, "dtsWebservicesUrl");
            return (Criteria) this;
        }

        public Criteria andDtsWebservicesUrlGreaterThanOrEqualTo(String value) {
            addCriterion("dts_webservices_url >=", value, "dtsWebservicesUrl");
            return (Criteria) this;
        }

        public Criteria andDtsWebservicesUrlLessThan(String value) {
            addCriterion("dts_webservices_url <", value, "dtsWebservicesUrl");
            return (Criteria) this;
        }

        public Criteria andDtsWebservicesUrlLessThanOrEqualTo(String value) {
            addCriterion("dts_webservices_url <=", value, "dtsWebservicesUrl");
            return (Criteria) this;
        }

        public Criteria andDtsWebservicesUrlLike(String value) {
            addCriterion("dts_webservices_url like", value, "dtsWebservicesUrl");
            return (Criteria) this;
        }

        public Criteria andDtsWebservicesUrlNotLike(String value) {
            addCriterion("dts_webservices_url not like", value, "dtsWebservicesUrl");
            return (Criteria) this;
        }

        public Criteria andDtsWebservicesUrlIn(List<String> values) {
            addCriterion("dts_webservices_url in", values, "dtsWebservicesUrl");
            return (Criteria) this;
        }

        public Criteria andDtsWebservicesUrlNotIn(List<String> values) {
            addCriterion("dts_webservices_url not in", values, "dtsWebservicesUrl");
            return (Criteria) this;
        }

        public Criteria andDtsWebservicesUrlBetween(String value1, String value2) {
            addCriterion("dts_webservices_url between", value1, value2, "dtsWebservicesUrl");
            return (Criteria) this;
        }

        public Criteria andDtsWebservicesUrlNotBetween(String value1, String value2) {
            addCriterion("dts_webservices_url not between", value1, value2, "dtsWebservicesUrl");
            return (Criteria) this;
        }

        public Criteria andDtsDtsUserIdIsNull() {
            addCriterion("dts_dts_user_id is null");
            return (Criteria) this;
        }

        public Criteria andDtsDtsUserIdIsNotNull() {
            addCriterion("dts_dts_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andDtsDtsUserIdEqualTo(String value) {
            addCriterion("dts_dts_user_id =", value, "dtsDtsUserId");
            return (Criteria) this;
        }

        public Criteria andDtsDtsUserIdNotEqualTo(String value) {
            addCriterion("dts_dts_user_id <>", value, "dtsDtsUserId");
            return (Criteria) this;
        }

        public Criteria andDtsDtsUserIdGreaterThan(String value) {
            addCriterion("dts_dts_user_id >", value, "dtsDtsUserId");
            return (Criteria) this;
        }

        public Criteria andDtsDtsUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("dts_dts_user_id >=", value, "dtsDtsUserId");
            return (Criteria) this;
        }

        public Criteria andDtsDtsUserIdLessThan(String value) {
            addCriterion("dts_dts_user_id <", value, "dtsDtsUserId");
            return (Criteria) this;
        }

        public Criteria andDtsDtsUserIdLessThanOrEqualTo(String value) {
            addCriterion("dts_dts_user_id <=", value, "dtsDtsUserId");
            return (Criteria) this;
        }

        public Criteria andDtsDtsUserIdLike(String value) {
            addCriterion("dts_dts_user_id like", value, "dtsDtsUserId");
            return (Criteria) this;
        }

        public Criteria andDtsDtsUserIdNotLike(String value) {
            addCriterion("dts_dts_user_id not like", value, "dtsDtsUserId");
            return (Criteria) this;
        }

        public Criteria andDtsDtsUserIdIn(List<String> values) {
            addCriterion("dts_dts_user_id in", values, "dtsDtsUserId");
            return (Criteria) this;
        }

        public Criteria andDtsDtsUserIdNotIn(List<String> values) {
            addCriterion("dts_dts_user_id not in", values, "dtsDtsUserId");
            return (Criteria) this;
        }

        public Criteria andDtsDtsUserIdBetween(String value1, String value2) {
            addCriterion("dts_dts_user_id between", value1, value2, "dtsDtsUserId");
            return (Criteria) this;
        }

        public Criteria andDtsDtsUserIdNotBetween(String value1, String value2) {
            addCriterion("dts_dts_user_id not between", value1, value2, "dtsDtsUserId");
            return (Criteria) this;
        }

        public Criteria andDtsAccountCodeIsNull() {
            addCriterion("dts_account_code is null");
            return (Criteria) this;
        }

        public Criteria andDtsAccountCodeIsNotNull() {
            addCriterion("dts_account_code is not null");
            return (Criteria) this;
        }

        public Criteria andDtsAccountCodeEqualTo(String value) {
            addCriterion("dts_account_code =", value, "dtsAccountCode");
            return (Criteria) this;
        }

        public Criteria andDtsAccountCodeNotEqualTo(String value) {
            addCriterion("dts_account_code <>", value, "dtsAccountCode");
            return (Criteria) this;
        }

        public Criteria andDtsAccountCodeGreaterThan(String value) {
            addCriterion("dts_account_code >", value, "dtsAccountCode");
            return (Criteria) this;
        }

        public Criteria andDtsAccountCodeGreaterThanOrEqualTo(String value) {
            addCriterion("dts_account_code >=", value, "dtsAccountCode");
            return (Criteria) this;
        }

        public Criteria andDtsAccountCodeLessThan(String value) {
            addCriterion("dts_account_code <", value, "dtsAccountCode");
            return (Criteria) this;
        }

        public Criteria andDtsAccountCodeLessThanOrEqualTo(String value) {
            addCriterion("dts_account_code <=", value, "dtsAccountCode");
            return (Criteria) this;
        }

        public Criteria andDtsAccountCodeLike(String value) {
            addCriterion("dts_account_code like", value, "dtsAccountCode");
            return (Criteria) this;
        }

        public Criteria andDtsAccountCodeNotLike(String value) {
            addCriterion("dts_account_code not like", value, "dtsAccountCode");
            return (Criteria) this;
        }

        public Criteria andDtsAccountCodeIn(List<String> values) {
            addCriterion("dts_account_code in", values, "dtsAccountCode");
            return (Criteria) this;
        }

        public Criteria andDtsAccountCodeNotIn(List<String> values) {
            addCriterion("dts_account_code not in", values, "dtsAccountCode");
            return (Criteria) this;
        }

        public Criteria andDtsAccountCodeBetween(String value1, String value2) {
            addCriterion("dts_account_code between", value1, value2, "dtsAccountCode");
            return (Criteria) this;
        }

        public Criteria andDtsAccountCodeNotBetween(String value1, String value2) {
            addCriterion("dts_account_code not between", value1, value2, "dtsAccountCode");
            return (Criteria) this;
        }

        public Criteria andDtsPasswordIsNull() {
            addCriterion("dts_password is null");
            return (Criteria) this;
        }

        public Criteria andDtsPasswordIsNotNull() {
            addCriterion("dts_password is not null");
            return (Criteria) this;
        }

        public Criteria andDtsPasswordEqualTo(String value) {
            addCriterion("dts_password =", value, "dtsPassword");
            return (Criteria) this;
        }

        public Criteria andDtsPasswordNotEqualTo(String value) {
            addCriterion("dts_password <>", value, "dtsPassword");
            return (Criteria) this;
        }

        public Criteria andDtsPasswordGreaterThan(String value) {
            addCriterion("dts_password >", value, "dtsPassword");
            return (Criteria) this;
        }

        public Criteria andDtsPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("dts_password >=", value, "dtsPassword");
            return (Criteria) this;
        }

        public Criteria andDtsPasswordLessThan(String value) {
            addCriterion("dts_password <", value, "dtsPassword");
            return (Criteria) this;
        }

        public Criteria andDtsPasswordLessThanOrEqualTo(String value) {
            addCriterion("dts_password <=", value, "dtsPassword");
            return (Criteria) this;
        }

        public Criteria andDtsPasswordLike(String value) {
            addCriterion("dts_password like", value, "dtsPassword");
            return (Criteria) this;
        }

        public Criteria andDtsPasswordNotLike(String value) {
            addCriterion("dts_password not like", value, "dtsPassword");
            return (Criteria) this;
        }

        public Criteria andDtsPasswordIn(List<String> values) {
            addCriterion("dts_password in", values, "dtsPassword");
            return (Criteria) this;
        }

        public Criteria andDtsPasswordNotIn(List<String> values) {
            addCriterion("dts_password not in", values, "dtsPassword");
            return (Criteria) this;
        }

        public Criteria andDtsPasswordBetween(String value1, String value2) {
            addCriterion("dts_password between", value1, value2, "dtsPassword");
            return (Criteria) this;
        }

        public Criteria andDtsPasswordNotBetween(String value1, String value2) {
            addCriterion("dts_password not between", value1, value2, "dtsPassword");
            return (Criteria) this;
        }

        public Criteria andDtsCompanyCodeIsNull() {
            addCriterion("dts_company_code is null");
            return (Criteria) this;
        }

        public Criteria andDtsCompanyCodeIsNotNull() {
            addCriterion("dts_company_code is not null");
            return (Criteria) this;
        }

        public Criteria andDtsCompanyCodeEqualTo(String value) {
            addCriterion("dts_company_code =", value, "dtsCompanyCode");
            return (Criteria) this;
        }

        public Criteria andDtsCompanyCodeNotEqualTo(String value) {
            addCriterion("dts_company_code <>", value, "dtsCompanyCode");
            return (Criteria) this;
        }

        public Criteria andDtsCompanyCodeGreaterThan(String value) {
            addCriterion("dts_company_code >", value, "dtsCompanyCode");
            return (Criteria) this;
        }

        public Criteria andDtsCompanyCodeGreaterThanOrEqualTo(String value) {
            addCriterion("dts_company_code >=", value, "dtsCompanyCode");
            return (Criteria) this;
        }

        public Criteria andDtsCompanyCodeLessThan(String value) {
            addCriterion("dts_company_code <", value, "dtsCompanyCode");
            return (Criteria) this;
        }

        public Criteria andDtsCompanyCodeLessThanOrEqualTo(String value) {
            addCriterion("dts_company_code <=", value, "dtsCompanyCode");
            return (Criteria) this;
        }

        public Criteria andDtsCompanyCodeLike(String value) {
            addCriterion("dts_company_code like", value, "dtsCompanyCode");
            return (Criteria) this;
        }

        public Criteria andDtsCompanyCodeNotLike(String value) {
            addCriterion("dts_company_code not like", value, "dtsCompanyCode");
            return (Criteria) this;
        }

        public Criteria andDtsCompanyCodeIn(List<String> values) {
            addCriterion("dts_company_code in", values, "dtsCompanyCode");
            return (Criteria) this;
        }

        public Criteria andDtsCompanyCodeNotIn(List<String> values) {
            addCriterion("dts_company_code not in", values, "dtsCompanyCode");
            return (Criteria) this;
        }

        public Criteria andDtsCompanyCodeBetween(String value1, String value2) {
            addCriterion("dts_company_code between", value1, value2, "dtsCompanyCode");
            return (Criteria) this;
        }

        public Criteria andDtsCompanyCodeNotBetween(String value1, String value2) {
            addCriterion("dts_company_code not between", value1, value2, "dtsCompanyCode");
            return (Criteria) this;
        }

        public Criteria andDtsAccountValueIsNull() {
            addCriterion("dts_account_value is null");
            return (Criteria) this;
        }

        public Criteria andDtsAccountValueIsNotNull() {
            addCriterion("dts_account_value is not null");
            return (Criteria) this;
        }

        public Criteria andDtsAccountValueEqualTo(Double value) {
            addCriterion("dts_account_value =", value, "dtsAccountValue");
            return (Criteria) this;
        }

        public Criteria andDtsAccountValueNotEqualTo(Double value) {
            addCriterion("dts_account_value <>", value, "dtsAccountValue");
            return (Criteria) this;
        }

        public Criteria andDtsAccountValueGreaterThan(Double value) {
            addCriterion("dts_account_value >", value, "dtsAccountValue");
            return (Criteria) this;
        }

        public Criteria andDtsAccountValueGreaterThanOrEqualTo(Double value) {
            addCriterion("dts_account_value >=", value, "dtsAccountValue");
            return (Criteria) this;
        }

        public Criteria andDtsAccountValueLessThan(Double value) {
            addCriterion("dts_account_value <", value, "dtsAccountValue");
            return (Criteria) this;
        }

        public Criteria andDtsAccountValueLessThanOrEqualTo(Double value) {
            addCriterion("dts_account_value <=", value, "dtsAccountValue");
            return (Criteria) this;
        }

        public Criteria andDtsAccountValueIn(List<Double> values) {
            addCriterion("dts_account_value in", values, "dtsAccountValue");
            return (Criteria) this;
        }

        public Criteria andDtsAccountValueNotIn(List<Double> values) {
            addCriterion("dts_account_value not in", values, "dtsAccountValue");
            return (Criteria) this;
        }

        public Criteria andDtsAccountValueBetween(Double value1, Double value2) {
            addCriterion("dts_account_value between", value1, value2, "dtsAccountValue");
            return (Criteria) this;
        }

        public Criteria andDtsAccountValueNotBetween(Double value1, Double value2) {
            addCriterion("dts_account_value not between", value1, value2, "dtsAccountValue");
            return (Criteria) this;
        }

        public Criteria andDtsAccountBalanceIsNull() {
            addCriterion("dts_account_balance is null");
            return (Criteria) this;
        }

        public Criteria andDtsAccountBalanceIsNotNull() {
            addCriterion("dts_account_balance is not null");
            return (Criteria) this;
        }

        public Criteria andDtsAccountBalanceEqualTo(Double value) {
            addCriterion("dts_account_balance =", value, "dtsAccountBalance");
            return (Criteria) this;
        }

        public Criteria andDtsAccountBalanceNotEqualTo(Double value) {
            addCriterion("dts_account_balance <>", value, "dtsAccountBalance");
            return (Criteria) this;
        }

        public Criteria andDtsAccountBalanceGreaterThan(Double value) {
            addCriterion("dts_account_balance >", value, "dtsAccountBalance");
            return (Criteria) this;
        }

        public Criteria andDtsAccountBalanceGreaterThanOrEqualTo(Double value) {
            addCriterion("dts_account_balance >=", value, "dtsAccountBalance");
            return (Criteria) this;
        }

        public Criteria andDtsAccountBalanceLessThan(Double value) {
            addCriterion("dts_account_balance <", value, "dtsAccountBalance");
            return (Criteria) this;
        }

        public Criteria andDtsAccountBalanceLessThanOrEqualTo(Double value) {
            addCriterion("dts_account_balance <=", value, "dtsAccountBalance");
            return (Criteria) this;
        }

        public Criteria andDtsAccountBalanceIn(List<Double> values) {
            addCriterion("dts_account_balance in", values, "dtsAccountBalance");
            return (Criteria) this;
        }

        public Criteria andDtsAccountBalanceNotIn(List<Double> values) {
            addCriterion("dts_account_balance not in", values, "dtsAccountBalance");
            return (Criteria) this;
        }

        public Criteria andDtsAccountBalanceBetween(Double value1, Double value2) {
            addCriterion("dts_account_balance between", value1, value2, "dtsAccountBalance");
            return (Criteria) this;
        }

        public Criteria andDtsAccountBalanceNotBetween(Double value1, Double value2) {
            addCriterion("dts_account_balance not between", value1, value2, "dtsAccountBalance");
            return (Criteria) this;
        }

        public Criteria andDtsAccountAssetValueIsNull() {
            addCriterion("dts_account_asset_value is null");
            return (Criteria) this;
        }

        public Criteria andDtsAccountAssetValueIsNotNull() {
            addCriterion("dts_account_asset_value is not null");
            return (Criteria) this;
        }

        public Criteria andDtsAccountAssetValueEqualTo(Double value) {
            addCriterion("dts_account_asset_value =", value, "dtsAccountAssetValue");
            return (Criteria) this;
        }

        public Criteria andDtsAccountAssetValueNotEqualTo(Double value) {
            addCriterion("dts_account_asset_value <>", value, "dtsAccountAssetValue");
            return (Criteria) this;
        }

        public Criteria andDtsAccountAssetValueGreaterThan(Double value) {
            addCriterion("dts_account_asset_value >", value, "dtsAccountAssetValue");
            return (Criteria) this;
        }

        public Criteria andDtsAccountAssetValueGreaterThanOrEqualTo(Double value) {
            addCriterion("dts_account_asset_value >=", value, "dtsAccountAssetValue");
            return (Criteria) this;
        }

        public Criteria andDtsAccountAssetValueLessThan(Double value) {
            addCriterion("dts_account_asset_value <", value, "dtsAccountAssetValue");
            return (Criteria) this;
        }

        public Criteria andDtsAccountAssetValueLessThanOrEqualTo(Double value) {
            addCriterion("dts_account_asset_value <=", value, "dtsAccountAssetValue");
            return (Criteria) this;
        }

        public Criteria andDtsAccountAssetValueIn(List<Double> values) {
            addCriterion("dts_account_asset_value in", values, "dtsAccountAssetValue");
            return (Criteria) this;
        }

        public Criteria andDtsAccountAssetValueNotIn(List<Double> values) {
            addCriterion("dts_account_asset_value not in", values, "dtsAccountAssetValue");
            return (Criteria) this;
        }

        public Criteria andDtsAccountAssetValueBetween(Double value1, Double value2) {
            addCriterion("dts_account_asset_value between", value1, value2, "dtsAccountAssetValue");
            return (Criteria) this;
        }

        public Criteria andDtsAccountAssetValueNotBetween(Double value1, Double value2) {
            addCriterion("dts_account_asset_value not between", value1, value2, "dtsAccountAssetValue");
            return (Criteria) this;
        }

        public Criteria andDtsAccountSyncTimeIsNull() {
            addCriterion("dts_account_sync_time is null");
            return (Criteria) this;
        }

        public Criteria andDtsAccountSyncTimeIsNotNull() {
            addCriterion("dts_account_sync_time is not null");
            return (Criteria) this;
        }

        public Criteria andDtsAccountSyncTimeEqualTo(Integer value) {
            addCriterion("dts_account_sync_time =", value, "dtsAccountSyncTime");
            return (Criteria) this;
        }

        public Criteria andDtsAccountSyncTimeNotEqualTo(Integer value) {
            addCriterion("dts_account_sync_time <>", value, "dtsAccountSyncTime");
            return (Criteria) this;
        }

        public Criteria andDtsAccountSyncTimeGreaterThan(Integer value) {
            addCriterion("dts_account_sync_time >", value, "dtsAccountSyncTime");
            return (Criteria) this;
        }

        public Criteria andDtsAccountSyncTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("dts_account_sync_time >=", value, "dtsAccountSyncTime");
            return (Criteria) this;
        }

        public Criteria andDtsAccountSyncTimeLessThan(Integer value) {
            addCriterion("dts_account_sync_time <", value, "dtsAccountSyncTime");
            return (Criteria) this;
        }

        public Criteria andDtsAccountSyncTimeLessThanOrEqualTo(Integer value) {
            addCriterion("dts_account_sync_time <=", value, "dtsAccountSyncTime");
            return (Criteria) this;
        }

        public Criteria andDtsAccountSyncTimeIn(List<Integer> values) {
            addCriterion("dts_account_sync_time in", values, "dtsAccountSyncTime");
            return (Criteria) this;
        }

        public Criteria andDtsAccountSyncTimeNotIn(List<Integer> values) {
            addCriterion("dts_account_sync_time not in", values, "dtsAccountSyncTime");
            return (Criteria) this;
        }

        public Criteria andDtsAccountSyncTimeBetween(Integer value1, Integer value2) {
            addCriterion("dts_account_sync_time between", value1, value2, "dtsAccountSyncTime");
            return (Criteria) this;
        }

        public Criteria andDtsAccountSyncTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("dts_account_sync_time not between", value1, value2, "dtsAccountSyncTime");
            return (Criteria) this;
        }

        public Criteria andFeeModeIsNull() {
            addCriterion("fee_mode is null");
            return (Criteria) this;
        }

        public Criteria andFeeModeIsNotNull() {
            addCriterion("fee_mode is not null");
            return (Criteria) this;
        }

        public Criteria andFeeModeEqualTo(Boolean value) {
            addCriterion("fee_mode =", value, "feeMode");
            return (Criteria) this;
        }

        public Criteria andFeeModeNotEqualTo(Boolean value) {
            addCriterion("fee_mode <>", value, "feeMode");
            return (Criteria) this;
        }

        public Criteria andFeeModeGreaterThan(Boolean value) {
            addCriterion("fee_mode >", value, "feeMode");
            return (Criteria) this;
        }

        public Criteria andFeeModeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("fee_mode >=", value, "feeMode");
            return (Criteria) this;
        }

        public Criteria andFeeModeLessThan(Boolean value) {
            addCriterion("fee_mode <", value, "feeMode");
            return (Criteria) this;
        }

        public Criteria andFeeModeLessThanOrEqualTo(Boolean value) {
            addCriterion("fee_mode <=", value, "feeMode");
            return (Criteria) this;
        }

        public Criteria andFeeModeIn(List<Boolean> values) {
            addCriterion("fee_mode in", values, "feeMode");
            return (Criteria) this;
        }

        public Criteria andFeeModeNotIn(List<Boolean> values) {
            addCriterion("fee_mode not in", values, "feeMode");
            return (Criteria) this;
        }

        public Criteria andFeeModeBetween(Boolean value1, Boolean value2) {
            addCriterion("fee_mode between", value1, value2, "feeMode");
            return (Criteria) this;
        }

        public Criteria andFeeModeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("fee_mode not between", value1, value2, "feeMode");
            return (Criteria) this;
        }

        public Criteria andStartInterestDayIsNull() {
            addCriterion("start_interest_day is null");
            return (Criteria) this;
        }

        public Criteria andStartInterestDayIsNotNull() {
            addCriterion("start_interest_day is not null");
            return (Criteria) this;
        }

        public Criteria andStartInterestDayEqualTo(Date value) {
            addCriterion("start_interest_day =", value, "startInterestDay");
            return (Criteria) this;
        }

        public Criteria andStartInterestDayNotEqualTo(Date value) {
            addCriterion("start_interest_day <>", value, "startInterestDay");
            return (Criteria) this;
        }

        public Criteria andStartInterestDayGreaterThan(Date value) {
            addCriterion("start_interest_day >", value, "startInterestDay");
            return (Criteria) this;
        }

        public Criteria andStartInterestDayGreaterThanOrEqualTo(Date value) {
            addCriterion("start_interest_day >=", value, "startInterestDay");
            return (Criteria) this;
        }

        public Criteria andStartInterestDayLessThan(Date value) {
            addCriterion("start_interest_day <", value, "startInterestDay");
            return (Criteria) this;
        }

        public Criteria andStartInterestDayLessThanOrEqualTo(Date value) {
            addCriterion("start_interest_day <=", value, "startInterestDay");
            return (Criteria) this;
        }

        public Criteria andStartInterestDayIn(List<Date> values) {
            addCriterion("start_interest_day in", values, "startInterestDay");
            return (Criteria) this;
        }

        public Criteria andStartInterestDayNotIn(List<Date> values) {
            addCriterion("start_interest_day not in", values, "startInterestDay");
            return (Criteria) this;
        }

        public Criteria andStartInterestDayBetween(Date value1, Date value2) {
            addCriterion("start_interest_day between", value1, value2, "startInterestDay");
            return (Criteria) this;
        }

        public Criteria andStartInterestDayNotBetween(Date value1, Date value2) {
            addCriterion("start_interest_day not between", value1, value2, "startInterestDay");
            return (Criteria) this;
        }

        public Criteria andFeeDateIsNull() {
            addCriterion("fee_date is null");
            return (Criteria) this;
        }

        public Criteria andFeeDateIsNotNull() {
            addCriterion("fee_date is not null");
            return (Criteria) this;
        }

        public Criteria andFeeDateEqualTo(Integer value) {
            addCriterion("fee_date =", value, "feeDate");
            return (Criteria) this;
        }

        public Criteria andFeeDateNotEqualTo(Integer value) {
            addCriterion("fee_date <>", value, "feeDate");
            return (Criteria) this;
        }

        public Criteria andFeeDateGreaterThan(Integer value) {
            addCriterion("fee_date >", value, "feeDate");
            return (Criteria) this;
        }

        public Criteria andFeeDateGreaterThanOrEqualTo(Integer value) {
            addCriterion("fee_date >=", value, "feeDate");
            return (Criteria) this;
        }

        public Criteria andFeeDateLessThan(Integer value) {
            addCriterion("fee_date <", value, "feeDate");
            return (Criteria) this;
        }

        public Criteria andFeeDateLessThanOrEqualTo(Integer value) {
            addCriterion("fee_date <=", value, "feeDate");
            return (Criteria) this;
        }

        public Criteria andFeeDateIn(List<Integer> values) {
            addCriterion("fee_date in", values, "feeDate");
            return (Criteria) this;
        }

        public Criteria andFeeDateNotIn(List<Integer> values) {
            addCriterion("fee_date not in", values, "feeDate");
            return (Criteria) this;
        }

        public Criteria andFeeDateBetween(Integer value1, Integer value2) {
            addCriterion("fee_date between", value1, value2, "feeDate");
            return (Criteria) this;
        }

        public Criteria andFeeDateNotBetween(Integer value1, Integer value2) {
            addCriterion("fee_date not between", value1, value2, "feeDate");
            return (Criteria) this;
        }

        public Criteria andFeeIncomeNextDateIsNull() {
            addCriterion("fee_income_next_date is null");
            return (Criteria) this;
        }

        public Criteria andFeeIncomeNextDateIsNotNull() {
            addCriterion("fee_income_next_date is not null");
            return (Criteria) this;
        }

        public Criteria andFeeIncomeNextDateEqualTo(Date value) {
            addCriterionForJDBCDate("fee_income_next_date =", value, "feeIncomeNextDate");
            return (Criteria) this;
        }

        public Criteria andFeeIncomeNextDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("fee_income_next_date <>", value, "feeIncomeNextDate");
            return (Criteria) this;
        }

        public Criteria andFeeIncomeNextDateGreaterThan(Date value) {
            addCriterionForJDBCDate("fee_income_next_date >", value, "feeIncomeNextDate");
            return (Criteria) this;
        }

        public Criteria andFeeIncomeNextDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("fee_income_next_date >=", value, "feeIncomeNextDate");
            return (Criteria) this;
        }

        public Criteria andFeeIncomeNextDateLessThan(Date value) {
            addCriterionForJDBCDate("fee_income_next_date <", value, "feeIncomeNextDate");
            return (Criteria) this;
        }

        public Criteria andFeeIncomeNextDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("fee_income_next_date <=", value, "feeIncomeNextDate");
            return (Criteria) this;
        }

        public Criteria andFeeIncomeNextDateIn(List<Date> values) {
            addCriterionForJDBCDate("fee_income_next_date in", values, "feeIncomeNextDate");
            return (Criteria) this;
        }

        public Criteria andFeeIncomeNextDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("fee_income_next_date not in", values, "feeIncomeNextDate");
            return (Criteria) this;
        }

        public Criteria andFeeIncomeNextDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("fee_income_next_date between", value1, value2, "feeIncomeNextDate");
            return (Criteria) this;
        }

        public Criteria andFeeIncomeNextDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("fee_income_next_date not between", value1, value2, "feeIncomeNextDate");
            return (Criteria) this;
        }

        public Criteria andFeeTimeIsNull() {
            addCriterion("fee_time is null");
            return (Criteria) this;
        }

        public Criteria andFeeTimeIsNotNull() {
            addCriterion("fee_time is not null");
            return (Criteria) this;
        }

        public Criteria andFeeTimeEqualTo(Integer value) {
            addCriterion("fee_time =", value, "feeTime");
            return (Criteria) this;
        }

        public Criteria andFeeTimeNotEqualTo(Integer value) {
            addCriterion("fee_time <>", value, "feeTime");
            return (Criteria) this;
        }

        public Criteria andFeeTimeGreaterThan(Integer value) {
            addCriterion("fee_time >", value, "feeTime");
            return (Criteria) this;
        }

        public Criteria andFeeTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("fee_time >=", value, "feeTime");
            return (Criteria) this;
        }

        public Criteria andFeeTimeLessThan(Integer value) {
            addCriterion("fee_time <", value, "feeTime");
            return (Criteria) this;
        }

        public Criteria andFeeTimeLessThanOrEqualTo(Integer value) {
            addCriterion("fee_time <=", value, "feeTime");
            return (Criteria) this;
        }

        public Criteria andFeeTimeIn(List<Integer> values) {
            addCriterion("fee_time in", values, "feeTime");
            return (Criteria) this;
        }

        public Criteria andFeeTimeNotIn(List<Integer> values) {
            addCriterion("fee_time not in", values, "feeTime");
            return (Criteria) this;
        }

        public Criteria andFeeTimeBetween(Integer value1, Integer value2) {
            addCriterion("fee_time between", value1, value2, "feeTime");
            return (Criteria) this;
        }

        public Criteria andFeeTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("fee_time not between", value1, value2, "feeTime");
            return (Criteria) this;
        }

        public Criteria andBalanceModeIsNull() {
            addCriterion("balance_mode is null");
            return (Criteria) this;
        }

        public Criteria andBalanceModeIsNotNull() {
            addCriterion("balance_mode is not null");
            return (Criteria) this;
        }

        public Criteria andBalanceModeEqualTo(Boolean value) {
            addCriterion("balance_mode =", value, "balanceMode");
            return (Criteria) this;
        }

        public Criteria andBalanceModeNotEqualTo(Boolean value) {
            addCriterion("balance_mode <>", value, "balanceMode");
            return (Criteria) this;
        }

        public Criteria andBalanceModeGreaterThan(Boolean value) {
            addCriterion("balance_mode >", value, "balanceMode");
            return (Criteria) this;
        }

        public Criteria andBalanceModeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("balance_mode >=", value, "balanceMode");
            return (Criteria) this;
        }

        public Criteria andBalanceModeLessThan(Boolean value) {
            addCriterion("balance_mode <", value, "balanceMode");
            return (Criteria) this;
        }

        public Criteria andBalanceModeLessThanOrEqualTo(Boolean value) {
            addCriterion("balance_mode <=", value, "balanceMode");
            return (Criteria) this;
        }

        public Criteria andBalanceModeIn(List<Boolean> values) {
            addCriterion("balance_mode in", values, "balanceMode");
            return (Criteria) this;
        }

        public Criteria andBalanceModeNotIn(List<Boolean> values) {
            addCriterion("balance_mode not in", values, "balanceMode");
            return (Criteria) this;
        }

        public Criteria andBalanceModeBetween(Boolean value1, Boolean value2) {
            addCriterion("balance_mode between", value1, value2, "balanceMode");
            return (Criteria) this;
        }

        public Criteria andBalanceModeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("balance_mode not between", value1, value2, "balanceMode");
            return (Criteria) this;
        }

        public Criteria andInterestMoneyIsNull() {
            addCriterion("interest_money is null");
            return (Criteria) this;
        }

        public Criteria andInterestMoneyIsNotNull() {
            addCriterion("interest_money is not null");
            return (Criteria) this;
        }

        public Criteria andInterestMoneyEqualTo(BigDecimal value) {
            addCriterion("interest_money =", value, "interestMoney");
            return (Criteria) this;
        }

        public Criteria andInterestMoneyNotEqualTo(BigDecimal value) {
            addCriterion("interest_money <>", value, "interestMoney");
            return (Criteria) this;
        }

        public Criteria andInterestMoneyGreaterThan(BigDecimal value) {
            addCriterion("interest_money >", value, "interestMoney");
            return (Criteria) this;
        }

        public Criteria andInterestMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("interest_money >=", value, "interestMoney");
            return (Criteria) this;
        }

        public Criteria andInterestMoneyLessThan(BigDecimal value) {
            addCriterion("interest_money <", value, "interestMoney");
            return (Criteria) this;
        }

        public Criteria andInterestMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("interest_money <=", value, "interestMoney");
            return (Criteria) this;
        }

        public Criteria andInterestMoneyIn(List<BigDecimal> values) {
            addCriterion("interest_money in", values, "interestMoney");
            return (Criteria) this;
        }

        public Criteria andInterestMoneyNotIn(List<BigDecimal> values) {
            addCriterion("interest_money not in", values, "interestMoney");
            return (Criteria) this;
        }

        public Criteria andInterestMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("interest_money between", value1, value2, "interestMoney");
            return (Criteria) this;
        }

        public Criteria andInterestMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("interest_money not between", value1, value2, "interestMoney");
            return (Criteria) this;
        }

        public Criteria andInterestDeductTimesIsNull() {
            addCriterion("interest_deduct_times is null");
            return (Criteria) this;
        }

        public Criteria andInterestDeductTimesIsNotNull() {
            addCriterion("interest_deduct_times is not null");
            return (Criteria) this;
        }

        public Criteria andInterestDeductTimesEqualTo(Integer value) {
            addCriterion("interest_deduct_times =", value, "interestDeductTimes");
            return (Criteria) this;
        }

        public Criteria andInterestDeductTimesNotEqualTo(Integer value) {
            addCriterion("interest_deduct_times <>", value, "interestDeductTimes");
            return (Criteria) this;
        }

        public Criteria andInterestDeductTimesGreaterThan(Integer value) {
            addCriterion("interest_deduct_times >", value, "interestDeductTimes");
            return (Criteria) this;
        }

        public Criteria andInterestDeductTimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("interest_deduct_times >=", value, "interestDeductTimes");
            return (Criteria) this;
        }

        public Criteria andInterestDeductTimesLessThan(Integer value) {
            addCriterion("interest_deduct_times <", value, "interestDeductTimes");
            return (Criteria) this;
        }

        public Criteria andInterestDeductTimesLessThanOrEqualTo(Integer value) {
            addCriterion("interest_deduct_times <=", value, "interestDeductTimes");
            return (Criteria) this;
        }

        public Criteria andInterestDeductTimesIn(List<Integer> values) {
            addCriterion("interest_deduct_times in", values, "interestDeductTimes");
            return (Criteria) this;
        }

        public Criteria andInterestDeductTimesNotIn(List<Integer> values) {
            addCriterion("interest_deduct_times not in", values, "interestDeductTimes");
            return (Criteria) this;
        }

        public Criteria andInterestDeductTimesBetween(Integer value1, Integer value2) {
            addCriterion("interest_deduct_times between", value1, value2, "interestDeductTimes");
            return (Criteria) this;
        }

        public Criteria andInterestDeductTimesNotBetween(Integer value1, Integer value2) {
            addCriterion("interest_deduct_times not between", value1, value2, "interestDeductTimes");
            return (Criteria) this;
        }

        public Criteria andWarningLineIsNull() {
            addCriterion("warning_line is null");
            return (Criteria) this;
        }

        public Criteria andWarningLineIsNotNull() {
            addCriterion("warning_line is not null");
            return (Criteria) this;
        }

        public Criteria andWarningLineEqualTo(BigDecimal value) {
            addCriterion("warning_line =", value, "warningLine");
            return (Criteria) this;
        }

        public Criteria andWarningLineNotEqualTo(BigDecimal value) {
            addCriterion("warning_line <>", value, "warningLine");
            return (Criteria) this;
        }

        public Criteria andWarningLineGreaterThan(BigDecimal value) {
            addCriterion("warning_line >", value, "warningLine");
            return (Criteria) this;
        }

        public Criteria andWarningLineGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("warning_line >=", value, "warningLine");
            return (Criteria) this;
        }

        public Criteria andWarningLineLessThan(BigDecimal value) {
            addCriterion("warning_line <", value, "warningLine");
            return (Criteria) this;
        }

        public Criteria andWarningLineLessThanOrEqualTo(BigDecimal value) {
            addCriterion("warning_line <=", value, "warningLine");
            return (Criteria) this;
        }

        public Criteria andWarningLineIn(List<BigDecimal> values) {
            addCriterion("warning_line in", values, "warningLine");
            return (Criteria) this;
        }

        public Criteria andWarningLineNotIn(List<BigDecimal> values) {
            addCriterion("warning_line not in", values, "warningLine");
            return (Criteria) this;
        }

        public Criteria andWarningLineBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("warning_line between", value1, value2, "warningLine");
            return (Criteria) this;
        }

        public Criteria andWarningLineNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("warning_line not between", value1, value2, "warningLine");
            return (Criteria) this;
        }

        public Criteria andLastWarningSmstimeIsNull() {
            addCriterion("last_warning_smstime is null");
            return (Criteria) this;
        }

        public Criteria andLastWarningSmstimeIsNotNull() {
            addCriterion("last_warning_smstime is not null");
            return (Criteria) this;
        }

        public Criteria andLastWarningSmstimeEqualTo(Integer value) {
            addCriterion("last_warning_smstime =", value, "lastWarningSmstime");
            return (Criteria) this;
        }

        public Criteria andLastWarningSmstimeNotEqualTo(Integer value) {
            addCriterion("last_warning_smstime <>", value, "lastWarningSmstime");
            return (Criteria) this;
        }

        public Criteria andLastWarningSmstimeGreaterThan(Integer value) {
            addCriterion("last_warning_smstime >", value, "lastWarningSmstime");
            return (Criteria) this;
        }

        public Criteria andLastWarningSmstimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("last_warning_smstime >=", value, "lastWarningSmstime");
            return (Criteria) this;
        }

        public Criteria andLastWarningSmstimeLessThan(Integer value) {
            addCriterion("last_warning_smstime <", value, "lastWarningSmstime");
            return (Criteria) this;
        }

        public Criteria andLastWarningSmstimeLessThanOrEqualTo(Integer value) {
            addCriterion("last_warning_smstime <=", value, "lastWarningSmstime");
            return (Criteria) this;
        }

        public Criteria andLastWarningSmstimeIn(List<Integer> values) {
            addCriterion("last_warning_smstime in", values, "lastWarningSmstime");
            return (Criteria) this;
        }

        public Criteria andLastWarningSmstimeNotIn(List<Integer> values) {
            addCriterion("last_warning_smstime not in", values, "lastWarningSmstime");
            return (Criteria) this;
        }

        public Criteria andLastWarningSmstimeBetween(Integer value1, Integer value2) {
            addCriterion("last_warning_smstime between", value1, value2, "lastWarningSmstime");
            return (Criteria) this;
        }

        public Criteria andLastWarningSmstimeNotBetween(Integer value1, Integer value2) {
            addCriterion("last_warning_smstime not between", value1, value2, "lastWarningSmstime");
            return (Criteria) this;
        }

        public Criteria andCloseLineIsNull() {
            addCriterion("close_line is null");
            return (Criteria) this;
        }

        public Criteria andCloseLineIsNotNull() {
            addCriterion("close_line is not null");
            return (Criteria) this;
        }

        public Criteria andCloseLineEqualTo(BigDecimal value) {
            addCriterion("close_line =", value, "closeLine");
            return (Criteria) this;
        }

        public Criteria andCloseLineNotEqualTo(BigDecimal value) {
            addCriterion("close_line <>", value, "closeLine");
            return (Criteria) this;
        }

        public Criteria andCloseLineGreaterThan(BigDecimal value) {
            addCriterion("close_line >", value, "closeLine");
            return (Criteria) this;
        }

        public Criteria andCloseLineGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("close_line >=", value, "closeLine");
            return (Criteria) this;
        }

        public Criteria andCloseLineLessThan(BigDecimal value) {
            addCriterion("close_line <", value, "closeLine");
            return (Criteria) this;
        }

        public Criteria andCloseLineLessThanOrEqualTo(BigDecimal value) {
            addCriterion("close_line <=", value, "closeLine");
            return (Criteria) this;
        }

        public Criteria andCloseLineIn(List<BigDecimal> values) {
            addCriterion("close_line in", values, "closeLine");
            return (Criteria) this;
        }

        public Criteria andCloseLineNotIn(List<BigDecimal> values) {
            addCriterion("close_line not in", values, "closeLine");
            return (Criteria) this;
        }

        public Criteria andCloseLineBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("close_line between", value1, value2, "closeLine");
            return (Criteria) this;
        }

        public Criteria andCloseLineNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("close_line not between", value1, value2, "closeLine");
            return (Criteria) this;
        }

        public Criteria andLastCloseSmstimeIsNull() {
            addCriterion("last_close_smstime is null");
            return (Criteria) this;
        }

        public Criteria andLastCloseSmstimeIsNotNull() {
            addCriterion("last_close_smstime is not null");
            return (Criteria) this;
        }

        public Criteria andLastCloseSmstimeEqualTo(Integer value) {
            addCriterion("last_close_smstime =", value, "lastCloseSmstime");
            return (Criteria) this;
        }

        public Criteria andLastCloseSmstimeNotEqualTo(Integer value) {
            addCriterion("last_close_smstime <>", value, "lastCloseSmstime");
            return (Criteria) this;
        }

        public Criteria andLastCloseSmstimeGreaterThan(Integer value) {
            addCriterion("last_close_smstime >", value, "lastCloseSmstime");
            return (Criteria) this;
        }

        public Criteria andLastCloseSmstimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("last_close_smstime >=", value, "lastCloseSmstime");
            return (Criteria) this;
        }

        public Criteria andLastCloseSmstimeLessThan(Integer value) {
            addCriterion("last_close_smstime <", value, "lastCloseSmstime");
            return (Criteria) this;
        }

        public Criteria andLastCloseSmstimeLessThanOrEqualTo(Integer value) {
            addCriterion("last_close_smstime <=", value, "lastCloseSmstime");
            return (Criteria) this;
        }

        public Criteria andLastCloseSmstimeIn(List<Integer> values) {
            addCriterion("last_close_smstime in", values, "lastCloseSmstime");
            return (Criteria) this;
        }

        public Criteria andLastCloseSmstimeNotIn(List<Integer> values) {
            addCriterion("last_close_smstime not in", values, "lastCloseSmstime");
            return (Criteria) this;
        }

        public Criteria andLastCloseSmstimeBetween(Integer value1, Integer value2) {
            addCriterion("last_close_smstime between", value1, value2, "lastCloseSmstime");
            return (Criteria) this;
        }

        public Criteria andLastCloseSmstimeNotBetween(Integer value1, Integer value2) {
            addCriterion("last_close_smstime not between", value1, value2, "lastCloseSmstime");
            return (Criteria) this;
        }

        public Criteria andStockIncomeIsNull() {
            addCriterion("stock_income is null");
            return (Criteria) this;
        }

        public Criteria andStockIncomeIsNotNull() {
            addCriterion("stock_income is not null");
            return (Criteria) this;
        }

        public Criteria andStockIncomeEqualTo(BigDecimal value) {
            addCriterion("stock_income =", value, "stockIncome");
            return (Criteria) this;
        }

        public Criteria andStockIncomeNotEqualTo(BigDecimal value) {
            addCriterion("stock_income <>", value, "stockIncome");
            return (Criteria) this;
        }

        public Criteria andStockIncomeGreaterThan(BigDecimal value) {
            addCriterion("stock_income >", value, "stockIncome");
            return (Criteria) this;
        }

        public Criteria andStockIncomeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("stock_income >=", value, "stockIncome");
            return (Criteria) this;
        }

        public Criteria andStockIncomeLessThan(BigDecimal value) {
            addCriterion("stock_income <", value, "stockIncome");
            return (Criteria) this;
        }

        public Criteria andStockIncomeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("stock_income <=", value, "stockIncome");
            return (Criteria) this;
        }

        public Criteria andStockIncomeIn(List<BigDecimal> values) {
            addCriterion("stock_income in", values, "stockIncome");
            return (Criteria) this;
        }

        public Criteria andStockIncomeNotIn(List<BigDecimal> values) {
            addCriterion("stock_income not in", values, "stockIncome");
            return (Criteria) this;
        }

        public Criteria andStockIncomeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("stock_income between", value1, value2, "stockIncome");
            return (Criteria) this;
        }

        public Criteria andStockIncomeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("stock_income not between", value1, value2, "stockIncome");
            return (Criteria) this;
        }

        public Criteria andMarkeingMoneyIsNull() {
            addCriterion("markeing_money is null");
            return (Criteria) this;
        }

        public Criteria andMarkeingMoneyIsNotNull() {
            addCriterion("markeing_money is not null");
            return (Criteria) this;
        }

        public Criteria andMarkeingMoneyEqualTo(BigDecimal value) {
            addCriterion("markeing_money =", value, "markeingMoney");
            return (Criteria) this;
        }

        public Criteria andMarkeingMoneyNotEqualTo(BigDecimal value) {
            addCriterion("markeing_money <>", value, "markeingMoney");
            return (Criteria) this;
        }

        public Criteria andMarkeingMoneyGreaterThan(BigDecimal value) {
            addCriterion("markeing_money >", value, "markeingMoney");
            return (Criteria) this;
        }

        public Criteria andMarkeingMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("markeing_money >=", value, "markeingMoney");
            return (Criteria) this;
        }

        public Criteria andMarkeingMoneyLessThan(BigDecimal value) {
            addCriterion("markeing_money <", value, "markeingMoney");
            return (Criteria) this;
        }

        public Criteria andMarkeingMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("markeing_money <=", value, "markeingMoney");
            return (Criteria) this;
        }

        public Criteria andMarkeingMoneyIn(List<BigDecimal> values) {
            addCriterion("markeing_money in", values, "markeingMoney");
            return (Criteria) this;
        }

        public Criteria andMarkeingMoneyNotIn(List<BigDecimal> values) {
            addCriterion("markeing_money not in", values, "markeingMoney");
            return (Criteria) this;
        }

        public Criteria andMarkeingMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("markeing_money between", value1, value2, "markeingMoney");
            return (Criteria) this;
        }

        public Criteria andMarkeingMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("markeing_money not between", value1, value2, "markeingMoney");
            return (Criteria) this;
        }

        public Criteria andIncomeMoneyPzIsNull() {
            addCriterion("income_money_pz is null");
            return (Criteria) this;
        }

        public Criteria andIncomeMoneyPzIsNotNull() {
            addCriterion("income_money_pz is not null");
            return (Criteria) this;
        }

        public Criteria andIncomeMoneyPzEqualTo(BigDecimal value) {
            addCriterion("income_money_pz =", value, "incomeMoneyPz");
            return (Criteria) this;
        }

        public Criteria andIncomeMoneyPzNotEqualTo(BigDecimal value) {
            addCriterion("income_money_pz <>", value, "incomeMoneyPz");
            return (Criteria) this;
        }

        public Criteria andIncomeMoneyPzGreaterThan(BigDecimal value) {
            addCriterion("income_money_pz >", value, "incomeMoneyPz");
            return (Criteria) this;
        }

        public Criteria andIncomeMoneyPzGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("income_money_pz >=", value, "incomeMoneyPz");
            return (Criteria) this;
        }

        public Criteria andIncomeMoneyPzLessThan(BigDecimal value) {
            addCriterion("income_money_pz <", value, "incomeMoneyPz");
            return (Criteria) this;
        }

        public Criteria andIncomeMoneyPzLessThanOrEqualTo(BigDecimal value) {
            addCriterion("income_money_pz <=", value, "incomeMoneyPz");
            return (Criteria) this;
        }

        public Criteria andIncomeMoneyPzIn(List<BigDecimal> values) {
            addCriterion("income_money_pz in", values, "incomeMoneyPz");
            return (Criteria) this;
        }

        public Criteria andIncomeMoneyPzNotIn(List<BigDecimal> values) {
            addCriterion("income_money_pz not in", values, "incomeMoneyPz");
            return (Criteria) this;
        }

        public Criteria andIncomeMoneyPzBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("income_money_pz between", value1, value2, "incomeMoneyPz");
            return (Criteria) this;
        }

        public Criteria andIncomeMoneyPzNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("income_money_pz not between", value1, value2, "incomeMoneyPz");
            return (Criteria) this;
        }

        public Criteria andPayMoneyPzIsNull() {
            addCriterion("pay_money_pz is null");
            return (Criteria) this;
        }

        public Criteria andPayMoneyPzIsNotNull() {
            addCriterion("pay_money_pz is not null");
            return (Criteria) this;
        }

        public Criteria andPayMoneyPzEqualTo(BigDecimal value) {
            addCriterion("pay_money_pz =", value, "payMoneyPz");
            return (Criteria) this;
        }

        public Criteria andPayMoneyPzNotEqualTo(BigDecimal value) {
            addCriterion("pay_money_pz <>", value, "payMoneyPz");
            return (Criteria) this;
        }

        public Criteria andPayMoneyPzGreaterThan(BigDecimal value) {
            addCriterion("pay_money_pz >", value, "payMoneyPz");
            return (Criteria) this;
        }

        public Criteria andPayMoneyPzGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("pay_money_pz >=", value, "payMoneyPz");
            return (Criteria) this;
        }

        public Criteria andPayMoneyPzLessThan(BigDecimal value) {
            addCriterion("pay_money_pz <", value, "payMoneyPz");
            return (Criteria) this;
        }

        public Criteria andPayMoneyPzLessThanOrEqualTo(BigDecimal value) {
            addCriterion("pay_money_pz <=", value, "payMoneyPz");
            return (Criteria) this;
        }

        public Criteria andPayMoneyPzIn(List<BigDecimal> values) {
            addCriterion("pay_money_pz in", values, "payMoneyPz");
            return (Criteria) this;
        }

        public Criteria andPayMoneyPzNotIn(List<BigDecimal> values) {
            addCriterion("pay_money_pz not in", values, "payMoneyPz");
            return (Criteria) this;
        }

        public Criteria andPayMoneyPzBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pay_money_pz between", value1, value2, "payMoneyPz");
            return (Criteria) this;
        }

        public Criteria andPayMoneyPzNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pay_money_pz not between", value1, value2, "payMoneyPz");
            return (Criteria) this;
        }

        public Criteria andPzStatusIsNull() {
            addCriterion("pz_status is null");
            return (Criteria) this;
        }

        public Criteria andPzStatusIsNotNull() {
            addCriterion("pz_status is not null");
            return (Criteria) this;
        }

        public Criteria andPzStatusEqualTo(Boolean value) {
            addCriterion("pz_status =", value, "pzStatus");
            return (Criteria) this;
        }

        public Criteria andPzStatusNotEqualTo(Boolean value) {
            addCriterion("pz_status <>", value, "pzStatus");
            return (Criteria) this;
        }

        public Criteria andPzStatusGreaterThan(Boolean value) {
            addCriterion("pz_status >", value, "pzStatus");
            return (Criteria) this;
        }

        public Criteria andPzStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("pz_status >=", value, "pzStatus");
            return (Criteria) this;
        }

        public Criteria andPzStatusLessThan(Boolean value) {
            addCriterion("pz_status <", value, "pzStatus");
            return (Criteria) this;
        }

        public Criteria andPzStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("pz_status <=", value, "pzStatus");
            return (Criteria) this;
        }

        public Criteria andPzStatusIn(List<Boolean> values) {
            addCriterion("pz_status in", values, "pzStatus");
            return (Criteria) this;
        }

        public Criteria andPzStatusNotIn(List<Boolean> values) {
            addCriterion("pz_status not in", values, "pzStatus");
            return (Criteria) this;
        }

        public Criteria andPzStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("pz_status between", value1, value2, "pzStatus");
            return (Criteria) this;
        }

        public Criteria andPzStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("pz_status not between", value1, value2, "pzStatus");
            return (Criteria) this;
        }

        public Criteria andPzTerminateTimeIsNull() {
            addCriterion("pz_terminate_time is null");
            return (Criteria) this;
        }

        public Criteria andPzTerminateTimeIsNotNull() {
            addCriterion("pz_terminate_time is not null");
            return (Criteria) this;
        }

        public Criteria andPzTerminateTimeEqualTo(Integer value) {
            addCriterion("pz_terminate_time =", value, "pzTerminateTime");
            return (Criteria) this;
        }

        public Criteria andPzTerminateTimeNotEqualTo(Integer value) {
            addCriterion("pz_terminate_time <>", value, "pzTerminateTime");
            return (Criteria) this;
        }

        public Criteria andPzTerminateTimeGreaterThan(Integer value) {
            addCriterion("pz_terminate_time >", value, "pzTerminateTime");
            return (Criteria) this;
        }

        public Criteria andPzTerminateTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("pz_terminate_time >=", value, "pzTerminateTime");
            return (Criteria) this;
        }

        public Criteria andPzTerminateTimeLessThan(Integer value) {
            addCriterion("pz_terminate_time <", value, "pzTerminateTime");
            return (Criteria) this;
        }

        public Criteria andPzTerminateTimeLessThanOrEqualTo(Integer value) {
            addCriterion("pz_terminate_time <=", value, "pzTerminateTime");
            return (Criteria) this;
        }

        public Criteria andPzTerminateTimeIn(List<Integer> values) {
            addCriterion("pz_terminate_time in", values, "pzTerminateTime");
            return (Criteria) this;
        }

        public Criteria andPzTerminateTimeNotIn(List<Integer> values) {
            addCriterion("pz_terminate_time not in", values, "pzTerminateTime");
            return (Criteria) this;
        }

        public Criteria andPzTerminateTimeBetween(Integer value1, Integer value2) {
            addCriterion("pz_terminate_time between", value1, value2, "pzTerminateTime");
            return (Criteria) this;
        }

        public Criteria andPzTerminateTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("pz_terminate_time not between", value1, value2, "pzTerminateTime");
            return (Criteria) this;
        }

        public Criteria andPzTerminateReasonIsNull() {
            addCriterion("pz_terminate_reason is null");
            return (Criteria) this;
        }

        public Criteria andPzTerminateReasonIsNotNull() {
            addCriterion("pz_terminate_reason is not null");
            return (Criteria) this;
        }

        public Criteria andPzTerminateReasonEqualTo(String value) {
            addCriterion("pz_terminate_reason =", value, "pzTerminateReason");
            return (Criteria) this;
        }

        public Criteria andPzTerminateReasonNotEqualTo(String value) {
            addCriterion("pz_terminate_reason <>", value, "pzTerminateReason");
            return (Criteria) this;
        }

        public Criteria andPzTerminateReasonGreaterThan(String value) {
            addCriterion("pz_terminate_reason >", value, "pzTerminateReason");
            return (Criteria) this;
        }

        public Criteria andPzTerminateReasonGreaterThanOrEqualTo(String value) {
            addCriterion("pz_terminate_reason >=", value, "pzTerminateReason");
            return (Criteria) this;
        }

        public Criteria andPzTerminateReasonLessThan(String value) {
            addCriterion("pz_terminate_reason <", value, "pzTerminateReason");
            return (Criteria) this;
        }

        public Criteria andPzTerminateReasonLessThanOrEqualTo(String value) {
            addCriterion("pz_terminate_reason <=", value, "pzTerminateReason");
            return (Criteria) this;
        }

        public Criteria andPzTerminateReasonLike(String value) {
            addCriterion("pz_terminate_reason like", value, "pzTerminateReason");
            return (Criteria) this;
        }

        public Criteria andPzTerminateReasonNotLike(String value) {
            addCriterion("pz_terminate_reason not like", value, "pzTerminateReason");
            return (Criteria) this;
        }

        public Criteria andPzTerminateReasonIn(List<String> values) {
            addCriterion("pz_terminate_reason in", values, "pzTerminateReason");
            return (Criteria) this;
        }

        public Criteria andPzTerminateReasonNotIn(List<String> values) {
            addCriterion("pz_terminate_reason not in", values, "pzTerminateReason");
            return (Criteria) this;
        }

        public Criteria andPzTerminateReasonBetween(String value1, String value2) {
            addCriterion("pz_terminate_reason between", value1, value2, "pzTerminateReason");
            return (Criteria) this;
        }

        public Criteria andPzTerminateReasonNotBetween(String value1, String value2) {
            addCriterion("pz_terminate_reason not between", value1, value2, "pzTerminateReason");
            return (Criteria) this;
        }

        public Criteria andDtsCloseoutTimeIsNull() {
            addCriterion("dts_closeout_time is null");
            return (Criteria) this;
        }

        public Criteria andDtsCloseoutTimeIsNotNull() {
            addCriterion("dts_closeout_time is not null");
            return (Criteria) this;
        }

        public Criteria andDtsCloseoutTimeEqualTo(Integer value) {
            addCriterion("dts_closeout_time =", value, "dtsCloseoutTime");
            return (Criteria) this;
        }

        public Criteria andDtsCloseoutTimeNotEqualTo(Integer value) {
            addCriterion("dts_closeout_time <>", value, "dtsCloseoutTime");
            return (Criteria) this;
        }

        public Criteria andDtsCloseoutTimeGreaterThan(Integer value) {
            addCriterion("dts_closeout_time >", value, "dtsCloseoutTime");
            return (Criteria) this;
        }

        public Criteria andDtsCloseoutTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("dts_closeout_time >=", value, "dtsCloseoutTime");
            return (Criteria) this;
        }

        public Criteria andDtsCloseoutTimeLessThan(Integer value) {
            addCriterion("dts_closeout_time <", value, "dtsCloseoutTime");
            return (Criteria) this;
        }

        public Criteria andDtsCloseoutTimeLessThanOrEqualTo(Integer value) {
            addCriterion("dts_closeout_time <=", value, "dtsCloseoutTime");
            return (Criteria) this;
        }

        public Criteria andDtsCloseoutTimeIn(List<Integer> values) {
            addCriterion("dts_closeout_time in", values, "dtsCloseoutTime");
            return (Criteria) this;
        }

        public Criteria andDtsCloseoutTimeNotIn(List<Integer> values) {
            addCriterion("dts_closeout_time not in", values, "dtsCloseoutTime");
            return (Criteria) this;
        }

        public Criteria andDtsCloseoutTimeBetween(Integer value1, Integer value2) {
            addCriterion("dts_closeout_time between", value1, value2, "dtsCloseoutTime");
            return (Criteria) this;
        }

        public Criteria andDtsCloseoutTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("dts_closeout_time not between", value1, value2, "dtsCloseoutTime");
            return (Criteria) this;
        }

        public Criteria andPzClearingTimeIsNull() {
            addCriterion("pz_clearing_time is null");
            return (Criteria) this;
        }

        public Criteria andPzClearingTimeIsNotNull() {
            addCriterion("pz_clearing_time is not null");
            return (Criteria) this;
        }

        public Criteria andPzClearingTimeEqualTo(Integer value) {
            addCriterion("pz_clearing_time =", value, "pzClearingTime");
            return (Criteria) this;
        }

        public Criteria andPzClearingTimeNotEqualTo(Integer value) {
            addCriterion("pz_clearing_time <>", value, "pzClearingTime");
            return (Criteria) this;
        }

        public Criteria andPzClearingTimeGreaterThan(Integer value) {
            addCriterion("pz_clearing_time >", value, "pzClearingTime");
            return (Criteria) this;
        }

        public Criteria andPzClearingTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("pz_clearing_time >=", value, "pzClearingTime");
            return (Criteria) this;
        }

        public Criteria andPzClearingTimeLessThan(Integer value) {
            addCriterion("pz_clearing_time <", value, "pzClearingTime");
            return (Criteria) this;
        }

        public Criteria andPzClearingTimeLessThanOrEqualTo(Integer value) {
            addCriterion("pz_clearing_time <=", value, "pzClearingTime");
            return (Criteria) this;
        }

        public Criteria andPzClearingTimeIn(List<Integer> values) {
            addCriterion("pz_clearing_time in", values, "pzClearingTime");
            return (Criteria) this;
        }

        public Criteria andPzClearingTimeNotIn(List<Integer> values) {
            addCriterion("pz_clearing_time not in", values, "pzClearingTime");
            return (Criteria) this;
        }

        public Criteria andPzClearingTimeBetween(Integer value1, Integer value2) {
            addCriterion("pz_clearing_time between", value1, value2, "pzClearingTime");
            return (Criteria) this;
        }

        public Criteria andPzClearingTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("pz_clearing_time not between", value1, value2, "pzClearingTime");
            return (Criteria) this;
        }

        public Criteria andPzDtscancelTimeIsNull() {
            addCriterion("pz_dtscancel_time is null");
            return (Criteria) this;
        }

        public Criteria andPzDtscancelTimeIsNotNull() {
            addCriterion("pz_dtscancel_time is not null");
            return (Criteria) this;
        }

        public Criteria andPzDtscancelTimeEqualTo(Integer value) {
            addCriterion("pz_dtscancel_time =", value, "pzDtscancelTime");
            return (Criteria) this;
        }

        public Criteria andPzDtscancelTimeNotEqualTo(Integer value) {
            addCriterion("pz_dtscancel_time <>", value, "pzDtscancelTime");
            return (Criteria) this;
        }

        public Criteria andPzDtscancelTimeGreaterThan(Integer value) {
            addCriterion("pz_dtscancel_time >", value, "pzDtscancelTime");
            return (Criteria) this;
        }

        public Criteria andPzDtscancelTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("pz_dtscancel_time >=", value, "pzDtscancelTime");
            return (Criteria) this;
        }

        public Criteria andPzDtscancelTimeLessThan(Integer value) {
            addCriterion("pz_dtscancel_time <", value, "pzDtscancelTime");
            return (Criteria) this;
        }

        public Criteria andPzDtscancelTimeLessThanOrEqualTo(Integer value) {
            addCriterion("pz_dtscancel_time <=", value, "pzDtscancelTime");
            return (Criteria) this;
        }

        public Criteria andPzDtscancelTimeIn(List<Integer> values) {
            addCriterion("pz_dtscancel_time in", values, "pzDtscancelTime");
            return (Criteria) this;
        }

        public Criteria andPzDtscancelTimeNotIn(List<Integer> values) {
            addCriterion("pz_dtscancel_time not in", values, "pzDtscancelTime");
            return (Criteria) this;
        }

        public Criteria andPzDtscancelTimeBetween(Integer value1, Integer value2) {
            addCriterion("pz_dtscancel_time between", value1, value2, "pzDtscancelTime");
            return (Criteria) this;
        }

        public Criteria andPzDtscancelTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("pz_dtscancel_time not between", value1, value2, "pzDtscancelTime");
            return (Criteria) this;
        }

        public Criteria andHashIsNull() {
            addCriterion("hash is null");
            return (Criteria) this;
        }

        public Criteria andHashIsNotNull() {
            addCriterion("hash is not null");
            return (Criteria) this;
        }

        public Criteria andHashEqualTo(String value) {
            addCriterion("hash =", value, "hash");
            return (Criteria) this;
        }

        public Criteria andHashNotEqualTo(String value) {
            addCriterion("hash <>", value, "hash");
            return (Criteria) this;
        }

        public Criteria andHashGreaterThan(String value) {
            addCriterion("hash >", value, "hash");
            return (Criteria) this;
        }

        public Criteria andHashGreaterThanOrEqualTo(String value) {
            addCriterion("hash >=", value, "hash");
            return (Criteria) this;
        }

        public Criteria andHashLessThan(String value) {
            addCriterion("hash <", value, "hash");
            return (Criteria) this;
        }

        public Criteria andHashLessThanOrEqualTo(String value) {
            addCriterion("hash <=", value, "hash");
            return (Criteria) this;
        }

        public Criteria andHashLike(String value) {
            addCriterion("hash like", value, "hash");
            return (Criteria) this;
        }

        public Criteria andHashNotLike(String value) {
            addCriterion("hash not like", value, "hash");
            return (Criteria) this;
        }

        public Criteria andHashIn(List<String> values) {
            addCriterion("hash in", values, "hash");
            return (Criteria) this;
        }

        public Criteria andHashNotIn(List<String> values) {
            addCriterion("hash not in", values, "hash");
            return (Criteria) this;
        }

        public Criteria andHashBetween(String value1, String value2) {
            addCriterion("hash between", value1, value2, "hash");
            return (Criteria) this;
        }

        public Criteria andHashNotBetween(String value1, String value2) {
            addCriterion("hash not between", value1, value2, "hash");
            return (Criteria) this;
        }

        public Criteria andDeferTimesIsNull() {
            addCriterion("defer_times is null");
            return (Criteria) this;
        }

        public Criteria andDeferTimesIsNotNull() {
            addCriterion("defer_times is not null");
            return (Criteria) this;
        }

        public Criteria andDeferTimesEqualTo(Integer value) {
            addCriterion("defer_times =", value, "deferTimes");
            return (Criteria) this;
        }

        public Criteria andDeferTimesNotEqualTo(Integer value) {
            addCriterion("defer_times <>", value, "deferTimes");
            return (Criteria) this;
        }

        public Criteria andDeferTimesGreaterThan(Integer value) {
            addCriterion("defer_times >", value, "deferTimes");
            return (Criteria) this;
        }

        public Criteria andDeferTimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("defer_times >=", value, "deferTimes");
            return (Criteria) this;
        }

        public Criteria andDeferTimesLessThan(Integer value) {
            addCriterion("defer_times <", value, "deferTimes");
            return (Criteria) this;
        }

        public Criteria andDeferTimesLessThanOrEqualTo(Integer value) {
            addCriterion("defer_times <=", value, "deferTimes");
            return (Criteria) this;
        }

        public Criteria andDeferTimesIn(List<Integer> values) {
            addCriterion("defer_times in", values, "deferTimes");
            return (Criteria) this;
        }

        public Criteria andDeferTimesNotIn(List<Integer> values) {
            addCriterion("defer_times not in", values, "deferTimes");
            return (Criteria) this;
        }

        public Criteria andDeferTimesBetween(Integer value1, Integer value2) {
            addCriterion("defer_times between", value1, value2, "deferTimes");
            return (Criteria) this;
        }

        public Criteria andDeferTimesNotBetween(Integer value1, Integer value2) {
            addCriterion("defer_times not between", value1, value2, "deferTimes");
            return (Criteria) this;
        }

        public Criteria andPzAutoDeferIsNull() {
            addCriterion("pz_auto_defer is null");
            return (Criteria) this;
        }

        public Criteria andPzAutoDeferIsNotNull() {
            addCriterion("pz_auto_defer is not null");
            return (Criteria) this;
        }

        public Criteria andPzAutoDeferEqualTo(Boolean value) {
            addCriterion("pz_auto_defer =", value, "pzAutoDefer");
            return (Criteria) this;
        }

        public Criteria andPzAutoDeferNotEqualTo(Boolean value) {
            addCriterion("pz_auto_defer <>", value, "pzAutoDefer");
            return (Criteria) this;
        }

        public Criteria andPzAutoDeferGreaterThan(Boolean value) {
            addCriterion("pz_auto_defer >", value, "pzAutoDefer");
            return (Criteria) this;
        }

        public Criteria andPzAutoDeferGreaterThanOrEqualTo(Boolean value) {
            addCriterion("pz_auto_defer >=", value, "pzAutoDefer");
            return (Criteria) this;
        }

        public Criteria andPzAutoDeferLessThan(Boolean value) {
            addCriterion("pz_auto_defer <", value, "pzAutoDefer");
            return (Criteria) this;
        }

        public Criteria andPzAutoDeferLessThanOrEqualTo(Boolean value) {
            addCriterion("pz_auto_defer <=", value, "pzAutoDefer");
            return (Criteria) this;
        }

        public Criteria andPzAutoDeferIn(List<Boolean> values) {
            addCriterion("pz_auto_defer in", values, "pzAutoDefer");
            return (Criteria) this;
        }

        public Criteria andPzAutoDeferNotIn(List<Boolean> values) {
            addCriterion("pz_auto_defer not in", values, "pzAutoDefer");
            return (Criteria) this;
        }

        public Criteria andPzAutoDeferBetween(Boolean value1, Boolean value2) {
            addCriterion("pz_auto_defer between", value1, value2, "pzAutoDefer");
            return (Criteria) this;
        }

        public Criteria andPzAutoDeferNotBetween(Boolean value1, Boolean value2) {
            addCriterion("pz_auto_defer not between", value1, value2, "pzAutoDefer");
            return (Criteria) this;
        }

        public Criteria andPzEndDateIsNull() {
            addCriterion("pz_end_date is null");
            return (Criteria) this;
        }

        public Criteria andPzEndDateIsNotNull() {
            addCriterion("pz_end_date is not null");
            return (Criteria) this;
        }

        public Criteria andPzEndDateEqualTo(Date value) {
            addCriterionForJDBCDate("pz_end_date =", value, "pzEndDate");
            return (Criteria) this;
        }

        public Criteria andPzEndDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("pz_end_date <>", value, "pzEndDate");
            return (Criteria) this;
        }

        public Criteria andPzEndDateGreaterThan(Date value) {
            addCriterionForJDBCDate("pz_end_date >", value, "pzEndDate");
            return (Criteria) this;
        }

        public Criteria andPzEndDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("pz_end_date >=", value, "pzEndDate");
            return (Criteria) this;
        }

        public Criteria andPzEndDateLessThan(Date value) {
            addCriterionForJDBCDate("pz_end_date <", value, "pzEndDate");
            return (Criteria) this;
        }

        public Criteria andPzEndDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("pz_end_date <=", value, "pzEndDate");
            return (Criteria) this;
        }

        public Criteria andPzEndDateIn(List<Date> values) {
            addCriterionForJDBCDate("pz_end_date in", values, "pzEndDate");
            return (Criteria) this;
        }

        public Criteria andPzEndDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("pz_end_date not in", values, "pzEndDate");
            return (Criteria) this;
        }

        public Criteria andPzEndDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("pz_end_date between", value1, value2, "pzEndDate");
            return (Criteria) this;
        }

        public Criteria andPzEndDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("pz_end_date not between", value1, value2, "pzEndDate");
            return (Criteria) this;
        }

        public Criteria andForfeitInterestIsNull() {
            addCriterion("forfeit_interest is null");
            return (Criteria) this;
        }

        public Criteria andForfeitInterestIsNotNull() {
            addCriterion("forfeit_interest is not null");
            return (Criteria) this;
        }

        public Criteria andForfeitInterestEqualTo(BigDecimal value) {
            addCriterion("forfeit_interest =", value, "forfeitInterest");
            return (Criteria) this;
        }

        public Criteria andForfeitInterestNotEqualTo(BigDecimal value) {
            addCriterion("forfeit_interest <>", value, "forfeitInterest");
            return (Criteria) this;
        }

        public Criteria andForfeitInterestGreaterThan(BigDecimal value) {
            addCriterion("forfeit_interest >", value, "forfeitInterest");
            return (Criteria) this;
        }

        public Criteria andForfeitInterestGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("forfeit_interest >=", value, "forfeitInterest");
            return (Criteria) this;
        }

        public Criteria andForfeitInterestLessThan(BigDecimal value) {
            addCriterion("forfeit_interest <", value, "forfeitInterest");
            return (Criteria) this;
        }

        public Criteria andForfeitInterestLessThanOrEqualTo(BigDecimal value) {
            addCriterion("forfeit_interest <=", value, "forfeitInterest");
            return (Criteria) this;
        }

        public Criteria andForfeitInterestIn(List<BigDecimal> values) {
            addCriterion("forfeit_interest in", values, "forfeitInterest");
            return (Criteria) this;
        }

        public Criteria andForfeitInterestNotIn(List<BigDecimal> values) {
            addCriterion("forfeit_interest not in", values, "forfeitInterest");
            return (Criteria) this;
        }

        public Criteria andForfeitInterestBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("forfeit_interest between", value1, value2, "forfeitInterest");
            return (Criteria) this;
        }

        public Criteria andForfeitInterestNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("forfeit_interest not between", value1, value2, "forfeitInterest");
            return (Criteria) this;
        }

        public Criteria andHashVersionIsNull() {
            addCriterion("hash_version is null");
            return (Criteria) this;
        }

        public Criteria andHashVersionIsNotNull() {
            addCriterion("hash_version is not null");
            return (Criteria) this;
        }

        public Criteria andHashVersionEqualTo(Short value) {
            addCriterion("hash_version =", value, "hashVersion");
            return (Criteria) this;
        }

        public Criteria andHashVersionNotEqualTo(Short value) {
            addCriterion("hash_version <>", value, "hashVersion");
            return (Criteria) this;
        }

        public Criteria andHashVersionGreaterThan(Short value) {
            addCriterion("hash_version >", value, "hashVersion");
            return (Criteria) this;
        }

        public Criteria andHashVersionGreaterThanOrEqualTo(Short value) {
            addCriterion("hash_version >=", value, "hashVersion");
            return (Criteria) this;
        }

        public Criteria andHashVersionLessThan(Short value) {
            addCriterion("hash_version <", value, "hashVersion");
            return (Criteria) this;
        }

        public Criteria andHashVersionLessThanOrEqualTo(Short value) {
            addCriterion("hash_version <=", value, "hashVersion");
            return (Criteria) this;
        }

        public Criteria andHashVersionIn(List<Short> values) {
            addCriterion("hash_version in", values, "hashVersion");
            return (Criteria) this;
        }

        public Criteria andHashVersionNotIn(List<Short> values) {
            addCriterion("hash_version not in", values, "hashVersion");
            return (Criteria) this;
        }

        public Criteria andHashVersionBetween(Short value1, Short value2) {
            addCriterion("hash_version between", value1, value2, "hashVersion");
            return (Criteria) this;
        }

        public Criteria andHashVersionNotBetween(Short value1, Short value2) {
            addCriterion("hash_version not between", value1, value2, "hashVersion");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNull() {
            addCriterion("updatetime is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNotNull() {
            addCriterion("updatetime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeEqualTo(Date value) {
            addCriterion("updatetime =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(Date value) {
            addCriterion("updatetime <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(Date value) {
            addCriterion("updatetime >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("updatetime >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(Date value) {
            addCriterion("updatetime <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("updatetime <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<Date> values) {
            addCriterion("updatetime in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<Date> values) {
            addCriterion("updatetime not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("updatetime between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("updatetime not between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andAddtimeIsNull() {
            addCriterion("addtime is null");
            return (Criteria) this;
        }

        public Criteria andAddtimeIsNotNull() {
            addCriterion("addtime is not null");
            return (Criteria) this;
        }

        public Criteria andAddtimeEqualTo(Date value) {
            addCriterion("addtime =", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotEqualTo(Date value) {
            addCriterion("addtime <>", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeGreaterThan(Date value) {
            addCriterion("addtime >", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("addtime >=", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeLessThan(Date value) {
            addCriterion("addtime <", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeLessThanOrEqualTo(Date value) {
            addCriterion("addtime <=", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeIn(List<Date> values) {
            addCriterion("addtime in", values, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotIn(List<Date> values) {
            addCriterion("addtime not in", values, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeBetween(Date value1, Date value2) {
            addCriterion("addtime between", value1, value2, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotBetween(Date value1, Date value2) {
            addCriterion("addtime not between", value1, value2, "addtime");
            return (Criteria) this;
        }

        public Criteria andChannelCodeIsNull() {
            addCriterion("channel_code is null");
            return (Criteria) this;
        }

        public Criteria andChannelCodeIsNotNull() {
            addCriterion("channel_code is not null");
            return (Criteria) this;
        }

        public Criteria andChannelCodeEqualTo(String value) {
            addCriterion("channel_code =", value, "channelCode");
            return (Criteria) this;
        }

        public Criteria andChannelCodeNotEqualTo(String value) {
            addCriterion("channel_code <>", value, "channelCode");
            return (Criteria) this;
        }

        public Criteria andChannelCodeGreaterThan(String value) {
            addCriterion("channel_code >", value, "channelCode");
            return (Criteria) this;
        }

        public Criteria andChannelCodeGreaterThanOrEqualTo(String value) {
            addCriterion("channel_code >=", value, "channelCode");
            return (Criteria) this;
        }

        public Criteria andChannelCodeLessThan(String value) {
            addCriterion("channel_code <", value, "channelCode");
            return (Criteria) this;
        }

        public Criteria andChannelCodeLessThanOrEqualTo(String value) {
            addCriterion("channel_code <=", value, "channelCode");
            return (Criteria) this;
        }

        public Criteria andChannelCodeLike(String value) {
            addCriterion("channel_code like", value, "channelCode");
            return (Criteria) this;
        }

        public Criteria andChannelCodeNotLike(String value) {
            addCriterion("channel_code not like", value, "channelCode");
            return (Criteria) this;
        }

        public Criteria andChannelCodeIn(List<String> values) {
            addCriterion("channel_code in", values, "channelCode");
            return (Criteria) this;
        }

        public Criteria andChannelCodeNotIn(List<String> values) {
            addCriterion("channel_code not in", values, "channelCode");
            return (Criteria) this;
        }

        public Criteria andChannelCodeBetween(String value1, String value2) {
            addCriterion("channel_code between", value1, value2, "channelCode");
            return (Criteria) this;
        }

        public Criteria andChannelCodeNotBetween(String value1, String value2) {
            addCriterion("channel_code not between", value1, value2, "channelCode");
            return (Criteria) this;
        }

        public Criteria andSubChannelCodeIsNull() {
            addCriterion("sub_channel_code is null");
            return (Criteria) this;
        }

        public Criteria andSubChannelCodeIsNotNull() {
            addCriterion("sub_channel_code is not null");
            return (Criteria) this;
        }

        public Criteria andSubChannelCodeEqualTo(String value) {
            addCriterion("sub_channel_code =", value, "subChannelCode");
            return (Criteria) this;
        }

        public Criteria andSubChannelCodeNotEqualTo(String value) {
            addCriterion("sub_channel_code <>", value, "subChannelCode");
            return (Criteria) this;
        }

        public Criteria andSubChannelCodeGreaterThan(String value) {
            addCriterion("sub_channel_code >", value, "subChannelCode");
            return (Criteria) this;
        }

        public Criteria andSubChannelCodeGreaterThanOrEqualTo(String value) {
            addCriterion("sub_channel_code >=", value, "subChannelCode");
            return (Criteria) this;
        }

        public Criteria andSubChannelCodeLessThan(String value) {
            addCriterion("sub_channel_code <", value, "subChannelCode");
            return (Criteria) this;
        }

        public Criteria andSubChannelCodeLessThanOrEqualTo(String value) {
            addCriterion("sub_channel_code <=", value, "subChannelCode");
            return (Criteria) this;
        }

        public Criteria andSubChannelCodeLike(String value) {
            addCriterion("sub_channel_code like", value, "subChannelCode");
            return (Criteria) this;
        }

        public Criteria andSubChannelCodeNotLike(String value) {
            addCriterion("sub_channel_code not like", value, "subChannelCode");
            return (Criteria) this;
        }

        public Criteria andSubChannelCodeIn(List<String> values) {
            addCriterion("sub_channel_code in", values, "subChannelCode");
            return (Criteria) this;
        }

        public Criteria andSubChannelCodeNotIn(List<String> values) {
            addCriterion("sub_channel_code not in", values, "subChannelCode");
            return (Criteria) this;
        }

        public Criteria andSubChannelCodeBetween(String value1, String value2) {
            addCriterion("sub_channel_code between", value1, value2, "subChannelCode");
            return (Criteria) this;
        }

        public Criteria andSubChannelCodeNotBetween(String value1, String value2) {
            addCriterion("sub_channel_code not between", value1, value2, "subChannelCode");
            return (Criteria) this;
        }

        public Criteria andUmbrellaIdIsNull() {
            addCriterion("umbrella_id is null");
            return (Criteria) this;
        }

        public Criteria andUmbrellaIdIsNotNull() {
            addCriterion("umbrella_id is not null");
            return (Criteria) this;
        }

        public Criteria andUmbrellaIdEqualTo(Integer value) {
            addCriterion("umbrella_id =", value, "umbrellaId");
            return (Criteria) this;
        }

        public Criteria andUmbrellaIdNotEqualTo(Integer value) {
            addCriterion("umbrella_id <>", value, "umbrellaId");
            return (Criteria) this;
        }

        public Criteria andUmbrellaIdGreaterThan(Integer value) {
            addCriterion("umbrella_id >", value, "umbrellaId");
            return (Criteria) this;
        }

        public Criteria andUmbrellaIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("umbrella_id >=", value, "umbrellaId");
            return (Criteria) this;
        }

        public Criteria andUmbrellaIdLessThan(Integer value) {
            addCriterion("umbrella_id <", value, "umbrellaId");
            return (Criteria) this;
        }

        public Criteria andUmbrellaIdLessThanOrEqualTo(Integer value) {
            addCriterion("umbrella_id <=", value, "umbrellaId");
            return (Criteria) this;
        }

        public Criteria andUmbrellaIdIn(List<Integer> values) {
            addCriterion("umbrella_id in", values, "umbrellaId");
            return (Criteria) this;
        }

        public Criteria andUmbrellaIdNotIn(List<Integer> values) {
            addCriterion("umbrella_id not in", values, "umbrellaId");
            return (Criteria) this;
        }

        public Criteria andUmbrellaIdBetween(Integer value1, Integer value2) {
            addCriterion("umbrella_id between", value1, value2, "umbrellaId");
            return (Criteria) this;
        }

        public Criteria andUmbrellaIdNotBetween(Integer value1, Integer value2) {
            addCriterion("umbrella_id not between", value1, value2, "umbrellaId");
            return (Criteria) this;
        }

        public Criteria andSourceIsNull() {
            addCriterion("source is null");
            return (Criteria) this;
        }

        public Criteria andSourceIsNotNull() {
            addCriterion("source is not null");
            return (Criteria) this;
        }

        public Criteria andSourceEqualTo(Boolean value) {
            addCriterion("source =", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotEqualTo(Boolean value) {
            addCriterion("source <>", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThan(Boolean value) {
            addCriterion("source >", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThanOrEqualTo(Boolean value) {
            addCriterion("source >=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThan(Boolean value) {
            addCriterion("source <", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThanOrEqualTo(Boolean value) {
            addCriterion("source <=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceIn(List<Boolean> values) {
            addCriterion("source in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotIn(List<Boolean> values) {
            addCriterion("source not in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceBetween(Boolean value1, Boolean value2) {
            addCriterion("source between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotBetween(Boolean value1, Boolean value2) {
            addCriterion("source not between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andBeforRiskAssureMoneyIsNull() {
            addCriterion("befor_risk_assure_money is null");
            return (Criteria) this;
        }

        public Criteria andBeforRiskAssureMoneyIsNotNull() {
            addCriterion("befor_risk_assure_money is not null");
            return (Criteria) this;
        }

        public Criteria andBeforRiskAssureMoneyEqualTo(BigDecimal value) {
            addCriterion("befor_risk_assure_money =", value, "beforRiskAssureMoney");
            return (Criteria) this;
        }

        public Criteria andBeforRiskAssureMoneyNotEqualTo(BigDecimal value) {
            addCriterion("befor_risk_assure_money <>", value, "beforRiskAssureMoney");
            return (Criteria) this;
        }

        public Criteria andBeforRiskAssureMoneyGreaterThan(BigDecimal value) {
            addCriterion("befor_risk_assure_money >", value, "beforRiskAssureMoney");
            return (Criteria) this;
        }

        public Criteria andBeforRiskAssureMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("befor_risk_assure_money >=", value, "beforRiskAssureMoney");
            return (Criteria) this;
        }

        public Criteria andBeforRiskAssureMoneyLessThan(BigDecimal value) {
            addCriterion("befor_risk_assure_money <", value, "beforRiskAssureMoney");
            return (Criteria) this;
        }

        public Criteria andBeforRiskAssureMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("befor_risk_assure_money <=", value, "beforRiskAssureMoney");
            return (Criteria) this;
        }

        public Criteria andBeforRiskAssureMoneyIn(List<BigDecimal> values) {
            addCriterion("befor_risk_assure_money in", values, "beforRiskAssureMoney");
            return (Criteria) this;
        }

        public Criteria andBeforRiskAssureMoneyNotIn(List<BigDecimal> values) {
            addCriterion("befor_risk_assure_money not in", values, "beforRiskAssureMoney");
            return (Criteria) this;
        }

        public Criteria andBeforRiskAssureMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("befor_risk_assure_money between", value1, value2, "beforRiskAssureMoney");
            return (Criteria) this;
        }

        public Criteria andBeforRiskAssureMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("befor_risk_assure_money not between", value1, value2, "beforRiskAssureMoney");
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