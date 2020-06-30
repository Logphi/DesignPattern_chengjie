package com.ttl.designpattern.ch6.coffee;

/**
 * @ClassName Coffee
 * @Description 接口：规范了实现类的行为
 * @Author ttl
 * @Date 2020/6/30 10:13
 * Version 1.0
 **/
public interface Coffee {

    /**
     * 价格
     * @return
     */
    double getCost();

    /**
     * 添加的材料
     * @return
     */
    String getIngredients();
}
