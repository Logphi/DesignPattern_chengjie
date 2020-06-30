package com.ttl.designpattern.ch8;

/**
 * @ClassName AddOperationFactory
 * @Description TODO
 * @Author ttl
 * @Date 2020/6/30 11:42
 * Version 1.0
 **/
public class AddOperationFactory implements OperationFactory {
    @Override
    public BaseOperation createOperation() {
        return new AddOperation();
    }
}
