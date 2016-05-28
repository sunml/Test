package mybatis.entity;

import java.util.ArrayList;
import java.util.List;

public class StockMarketExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StockMarketExample() {
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

        public Criteria andOpenPriceIsNull() {
            addCriterion("open_price is null");
            return (Criteria) this;
        }

        public Criteria andOpenPriceIsNotNull() {
            addCriterion("open_price is not null");
            return (Criteria) this;
        }

        public Criteria andOpenPriceEqualTo(Float value) {
            addCriterion("open_price =", value, "openPrice");
            return (Criteria) this;
        }

        public Criteria andOpenPriceNotEqualTo(Float value) {
            addCriterion("open_price <>", value, "openPrice");
            return (Criteria) this;
        }

        public Criteria andOpenPriceGreaterThan(Float value) {
            addCriterion("open_price >", value, "openPrice");
            return (Criteria) this;
        }

        public Criteria andOpenPriceGreaterThanOrEqualTo(Float value) {
            addCriterion("open_price >=", value, "openPrice");
            return (Criteria) this;
        }

        public Criteria andOpenPriceLessThan(Float value) {
            addCriterion("open_price <", value, "openPrice");
            return (Criteria) this;
        }

        public Criteria andOpenPriceLessThanOrEqualTo(Float value) {
            addCriterion("open_price <=", value, "openPrice");
            return (Criteria) this;
        }

        public Criteria andOpenPriceIn(List<Float> values) {
            addCriterion("open_price in", values, "openPrice");
            return (Criteria) this;
        }

        public Criteria andOpenPriceNotIn(List<Float> values) {
            addCriterion("open_price not in", values, "openPrice");
            return (Criteria) this;
        }

        public Criteria andOpenPriceBetween(Float value1, Float value2) {
            addCriterion("open_price between", value1, value2, "openPrice");
            return (Criteria) this;
        }

        public Criteria andOpenPriceNotBetween(Float value1, Float value2) {
            addCriterion("open_price not between", value1, value2, "openPrice");
            return (Criteria) this;
        }

        public Criteria andYstdClosePriceIsNull() {
            addCriterion("ystd_close_price is null");
            return (Criteria) this;
        }

        public Criteria andYstdClosePriceIsNotNull() {
            addCriterion("ystd_close_price is not null");
            return (Criteria) this;
        }

        public Criteria andYstdClosePriceEqualTo(Float value) {
            addCriterion("ystd_close_price =", value, "ystdClosePrice");
            return (Criteria) this;
        }

        public Criteria andYstdClosePriceNotEqualTo(Float value) {
            addCriterion("ystd_close_price <>", value, "ystdClosePrice");
            return (Criteria) this;
        }

        public Criteria andYstdClosePriceGreaterThan(Float value) {
            addCriterion("ystd_close_price >", value, "ystdClosePrice");
            return (Criteria) this;
        }

        public Criteria andYstdClosePriceGreaterThanOrEqualTo(Float value) {
            addCriterion("ystd_close_price >=", value, "ystdClosePrice");
            return (Criteria) this;
        }

        public Criteria andYstdClosePriceLessThan(Float value) {
            addCriterion("ystd_close_price <", value, "ystdClosePrice");
            return (Criteria) this;
        }

        public Criteria andYstdClosePriceLessThanOrEqualTo(Float value) {
            addCriterion("ystd_close_price <=", value, "ystdClosePrice");
            return (Criteria) this;
        }

        public Criteria andYstdClosePriceIn(List<Float> values) {
            addCriterion("ystd_close_price in", values, "ystdClosePrice");
            return (Criteria) this;
        }

        public Criteria andYstdClosePriceNotIn(List<Float> values) {
            addCriterion("ystd_close_price not in", values, "ystdClosePrice");
            return (Criteria) this;
        }

        public Criteria andYstdClosePriceBetween(Float value1, Float value2) {
            addCriterion("ystd_close_price between", value1, value2, "ystdClosePrice");
            return (Criteria) this;
        }

        public Criteria andYstdClosePriceNotBetween(Float value1, Float value2) {
            addCriterion("ystd_close_price not between", value1, value2, "ystdClosePrice");
            return (Criteria) this;
        }

        public Criteria andNowRateIsNull() {
            addCriterion("now_rate is null");
            return (Criteria) this;
        }

