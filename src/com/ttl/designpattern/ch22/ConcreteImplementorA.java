package com.ttl.designpattern.ch22;

/**
 * @ClassName ConcreteImplementorA
 * @Description TODO
 * @Author ttl
 * @Date 2020/7/2 13:45
 * Version 1.0
 **/
public class ConcreteImplementorA implements Implementor {
    @Override
    public void operation() {
        System.out.println("具体实现A的方法执行");
    }
}
