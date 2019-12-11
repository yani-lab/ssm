package com.zking.ssm.model.vip;

import lombok.ToString;

import java.util.Objects;
@ToString
public class TIntegral {
    private Integer cuserId;
    private Integer userId;
    private String cuserRealname;
    private String cRedit;
    private String cMember;

    public Integer getCuserId() {
        return cuserId;
    }

    public void setCuserId(Integer cuserId) {
        this.cuserId = cuserId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getCuserRealname() {
        return cuserRealname;
    }

    public void setCuserRealname(String cuserRealname) {
        this.cuserRealname = cuserRealname;
    }

    public String getcRedit() {
        return cRedit;
    }

    public void setcRedit(String cRedit) {
        this.cRedit = cRedit;
    }

    public String getcMember() {
        return cMember;
    }

    public void setcMember(String cMember) {
        this.cMember = cMember;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TIntegral tIntegral = (TIntegral) o;
        return Objects.equals(cuserId, tIntegral.cuserId) &&
                Objects.equals(userId, tIntegral.userId) &&
                Objects.equals(cuserRealname, tIntegral.cuserRealname) &&
                Objects.equals(cRedit, tIntegral.cRedit) &&
                Objects.equals(cMember, tIntegral.cMember);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cuserId, userId, cuserRealname, cRedit, cMember);
    }
}
