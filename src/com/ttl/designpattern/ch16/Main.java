package com.ttl.designpattern.ch16;

/**
 * @ClassName Main
 * @Description 状态模式范例
 * @Author ttl
 * @Date 2020/7/1 14:00
 * Version 1.0
 **/
public class Main {

    public static void main(String[] args) {
        Work work = new Work();
        work.setHour(9);
        work.writeProgram();
//        work.setHour(10);
//        work.writeProgram();
//        work.setHour(12);
//        work.writeProgram();
//        work.setHour(13);
//        work.writeProgram();
//        work.setHour(14);
//        work.writeProgram();
        work.setHour(17);
        work.writeProgram();

//        work.setTaskFinished(true);
        work.setTaskFinished(false);

        work.setHour(19);
        work.writeProgram();
        work.setHour(22);
        work.writeProgram();
    }
}
