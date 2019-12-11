package com.zking.ssm.model.info;

import lombok.ToString;

import java.util.Objects;
@ToString
public class TUserbankinfo {
    private Integer usrbId;
    private String bankName;
    private String accountName;
    private String accountNumber;
    private String forkName;
    private Integer logininfoId;

    public Integer getUsrbId() {
        return usrbId;
    }

    public void setUsrbId(Integer usrbId) {
        this.usrbId = usrbId;
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

    public Integer getLogininfoId() {
        return logininfoId;
    }

    public void setLogininfoId(Integer logininfoId) {
        this.logininfoId = logininfoId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TUserbankinfo that = (TUserbankinfo) o;
        return Objects.equals(usrbId, that.usrbId) &&
                Objects.equals(bankName, that.bankName) &&
                Objects.equals(accountName, that.accountName) &&
                Objects.equals(accountNumber, that.accountNumber) &&
                Objects.equals(forkName, that.forkName) &&
                Objects.equals(logininfoId, that.logininfoId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(usrbId, bankName, accountName, accountNumber, forkName, logininfoId);
    }
}
