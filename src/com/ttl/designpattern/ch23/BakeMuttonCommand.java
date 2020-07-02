package com.ttl.designpattern.ch23;

/**
 * @ClassName BakeMuttonCommand
 * @Description TODO
 * @Author ttl
 * @Date 2020/7/2 14:09
 * Version 1.0
 **/
public class BakeMuttonCommand extends Command {

    public BakeMuttonCommand(Barbecuer receiver) {
        super(receiver);
    }

    @Override
    public void executeCommand() {
        receiver.bakeMutton();
    }
}
