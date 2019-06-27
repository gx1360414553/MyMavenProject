package com.gx.test.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ProxyTest implements InvocationHandler {

    private Object obj;

    public ProxyTest(Object obj) {
        this.obj = obj;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("我是代理....");
        Object invoke = method.invoke(obj, args);
        System.out.println("代理结束....");
        return invoke;
    }
}
