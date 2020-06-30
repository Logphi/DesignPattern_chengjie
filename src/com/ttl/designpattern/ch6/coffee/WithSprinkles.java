package com.ttl.designpattern.ch6.coffee;

/**
 * @ClassName WithSprinkles
 * @Description TODO
 * @Author ttl
 * @Date 2020/6/30 10:23
 * Version 1.0
 **/
public class WithSprinkles extends CoffeeDecorator {

    @Override
    public double getCost() {
        return super.getCost() + 20;
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + " with sprinkles";
    }
}
