package com.zking.ssm.model.info;

import lombok.ToString;

import java.util.Date;
import java.util.Objects;
@ToString
public class TRealauth {
    private Integer realId;
    private String realname;
    private Integer sex;
    private String bornDate;
    private String idNumber;
    private String address;
    private Integer state;
    private String image1;
    private String image2;
    private String remark;
    private Date auditTime;
    private Date applyTime;
    private Integer auditorId;
    private Integer applierId;
    private Integer applier_type;


    public Integer getRealId() {
        return realId;
    }

    public void setRealId(Integer realId) {
        this.realId = realId;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getBornDate() {
        return bornDate;
    }

    public void setBornDate(String bornDate) {
        this.bornDate = bornDate;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getImage1() {
        return image1;
    }

    public void setImage1(String image1) {
        this.image1 = image1;
    }

    public String getImage2() {
        return image2;
    }

    public void setImage2(String image2) {
        this.image2 = image2;
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
        TRealauth tRealauth = (TRealauth) o;
        return Objects.equals(realId, tRealauth.realId) &&
                Objects.equals(realname, tRealauth.realname) &&
                Objects.equals(sex, tRealauth.sex) &&
                Objects.equals(bornDate, tRealauth.bornDate) &&
                Objects.equals(idNumber, tRealauth.idNumber) &&
                Objects.equals(address, tRealauth.address) &&
                Objects.equals(state, tRealauth.state) &&
                Objects.equals(image1, tRealauth.image1) &&
                Objects.equals(image2, tRealauth.image2) &&
                Objects.equals(remark, tRealauth.remark) &&
                Objects.equals(auditTime, tRealauth.auditTime) &&
                Objects.equals(applyTime, tRealauth.applyTime) &&
                Objects.equals(auditorId, tRealauth.auditorId) &&
                Objects.equals(applierId, tRealauth.applierId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(realId, realname, sex, bornDate, idNumber, address, state, image1, image2, remark, auditTime, applyTime, auditorId, applierId);
    }

    public Integer getApplier_type() {
        return applier_type;
    }

    public void setApplier_type(Integer applier_type) {
        this.applier_type = applier_type;
    }


}
