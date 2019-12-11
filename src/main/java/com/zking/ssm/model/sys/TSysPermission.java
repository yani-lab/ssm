package com.zking.ssm.model.sys;

import lombok.ToString;

import java.util.Objects;
@ToString
public class TSysPermission {
    private Integer permissionId;
    private String permissionName;
    private Integer level;
    private Integer parentPermissionId;
    private Integer available;
    private String permission;

    public Integer getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(Integer permissionId) {
        this.permissionId = permissionId;
    }

    public String getPermissionName() {
        return permissionName;
    }

    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getParentPermissionId() {
        return parentPermissionId;
    }

    public void setParentPermissionId(Integer parentPermissionId) {
        this.parentPermissionId = parentPermissionId;
    }

    public Integer getAvailable() {
        return available;
    }

    public void setAvailable(Integer available) {
        this.available = available;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TSysPermission that = (TSysPermission) o;
        return Objects.equals(permissionId, that.permissionId) &&
                Objects.equals(permissionName, that.permissionName) &&
                Objects.equals(level, that.level) &&
                Objects.equals(parentPermissionId, that.parentPermissionId) &&
                Objects.equals(available, that.available) &&
                Objects.equals(permission, that.permission);
    }

    @Override
    public int hashCode() {
        return Objects.hash(permissionId, permissionName, level, parentPermissionId, available, permission);
    }
}
