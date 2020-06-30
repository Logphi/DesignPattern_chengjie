package com.ttl.designpattern.ch13;

/**
 * @ClassName Person
 * @Description TODO
 * @Author ttl
 * @Date 2020/6/30 15:46
 * Version 1.0
 **/
public abstract class PersonBuilder {
    public abstract void buildHeader();
    public abstract void buildBody();
    public abstract void buildArmLeft();
    public abstract void buildArmRight();
    public abstract void buildLegLeft();
    public abstract void buildLegRight();
}
