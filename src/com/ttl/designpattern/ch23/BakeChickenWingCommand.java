package com.ttl.designpattern.ch23;

/**
 * @ClassName BakeChickenWingCommand
 * @Description TODO
 * @Author ttl
 * @Date 2020/7/2 14:10
 * Version 1.0
 **/
public class BakeChickenWingCommand extends Command {

    public BakeChickenWingCommand(Barbecuer receiver) {
        super(receiver);
    }

    @Override
    public void executeCommand() {
        receiver.bakeChickenWing();
    }
}
