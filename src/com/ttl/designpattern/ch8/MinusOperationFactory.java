package com.ttl.designpattern.ch8;

/**
 * @ClassName MinusOperationFactory
 * @Description TODO
 * @Author ttl
 * @Date 2020/6/30 11:44
 * Version 1.0
 **/
public class MinusOperationFactory implements OperationFactory {
    @Override
    public BaseOperation createOperation() {
        return new MinusOperation();
    }
}
