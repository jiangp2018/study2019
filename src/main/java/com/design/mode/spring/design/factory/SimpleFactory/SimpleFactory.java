package com.design.mode.spring.design.factory.SimpleFactory;

/**
 * @Description :电脑工厂 ,
 * 简单工厂的坏处，破坏设计模式的开闭原则
 * 对拓展开放，对修改关闭
 * @Author : jiangpan
 * @Date : 2019/7/22 21:45
 **/
public class SimpleFactory {

    public Object getInstanct(String name) {
        if ("DerDe".equals(name)) {
            return new DerDe();
        } else if ("Lenov".equals(name)) {
            return new Lenov();
        }
        return null;
    }
}
