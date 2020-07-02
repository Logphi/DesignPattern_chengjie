package com.ttl.designpattern.ch22;

/**
 * @ClassName Main
 * @Description 桥接模式范例
 * @Author ttl
 * @Date 2020/7/2 11:47
 * Version 1.0
 **/
public class Main {
    public static void main(String[] args) {
        Abstraction ab = new RefinedAbstraction();
        ab.setImplementor(new ConcreteImplementorA());
        ab.operation();

        ab.setImplementor(new ConcreteImplementorB());
        ab.operation();
    }
}
