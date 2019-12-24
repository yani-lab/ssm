package com.zking.ssm.service.infoimpl;

import com.zking.ssm.model.sys.TSysTemdictionary;
import com.zking.ssm.service.info.*;
import com.zking.ssm.service.sys.ISysTemdictionaryService;
import com.zking.ssm.service.sys.ISysTemdictionaryitemService;
import com.zking.ssm.service.sys.ISysUserService;
import org.junit.Test;
import test.java.com.zking.test.BaseTest;

import javax.annotation.Resource;
import java.text.ParseException;

/*
@author yani
@create 2019-12-2116:08
*/

public class IProducttableServiceImplTest extends BaseTest {
    @Resource
    private IProducttableService producttableService;
    @Resource
    private IRepaymentService repaymentService;
    @Resource
    private ISysUserService sysUserService;
    @Resource
    private IOverduetypeSErvice overduetypeSErvice;
    @Resource
    private IOverduepaymentService overduepayment;
    @Resource
    private ISysTemdictionaryitemService sysTemdictionaryitemService;
    @Resource
    private ILoanstableService loanstableService;
    @Resource
    private ISysTemdictionaryService sysTemdictionary;

    @Test
    public void addpro() throws ParseException {
        TSysTemdictionary t=new TSysTemdictionary();
        t.setTitle("1");
        t.setIntro("1");
        int n=sysTemdictionary.addtemdict(t);
    }
    }
