package com.zking.ssm.model.info;

import lombok.ToString;

import java.util.Date;
import java.util.Objects;
@ToString
public class TContractindetail {
    private Integer cotId;
    private String loanType;
    private String owner;
    private String oarty;
    private String paymentType;
    private String installmentType;
    private Date loanTime;
    private Date repaymentTime;
    private String bankaccount;
    private String mandator;
    private String contents;
    private String organization;

    public Integer getCotId() {
        return cotId;
    }

    public void setCotId(Integer cotId) {
        this.cotId = cotId;
    }

    public String getLoanType() {
        return loanType;
    }

    public void setLoanType(String loanType) {
        this.loanType = loanType;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getOarty() {
        return oarty;
    }

    public void setOarty(String oarty) {
        this.oarty = oarty;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public String getInstallmentType() {
        return installmentType;
    }

    public void setInstallmentType(String installmentType) {
        this.installmentType = installmentType;
    }

    public Date getLoanTime() {
        return loanTime;
    }

    public void setLoanTime(Date loanTime) {
        this.loanTime = loanTime;
    }

    public Date getRepaymentTime() {
        return repaymentTime;
    }

    public void setRepaymentTime(Date repaymentTime) {
        this.repaymentTime = repaymentTime;
    }

    public String getBankaccount() {
        return bankaccount;
    }

    public void setBankaccount(String bankaccount) {
        this.bankaccount = bankaccount;
    }

    public String getMandator() {
        return mandator;
    }

    public void setMandator(String mandator) {
        this.mandator = mandator;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TContractindetail that = (TContractindetail) o;
        return Objects.equals(cotId, that.cotId) &&
                Objects.equals(loanType, that.loanType) &&
                Objects.equals(owner, that.owner) &&
                Objects.equals(oarty, that.oarty) &&
                Objects.equals(paymentType, that.paymentType) &&
                Objects.equals(installmentType, that.installmentType) &&
                Objects.equals(loanTime, that.loanTime) &&
                Objects.equals(repaymentTime, that.repaymentTime) &&
                Objects.equals(bankaccount, that.bankaccount) &&
                Objects.equals(mandator, that.mandator) &&
                Objects.equals(contents, that.contents) &&
                Objects.equals(organization, that.organization);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cotId, loanType, owner, oarty, paymentType, installmentType, loanTime, repaymentTime, bankaccount, mandator, contents, organization);
    }
}
