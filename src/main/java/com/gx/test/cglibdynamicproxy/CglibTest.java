package com.gx.test.cglibdynamicproxy;

import com.gx.test.dynamicproxy.Hose;
import com.gx.test.dynamicproxy.Xiaoming;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibTest implements MethodInterceptor {

    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("我是房产中介");
        Object invokeSuper = methodProxy.invokeSuper(o, objects);
        System.out.println("房产中介代理结束..");
        return invokeSuper;
    }

    public static void main(String[] args) {
        CglibTest cglibTest = new CglibTest();
        //动态代理使用asm框架生成代理
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Xiaoming.class);
        enhancer.setCallback(cglibTest);
        Hose hose = (Hose) enhancer.create();
        hose.buy();
    }
}
