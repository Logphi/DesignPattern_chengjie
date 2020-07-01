package com.ttl.designpattern.ch17;

/**
 * @ClassName Player
 * @Description TODO
 * @Author ttl
 * @Date 2020/7/1 15:52
 * Version 1.0
 **/
public abstract class Player {
    protected String name;

    public Player() {
    }

    public Player(String name) {
        this.name = name;
    }

    public abstract void attack();

    public abstract void defence();
}