        public Criteria andNowRateIsNotNull() {
            addCriterion("now_rate is not null");
            return (Criteria) this;
        }

        public Criteria andNowRateEqualTo(Float value) {
            addCriterion("now_rate =", value, "nowRate");
            return (Criteria) this;
        }

        public Criteria andNowRateNotEqualTo(Float value) {
            addCriterion("now_rate <>", value, "nowRate");
            return (Criteria) this;
        }

        public Criteria andNowRateGreaterThan(Float value) {
            addCriterion("now_rate >", value, "nowRate");
            return (Criteria) this;
        }

        public Criteria andNowRateGreaterThanOrEqualTo(Float value) {
            addCriterion("now_rate >=", value, "nowRate");
            return (Criteria) this;
        }

        public Criteria andNowRateLessThan(Float value) {
            addCriterion("now_rate <", value, "nowRate");
            return (Criteria) this;
        }

        public Criteria andNowRateLessThanOrEqualTo(Float value) {
            addCriterion("now_rate <=", value, "nowRate");
            return (Criteria) this;
        }

        public Criteria andNowRateIn(List<Float> values) {
            addCriterion("now_rate in", values, "nowRate");
            return (Criteria) this;
        }

        public Criteria andNowRateNotIn(List<Float> values) {
            addCriterion("now_rate not in", values, "nowRate");
            return (Criteria) this;
        }

        public Criteria andNowRateBetween(Float value1, Float value2) {
            addCriterion("now_rate between", value1, value2, "nowRate");
            return (Criteria) this;
        }

        public Criteria andNowRateNotBetween(Float value1, Float value2) {
            addCriterion("now_rate not between", value1, value2, "nowRate");
            return (Criteria) this;
        }

        public Criteria andNowPriceIsNull() {
            addCriterion("now_price is null");
            return (Criteria) this;
        }

        public Criteria andNowPriceIsNotNull() {
            addCriterion("now_price is not null");
            return (Criteria) this;
        }

        public Criteria andNowPriceEqualTo(Float value) {
            addCriterion("now_price =", value, "nowPrice");
            return (Criteria) this;
        }

        public Criteria andNowPriceNotEqualTo(Float value) {
            addCriterion("now_price <>", value, "nowPrice");
            return (Criteria) this;
        }

        public Criteria andNowPriceGreaterThan(Float value) {
            addCriterion("now_price >", value, "nowPrice");
            return (Criteria) this;
        }

        public Criteria andNowPriceGreaterThanOrEqualTo(Float value) {
            addCriterion("now_price >=", value, "nowPrice");
            return (Criteria) this;
        }

        public Criteria andNowPriceLessThan(Float value) {
            addCriterion("now_price <", value, "nowPrice");
            return (Criteria) this;
        }

        public Criteria andNowPriceLessThanOrEqualTo(Float value) {
            addCriterion("now_price <=", value, "nowPrice");
            return (Criteria) this;
        }

        public Criteria andNowPriceIn(List<Float> values) {
            addCriterion("now_price in", values, "nowPrice");
            return (Criteria) this;
        }

        public Criteria andNowPriceNotIn(List<Float> values) {
            addCriterion("now_price not in", values, "nowPrice");
            return (Criteria) this;
        }

        public Criteria andNowPriceBetween(Float value1, Float value2) {
            addCriterion("now_price between", value1, value2, "nowPrice");
            return (Criteria) this;
        }

        public Criteria andNowPriceNotBetween(Float value1, Float value2) {
            addCriterion("now_price not between", value1, value2, "nowPrice");
            return (Criteria) this;
        }

        public Criteria andHighestRateIsNull() {
            addCriterion("highest_rate is null");
            return (Criteria) this;
        }

        public Criteria andHighestRateIsNotNull() {
            addCriterion("highest_rate is not null");
            return (Criteria) this;
        }

        public Criteria andHighestRateEqualTo(Float value) {
            addCriterion("highest_rate =", value, "highestRate");
            return (Criteria) this;
        }

        public Criteria andHighestRateNotEqualTo(Float value) {
            addCriterion("highest_rate <>", value, "highestRate");
            return (Criteria) this;
        }

        public Criteria andHighestRateGreaterThan(Float value) {
            addCriterion("highest_rate >", value, "highestRate");
            return (Criteria) this;
        }

