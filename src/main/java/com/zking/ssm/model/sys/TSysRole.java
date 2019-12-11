package com.zking.ssm.model.sys;

import lombok.ToString;

import java.util.Objects;
@ToString
public class TSysRole {
    private Integer roleId;
    private String roleName;
    private Integer available;
    private String description;

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public Integer getAvailable() {
        return available;
    }

    public void setAvailable(Integer available) {
        this.available = available;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TSysRole tSysRole = (TSysRole) o;
        return Objects.equals(roleId, tSysRole.roleId) &&
                Objects.equals(roleName, tSysRole.roleName) &&
                Objects.equals(available, tSysRole.available) &&
                Objects.equals(description, tSysRole.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(roleId, roleName, available, description);
    }
}
