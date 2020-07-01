package com.ttl.designpattern.ch15;

import com.ttl.designpattern.ch15.dao.DaoFactory;
import com.ttl.designpattern.ch15.dao.DepartmentDao;
import com.ttl.designpattern.ch15.dao.UserDao;
import com.ttl.designpattern.ch15.dao.impl.MySQLDepartmentDao;
import com.ttl.designpattern.ch15.dao.impl.MySQLUserDao;
/**
 * @ClassName MySQLUserDaoFactory
 * @Description TODO
 * @Author ttl
 * @Date 2020/7/1 10:31
 * Version 1.0
 **/
public class MySQLDaoFactory implements DaoFactory {
    @Override
    public UserDao createUserDao() {
        return new MySQLUserDao();
    }

    @Override
    public DepartmentDao createDepartmentDao() {
        return new MySQLDepartmentDao();
    }
}
