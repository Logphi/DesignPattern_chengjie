package com.ttl.designpattern.ch22;

/**
 * @ClassName Abstraction
 * @Description TODO
 * @Author ttl
 * @Date 2020/7/2 13:46
 * Version 1.0
 **/
public class Abstraction {
    protected Implementor implementor;

    public void setImplementor(Implementor implementor) {
        this.implementor = implementor;
    }

    public void operation() {
        implementor.operation();
    }
}
