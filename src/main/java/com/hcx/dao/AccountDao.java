package com.hcx.dao;

import com.hcx.domain.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by hongcaixia on 2020/1/4.
 */
@Repository
public interface AccountDao {

    @Select("select id,name,money from account")
    List<Account> selectAll();

    @Insert("insert into account(name,money) values (#{name},#{money})")
    void insertAccount(Account account);

}
