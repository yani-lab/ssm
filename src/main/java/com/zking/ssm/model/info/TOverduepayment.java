package com.zking.ssm.model.info;

import lombok.ToString;

import java.util.Objects;
@ToString
public class TOverduepayment {
    private Integer ovdId;
    private Integer overdueId;
    private Integer days;
    private Integer typeId;
    private String typeName;
    private Integer handlerId;
    private String handlerName;
    private String mode;
    private String result;
    private String remark;

    public Integer getOvdId() {
        return ovdId;
    }

    public void setOvdId(Integer ovdId) {
        this.ovdId = ovdId;
    }

    public Integer getOverdueId() {
        return overdueId;
    }

    public void setOverdueId(Integer overdueId) {
        this.overdueId = overdueId;
    }

    public Integer getDays() {
        return days;
    }

    public void setDays(Integer days) {
        this.days = days;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public Integer getHandlerId() {
        return handlerId;
    }

    public void setHandlerId(Integer handlerId) {
        this.handlerId = handlerId;
    }

    public String getHandlerName() {
        return handlerName;
    }

    public void setHandlerName(String handlerName) {
        this.handlerName = handlerName;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TOverduepayment that = (TOverduepayment) o;
        return Objects.equals(ovdId, that.ovdId) &&
                Objects.equals(overdueId, that.overdueId) &&
                Objects.equals(days, that.days) &&
                Objects.equals(typeId, that.typeId) &&
                Objects.equals(handlerId, that.handlerId) &&
                Objects.equals(handlerName, that.handlerName) &&
                Objects.equals(mode, that.mode) &&
                Objects.equals(result, that.result) &&
                Objects.equals(remark, that.remark);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ovdId, overdueId, days, typeId, handlerId, handlerName, mode, result, remark);
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }
}
