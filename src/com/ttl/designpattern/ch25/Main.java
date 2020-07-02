package com.ttl.designpattern.ch25;

/**
 * @ClassName Main
 * @Description 中介者模式
 * @Author ttl
 * @Date 2020/7/2 14:48
 * Version 1.0
 **/
public class Main {
    public static void main(String[] args) {
        UnitedNationsSecurityCouncil unsc = new UnitedNationsSecurityCouncil();
        USA usa = new USA(unsc);
        Iraq iraq = new Iraq(unsc);

        unsc.setIraq(iraq);
        unsc.setUsa(usa);

        usa.declare("不准研制核武器，否则发动战争");
        iraq.declare("不怕");
    }
}
