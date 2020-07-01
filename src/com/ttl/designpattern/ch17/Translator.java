package com.ttl.designpattern.ch17;

/**
 * @ClassName Translator
 * @Description TODO
 * @Author ttl
 * @Date 2020/7/1 16:04
 * Version 1.0
 **/
public class Translator extends Player {
    private ChineseCenter chineseGuards;

    public void setChineseGuards(ChineseCenter chineseGuards) {
        this.chineseGuards = chineseGuards;
    }

    @Override
    public void attack() {
        chineseGuards.进攻();
    }

    @Override
    public void defence() {
        chineseGuards.防守();
    }
}
