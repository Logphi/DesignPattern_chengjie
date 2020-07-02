package com.ttl.designpattern.ch28;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName ObjectStructure
 * @Description TODO
 * @Author ttl
 * @Date 2020/7/2 16:55
 * Version 1.0
 **/
public class ObjectStructure {
    private List<Person> personList = new ArrayList<>();

    public void attach(Person person) {
        personList.add(person);
    }

    public void detach(Person person) {
        personList.remove(person);
    }

    public void display(Action action) {
        for (Person person : personList) {
            person.accept(action);
        }
    }
}
