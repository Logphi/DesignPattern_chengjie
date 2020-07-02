package com.ttl.designpattern.ch22;

/**
 * @ClassName RefinedAbstraction
 * @Description TODO
 * @Author ttl
 * @Date 2020/7/2 13:48
 * Version 1.0
 **/
public class RefinedAbstraction extends Abstraction {

    @Override
    public void operation() {
        implementor.operation();
    }
}
