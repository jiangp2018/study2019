package com.jdk8.inteface;

/**
 * @Description :
 * @Author : jiangpan
 * @Date : 2019/7/3 9:52
 **/
public interface DefaultInterface {

    default void setName(){
        System.out.println();
    }

    default  void setName2(){
        System.out.println("name2");
    }
    default void setName3(){
        System.out.println("name3");
    }

    void getName();
}
