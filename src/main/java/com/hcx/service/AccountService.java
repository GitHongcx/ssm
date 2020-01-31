package com.hcx.service;

import com.hcx.domain.Account;

import java.util.List;

/**
 * Created by hongcaixia on 2020/1/4.
 */
public interface AccountService {

    List<Account> findAll();

    void saveAccount(Account account);
}
