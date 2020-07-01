package com.ttl.designpattern.ch14;

/**
 * @ClassName StockObserver
 * @Description TODO
 * @Author ttl
 * @Date 2020/6/30 16:11
 * Version 1.0
 **/
public class StockListener {
    protected String name;
    protected Subject sub;

    public StockListener(String name, Subject sub) {
        this.name = name;
        this.sub = sub;
    }

    public void closeStockMarket(String message) {
        System.out.println(message + " 关闭股票");
    }
}
