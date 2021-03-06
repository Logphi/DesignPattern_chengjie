package com.ttl.designpattern.ch14;

import java.lang.reflect.Method;
/**
 * @ClassName Event
 * @Description TODO
 * @Author ttl
 * @Date 2020/6/30 17:01
 * Version 1.0
 **/
public class Listener {
    private Object object;
    private String methodName;
    private Object[] params;
    private Class[] paramTypes;

    public Listener(Object object, String methodName) {
        this.object = object;
        this.methodName = methodName;
    }

    public void setMessage(String message) {
        this.params = new String[]{message};
        contractParamTypes(params);
    }

    private void contractParamTypes(Object[] params) {
        this.paramTypes = new Class[params.length];
        for (int i = 0; i < params.length; i++) {
            this.paramTypes[i] = params[i].getClass();
        }
    }

    public void invoke() throws Exception {
        Method method = object.getClass().getMethod(this.methodName, this.paramTypes);
        if (method == null) {
            return;
        }
        method.invoke(this.object, this.params);
    }
}
