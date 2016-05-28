package mybatis.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TradeOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TradeOrderExample() {
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

        public Criteria andDtTradeIdIsNull() {
            addCriterion("dt_trade_id is null");
            return (Criteria) this;
        }

        public Criteria andDtTradeIdIsNotNull() {
            addCriterion("dt_trade_id is not null");
            return (Criteria) this;
        }

        public Criteria andDtTradeIdEqualTo(Integer value) {
            addCriterion("dt_trade_id =", value, "dtTradeId");
            return (Criteria) this;
        }

        public Criteria andDtTradeIdNotEqualTo(Integer value) {
            addCriterion("dt_trade_id <>", value, "dtTradeId");
            return (Criteria) this;
        }

        public Criteria andDtTradeIdGreaterThan(Integer value) {
            addCriterion("dt_trade_id >", value, "dtTradeId");
            return (Criteria) this;
        }

        public Criteria andDtTradeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("dt_trade_id >=", value, "dtTradeId");
            return (Criteria) this;
        }

        public Criteria andDtTradeIdLessThan(Integer value) {
            addCriterion("dt_trade_id <", value, "dtTradeId");
            return (Criteria) this;
        }

        public Criteria andDtTradeIdLessThanOrEqualTo(Integer value) {
            addCriterion("dt_trade_id <=", value, "dtTradeId");
            return (Criteria) this;
        }

        public Criteria andDtTradeIdIn(List<Integer> values) {
            addCriterion("dt_trade_id in", values, "dtTradeId");
            return (Criteria) this;
        }

        public Criteria andDtTradeIdNotIn(List<Integer> values) {
            addCriterion("dt_trade_id not in", values, "dtTradeId");
            return (Criteria) this;
        }

        public Criteria andDtTradeIdBetween(Integer value1, Integer value2) {
            addCriterion("dt_trade_id between", value1, value2, "dtTradeId");
            return (Criteria) this;
        }

        public Criteria andDtTradeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("dt_trade_id not between", value1, value2, "dtTradeId");
            return (Criteria) this;
        }

        public Criteria andTradeAccountCodeIsNull() {
            addCriterion("trade_account_code is null");
            return (Criteria) this;
        }

        public Criteria andTradeAccountCodeIsNotNull() {
            addCriterion("trade_account_code is not null");
            return (Criteria) this;
        }

        public Criteria andTradeAccountCodeEqualTo(String value) {
            addCriterion("trade_account_code =", value, "tradeAccountCode");
            return (Criteria) this;
        }

        public Criteria andTradeAccountCodeNotEqualTo(String value) {
            addCriterion("trade_account_code <>", value, "tradeAccountCode");
            return (Criteria) this;
        }

        public Criteria andTradeAccountCodeGreaterThan(String value) {
            addCriterion("trade_account_code >", value, "tradeAccountCode");
            return (Criteria) this;
        }

        public Criteria andTradeAccountCodeGreaterThanOrEqualTo(String value) {
            addCriterion("trade_account_code >=", value, "tradeAccountCode");
            return (Criteria) this;
        }

        public Criteria andTradeAccountCodeLessThan(String value) {
            addCriterion("trade_account_code <", value, "tradeAccountCode");
            return (Criteria) this;
        }

        public Criteria andTradeAccountCodeLessThanOrEqualTo(String value) {
            addCriterion("trade_account_code <=", value, "tradeAccountCode");
            return (Criteria) this;
        }

        public Criteria andTradeAccountCodeLike(String value) {
            addCriterion("trade_account_code like", value, "tradeAccountCode");
            return (Criteria) this;
        }

        public Criteria andTradeAccountCodeNotLike(String value) {
            addCriterion("trade_account_code not like", value, "tradeAccountCode");
            return (Criteria) this;
        }

        public Criteria andTradeAccountCodeIn(List<String> values) {
            addCriterion("trade_account_code in", values, "tradeAccountCode");
            return (Criteria) this;
        }

        public Criteria andTradeAccountCodeNotIn(List<String> values) {
            addCriterion("trade_account_code not in", values, "tradeAccountCode");
            return (Criteria) this;
        }

        public Criteria andTradeAccountCodeBetween(String value1, String value2) {
            addCriterion("trade_account_code between", value1, value2, "tradeAccountCode");
            return (Criteria) this;
        }

        public Criteria andTradeAccountCodeNotBetween(String value1, String value2) {
            addCriterion("trade_account_code not between", value1, value2, "tradeAccountCode");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIsNull() {
            addCriterion("order_type is null");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIsNotNull() {
            addCriterion("order_type is not null");
            return (Criteria) this;
        }

        public Criteria andOrderTypeEqualTo(String value) {
            addCriterion("order_type =", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotEqualTo(String value) {
            addCriterion("order_type <>", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeGreaterThan(String value) {
            addCriterion("order_type >", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeGreaterThanOrEqualTo(String value) {
            addCriterion("order_type >=", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLessThan(String value) {
            addCriterion("order_type <", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLessThanOrEqualTo(String value) {
            addCriterion("order_type <=", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLike(String value) {
            addCriterion("order_type like", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotLike(String value) {
            addCriterion("order_type not like", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIn(List<String> values) {
            addCriterion("order_type in", values, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotIn(List<String> values) {
            addCriterion("order_type not in", values, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeBetween(String value1, String value2) {
            addCriterion("order_type between", value1, value2, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotBetween(String value1, String value2) {
            addCriterion("order_type not between", value1, value2, "orderType");
            return (Criteria) this;
        }

        public Criteria andMarketCodeIsNull() {
            addCriterion("market_code is null");
            return (Criteria) this;
        }

        public Criteria andMarketCodeIsNotNull() {
            addCriterion("market_code is not null");
            return (Criteria) this;
        }

        public Criteria andMarketCodeEqualTo(String value) {
            addCriterion("market_code =", value, "marketCode");
            return (Criteria) this;
        }

        public Criteria andMarketCodeNotEqualTo(String value) {
            addCriterion("market_code <>", value, "marketCode");
            return (Criteria) this;
        }

        public Criteria andMarketCodeGreaterThan(String value) {
            addCriterion("market_code >", value, "marketCode");
            return (Criteria) this;
        }

        public Criteria andMarketCodeGreaterThanOrEqualTo(String value) {
            addCriterion("market_code >=", value, "marketCode");
            return (Criteria) this;
        }

        public Criteria andMarketCodeLessThan(String value) {
            addCriterion("market_code <", value, "marketCode");
            return (Criteria) this;
        }

        public Criteria andMarketCodeLessThanOrEqualTo(String value) {
            addCriterion("market_code <=", value, "marketCode");
            return (Criteria) this;
        }

        public Criteria andMarketCodeLike(String value) {
            addCriterion("market_code like", value, "marketCode");
            return (Criteria) this;
        }

        public Criteria andMarketCodeNotLike(String value) {
            addCriterion("market_code not like", value, "marketCode");
            return (Criteria) this;
        }

        public Criteria andMarketCodeIn(List<String> values) {
            addCriterion("market_code in", values, "marketCode");
            return (Criteria) this;
        }

        public Criteria andMarketCodeNotIn(List<String> values) {
            addCriterion("market_code not in", values, "marketCode");
            return (Criteria) this;
        }

        public Criteria andMarketCodeBetween(String value1, String value2) {
            addCriterion("market_code between", value1, value2, "marketCode");
            return (Criteria) this;
        }

        public Criteria andMarketCodeNotBetween(String value1, String value2) {
            addCriterion("market_code not between", value1, value2, "marketCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeIsNull() {
            addCriterion("stock_code is null");
            return (Criteria) this;
        }

        public Criteria andStockCodeIsNotNull() {
            addCriterion("stock_code is not null");
            return (Criteria) this;
        }

        public Criteria andStockCodeEqualTo(String value) {
            addCriterion("stock_code =", value, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeNotEqualTo(String value) {
            addCriterion("stock_code <>", value, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeGreaterThan(String value) {
            addCriterion("stock_code >", value, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeGreaterThanOrEqualTo(String value) {
            addCriterion("stock_code >=", value, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeLessThan(String value) {
            addCriterion("stock_code <", value, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeLessThanOrEqualTo(String value) {
            addCriterion("stock_code <=", value, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeLike(String value) {
            addCriterion("stock_code like", value, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeNotLike(String value) {
            addCriterion("stock_code not like", value, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeIn(List<String> values) {
            addCriterion("stock_code in", values, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeNotIn(List<String> values) {
            addCriterion("stock_code not in", values, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeBetween(String value1, String value2) {
            addCriterion("stock_code between", value1, value2, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeNotBetween(String value1, String value2) {
            addCriterion("stock_code not between", value1, value2, "stockCode");
            return (Criteria) this;
        }

        public Criteria andOrderPriceIsNull() {
            addCriterion("order_price is null");
            return (Criteria) this;
        }

        public Criteria andOrderPriceIsNotNull() {
            addCriterion("order_price is not null");
            return (Criteria) this;
        }

        public Criteria andOrderPriceEqualTo(BigDecimal value) {
            addCriterion("order_price =", value, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceNotEqualTo(BigDecimal value) {
            addCriterion("order_price <>", value, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceGreaterThan(BigDecimal value) {
            addCriterion("order_price >", value, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("order_price >=", value, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceLessThan(BigDecimal value) {
            addCriterion("order_price <", value, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("order_price <=", value, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceIn(List<BigDecimal> values) {
            addCriterion("order_price in", values, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceNotIn(List<BigDecimal> values) {
            addCriterion("order_price not in", values, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("order_price between", value1, value2, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("order_price not between", value1, value2, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderQuantityIsNull() {
            addCriterion("order_quantity is null");
            return (Criteria) this;
        }

        public Criteria andOrderQuantityIsNotNull() {
            addCriterion("order_quantity is not null");
            return (Criteria) this;
        }

        public Criteria andOrderQuantityEqualTo(Integer value) {
            addCriterion("order_quantity =", value, "orderQuantity");
            return (Criteria) this;
        }

        public Criteria andOrderQuantityNotEqualTo(Integer value) {
            addCriterion("order_quantity <>", value, "orderQuantity");
            return (Criteria) this;
        }

        public Criteria andOrderQuantityGreaterThan(Integer value) {
            addCriterion("order_quantity >", value, "orderQuantity");
            return (Criteria) this;
        }

        public Criteria andOrderQuantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_quantity >=", value, "orderQuantity");
            return (Criteria) this;
        }

        public Criteria andOrderQuantityLessThan(Integer value) {
            addCriterion("order_quantity <", value, "orderQuantity");
            return (Criteria) this;
        }

        public Criteria andOrderQuantityLessThanOrEqualTo(Integer value) {
            addCriterion("order_quantity <=", value, "orderQuantity");
            return (Criteria) this;
        }

        public Criteria andOrderQuantityIn(List<Integer> values) {
            addCriterion("order_quantity in", values, "orderQuantity");
            return (Criteria) this;
        }

        public Criteria andOrderQuantityNotIn(List<Integer> values) {
            addCriterion("order_quantity not in", values, "orderQuantity");
            return (Criteria) this;
        }

        public Criteria andOrderQuantityBetween(Integer value1, Integer value2) {
            addCriterion("order_quantity between", value1, value2, "orderQuantity");
            return (Criteria) this;
        }

        public Criteria andOrderQuantityNotBetween(Integer value1, Integer value2) {
            addCriterion("order_quantity not between", value1, value2, "orderQuantity");
            return (Criteria) this;
        }

        public Criteria andOrderTimeIsNull() {
            addCriterion("order_time is null");
            return (Criteria) this;
        }

        public Criteria andOrderTimeIsNotNull() {
            addCriterion("order_time is not null");
            return (Criteria) this;
        }

        public Criteria andOrderTimeEqualTo(Integer value) {
            addCriterion("order_time =", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeNotEqualTo(Integer value) {
            addCriterion("order_time <>", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeGreaterThan(Integer value) {
            addCriterion("order_time >", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_time >=", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeLessThan(Integer value) {
            addCriterion("order_time <", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeLessThanOrEqualTo(Integer value) {
            addCriterion("order_time <=", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeIn(List<Integer> values) {
            addCriterion("order_time in", values, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeNotIn(List<Integer> values) {
            addCriterion("order_time not in", values, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeBetween(Integer value1, Integer value2) {
            addCriterion("order_time between", value1, value2, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("order_time not between", value1, value2, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTradeSnIsNull() {
            addCriterion("order_trade_sn is null");
            return (Criteria) this;
        }

        public Criteria andOrderTradeSnIsNotNull() {
            addCriterion("order_trade_sn is not null");
            return (Criteria) this;
        }

        public Criteria andOrderTradeSnEqualTo(String value) {
            addCriterion("order_trade_sn =", value, "orderTradeSn");
            return (Criteria) this;
        }

        public Criteria andOrderTradeSnNotEqualTo(String value) {
            addCriterion("order_trade_sn <>", value, "orderTradeSn");
            return (Criteria) this;
        }

        public Criteria andOrderTradeSnGreaterThan(String value) {
            addCriterion("order_trade_sn >", value, "orderTradeSn");
            return (Criteria) this;
        }

        public Criteria andOrderTradeSnGreaterThanOrEqualTo(String value) {
            addCriterion("order_trade_sn >=", value, "orderTradeSn");
            return (Criteria) this;
        }

        public Criteria andOrderTradeSnLessThan(String value) {
            addCriterion("order_trade_sn <", value, "orderTradeSn");
            return (Criteria) this;
        }

        public Criteria andOrderTradeSnLessThanOrEqualTo(String value) {
            addCriterion("order_trade_sn <=", value, "orderTradeSn");
            return (Criteria) this;
        }

        public Criteria andOrderTradeSnLike(String value) {
            addCriterion("order_trade_sn like", value, "orderTradeSn");
            return (Criteria) this;
        }

        public Criteria andOrderTradeSnNotLike(String value) {
            addCriterion("order_trade_sn not like", value, "orderTradeSn");
            return (Criteria) this;
        }

        public Criteria andOrderTradeSnIn(List<String> values) {
            addCriterion("order_trade_sn in", values, "orderTradeSn");
            return (Criteria) this;
        }

        public Criteria andOrderTradeSnNotIn(List<String> values) {
            addCriterion("order_trade_sn not in", values, "orderTradeSn");
            return (Criteria) this;
        }

        public Criteria andOrderTradeSnBetween(String value1, String value2) {
            addCriterion("order_trade_sn between", value1, value2, "orderTradeSn");
            return (Criteria) this;
        }

        public Criteria andOrderTradeSnNotBetween(String value1, String value2) {
            addCriterion("order_trade_sn not between", value1, value2, "orderTradeSn");
            return (Criteria) this;
        }

        public Criteria andClinchPriceIsNull() {
            addCriterion("clinch_price is null");
            return (Criteria) this;
        }

        public Criteria andClinchPriceIsNotNull() {
            addCriterion("clinch_price is not null");
            return (Criteria) this;
        }

        public Criteria andClinchPriceEqualTo(BigDecimal value) {
            addCriterion("clinch_price =", value, "clinchPrice");
            return (Criteria) this;
        }

        public Criteria andClinchPriceNotEqualTo(BigDecimal value) {
            addCriterion("clinch_price <>", value, "clinchPrice");
            return (Criteria) this;
        }

        public Criteria andClinchPriceGreaterThan(BigDecimal value) {
            addCriterion("clinch_price >", value, "clinchPrice");
            return (Criteria) this;
        }

        public Criteria andClinchPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("clinch_price >=", value, "clinchPrice");
            return (Criteria) this;
        }

        public Criteria andClinchPriceLessThan(BigDecimal value) {
            addCriterion("clinch_price <", value, "clinchPrice");
            return (Criteria) this;
        }

        public Criteria andClinchPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("clinch_price <=", value, "clinchPrice");
            return (Criteria) this;
        }

        public Criteria andClinchPriceIn(List<BigDecimal> values) {
            addCriterion("clinch_price in", values, "clinchPrice");
            return (Criteria) this;
        }

        public Criteria andClinchPriceNotIn(List<BigDecimal> values) {
            addCriterion("clinch_price not in", values, "clinchPrice");
            return (Criteria) this;
        }

        public Criteria andClinchPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("clinch_price between", value1, value2, "clinchPrice");
            return (Criteria) this;
        }

        public Criteria andClinchPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("clinch_price not between", value1, value2, "clinchPrice");
            return (Criteria) this;
        }

        public Criteria andClinchQuantityIsNull() {
            addCriterion("clinch_quantity is null");
            return (Criteria) this;
        }

        public Criteria andClinchQuantityIsNotNull() {
            addCriterion("clinch_quantity is not null");
            return (Criteria) this;
        }

        public Criteria andClinchQuantityEqualTo(Integer value) {
            addCriterion("clinch_quantity =", value, "clinchQuantity");
            return (Criteria) this;
        }

        public Criteria andClinchQuantityNotEqualTo(Integer value) {
            addCriterion("clinch_quantity <>", value, "clinchQuantity");
            return (Criteria) this;
        }

        public Criteria andClinchQuantityGreaterThan(Integer value) {
            addCriterion("clinch_quantity >", value, "clinchQuantity");
            return (Criteria) this;
        }

        public Criteria andClinchQuantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("clinch_quantity >=", value, "clinchQuantity");
            return (Criteria) this;
        }

        public Criteria andClinchQuantityLessThan(Integer value) {
            addCriterion("clinch_quantity <", value, "clinchQuantity");
            return (Criteria) this;
        }

        public Criteria andClinchQuantityLessThanOrEqualTo(Integer value) {
            addCriterion("clinch_quantity <=", value, "clinchQuantity");
            return (Criteria) this;
        }

        public Criteria andClinchQuantityIn(List<Integer> values) {
            addCriterion("clinch_quantity in", values, "clinchQuantity");
            return (Criteria) this;
        }

        public Criteria andClinchQuantityNotIn(List<Integer> values) {
            addCriterion("clinch_quantity not in", values, "clinchQuantity");
            return (Criteria) this;
        }

        public Criteria andClinchQuantityBetween(Integer value1, Integer value2) {
            addCriterion("clinch_quantity between", value1, value2, "clinchQuantity");
            return (Criteria) this;
        }

        public Criteria andClinchQuantityNotBetween(Integer value1, Integer value2) {
            addCriterion("clinch_quantity not between", value1, value2, "clinchQuantity");
            return (Criteria) this;
        }

        public Criteria andClinchTimeIsNull() {
            addCriterion("clinch_time is null");
            return (Criteria) this;
        }

        public Criteria andClinchTimeIsNotNull() {
            addCriterion("clinch_time is not null");
            return (Criteria) this;
        }

        public Criteria andClinchTimeEqualTo(Integer value) {
            addCriterion("clinch_time =", value, "clinchTime");
            return (Criteria) this;
        }

        public Criteria andClinchTimeNotEqualTo(Integer value) {
            addCriterion("clinch_time <>", value, "clinchTime");
            return (Criteria) this;
        }

        public Criteria andClinchTimeGreaterThan(Integer value) {
            addCriterion("clinch_time >", value, "clinchTime");
            return (Criteria) this;
        }

        public Criteria andClinchTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("clinch_time >=", value, "clinchTime");
            return (Criteria) this;
        }

        public Criteria andClinchTimeLessThan(Integer value) {
            addCriterion("clinch_time <", value, "clinchTime");
            return (Criteria) this;
        }

        public Criteria andClinchTimeLessThanOrEqualTo(Integer value) {
            addCriterion("clinch_time <=", value, "clinchTime");
            return (Criteria) this;
        }

        public Criteria andClinchTimeIn(List<Integer> values) {
            addCriterion("clinch_time in", values, "clinchTime");
            return (Criteria) this;
        }

        public Criteria andClinchTimeNotIn(List<Integer> values) {
            addCriterion("clinch_time not in", values, "clinchTime");
            return (Criteria) this;
        }

        public Criteria andClinchTimeBetween(Integer value1, Integer value2) {
            addCriterion("clinch_time between", value1, value2, "clinchTime");
            return (Criteria) this;
        }

        public Criteria andClinchTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("clinch_time not between", value1, value2, "clinchTime");
            return (Criteria) this;
        }

        public Criteria andProcedureFeeIsNull() {
            addCriterion("procedure_fee is null");
            return (Criteria) this;
        }

        public Criteria andProcedureFeeIsNotNull() {
            addCriterion("procedure_fee is not null");
            return (Criteria) this;
        }

        public Criteria andProcedureFeeEqualTo(BigDecimal value) {
            addCriterion("procedure_fee =", value, "procedureFee");
            return (Criteria) this;
        }

        public Criteria andProcedureFeeNotEqualTo(BigDecimal value) {
            addCriterion("procedure_fee <>", value, "procedureFee");
            return (Criteria) this;
        }

        public Criteria andProcedureFeeGreaterThan(BigDecimal value) {
            addCriterion("procedure_fee >", value, "procedureFee");
            return (Criteria) this;
        }

        public Criteria andProcedureFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("procedure_fee >=", value, "procedureFee");
            return (Criteria) this;
        }

        public Criteria andProcedureFeeLessThan(BigDecimal value) {
            addCriterion("procedure_fee <", value, "procedureFee");
            return (Criteria) this;
        }

        public Criteria andProcedureFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("procedure_fee <=", value, "procedureFee");
            return (Criteria) this;
        }

        public Criteria andProcedureFeeIn(List<BigDecimal> values) {
            addCriterion("procedure_fee in", values, "procedureFee");
            return (Criteria) this;
        }

        public Criteria andProcedureFeeNotIn(List<BigDecimal> values) {
            addCriterion("procedure_fee not in", values, "procedureFee");
            return (Criteria) this;
        }

        public Criteria andProcedureFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("procedure_fee between", value1, value2, "procedureFee");
            return (Criteria) this;
        }

        public Criteria andProcedureFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("procedure_fee not between", value1, value2, "procedureFee");
            return (Criteria) this;
        }

        public Criteria andTransferFeeIsNull() {
            addCriterion("transfer_fee is null");
            return (Criteria) this;
        }

        public Criteria andTransferFeeIsNotNull() {
            addCriterion("transfer_fee is not null");
            return (Criteria) this;
        }

        public Criteria andTransferFeeEqualTo(BigDecimal value) {
            addCriterion("transfer_fee =", value, "transferFee");
            return (Criteria) this;
        }

        public Criteria andTransferFeeNotEqualTo(BigDecimal value) {
            addCriterion("transfer_fee <>", value, "transferFee");
            return (Criteria) this;
        }

        public Criteria andTransferFeeGreaterThan(BigDecimal value) {
            addCriterion("transfer_fee >", value, "transferFee");
            return (Criteria) this;
        }

        public Criteria andTransferFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("transfer_fee >=", value, "transferFee");
            return (Criteria) this;
        }

        public Criteria andTransferFeeLessThan(BigDecimal value) {
            addCriterion("transfer_fee <", value, "transferFee");
            return (Criteria) this;
        }

        public Criteria andTransferFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("transfer_fee <=", value, "transferFee");
            return (Criteria) this;
        }

        public Criteria andTransferFeeIn(List<BigDecimal> values) {
            addCriterion("transfer_fee in", values, "transferFee");
            return (Criteria) this;
        }

        public Criteria andTransferFeeNotIn(List<BigDecimal> values) {
            addCriterion("transfer_fee not in", values, "transferFee");
            return (Criteria) this;
        }

        public Criteria andTransferFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("transfer_fee between", value1, value2, "transferFee");
            return (Criteria) this;
        }

        public Criteria andTransferFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("transfer_fee not between", value1, value2, "transferFee");
            return (Criteria) this;
        }

        public Criteria andStampTaxFeeIsNull() {
            addCriterion("stamp_tax_fee is null");
            return (Criteria) this;
        }

        public Criteria andStampTaxFeeIsNotNull() {
            addCriterion("stamp_tax_fee is not null");
            return (Criteria) this;
        }

        public Criteria andStampTaxFeeEqualTo(BigDecimal value) {
            addCriterion("stamp_tax_fee =", value, "stampTaxFee");
            return (Criteria) this;
        }

        public Criteria andStampTaxFeeNotEqualTo(BigDecimal value) {
            addCriterion("stamp_tax_fee <>", value, "stampTaxFee");
            return (Criteria) this;
        }

        public Criteria andStampTaxFeeGreaterThan(BigDecimal value) {
            addCriterion("stamp_tax_fee >", value, "stampTaxFee");
            return (Criteria) this;
        }

        public Criteria andStampTaxFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("stamp_tax_fee >=", value, "stampTaxFee");
            return (Criteria) this;
        }

        public Criteria andStampTaxFeeLessThan(BigDecimal value) {
            addCriterion("stamp_tax_fee <", value, "stampTaxFee");
            return (Criteria) this;
        }

        public Criteria andStampTaxFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("stamp_tax_fee <=", value, "stampTaxFee");
            return (Criteria) this;
        }

        public Criteria andStampTaxFeeIn(List<BigDecimal> values) {
            addCriterion("stamp_tax_fee in", values, "stampTaxFee");
            return (Criteria) this;
        }

        public Criteria andStampTaxFeeNotIn(List<BigDecimal> values) {
            addCriterion("stamp_tax_fee not in", values, "stampTaxFee");
            return (Criteria) this;
        }

        public Criteria andStampTaxFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("stamp_tax_fee between", value1, value2, "stampTaxFee");
            return (Criteria) this;
        }

        public Criteria andStampTaxFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("stamp_tax_fee not between", value1, value2, "stampTaxFee");
            return (Criteria) this;
        }

        public Criteria andNoticeStatusIsNull() {
            addCriterion("notice_status is null");
            return (Criteria) this;
        }

        public Criteria andNoticeStatusIsNotNull() {
            addCriterion("notice_status is not null");
            return (Criteria) this;
        }

        public Criteria andNoticeStatusEqualTo(Byte value) {
            addCriterion("notice_status =", value, "noticeStatus");
            return (Criteria) this;
        }

        public Criteria andNoticeStatusNotEqualTo(Byte value) {
            addCriterion("notice_status <>", value, "noticeStatus");
            return (Criteria) this;
        }

        public Criteria andNoticeStatusGreaterThan(Byte value) {
            addCriterion("notice_status >", value, "noticeStatus");
            return (Criteria) this;
        }

        public Criteria andNoticeStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("notice_status >=", value, "noticeStatus");
            return (Criteria) this;
        }

        public Criteria andNoticeStatusLessThan(Byte value) {
            addCriterion("notice_status <", value, "noticeStatus");
            return (Criteria) this;
        }

        public Criteria andNoticeStatusLessThanOrEqualTo(Byte value) {
            addCriterion("notice_status <=", value, "noticeStatus");
            return (Criteria) this;
        }

        public Criteria andNoticeStatusIn(List<Byte> values) {
            addCriterion("notice_status in", values, "noticeStatus");
            return (Criteria) this;
        }

        public Criteria andNoticeStatusNotIn(List<Byte> values) {
            addCriterion("notice_status not in", values, "noticeStatus");
            return (Criteria) this;
        }

        public Criteria andNoticeStatusBetween(Byte value1, Byte value2) {
            addCriterion("notice_status between", value1, value2, "noticeStatus");
            return (Criteria) this;
        }

        public Criteria andNoticeStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("notice_status not between", value1, value2, "noticeStatus");
            return (Criteria) this;
        }

        public Criteria andNoticeTimeIsNull() {
            addCriterion("notice_time is null");
            return (Criteria) this;
        }

        public Criteria andNoticeTimeIsNotNull() {
            addCriterion("notice_time is not null");
            return (Criteria) this;
        }

        public Criteria andNoticeTimeEqualTo(Integer value) {
            addCriterion("notice_time =", value, "noticeTime");
            return (Criteria) this;
        }

        public Criteria andNoticeTimeNotEqualTo(Integer value) {
            addCriterion("notice_time <>", value, "noticeTime");
            return (Criteria) this;
        }

        public Criteria andNoticeTimeGreaterThan(Integer value) {
            addCriterion("notice_time >", value, "noticeTime");
            return (Criteria) this;
        }

        public Criteria andNoticeTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("notice_time >=", value, "noticeTime");
            return (Criteria) this;
        }

        public Criteria andNoticeTimeLessThan(Integer value) {
            addCriterion("notice_time <", value, "noticeTime");
            return (Criteria) this;
        }

        public Criteria andNoticeTimeLessThanOrEqualTo(Integer value) {
            addCriterion("notice_time <=", value, "noticeTime");
            return (Criteria) this;
        }

        public Criteria andNoticeTimeIn(List<Integer> values) {
            addCriterion("notice_time in", values, "noticeTime");
            return (Criteria) this;
        }

        public Criteria andNoticeTimeNotIn(List<Integer> values) {
            addCriterion("notice_time not in", values, "noticeTime");
            return (Criteria) this;
        }

        public Criteria andNoticeTimeBetween(Integer value1, Integer value2) {
            addCriterion("notice_time between", value1, value2, "noticeTime");
            return (Criteria) this;
        }

        public Criteria andNoticeTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("notice_time not between", value1, value2, "noticeTime");
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

        public Criteria andOrderStatusEqualTo(Byte value) {
            addCriterion("order_status =", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotEqualTo(Byte value) {
            addCriterion("order_status <>", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThan(Byte value) {
            addCriterion("order_status >", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("order_status >=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThan(Byte value) {
            addCriterion("order_status <", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThanOrEqualTo(Byte value) {
            addCriterion("order_status <=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIn(List<Byte> values) {
            addCriterion("order_status in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotIn(List<Byte> values) {
            addCriterion("order_status not in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusBetween(Byte value1, Byte value2) {
            addCriterion("order_status between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("order_status not between", value1, value2, "orderStatus");
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