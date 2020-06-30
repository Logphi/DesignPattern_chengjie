package com.ttl.designpattern.ch8;

/**
 * @ClassName AddOperation
 * @Description TODO
 * @Author ttl
 * @Date 2020/6/29 11:32
 * Version 1.0
 **/
public class AddOperation extends BaseOperation {
    @Override
    double getResult(double numberA, double numberB) {
        return numberA + numberB;
    }
}
