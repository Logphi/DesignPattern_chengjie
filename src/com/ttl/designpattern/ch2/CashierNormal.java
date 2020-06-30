package com.ttl.designpattern.ch2;

/**
 * @ClassName CashierNormal
 * @Description 正常收费
 * @Author ttl
 * @Date 2020/6/29 15:10
 * Version 1.0
 **/
public class CashierNormal extends CashierSuper {
    @Override
    double acceptCash(double money) {
        return 0;
    }
}
