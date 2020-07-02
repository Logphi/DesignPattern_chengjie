package com.ttl.designpattern.ch20;

/**
 * @ClassName Iterator
 * @Description TODO
 * @Author ttl
 * @Date 2020/7/2 11:13
 * Version 1.0
 **/
public interface Iterator {
    Object first();
    Object next();
    boolean hasNext();
    Object currentItem();
}
