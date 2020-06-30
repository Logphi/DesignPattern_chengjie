package com.ttl.designpattern.ch6.person;

/**
 * @ClassName Decorator
 * @Description 装饰器设计模式范例：穿衣服
 * @Author ttl
 * @Date 2020/6/29 16:14
 * Version 1.0
 **/
public class Main {
    public static void main(String[] args) {
        Person person = new Person("哈哈");

        System.out.println("第一种装扮");
        Sneakers sneakers = new Sneakers();
        BigTrouser bigTrouser = new BigTrouser();
        TShirts shirts = new TShirts();

        sneakers.decorate(person);
        bigTrouser.decorate(sneakers);
        shirts.decorate(bigTrouser);
        shirts.show();

        System.out.println();

        System.out.println("第二种装扮");
        LeatherShoes leatherShoes = new LeatherShoes();
        Suit suit = new Suit();
        Tie tie = new Tie();
        leatherShoes.decorate(person);
        suit.decorate(leatherShoes);
        tie.decorate(suit);
        tie.show();
    }
}
