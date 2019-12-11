package com.zking.ssm.model.info;

import lombok.ToString;

import java.util.Date;
import java.util.Objects;
@ToString
public class TVideoauth {
    private Integer viId;
    private Integer state;
    private String remark;
    private Date auditTime;
    private Date applyTime;
    private Integer auditorId;
    private Integer applierId;

    public Integer getViId() {
        return viId;
    }

    public void setViId(Integer viId) {
        this.viId = viId;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TVideoauth that = (TVideoauth) o;
        return Objects.equals(viId, that.viId) &&
                Objects.equals(state, that.state) &&
                Objects.equals(remark, that.remark) &&
                Objects.equals(auditTime, that.auditTime) &&
                Objects.equals(applyTime, that.applyTime) &&
                Objects.equals(auditorId, that.auditorId) &&
                Objects.equals(applierId, that.applierId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(viId, state, remark, auditTime, applyTime, auditorId, applierId);
    }
}
