package com.zking.ssm.model.info;

import lombok.ToString;

import java.util.Date;
import java.util.Objects;
@ToString
public class TMailverify {
    private Integer mailId;
    private Integer userinfoId;
    private Date deadline;
    private String randomcode;

    public Integer getMailId() {
        return mailId;
    }

    public void setMailId(Integer mailId) {
        this.mailId = mailId;
    }

    public Integer getUserinfoId() {
        return userinfoId;
    }

    public void setUserinfoId(Integer userinfoId) {
        this.userinfoId = userinfoId;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public String getRandomcode() {
        return randomcode;
    }

    public void setRandomcode(String randomcode) {
        this.randomcode = randomcode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TMailverify that = (TMailverify) o;
        return Objects.equals(mailId, that.mailId) &&
                Objects.equals(userinfoId, that.userinfoId) &&
                Objects.equals(deadline, that.deadline) &&
                Objects.equals(randomcode, that.randomcode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mailId, userinfoId, deadline, randomcode);
    }
}
