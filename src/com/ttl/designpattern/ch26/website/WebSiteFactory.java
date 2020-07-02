package com.ttl.designpattern.ch26.website;

import java.util.HashMap;
import java.util.Map;
/**
 * @ClassName WebSiteFactory
 * @Description TODO
 * @Author ttl
 * @Date 2020/7/2 15:56
 * Version 1.0
 **/
public class WebSiteFactory {
    private Map<String, WebSite> webSiteMap = new HashMap<>();

    public WebSite getWebSite(String key) {
        if (!webSiteMap.containsKey(key)) {
            webSiteMap.put(key, new ConcreteWebSite(key));
        }
        return webSiteMap.get(key);
    }

    public int getWebSiteCount() {
        return webSiteMap.size();
    }
}
