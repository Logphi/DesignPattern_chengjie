package com.ttl.designpattern.ch19;

/**
 * @ClassName HRDepartment
 * @Description TODO
 * @Author ttl
 * @Date 2020/7/2 10:47
 * Version 1.0
 **/
public class HRDepartment extends Company {

    public HRDepartment(String name) {
        super(name);
    }

    @Override
    public void add(Company company) {

    }

    @Override
    public void remove(Company company) {

    }

    @Override
    public void display(int depth) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < depth; i++) {
            sb.append("-");
        }
        sb.append(name);
        System.out.println(sb);
    }

    @Override
    public void lineOfDuty() {
        System.out.println(name + "员工管理培训");
    }
}
