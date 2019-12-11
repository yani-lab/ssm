package com.zking.ssm.model.info;

import lombok.ToString;

import java.util.Objects;
@ToString
public class TOverduetype {
    private Integer ovtId;
    private String range;
    private String rateofinterest;
    private String status;

    public Integer getOvtId() {
        return ovtId;
    }

    public void setOvtId(Integer ovtId) {
        this.ovtId = ovtId;
    }

    public String getRange() {
        return range;
    }

    public void setRange(String range) {
        this.range = range;
    }

    public String getRateofinterest() {
        return rateofinterest;
    }

    public void setRateofinterest(String rateofinterest) {
        this.rateofinterest = rateofinterest;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TOverduetype that = (TOverduetype) o;
        return Objects.equals(ovtId, that.ovtId) &&
                Objects.equals(range, that.range) &&
                Objects.equals(rateofinterest, that.rateofinterest) &&
                Objects.equals(status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ovtId, range, rateofinterest, status);
    }
}
