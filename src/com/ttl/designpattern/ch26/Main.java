package com.ttl.designpattern.ch26;

/**
 * @ClassName Main
 * @Description 享元模式范例
 * @Author ttl
 * @Date 2020/7/2 15:25
 * Version 1.0
 **/
public class Main {
    public static void main(String[] args) {
        int extrinsicstate = 22;
        FlyweightFactory factory = new FlyweightFactory();
        Flyweight fx = factory.getFlyweight("x");
        fx.operation(--extrinsicstate);
        Flyweight fy = factory.getFlyweight("y");
        fy.operation(--extrinsicstate);
        Flyweight fz = factory.getFlyweight("z");
        fz.operation(--extrinsicstate);

        UnsharedConcreteFlyweight unsharedConcreteFlyweight = new UnsharedConcreteFlyweight();
        unsharedConcreteFlyweight.operation(--extrinsicstate);
    }
}
