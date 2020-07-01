package com.ttl.designpattern.ch14;

/**
 * @ClassName NBAObserver
 * @Description TODO
 * @Author ttl
 * @Date 2020/6/30 16:30
 * Version 1.0
 **/
public class NBAListener {
    protected String name;
    protected Subject sub;

    public NBAListener(String name, Subject sub) {
        this.name = name;
        this.sub = sub;
    }

    public void closeNBADirectSeeding(String message) {
        System.out.println(message + " 关闭NBA");
    }
}
