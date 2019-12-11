package com.zking.ssm.model.sys;

import lombok.ToString;

import java.util.Objects;
@ToString
public class TSysTemdictionary {
    private Integer sysdId;
    private String sn;
    private String title;
    private String intro;

    public Integer getSysdId() {
        return sysdId;
    }

    public void setSysdId(Integer sysdId) {
        this.sysdId = sysdId;
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TSysTemdictionary that = (TSysTemdictionary) o;
        return Objects.equals(sysdId, that.sysdId) &&
                Objects.equals(sn, that.sn) &&
                Objects.equals(title, that.title) &&
                Objects.equals(intro, that.intro);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sysdId, sn, title, intro);
    }
}
