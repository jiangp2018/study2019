package com.design.mode.spring.design.AbstractFactory;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @Description : 抽象工厂的不足，需要建立多个工厂；
 * 还得配置工厂的实现
 * @Author : jiangpan
 * @Date : 2019/7/22 21:48
 **/
public class SimpleTest {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        DefaultFactory defaultFactory = new DefaultFactory();

        try {
            Method method = defaultFactory.getClass().getDeclaredMethod("getDerDeName");
            Object object = method .invoke(defaultFactory);
            System.out.println(object);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

    }
}
