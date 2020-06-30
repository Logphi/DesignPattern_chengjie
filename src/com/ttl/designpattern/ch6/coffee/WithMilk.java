package com.ttl.designpattern.ch6.coffee;

/**
 * @ClassName WithMilk
 * @Description TODO
 * @Author ttl
 * @Date 2020/6/30 10:19
 * Version 1.0
 **/
public class WithMilk extends CoffeeDecorator {

    @Override
    public double getCost() {
        return super.getCost() + 11;
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + " with milk";
    }
}
