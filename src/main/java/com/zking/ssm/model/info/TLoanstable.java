package com.zking.ssm.model.info;

import lombok.ToString;

import java.util.Objects;
@ToString
public class TLoanstable {
    private Integer loId;
    private Integer applyforloanid;
    private Integer userid;
    private String bankcard;
    private String loantime;
    private String money;
    private String stagetypeId;
    private String repayment;
    private String should;
    private String interestrate;
    private String userName;
    private String repayName;
    private String stagetypeName;

    public Integer getLoId() {
        return loId;
    }

    public void setLoId(Integer loId) {
        this.loId = loId;
    }

    public Integer getApplyforloanid() {
        return applyforloanid;
    }

    public void setApplyforloanid(Integer applyforloanid) {
        this.applyforloanid = applyforloanid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getBankcard() {
        return bankcard;
    }

    public void setBankcard(String bankcard) {
        this.bankcard = bankcard;
    }

    public String getLoantime() {
        return loantime;
    }

    public void setLoantime(String loantime) {
        this.loantime = loantime;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    public String getStagetypeId() {
        return stagetypeId;
    }

    public void setStagetypeId(String stagetypeId) {
        this.stagetypeId = stagetypeId;
    }

    public String getRepayment() {
        return repayment;
    }

    public void setRepayment(String repayment) {
        this.repayment = repayment;
    }

    public String getShould() {
        return should;
    }

    public void setShould(String should) {
        this.should = should;
    }

    public String getInterestrate() {
        return interestrate;
    }

    public void setInterestrate(String interestrate) {
        this.interestrate = interestrate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TLoanstable that = (TLoanstable) o;
        return Objects.equals(loId, that.loId) &&
                Objects.equals(applyforloanid, that.applyforloanid) &&
                Objects.equals(userid, that.userid) &&
                Objects.equals(bankcard, that.bankcard) &&
                Objects.equals(loantime, that.loantime) &&
                Objects.equals(money, that.money) &&
                Objects.equals(stagetypeId, that.stagetypeId) &&
                Objects.equals(repayment, that.repayment) &&
                Objects.equals(should, that.should) &&
                Objects.equals(interestrate, that.interestrate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(loId, applyforloanid, userid, bankcard, loantime, money, stagetypeId, repayment, should, interestrate);
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getRepayName() {
        return repayName;
    }

    public void setRepayName(String repayName) {
        this.repayName = repayName;
    }

    public String getStagetypeName() {
        return stagetypeName;
    }

    public void setStagetypeName(String stagetypeName) {
        this.stagetypeName = stagetypeName;
    }
}
