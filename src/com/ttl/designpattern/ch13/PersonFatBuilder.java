package com.ttl.designpattern.ch13;

/**
 * @ClassName PersonFatBuilder
 * @Description TODO
 * @Author ttl
 * @Date 2020/6/30 15:51
 * Version 1.0
 **/
public class PersonFatBuilder extends PersonBuilder {
    @Override
    public void buildHeader() {
        System.out.println("胖子 -- 头");
    }

    @Override
    public void buildBody() {
        System.out.println("胖子 -- 身体");
    }

    @Override
    public void buildArmLeft() {
        System.out.println("胖子 -- 左手");
    }

    @Override
    public void buildArmRight() {
        System.out.println("胖子 -- 右手");
    }

    @Override
    public void buildLegLeft() {
        System.out.println("胖子 -- 左腿");
    }

    @Override
    public void buildLegRight() {
        System.out.println("胖子 -- 右腿");
    }
}
