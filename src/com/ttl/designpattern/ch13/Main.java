package com.ttl.designpattern.ch13;

/**
 * @ClassName Main
 * @Description 建造者模式范例
 * @Author ttl
 * @Date 2020/6/30 15:23
 * Version 1.0
 **/
public class Main {

    public static void main(String[] args) {
        PersonThinBuilder personThinBuilder = new PersonThinBuilder();
        PersonFatBuilder personFatBuilder = new PersonFatBuilder();
        PersonDirector director = new PersonDirector();

        director.setPersonBuilder(personThinBuilder);
        director.createPerson();

        System.out.println("--------------------");

        director.setPersonBuilder(personFatBuilder);
        director.createPerson();
    }
}
