package com.ttl.designpattern.ch10;

/**
 * @ClassName TestPaper
 * @Description TODO
 * @Author ttl
 * @Date 2020/6/30 14:51
 * Version 1.0
 **/
public abstract class TestPaper {

    public void testQuestion1() {
        System.out.println("试题一 : " + answer1());
    }

    public void testQuestion2() {
        System.out.println("试题二 : " + answer2());
    }

    public void testQuestion3() {
        System.out.println("试题三 : " + answer3());
    }

    protected abstract String answer1();

    protected abstract String answer2();

    protected abstract String answer3();
}
