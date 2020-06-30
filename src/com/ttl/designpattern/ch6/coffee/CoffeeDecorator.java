package com.ttl.designpattern.ch6.coffee;

/**
 * @ClassName CoffeeDecorator
 * @Description TODO
 * @Author ttl
 * @Date 2020/6/30 10:18
 * Version 1.0
 **/
public class CoffeeDecorator implements Coffee {

    private Coffee coffee;

    public void decorator(Coffee simpleCoffee) {
        this.coffee = simpleCoffee;
    }

    @Override
    public double getCost() {
        return coffee.getCost();
    }

    @Override
    public String getIngredients() {
        return coffee.getIngredients();
    }
}
