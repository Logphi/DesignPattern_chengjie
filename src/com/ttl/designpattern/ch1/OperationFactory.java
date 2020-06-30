package com.ttl.designpattern.ch1;

/**
 * @ClassName Operation
 * @Description 计算器类
 * @Author ttl
 * @Date 2020/6/29 11:10
 * Version 1.0
 **/
public class OperationFactory {

    public static BaseOperation createOperation(String operator) {
        BaseOperation operation = null;
        // 根据输入运算符号，实例化算子
        switch (operator) {
            case "+":
                operation = new AddOperation();
                break;
            case "-":
                operation = new MinusOperation();
                break;
            case "*":
                operation = new MultiplyOperation();
                break;
            case "/":
                operation = new DivideOperation();
                break;
        }
        return operation;
    }
}
