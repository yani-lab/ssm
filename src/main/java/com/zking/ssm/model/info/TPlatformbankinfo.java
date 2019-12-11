package com.zking.ssm.model.info;

import lombok.ToString;

import java.util.Objects;
@ToString
public class TPlatformbankinfo {
    private Integer pfId;
    private String bankName;
    private String accountName;
    private String accountNumber;
    private String forkName;
    private String iconCls;

    public Integer getPfId() {
        return pfId;
    }

    public void setPfId(Integer pfId) {
        this.pfId = pfId;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getForkName() {
        return forkName;
    }

    public void setForkName(String forkName) {
        this.forkName = forkName;
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
        TPlatformbankinfo that = (TPlatformbankinfo) o;
        return Objects.equals(pfId, that.pfId) &&
                Objects.equals(bankName, that.bankName) &&
                Objects.equals(accountName, that.accountName) &&
                Objects.equals(accountNumber, that.accountNumber) &&
                Objects.equals(forkName, that.forkName) &&
                Objects.equals(iconCls, that.iconCls);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pfId, bankName, accountName, accountNumber, forkName, iconCls);
    }
}
