package com.ttl.designpattern.ch28;

/**
 * @ClassName Success
 * @Description TODO
 * @Author ttl
 * @Date 2020/7/2 16:49
 * Version 1.0
 **/
public class Success implements Action {
    @Override
    public void getManConclusion(Man man) {
        System.out.println(man.getClass().getSimpleName() + " " + this.getClass().getSimpleName() +
                ": 背后有一个伟大的女人");
    }

    @Override
    public void getWomenConclusion(Women women) {
        System.out.println(women.getClass().getSimpleName() + " " + this.getClass().getSimpleName() +
                ": 背后有一个不成功的男人");
    }
}
