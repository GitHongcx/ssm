package com.hcx.service.impl;

import com.hcx.dao.AccountDao;
import com.hcx.domain.Account;
import com.hcx.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by hongcaixia on 2020/1/4.
 */
@Service
public class AccountServiceImpl implements AccountService{

    @Autowired
    private AccountDao accountDao;

    @Override
    public List<Account> findAll() {
        System.out.println("service：查找所有账户");
        return accountDao.selectAll();
    }

    @Override
    public void saveAccount(Account account) {
        System.out.println("service：保存账户");
        accountDao.insertAccount(account);
    }
}
