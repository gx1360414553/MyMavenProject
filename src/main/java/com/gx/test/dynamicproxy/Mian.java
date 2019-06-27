package com.gx.test.dynamicproxy;

import java.lang.reflect.Proxy;

public class Mian {
    public static void main(String[] args) {

        Xiaoming xiaoming = new Xiaoming();
        ProxyTest proxy = new ProxyTest(xiaoming);

        Hose proxyClass = (Hose) Proxy.newProxyInstance(xiaoming.getClass().getClassLoader(), xiaoming.getClass().getInterfaces(), proxy);
        proxyClass.buy();

    }
}
