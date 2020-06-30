package com.ttl.designpattern.ch6.coffee;

/**
 * @ClassName SimpleCoffee
 * @Description 基类：实现接口最基本的功能
 * @Author ttl
 * @Date 2020/6/30 10:15
 * Version 1.0
 **/
public class SimpleCoffee implements Coffee {
    @Override
    public double getCost() {
        return 20.0;
    }

    @Override
    public String getIngredients() {
        return "Coffee";
    }
}
