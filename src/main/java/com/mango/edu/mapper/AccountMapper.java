package com.mango.edu.mapper;

import com.mango.edu.pojo.AccountPojo;

import java.util.List;

/**
 * @author mango
 * @date 2021/1/13 15:31
 * @description:
 */
public interface AccountMapper {

    /**
     * 查询所有
     *
     * @return
     */
    List<AccountPojo> queryList();
}
