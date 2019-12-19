package com.zking.ssm.model.info;

import lombok.ToString;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;
@ToString
public class TAccountflow {
    private Integer afId;
    private BigDecimal amount;
    private String note;
    private Date tradeTime;
    private Integer actionType;
    private Integer accountId;
    private BigDecimal usableAmount;
    private BigDecimal freezedAmount;
    private String grantpeople;
    private String allocateAmount;
    private TAccount account;

    public Integer getAfId() {
        return afId;
    }

    public void setAfId(Integer afId) {
        this.afId = afId;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Date getTradeTime() {
        return tradeTime;
    }

    public void setTradeTime(Date tradeTime) {
        this.tradeTime = tradeTime;
    }

    public Integer getActionType() {
        return actionType;
    }

    public void setActionType(Integer actionType) {
        this.actionType = actionType;
    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public BigDecimal getUsableAmount() {
        return usableAmount;
    }

    public void setUsableAmount(BigDecimal usableAmount) {
        this.usableAmount = usableAmount;
    }

    public BigDecimal getFreezedAmount() {
        return freezedAmount;
    }

    public void setFreezedAmount(BigDecimal freezedAmount) {
        this.freezedAmount = freezedAmount;
    }

    public String getGrantpeople() {
        return grantpeople;
    }

    public void setGrantpeople(String grantpeople) {
        this.grantpeople = grantpeople;
    }

    public String getAllocateAmount() {
        return allocateAmount;
    }

    public void setAllocateAmount(String allocateAmount) {
        this.allocateAmount = allocateAmount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TAccountflow that = (TAccountflow) o;
        return Objects.equals(afId, that.afId) &&
                Objects.equals(amount, that.amount) &&
                Objects.equals(note, that.note) &&
                Objects.equals(tradeTime, that.tradeTime) &&
                Objects.equals(actionType, that.actionType) &&
                Objects.equals(accountId, that.accountId) &&
                Objects.equals(usableAmount, that.usableAmount) &&
                Objects.equals(freezedAmount, that.freezedAmount) &&
                Objects.equals(grantpeople, that.grantpeople) &&
                Objects.equals(allocateAmount, that.allocateAmount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(afId, amount, note, tradeTime, actionType, accountId, usableAmount, freezedAmount, grantpeople, allocateAmount);
    }

    public TAccount getAccount() {
        return account;
    }

    public void setAccount(TAccount account) {
        this.account = account;
    }
}
