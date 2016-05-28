package mybatis.entity;

import java.io.Serializable;

public class StockMarket implements Serializable {
    private String stockCode;

    private String marketCode;

    private Float openPrice;

    private Float ystdClosePrice;

    private Float nowRate;

    private Float nowPrice;

    private Float highestRate;

    private Float highestPrice;

    private Float lowestRate;

    private Float lowestPrice;

    private Integer marketTime;

    private static final long serialVersionUID = 1L;

    public String getStockCode() {
        return stockCode;
    }

    public void setStockCode(String stockCode) {
        this.stockCode = stockCode == null ? null : stockCode.trim();
    }

    public String getMarketCode() {
        return marketCode;
    }

    public void setMarketCode(String marketCode) {
        this.marketCode = marketCode == null ? null : marketCode.trim();
    }

    public Float getOpenPrice() {
        return openPrice;
    }

    public void setOpenPrice(Float openPrice) {
        this.openPrice = openPrice;
    }

    public Float getYstdClosePrice() {
        return ystdClosePrice;
    }

    public void setYstdClosePrice(Float ystdClosePrice) {
        this.ystdClosePrice = ystdClosePrice;
    }

    public Float getNowRate() {
        return nowRate;
    }

    public void setNowRate(Float nowRate) {
        this.nowRate = nowRate;
    }

    public Float getNowPrice() {
        return nowPrice;
    }

    public void setNowPrice(Float nowPrice) {
        this.nowPrice = nowPrice;
    }

    public Float getHighestRate() {
        return highestRate;
    }

    public void setHighestRate(Float highestRate) {
        this.highestRate = highestRate;
    }

    public Float getHighestPrice() {
        return highestPrice;
    }

    public void setHighestPrice(Float highestPrice) {
        this.highestPrice = highestPrice;
    }

    public Float getLowestRate() {
        return lowestRate;
    }

    public void setLowestRate(Float lowestRate) {
        this.lowestRate = lowestRate;
    }

    public Float getLowestPrice() {
        return lowestPrice;
    }

    public void setLowestPrice(Float lowestPrice) {
        this.lowestPrice = lowestPrice;
    }

    public Integer getMarketTime() {
        return marketTime;
    }

    public void setMarketTime(Integer marketTime) {
        this.marketTime = marketTime;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        StockMarket other = (StockMarket) that;
        return (this.getStockCode() == null ? other.getStockCode() == null : this.getStockCode().equals(other.getStockCode()))
            && (this.getMarketCode() == null ? other.getMarketCode() == null : this.getMarketCode().equals(other.getMarketCode()))
            && (this.getOpenPrice() == null ? other.getOpenPrice() == null : this.getOpenPrice().equals(other.getOpenPrice()))
            && (this.getYstdClosePrice() == null ? other.getYstdClosePrice() == null : this.getYstdClosePrice().equals(other.getYstdClosePrice()))
            && (this.getNowRate() == null ? other.getNowRate() == null : this.getNowRate().equals(other.getNowRate()))
            && (this.getNowPrice() == null ? other.getNowPrice() == null : this.getNowPrice().equals(other.getNowPrice()))
            && (this.getHighestRate() == null ? other.getHighestRate() == null : this.getHighestRate().equals(other.getHighestRate()))
            && (this.getHighestPrice() == null ? other.getHighestPrice() == null : this.getHighestPrice().equals(other.getHighestPrice()))
            && (this.getLowestRate() == null ? other.getLowestRate() == null : this.getLowestRate().equals(other.getLowestRate()))
            && (this.getLowestPrice() == null ? other.getLowestPrice() == null : this.getLowestPrice().equals(other.getLowestPrice()))
            && (this.getMarketTime() == null ? other.getMarketTime() == null : this.getMarketTime().equals(other.getMarketTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getStockCode() == null) ? 0 : getStockCode().hashCode());
        result = prime * result + ((getMarketCode() == null) ? 0 : getMarketCode().hashCode());
        result = prime * result + ((getOpenPrice() == null) ? 0 : getOpenPrice().hashCode());
        result = prime * result + ((getYstdClosePrice() == null) ? 0 : getYstdClosePrice().hashCode());
        result = prime * result + ((getNowRate() == null) ? 0 : getNowRate().hashCode());
        result = prime * result + ((getNowPrice() == null) ? 0 : getNowPrice().hashCode());
        result = prime * result + ((getHighestRate() == null) ? 0 : getHighestRate().hashCode());
        result = prime * result + ((getHighestPrice() == null) ? 0 : getHighestPrice().hashCode());
        result = prime * result + ((getLowestRate() == null) ? 0 : getLowestRate().hashCode());
        result = prime * result + ((getLowestPrice() == null) ? 0 : getLowestPrice().hashCode());
        result = prime * result + ((getMarketTime() == null) ? 0 : getMarketTime().hashCode());
        return result;
    }
}