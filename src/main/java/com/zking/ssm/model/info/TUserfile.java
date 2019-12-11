package com.zking.ssm.model.info;

import lombok.ToString;

import java.util.Date;
import java.util.Objects;
@ToString
public class TUserfile {
    private Integer usrfId;
    private Integer state;
    private String remark;
    private Date auditTime;
    private Date applyTime;
    private Integer auditorId;
    private Integer applierId;
    private Integer score;
    private String file;
    private Integer filetypeId;
    private String image;

    public Integer getUsrfId() {
        return usrfId;
    }

    public void setUsrfId(Integer usrfId) {
        this.usrfId = usrfId;
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

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public Integer getFiletypeId() {
        return filetypeId;
    }

    public void setFiletypeId(Integer filetypeId) {
        this.filetypeId = filetypeId;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TUserfile tUserfile = (TUserfile) o;
        return Objects.equals(usrfId, tUserfile.usrfId) &&
                Objects.equals(state, tUserfile.state) &&
                Objects.equals(remark, tUserfile.remark) &&
                Objects.equals(auditTime, tUserfile.auditTime) &&
                Objects.equals(applyTime, tUserfile.applyTime) &&
                Objects.equals(auditorId, tUserfile.auditorId) &&
                Objects.equals(applierId, tUserfile.applierId) &&
                Objects.equals(score, tUserfile.score) &&
                Objects.equals(file, tUserfile.file) &&
                Objects.equals(filetypeId, tUserfile.filetypeId) &&
                Objects.equals(image, tUserfile.image);
    }

    @Override
    public int hashCode() {
        return Objects.hash(usrfId, state, remark, auditTime, applyTime, auditorId, applierId, score, file, filetypeId, image);
    }
}
