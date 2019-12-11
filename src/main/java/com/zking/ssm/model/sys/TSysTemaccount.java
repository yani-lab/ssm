package com.zking.ssm.model.sys;

import lombok.ToString;

import java.math.BigDecimal;
import java.util.Objects;
@ToString
public class TSysTemaccount {
    private Integer sysaId;
    private Integer version;
    private BigDecimal usableAmount;
    private BigDecimal freezedAmount;

    public Integer getSysaId() {
        return sysaId;
    }

    public void setSysaId(Integer sysaId) {
        this.sysaId = sysaId;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public BigDecimal getUsableAmount() {
        return usableAmount;
    }

    public void setUsableAmount(BigDecimal usableAmount) {
        this.usableAmount = usableAmount;
    }

    public BigDecimal getFreezedAmount() {
        return freezedAmount;
    }

    public void setFreezedAmount(BigDecimal freezedAmount) {
        this.freezedAmount = freezedAmount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TSysTemaccount that = (TSysTemaccount) o;
        return Objects.equals(sysaId, that.sysaId) &&
                Objects.equals(version, that.version) &&
                Objects.equals(usableAmount, that.usableAmount) &&
                Objects.equals(freezedAmount, that.freezedAmount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sysaId, version, usableAmount, freezedAmount);
    }
}
