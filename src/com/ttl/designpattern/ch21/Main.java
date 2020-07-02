package com.ttl.designpattern.ch21;

/**
 * @ClassName Main
 * @Description 单例模式范例
 * @Author ttl
 * @Date 2020/7/2 11:41
 * Version 1.0
 **/
public class Main {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        System.out.println(instance);
    }
}
