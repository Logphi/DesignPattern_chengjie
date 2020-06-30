package com.ttl.designpattern.ch2;

/**
 * @ClassName CashRebate
 * @Description 打折收费
 * @Author ttl
 * @Date 2020/6/29 15:11
 * Version 1.0
 **/
public class CashRebate extends CashierSuper {

    private double moneyRebate;

    public CashRebate(double moneyRebate) {
        this.moneyRebate = moneyRebate;
    }

    @Override
    double acceptCash(double money) {
        return money * moneyRebate;
    }
}
