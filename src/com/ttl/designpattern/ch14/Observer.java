package com.ttl.designpattern.ch14;

/**
 * @ClassName Observer
 * @Description 观察者抽象类
 * @Author ttl
 * @Date 2020/6/30 16:22
 * Version 1.0
 **/
public abstract class Observer {
    protected String name;
    protected Subject sub;

    public Observer(String name, Subject sub) {
        this.name = name;
        this.sub = sub;
    }

    public abstract void update();
}
