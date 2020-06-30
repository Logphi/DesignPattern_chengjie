package com.ttl.designpattern.ch14;

/**
 * @ClassName StockObserver
 * @Description TODO
 * @Author ttl
 * @Date 2020/6/30 16:11
 * Version 1.0
 **/
public class StockObserver{
    protected String name;
    protected Subject sub;

    public StockObserver(String name, Subject sub) {
        this.name = name;
        this.sub = sub;
    }

    public void closeStockMarket() {
        System.out.println(sub.getMessage() + "关闭股票，开始工作");
    }
}
