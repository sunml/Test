package mybatis.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class PeiziDetail implements Serializable {
    private Integer id;

    private Integer userId;

    private String pzId;

    private Integer productId;

    private Integer policyId;

    private Float feeRate;

    private BigDecimal riskAssureMoney;

    private BigDecimal borrowMoney;

    private String dtsMobile;

    private Integer dtsGUserId;

    private Integer dtsDtsSystemId;

    private String dtsWebservicesUrl;

    private String dtsDtsUserId;

    private String dtsAccountCode;

    private String dtsPassword;

    private String dtsCompanyCode;

    private Double dtsAccountValue;

    private Double dtsAccountBalance;

    private Double dtsAccountAssetValue;

    private Integer dtsAccountSyncTime;

    private Boolean feeMode;

    private Date startInterestDay;

    private Integer feeDate;

    private Date feeIncomeNextDate;

    private Integer feeTime;

    private Boolean balanceMode;

    private BigDecimal interestMoney;

    private Integer interestDeductTimes;

    private BigDecimal warningLine;

    private Integer lastWarningSmstime;

    private BigDecimal closeLine;

    private Integer lastCloseSmstime;

    private BigDecimal stockIncome;

    private BigDecimal markeingMoney;

    private BigDecimal incomeMoneyPz;

    private BigDecimal payMoneyPz;

    private Boolean pzStatus;

    private Integer pzTerminateTime;

    private String pzTerminateReason;

    private Integer dtsCloseoutTime;

    private Integer pzClearingTime;

    private Integer pzDtscancelTime;

    private String hash;

    private Integer deferTimes;

    private Boolean pzAutoDefer;

    private Date pzEndDate;

    private BigDecimal forfeitInterest;

    private Short hashVersion;

    private Date updatetime;

    private Date addtime;

    private String channelCode;

    private String subChannelCode;

    private Integer umbrellaId;

    private Boolean source;

    private BigDecimal beforRiskAssureMoney;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getPzId() {
        return pzId;
    }

    public void setPzId(String pzId) {
        this.pzId = pzId == null ? null : pzId.trim();
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getPolicyId() {
        return policyId;
    }

    public void setPolicyId(Integer policyId) {
        this.policyId = policyId;
    }

    public Float getFeeRate() {
        return feeRate;
    }

    public void setFeeRate(Float feeRate) {
        this.feeRate = feeRate;
    }

    public BigDecimal getRiskAssureMoney() {
        return riskAssureMoney;
    }

    public void setRiskAssureMoney(BigDecimal riskAssureMoney) {
        this.riskAssureMoney = riskAssureMoney;
    }

    public BigDecimal getBorrowMoney() {
        return borrowMoney;
    }

    public void setBorrowMoney(BigDecimal borrowMoney) {
        this.borrowMoney = borrowMoney;
    }

    public String getDtsMobile() {
        return dtsMobile;
    }

    public void setDtsMobile(String dtsMobile) {
        this.dtsMobile = dtsMobile == null ? null : dtsMobile.trim();
    }

    public Integer getDtsGUserId() {
        return dtsGUserId;
    }

    public void setDtsGUserId(Integer dtsGUserId) {
        this.dtsGUserId = dtsGUserId;
    }

    public Integer getDtsDtsSystemId() {
        return dtsDtsSystemId;
    }

    public void setDtsDtsSystemId(Integer dtsDtsSystemId) {
        this.dtsDtsSystemId = dtsDtsSystemId;
    }

    public String getDtsWebservicesUrl() {
        return dtsWebservicesUrl;
    }

    public void setDtsWebservicesUrl(String dtsWebservicesUrl) {
        this.dtsWebservicesUrl = dtsWebservicesUrl == null ? null : dtsWebservicesUrl.trim();
    }

    public String getDtsDtsUserId() {
        return dtsDtsUserId;
    }

    public void setDtsDtsUserId(String dtsDtsUserId) {
        this.dtsDtsUserId = dtsDtsUserId == null ? null : dtsDtsUserId.trim();
    }

    public String getDtsAccountCode() {
        return dtsAccountCode;
    }

    public void setDtsAccountCode(String dtsAccountCode) {
        this.dtsAccountCode = dtsAccountCode == null ? null : dtsAccountCode.trim();
    }

    public String getDtsPassword() {
        return dtsPassword;
    }

    public void setDtsPassword(String dtsPassword) {
        this.dtsPassword = dtsPassword == null ? null : dtsPassword.trim();
    }

    public String getDtsCompanyCode() {
        return dtsCompanyCode;
    }

    public void setDtsCompanyCode(String dtsCompanyCode) {
        this.dtsCompanyCode = dtsCompanyCode == null ? null : dtsCompanyCode.trim();
    }

    public Double getDtsAccountValue() {
        return dtsAccountValue;
    }

    public void setDtsAccountValue(Double dtsAccountValue) {
        this.dtsAccountValue = dtsAccountValue;
    }

    public Double getDtsAccountBalance() {
        return dtsAccountBalance;
    }

    public void setDtsAccountBalance(Double dtsAccountBalance) {
        this.dtsAccountBalance = dtsAccountBalance;
    }

    public Double getDtsAccountAssetValue() {
        return dtsAccountAssetValue;
    }

    public void setDtsAccountAssetValue(Double dtsAccountAssetValue) {
        this.dtsAccountAssetValue = dtsAccountAssetValue;
    }

    public Integer getDtsAccountSyncTime() {
        return dtsAccountSyncTime;
    }

    public void setDtsAccountSyncTime(Integer dtsAccountSyncTime) {
        this.dtsAccountSyncTime = dtsAccountSyncTime;
    }

    public Boolean getFeeMode() {
        return feeMode;
    }

    public void setFeeMode(Boolean feeMode) {
        this.feeMode = feeMode;
    }

    public Date getStartInterestDay() {
        return startInterestDay;
    }

    public void setStartInterestDay(Date startInterestDay) {
        this.startInterestDay = startInterestDay;
    }

    public Integer getFeeDate() {
        return feeDate;
    }

    public void setFeeDate(Integer feeDate) {
        this.feeDate = feeDate;
    }

    public Date getFeeIncomeNextDate() {
        return feeIncomeNextDate;
    }

    public void setFeeIncomeNextDate(Date feeIncomeNextDate) {
        this.feeIncomeNextDate = feeIncomeNextDate;
    }

    public Integer getFeeTime() {
        return feeTime;
    }

    public void setFeeTime(Integer feeTime) {
        this.feeTime = feeTime;
    }

    public Boolean getBalanceMode() {
        return balanceMode;
    }

    public void setBalanceMode(Boolean balanceMode) {
        this.balanceMode = balanceMode;
    }

    public BigDecimal getInterestMoney() {
        return interestMoney;
    }

    public void setInterestMoney(BigDecimal interestMoney) {
        this.interestMoney = interestMoney;
    }

    public Integer getInterestDeductTimes() {
        return interestDeductTimes;
    }

    public void setInterestDeductTimes(Integer interestDeductTimes) {
        this.interestDeductTimes = interestDeductTimes;
    }

    public BigDecimal getWarningLine() {
        return warningLine;
    }

    public void setWarningLine(BigDecimal warningLine) {
        this.warningLine = warningLine;
    }

    public Integer getLastWarningSmstime() {
        return lastWarningSmstime;
    }

    public void setLastWarningSmstime(Integer lastWarningSmstime) {
        this.lastWarningSmstime = lastWarningSmstime;
    }

    public BigDecimal getCloseLine() {
        return closeLine;
    }

    public void setCloseLine(BigDecimal closeLine) {
        this.closeLine = closeLine;
    }

    public Integer getLastCloseSmstime() {
        return lastCloseSmstime;
    }

    public void setLastCloseSmstime(Integer lastCloseSmstime) {
        this.lastCloseSmstime = lastCloseSmstime;
    }

    public BigDecimal getStockIncome() {
        return stockIncome;
    }

    public void setStockIncome(BigDecimal stockIncome) {
        this.stockIncome = stockIncome;
    }

    public BigDecimal getMarkeingMoney() {
        return markeingMoney;
    }

    public void setMarkeingMoney(BigDecimal markeingMoney) {
        this.markeingMoney = markeingMoney;
    }

    public BigDecimal getIncomeMoneyPz() {
        return incomeMoneyPz;
    }

    public void setIncomeMoneyPz(BigDecimal incomeMoneyPz) {
        this.incomeMoneyPz = incomeMoneyPz;
    }

    public BigDecimal getPayMoneyPz() {
        return payMoneyPz;
    }

    public void setPayMoneyPz(BigDecimal payMoneyPz) {
        this.payMoneyPz = payMoneyPz;
    }

    public Boolean getPzStatus() {
        return pzStatus;
    }

    public void setPzStatus(Boolean pzStatus) {
        this.pzStatus = pzStatus;
    }

    public Integer getPzTerminateTime() {
        return pzTerminateTime;
    }

    public void setPzTerminateTime(Integer pzTerminateTime) {
        this.pzTerminateTime = pzTerminateTime;
    }

    public String getPzTerminateReason() {
        return pzTerminateReason;
    }

    public void setPzTerminateReason(String pzTerminateReason) {
        this.pzTerminateReason = pzTerminateReason == null ? null : pzTerminateReason.trim();
    }

    public Integer getDtsCloseoutTime() {
        return dtsCloseoutTime;
    }

    public void setDtsCloseoutTime(Integer dtsCloseoutTime) {
        this.dtsCloseoutTime = dtsCloseoutTime;
    }

    public Integer getPzClearingTime() {
        return pzClearingTime;
    }

    public void setPzClearingTime(Integer pzClearingTime) {
        this.pzClearingTime = pzClearingTime;
    }

    public Integer getPzDtscancelTime() {
        return pzDtscancelTime;
    }

    public void setPzDtscancelTime(Integer pzDtscancelTime) {
        this.pzDtscancelTime = pzDtscancelTime;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash == null ? null : hash.trim();
    }

    public Integer getDeferTimes() {
        return deferTimes;
    }

    public void setDeferTimes(Integer deferTimes) {
        this.deferTimes = deferTimes;
    }

    public Boolean getPzAutoDefer() {
        return pzAutoDefer;
    }

    public void setPzAutoDefer(Boolean pzAutoDefer) {
        this.pzAutoDefer = pzAutoDefer;
    }

    public Date getPzEndDate() {
        return pzEndDate;
    }

    public void setPzEndDate(Date pzEndDate) {
        this.pzEndDate = pzEndDate;
    }

    public BigDecimal getForfeitInterest() {
        return forfeitInterest;
    }

    public void setForfeitInterest(BigDecimal forfeitInterest) {
        this.forfeitInterest = forfeitInterest;
    }

    public Short getHashVersion() {
        return hashVersion;
    }

    public void setHashVersion(Short hashVersion) {
        this.hashVersion = hashVersion;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    public String getChannelCode() {
        return channelCode;
    }

    public void setChannelCode(String channelCode) {
        this.channelCode = channelCode == null ? null : channelCode.trim();
    }

    public String getSubChannelCode() {
        return subChannelCode;
    }

    public void setSubChannelCode(String subChannelCode) {
        this.subChannelCode = subChannelCode == null ? null : subChannelCode.trim();
    }

    public Integer getUmbrellaId() {
        return umbrellaId;
    }

    public void setUmbrellaId(Integer umbrellaId) {
        this.umbrellaId = umbrellaId;
    }

    public Boolean getSource() {
        return source;
    }

    public void setSource(Boolean source) {
        this.source = source;
    }

    public BigDecimal getBeforRiskAssureMoney() {
        return beforRiskAssureMoney;
    }

    public void setBeforRiskAssureMoney(BigDecimal beforRiskAssureMoney) {
        this.beforRiskAssureMoney = beforRiskAssureMoney;
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
        PeiziDetail other = (PeiziDetail) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getPzId() == null ? other.getPzId() == null : this.getPzId().equals(other.getPzId()))
            && (this.getProductId() == null ? other.getProductId() == null : this.getProductId().equals(other.getProductId()))
            && (this.getPolicyId() == null ? other.getPolicyId() == null : this.getPolicyId().equals(other.getPolicyId()))
            && (this.getFeeRate() == null ? other.getFeeRate() == null : this.getFeeRate().equals(other.getFeeRate()))
            && (this.getRiskAssureMoney() == null ? other.getRiskAssureMoney() == null : this.getRiskAssureMoney().equals(other.getRiskAssureMoney()))
            && (this.getBorrowMoney() == null ? other.getBorrowMoney() == null : this.getBorrowMoney().equals(other.getBorrowMoney()))
            && (this.getDtsMobile() == null ? other.getDtsMobile() == null : this.getDtsMobile().equals(other.getDtsMobile()))
            && (this.getDtsGUserId() == null ? other.getDtsGUserId() == null : this.getDtsGUserId().equals(other.getDtsGUserId()))
            && (this.getDtsDtsSystemId() == null ? other.getDtsDtsSystemId() == null : this.getDtsDtsSystemId().equals(other.getDtsDtsSystemId()))
            && (this.getDtsWebservicesUrl() == null ? other.getDtsWebservicesUrl() == null : this.getDtsWebservicesUrl().equals(other.getDtsWebservicesUrl()))
            && (this.getDtsDtsUserId() == null ? other.getDtsDtsUserId() == null : this.getDtsDtsUserId().equals(other.getDtsDtsUserId()))
            && (this.getDtsAccountCode() == null ? other.getDtsAccountCode() == null : this.getDtsAccountCode().equals(other.getDtsAccountCode()))
            && (this.getDtsPassword() == null ? other.getDtsPassword() == null : this.getDtsPassword().equals(other.getDtsPassword()))
            && (this.getDtsCompanyCode() == null ? other.getDtsCompanyCode() == null : this.getDtsCompanyCode().equals(other.getDtsCompanyCode()))
            && (this.getDtsAccountValue() == null ? other.getDtsAccountValue() == null : this.getDtsAccountValue().equals(other.getDtsAccountValue()))
            && (this.getDtsAccountBalance() == null ? other.getDtsAccountBalance() == null : this.getDtsAccountBalance().equals(other.getDtsAccountBalance()))
            && (this.getDtsAccountAssetValue() == null ? other.getDtsAccountAssetValue() == null : this.getDtsAccountAssetValue().equals(other.getDtsAccountAssetValue()))
            && (this.getDtsAccountSyncTime() == null ? other.getDtsAccountSyncTime() == null : this.getDtsAccountSyncTime().equals(other.getDtsAccountSyncTime()))
            && (this.getFeeMode() == null ? other.getFeeMode() == null : this.getFeeMode().equals(other.getFeeMode()))
            && (this.getStartInterestDay() == null ? other.getStartInterestDay() == null : this.getStartInterestDay().equals(other.getStartInterestDay()))
            && (this.getFeeDate() == null ? other.getFeeDate() == null : this.getFeeDate().equals(other.getFeeDate()))
            && (this.getFeeIncomeNextDate() == null ? other.getFeeIncomeNextDate() == null : this.getFeeIncomeNextDate().equals(other.getFeeIncomeNextDate()))
            && (this.getFeeTime() == null ? other.getFeeTime() == null : this.getFeeTime().equals(other.getFeeTime()))
            && (this.getBalanceMode() == null ? other.getBalanceMode() == null : this.getBalanceMode().equals(other.getBalanceMode()))
            && (this.getInterestMoney() == null ? other.getInterestMoney() == null : this.getInterestMoney().equals(other.getInterestMoney()))
            && (this.getInterestDeductTimes() == null ? other.getInterestDeductTimes() == null : this.getInterestDeductTimes().equals(other.getInterestDeductTimes()))
            && (this.getWarningLine() == null ? other.getWarningLine() == null : this.getWarningLine().equals(other.getWarningLine()))
            && (this.getLastWarningSmstime() == null ? other.getLastWarningSmstime() == null : this.getLastWarningSmstime().equals(other.getLastWarningSmstime()))
            && (this.getCloseLine() == null ? other.getCloseLine() == null : this.getCloseLine().equals(other.getCloseLine()))
            && (this.getLastCloseSmstime() == null ? other.getLastCloseSmstime() == null : this.getLastCloseSmstime().equals(other.getLastCloseSmstime()))
            && (this.getStockIncome() == null ? other.getStockIncome() == null : this.getStockIncome().equals(other.getStockIncome()))
            && (this.getMarkeingMoney() == null ? other.getMarkeingMoney() == null : this.getMarkeingMoney().equals(other.getMarkeingMoney()))
            && (this.getIncomeMoneyPz() == null ? other.getIncomeMoneyPz() == null : this.getIncomeMoneyPz().equals(other.getIncomeMoneyPz()))
            && (this.getPayMoneyPz() == null ? other.getPayMoneyPz() == null : this.getPayMoneyPz().equals(other.getPayMoneyPz()))
            && (this.getPzStatus() == null ? other.getPzStatus() == null : this.getPzStatus().equals(other.getPzStatus()))
            && (this.getPzTerminateTime() == null ? other.getPzTerminateTime() == null : this.getPzTerminateTime().equals(other.getPzTerminateTime()))
            && (this.getPzTerminateReason() == null ? other.getPzTerminateReason() == null : this.getPzTerminateReason().equals(other.getPzTerminateReason()))
            && (this.getDtsCloseoutTime() == null ? other.getDtsCloseoutTime() == null : this.getDtsCloseoutTime().equals(other.getDtsCloseoutTime()))
            && (this.getPzClearingTime() == null ? other.getPzClearingTime() == null : this.getPzClearingTime().equals(other.getPzClearingTime()))
            && (this.getPzDtscancelTime() == null ? other.getPzDtscancelTime() == null : this.getPzDtscancelTime().equals(other.getPzDtscancelTime()))
            && (this.getHash() == null ? other.getHash() == null : this.getHash().equals(other.getHash()))
            && (this.getDeferTimes() == null ? other.getDeferTimes() == null : this.getDeferTimes().equals(other.getDeferTimes()))
            && (this.getPzAutoDefer() == null ? other.getPzAutoDefer() == null : this.getPzAutoDefer().equals(other.getPzAutoDefer()))
            && (this.getPzEndDate() == null ? other.getPzEndDate() == null : this.getPzEndDate().equals(other.getPzEndDate()))
            && (this.getForfeitInterest() == null ? other.getForfeitInterest() == null : this.getForfeitInterest().equals(other.getForfeitInterest()))
            && (this.getHashVersion() == null ? other.getHashVersion() == null : this.getHashVersion().equals(other.getHashVersion()))
            && (this.getUpdatetime() == null ? other.getUpdatetime() == null : this.getUpdatetime().equals(other.getUpdatetime()))
            && (this.getAddtime() == null ? other.getAddtime() == null : this.getAddtime().equals(other.getAddtime()))
            && (this.getChannelCode() == null ? other.getChannelCode() == null : this.getChannelCode().equals(other.getChannelCode()))
            && (this.getSubChannelCode() == null ? other.getSubChannelCode() == null : this.getSubChannelCode().equals(other.getSubChannelCode()))
            && (this.getUmbrellaId() == null ? other.getUmbrellaId() == null : this.getUmbrellaId().equals(other.getUmbrellaId()))
            && (this.getSource() == null ? other.getSource() == null : this.getSource().equals(other.getSource()))
            && (this.getBeforRiskAssureMoney() == null ? other.getBeforRiskAssureMoney() == null : this.getBeforRiskAssureMoney().equals(other.getBeforRiskAssureMoney()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getPzId() == null) ? 0 : getPzId().hashCode());
        result = prime * result + ((getProductId() == null) ? 0 : getProductId().hashCode());
        result = prime * result + ((getPolicyId() == null) ? 0 : getPolicyId().hashCode());
        result = prime * result + ((getFeeRate() == null) ? 0 : getFeeRate().hashCode());
        result = prime * result + ((getRiskAssureMoney() == null) ? 0 : getRiskAssureMoney().hashCode());
        result = prime * result + ((getBorrowMoney() == null) ? 0 : getBorrowMoney().hashCode());
        result = prime * result + ((getDtsMobile() == null) ? 0 : getDtsMobile().hashCode());
        result = prime * result + ((getDtsGUserId() == null) ? 0 : getDtsGUserId().hashCode());
        result = prime * result + ((getDtsDtsSystemId() == null) ? 0 : getDtsDtsSystemId().hashCode());
        result = prime * result + ((getDtsWebservicesUrl() == null) ? 0 : getDtsWebservicesUrl().hashCode());
        result = prime * result + ((getDtsDtsUserId() == null) ? 0 : getDtsDtsUserId().hashCode());
        result = prime * result + ((getDtsAccountCode() == null) ? 0 : getDtsAccountCode().hashCode());
        result = prime * result + ((getDtsPassword() == null) ? 0 : getDtsPassword().hashCode());
        result = prime * result + ((getDtsCompanyCode() == null) ? 0 : getDtsCompanyCode().hashCode());
        result = prime * result + ((getDtsAccountValue() == null) ? 0 : getDtsAccountValue().hashCode());
        result = prime * result + ((getDtsAccountBalance() == null) ? 0 : getDtsAccountBalance().hashCode());
        result = prime * result + ((getDtsAccountAssetValue() == null) ? 0 : getDtsAccountAssetValue().hashCode());
        result = prime * result + ((getDtsAccountSyncTime() == null) ? 0 : getDtsAccountSyncTime().hashCode());
        result = prime * result + ((getFeeMode() == null) ? 0 : getFeeMode().hashCode());
        result = prime * result + ((getStartInterestDay() == null) ? 0 : getStartInterestDay().hashCode());
        result = prime * result + ((getFeeDate() == null) ? 0 : getFeeDate().hashCode());
        result = prime * result + ((getFeeIncomeNextDate() == null) ? 0 : getFeeIncomeNextDate().hashCode());
        result = prime * result + ((getFeeTime() == null) ? 0 : getFeeTime().hashCode());
        result = prime * result + ((getBalanceMode() == null) ? 0 : getBalanceMode().hashCode());
        result = prime * result + ((getInterestMoney() == null) ? 0 : getInterestMoney().hashCode());
        result = prime * result + ((getInterestDeductTimes() == null) ? 0 : getInterestDeductTimes().hashCode());
        result = prime * result + ((getWarningLine() == null) ? 0 : getWarningLine().hashCode());
        result = prime * result + ((getLastWarningSmstime() == null) ? 0 : getLastWarningSmstime().hashCode());
        result = prime * result + ((getCloseLine() == null) ? 0 : getCloseLine().hashCode());
        result = prime * result + ((getLastCloseSmstime() == null) ? 0 : getLastCloseSmstime().hashCode());
        result = prime * result + ((getStockIncome() == null) ? 0 : getStockIncome().hashCode());
        result = prime * result + ((getMarkeingMoney() == null) ? 0 : getMarkeingMoney().hashCode());
        result = prime * result + ((getIncomeMoneyPz() == null) ? 0 : getIncomeMoneyPz().hashCode());
        result = prime * result + ((getPayMoneyPz() == null) ? 0 : getPayMoneyPz().hashCode());
        result = prime * result + ((getPzStatus() == null) ? 0 : getPzStatus().hashCode());
        result = prime * result + ((getPzTerminateTime() == null) ? 0 : getPzTerminateTime().hashCode());
        result = prime * result + ((getPzTerminateReason() == null) ? 0 : getPzTerminateReason().hashCode());
        result = prime * result + ((getDtsCloseoutTime() == null) ? 0 : getDtsCloseoutTime().hashCode());
        result = prime * result + ((getPzClearingTime() == null) ? 0 : getPzClearingTime().hashCode());
        result = prime * result + ((getPzDtscancelTime() == null) ? 0 : getPzDtscancelTime().hashCode());
        result = prime * result + ((getHash() == null) ? 0 : getHash().hashCode());
        result = prime * result + ((getDeferTimes() == null) ? 0 : getDeferTimes().hashCode());
        result = prime * result + ((getPzAutoDefer() == null) ? 0 : getPzAutoDefer().hashCode());
        result = prime * result + ((getPzEndDate() == null) ? 0 : getPzEndDate().hashCode());
        result = prime * result + ((getForfeitInterest() == null) ? 0 : getForfeitInterest().hashCode());
        result = prime * result + ((getHashVersion() == null) ? 0 : getHashVersion().hashCode());
        result = prime * result + ((getUpdatetime() == null) ? 0 : getUpdatetime().hashCode());
        result = prime * result + ((getAddtime() == null) ? 0 : getAddtime().hashCode());
        result = prime * result + ((getChannelCode() == null) ? 0 : getChannelCode().hashCode());
        result = prime * result + ((getSubChannelCode() == null) ? 0 : getSubChannelCode().hashCode());
        result = prime * result + ((getUmbrellaId() == null) ? 0 : getUmbrellaId().hashCode());
        result = prime * result + ((getSource() == null) ? 0 : getSource().hashCode());
        result = prime * result + ((getBeforRiskAssureMoney() == null) ? 0 : getBeforRiskAssureMoney().hashCode());
        return result;
    }
}