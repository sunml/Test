package mybatis.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class DianTouAccountTrade implements Serializable {
    private Integer id;

    private String dtTradeId;

    private String marketCode;

    private String stockCode;

    private BigDecimal principalMoney;

    private BigDecimal remainPrincipalMoney;

    private Integer buyStrategy;

    private Date buyEndtime;

    private BigDecimal buyTriggerPrice;

    private BigDecimal realBuyPrice;

    private Integer realBuyQuantity;

    private Date realBuyTime;

    private String buyTradeId;

    private BigDecimal buyProcedureFee;

    private BigDecimal buyTransferFee;

    private Integer saleStrategy;

    private Date saleStarttime;

    private BigDecimal saleTriggerPrice;

    private Date realSaleTime;

    private String saleTradeId;

    private BigDecimal realSalePrice;

    private Integer realSaleQuantity;

    private BigDecimal saleProcedureFee;

    private BigDecimal saleStampTaxFee;

    private Date dtTradeEndtime;

    private Float stopProfitRatio;

    private Float stopLossRatio;

    private Integer status;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDtTradeId() {
        return dtTradeId;
    }

    public void setDtTradeId(String dtTradeId) {
        this.dtTradeId = dtTradeId == null ? null : dtTradeId.trim();
    }

    public String getMarketCode() {
        return marketCode;
    }

    public void setMarketCode(String marketCode) {
        this.marketCode = marketCode == null ? null : marketCode.trim();
    }

    public String getStockCode() {
        return stockCode;
    }

    public void setStockCode(String stockCode) {
        this.stockCode = stockCode == null ? null : stockCode.trim();
    }

    public BigDecimal getPrincipalMoney() {
        return principalMoney;
    }

    public void setPrincipalMoney(BigDecimal principalMoney) {
        this.principalMoney = principalMoney;
    }

    public BigDecimal getRemainPrincipalMoney() {
        return remainPrincipalMoney;
    }

    public void setRemainPrincipalMoney(BigDecimal remainPrincipalMoney) {
        this.remainPrincipalMoney = remainPrincipalMoney;
    }

    public Integer getBuyStrategy() {
        return buyStrategy;
    }

    public void setBuyStrategy(Integer buyStrategy) {
        this.buyStrategy = buyStrategy;
    }

    public Date getBuyEndtime() {
        return buyEndtime;
    }

    public void setBuyEndtime(Date buyEndtime) {
        this.buyEndtime = buyEndtime;
    }

    public BigDecimal getBuyTriggerPrice() {
        return buyTriggerPrice;
    }

    public void setBuyTriggerPrice(BigDecimal buyTriggerPrice) {
        this.buyTriggerPrice = buyTriggerPrice;
    }

    public BigDecimal getRealBuyPrice() {
        return realBuyPrice;
    }

    public void setRealBuyPrice(BigDecimal realBuyPrice) {
        this.realBuyPrice = realBuyPrice;
    }

    public Integer getRealBuyQuantity() {
        return realBuyQuantity;
    }

    public void setRealBuyQuantity(Integer realBuyQuantity) {
        this.realBuyQuantity = realBuyQuantity;
    }

    public Date getRealBuyTime() {
        return realBuyTime;
    }

    public void setRealBuyTime(Date realBuyTime) {
        this.realBuyTime = realBuyTime;
    }

    public String getBuyTradeId() {
        return buyTradeId;
    }

    public void setBuyTradeId(String buyTradeId) {
        this.buyTradeId = buyTradeId == null ? null : buyTradeId.trim();
    }

    public BigDecimal getBuyProcedureFee() {
        return buyProcedureFee;
    }

    public void setBuyProcedureFee(BigDecimal buyProcedureFee) {
        this.buyProcedureFee = buyProcedureFee;
    }

    public BigDecimal getBuyTransferFee() {
        return buyTransferFee;
    }

    public void setBuyTransferFee(BigDecimal buyTransferFee) {
        this.buyTransferFee = buyTransferFee;
    }

    public Integer getSaleStrategy() {
        return saleStrategy;
    }

    public void setSaleStrategy(Integer saleStrategy) {
        this.saleStrategy = saleStrategy;
    }

    public Date getSaleStarttime() {
        return saleStarttime;
    }

    public void setSaleStarttime(Date saleStarttime) {
        this.saleStarttime = saleStarttime;
    }

    public BigDecimal getSaleTriggerPrice() {
        return saleTriggerPrice;
    }

    public void setSaleTriggerPrice(BigDecimal saleTriggerPrice) {
        this.saleTriggerPrice = saleTriggerPrice;
    }

    public Date getRealSaleTime() {
        return realSaleTime;
    }

    public void setRealSaleTime(Date realSaleTime) {
        this.realSaleTime = realSaleTime;
    }

    public String getSaleTradeId() {
        return saleTradeId;
    }

    public void setSaleTradeId(String saleTradeId) {
        this.saleTradeId = saleTradeId == null ? null : saleTradeId.trim();
    }

    public BigDecimal getRealSalePrice() {
        return realSalePrice;
    }

    public void setRealSalePrice(BigDecimal realSalePrice) {
        this.realSalePrice = realSalePrice;
    }

    public Integer getRealSaleQuantity() {
        return realSaleQuantity;
    }

    public void setRealSaleQuantity(Integer realSaleQuantity) {
        this.realSaleQuantity = realSaleQuantity;
    }

    public BigDecimal getSaleProcedureFee() {
        return saleProcedureFee;
    }

    public void setSaleProcedureFee(BigDecimal saleProcedureFee) {
        this.saleProcedureFee = saleProcedureFee;
    }

    public BigDecimal getSaleStampTaxFee() {
        return saleStampTaxFee;
    }

    public void setSaleStampTaxFee(BigDecimal saleStampTaxFee) {
        this.saleStampTaxFee = saleStampTaxFee;
    }

    public Date getDtTradeEndtime() {
        return dtTradeEndtime;
    }

    public void setDtTradeEndtime(Date dtTradeEndtime) {
        this.dtTradeEndtime = dtTradeEndtime;
    }

    public Float getStopProfitRatio() {
        return stopProfitRatio;
    }

    public void setStopProfitRatio(Float stopProfitRatio) {
        this.stopProfitRatio = stopProfitRatio;
    }

    public Float getStopLossRatio() {
        return stopLossRatio;
    }

    public void setStopLossRatio(Float stopLossRatio) {
        this.stopLossRatio = stopLossRatio;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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
        DianTouAccountTrade other = (DianTouAccountTrade) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getDtTradeId() == null ? other.getDtTradeId() == null : this.getDtTradeId().equals(other.getDtTradeId()))
            && (this.getMarketCode() == null ? other.getMarketCode() == null : this.getMarketCode().equals(other.getMarketCode()))
            && (this.getStockCode() == null ? other.getStockCode() == null : this.getStockCode().equals(other.getStockCode()))
            && (this.getPrincipalMoney() == null ? other.getPrincipalMoney() == null : this.getPrincipalMoney().equals(other.getPrincipalMoney()))
            && (this.getRemainPrincipalMoney() == null ? other.getRemainPrincipalMoney() == null : this.getRemainPrincipalMoney().equals(other.getRemainPrincipalMoney()))
            && (this.getBuyStrategy() == null ? other.getBuyStrategy() == null : this.getBuyStrategy().equals(other.getBuyStrategy()))
            && (this.getBuyEndtime() == null ? other.getBuyEndtime() == null : this.getBuyEndtime().equals(other.getBuyEndtime()))
            && (this.getBuyTriggerPrice() == null ? other.getBuyTriggerPrice() == null : this.getBuyTriggerPrice().equals(other.getBuyTriggerPrice()))
            && (this.getRealBuyPrice() == null ? other.getRealBuyPrice() == null : this.getRealBuyPrice().equals(other.getRealBuyPrice()))
            && (this.getRealBuyQuantity() == null ? other.getRealBuyQuantity() == null : this.getRealBuyQuantity().equals(other.getRealBuyQuantity()))
            && (this.getRealBuyTime() == null ? other.getRealBuyTime() == null : this.getRealBuyTime().equals(other.getRealBuyTime()))
            && (this.getBuyTradeId() == null ? other.getBuyTradeId() == null : this.getBuyTradeId().equals(other.getBuyTradeId()))
            && (this.getBuyProcedureFee() == null ? other.getBuyProcedureFee() == null : this.getBuyProcedureFee().equals(other.getBuyProcedureFee()))
            && (this.getBuyTransferFee() == null ? other.getBuyTransferFee() == null : this.getBuyTransferFee().equals(other.getBuyTransferFee()))
            && (this.getSaleStrategy() == null ? other.getSaleStrategy() == null : this.getSaleStrategy().equals(other.getSaleStrategy()))
            && (this.getSaleStarttime() == null ? other.getSaleStarttime() == null : this.getSaleStarttime().equals(other.getSaleStarttime()))
            && (this.getSaleTriggerPrice() == null ? other.getSaleTriggerPrice() == null : this.getSaleTriggerPrice().equals(other.getSaleTriggerPrice()))
            && (this.getRealSaleTime() == null ? other.getRealSaleTime() == null : this.getRealSaleTime().equals(other.getRealSaleTime()))
            && (this.getSaleTradeId() == null ? other.getSaleTradeId() == null : this.getSaleTradeId().equals(other.getSaleTradeId()))
            && (this.getRealSalePrice() == null ? other.getRealSalePrice() == null : this.getRealSalePrice().equals(other.getRealSalePrice()))
            && (this.getRealSaleQuantity() == null ? other.getRealSaleQuantity() == null : this.getRealSaleQuantity().equals(other.getRealSaleQuantity()))
            && (this.getSaleProcedureFee() == null ? other.getSaleProcedureFee() == null : this.getSaleProcedureFee().equals(other.getSaleProcedureFee()))
            && (this.getSaleStampTaxFee() == null ? other.getSaleStampTaxFee() == null : this.getSaleStampTaxFee().equals(other.getSaleStampTaxFee()))
            && (this.getDtTradeEndtime() == null ? other.getDtTradeEndtime() == null : this.getDtTradeEndtime().equals(other.getDtTradeEndtime()))
            && (this.getStopProfitRatio() == null ? other.getStopProfitRatio() == null : this.getStopProfitRatio().equals(other.getStopProfitRatio()))
            && (this.getStopLossRatio() == null ? other.getStopLossRatio() == null : this.getStopLossRatio().equals(other.getStopLossRatio()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getDtTradeId() == null) ? 0 : getDtTradeId().hashCode());
        result = prime * result + ((getMarketCode() == null) ? 0 : getMarketCode().hashCode());
        result = prime * result + ((getStockCode() == null) ? 0 : getStockCode().hashCode());
        result = prime * result + ((getPrincipalMoney() == null) ? 0 : getPrincipalMoney().hashCode());
        result = prime * result + ((getRemainPrincipalMoney() == null) ? 0 : getRemainPrincipalMoney().hashCode());
        result = prime * result + ((getBuyStrategy() == null) ? 0 : getBuyStrategy().hashCode());
        result = prime * result + ((getBuyEndtime() == null) ? 0 : getBuyEndtime().hashCode());
        result = prime * result + ((getBuyTriggerPrice() == null) ? 0 : getBuyTriggerPrice().hashCode());
        result = prime * result + ((getRealBuyPrice() == null) ? 0 : getRealBuyPrice().hashCode());
        result = prime * result + ((getRealBuyQuantity() == null) ? 0 : getRealBuyQuantity().hashCode());
        result = prime * result + ((getRealBuyTime() == null) ? 0 : getRealBuyTime().hashCode());
        result = prime * result + ((getBuyTradeId() == null) ? 0 : getBuyTradeId().hashCode());
        result = prime * result + ((getBuyProcedureFee() == null) ? 0 : getBuyProcedureFee().hashCode());
        result = prime * result + ((getBuyTransferFee() == null) ? 0 : getBuyTransferFee().hashCode());
        result = prime * result + ((getSaleStrategy() == null) ? 0 : getSaleStrategy().hashCode());
        result = prime * result + ((getSaleStarttime() == null) ? 0 : getSaleStarttime().hashCode());
        result = prime * result + ((getSaleTriggerPrice() == null) ? 0 : getSaleTriggerPrice().hashCode());
        result = prime * result + ((getRealSaleTime() == null) ? 0 : getRealSaleTime().hashCode());
        result = prime * result + ((getSaleTradeId() == null) ? 0 : getSaleTradeId().hashCode());
        result = prime * result + ((getRealSalePrice() == null) ? 0 : getRealSalePrice().hashCode());
        result = prime * result + ((getRealSaleQuantity() == null) ? 0 : getRealSaleQuantity().hashCode());
        result = prime * result + ((getSaleProcedureFee() == null) ? 0 : getSaleProcedureFee().hashCode());
        result = prime * result + ((getSaleStampTaxFee() == null) ? 0 : getSaleStampTaxFee().hashCode());
        result = prime * result + ((getDtTradeEndtime() == null) ? 0 : getDtTradeEndtime().hashCode());
        result = prime * result + ((getStopProfitRatio() == null) ? 0 : getStopProfitRatio().hashCode());
        result = prime * result + ((getStopLossRatio() == null) ? 0 : getStopLossRatio().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return result;
    }
}