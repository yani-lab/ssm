package com.zking.ssm.model.info;

import lombok.ToString;

import java.util.Date;
import java.util.Objects;
@ToString
public class TProducttable {
    private Integer proId;
    private String proName;
    private String money;
    private String interest;
    private Date time;
    private Date require;
    private String scope;
    private String lineofcredit;

    public Integer getProId() {
        return proId;
    }

    public void setProId(Integer proId) {
        this.proId = proId;
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    public String getInterest() {
        return interest;
    }

    public void setInterest(String interest) {
        this.interest = interest;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Date getRequire() {
        return require;
    }

    public void setRequire(Date require) {
        this.require = require;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public String getLineofcredit() {
        return lineofcredit;
    }

    public void setLineofcredit(String lineofcredit) {
        this.lineofcredit = lineofcredit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TProducttable that = (TProducttable) o;
        return Objects.equals(proId, that.proId) &&
                Objects.equals(proName, that.proName) &&
                Objects.equals(money, that.money) &&
                Objects.equals(interest, that.interest) &&
                Objects.equals(time, that.time) &&
                Objects.equals(require, that.require) &&
                Objects.equals(scope, that.scope) &&
                Objects.equals(lineofcredit, that.lineofcredit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(proId, proName, money, interest, time, require, scope, lineofcredit);
    }
}
