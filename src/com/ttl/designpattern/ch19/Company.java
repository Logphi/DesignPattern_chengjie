package com.ttl.designpattern.ch19;

/**
 * @ClassName Company
 * @Description TODO
 * @Author ttl
 * @Date 2020/7/2 10:30
 * Version 1.0
 **/
public abstract class Company {
    protected String name;

    public Company(String name) {
        this.name = name;
    }

    /**
     * 增加
     * @param company
     */
    public abstract void add(Company company);

    /**
     * 移除
     * @param company
     */
    public abstract void remove(Company company);

    /**
     * 显示
     * @param depth
     */
    public abstract void display(int depth);

    /**
     * 履行职责
     */
    public abstract void lineOfDuty();
}
