package com.ttl.designpattern.ch15;

import com.ttl.designpattern.ch15.dao.DaoFactory;
import com.ttl.designpattern.ch15.dao.DepartmentDao;
import com.ttl.designpattern.ch15.dao.UserDao;
import com.ttl.designpattern.ch15.dao.impl.SqlServerDepartmentDao;
import com.ttl.designpattern.ch15.dao.impl.SqlServerUserDao;

/**
 * @ClassName SqlServerUserDaoFactory
 * @Description TODO
 * @Author ttl
 * @Date 2020/7/1 10:30
 * Version 1.0
 **/
public class SqlServerDaoFactory implements DaoFactory {
    @Override
    public UserDao createUserDao() {
        return new SqlServerUserDao();
    }

    @Override
    public DepartmentDao createDepartmentDao() {
        return new SqlServerDepartmentDao();
    }
}
