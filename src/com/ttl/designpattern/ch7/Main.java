package com.ttl.designpattern.ch7;

/**
 * @ClassName ProxyPattern
 * @Description 代理设计模式范例
 * @Author ttl
 * @Date 2020/6/30 10:39
 * Version 1.0
 **/
public class Main {
    public static void main(String[] args) {
        Girl girl = new Girl("哈哈");

        Proxy proxy = new Proxy(girl);
        proxy.giveDolls();
        proxy.giveFlowers();
        proxy.giveChocolate();
    }
}
