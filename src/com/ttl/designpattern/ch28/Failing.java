package com.ttl.designpattern.ch28;

/**
 * @ClassName Failing
 * @Description TODO
 * @Author ttl
 * @Date 2020/7/2 16:52
 * Version 1.0
 **/
public class Failing implements Action {
    @Override
    public void getManConclusion(Man man) {
        System.out.println(man.getClass().getSimpleName() + " " + this.getClass().getSimpleName() +
                ": 喝酒");
    }

    @Override
    public void getWomenConclusion(Women women) {
        System.out.println(women.getClass().getSimpleName() + " " + this.getClass().getSimpleName() +
                ": 眼泪汪汪");
    }
}
