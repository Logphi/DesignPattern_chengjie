package com.ttl.designpattern.ch23;

import java.util.ArrayList;
import java.util.List;
/**
 * @ClassName Waiter
 * @Description TODO
 * @Author ttl
 * @Date 2020/7/2 14:10
 * Version 1.0
 **/
public class Waiter {
    private List<Command> orders = new ArrayList<>();

    public void addOrder(Command command) {
        orders.add(command);
    }

    public void removeOrder(Command command) {
        orders.remove(command);
    }

    public void notifyExecute() {
        for (Command order : orders) {
            order.executeCommand();
        }
    }
}