        public Criteria andHighestRateGreaterThanOrEqualTo(Float value) {
            addCriterion("highest_rate >=", value, "highestRate");
            return (Criteria) this;
        }

        public Criteria andHighestRateLessThan(Float value) {
            addCriterion("highest_rate <", value, "highestRate");
            return (Criteria) this;
        }

        public Criteria andHighestRateLessThanOrEqualTo(Float value) {
            addCriterion("highest_rate <=", value, "highestRate");
            return (Criteria) this;
        }

        public Criteria andHighestRateIn(List<Float> values) {
            addCriterion("highest_rate in", values, "highestRate");
            return (Criteria) this;
        }

        public Criteria andHighestRateNotIn(List<Float> values) {
            addCriterion("highest_rate not in", values, "highestRate");
            return (Criteria) this;
        }

        public Criteria andHighestRateBetween(Float value1, Float value2) {
            addCriterion("highest_rate between", value1, value2, "highestRate");
            return (Criteria) this;
        }

        public Criteria andHighestRateNotBetween(Float value1, Float value2) {
            addCriterion("highest_rate not between", value1, value2, "highestRate");
            return (Criteria) this;
        }

        public Criteria andHighestPriceIsNull() {
            addCriterion("highest_price is null");
            return (Criteria) this;
        }

        public Criteria andHighestPriceIsNotNull() {
            addCriterion("highest_price is not null");
            return (Criteria) this;
        }

        public Criteria andHighestPriceEqualTo(Float value) {
            addCriterion("highest_price =", value, "highestPrice");
            return (Criteria) this;
        }

        public Criteria andHighestPriceNotEqualTo(Float value) {
            addCriterion("highest_price <>", value, "highestPrice");
            return (Criteria) this;
        }

        public Criteria andHighestPriceGreaterThan(Float value) {
            addCriterion("highest_price >", value, "highestPrice");
            return (Criteria) this;
        }

        public Criteria andHighestPriceGreaterThanOrEqualTo(Float value) {
            addCriterion("highest_price >=", value, "highestPrice");
            return (Criteria) this;
        }

        public Criteria andHighestPriceLessThan(Float value) {
            addCriterion("highest_price <", value, "highestPrice");
            return (Criteria) this;
        }

        public Criteria andHighestPriceLessThanOrEqualTo(Float value) {
            addCriterion("highest_price <=", value, "highestPrice");
            return (Criteria) this;
        }

        public Criteria andHighestPriceIn(List<Float> values) {
            addCriterion("highest_price in", values, "highestPrice");
            return (Criteria) this;
        }

        public Criteria andHighestPriceNotIn(List<Float> values) {
            addCriterion("highest_price not in", values, "highestPrice");
            return (Criteria) this;
        }

        public Criteria andHighestPriceBetween(Float value1, Float value2) {
            addCriterion("highest_price between", value1, value2, "highestPrice");
            return (Criteria) this;
        }

        public Criteria andHighestPriceNotBetween(Float value1, Float value2) {
            addCriterion("highest_price not between", value1, value2, "highestPrice");
            return (Criteria) this;
        }

        public Criteria andLowestRateIsNull() {
            addCriterion("lowest_rate is null");
            return (Criteria) this;
        }

        public Criteria andLowestRateIsNotNull() {
            addCriterion("lowest_rate is not null");
            return (Criteria) this;
        }

        public Criteria andLowestRateEqualTo(Float value) {
            addCriterion("lowest_rate =", value, "lowestRate");
            return (Criteria) this;
        }

        public Criteria andLowestRateNotEqualTo(Float value) {
            addCriterion("lowest_rate <>", value, "lowestRate");
            return (Criteria) this;
        }

        public Criteria andLowestRateGreaterThan(Float value) {
            addCriterion("lowest_rate >", value, "lowestRate");
            return (Criteria) this;
        }

        public Criteria andLowestRateGreaterThanOrEqualTo(Float value) {
            addCriterion("lowest_rate >=", value, "lowestRate");
            return (Criteria) this;
        }

        public Criteria andLowestRateLessThan(Float value) {
            addCriterion("lowest_rate <", value, "lowestRate");
            return (Criteria) this;
        }

        public Criteria andLowestRateLessThanOrEqualTo(Float value) {
            addCriterion("lowest_rate <=", value, "lowestRate");
            return (Criteria) this;
        }

