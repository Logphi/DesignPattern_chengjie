package com.ttl.designpattern.ch14;

import java.util.ArrayList;
import java.util.List;
/**
 * @ClassName Secretary
 * @Description TODO
 * @Author ttl
 * @Date 2020/6/30 16:11
 * Version 1.0
 **/
public class Secretary implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private String action;
    private Event event;

    public void setAction(String action) {
        this.action = action;
    }

    @Override
    public String getMessage() {
        return action;
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
