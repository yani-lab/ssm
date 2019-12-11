package com.zking.ssm.model.info;

import lombok.ToString;

import java.util.Objects;
@ToString
public class TInstallmenttype {
    private Integer itId;
    private String stagetypename;
    private String interests;
    private Integer perioddays;

    public Integer getItId() {
        return itId;
    }

    public void setItId(Integer itId) {
        this.itId = itId;
    }

    public String getStagetypename() {
        return stagetypename;
    }

    public void setStagetypename(String stagetypename) {
        this.stagetypename = stagetypename;
    }

    public String getInterests() {
        return interests;
    }

    public void setInterests(String interests) {
        this.interests = interests;
    }

    public Integer getPerioddays() {
        return perioddays;
    }

    public void setPerioddays(Integer perioddays) {
        this.perioddays = perioddays;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TInstallmenttype that = (TInstallmenttype) o;
        return Objects.equals(itId, that.itId) &&
                Objects.equals(stagetypename, that.stagetypename) &&
                Objects.equals(interests, that.interests) &&
                Objects.equals(perioddays, that.perioddays);
    }

    @Override
    public int hashCode() {
        return Objects.hash(itId, stagetypename, interests, perioddays);
    }
}
