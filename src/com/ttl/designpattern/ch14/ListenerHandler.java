package com.ttl.designpattern.ch14;

import java.util.ArrayList;
import java.util.List;
/**
 * @ClassName EventHandler
 * @Description
 * @Author ttl
 * @Date 2020/7/1 9:14
 * Version 1.0
 **/
public class ListenerHandler {
    private List<Listener> listeners;

    public ListenerHandler() {
        listeners = new ArrayList<>();
    }

    public void addListener(Listener listener) {
        listeners.add(listener);
    }

    public void notifyListener() throws Exception {
        for (Listener listener : listeners) {
            listener.invoke();
        }
    }
}
