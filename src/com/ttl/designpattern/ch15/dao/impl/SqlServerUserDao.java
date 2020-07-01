package com.ttl.designpattern.ch15.dao.impl;

import com.ttl.designpattern.ch15.bean.User;
import com.ttl.designpattern.ch15.dao.UserDao;

/**
 * @ClassName SqlServerUser
 * @Description SqlServer
 * @Author ttl
 * @Date 2020/7/1 10:08
 * Version 1.0
 **/
public class SqlServerUserDao implements UserDao {

    @Override
    public void insert(User user) {
        System.out.println("在SQLServer中插入一条user --> " + user);
    }

    @Override
    public User get(int id) {
        System.out.println("在SQLServer中获取一条user记录");
        return null;
    }
}
