package com.ttl.designpattern.ch6.person;

/**
 * @ClassName Person
 * @Description TODO
 * @Author ttl
 * @Date 2020/6/29 16:03
 * Version 1.0
 **/
public class Person {
    private String name;

    public Person() {}

    public Person(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println(name + "的装扮是：");
    }
}
