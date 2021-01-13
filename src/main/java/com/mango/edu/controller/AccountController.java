package com.mango.edu.controller;

import com.mango.edu.pojo.AccountPojo;
import com.mango.edu.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author mango
 * @date 2021/1/13 18:45
 * @description:
 */
@Controller
@RequestMapping("/account")
public class AccountController {

    /**
     * Spring容器和SpringMVC是有层次的
     * Spring容器：service与dao
     * SpringMVC容器: controller  可以引用到spring容器的对象
     */

    @Autowired
    private AccountService accountService;

    @ResponseBody
    @RequestMapping("/queryList")
    public List<AccountPojo> queryList() {
        return accountService.queryList();
    }
}
