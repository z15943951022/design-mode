package com.design.cn.prxoy.jdkProxy;

import java.lang.reflect.Proxy;

public class ProxyFactory {


    public static Object getProxyInstance(Object target){
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(),
                (proxy, method, args) -> {
                    System.out.println("方法执行前");
                    Object invoke = method.invoke(target, args);
                    System.out.println("方法执行后");
                    return invoke;
                });
    }
}
