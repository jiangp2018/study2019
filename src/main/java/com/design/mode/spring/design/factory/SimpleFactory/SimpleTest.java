package com.design.mode.spring.design.factory.SimpleFactory;

/**
 * @Description :
 * @Author : jiangpan
 * @Date : 2019/7/22 21:48
 **/
public class SimpleTest {
    public static void main (String[] args){
        System.out.println(new SimpleFactory().getInstanct("DerDe"));
    }
}
