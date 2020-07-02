package com.ttl.designpattern.ch24;

/**
 * @ClassName Majordomo
 * @Description TODO
 * @Author ttl
 * @Date 2020/7/2 14:37
 * Version 1.0
 **/
public class Majordomo extends Manager {

    public Majordomo(String name) {
        super(name);
    }

    @Override
    public void requestApplication(Request request) {
        if (request.getRequestType().equals("请假") && request.getNumber() <= 5) {
            System.out.println(request.getRequestType() +
                    request.getRequestContent() + request.getNumber() + "被批准");
        } else {
            if (superior != null) {
                superior.requestApplication(request);
            }
        }
    }
}
