package com.zking.ssm.service.infoimpl;
/*
@author yani
@create 2019-12-1216:29
*/

import com.zking.ssm.mapper.info.TProducttableMapper;
import com.zking.ssm.model.info.TProducttable;
import com.zking.ssm.service.info.IProducttableService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class IProducttableServiceImpl implements IProducttableService {
    @Resource
    private TProducttableMapper producttableMapper;
    @Override
    public List<TProducttable> listprod() {
        return producttableMapper.listprod();
    }

    @Override
    public List<TProducttable> listprodname(TProducttable producttable) {
        return producttableMapper.listprodname(producttable);
    }
    @Override
    public int addpro(TProducttable producttable) {
        return producttableMapper.addpro(producttable);
    }

    @Override
    public int updatepro(TProducttable producttable) {
        return producttableMapper.updatepro(producttable);
    }

    @Override
    public int delpro(TProducttable producttable) {
        return producttableMapper.delpro(producttable);
    }
}
