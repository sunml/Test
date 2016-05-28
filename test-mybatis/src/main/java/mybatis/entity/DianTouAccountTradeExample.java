package mybatis.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DianTouAccountTradeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DianTouAccountTradeExample() {
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

        public Criteria andDtTradeIdEqualTo(String value) {
            addCriterion("dt_trade_id =", value, "dtTradeId");
            return (Criteria) this;
        }

        public Criteria andDtTradeIdNotEqualTo(String value) {
            addCriterion("dt_trade_id <>", value, "dtTradeId");
            return (Criteria) this;
        }

        public Criteria andDtTradeIdGreaterThan(String value) {
            addCriterion("dt_trade_id >", value, "dtTradeId");
            return (Criteria) this;
        }

        public Criteria andDtTradeIdGreaterThanOrEqualTo(String value) {
            addCriterion("dt_trade_id >=", value, "dtTradeId");
            return (Criteria) this;
        }

        public Criteria andDtTradeIdLessThan(String value) {
            addCriterion("dt_trade_id <", value, "dtTradeId");
            return (Criteria) this;
        }

        public Criteria andDtTradeIdLessThanOrEqualTo(String value) {
            addCriterion("dt_trade_id <=", value, "dtTradeId");
            return (Criteria) this;
        }

        public Criteria andDtTradeIdLike(String value) {
            addCriterion("dt_trade_id like", value, "dtTradeId");
            return (Criteria) this;
        }

        public Criteria andDtTradeIdNotLike(String value) {
            addCriterion("dt_trade_id not like", value, "dtTradeId");
            return (Criteria) this;
        }

        public Criteria andDtTradeIdIn(List<String> values) {
            addCriterion("dt_trade_id in", values, "dtTradeId");
            return (Criteria) this;
        }

        public Criteria andDtTradeIdNotIn(List<String> values) {
            addCriterion("dt_trade_id not in", values, "dtTradeId");
            return (Criteria) this;
        }

        public Criteria andDtTradeIdBetween(String value1, String value2) {
            addCriterion("dt_trade_id between", value1, value2, "dtTradeId");
            return (Criteria) this;
        }

        public Criteria andDtTradeIdNotBetween(String value1, String value2) {
            addCriterion("dt_trade_id not between", value1, value2, "dtTradeId");
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

        public Criteria andPrincipalMoneyIsNull() {
            addCriterion("principal_money is null");
            return (Criteria) this;
        }

        public Criteria andPrincipalMoneyIsNotNull() {
            addCriterion("principal_money is not null");
            return (Criteria) this;
        }

        public Criteria andPrincipalMoneyEqualTo(BigDecimal value) {
            addCriterion("principal_money =", value, "principalMoney");
            return (Criteria) this;
        }

        public Criteria andPrincipalMoneyNotEqualTo(BigDecimal value) {
            addCriterion("principal_money <>", value, "principalMoney");
            return (Criteria) this;
        }

        public Criteria andPrincipalMoneyGreaterThan(BigDecimal value) {
            addCriterion("principal_money >", value, "principalMoney");
            return (Criteria) this;
        }

        public Criteria andPrincipalMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("principal_money >=", value, "principalMoney");
            return (Criteria) this;
        }

        public Criteria andPrincipalMoneyLessThan(BigDecimal value) {
            addCriterion("principal_money <", value, "principalMoney");
            return (Criteria) this;
        }

        public Criteria andPrincipalMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("principal_money <=", value, "principalMoney");
            return (Criteria) this;
        }

        public Criteria andPrincipalMoneyIn(List<BigDecimal> values) {
            addCriterion("principal_money in", values, "principalMoney");
            return (Criteria) this;
        }

        public Criteria andPrincipalMoneyNotIn(List<BigDecimal> values) {
            addCriterion("principal_money not in", values, "principalMoney");
            return (Criteria) this;
        }

        public Criteria andPrincipalMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("principal_money between", value1, value2, "principalMoney");
            return (Criteria) this;
        }

        public Criteria andPrincipalMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("principal_money not between", value1, value2, "principalMoney");
            return (Criteria) this;
        }

        public Criteria andRemainPrincipalMoneyIsNull() {
            addCriterion("remain_principal_money is null");
            return (Criteria) this;
        }

        public Criteria andRemainPrincipalMoneyIsNotNull() {
            addCriterion("remain_principal_money is not null");
            return (Criteria) this;
        }

        public Criteria andRemainPrincipalMoneyEqualTo(BigDecimal value) {
            addCriterion("remain_principal_money =", value, "remainPrincipalMoney");
            return (Criteria) this;
        }

        public Criteria andRemainPrincipalMoneyNotEqualTo(BigDecimal value) {
            addCriterion("remain_principal_money <>", value, "remainPrincipalMoney");
            return (Criteria) this;
        }

        public Criteria andRemainPrincipalMoneyGreaterThan(BigDecimal value) {
            addCriterion("remain_principal_money >", value, "remainPrincipalMoney");
            return (Criteria) this;
        }

        public Criteria andRemainPrincipalMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("remain_principal_money >=", value, "remainPrincipalMoney");
            return (Criteria) this;
        }

        public Criteria andRemainPrincipalMoneyLessThan(BigDecimal value) {
            addCriterion("remain_principal_money <", value, "remainPrincipalMoney");
            return (Criteria) this;
        }

        public Criteria andRemainPrincipalMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("remain_principal_money <=", value, "remainPrincipalMoney");
            return (Criteria) this;
        }

        public Criteria andRemainPrincipalMoneyIn(List<BigDecimal> values) {
            addCriterion("remain_principal_money in", values, "remainPrincipalMoney");
            return (Criteria) this;
        }

        public Criteria andRemainPrincipalMoneyNotIn(List<BigDecimal> values) {
            addCriterion("remain_principal_money not in", values, "remainPrincipalMoney");
            return (Criteria) this;
        }

        public Criteria andRemainPrincipalMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("remain_principal_money between", value1, value2, "remainPrincipalMoney");
            return (Criteria) this;
        }

        public Criteria andRemainPrincipalMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("remain_principal_money not between", value1, value2, "remainPrincipalMoney");
            return (Criteria) this;
        }

        public Criteria andBuyStrategyIsNull() {
            addCriterion("buy_strategy is null");
            return (Criteria) this;
        }

        public Criteria andBuyStrategyIsNotNull() {
            addCriterion("buy_strategy is not null");
            return (Criteria) this;
        }

        public Criteria andBuyStrategyEqualTo(Integer value) {
            addCriterion("buy_strategy =", value, "buyStrategy");
            return (Criteria) this;
        }

        public Criteria andBuyStrategyNotEqualTo(Integer value) {
            addCriterion("buy_strategy <>", value, "buyStrategy");
            return (Criteria) this;
        }

        public Criteria andBuyStrategyGreaterThan(Integer value) {
            addCriterion("buy_strategy >", value, "buyStrategy");
            return (Criteria) this;
        }

        public Criteria andBuyStrategyGreaterThanOrEqualTo(Integer value) {
            addCriterion("buy_strategy >=", value, "buyStrategy");
            return (Criteria) this;
        }

        public Criteria andBuyStrategyLessThan(Integer value) {
            addCriterion("buy_strategy <", value, "buyStrategy");
            return (Criteria) this;
        }

        public Criteria andBuyStrategyLessThanOrEqualTo(Integer value) {
            addCriterion("buy_strategy <=", value, "buyStrategy");
            return (Criteria) this;
        }

        public Criteria andBuyStrategyIn(List<Integer> values) {
            addCriterion("buy_strategy in", values, "buyStrategy");
            return (Criteria) this;
        }

        public Criteria andBuyStrategyNotIn(List<Integer> values) {
            addCriterion("buy_strategy not in", values, "buyStrategy");
            return (Criteria) this;
        }

        public Criteria andBuyStrategyBetween(Integer value1, Integer value2) {
            addCriterion("buy_strategy between", value1, value2, "buyStrategy");
            return (Criteria) this;
        }

        public Criteria andBuyStrategyNotBetween(Integer value1, Integer value2) {
            addCriterion("buy_strategy not between", value1, value2, "buyStrategy");
            return (Criteria) this;
        }

        public Criteria andBuyEndtimeIsNull() {
            addCriterion("buy_endtime is null");
            return (Criteria) this;
        }

        public Criteria andBuyEndtimeIsNotNull() {
            addCriterion("buy_endtime is not null");
            return (Criteria) this;
        }

        public Criteria andBuyEndtimeEqualTo(Date value) {
            addCriterion("buy_endtime =", value, "buyEndtime");
            return (Criteria) this;
        }

        public Criteria andBuyEndtimeNotEqualTo(Date value) {
            addCriterion("buy_endtime <>", value, "buyEndtime");
            return (Criteria) this;
        }

        public Criteria andBuyEndtimeGreaterThan(Date value) {
            addCriterion("buy_endtime >", value, "buyEndtime");
            return (Criteria) this;
        }

        public Criteria andBuyEndtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("buy_endtime >=", value, "buyEndtime");
            return (Criteria) this;
        }

        public Criteria andBuyEndtimeLessThan(Date value) {
            addCriterion("buy_endtime <", value, "buyEndtime");
            return (Criteria) this;
        }

        public Criteria andBuyEndtimeLessThanOrEqualTo(Date value) {
            addCriterion("buy_endtime <=", value, "buyEndtime");
            return (Criteria) this;
        }

        public Criteria andBuyEndtimeIn(List<Date> values) {
            addCriterion("buy_endtime in", values, "buyEndtime");
            return (Criteria) this;
        }

        public Criteria andBuyEndtimeNotIn(List<Date> values) {
            addCriterion("buy_endtime not in", values, "buyEndtime");
            return (Criteria) this;
        }

        public Criteria andBuyEndtimeBetween(Date value1, Date value2) {
            addCriterion("buy_endtime between", value1, value2, "buyEndtime");
            return (Criteria) this;
        }

        public Criteria andBuyEndtimeNotBetween(Date value1, Date value2) {
            addCriterion("buy_endtime not between", value1, value2, "buyEndtime");
            return (Criteria) this;
        }

        public Criteria andBuyTriggerPriceIsNull() {
            addCriterion("buy_trigger_price is null");
            return (Criteria) this;
        }

        public Criteria andBuyTriggerPriceIsNotNull() {
            addCriterion("buy_trigger_price is not null");
            return (Criteria) this;
        }

        public Criteria andBuyTriggerPriceEqualTo(BigDecimal value) {
            addCriterion("buy_trigger_price =", value, "buyTriggerPrice");
            return (Criteria) this;
        }

        public Criteria andBuyTriggerPriceNotEqualTo(BigDecimal value) {
            addCriterion("buy_trigger_price <>", value, "buyTriggerPrice");
            return (Criteria) this;
        }

        public Criteria andBuyTriggerPriceGreaterThan(BigDecimal value) {
            addCriterion("buy_trigger_price >", value, "buyTriggerPrice");
            return (Criteria) this;
        }

        public Criteria andBuyTriggerPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("buy_trigger_price >=", value, "buyTriggerPrice");
            return (Criteria) this;
        }

        public Criteria andBuyTriggerPriceLessThan(BigDecimal value) {
            addCriterion("buy_trigger_price <", value, "buyTriggerPrice");
            return (Criteria) this;
        }

        public Criteria andBuyTriggerPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("buy_trigger_price <=", value, "buyTriggerPrice");
            return (Criteria) this;
        }

        public Criteria andBuyTriggerPriceIn(List<BigDecimal> values) {
            addCriterion("buy_trigger_price in", values, "buyTriggerPrice");
            return (Criteria) this;
        }

        public Criteria andBuyTriggerPriceNotIn(List<BigDecimal> values) {
            addCriterion("buy_trigger_price not in", values, "buyTriggerPrice");
            return (Criteria) this;
        }

        public Criteria andBuyTriggerPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("buy_trigger_price between", value1, value2, "buyTriggerPrice");
            return (Criteria) this;
        }

        public Criteria andBuyTriggerPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("buy_trigger_price not between", value1, value2, "buyTriggerPrice");
            return (Criteria) this;
        }

        public Criteria andRealBuyPriceIsNull() {
            addCriterion("real_buy_price is null");
            return (Criteria) this;
        }

        public Criteria andRealBuyPriceIsNotNull() {
            addCriterion("real_buy_price is not null");
            return (Criteria) this;
        }

        public Criteria andRealBuyPriceEqualTo(BigDecimal value) {
            addCriterion("real_buy_price =", value, "realBuyPrice");
            return (Criteria) this;
        }

        public Criteria andRealBuyPriceNotEqualTo(BigDecimal value) {
            addCriterion("real_buy_price <>", value, "realBuyPrice");
            return (Criteria) this;
        }

        public Criteria andRealBuyPriceGreaterThan(BigDecimal value) {
            addCriterion("real_buy_price >", value, "realBuyPrice");
            return (Criteria) this;
        }

        public Criteria andRealBuyPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("real_buy_price >=", value, "realBuyPrice");
            return (Criteria) this;
        }

        public Criteria andRealBuyPriceLessThan(BigDecimal value) {
            addCriterion("real_buy_price <", value, "realBuyPrice");
            return (Criteria) this;
        }

        public Criteria andRealBuyPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("real_buy_price <=", value, "realBuyPrice");
            return (Criteria) this;
        }

        public Criteria andRealBuyPriceIn(List<BigDecimal> values) {
            addCriterion("real_buy_price in", values, "realBuyPrice");
            return (Criteria) this;
        }

        public Criteria andRealBuyPriceNotIn(List<BigDecimal> values) {
            addCriterion("real_buy_price not in", values, "realBuyPrice");
            return (Criteria) this;
        }

        public Criteria andRealBuyPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("real_buy_price between", value1, value2, "realBuyPrice");
            return (Criteria) this;
        }

        public Criteria andRealBuyPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("real_buy_price not between", value1, value2, "realBuyPrice");
            return (Criteria) this;
        }

        public Criteria andRealBuyQuantityIsNull() {
            addCriterion("real_buy_quantity is null");
            return (Criteria) this;
        }

        public Criteria andRealBuyQuantityIsNotNull() {
            addCriterion("real_buy_quantity is not null");
            return (Criteria) this;
        }

        public Criteria andRealBuyQuantityEqualTo(Integer value) {
            addCriterion("real_buy_quantity =", value, "realBuyQuantity");
            return (Criteria) this;
        }

        public Criteria andRealBuyQuantityNotEqualTo(Integer value) {
            addCriterion("real_buy_quantity <>", value, "realBuyQuantity");
            return (Criteria) this;
        }

        public Criteria andRealBuyQuantityGreaterThan(Integer value) {
            addCriterion("real_buy_quantity >", value, "realBuyQuantity");
            return (Criteria) this;
        }

        public Criteria andRealBuyQuantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("real_buy_quantity >=", value, "realBuyQuantity");
            return (Criteria) this;
        }

        public Criteria andRealBuyQuantityLessThan(Integer value) {
            addCriterion("real_buy_quantity <", value, "realBuyQuantity");
            return (Criteria) this;
        }

        public Criteria andRealBuyQuantityLessThanOrEqualTo(Integer value) {
            addCriterion("real_buy_quantity <=", value, "realBuyQuantity");
            return (Criteria) this;
        }

        public Criteria andRealBuyQuantityIn(List<Integer> values) {
            addCriterion("real_buy_quantity in", values, "realBuyQuantity");
            return (Criteria) this;
        }

        public Criteria andRealBuyQuantityNotIn(List<Integer> values) {
            addCriterion("real_buy_quantity not in", values, "realBuyQuantity");
            return (Criteria) this;
        }

        public Criteria andRealBuyQuantityBetween(Integer value1, Integer value2) {
            addCriterion("real_buy_quantity between", value1, value2, "realBuyQuantity");
            return (Criteria) this;
        }

        public Criteria andRealBuyQuantityNotBetween(Integer value1, Integer value2) {
            addCriterion("real_buy_quantity not between", value1, value2, "realBuyQuantity");
            return (Criteria) this;
        }

        public Criteria andRealBuyTimeIsNull() {
            addCriterion("real_buy_time is null");
            return (Criteria) this;
        }

        public Criteria andRealBuyTimeIsNotNull() {
            addCriterion("real_buy_time is not null");
            return (Criteria) this;
        }

        public Criteria andRealBuyTimeEqualTo(Date value) {
            addCriterion("real_buy_time =", value, "realBuyTime");
            return (Criteria) this;
        }

        public Criteria andRealBuyTimeNotEqualTo(Date value) {
            addCriterion("real_buy_time <>", value, "realBuyTime");
            return (Criteria) this;
        }

        public Criteria andRealBuyTimeGreaterThan(Date value) {
            addCriterion("real_buy_time >", value, "realBuyTime");
            return (Criteria) this;
        }

        public Criteria andRealBuyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("real_buy_time >=", value, "realBuyTime");
            return (Criteria) this;
        }

        public Criteria andRealBuyTimeLessThan(Date value) {
            addCriterion("real_buy_time <", value, "realBuyTime");
            return (Criteria) this;
        }

        public Criteria andRealBuyTimeLessThanOrEqualTo(Date value) {
            addCriterion("real_buy_time <=", value, "realBuyTime");
            return (Criteria) this;
        }

        public Criteria andRealBuyTimeIn(List<Date> values) {
            addCriterion("real_buy_time in", values, "realBuyTime");
            return (Criteria) this;
        }

        public Criteria andRealBuyTimeNotIn(List<Date> values) {
            addCriterion("real_buy_time not in", values, "realBuyTime");
            return (Criteria) this;
        }

        public Criteria andRealBuyTimeBetween(Date value1, Date value2) {
            addCriterion("real_buy_time between", value1, value2, "realBuyTime");
            return (Criteria) this;
        }

        public Criteria andRealBuyTimeNotBetween(Date value1, Date value2) {
            addCriterion("real_buy_time not between", value1, value2, "realBuyTime");
            return (Criteria) this;
        }

        public Criteria andBuyTradeIdIsNull() {
            addCriterion("buy_trade_id is null");
            return (Criteria) this;
        }

        public Criteria andBuyTradeIdIsNotNull() {
            addCriterion("buy_trade_id is not null");
            return (Criteria) this;
        }

        public Criteria andBuyTradeIdEqualTo(String value) {
            addCriterion("buy_trade_id =", value, "buyTradeId");
            return (Criteria) this;
        }

        public Criteria andBuyTradeIdNotEqualTo(String value) {
            addCriterion("buy_trade_id <>", value, "buyTradeId");
            return (Criteria) this;
        }

        public Criteria andBuyTradeIdGreaterThan(String value) {
            addCriterion("buy_trade_id >", value, "buyTradeId");
            return (Criteria) this;
        }

        public Criteria andBuyTradeIdGreaterThanOrEqualTo(String value) {
            addCriterion("buy_trade_id >=", value, "buyTradeId");
            return (Criteria) this;
        }

        public Criteria andBuyTradeIdLessThan(String value) {
            addCriterion("buy_trade_id <", value, "buyTradeId");
            return (Criteria) this;
        }

        public Criteria andBuyTradeIdLessThanOrEqualTo(String value) {
            addCriterion("buy_trade_id <=", value, "buyTradeId");
            return (Criteria) this;
        }

        public Criteria andBuyTradeIdLike(String value) {
            addCriterion("buy_trade_id like", value, "buyTradeId");
            return (Criteria) this;
        }

        public Criteria andBuyTradeIdNotLike(String value) {
            addCriterion("buy_trade_id not like", value, "buyTradeId");
            return (Criteria) this;
        }

        public Criteria andBuyTradeIdIn(List<String> values) {
            addCriterion("buy_trade_id in", values, "buyTradeId");
            return (Criteria) this;
        }

        public Criteria andBuyTradeIdNotIn(List<String> values) {
            addCriterion("buy_trade_id not in", values, "buyTradeId");
            return (Criteria) this;
        }

        public Criteria andBuyTradeIdBetween(String value1, String value2) {
            addCriterion("buy_trade_id between", value1, value2, "buyTradeId");
            return (Criteria) this;
        }

        public Criteria andBuyTradeIdNotBetween(String value1, String value2) {
            addCriterion("buy_trade_id not between", value1, value2, "buyTradeId");
            return (Criteria) this;
        }

        public Criteria andBuyProcedureFeeIsNull() {
            addCriterion("buy_procedure_fee is null");
            return (Criteria) this;
        }

        public Criteria andBuyProcedureFeeIsNotNull() {
            addCriterion("buy_procedure_fee is not null");
            return (Criteria) this;
        }

        public Criteria andBuyProcedureFeeEqualTo(BigDecimal value) {
            addCriterion("buy_procedure_fee =", value, "buyProcedureFee");
            return (Criteria) this;
        }

        public Criteria andBuyProcedureFeeNotEqualTo(BigDecimal value) {
            addCriterion("buy_procedure_fee <>", value, "buyProcedureFee");
            return (Criteria) this;
        }

        public Criteria andBuyProcedureFeeGreaterThan(BigDecimal value) {
            addCriterion("buy_procedure_fee >", value, "buyProcedureFee");
            return (Criteria) this;
        }

        public Criteria andBuyProcedureFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("buy_procedure_fee >=", value, "buyProcedureFee");
            return (Criteria) this;
        }

        public Criteria andBuyProcedureFeeLessThan(BigDecimal value) {
            addCriterion("buy_procedure_fee <", value, "buyProcedureFee");
            return (Criteria) this;
        }

        public Criteria andBuyProcedureFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("buy_procedure_fee <=", value, "buyProcedureFee");
            return (Criteria) this;
        }

        public Criteria andBuyProcedureFeeIn(List<BigDecimal> values) {
            addCriterion("buy_procedure_fee in", values, "buyProcedureFee");
            return (Criteria) this;
        }

        public Criteria andBuyProcedureFeeNotIn(List<BigDecimal> values) {
            addCriterion("buy_procedure_fee not in", values, "buyProcedureFee");
            return (Criteria) this;
        }

        public Criteria andBuyProcedureFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("buy_procedure_fee between", value1, value2, "buyProcedureFee");
            return (Criteria) this;
        }

        public Criteria andBuyProcedureFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("buy_procedure_fee not between", value1, value2, "buyProcedureFee");
            return (Criteria) this;
        }

        public Criteria andBuyTransferFeeIsNull() {
            addCriterion("buy_transfer_fee is null");
            return (Criteria) this;
        }

        public Criteria andBuyTransferFeeIsNotNull() {
            addCriterion("buy_transfer_fee is not null");
            return (Criteria) this;
        }

        public Criteria andBuyTransferFeeEqualTo(BigDecimal value) {
            addCriterion("buy_transfer_fee =", value, "buyTransferFee");
            return (Criteria) this;
        }

        public Criteria andBuyTransferFeeNotEqualTo(BigDecimal value) {
            addCriterion("buy_transfer_fee <>", value, "buyTransferFee");
            return (Criteria) this;
        }

        public Criteria andBuyTransferFeeGreaterThan(BigDecimal value) {
            addCriterion("buy_transfer_fee >", value, "buyTransferFee");
            return (Criteria) this;
        }

        public Criteria andBuyTransferFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("buy_transfer_fee >=", value, "buyTransferFee");
            return (Criteria) this;
        }

        public Criteria andBuyTransferFeeLessThan(BigDecimal value) {
            addCriterion("buy_transfer_fee <", value, "buyTransferFee");
            return (Criteria) this;
        }

        public Criteria andBuyTransferFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("buy_transfer_fee <=", value, "buyTransferFee");
            return (Criteria) this;
        }

        public Criteria andBuyTransferFeeIn(List<BigDecimal> values) {
            addCriterion("buy_transfer_fee in", values, "buyTransferFee");
            return (Criteria) this;
        }

        public Criteria andBuyTransferFeeNotIn(List<BigDecimal> values) {
            addCriterion("buy_transfer_fee not in", values, "buyTransferFee");
            return (Criteria) this;
        }

        public Criteria andBuyTransferFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("buy_transfer_fee between", value1, value2, "buyTransferFee");
            return (Criteria) this;
        }

        public Criteria andBuyTransferFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("buy_transfer_fee not between", value1, value2, "buyTransferFee");
            return (Criteria) this;
        }

        public Criteria andSaleStrategyIsNull() {
            addCriterion("sale_strategy is null");
            return (Criteria) this;
        }

        public Criteria andSaleStrategyIsNotNull() {
            addCriterion("sale_strategy is not null");
            return (Criteria) this;
        }

        public Criteria andSaleStrategyEqualTo(Integer value) {
            addCriterion("sale_strategy =", value, "saleStrategy");
            return (Criteria) this;
        }

        public Criteria andSaleStrategyNotEqualTo(Integer value) {
            addCriterion("sale_strategy <>", value, "saleStrategy");
            return (Criteria) this;
        }

        public Criteria andSaleStrategyGreaterThan(Integer value) {
            addCriterion("sale_strategy >", value, "saleStrategy");
            return (Criteria) this;
        }

        public Criteria andSaleStrategyGreaterThanOrEqualTo(Integer value) {
            addCriterion("sale_strategy >=", value, "saleStrategy");
            return (Criteria) this;
        }

        public Criteria andSaleStrategyLessThan(Integer value) {
            addCriterion("sale_strategy <", value, "saleStrategy");
            return (Criteria) this;
        }

        public Criteria andSaleStrategyLessThanOrEqualTo(Integer value) {
            addCriterion("sale_strategy <=", value, "saleStrategy");
            return (Criteria) this;
        }

        public Criteria andSaleStrategyIn(List<Integer> values) {
            addCriterion("sale_strategy in", values, "saleStrategy");
            return (Criteria) this;
        }

        public Criteria andSaleStrategyNotIn(List<Integer> values) {
            addCriterion("sale_strategy not in", values, "saleStrategy");
            return (Criteria) this;
        }

        public Criteria andSaleStrategyBetween(Integer value1, Integer value2) {
            addCriterion("sale_strategy between", value1, value2, "saleStrategy");
            return (Criteria) this;
        }

        public Criteria andSaleStrategyNotBetween(Integer value1, Integer value2) {
            addCriterion("sale_strategy not between", value1, value2, "saleStrategy");
            return (Criteria) this;
        }

        public Criteria andSaleStarttimeIsNull() {
            addCriterion("sale_starttime is null");
            return (Criteria) this;
        }

        public Criteria andSaleStarttimeIsNotNull() {
            addCriterion("sale_starttime is not null");
            return (Criteria) this;
        }

        public Criteria andSaleStarttimeEqualTo(Date value) {
            addCriterion("sale_starttime =", value, "saleStarttime");
            return (Criteria) this;
        }

        public Criteria andSaleStarttimeNotEqualTo(Date value) {
            addCriterion("sale_starttime <>", value, "saleStarttime");
            return (Criteria) this;
        }

        public Criteria andSaleStarttimeGreaterThan(Date value) {
            addCriterion("sale_starttime >", value, "saleStarttime");
            return (Criteria) this;
        }

        public Criteria andSaleStarttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("sale_starttime >=", value, "saleStarttime");
            return (Criteria) this;
        }

        public Criteria andSaleStarttimeLessThan(Date value) {
            addCriterion("sale_starttime <", value, "saleStarttime");
            return (Criteria) this;
        }

        public Criteria andSaleStarttimeLessThanOrEqualTo(Date value) {
            addCriterion("sale_starttime <=", value, "saleStarttime");
            return (Criteria) this;
        }

        public Criteria andSaleStarttimeIn(List<Date> values) {
            addCriterion("sale_starttime in", values, "saleStarttime");
            return (Criteria) this;
        }

        public Criteria andSaleStarttimeNotIn(List<Date> values) {
            addCriterion("sale_starttime not in", values, "saleStarttime");
            return (Criteria) this;
        }

        public Criteria andSaleStarttimeBetween(Date value1, Date value2) {
            addCriterion("sale_starttime between", value1, value2, "saleStarttime");
            return (Criteria) this;
        }

        public Criteria andSaleStarttimeNotBetween(Date value1, Date value2) {
            addCriterion("sale_starttime not between", value1, value2, "saleStarttime");
            return (Criteria) this;
        }

        public Criteria andSaleTriggerPriceIsNull() {
            addCriterion("sale_trigger_price is null");
            return (Criteria) this;
        }

        public Criteria andSaleTriggerPriceIsNotNull() {
            addCriterion("sale_trigger_price is not null");
            return (Criteria) this;
        }

        public Criteria andSaleTriggerPriceEqualTo(BigDecimal value) {
            addCriterion("sale_trigger_price =", value, "saleTriggerPrice");
            return (Criteria) this;
        }

        public Criteria andSaleTriggerPriceNotEqualTo(BigDecimal value) {
            addCriterion("sale_trigger_price <>", value, "saleTriggerPrice");
            return (Criteria) this;
        }

        public Criteria andSaleTriggerPriceGreaterThan(BigDecimal value) {
            addCriterion("sale_trigger_price >", value, "saleTriggerPrice");
            return (Criteria) this;
        }

        public Criteria andSaleTriggerPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("sale_trigger_price >=", value, "saleTriggerPrice");
            return (Criteria) this;
        }

        public Criteria andSaleTriggerPriceLessThan(BigDecimal value) {
            addCriterion("sale_trigger_price <", value, "saleTriggerPrice");
            return (Criteria) this;
        }

        public Criteria andSaleTriggerPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("sale_trigger_price <=", value, "saleTriggerPrice");
            return (Criteria) this;
        }

        public Criteria andSaleTriggerPriceIn(List<BigDecimal> values) {
            addCriterion("sale_trigger_price in", values, "saleTriggerPrice");
            return (Criteria) this;
        }

        public Criteria andSaleTriggerPriceNotIn(List<BigDecimal> values) {
            addCriterion("sale_trigger_price not in", values, "saleTriggerPrice");
            return (Criteria) this;
        }

        public Criteria andSaleTriggerPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sale_trigger_price between", value1, value2, "saleTriggerPrice");
            return (Criteria) this;
        }

        public Criteria andSaleTriggerPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sale_trigger_price not between", value1, value2, "saleTriggerPrice");
            return (Criteria) this;
        }

        public Criteria andRealSaleTimeIsNull() {
            addCriterion("real_sale_time is null");
            return (Criteria) this;
        }

        public Criteria andRealSaleTimeIsNotNull() {
            addCriterion("real_sale_time is not null");
            return (Criteria) this;
        }

        public Criteria andRealSaleTimeEqualTo(Date value) {
            addCriterion("real_sale_time =", value, "realSaleTime");
            return (Criteria) this;
        }

        public Criteria andRealSaleTimeNotEqualTo(Date value) {
            addCriterion("real_sale_time <>", value, "realSaleTime");
            return (Criteria) this;
        }

        public Criteria andRealSaleTimeGreaterThan(Date value) {
            addCriterion("real_sale_time >", value, "realSaleTime");
            return (Criteria) this;
        }

        public Criteria andRealSaleTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("real_sale_time >=", value, "realSaleTime");
            return (Criteria) this;
        }

        public Criteria andRealSaleTimeLessThan(Date value) {
            addCriterion("real_sale_time <", value, "realSaleTime");
            return (Criteria) this;
        }

        public Criteria andRealSaleTimeLessThanOrEqualTo(Date value) {
            addCriterion("real_sale_time <=", value, "realSaleTime");
            return (Criteria) this;
        }

        public Criteria andRealSaleTimeIn(List<Date> values) {
            addCriterion("real_sale_time in", values, "realSaleTime");
            return (Criteria) this;
        }

        public Criteria andRealSaleTimeNotIn(List<Date> values) {
            addCriterion("real_sale_time not in", values, "realSaleTime");
            return (Criteria) this;
        }

        public Criteria andRealSaleTimeBetween(Date value1, Date value2) {
            addCriterion("real_sale_time between", value1, value2, "realSaleTime");
            return (Criteria) this;
        }

        public Criteria andRealSaleTimeNotBetween(Date value1, Date value2) {
            addCriterion("real_sale_time not between", value1, value2, "realSaleTime");
            return (Criteria) this;
        }

        public Criteria andSaleTradeIdIsNull() {
            addCriterion("sale_trade_id is null");
            return (Criteria) this;
        }

        public Criteria andSaleTradeIdIsNotNull() {
            addCriterion("sale_trade_id is not null");
            return (Criteria) this;
        }

        public Criteria andSaleTradeIdEqualTo(String value) {
            addCriterion("sale_trade_id =", value, "saleTradeId");
            return (Criteria) this;
        }

        public Criteria andSaleTradeIdNotEqualTo(String value) {
            addCriterion("sale_trade_id <>", value, "saleTradeId");
            return (Criteria) this;
        }

        public Criteria andSaleTradeIdGreaterThan(String value) {
            addCriterion("sale_trade_id >", value, "saleTradeId");
            return (Criteria) this;
        }

        public Criteria andSaleTradeIdGreaterThanOrEqualTo(String value) {
            addCriterion("sale_trade_id >=", value, "saleTradeId");
            return (Criteria) this;
        }

        public Criteria andSaleTradeIdLessThan(String value) {
            addCriterion("sale_trade_id <", value, "saleTradeId");
            return (Criteria) this;
        }

        public Criteria andSaleTradeIdLessThanOrEqualTo(String value) {
            addCriterion("sale_trade_id <=", value, "saleTradeId");
            return (Criteria) this;
        }

        public Criteria andSaleTradeIdLike(String value) {
            addCriterion("sale_trade_id like", value, "saleTradeId");
            return (Criteria) this;
        }

        public Criteria andSaleTradeIdNotLike(String value) {
            addCriterion("sale_trade_id not like", value, "saleTradeId");
            return (Criteria) this;
        }

        public Criteria andSaleTradeIdIn(List<String> values) {
            addCriterion("sale_trade_id in", values, "saleTradeId");
            return (Criteria) this;
        }

        public Criteria andSaleTradeIdNotIn(List<String> values) {
            addCriterion("sale_trade_id not in", values, "saleTradeId");
            return (Criteria) this;
        }

        public Criteria andSaleTradeIdBetween(String value1, String value2) {
            addCriterion("sale_trade_id between", value1, value2, "saleTradeId");
            return (Criteria) this;
        }

        public Criteria andSaleTradeIdNotBetween(String value1, String value2) {
            addCriterion("sale_trade_id not between", value1, value2, "saleTradeId");
            return (Criteria) this;
        }

        public Criteria andRealSalePriceIsNull() {
            addCriterion("real_sale_price is null");
            return (Criteria) this;
        }

        public Criteria andRealSalePriceIsNotNull() {
            addCriterion("real_sale_price is not null");
            return (Criteria) this;
        }

        public Criteria andRealSalePriceEqualTo(BigDecimal value) {
            addCriterion("real_sale_price =", value, "realSalePrice");
            return (Criteria) this;
        }

        public Criteria andRealSalePriceNotEqualTo(BigDecimal value) {
            addCriterion("real_sale_price <>", value, "realSalePrice");
            return (Criteria) this;
        }

        public Criteria andRealSalePriceGreaterThan(BigDecimal value) {
            addCriterion("real_sale_price >", value, "realSalePrice");
            return (Criteria) this;
        }

        public Criteria andRealSalePriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("real_sale_price >=", value, "realSalePrice");
            return (Criteria) this;
        }

        public Criteria andRealSalePriceLessThan(BigDecimal value) {
            addCriterion("real_sale_price <", value, "realSalePrice");
            return (Criteria) this;
        }

        public Criteria andRealSalePriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("real_sale_price <=", value, "realSalePrice");
            return (Criteria) this;
        }

        public Criteria andRealSalePriceIn(List<BigDecimal> values) {
            addCriterion("real_sale_price in", values, "realSalePrice");
            return (Criteria) this;
        }

        public Criteria andRealSalePriceNotIn(List<BigDecimal> values) {
            addCriterion("real_sale_price not in", values, "realSalePrice");
            return (Criteria) this;
        }

        public Criteria andRealSalePriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("real_sale_price between", value1, value2, "realSalePrice");
            return (Criteria) this;
        }

        public Criteria andRealSalePriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("real_sale_price not between", value1, value2, "realSalePrice");
            return (Criteria) this;
        }

        public Criteria andRealSaleQuantityIsNull() {
            addCriterion("real_sale_quantity is null");
            return (Criteria) this;
        }

        public Criteria andRealSaleQuantityIsNotNull() {
            addCriterion("real_sale_quantity is not null");
            return (Criteria) this;
        }

        public Criteria andRealSaleQuantityEqualTo(Integer value) {
            addCriterion("real_sale_quantity =", value, "realSaleQuantity");
            return (Criteria) this;
        }

        public Criteria andRealSaleQuantityNotEqualTo(Integer value) {
            addCriterion("real_sale_quantity <>", value, "realSaleQuantity");
            return (Criteria) this;
        }

        public Criteria andRealSaleQuantityGreaterThan(Integer value) {
            addCriterion("real_sale_quantity >", value, "realSaleQuantity");
            return (Criteria) this;
        }

        public Criteria andRealSaleQuantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("real_sale_quantity >=", value, "realSaleQuantity");
            return (Criteria) this;
        }

        public Criteria andRealSaleQuantityLessThan(Integer value) {
            addCriterion("real_sale_quantity <", value, "realSaleQuantity");
            return (Criteria) this;
        }

        public Criteria andRealSaleQuantityLessThanOrEqualTo(Integer value) {
            addCriterion("real_sale_quantity <=", value, "realSaleQuantity");
            return (Criteria) this;
        }

        public Criteria andRealSaleQuantityIn(List<Integer> values) {
            addCriterion("real_sale_quantity in", values, "realSaleQuantity");
            return (Criteria) this;
        }

        public Criteria andRealSaleQuantityNotIn(List<Integer> values) {
            addCriterion("real_sale_quantity not in", values, "realSaleQuantity");
            return (Criteria) this;
        }

        public Criteria andRealSaleQuantityBetween(Integer value1, Integer value2) {
            addCriterion("real_sale_quantity between", value1, value2, "realSaleQuantity");
            return (Criteria) this;
        }

        public Criteria andRealSaleQuantityNotBetween(Integer value1, Integer value2) {
            addCriterion("real_sale_quantity not between", value1, value2, "realSaleQuantity");
            return (Criteria) this;
        }

        public Criteria andSaleProcedureFeeIsNull() {
            addCriterion("sale_procedure_fee is null");
            return (Criteria) this;
        }

        public Criteria andSaleProcedureFeeIsNotNull() {
            addCriterion("sale_procedure_fee is not null");
            return (Criteria) this;
        }

        public Criteria andSaleProcedureFeeEqualTo(BigDecimal value) {
            addCriterion("sale_procedure_fee =", value, "saleProcedureFee");
            return (Criteria) this;
        }

        public Criteria andSaleProcedureFeeNotEqualTo(BigDecimal value) {
            addCriterion("sale_procedure_fee <>", value, "saleProcedureFee");
            return (Criteria) this;
        }

        public Criteria andSaleProcedureFeeGreaterThan(BigDecimal value) {
            addCriterion("sale_procedure_fee >", value, "saleProcedureFee");
            return (Criteria) this;
        }

        public Criteria andSaleProcedureFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("sale_procedure_fee >=", value, "saleProcedureFee");
            return (Criteria) this;
        }

        public Criteria andSaleProcedureFeeLessThan(BigDecimal value) {
            addCriterion("sale_procedure_fee <", value, "saleProcedureFee");
            return (Criteria) this;
        }

        public Criteria andSaleProcedureFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("sale_procedure_fee <=", value, "saleProcedureFee");
            return (Criteria) this;
        }

        public Criteria andSaleProcedureFeeIn(List<BigDecimal> values) {
            addCriterion("sale_procedure_fee in", values, "saleProcedureFee");
            return (Criteria) this;
        }

        public Criteria andSaleProcedureFeeNotIn(List<BigDecimal> values) {
            addCriterion("sale_procedure_fee not in", values, "saleProcedureFee");
            return (Criteria) this;
        }

        public Criteria andSaleProcedureFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sale_procedure_fee between", value1, value2, "saleProcedureFee");
            return (Criteria) this;
        }

        public Criteria andSaleProcedureFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sale_procedure_fee not between", value1, value2, "saleProcedureFee");
            return (Criteria) this;
        }

        public Criteria andSaleStampTaxFeeIsNull() {
            addCriterion("sale_stamp_tax_fee is null");
            return (Criteria) this;
        }

        public Criteria andSaleStampTaxFeeIsNotNull() {
            addCriterion("sale_stamp_tax_fee is not null");
            return (Criteria) this;
        }

        public Criteria andSaleStampTaxFeeEqualTo(BigDecimal value) {
            addCriterion("sale_stamp_tax_fee =", value, "saleStampTaxFee");
            return (Criteria) this;
        }

        public Criteria andSaleStampTaxFeeNotEqualTo(BigDecimal value) {
            addCriterion("sale_stamp_tax_fee <>", value, "saleStampTaxFee");
            return (Criteria) this;
        }

        public Criteria andSaleStampTaxFeeGreaterThan(BigDecimal value) {
            addCriterion("sale_stamp_tax_fee >", value, "saleStampTaxFee");
            return (Criteria) this;
        }

        public Criteria andSaleStampTaxFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("sale_stamp_tax_fee >=", value, "saleStampTaxFee");
            return (Criteria) this;
        }

        public Criteria andSaleStampTaxFeeLessThan(BigDecimal value) {
            addCriterion("sale_stamp_tax_fee <", value, "saleStampTaxFee");
            return (Criteria) this;
        }

        public Criteria andSaleStampTaxFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("sale_stamp_tax_fee <=", value, "saleStampTaxFee");
            return (Criteria) this;
        }

        public Criteria andSaleStampTaxFeeIn(List<BigDecimal> values) {
            addCriterion("sale_stamp_tax_fee in", values, "saleStampTaxFee");
            return (Criteria) this;
        }

        public Criteria andSaleStampTaxFeeNotIn(List<BigDecimal> values) {
            addCriterion("sale_stamp_tax_fee not in", values, "saleStampTaxFee");
            return (Criteria) this;
        }

        public Criteria andSaleStampTaxFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sale_stamp_tax_fee between", value1, value2, "saleStampTaxFee");
            return (Criteria) this;
        }

        public Criteria andSaleStampTaxFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sale_stamp_tax_fee not between", value1, value2, "saleStampTaxFee");
            return (Criteria) this;
        }

        public Criteria andDtTradeEndtimeIsNull() {
            addCriterion("dt_trade_endtime is null");
            return (Criteria) this;
        }

        public Criteria andDtTradeEndtimeIsNotNull() {
            addCriterion("dt_trade_endtime is not null");
            return (Criteria) this;
        }

        public Criteria andDtTradeEndtimeEqualTo(Date value) {
            addCriterion("dt_trade_endtime =", value, "dtTradeEndtime");
            return (Criteria) this;
        }

        public Criteria andDtTradeEndtimeNotEqualTo(Date value) {
            addCriterion("dt_trade_endtime <>", value, "dtTradeEndtime");
            return (Criteria) this;
        }

        public Criteria andDtTradeEndtimeGreaterThan(Date value) {
            addCriterion("dt_trade_endtime >", value, "dtTradeEndtime");
            return (Criteria) this;
        }

        public Criteria andDtTradeEndtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("dt_trade_endtime >=", value, "dtTradeEndtime");
            return (Criteria) this;
        }

        public Criteria andDtTradeEndtimeLessThan(Date value) {
            addCriterion("dt_trade_endtime <", value, "dtTradeEndtime");
            return (Criteria) this;
        }

        public Criteria andDtTradeEndtimeLessThanOrEqualTo(Date value) {
            addCriterion("dt_trade_endtime <=", value, "dtTradeEndtime");
            return (Criteria) this;
        }

        public Criteria andDtTradeEndtimeIn(List<Date> values) {
            addCriterion("dt_trade_endtime in", values, "dtTradeEndtime");
            return (Criteria) this;
        }

        public Criteria andDtTradeEndtimeNotIn(List<Date> values) {
            addCriterion("dt_trade_endtime not in", values, "dtTradeEndtime");
            return (Criteria) this;
        }

        public Criteria andDtTradeEndtimeBetween(Date value1, Date value2) {
            addCriterion("dt_trade_endtime between", value1, value2, "dtTradeEndtime");
            return (Criteria) this;
        }

        public Criteria andDtTradeEndtimeNotBetween(Date value1, Date value2) {
            addCriterion("dt_trade_endtime not between", value1, value2, "dtTradeEndtime");
            return (Criteria) this;
        }

        public Criteria andStopProfitRatioIsNull() {
            addCriterion("stop_profit_ratio is null");
            return (Criteria) this;
        }

        public Criteria andStopProfitRatioIsNotNull() {
            addCriterion("stop_profit_ratio is not null");
            return (Criteria) this;
        }

        public Criteria andStopProfitRatioEqualTo(Float value) {
            addCriterion("stop_profit_ratio =", value, "stopProfitRatio");
            return (Criteria) this;
        }

        public Criteria andStopProfitRatioNotEqualTo(Float value) {
            addCriterion("stop_profit_ratio <>", value, "stopProfitRatio");
            return (Criteria) this;
        }

        public Criteria andStopProfitRatioGreaterThan(Float value) {
            addCriterion("stop_profit_ratio >", value, "stopProfitRatio");
            return (Criteria) this;
        }

        public Criteria andStopProfitRatioGreaterThanOrEqualTo(Float value) {
            addCriterion("stop_profit_ratio >=", value, "stopProfitRatio");
            return (Criteria) this;
        }

        public Criteria andStopProfitRatioLessThan(Float value) {
            addCriterion("stop_profit_ratio <", value, "stopProfitRatio");
            return (Criteria) this;
        }

        public Criteria andStopProfitRatioLessThanOrEqualTo(Float value) {
            addCriterion("stop_profit_ratio <=", value, "stopProfitRatio");
            return (Criteria) this;
        }

        public Criteria andStopProfitRatioIn(List<Float> values) {
            addCriterion("stop_profit_ratio in", values, "stopProfitRatio");
            return (Criteria) this;
        }

        public Criteria andStopProfitRatioNotIn(List<Float> values) {
            addCriterion("stop_profit_ratio not in", values, "stopProfitRatio");
            return (Criteria) this;
        }

        public Criteria andStopProfitRatioBetween(Float value1, Float value2) {
            addCriterion("stop_profit_ratio between", value1, value2, "stopProfitRatio");
            return (Criteria) this;
        }

        public Criteria andStopProfitRatioNotBetween(Float value1, Float value2) {
            addCriterion("stop_profit_ratio not between", value1, value2, "stopProfitRatio");
            return (Criteria) this;
        }

        public Criteria andStopLossRatioIsNull() {
            addCriterion("stop_loss_ratio is null");
            return (Criteria) this;
        }

        public Criteria andStopLossRatioIsNotNull() {
            addCriterion("stop_loss_ratio is not null");
            return (Criteria) this;
        }

        public Criteria andStopLossRatioEqualTo(Float value) {
            addCriterion("stop_loss_ratio =", value, "stopLossRatio");
            return (Criteria) this;
        }

        public Criteria andStopLossRatioNotEqualTo(Float value) {
            addCriterion("stop_loss_ratio <>", value, "stopLossRatio");
            return (Criteria) this;
        }

        public Criteria andStopLossRatioGreaterThan(Float value) {
            addCriterion("stop_loss_ratio >", value, "stopLossRatio");
            return (Criteria) this;
        }

        public Criteria andStopLossRatioGreaterThanOrEqualTo(Float value) {
            addCriterion("stop_loss_ratio >=", value, "stopLossRatio");
            return (Criteria) this;
        }

        public Criteria andStopLossRatioLessThan(Float value) {
            addCriterion("stop_loss_ratio <", value, "stopLossRatio");
            return (Criteria) this;
        }

        public Criteria andStopLossRatioLessThanOrEqualTo(Float value) {
            addCriterion("stop_loss_ratio <=", value, "stopLossRatio");
            return (Criteria) this;
        }

        public Criteria andStopLossRatioIn(List<Float> values) {
            addCriterion("stop_loss_ratio in", values, "stopLossRatio");
            return (Criteria) this;
        }

        public Criteria andStopLossRatioNotIn(List<Float> values) {
            addCriterion("stop_loss_ratio not in", values, "stopLossRatio");
            return (Criteria) this;
        }

        public Criteria andStopLossRatioBetween(Float value1, Float value2) {
            addCriterion("stop_loss_ratio between", value1, value2, "stopLossRatio");
            return (Criteria) this;
        }

        public Criteria andStopLossRatioNotBetween(Float value1, Float value2) {
            addCriterion("stop_loss_ratio not between", value1, value2, "stopLossRatio");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
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