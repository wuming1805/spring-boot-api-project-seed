package com.company.project.service.impl;

import com.company.project.dao.AccountMapper;
import com.company.project.model.Account;
import com.company.project.service.AccountService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2020/04/09.
 */
@Service
@Transactional
public class AccountServiceImpl extends AbstractService<Account> implements AccountService {
    @Resource
    private AccountMapper accountMapper;

//    public Account findd(){
////       return accountMapper.findd();
//    }

}
