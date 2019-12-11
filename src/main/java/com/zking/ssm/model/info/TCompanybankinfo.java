package com.zking.ssm.model.info;

import lombok.ToString;

import java.util.Objects;
@ToString
public class TCompanybankinfo {
    private Integer coId;
    private String bankname;
    private String accountname;
    private String banknumber;
    private String bankforkname;
    private String iconCls;

    public Integer getCoId() {
        return coId;
    }

    public void setCoId(Integer coId) {
        this.coId = coId;
    }

    public String getBankname() {
        return bankname;
    }

    public void setBankname(String bankname) {
        this.bankname = bankname;
    }

    public String getAccountname() {
        return accountname;
    }

    public void setAccountname(String accountname) {
        this.accountname = accountname;
    }

    public String getBanknumber() {
        return banknumber;
    }

    public void setBanknumber(String banknumber) {
        this.banknumber = banknumber;
    }

    public String getBankforkname() {
        return bankforkname;
    }

    public void setBankforkname(String bankforkname) {
        this.bankforkname = bankforkname;
    }

    public String getIconCls() {
        return iconCls;
    }

    public void setIconCls(String iconCls) {
        this.iconCls = iconCls;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TCompanybankinfo that = (TCompanybankinfo) o;
        return Objects.equals(coId, that.coId) &&
                Objects.equals(bankname, that.bankname) &&
                Objects.equals(accountname, that.accountname) &&
                Objects.equals(banknumber, that.banknumber) &&
                Objects.equals(bankforkname, that.bankforkname) &&
                Objects.equals(iconCls, that.iconCls);
    }

    @Override
    public int hashCode() {
        return Objects.hash(coId, bankname, accountname, banknumber, bankforkname, iconCls);
    }
}
