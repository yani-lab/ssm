package com.zking.ssm.model.info;

import lombok.ToString;

import java.util.Date;
import java.util.Objects;
@ToString
public class TBidrequestaudithistory {
    private Integer brId;
    private Integer state;
    private String remark;
    private Date auditTime;
    private Date applyTime;
    private Integer auditorId;
    private Integer applierId;
    private Integer bidRequestId;
    private Integer auditType;

    public Integer getBrId() {
        return brId;
    }

    public void setBrId(Integer brId) {
        this.brId = brId;
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

    public Integer getBidRequestId() {
        return bidRequestId;
    }

    public void setBidRequestId(Integer bidRequestId) {
        this.bidRequestId = bidRequestId;
    }

    public Integer getAuditType() {
        return auditType;
    }

    public void setAuditType(Integer auditType) {
        this.auditType = auditType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TBidrequestaudithistory that = (TBidrequestaudithistory) o;
        return Objects.equals(brId, that.brId) &&
                Objects.equals(state, that.state) &&
                Objects.equals(remark, that.remark) &&
                Objects.equals(auditTime, that.auditTime) &&
                Objects.equals(applyTime, that.applyTime) &&
                Objects.equals(auditorId, that.auditorId) &&
                Objects.equals(applierId, that.applierId) &&
                Objects.equals(bidRequestId, that.bidRequestId) &&
                Objects.equals(auditType, that.auditType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brId, state, remark, auditTime, applyTime, auditorId, applierId, bidRequestId, auditType);
    }
}
