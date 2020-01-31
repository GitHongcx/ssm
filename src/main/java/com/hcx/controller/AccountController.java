package com.hcx.controller;

import com.hcx.domain.Account;
import com.hcx.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by hongcaixia on 2020/1/4.
 */
@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @RequestMapping("/findAll")
    public String findAll(Model model){
        System.out.println("web：findAll方法执行了");
        List<Account> list = accountService.findAll();
        model.addAttribute("accountList",list);
        return "list";
    }

    @RequestMapping("/save")
    public void save(Account account, HttpServletRequest request,HttpServletResponse response) throws Exception{
        System.out.println("web：save方法执行了");
        //保存成功，跳转到账户列表页面
        response.sendRedirect(request.getContextPath()+"/account/findAll");
        accountService.saveAccount(account);
    }
}
