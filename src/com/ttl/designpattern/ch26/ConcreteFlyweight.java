package com.ttl.designpattern.ch26;

/**
 * @ClassName ConcreteFlyweight
 * @Description TODO
 * @Author ttl
 * @Date 2020/7/2 15:42
 * Version 1.0
 **/
public class ConcreteFlyweight extends Flyweight {
    @Override
    public void operation(int extrinsicstate) {
        System.out.println("ConcreteFlyweight : " + extrinsicstate);
    }
}
