package com.zking.ssm.model.info;

import lombok.ToString;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;
@ToString
public class TMoneywithdraw {
    private Integer moId;
    private Integer state;
    private String remark;
    private Date auditTime;
    private Date applyTime;
    private Integer auditorId;
    private Integer applierId;
    private BigDecimal amount;
    private BigDecimal fee;
    private String bankName;
    private String accountName;
    private String accountNumber;
    private String forkName;

    public Integer getMoId() {
        return moId;
    }

    public void setMoId(Integer moId) {
        this.moId = moId;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getAuditTime() {
        return auditTime;
    }

    public void setAuditTime(Date auditTime) {
        this.auditTime = auditTime;
    }

    public Date getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(Date applyTime) {
        this.applyTime = applyTime;
    }

    public Integer getAuditorId() {
        return auditorId;
    }

    public void setAuditorId(Integer auditorId) {
        this.auditorId = auditorId;
    }

    public Integer getApplierId() {
        return applierId;
    }

    public void setApplierId(Integer applierId) {
        this.applierId = applierId;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getFee() {
        return fee;
    }

    public void setFee(BigDecimal fee) {
        this.fee = fee;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getForkName() {
        return forkName;
    }

    public void setForkName(String forkName) {
        this.forkName = forkName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TMoneywithdraw that = (TMoneywithdraw) o;
        return Objects.equals(moId, that.moId) &&
                Objects.equals(state, that.state) &&
                Objects.equals(remark, that.remark) &&
                Objects.equals(auditTime, that.auditTime) &&
                Objects.equals(applyTime, that.applyTime) &&
                Objects.equals(auditorId, that.auditorId) &&
                Objects.equals(applierId, that.applierId) &&
                Objects.equals(amount, that.amount) &&
                Objects.equals(fee, that.fee) &&
                Objects.equals(bankName, that.bankName) &&
                Objects.equals(accountName, that.accountName) &&
                Objects.equals(accountNumber, that.accountNumber) &&
                Objects.equals(forkName, that.forkName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(moId, state, remark, auditTime, applyTime, auditorId, applierId, amount, fee, bankName, accountName, accountNumber, forkName);
    }
}
