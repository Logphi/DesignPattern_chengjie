package com.ttl.designpattern.ch26.website;

/**
 * @ClassName ConcreteWebSite
 * @Description TODO
 * @Author ttl
 * @Date 2020/7/2 15:55
 * Version 1.0
 **/
public class ConcreteWebSite implements WebSite {
    private String name = "";

    public ConcreteWebSite(String name) {
        this.name = name;
    }

    @Override
    public void use(User user) {
        System.out.println("网站分类： " + name + "用户：" + user.getName());
    }
}
