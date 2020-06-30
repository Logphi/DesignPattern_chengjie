package com.ttl.designpattern.ch8;

/**
 * @ClassName DivideOperationFactory
 * @Description TODO
 * @Author ttl
 * @Date 2020/6/30 11:43
 * Version 1.0
 **/
public class DivideOperationFactory implements OperationFactory{
    @Override
    public BaseOperation createOperation() {
        return new DivideOperation();
    }
}
