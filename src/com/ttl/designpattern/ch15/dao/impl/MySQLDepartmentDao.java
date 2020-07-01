package com.ttl.designpattern.ch15.dao.impl;

import com.ttl.designpattern.ch15.bean.Department;
import com.ttl.designpattern.ch15.dao.DepartmentDao;

/**
 * @ClassName MySQLDepartmentDao
 * @Description TODO
 * @Author ttl
 * @Date 2020/7/1 10:38
 * Version 1.0
 **/
public class MySQLDepartmentDao implements DepartmentDao {
    @Override
    public void insert(Department department) {
        System.out.println("在MySQL中插入一条department --> " + department);
    }

    @Override
    public Department get(int id) {
        System.out.println("在MySQL中获取一条user记录");
        return null;
    }
}
