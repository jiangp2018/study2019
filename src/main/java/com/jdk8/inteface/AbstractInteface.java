package com.jdk8.inteface;

/**
 * @Description :FunctionalInterface : 只有一个抽象类，大于1会报错
 * @Author : jiangpan
 * @Date : 2019/7/3 10:16
 **/
@FunctionalInterface
public interface AbstractInteface<F,T> {

    T convert(F from);

    default void  getInfo2(){

    };


}
