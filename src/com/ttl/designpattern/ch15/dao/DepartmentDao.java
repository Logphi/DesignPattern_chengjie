package com.ttl.designpattern.ch15.dao;

import com.ttl.designpattern.ch15.bean.Department;

/**
 * @ClassName DepartmentDao
 * @Description TODO
 * @Author ttl
 * @Date 2020/7/1 10:33
 * Version 1.0
 **/
public interface DepartmentDao {
    void insert(Department department);
    Department get(int id);
}
