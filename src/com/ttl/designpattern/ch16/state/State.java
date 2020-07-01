package com.ttl.designpattern.ch16.state;

import com.ttl.designpattern.ch16.Work;
/**
 * @ClassName State
 * @Description TODO
 * @Author ttl
 * @Date 2020/7/1 15:06
 * Version 1.0
 **/
public abstract class State {
    public abstract void writeProgram(Work work);
}
