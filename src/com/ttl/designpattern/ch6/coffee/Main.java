package com.ttl.designpattern.ch6.coffee;

/**
 * @ClassName Decorator
 * @Description 装饰器设计模式范例：冲咖啡
 * @Author ttl
 * @Date 2020/6/30 10:21
 * Version 1.0
 **/
public class Main {

    public static void main(String[] args) {

        Coffee coffee = new SimpleCoffee();
        WithMilk withMilk = new WithMilk();
        WithSprinkles withSprinkles = new WithSprinkles();

        withMilk.decorator(coffee);
        withSprinkles.decorator(withMilk);

        System.out.println(withSprinkles.getIngredients() + " cost " + withSprinkles.getCost());
    }
}
