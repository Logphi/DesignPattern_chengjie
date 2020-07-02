package com.ttl.designpattern.ch25;

/**
 * @ClassName USA
 * @Description TODO
 * @Author ttl
 * @Date 2020/7/2 15:14
 * Version 1.0
 **/
public class Iraq extends Country {

    public Iraq(UnitedNation unitedNation) {
        super(unitedNation);
    }

    public void declare(String message) {
        unitedNation.declare(message, this);
    }

    @Override
    public void getMessage(String message) {
        System.out.println("伊拉克获得对方信息: " + message);
    }
}
