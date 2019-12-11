package com.zking.ssm.model.info;

import lombok.ToString;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;
@ToString
public class TRechargeoffline {
    private Integer rechId;
    private Integer state;
    private String remark;
    private Date auditTime;
    private Date applyTime;
    private Integer auditorId;
    private Integer applierId;
    private String tradeCode;
    private Date tradeTime;
    private BigDecimal amount;
    private String note;
    private Integer bankinfoId;

    public Integer getRechId() {
        return rechId;
    }

    public void setRechId(Integer rechId) {
        this.rechId = rechId;
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

    public String getTradeCode() {
        return tradeCode;
    }

    public void setTradeCode(String tradeCode) {
        this.tradeCode = tradeCode;
    }

    public Date getTradeTime() {
        return tradeTime;
    }

    public void setTradeTime(Date tradeTime) {
        this.tradeTime = tradeTime;
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

    public Integer getBankinfoId() {
        return bankinfoId;
    }

    public void setBankinfoId(Integer bankinfoId) {
        this.bankinfoId = bankinfoId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TRechargeoffline that = (TRechargeoffline) o;
        return Objects.equals(rechId, that.rechId) &&
                Objects.equals(state, that.state) &&
                Objects.equals(remark, that.remark) &&
                Objects.equals(auditTime, that.auditTime) &&
                Objects.equals(applyTime, that.applyTime) &&
                Objects.equals(auditorId, that.auditorId) &&
                Objects.equals(applierId, that.applierId) &&
                Objects.equals(tradeCode, that.tradeCode) &&
                Objects.equals(tradeTime, that.tradeTime) &&
                Objects.equals(amount, that.amount) &&
                Objects.equals(note, that.note) &&
                Objects.equals(bankinfoId, that.bankinfoId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rechId, state, remark, auditTime, applyTime, auditorId, applierId, tradeCode, tradeTime, amount, note, bankinfoId);
    }
}
