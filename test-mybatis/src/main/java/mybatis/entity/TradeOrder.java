package mybatis.entity;

import java.io.Serializable;
import java.math.BigDecimal;

public class TradeOrder implements Serializable {
    private Integer id;

    private Integer dtTradeId;

    private String tradeAccountCode;

    private String orderType;

    private String marketCode;

    private String stockCode;

    private BigDecimal orderPrice;

    private Integer orderQuantity;

    private Integer orderTime;

    private String orderTradeSn;

    private BigDecimal clinchPrice;

    private Integer clinchQuantity;

    private Integer clinchTime;

    private BigDecimal procedureFee;

    private BigDecimal transferFee;

    private BigDecimal stampTaxFee;

    private Byte noticeStatus;

    private Integer noticeTime;

    private Byte orderStatus;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDtTradeId() {
        return dtTradeId;
    }

    public void setDtTradeId(Integer dtTradeId) {
        this.dtTradeId = dtTradeId;
    }

    public String getTradeAccountCode() {
        return tradeAccountCode;
    }

    public void setTradeAccountCode(String tradeAccountCode) {
        this.tradeAccountCode = tradeAccountCode == null ? null : tradeAccountCode.trim();
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType == null ? null : orderType.trim();
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

    public BigDecimal getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(BigDecimal orderPrice) {
        this.orderPrice = orderPrice;
    }

    public Integer getOrderQuantity() {
        return orderQuantity;
    }

    public void setOrderQuantity(Integer orderQuantity) {
        this.orderQuantity = orderQuantity;
    }

    public Integer getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Integer orderTime) {
        this.orderTime = orderTime;
    }

    public String getOrderTradeSn() {
        return orderTradeSn;
    }

    public void setOrderTradeSn(String orderTradeSn) {
        this.orderTradeSn = orderTradeSn == null ? null : orderTradeSn.trim();
    }

    public BigDecimal getClinchPrice() {
        return clinchPrice;
    }

    public void setClinchPrice(BigDecimal clinchPrice) {
        this.clinchPrice = clinchPrice;
    }

    public Integer getClinchQuantity() {
        return clinchQuantity;
    }

    public void setClinchQuantity(Integer clinchQuantity) {
        this.clinchQuantity = clinchQuantity;
    }

    public Integer getClinchTime() {
        return clinchTime;
    }

    public void setClinchTime(Integer clinchTime) {
        this.clinchTime = clinchTime;
    }

    public BigDecimal getProcedureFee() {
        return procedureFee;
    }

    public void setProcedureFee(BigDecimal procedureFee) {
        this.procedureFee = procedureFee;
    }

    public BigDecimal getTransferFee() {
        return transferFee;
    }

    public void setTransferFee(BigDecimal transferFee) {
        this.transferFee = transferFee;
    }

    public BigDecimal getStampTaxFee() {
        return stampTaxFee;
    }

    public void setStampTaxFee(BigDecimal stampTaxFee) {
        this.stampTaxFee = stampTaxFee;
    }

    public Byte getNoticeStatus() {
        return noticeStatus;
    }

    public void setNoticeStatus(Byte noticeStatus) {
        this.noticeStatus = noticeStatus;
    }

    public Integer getNoticeTime() {
        return noticeTime;
    }

    public void setNoticeTime(Integer noticeTime) {
        this.noticeTime = noticeTime;
    }

