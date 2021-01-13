package com.mango.edu.service.impl;

import com.mango.edu.mapper.AccountMapper;
import com.mango.edu.pojo.AccountPojo;
import com.mango.edu.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author mango
 * @date 2021/1/13 15:40
 * @description:
 */
@Service
@Transactional
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountMapper accountMapper;

    @Override
    public List<AccountPojo> queryList() {
        return accountMapper.queryList();
    }
}
