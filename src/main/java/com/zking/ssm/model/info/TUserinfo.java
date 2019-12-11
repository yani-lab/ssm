package com.zking.ssm.model.info;

import lombok.ToString;

import java.util.Objects;
@ToString
public class TUserinfo {
    private Integer id;
    private Integer version;
    private Integer bitState;
    private String realName;
    private Integer score;
    private Integer realAuthId;
    private String idNumber;
    private String phoneNumber;
    private Integer incomeGradeId;
    private Integer marriageId;
    private Integer kidCountId;
    private Integer educationBackgroundId;
    private Integer houseConditionId;
    private String email;
    private Integer userId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Integer getBitState() {
        return bitState;
    }

    public void setBitState(Integer bitState) {
        this.bitState = bitState;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Integer getRealAuthId() {
        return realAuthId;
    }

    public void setRealAuthId(Integer realAuthId) {
        this.realAuthId = realAuthId;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Integer getIncomeGradeId() {
        return incomeGradeId;
    }

    public void setIncomeGradeId(Integer incomeGradeId) {
        this.incomeGradeId = incomeGradeId;
    }

    public Integer getMarriageId() {
        return marriageId;
    }

    public void setMarriageId(Integer marriageId) {
        this.marriageId = marriageId;
    }

    public Integer getKidCountId() {
        return kidCountId;
    }

    public void setKidCountId(Integer kidCountId) {
        this.kidCountId = kidCountId;
    }

    public Integer getEducationBackgroundId() {
        return educationBackgroundId;
    }

    public void setEducationBackgroundId(Integer educationBackgroundId) {
        this.educationBackgroundId = educationBackgroundId;
    }

    public Integer getHouseConditionId() {
        return houseConditionId;
    }

    public void setHouseConditionId(Integer houseConditionId) {
        this.houseConditionId = houseConditionId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
        TUserinfo tUserinfo = (TUserinfo) o;
        return Objects.equals(id, tUserinfo.id) &&
                Objects.equals(version, tUserinfo.version) &&
                Objects.equals(bitState, tUserinfo.bitState) &&
                Objects.equals(realName, tUserinfo.realName) &&
                Objects.equals(score, tUserinfo.score) &&
                Objects.equals(realAuthId, tUserinfo.realAuthId) &&
                Objects.equals(idNumber, tUserinfo.idNumber) &&
                Objects.equals(phoneNumber, tUserinfo.phoneNumber) &&
                Objects.equals(incomeGradeId, tUserinfo.incomeGradeId) &&
                Objects.equals(marriageId, tUserinfo.marriageId) &&
                Objects.equals(kidCountId, tUserinfo.kidCountId) &&
                Objects.equals(educationBackgroundId, tUserinfo.educationBackgroundId) &&
                Objects.equals(houseConditionId, tUserinfo.houseConditionId) &&
                Objects.equals(email, tUserinfo.email) &&
                Objects.equals(userId, tUserinfo.userId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, version, bitState, realName, score, realAuthId, idNumber, phoneNumber, incomeGradeId, marriageId, kidCountId, educationBackgroundId, houseConditionId, email, userId);
    }
}
