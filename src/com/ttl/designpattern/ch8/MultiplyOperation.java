package com.ttl.designpattern.ch8;

/**
 * @ClassName MultiplyOperation
 * @Description TODO
 * @Author ttl
 * @Date 2020/6/29 11:34
 * Version 1.0
 **/
public class MultiplyOperation extends BaseOperation {
    @Override
    double getResult(double numberA, double numberB) {
        return numberA * numberB;
    }
}
