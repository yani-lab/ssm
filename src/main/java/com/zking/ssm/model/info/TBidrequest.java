package com.zking.ssm.model.info;

import lombok.ToString;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;
@ToString
public class TBidrequest {
    private Integer bidId;
    private Integer version;
    private Integer returnType;
    private Integer bidRequestType;
    private Integer bidRequestState;
    private BigDecimal bidRequestAmount;
    private BigDecimal currentRate;
    private Integer monthesReturn;
    private Integer bidCount;
    private BigDecimal totalRewardAmount;
    private BigDecimal currentSum;
    private String title;
    private String description;
    private String note;
    private Date disableDate;
    private Integer createuserId;
    private Integer disableDays;
    private BigDecimal minBidAmount;
    private Date applyTime;
    private Date publishTime;
    private String stateName;



    private TProducttable tProducttable;

    public TProducttable gettProducttable() {
        return tProducttable;
    }

    public void settProducttable(TProducttable tProducttable) {
        this.tProducttable = tProducttable;
    }







    public Integer getBidId() {
        return bidId;
    }

    public void setBidId(Integer bidId) {
        this.bidId = bidId;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Integer getReturnType() {
        return returnType;
    }

    public void setReturnType(Integer returnType) {
        this.returnType = returnType;
    }

    public Integer getBidRequestType() {
        return bidRequestType;
    }

    public void setBidRequestType(Integer bidRequestType) {
        this.bidRequestType = bidRequestType;
    }

    public Integer getBidRequestState() {
        return bidRequestState;
    }

    public void setBidRequestState(Integer bidRequestState) {
        this.bidRequestState = bidRequestState;
    }

    public BigDecimal getBidRequestAmount() {
        return bidRequestAmount;
    }

    public void setBidRequestAmount(BigDecimal bidRequestAmount) {
        this.bidRequestAmount = bidRequestAmount;
    }

    public BigDecimal getCurrentRate() {
        return currentRate;
    }

    public void setCurrentRate(BigDecimal currentRate) {
        this.currentRate = currentRate;
    }

    public Integer getMonthesReturn() {
        return monthesReturn;
    }

    public void setMonthesReturn(Integer monthesReturn) {
        this.monthesReturn = monthesReturn;
    }

    public Integer getBidCount() {
        return bidCount;
    }

    public void setBidCount(Integer bidCount) {
        this.bidCount = bidCount;
    }

    public BigDecimal getTotalRewardAmount() {
        return totalRewardAmount;
    }

    public void setTotalRewardAmount(BigDecimal totalRewardAmount) {
        this.totalRewardAmount = totalRewardAmount;
    }

    public BigDecimal getCurrentSum() {
        return currentSum;
    }

    public void setCurrentSum(BigDecimal currentSum) {
        this.currentSum = currentSum;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Date getDisableDate() {
        return disableDate;
    }

    public void setDisableDate(Date disableDate) {
        this.disableDate = disableDate;
    }

    public Integer getCreateuserId() {
        return createuserId;
    }

    public void setCreateuserId(Integer createuserId) {
        this.createuserId = createuserId;
    }

    public Integer getDisableDays() {
        return disableDays;
    }

    public void setDisableDays(Integer disableDays) {
        this.disableDays = disableDays;
    }

    public BigDecimal getMinBidAmount() {
        return minBidAmount;
    }

    public void setMinBidAmount(BigDecimal minBidAmount) {
        this.minBidAmount = minBidAmount;
    }

    public Date getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(Date applyTime) {
        this.applyTime = applyTime;
    }

    public Date getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(Date publishTime) {
        this.publishTime = publishTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TBidrequest that = (TBidrequest) o;
        return Objects.equals(bidId, that.bidId) &&
                Objects.equals(version, that.version) &&
                Objects.equals(returnType, that.returnType) &&
                Objects.equals(bidRequestType, that.bidRequestType) &&
                Objects.equals(bidRequestState, that.bidRequestState) &&
                Objects.equals(bidRequestAmount, that.bidRequestAmount) &&
                Objects.equals(currentRate, that.currentRate) &&
                Objects.equals(monthesReturn, that.monthesReturn) &&
                Objects.equals(bidCount, that.bidCount) &&
                Objects.equals(totalRewardAmount, that.totalRewardAmount) &&
                Objects.equals(currentSum, that.currentSum) &&
                Objects.equals(title, that.title) &&
                Objects.equals(description, that.description) &&
                Objects.equals(note, that.note) &&
                Objects.equals(disableDate, that.disableDate) &&
                Objects.equals(createuserId, that.createuserId) &&
                Objects.equals(disableDays, that.disableDays) &&
                Objects.equals(minBidAmount, that.minBidAmount) &&
                Objects.equals(applyTime, that.applyTime) &&
                Objects.equals(publishTime, that.publishTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bidId, version, returnType, bidRequestType, bidRequestState, bidRequestAmount, currentRate, monthesReturn, bidCount, totalRewardAmount, currentSum, title, description, note, disableDate, createuserId, disableDays, minBidAmount, applyTime, publishTime);
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }


}
