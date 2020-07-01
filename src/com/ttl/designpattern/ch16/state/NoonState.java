package com.ttl.designpattern.ch16.state;

import com.ttl.designpattern.ch16.Work;
/**
 * @ClassName NoonState
 * @Description 中午工作状态
 * @Author ttl
 * @Date 2020/7/1 15:13
 * Version 1.0
 **/
public class NoonState extends State {
    @Override
    public void writeProgram(Work work) {
        if (work.getHour() < 13) {
            System.out.println("当前时间：" + work.getHour() + ", 午休");
        } else { // 超过13点，进入下午状态
            work.setStatus(new AfternoonState());
            work.writeProgram();
        }
    }
}
