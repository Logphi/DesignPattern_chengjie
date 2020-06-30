package com.ttl.designpattern.ch2;

/**
 * @ClassName CashReturn
 * @Description 返利
 * @Author ttl
 * @Date 2020/6/29 15:13
 * Version 1.0
 **/
public class CashReturn extends CashierSuper{

    private double moneyCondition;
    private double moneyReturn;

    public CashReturn(double moneyCondition, double moneyReturn) {
        this.moneyCondition = moneyCondition;
        this.moneyReturn = moneyReturn;
    }

    @Override
    double acceptCash(double money) {
        if (money >= moneyCondition) {
            return money - ((int)(money / moneyCondition)) * moneyReturn;
        }

        return money;
    }
}
