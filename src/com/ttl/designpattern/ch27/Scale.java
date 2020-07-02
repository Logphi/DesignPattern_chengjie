package com.ttl.designpattern.ch27;

/**
 * @ClassName Scale
 * @Description TODO
 * @Author ttl
 * @Date 2020/7/2 16:30
 * Version 1.0
 **/
public class Scale extends Expression {
    @Override
    public void execute(String key, double value) {
        String scale = "";
        switch ((int) value) {
            case 1:
                scale = "低音";
                break;
            case 2:
                scale = "中音";
                break;
            case 3:
                scale = "高音";
                break;
        }
        System.out.println(scale);
    }
}
