package com.ttl.designpattern.ch26.website;

/**
 * @ClassName Main
 * @Description 享元模式范例：使用外部状态
 * @Author ttl
 * @Date 2020/7/2 15:59
 * Version 1.0
 **/
public class Main {
    public static void main(String[] args) {
        WebSiteFactory factory = new WebSiteFactory();
        WebSite fx = factory.getWebSite("产品展示");
        fx.use(new User("嘻嘻"));
        WebSite fy = factory.getWebSite("产品展示");
        fy.use(new User("哈哈"));
        WebSite fz = factory.getWebSite("产品展示");
        fz.use(new User("呵呵"));
        WebSite fl = factory.getWebSite("博客");
        fl.use(new User("啊啊"));
        WebSite fm = factory.getWebSite("博客");
        fm.use(new User("呦呦"));
        WebSite fn = factory.getWebSite("博客");
        fn.use(new User("噢噢"));

        System.out.println("网站总数: " + factory.getWebSiteCount());
    }
}
