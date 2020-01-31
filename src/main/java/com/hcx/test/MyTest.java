package com.hcx.test;

import com.hcx.dao.AccountDao;
import com.hcx.domain.Account;
import com.hcx.service.AccountService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * Created by hongcaixia on 2020/1/4.
 */
public class MyTest {

    @Test
    public void run(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:ApplicationContext.xml");
        AccountService accountService = (AccountService)applicationContext.getBean("accountService");
        accountService.findAll();
    }

    @Test
    public void run2() throws IOException {
        InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        AccountDao accountDao = sqlSession.getMapper(AccountDao.class);
        List<Account> accounts = accountDao.selectAll();
        accounts.stream().forEach(account -> System.out.println(account));
        sqlSession.close();
        inputStream.close();
    }


    @Test
    public void run3() throws IOException {
        Account account = new Account();
        account.setName("小红");
        account.setMoney(200d);

        InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        AccountDao accountDao = sqlSession.getMapper(AccountDao.class);
        accountDao.insertAccount(account);
        sqlSession.commit();
        sqlSession.close();
        inputStream.close();
    }
}
