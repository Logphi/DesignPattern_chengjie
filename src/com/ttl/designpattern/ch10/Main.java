package com.ttl.designpattern.ch10;

/**
 * @ClassName Main
 * @Description 模板方法设计模式
 * @Author ttl
 * @Date 2020/6/30 14:56
 * Version 1.0
 **/
public class Main {

    public static void main(String[] args) {
        TestPaper testPaperA = new TestPaperA();
        TestPaper testPaperB = new TestPaperB();

        testPaperA.testQuestion1();
        testPaperA.testQuestion2();
        testPaperA.testQuestion3();

        System.out.println("--------------------------");

        testPaperB.testQuestion1();
        testPaperB.testQuestion2();
        testPaperB.testQuestion3();
    }
}
