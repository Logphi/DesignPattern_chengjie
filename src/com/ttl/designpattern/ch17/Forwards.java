package com.ttl.designpattern.ch17;

/**
 * @ClassName Forwards
 * @Description TODO
 * @Author ttl
 * @Date 2020/7/1 15:54
 * Version 1.0
 **/
public class Forwards extends Player {

    public Forwards(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println("前锋 -- " + name + "进攻");
    }

    @Override
    public void defence() {
        System.out.println("前锋 -- " + name + "防守");
    }
}
