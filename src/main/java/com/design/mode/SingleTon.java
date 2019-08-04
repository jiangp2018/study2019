package com.design.mode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description :
 * @Author : jiangpan
 * @Date : 2019/3/7 17:34
 **/
public class SingleTon {
//懒汉式写法
/*  private static SingleTon singleTon;
    private SingleTon(){}

    public static synchronized SingleTon getSingleTon(){
        if (singleTon == null) {
            singleTon = new SingleTon();
        }
        return singleTon;
    }*/

    /**
     * 饿汉式
     **/
/*    private static SingleTon singleTon = new SingleTon();

    private SingleTon() {};

    public static synchronized SingleTon getSingleTon(){
        return singleTon;
    }*/

   /** 静态内部类方式创建 **/
   // 静态内部类，创建对象，静态代码块{做一些初始化的工作}
/*   static HashMap<String, String> map = new HashMap<>();
   static {
       map.put("124", "345");
   }
   private SingleTon() { }

    private static class SingleTon2 {
        private static final SingleTon singleTon = new SingleTon();
    }

    public static SingleTon getSingleTon() {
        return SingleTon2.singleTon;
    }*/
   /***双重检查***/
   // 防止 jvm 指令优化
   private volatile static SingleTon singleTon;
   private SingleTon(){}

    public static SingleTon getSingleTon() {
        List<String> list = new ArrayList();

        if (singleTon == null) {
            synchronized (SingleTon.class) {
                if (singleTon == null) {
                    singleTon = new SingleTon();
                }
            }
        }
        return singleTon;
    }


}
