package com.design.mode.Factory.singleFactory;

/**
 * @Description :
 * @Author : jiangpan
 * @Date : 2019/3/11 10:03
 **/
public class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("我是喵，我想吃鱼");
    }

    @Override
    public void dump() {
        System.out.println("我是猫，我喜欢跳");
    }
}
