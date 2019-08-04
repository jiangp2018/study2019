package com.jdk8.inteface.Impl;

import com.jdk8.inteface.DefaultInterface;

/**
 * @Description :jdk8 接口默认实现
 * @Author : jiangpan
 * @Date : 2019/7/3 9:57
 **/
public class DefaultIntefaceImpl implements DefaultInterface {


    @Override
    public void getName() {

    }

    public static void main(String[] args) {
        DefaultInterface de = new DefaultInterface() {
            @Override
            public void getName() {

            }
        };

        de.setName3();

        DefaultIntefaceImpl imp = new DefaultIntefaceImpl();
        imp.setName2();
    }

}
