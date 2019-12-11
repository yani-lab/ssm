package com.zking.ssm.model.info;

import lombok.ToString;

import java.util.Date;
import java.util.Objects;
@ToString
public class TRepayment {
    private Integer repId;
    private Integer userId;
    private Integer bidId;
    private Integer loId;
    private String fenType;
    private String capital;
    private String interest;
    private String refuMoney;
    private String repayType;
    private String realityMoney;
    private Date refuTime;
    private Date realityTime;
    private String realityType;

    public Integer getRepId() {
        return repId;
    }

    public void setRepId(Integer repId) {
        this.repId = repId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getBidId() {
        return bidId;
    }

    public void setBidId(Integer bidId) {
        this.bidId = bidId;
    }

    public Integer getLoId() {
        return loId;
    }

    public void setLoId(Integer loId) {
        this.loId = loId;
    }

    public String getFenType() {
        return fenType;
    }

    public void setFenType(String fenType) {
        this.fenType = fenType;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getInterest() {
        return interest;
    }

    public void setInterest(String interest) {
        this.interest = interest;
    }

    public String getRefuMoney() {
        return refuMoney;
    }

    public void setRefuMoney(String refuMoney) {
        this.refuMoney = refuMoney;
    }

    public String getRepayType() {
        return repayType;
    }

    public void setRepayType(String repayType) {
        this.repayType = repayType;
    }

    public String getRealityMoney() {
        return realityMoney;
    }

    public void setRealityMoney(String realityMoney) {
        this.realityMoney = realityMoney;
    }

    public Date getRefuTime() {
        return refuTime;
    }

    public void setRefuTime(Date refuTime) {
        this.refuTime = refuTime;
    }

    public Date getRealityTime() {
        return realityTime;
    }

    public void setRealityTime(Date realityTime) {
        this.realityTime = realityTime;
    }

    public String getRealityType() {
        return realityType;
    }

    public void setRealityType(String realityType) {
        this.realityType = realityType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TRepayment that = (TRepayment) o;
        return Objects.equals(repId, that.repId) &&
                Objects.equals(userId, that.userId) &&
                Objects.equals(bidId, that.bidId) &&
                Objects.equals(loId, that.loId) &&
                Objects.equals(fenType, that.fenType) &&
                Objects.equals(capital, that.capital) &&
                Objects.equals(interest, that.interest) &&
                Objects.equals(refuMoney, that.refuMoney) &&
                Objects.equals(repayType, that.repayType) &&
                Objects.equals(realityMoney, that.realityMoney) &&
                Objects.equals(refuTime, that.refuTime) &&
                Objects.equals(realityTime, that.realityTime) &&
                Objects.equals(realityType, that.realityType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(repId, userId, bidId, loId, fenType, capital, interest, refuMoney, repayType, realityMoney, refuTime, realityTime, realityType);
    }
}
