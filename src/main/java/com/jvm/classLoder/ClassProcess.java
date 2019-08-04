package com.jvm.classLoder;

/**
 * @Description : 测试类初始化的时机
 * 测试类初始化的时机 ： ①new、静态变量(不带final的静态变量)、静态方法
 * ②：反射、当一个的父类没有初始化的时候，先加载父类；
 * ③：虚拟机启动时，加载主类（main）所在的类
 * 4：invokeMethodsHandle 时
 * @Author : jiangpan
 * @Date : 2019/4/21 17:16
 **/
public class ClassProcess {


    public static void getClassProcess () {
        System.out.println("00我是classProcess的静态方法方法");
    }

    static {
        System.out.println("11我是classProcess的静态静态代码块");
    }

    public static final String process = "test";

    public static String noProcess = "test";


    public ClassProcess () {
        System.out.println("22我是classProcess的构造方法");

    }



}
