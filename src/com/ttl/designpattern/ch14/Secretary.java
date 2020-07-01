package com.ttl.designpattern.ch14;

/**
 * @ClassName Secretary
 * @Description TODO
 * @Author ttl
 * @Date 2020/6/30 16:11
 * Version 1.0
 **/
public class Secretary implements Subject {
    private ListenerHandler handler;

    public Secretary() {
        handler = new ListenerHandler();
    }

    /**
     * 添加监听
     * @param listener
     */
    public void addListener(Listener listener) {
        handler.addListener(listener);
    }

    @Override
    public void notifyListener() {
        try {
            handler.notifyListener();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
