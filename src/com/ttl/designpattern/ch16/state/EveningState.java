package com.ttl.designpattern.ch16.state;

import com.ttl.designpattern.ch16.Work;
/**
 * @ClassName EveningState
 * @Description 晚间状态
 * @Author ttl
 * @Date 2020/7/1 15:14
 * Version 1.0
 **/
public class EveningState extends State {
    @Override
    public void writeProgram(Work work) {
        if (work.isTaskFinished()) { // 工作完成，下班
            work.setStatus(new RestState());
            work.writeProgram();
        } else { // 没完成，加班
            if (work.getHour() < 21) {
                System.out.println("当前时间：" + work.getHour() + ", 加班中");
            } else { // 进入睡眠时间
                work.setStatus(new SleepingState());
                work.writeProgram();
            }
        }
    }
}
