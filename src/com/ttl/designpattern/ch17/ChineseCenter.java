package com.ttl.designpattern.ch17;

/**
 * @ClassName Forwards
 * @Description TODO
 * @Author ttl
 * @Date 2020/7/1 15:54
 * Version 1.0
 **/
public class ChineseCenter {
    private String name;

    public ChineseCenter(String name) {
        this.name = name;
    }

    public void 进攻() {
        System.out.println("中锋 -- " + name + "进攻");
    }

    public void 防守() {
        System.out.println("中锋 -- " + name + "防守");
    }
}
