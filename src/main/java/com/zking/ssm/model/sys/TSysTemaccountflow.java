package com.zking.ssm.model.sys;

import lombok.ToString;

import java.math.BigDecimal;
import java.util.Objects;
@ToString
public class TSysTemaccountflow {
    private Integer sysfId;
    private String tradeTime;
    private Integer actionType;
    private BigDecimal amount;
    private BigDecimal usableAmount;
    private BigDecimal freezedAmount;
    private String note;

    public Integer getSysfId() {
        return sysfId;
    }

    public void setSysfId(Integer sysfId) {
        this.sysfId = sysfId;
    }

    public String getTradeTime() {
        return tradeTime;
    }

    public void setTradeTime(String tradeTime) {
        this.tradeTime = tradeTime;
    }

    public Integer getActionType() {
        return actionType;
    }

    public void setActionType(Integer actionType) {
        this.actionType = actionType;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
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

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TSysTemaccountflow that = (TSysTemaccountflow) o;
        return Objects.equals(sysfId, that.sysfId) &&
                Objects.equals(tradeTime, that.tradeTime) &&
                Objects.equals(actionType, that.actionType) &&
                Objects.equals(amount, that.amount) &&
                Objects.equals(usableAmount, that.usableAmount) &&
                Objects.equals(freezedAmount, that.freezedAmount) &&
                Objects.equals(note, that.note);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sysfId, tradeTime, actionType, amount, usableAmount, freezedAmount, note);
    }
}
