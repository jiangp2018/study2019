package com.design.mode.proxy;

/**
 * @Description :
 * @Author : jiangpan
 * @Date : 2019/7/30 20:10
 **/
public class JDKProxyTest {
    public static void main (String[] args){
        JdkProxy jdkProxy = new JdkProxy();
        ProxyObject proxyObject = new ProxyObject();
        FindHouseService findHouseService = (FindHouseService)jdkProxy.getInstance(proxyObject);

        findHouseService.findHouse(proxyObject);

    }

}
