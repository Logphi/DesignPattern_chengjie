package com.ttl.designpattern.ch15.dao.impl;

import com.ttl.designpattern.ch15.bean.Department;
import com.ttl.designpattern.ch15.dao.DepartmentDao;

/**
 * @ClassName SqlServerDepartmentDao
 * @Description TODO
 * @Author ttl
 * @Date 2020/7/1 11:37
 * Version 1.0
 **/
public class SqlServerDepartmentDao implements DepartmentDao {
    @Override
    public void insert(Department department) {
        System.out.println("在SqlServer中插入一条department --> " + department);
    }

    @Override
    public Department get(int id) {
        System.out.println("在SqlServer中获取一条department记录");
        return null;
    }
}
