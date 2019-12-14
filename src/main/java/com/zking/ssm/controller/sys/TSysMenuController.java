package com.zking.ssm.controller.sys;

import com.zking.ssm.model.sys.TSysMenu;
import com.zking.ssm.service.sys.ISysMenuService;
import com.zking.ssm.util.DataProtocol;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/*
@author yani
@create 2019-12-1215:42
*/
@RestController
@RequestMapping("/sysMenu")
public class TSysMenuController {

    @Resource
    private ISysMenuService sysMenuService;

    @RequestMapping(value="/getMenu",method= RequestMethod.POST,produces = {"application/json;charset=UTF-8"})
    public Object getMenu() {

        DataProtocol data = new DataProtocol();
        TSysMenu s = new TSysMenu();
        s.setParentId(-1);
        List<TSysMenu> myl = sysMenuService.getmenu(s);
        if (myl != null && myl.size() >= 0) {
            for (TSysMenu m : myl) {
                if (m.getParentId() == -1) {
                    TSysMenu sys = new TSysMenu();
                    sys.setParentId(m.getMenuId());
                    List<TSysMenu> cls = sysMenuService.getmenu(sys);
                    m.setSysMenu(cls);
                }
            }
        }
        data.setCode(data.SUCCESS);
        data.setData(myl);
        data.setMessage("操作成功");
        return data;
    }

}
