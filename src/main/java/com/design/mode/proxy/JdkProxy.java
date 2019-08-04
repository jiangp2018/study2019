package com.design.mode.proxy;

/**
 * @Description : jdk 代理基于接口进行查询
 * @Author : jiangpan
 * @Date : 2019/7/30 18:56
 **/

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 租房的列子 中介帮找房子
 */

public class JdkProxy implements InvocationHandler  {
    private ProxyObject proxyObject;

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("=======jdk代理开始了====");
        method.invoke(proxyObject, args);
        System.out.println("====jdk代理结束了====");
        return null;
    }


    public Object getInstance(Object target) {
        this.proxyObject = (ProxyObject)target;
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), proxyObject.getClass().getInterfaces(), this);
    }
}
