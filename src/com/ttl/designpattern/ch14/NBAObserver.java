package com.ttl.designpattern.ch14;

/**
 * @ClassName NBAObserver
 * @Description TODO
 * @Author ttl
 * @Date 2020/6/30 16:30
 * Version 1.0
 **/
public class NBAObserver {
    protected String name;
    protected Subject sub;

    public NBAObserver(String name, Subject sub) {
        this.name = name;
        this.sub = sub;
    }

    public void closeNBADirectSeeding() {
        System.out.println(sub.getMessage() + "关闭NBA，开始工作");
    }
}
