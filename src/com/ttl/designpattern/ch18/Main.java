package com.ttl.designpattern.ch18;

/**
 * @ClassName Main
 * @Description 备忘录模式范例
 * @Author ttl
 * @Date 2020/7/1 16:20
 * Version 1.0
 **/
public class Main {

    public static void main(String[] args) {
        // 战斗准备
        GameRole gameRole = new GameRole();
        gameRole.init();
        System.out.println("战斗准备......");
        System.out.println(gameRole);

        // 保存进度
        RoleStateCaretaker caretaker = new RoleStateCaretaker();
        RoleStateMemento memento = gameRole.saveState();
        caretaker.setRoleStateMemento(memento);
        System.out.println("保存进度......");

        // 开始战斗
        gameRole.fight();
        System.out.println("开始战斗......");
        System.out.println(gameRole);

        // 恢复
        gameRole.recoveryState(caretaker.getRoleStateMemento());
        System.out.println("恢复......");
        System.out.println(gameRole);
    }
}
