package com.ttl.designpattern.ch26;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName FlyweightFactory
 * @Description TODO
 * @Author ttl
 * @Date 2020/7/2 15:44
 * Version 1.0
 **/
public class FlyweightFactory {
    private Map<String, Flyweight> flyweightMap = new HashMap<>();

    public FlyweightFactory() {
        flyweightMap.put("x", new ConcreteFlyweight());
        flyweightMap.put("y", new ConcreteFlyweight());
        flyweightMap.put("z", new ConcreteFlyweight());
    }

    public Flyweight getFlyweight(String key) {
        return flyweightMap.get(key);
    }
}
