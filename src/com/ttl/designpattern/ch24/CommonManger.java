package com.ttl.designpattern.ch24;

/**
 * @ClassName CommonManger
 * @Description 普通管理者
 * @Author ttl
 * @Date 2020/7/2 14:33
 * Version 1.0
 **/
public class CommonManger extends Manager {

    public CommonManger(String name) {
        super(name);
    }

    @Override
    public void requestApplication(Request request) {
        if (request.getRequestType().equals("请假") && request.getNumber() <= 2) {
            System.out.println(request.getRequestType() +
                    request.getRequestContent() + request.getNumber() + "被批准");
        } else {
            if (superior != null) {
                superior.requestApplication(request);
            }
        }
    }
}
