package com.ttl.designpattern.ch26;

/**
 * @ClassName UnsharedConreteFlyweight
 * @Description TODO
 * @Author ttl
 * @Date 2020/7/2 15:43
 * Version 1.0
 **/
public class UnsharedConcreteFlyweight extends Flyweight {
    @Override
    public void operation(int extrinsicstate) {
        System.out.println("UnsharedConcreteFlyweight : " + extrinsicstate);
    }
}
