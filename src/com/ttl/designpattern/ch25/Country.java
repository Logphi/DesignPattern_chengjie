package com.ttl.designpattern.ch25;

/**
 * @ClassName Country
 * @Description TODO
 * @Author ttl
 * @Date 2020/7/2 15:13
 * Version 1.0
 **/
public abstract class Country {
    protected UnitedNation unitedNation;

    public Country(UnitedNation unitedNation) {
        this.unitedNation = unitedNation;
    }

    abstract void getMessage(String message);
}
