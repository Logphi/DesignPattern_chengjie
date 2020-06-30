package com.ttl.designpattern.ch1;

import java.util.Scanner;
/**
 * @ClassName Calculator
 * @Description 简单工厂模式范例：计算器
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
        System.out.println("请输入运算符（+,-,*,/）");
        String operator = scanner.nextLine();
        System.out.println("请输入数字B");
        String strNumberB = scanner.nextLine();

        double numberB = 0;
        // 输入检查
        try {
            numberB = Double.parseDouble(strNumberB);
            if (operator.equals("/") && numberB == 0) {
                throw new RuntimeException("除数不能为0");
            }
        } catch (NumberFormatException e) {
            System.out.println("请输入数字");
            throw new RuntimeException(e);
        }

        // 实例化运算符对应的算子
        BaseOperation operation = OperationFactory.createOperation(operator);
        // 计算得到结果
        double result = operation.getResult(numberA, numberB);

        System.out.println("计算结果为：" + numberA + operator + numberB + "=" + result);
    }
}
