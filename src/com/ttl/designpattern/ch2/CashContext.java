package com.ttl.designpattern.ch2;

/**
 * @ClassName CashContext
 * @Description TODO
 * @Author ttl
 * @Date 2020/6/29 15:35
 * Version 1.0
 **/
public class CashContext {
    private CashierSuper cashier;

    public CashContext(String type) {
        switch (type) {
            case "正常收费":
                cashier = new CashierNormal();
                break;
            case "满300返100":
                cashier = new CashReturn(300, 100);
                break;
            case "打八折":
                cashier = new CashRebate(0.8);
                break;
        }
    }

    public double getResult(double money) {
        return cashier.acceptCash(money);
    }
}
