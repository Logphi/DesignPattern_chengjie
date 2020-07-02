package com.ttl.designpattern.ch23;

/**
 * @ClassName Main
 * @Description 命令模式范例
 * @Author ttl
 * @Date 2020/7/2 13:52
 * Version 1.0
 **/
public class Main {
    public static void main(String[] args) {
        Barbecuer barbecuer = new Barbecuer();
        Waiter waiter = new Waiter();

        Command bakeMutton = new BakeMuttonCommand(barbecuer);
        Command bakeChickenWing = new BakeChickenWingCommand(barbecuer);

        waiter.addOrder(bakeMutton);
        waiter.addOrder(bakeChickenWing);
        waiter.notifyExecute();
    }
}
