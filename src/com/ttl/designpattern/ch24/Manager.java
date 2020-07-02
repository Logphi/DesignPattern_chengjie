package com.ttl.designpattern.ch24;

/**
 * @ClassName Manager
 * @Description TODO
 * @Author ttl
 * @Date 2020/7/2 14:25
 * Version 1.0
 **/
public abstract class Manager {
    protected String name;
    protected Manager superior;

    public Manager(String name) {
        this.name = name;
    }

    public void setSuperior(Manager superior) {
        this.superior = superior;
    }

    public abstract void requestApplication(Request request);
}
