package com.ttl.designpattern.ch13;

/**
 * @ClassName PersonDirector
 * @Description TODO
 * @Author ttl
 * @Date 2020/6/30 15:52
 * Version 1.0
 **/
public class PersonDirector {
    private PersonBuilder personBuilder;

    public void setPersonBuilder(PersonBuilder personBuilder) {
        this.personBuilder = personBuilder;
    }

    public void createPerson() {
        personBuilder.buildHeader();
        personBuilder.buildBody();
        personBuilder.buildArmLeft();
        personBuilder.buildArmRight();
        personBuilder.buildLegLeft();
        personBuilder.buildLegRight();
    }
}
