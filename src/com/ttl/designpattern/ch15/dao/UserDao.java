package com.ttl.designpattern.ch15.dao;

import com.ttl.designpattern.ch15.bean.User;

/**
 * @ClassName UserDao
 * @Description TODO
 * @Author ttl
 * @Date 2020/7/1 10:20
 * Version 1.0
 **/
public interface UserDao {
    void insert(User user);
    User get(int id);
}
