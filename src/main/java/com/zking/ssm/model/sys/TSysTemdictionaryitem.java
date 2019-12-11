package com.zking.ssm.model.sys;

import lombok.ToString;

import java.util.Objects;
@ToString
public class TSysTemdictionaryitem {
    private Integer sysfiId;
    private Integer parentId;
    private String title;
    private String tvalue;
    private Integer sequence;
    private String intro;

    public Integer getSysfiId() {
        return sysfiId;
    }

    public void setSysfiId(Integer sysfiId) {
        this.sysfiId = sysfiId;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTvalue() {
        return tvalue;
    }

    public void setTvalue(String tvalue) {
        this.tvalue = tvalue;
    }

    public Integer getSequence() {
        return sequence;
    }

    public void setSequence(Integer sequence) {
        this.sequence = sequence;
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
        TSysTemdictionaryitem that = (TSysTemdictionaryitem) o;
        return Objects.equals(sysfiId, that.sysfiId) &&
                Objects.equals(parentId, that.parentId) &&
                Objects.equals(title, that.title) &&
                Objects.equals(tvalue, that.tvalue) &&
                Objects.equals(sequence, that.sequence) &&
                Objects.equals(intro, that.intro);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sysfiId, parentId, title, tvalue, sequence, intro);
    }
}
