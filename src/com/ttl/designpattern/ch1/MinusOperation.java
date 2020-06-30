package com.ttl.designpattern.ch1;

/**
 * @ClassName MinusOperation
 * @Description TODO
 * @Author ttl
 * @Date 2020/6/29 11:33
 * Version 1.0
 **/
public class MinusOperation extends BaseOperation {
    @Override
    double getResult(double numberA, double numberB) {
        return numberA - numberB;
    }
}
