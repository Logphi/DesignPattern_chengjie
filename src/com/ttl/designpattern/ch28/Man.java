package com.ttl.designpattern.ch28;

/**
 * @ClassName Man
 * @Description TODO
 * @Author ttl
 * @Date 2020/7/2 16:50
 * Version 1.0
 **/
public class Man implements Person{
    @Override
    public void accept(Action action) {
        action.getManConclusion(this);
    }
}
