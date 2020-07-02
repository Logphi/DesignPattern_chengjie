package com.ttl.designpattern.ch20;

/**
 * @ClassName Main
 * @Description 迭代器模式
 * @Author ttl
 * @Date 2020/7/2 11:02
 * Version 1.0
 **/
public class Main {
    public static void main(String[] args) {
        ConcreteAggregate concreteAggregate = new ConcreteAggregate(6, 1, 2, 3, 4, 5, 6);
        Iterator iterator = concreteAggregate.createIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
