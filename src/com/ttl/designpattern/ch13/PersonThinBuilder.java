package com.ttl.designpattern.ch13;

/**
 * @ClassName PersonThinBuilder
 * @Description TODO
 * @Author ttl
 * @Date 2020/6/30 15:49
 * Version 1.0
 **/
public class PersonThinBuilder extends PersonBuilder {
    @Override
    public void buildHeader() {
        System.out.println("瘦子 -- 头");
    }

    @Override
    public void buildBody() {
        System.out.println("瘦子 -- 身体");
    }

    @Override
    public void buildArmLeft() {
        System.out.println("瘦子 -- 左手");
    }

    @Override
    public void buildArmRight() {
        System.out.println("瘦子 -- 右手");
    }

    @Override
    public void buildLegLeft() {
        System.out.println("瘦子 -- 左腿");
    }

    @Override
    public void buildLegRight() {
        System.out.println("瘦子 -- 右腿");
    }
}
