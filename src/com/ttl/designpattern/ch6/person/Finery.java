package com.ttl.designpattern.ch6.person;

/**
 * @ClassName Finery
 * @Description TODO
 * @Author ttl
 * @Date 2020/6/29 16:24
 * Version 1.0
 **/
public class Finery extends Person {
    protected Person component;

    public void decorate(Person component) {
        this.component = component;
    }

    @Override
    public void show() {
        if (component != null) {
            component.show();
        }
    }
}
