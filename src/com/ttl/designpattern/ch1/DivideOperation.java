package com.ttl.designpattern.ch1;

/**
 * @ClassName DivideOperation
 * @Description TODO
 * @Author ttl
 * @Date 2020/6/29 11:35
 * Version 1.0
 **/
public class DivideOperation extends BaseOperation {
    @Override
    double getResult(double numberA, double numberB) {
        return numberA / numberB;
    }
}