        public Criteria andLowestRateIn(List<Float> values) {
            addCriterion("lowest_rate in", values, "lowestRate");
            return (Criteria) this;
        }

        public Criteria andLowestRateNotIn(List<Float> values) {
            addCriterion("lowest_rate not in", values, "lowestRate");
            return (Criteria) this;
        }

        public Criteria andLowestRateBetween(Float value1, Float value2) {
            addCriterion("lowest_rate between", value1, value2, "lowestRate");
            return (Criteria) this;
        }

        public Criteria andLowestRateNotBetween(Float value1, Float value2) {
            addCriterion("lowest_rate not between", value1, value2, "lowestRate");
            return (Criteria) this;
        }

        public Criteria andLowestPriceIsNull() {
            addCriterion("lowest_price is null");
            return (Criteria) this;
        }

        public Criteria andLowestPriceIsNotNull() {
            addCriterion("lowest_price is not null");
            return (Criteria) this;
        }

        public Criteria andLowestPriceEqualTo(Float value) {
            addCriterion("lowest_price =", value, "lowestPrice");
            return (Criteria) this;
        }

        public Criteria andLowestPriceNotEqualTo(Float value) {
            addCriterion("lowest_price <>", value, "lowestPrice");
            return (Criteria) this;
        }

        public Criteria andLowestPriceGreaterThan(Float value) {
            addCriterion("lowest_price >", value, "lowestPrice");
            return (Criteria) this;
        }

        public Criteria andLowestPriceGreaterThanOrEqualTo(Float value) {
            addCriterion("lowest_price >=", value, "lowestPrice");
            return (Criteria) this;
        }

        public Criteria andLowestPriceLessThan(Float value) {
            addCriterion("lowest_price <", value, "lowestPrice");
            return (Criteria) this;
        }

        public Criteria andLowestPriceLessThanOrEqualTo(Float value) {
            addCriterion("lowest_price <=", value, "lowestPrice");
            return (Criteria) this;
        }

        public Criteria andLowestPriceIn(List<Float> values) {
            addCriterion("lowest_price in", values, "lowestPrice");
            return (Criteria) this;
        }

        public Criteria andLowestPriceNotIn(List<Float> values) {
            addCriterion("lowest_price not in", values, "lowestPrice");
            return (Criteria) this;
        }

        public Criteria andLowestPriceBetween(Float value1, Float value2) {
            addCriterion("lowest_price between", value1, value2, "lowestPrice");
            return (Criteria) this;
        }

        public Criteria andLowestPriceNotBetween(Float value1, Float value2) {
            addCriterion("lowest_price not between", value1, value2, "lowestPrice");
            return (Criteria) this;
        }

        public Criteria andMarketTimeIsNull() {
            addCriterion("market_time is null");
            return (Criteria) this;
        }

        public Criteria andMarketTimeIsNotNull() {
            addCriterion("market_time is not null");
            return (Criteria) this;
        }

        public Criteria andMarketTimeEqualTo(Integer value) {
            addCriterion("market_time =", value, "marketTime");
            return (Criteria) this;
        }

        public Criteria andMarketTimeNotEqualTo(Integer value) {
            addCriterion("market_time <>", value, "marketTime");
            return (Criteria) this;
        }

        public Criteria andMarketTimeGreaterThan(Integer value) {
            addCriterion("market_time >", value, "marketTime");
            return (Criteria) this;
        }

        public Criteria andMarketTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("market_time >=", value, "marketTime");
            return (Criteria) this;
        }

        public Criteria andMarketTimeLessThan(Integer value) {
            addCriterion("market_time <", value, "marketTime");
            return (Criteria) this;
        }

        public Criteria andMarketTimeLessThanOrEqualTo(Integer value) {
            addCriterion("market_time <=", value, "marketTime");
            return (Criteria) this;
        }

        public Criteria andMarketTimeIn(List<Integer> values) {
            addCriterion("market_time in", values, "marketTime");
            return (Criteria) this;
        }

        public Criteria andMarketTimeNotIn(List<Integer> values) {
            addCriterion("market_time not in", values, "marketTime");
            return (Criteria) this;
        }

        public Criteria andMarketTimeBetween(Integer value1, Integer value2) {
            addCriterion("market_time between", value1, value2, "marketTime");
            return (Criteria) this;
        }

        public Criteria andMarketTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("market_time not between", value1, value2, "marketTime");
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