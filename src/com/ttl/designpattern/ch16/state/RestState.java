package com.ttl.designpattern.ch16.state;

import com.ttl.designpattern.ch16.Work;
/**
 * @ClassName RestState
 * @Description TODO
 * @Author ttl
 * @Date 2020/7/1 15:14
 * Version 1.0
 **/
public class RestState extends State {
    @Override
    public void writeProgram(Work work) {
        System.out.println("当前时间：" + work.getHour() + ", 回家休息");
    }
}
