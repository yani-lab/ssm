package com.zking.ssm.model.info;

import lombok.ToString;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;
@ToString
public class TPaymentscheduledetail {
    private Integer pmdId;
    private BigDecimal bidAmount;
    private Integer bidId;
    private BigDecimal totalAmount;
    private BigDecimal principal;
    private BigDecimal interest;
    private Integer monthIndex;
    private Date deadLine;
    private Integer bidrequestId;
    private Date payDate;
    private Integer returnType;
    private Integer paymentScheduleId;
    private Integer fromLogininfoId;
    private Integer toLogininfoId;

    public Integer getPmdId() {
        return pmdId;
    }

    public void setPmdId(Integer pmdId) {
        this.pmdId = pmdId;
    }

    public BigDecimal getBidAmount() {
        return bidAmount;
    }

    public void setBidAmount(BigDecimal bidAmount) {
        this.bidAmount = bidAmount;
    }

    public Integer getBidId() {
        return bidId;
    }

    public void setBidId(Integer bidId) {
        this.bidId = bidId;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public BigDecimal getPrincipal() {
        return principal;
    }

    public void setPrincipal(BigDecimal principal) {
        this.principal = principal;
    }

    public BigDecimal getInterest() {
        return interest;
    }

    public void setInterest(BigDecimal interest) {
        this.interest = interest;
    }

    public Integer getMonthIndex() {
        return monthIndex;
    }

    public void setMonthIndex(Integer monthIndex) {
        this.monthIndex = monthIndex;
    }

    public Date getDeadLine() {
        return deadLine;
    }

    public void setDeadLine(Date deadLine) {
        this.deadLine = deadLine;
    }

    public Integer getBidrequestId() {
        return bidrequestId;
    }

    public void setBidrequestId(Integer bidrequestId) {
        this.bidrequestId = bidrequestId;
    }

    public Date getPayDate() {
        return payDate;
    }

    public void setPayDate(Date payDate) {
        this.payDate = payDate;
    }

    public Integer getReturnType() {
        return returnType;
    }

    public void setReturnType(Integer returnType) {
        this.returnType = returnType;
    }

    public Integer getPaymentScheduleId() {
        return paymentScheduleId;
    }

    public void setPaymentScheduleId(Integer paymentScheduleId) {
        this.paymentScheduleId = paymentScheduleId;
    }

    public Integer getFromLogininfoId() {
        return fromLogininfoId;
    }

    public void setFromLogininfoId(Integer fromLogininfoId) {
        this.fromLogininfoId = fromLogininfoId;
    }

    public Integer getToLogininfoId() {
        return toLogininfoId;
    }

    public void setToLogininfoId(Integer toLogininfoId) {
        this.toLogininfoId = toLogininfoId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TPaymentscheduledetail that = (TPaymentscheduledetail) o;
        return Objects.equals(pmdId, that.pmdId) &&
                Objects.equals(bidAmount, that.bidAmount) &&
                Objects.equals(bidId, that.bidId) &&
                Objects.equals(totalAmount, that.totalAmount) &&
                Objects.equals(principal, that.principal) &&
                Objects.equals(interest, that.interest) &&
                Objects.equals(monthIndex, that.monthIndex) &&
                Objects.equals(deadLine, that.deadLine) &&
                Objects.equals(bidrequestId, that.bidrequestId) &&
                Objects.equals(payDate, that.payDate) &&
                Objects.equals(returnType, that.returnType) &&
                Objects.equals(paymentScheduleId, that.paymentScheduleId) &&
                Objects.equals(fromLogininfoId, that.fromLogininfoId) &&
                Objects.equals(toLogininfoId, that.toLogininfoId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pmdId, bidAmount, bidId, totalAmount, principal, interest, monthIndex, deadLine, bidrequestId, payDate, returnType, paymentScheduleId, fromLogininfoId, toLogininfoId);
    }
}
