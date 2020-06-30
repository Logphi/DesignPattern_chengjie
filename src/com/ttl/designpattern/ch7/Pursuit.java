package com.ttl.designpattern.ch7;

/**
 * @ClassName Pursuit
 * @Description TODO
 * @Author ttl
 * @Date 2020/6/30 10:33
 * Version 1.0
 **/
public class Pursuit implements GiveGift {

    private Girl girl;

    public Pursuit(Girl girl) {
        this.girl = girl;
    }

    @Override
    public void giveDolls() {
        System.out.println(girl.getName() + "娃娃");
    }

    @Override
    public void giveFlowers() {
        System.out.println(girl.getName() + "花");
    }

    @Override
    public void giveChocolate() {
        System.out.println(girl.getName() + "巧克力");
    }
}
