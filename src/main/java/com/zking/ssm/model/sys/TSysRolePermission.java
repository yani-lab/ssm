package com.zking.ssm.model.sys;

import lombok.ToString;

import java.util.Objects;
@ToString
public class TSysRolePermission {
    private Integer rrId;
    private Integer roleId;
    private Integer permissionId;

    public Integer getRrId() {
        return rrId;
    }

    public void setRrId(Integer rrId) {
        this.rrId = rrId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(Integer permissionId) {
        this.permissionId = permissionId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TSysRolePermission that = (TSysRolePermission) o;
        return Objects.equals(rrId, that.rrId) &&
                Objects.equals(roleId, that.roleId) &&
                Objects.equals(permissionId, that.permissionId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rrId, roleId, permissionId);
    }
}
