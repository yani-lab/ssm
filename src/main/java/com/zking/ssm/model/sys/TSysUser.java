package com.zking.ssm.model.sys;

import lombok.ToString;

import java.util.Date;
import java.util.Objects;
@ToString
public class TSysUser {
    private Integer userId;
    private String userName;
    private String userPwd;
    private String userRealName;
    private String userEmail;
    private String userPhone;
    private Date userRegsitTime;
    private Date userFout;
    private String userReferrer;
    private String userReferrerName;
    private String userPaytoId;
    private String userCardId;
    private String userHead;
    private String userPayPwd;
    private String salt;
    private Integer locked;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public String getUserRealName() {
        return userRealName;
    }

    public void setUserRealName(String userRealName) {
        this.userRealName = userRealName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public Date getUserRegsitTime() {
        return userRegsitTime;
    }

    public void setUserRegsitTime(Date userRegsitTime) {
        this.userRegsitTime = userRegsitTime;
    }

    public Date getUserFout() {
        return userFout;
    }

    public void setUserFout(Date userFout) {
        this.userFout = userFout;
    }

    public String getUserReferrer() {
        return userReferrer;
    }

    public void setUserReferrer(String userReferrer) {
        this.userReferrer = userReferrer;
    }

    public String getUserReferrerName() {
        return userReferrerName;
    }

    public void setUserReferrerName(String userReferrerName) {
        this.userReferrerName = userReferrerName;
    }

    public String getUserPaytoId() {
        return userPaytoId;
    }

    public void setUserPaytoId(String userPaytoId) {
        this.userPaytoId = userPaytoId;
    }

    public String getUserCardId() {
        return userCardId;
    }

    public void setUserCardId(String userCardId) {
        this.userCardId = userCardId;
    }

    public String getUserHead() {
        return userHead;
    }

    public void setUserHead(String userHead) {
        this.userHead = userHead;
    }

    public String getUserPayPwd() {
        return userPayPwd;
    }

    public void setUserPayPwd(String userPayPwd) {
        this.userPayPwd = userPayPwd;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public Integer getLocked() {
        return locked;
    }

    public void setLocked(Integer locked) {
        this.locked = locked;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TSysUser tSysUser = (TSysUser) o;
        return Objects.equals(userId, tSysUser.userId) &&
                Objects.equals(userName, tSysUser.userName) &&
                Objects.equals(userPwd, tSysUser.userPwd) &&
                Objects.equals(userRealName, tSysUser.userRealName) &&
                Objects.equals(userEmail, tSysUser.userEmail) &&
                Objects.equals(userPhone, tSysUser.userPhone) &&
                Objects.equals(userRegsitTime, tSysUser.userRegsitTime) &&
                Objects.equals(userFout, tSysUser.userFout) &&
                Objects.equals(userReferrer, tSysUser.userReferrer) &&
                Objects.equals(userReferrerName, tSysUser.userReferrerName) &&
                Objects.equals(userPaytoId, tSysUser.userPaytoId) &&
                Objects.equals(userCardId, tSysUser.userCardId) &&
                Objects.equals(userHead, tSysUser.userHead) &&
                Objects.equals(userPayPwd, tSysUser.userPayPwd) &&
                Objects.equals(salt, tSysUser.salt) &&
                Objects.equals(locked, tSysUser.locked);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, userName, userPwd, userRealName, userEmail, userPhone, userRegsitTime, userFout, userReferrer, userReferrerName, userPaytoId, userCardId, userHead, userPayPwd, salt, locked);
    }
}
