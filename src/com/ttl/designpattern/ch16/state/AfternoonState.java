package com.ttl.designpattern.ch16.state;

import com.ttl.designpattern.ch16.Work;
/**
 * @ClassName AfternoonState
 * @Description 下午状态
 * @Author ttl
 * @Date 2020/7/1 15:13
 * Version 1.0
 **/
public class AfternoonState extends State {
    @Override
    public void writeProgram(Work work) {
        if (work.getHour() < 17) {
            System.out.println("当前时间：" + work.getHour() + ", 状态不错");
        } else { // 超过17点，转入傍晚工作状态
            work.setStatus(new EveningState());
            work.writeProgram();
        }
    }
}
