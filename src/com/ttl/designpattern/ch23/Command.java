package com.ttl.designpattern.ch23;

/**
 * @ClassName Command
 * @Description TODO
 * @Author ttl
 * @Date 2020/7/2 14:07
 * Version 1.0
 **/
public abstract class Command {
    protected Barbecuer receiver;

    public Command(Barbecuer receiver) {
        this.receiver = receiver;
    }

    public abstract void executeCommand();
}
