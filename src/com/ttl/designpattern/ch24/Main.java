package com.ttl.designpattern.ch24;

/**
 * @ClassName Main
 * @Description 责任链模式
 * @Author ttl
 * @Date 2020/7/2 14:22
 * Version 1.0
 **/
public class Main {
    public static void main(String[] args) {
        CommonManger commonManger = new CommonManger("小头目");
        Majordomo majordomo = new Majordomo("总监");
        GeneralManager generalManager = new GeneralManager("总经理");
        commonManger.setSuperior(majordomo);
        majordomo.setSuperior(generalManager);

        Request request1 = new Request("请假", "我要休息", 2);
        Request request2 = new Request("请假", "我要休息", 10);
        Request request3 = new Request("加薪", "我要花钱", 10);
        Request request4 = new Request("加薪", "我要花钱", 1000);
        Request request5 = new Request("加薪", "我要花钱", 500);
        commonManger.requestApplication(request1);
        commonManger.requestApplication(request2);
        commonManger.requestApplication(request3);
        commonManger.requestApplication(request4);
        commonManger.requestApplication(request5);
    }
}
