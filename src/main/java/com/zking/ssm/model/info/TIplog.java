package com.zking.ssm.model.info;

import lombok.ToString;

import java.util.Date;
import java.util.Objects;
@ToString
public class TIplog {
    private Integer ipId;
    private String ip;
    private Integer state;
    private String username;
    private Integer logininfoid;
    private Integer userType;
    private Date logintime;

    public Integer getIpId() {
        return ipId;
    }

    public void setIpId(Integer ipId) {
        this.ipId = ipId;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getLogininfoid() {
        return logininfoid;
    }

    public void setLogininfoid(Integer logininfoid) {
        this.logininfoid = logininfoid;
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    public Date getLogintime() {
        return logintime;
    }

    public void setLogintime(Date logintime) {
        this.logintime = logintime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TIplog tIplog = (TIplog) o;
        return Objects.equals(ipId, tIplog.ipId) &&
                Objects.equals(ip, tIplog.ip) &&
                Objects.equals(state, tIplog.state) &&
                Objects.equals(username, tIplog.username) &&
                Objects.equals(logininfoid, tIplog.logininfoid) &&
                Objects.equals(userType, tIplog.userType) &&
                Objects.equals(logintime, tIplog.logintime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ipId, ip, state, username, logininfoid, userType, logintime);
    }
}
