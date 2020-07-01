package com.ttl.designpattern.ch16;

import com.ttl.designpattern.ch16.state.ForenoonState;
import com.ttl.designpattern.ch16.state.State;
/**
 * @ClassName Work
 * @Description TODO
 * @Author ttl
 * @Date 2020/7/1 15:05
 * Version 1.0
 **/
public class Work {
    private State current;
    private double hour;
    private boolean taskFinished;

    public Work() {
        current = new ForenoonState();
    }

    public void setStatus(State current) {
        this.current = current;
    }

    public void setHour(double hour) {
        this.hour = hour;
    }

    public double getHour() {
        return hour;
    }

    public void setTaskFinished(boolean taskFinished) {
        this.taskFinished = taskFinished;
    }

    public boolean isTaskFinished() {
        return taskFinished;
    }

    public void writeProgram() {
        current.writeProgram(this);
    }
}
