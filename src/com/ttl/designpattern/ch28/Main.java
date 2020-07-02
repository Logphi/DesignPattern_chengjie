package com.ttl.designpattern.ch28;

/**
 * @ClassName Main
 * @Description 访问者模式范例
 * @Author ttl
 * @Date 2020/7/2 16:42
 * Version 1.0
 **/
public class Main {
    public static void main(String[] args) {
        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.attach(new Man());
        objectStructure.attach(new Women());

        // 成功
        Success success = new Success();
        objectStructure.display(success);

        // 失败
        Failing failing = new Failing();
        objectStructure.display(failing);

        // 恋爱
        Amativeness amativeness = new Amativeness();
        objectStructure.display(amativeness);
    }
}
