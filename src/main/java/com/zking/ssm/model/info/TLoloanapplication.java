package com.zking.ssm.model.info;

import lombok.ToString;

import java.util.Date;
import java.util.Objects;
@ToString
public class TLoloanapplication {
    private Integer loloId;
    private Integer userid;
    private String appliedamount;
    private String bankcard;
    private String houselicense;
    private String drivinglicense;
    private String bidtype;
    private String installmentstate;
    private String applicationstatus;
    private Integer handlerid;
    private Date applicationtime;
    private String reason;

    public Integer getLoloId() {
        return loloId;
    }

    public void setLoloId(Integer loloId) {
        this.loloId = loloId;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getAppliedamount() {
        return appliedamount;
    }

    public void setAppliedamount(String appliedamount) {
        this.appliedamount = appliedamount;
    }

    public String getBankcard() {
        return bankcard;
    }

    public void setBankcard(String bankcard) {
        this.bankcard = bankcard;
    }

    public String getHouselicense() {
        return houselicense;
    }

    public void setHouselicense(String houselicense) {
        this.houselicense = houselicense;
    }

    public String getDrivinglicense() {
        return drivinglicense;
    }

    public void setDrivinglicense(String drivinglicense) {
        this.drivinglicense = drivinglicense;
    }

    public String getBidtype() {
        return bidtype;
    }

    public void setBidtype(String bidtype) {
        this.bidtype = bidtype;
    }

    public String getInstallmentstate() {
        return installmentstate;
    }

    public void setInstallmentstate(String installmentstate) {
        this.installmentstate = installmentstate;
    }

    public String getApplicationstatus() {
        return applicationstatus;
    }

    public void setApplicationstatus(String applicationstatus) {
        this.applicationstatus = applicationstatus;
    }

    public Integer getHandlerid() {
        return handlerid;
    }

    public void setHandlerid(Integer handlerid) {
        this.handlerid = handlerid;
    }

    public Date getApplicationtime() {
        return applicationtime;
    }

    public void setApplicationtime(Date applicationtime) {
        this.applicationtime = applicationtime;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TLoloanapplication that = (TLoloanapplication) o;
        return Objects.equals(loloId, that.loloId) &&
                Objects.equals(userid, that.userid) &&
                Objects.equals(appliedamount, that.appliedamount) &&
                Objects.equals(bankcard, that.bankcard) &&
                Objects.equals(houselicense, that.houselicense) &&
                Objects.equals(drivinglicense, that.drivinglicense) &&
                Objects.equals(bidtype, that.bidtype) &&
                Objects.equals(installmentstate, that.installmentstate) &&
                Objects.equals(applicationstatus, that.applicationstatus) &&
                Objects.equals(handlerid, that.handlerid) &&
                Objects.equals(applicationtime, that.applicationtime) &&
                Objects.equals(reason, that.reason);
    }

    @Override
    public int hashCode() {
        return Objects.hash(loloId, userid, appliedamount, bankcard, houselicense, drivinglicense, bidtype, installmentstate, applicationstatus, handlerid, applicationtime, reason);
    }
}
