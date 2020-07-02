package com.ttl.designpattern.ch18;

/**
 * @ClassName RoleStateCaretaker
 * @Description TODO
 * @Author ttl
 * @Date 2020/7/2 10:05
 * Version 1.0
 **/
public class RoleStateCaretaker {
    private RoleStateMemento roleStateMemento;

    public RoleStateMemento getRoleStateMemento() {
        return roleStateMemento;
    }

    public void setRoleStateMemento(RoleStateMemento roleStateMemento) {
        this.roleStateMemento = roleStateMemento;
    }
}