    public Byte getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Byte orderStatus) {
        this.orderStatus = orderStatus;
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
        TradeOrder other = (TradeOrder) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getDtTradeId() == null ? other.getDtTradeId() == null : this.getDtTradeId().equals(other.getDtTradeId()))
            && (this.getTradeAccountCode() == null ? other.getTradeAccountCode() == null : this.getTradeAccountCode().equals(other.getTradeAccountCode()))
            && (this.getOrderType() == null ? other.getOrderType() == null : this.getOrderType().equals(other.getOrderType()))
            && (this.getMarketCode() == null ? other.getMarketCode() == null : this.getMarketCode().equals(other.getMarketCode()))
            && (this.getStockCode() == null ? other.getStockCode() == null : this.getStockCode().equals(other.getStockCode()))
            && (this.getOrderPrice() == null ? other.getOrderPrice() == null : this.getOrderPrice().equals(other.getOrderPrice()))
            && (this.getOrderQuantity() == null ? other.getOrderQuantity() == null : this.getOrderQuantity().equals(other.getOrderQuantity()))
            && (this.getOrderTime() == null ? other.getOrderTime() == null : this.getOrderTime().equals(other.getOrderTime()))
            && (this.getOrderTradeSn() == null ? other.getOrderTradeSn() == null : this.getOrderTradeSn().equals(other.getOrderTradeSn()))
            && (this.getClinchPrice() == null ? other.getClinchPrice() == null : this.getClinchPrice().equals(other.getClinchPrice()))
            && (this.getClinchQuantity() == null ? other.getClinchQuantity() == null : this.getClinchQuantity().equals(other.getClinchQuantity()))
            && (this.getClinchTime() == null ? other.getClinchTime() == null : this.getClinchTime().equals(other.getClinchTime()))
            && (this.getProcedureFee() == null ? other.getProcedureFee() == null : this.getProcedureFee().equals(other.getProcedureFee()))
            && (this.getTransferFee() == null ? other.getTransferFee() == null : this.getTransferFee().equals(other.getTransferFee()))
            && (this.getStampTaxFee() == null ? other.getStampTaxFee() == null : this.getStampTaxFee().equals(other.getStampTaxFee()))
            && (this.getNoticeStatus() == null ? other.getNoticeStatus() == null : this.getNoticeStatus().equals(other.getNoticeStatus()))
            && (this.getNoticeTime() == null ? other.getNoticeTime() == null : this.getNoticeTime().equals(other.getNoticeTime()))
            && (this.getOrderStatus() == null ? other.getOrderStatus() == null : this.getOrderStatus().equals(other.getOrderStatus()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getDtTradeId() == null) ? 0 : getDtTradeId().hashCode());
        result = prime * result + ((getTradeAccountCode() == null) ? 0 : getTradeAccountCode().hashCode());
        result = prime * result + ((getOrderType() == null) ? 0 : getOrderType().hashCode());
        result = prime * result + ((getMarketCode() == null) ? 0 : getMarketCode().hashCode());
        result = prime * result + ((getStockCode() == null) ? 0 : getStockCode().hashCode());
        result = prime * result + ((getOrderPrice() == null) ? 0 : getOrderPrice().hashCode());
        result = prime * result + ((getOrderQuantity() == null) ? 0 : getOrderQuantity().hashCode());
        result = prime * result + ((getOrderTime() == null) ? 0 : getOrderTime().hashCode());
        result = prime * result + ((getOrderTradeSn() == null) ? 0 : getOrderTradeSn().hashCode());
        result = prime * result + ((getClinchPrice() == null) ? 0 : getClinchPrice().hashCode());
        result = prime * result + ((getClinchQuantity() == null) ? 0 : getClinchQuantity().hashCode());
        result = prime * result + ((getClinchTime() == null) ? 0 : getClinchTime().hashCode());
        result = prime * result + ((getProcedureFee() == null) ? 0 : getProcedureFee().hashCode());
        result = prime * result + ((getTransferFee() == null) ? 0 : getTransferFee().hashCode());
        result = prime * result + ((getStampTaxFee() == null) ? 0 : getStampTaxFee().hashCode());
        result = prime * result + ((getNoticeStatus() == null) ? 0 : getNoticeStatus().hashCode());
        result = prime * result + ((getNoticeTime() == null) ? 0 : getNoticeTime().hashCode());
        result = prime * result + ((getOrderStatus() == null) ? 0 : getOrderStatus().hashCode());
        return result;
    }
}