package com.zking.ssm.model.info;

import lombok.ToString;

import java.util.Date;
import java.util.Objects;
@ToString
public class TContracttable {
    private Integer cottId;
    private Integer indetailId;
    private String content;
    private Date creationDate;
    private Date effectiveDate;
    private String status;

    public Integer getCottId() {
        return cottId;
    }

    public void setCottId(Integer cottId) {
        this.cottId = cottId;
    }

    public Integer getIndetailId() {
        return indetailId;
    }

    public void setIndetailId(Integer indetailId) {
        this.indetailId = indetailId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(Date effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TContracttable that = (TContracttable) o;
        return Objects.equals(cottId, that.cottId) &&
                Objects.equals(indetailId, that.indetailId) &&
                Objects.equals(content, that.content) &&
                Objects.equals(creationDate, that.creationDate) &&
                Objects.equals(effectiveDate, that.effectiveDate) &&
                Objects.equals(status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cottId, indetailId, content, creationDate, effectiveDate, status);
    }
}
