package com.ttl.designpattern.ch8;

/**
 * @ClassName BaseOperation
 * @Description 计算器基类
 * @Author ttl
 * @Date 2020/6/29 11:17
 * Version 1.0
 **/
public abstract class BaseOperation {
    /**
     * 获得计算结果
     * @param numberA
     * @param numberB
     * @return
     */
    abstract double getResult(double numberA, double numberB);
}
