package com.ttl.designpattern.ch16.state;

import com.ttl.designpattern.ch16.Work;
/**
 * @ClassName ForenoonState
 * @Description 上午工作状态
 * @Author ttl
 * @Date 2020/7/1 15:10
 * Version 1.0
 **/
public class ForenoonState extends State {
    @Override
    public void writeProgram(Work work) {
        if (work.getHour() < 12) {
            System.out.println("当前时间: " + work.getHour() + ", 精神好");
        } else { // 超过12点，转入中午状态
            work.setStatus(new NoonState());
            work.writeProgram();
        }
    }
}
