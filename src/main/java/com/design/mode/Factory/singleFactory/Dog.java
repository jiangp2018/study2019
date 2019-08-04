package com.design.mode.Factory.singleFactory;

/**
 * @Description :
 * @Author : jiangpan
 * @Date : 2019/3/11 10:04
 **/
public class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("我是dog，我想吃骨头");
    }

    @Override
    public void dump() {
        System.out.println("我是dog，我能跳");
    }
}
