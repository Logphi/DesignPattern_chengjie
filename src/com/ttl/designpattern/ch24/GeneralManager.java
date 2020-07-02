package com.ttl.designpattern.ch24;

/**
 * @ClassName GeneralManager
 * @Description TODO
 * @Author ttl
 * @Date 2020/7/2 14:38
 * Version 1.0
 **/
public class GeneralManager extends Manager {

    public GeneralManager(String name) {
        super(name);
    }

    @Override
    public void requestApplication(Request request) {
        if (request.getRequestType().equals("请假")) {
            System.out.println(request.getRequestType() +
                    request.getRequestContent() + request.getNumber() + "被批准");
        } else if (request.getRequestType().equals("加薪") && request.getNumber() <= 500){
            System.out.println(request.getRequestType() +
                    request.getRequestContent() + request.getNumber() + "被批准");
        } else if (request.getRequestType().equals("加薪") && request.getNumber() > 500) {
            System.out.println("再说吧");
        }
    }
}
