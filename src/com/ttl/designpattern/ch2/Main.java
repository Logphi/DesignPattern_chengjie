package com.ttl.designpattern.ch2;

import java.util.Scanner;
/**
 * @ClassName Cashier
 * @Description 策略模式范例：收银示例
 * @Author ttl
 * @Date 2020/6/29 14:43
 * Version 1.0
 **/
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 0;
        System.out.println("请输入优惠方式：");
        String type = scanner.nextLine();
        CashContext context = new CashContext(type);
        while (true) {
            System.out.println("输入单价：");
            double price = scanner.nextDouble();
            System.out.println("输入数量：");
            int count = scanner.nextInt();
            total += price * count;
            System.out.println("总价：" + context.getResult(total));
        }
    }
}
