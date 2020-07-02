package com.ttl.designpattern.ch21;

/**
 * @ClassName Singleton
 * @Description TODO
 * @Author ttl
 * @Date 2020/7/2 11:42
 * Version 1.0
 **/
public class Singleton {
    private static Singleton instance;
    private final static Object syncLock = new Object();

    private Singleton() {}

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (syncLock) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }

        return instance;
    }
}
