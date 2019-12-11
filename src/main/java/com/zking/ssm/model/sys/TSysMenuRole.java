package com.zking.ssm.model.sys;

import lombok.ToString;

import java.util.Objects;
@ToString
public class TSysMenuRole {
    private Integer mrId;
    private Integer menuId;
    private Integer roleId;

    public Integer getMrId() {
        return mrId;
    }

    public void setMrId(Integer mrId) {
        this.mrId = mrId;
    }

    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TSysMenuRole that = (TSysMenuRole) o;
        return Objects.equals(mrId, that.mrId) &&
                Objects.equals(menuId, that.menuId) &&
                Objects.equals(roleId, that.roleId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mrId, menuId, roleId);
    }
}
