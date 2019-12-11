package com.zking.ssm.model.info;

import lombok.ToString;

import java.util.Date;
import java.util.Objects;
@ToString
public class TEmailverify {
    private Integer emId;
    private String email;
    private Integer userinfoId;
    private Date sendTime;
    private String uuid;

    public Integer getEmId() {
        return emId;
    }

    public void setEmId(Integer emId) {
        this.emId = emId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getUserinfoId() {
        return userinfoId;
    }

    public void setUserinfoId(Integer userinfoId) {
        this.userinfoId = userinfoId;
    }

    public Date getSendTime() {
        return sendTime;
    }

    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TEmailverify that = (TEmailverify) o;
        return Objects.equals(emId, that.emId) &&
                Objects.equals(email, that.email) &&
                Objects.equals(userinfoId, that.userinfoId) &&
                Objects.equals(sendTime, that.sendTime) &&
                Objects.equals(uuid, that.uuid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(emId, email, userinfoId, sendTime, uuid);
    }
}
