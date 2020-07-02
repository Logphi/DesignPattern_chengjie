package com.ttl.designpattern.ch28;

/**
 * @ClassName Amativeness
 * @Description TODO
 * @Author ttl
 * @Date 2020/7/2 16:52
 * Version 1.0
 **/
public class Amativeness implements Action {
    @Override
    public void getManConclusion(Man man) {
        System.out.println(man.getClass().getSimpleName() + " " + this.getClass().getSimpleName() +
                ": 不懂装懂");
    }

    @Override
    public void getWomenConclusion(Women women) {
        System.out.println(women.getClass().getSimpleName() + " " + this.getClass().getSimpleName() +
                ": 懂装不懂");
    }
}
