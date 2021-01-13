package com.mango.edu.service;

import com.mango.edu.pojo.AccountPojo;

import java.util.List;

/**
 * @author mango
 * @date 2021/1/13 15:40
 * @description:
 */
public interface AccountService {

    /**
     * 查询所有
     *
     * @return
     */
    List<AccountPojo> queryList();
}
