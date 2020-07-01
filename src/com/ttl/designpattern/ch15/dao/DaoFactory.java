package com.ttl.designpattern.ch15.dao;

/**
 * @ClassName DaoFactory
 * @Description TODO
 * @Author ttl
 * @Date 2020/7/1 11:43
 * Version 1.0
 **/
public interface DaoFactory {
    UserDao createUserDao();
    DepartmentDao createDepartmentDao();
}
