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

        StockListener listener1 = new StockListener("哈哈", secretary);
        NBAListener listener2 = new NBAListener("嘻嘻", secretary);

        secretary.addListener(new Listener(listener1, "closeStockMarket", "老板回来了"));
        secretary.addListener(new Listener(listener2, "closeNBADirectSeeding", "老板回来了"));

        secretary.notifyListener();
    }
}
