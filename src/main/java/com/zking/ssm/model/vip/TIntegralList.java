package com.zking.ssm.model.vip;

import lombok.ToString;

import java.util.Objects;
@ToString
public class TIntegralList {
    private Integer inteId;
    private Integer cuserId;
    private Integer repId;
    private Integer inteRedit;
    private Integer inteMember;

    public Integer getInteId() {
        return inteId;
    }

    public void setInteId(Integer inteId) {
        this.inteId = inteId;
    }

    public Integer getCuserId() {
        return cuserId;
    }

    public void setCuserId(Integer cuserId) {
        this.cuserId = cuserId;
    }

    public Integer getRepId() {
        return repId;
    }

    public void setRepId(Integer repId) {
        this.repId = repId;
    }

    public Integer getInteRedit() {
        return inteRedit;
    }

    public void setInteRedit(Integer inteRedit) {
        this.inteRedit = inteRedit;
    }

    public Integer getInteMember() {
        return inteMember;
    }

    public void setInteMember(Integer inteMember) {
        this.inteMember = inteMember;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TIntegralList that = (TIntegralList) o;
        return Objects.equals(inteId, that.inteId) &&
                Objects.equals(cuserId, that.cuserId) &&
                Objects.equals(repId, that.repId) &&
                Objects.equals(inteRedit, that.inteRedit) &&
                Objects.equals(inteMember, that.inteMember);
    }

    @Override
    public int hashCode() {
        return Objects.hash(inteId, cuserId, repId, inteRedit, inteMember);
    }
}
