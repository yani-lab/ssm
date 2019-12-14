package com.zking.ssm.model.sys;

import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
@ToString
public class TSysMenu {
    private Integer menuId;
    private String menuName;
    private Integer menuType;
    private Integer parentId;
    private String url;
    private Integer position;
    private String icon;
    private List<TSysMenu> sysMenu = new ArrayList<>();

    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public Integer getMenuType() {
        return menuType;
    }

    public void setMenuType(Integer menuType) {
        this.menuType = menuType;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TSysMenu tSysMenu = (TSysMenu) o;
        return Objects.equals(menuId, tSysMenu.menuId) &&
                Objects.equals(menuName, tSysMenu.menuName) &&
                Objects.equals(menuType, tSysMenu.menuType) &&
                Objects.equals(parentId, tSysMenu.parentId) &&
                Objects.equals(url, tSysMenu.url) &&
                Objects.equals(position, tSysMenu.position) &&
                Objects.equals(icon, tSysMenu.icon);
    }

    @Override
    public int hashCode() {
        return Objects.hash(menuId, menuName, menuType, parentId, url, position, icon);
    }

    public List<TSysMenu> getSysMenu() {
        return sysMenu;
    }

    public void setSysMenu(List<TSysMenu> sysMenu) {
        this.sysMenu = sysMenu;
    }
}
