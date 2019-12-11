package com.zking.ssm.model.vip;

import lombok.ToString;

import java.util.Date;
import java.util.Objects;
@ToString
public class TVip {
    private Integer vipId;
    private Integer userId;
    private String userRealname;
    private Date vipDate;
    private Date vipDates;

    public Integer getVipId() {
        return vipId;
    }

    public void setVipId(Integer vipId) {
        this.vipId = vipId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserRealname() {
        return userRealname;
    }

    public void setUserRealname(String userRealname) {
        this.userRealname = userRealname;
    }

    public Date getVipDate() {
        return vipDate;
    }

    public void setVipDate(Date vipDate) {
        this.vipDate = vipDate;
    }

    public Date getVipDates() {
        return vipDates;
    }

    public void setVipDates(Date vipDates) {
        this.vipDates = vipDates;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TVip tVip = (TVip) o;
        return Objects.equals(vipId, tVip.vipId) &&
                Objects.equals(userId, tVip.userId) &&
                Objects.equals(userRealname, tVip.userRealname) &&
                Objects.equals(vipDate, tVip.vipDate) &&
                Objects.equals(vipDates, tVip.vipDates);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vipId, userId, userRealname, vipDate, vipDates);
    }
}
