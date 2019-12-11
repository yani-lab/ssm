package com.zking.ssm.model.info;

import lombok.ToString;

import java.math.BigDecimal;
import java.util.Objects;
@ToString
public class TAccount {
    private Integer acId;
    private BigDecimal usableAmount;
    private BigDecimal freezedAmount;
    private Integer version;
    private BigDecimal unReceiveInterest;
    private BigDecimal unReceivePrincipal;
    private BigDecimal unReturnAmount;
    private BigDecimal remainBorrowLimit;
    private BigDecimal borrowLimit;
    private Integer userId;

    public Integer getAcId() {
        return acId;
    }

    public void setAcId(Integer acId) {
        this.acId = acId;
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

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public BigDecimal getUnReceiveInterest() {
        return unReceiveInterest;
    }

    public void setUnReceiveInterest(BigDecimal unReceiveInterest) {
        this.unReceiveInterest = unReceiveInterest;
    }

    public BigDecimal getUnReceivePrincipal() {
        return unReceivePrincipal;
    }

    public void setUnReceivePrincipal(BigDecimal unReceivePrincipal) {
        this.unReceivePrincipal = unReceivePrincipal;
    }

    public BigDecimal getUnReturnAmount() {
        return unReturnAmount;
    }

    public void setUnReturnAmount(BigDecimal unReturnAmount) {
        this.unReturnAmount = unReturnAmount;
    }

    public BigDecimal getRemainBorrowLimit() {
        return remainBorrowLimit;
    }

    public void setRemainBorrowLimit(BigDecimal remainBorrowLimit) {
        this.remainBorrowLimit = remainBorrowLimit;
    }

    public BigDecimal getBorrowLimit() {
        return borrowLimit;
    }

    public void setBorrowLimit(BigDecimal borrowLimit) {
        this.borrowLimit = borrowLimit;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TAccount tAccount = (TAccount) o;
        return Objects.equals(acId, tAccount.acId) &&
                Objects.equals(usableAmount, tAccount.usableAmount) &&
                Objects.equals(freezedAmount, tAccount.freezedAmount) &&
                Objects.equals(version, tAccount.version) &&
                Objects.equals(unReceiveInterest, tAccount.unReceiveInterest) &&
                Objects.equals(unReceivePrincipal, tAccount.unReceivePrincipal) &&
                Objects.equals(unReturnAmount, tAccount.unReturnAmount) &&
                Objects.equals(remainBorrowLimit, tAccount.remainBorrowLimit) &&
                Objects.equals(borrowLimit, tAccount.borrowLimit) &&
                Objects.equals(userId, tAccount.userId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(acId, usableAmount, freezedAmount, version, unReceiveInterest, unReceivePrincipal, unReturnAmount, remainBorrowLimit, borrowLimit, userId);
    }
}
