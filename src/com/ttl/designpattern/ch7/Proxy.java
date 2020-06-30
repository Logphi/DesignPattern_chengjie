package com.ttl.designpattern.ch7;

/**
 * @ClassName Pursuit
 * @Description TODO
 * @Author ttl
 * @Date 2020/6/30 10:33
 * Version 1.0
 **/
public class Proxy implements GiveGift{

    private Pursuit pursuit;

    public Proxy(Girl girl) {
        pursuit = new Pursuit(girl);
    }

    @Override
    public void giveDolls() {
        pursuit.giveDolls();
    }

    @Override
    public void giveFlowers() {
        pursuit.giveFlowers();
    }

    @Override
    public void giveChocolate() {
        pursuit.giveChocolate();
    }
}
