package com.ttl.designpattern.ch14;

/**
 * @ClassName Main
 * @Description 观察者模式范例
 * @Author ttl
 * @Date 2020/6/30 16:07
 * Version 1.0
 **/
public class Main {

    public static void main(String[] args) {
        Secretary secretary = new Secretary();

        StockObserver observer1 = new StockObserver("哈哈", secretary);
        NBAObserver observer2 = new NBAObserver("嘻嘻", secretary);



        secretary.setAction("老板回来了");
        secretary.notifyObserver();
    }
}
