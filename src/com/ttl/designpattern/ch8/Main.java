package com.ttl.designpattern.ch8;

import java.util.Scanner;
/**
 * @ClassName Calculator
 * @Description 工厂方法模式范例：计算器
 * @Author ttl
 * @Date 2020/6/29 10:43
 * Version 1.0
 **/
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入数字A");
        String strNumberA = scanner.nextLine();
        double numberA = 0;
        // 输入检查
        try {
            numberA = Double.parseDouble(strNumberA);
        } catch (NumberFormatException e) {
            System.out.println("请输入数字");
            throw new RuntimeException(e);
        }
        System.out.println("请输入数字B");
        String strNumberB = scanner.nextLine();

        double numberB = 0;
        // 输入检查
        try {
            numberB = Double.parseDouble(strNumberB);
        } catch (NumberFormatException e) {
            System.out.println("请输入数字");
            throw new RuntimeException(e);
        }

        // 实例化运算符对应的算子
        OperationFactory addOperationFactory = new AddOperationFactory();
        BaseOperation operation = addOperationFactory.createOperation();
        // 计算得到结果
        double result = operation.getResult(numberA, numberB);

        System.out.println("计算结果为：" + numberA + " + " + numberB + " = " + result);
    }
}
