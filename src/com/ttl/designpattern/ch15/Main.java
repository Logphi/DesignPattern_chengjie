package com.ttl.designpattern.ch15;

import com.ttl.designpattern.ch15.bean.Department;
import com.ttl.designpattern.ch15.bean.User;
import com.ttl.designpattern.ch15.dao.DaoFactory;
import com.ttl.designpattern.ch15.dao.DepartmentDao;
import com.ttl.designpattern.ch15.dao.UserDao;
import java.io.IOException;
/**
 * @ClassName Main
 * @Description 抽象工厂模式范例
 * @Author ttl
 * @Date 2020/7/1 10:16
 * Version 1.0
 **/
public class Main {

    public static void main(String[] args) throws IOException {
        DaoFactoryContext context = new DaoFactoryContext("db_config.properties");
        DaoFactory factory = context.getFactory();

        DepartmentDao departmentDao = factory.createDepartmentDao();
        UserDao userDao = factory.createUserDao();

        departmentDao.insert(new Department());
        departmentDao.get(1);
        userDao.insert(new User());
        userDao.get(1);
    }
}
