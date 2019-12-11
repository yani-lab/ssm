package com.zking.ssm.model.info;

import lombok.ToString;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;
@ToString
public class TPaymentschedule {
    private Integer pmId;
    private Date deadLine;
    private Date payDate;
    private BigDecimal totalAmount;
    private BigDecimal principal;
    private BigDecimal interest;
    private BigDecimal monthIndex;
    private Integer state;
    private Integer bidRequestType;
    private Integer returnType;
    private String bidRequestTitle;
    private Integer borrowUserId;
    private Integer bidRequestId;

    public Integer getPmId() {
        return pmId;
    }

    public void setPmId(Integer pmId) {
        this.pmId = pmId;
    }

    public Date getDeadLine() {
        return deadLine;
    }

    public void setDeadLine(Date deadLine) {
        this.deadLine = deadLine;
    }

    public Date getPayDate() {
        return payDate;
    }

    public void setPayDate(Date payDate) {
        this.payDate = payDate;
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

    public BigDecimal getMonthIndex() {
        return monthIndex;
    }

    public void setMonthIndex(BigDecimal monthIndex) {
        this.monthIndex = monthIndex;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getBidRequestType() {
        return bidRequestType;
    }

    public void setBidRequestType(Integer bidRequestType) {
        this.bidRequestType = bidRequestType;
    }

    public Integer getReturnType() {
        return returnType;
    }

    public void setReturnType(Integer returnType) {
        this.returnType = returnType;
    }

    public String getBidRequestTitle() {
        return bidRequestTitle;
    }

    public void setBidRequestTitle(String bidRequestTitle) {
        this.bidRequestTitle = bidRequestTitle;
    }

    public Integer getBorrowUserId() {
        return borrowUserId;
    }

    public void setBorrowUserId(Integer borrowUserId) {
        this.borrowUserId = borrowUserId;
    }

    public Integer getBidRequestId() {
        return bidRequestId;
    }

    public void setBidRequestId(Integer bidRequestId) {
        this.bidRequestId = bidRequestId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TPaymentschedule that = (TPaymentschedule) o;
        return Objects.equals(pmId, that.pmId) &&
                Objects.equals(deadLine, that.deadLine) &&
                Objects.equals(payDate, that.payDate) &&
                Objects.equals(totalAmount, that.totalAmount) &&
                Objects.equals(principal, that.principal) &&
                Objects.equals(interest, that.interest) &&
                Objects.equals(monthIndex, that.monthIndex) &&
                Objects.equals(state, that.state) &&
                Objects.equals(bidRequestType, that.bidRequestType) &&
                Objects.equals(returnType, that.returnType) &&
                Objects.equals(bidRequestTitle, that.bidRequestTitle) &&
                Objects.equals(borrowUserId, that.borrowUserId) &&
                Objects.equals(bidRequestId, that.bidRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pmId, deadLine, payDate, totalAmount, principal, interest, monthIndex, state, bidRequestType, returnType, bidRequestTitle, borrowUserId, bidRequestId);
    }
}
