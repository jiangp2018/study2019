package com.jvm.classLoder;

/**
 * @Description :
 * @Author : jiangpan
 * @Date : 2019/4/22 17:20
 **/
public class SuperStaticInit {

    public static int i = 0;
    static {
        System.out.println("父类静态代码块");
         i = 2 ;
        System.out.println(i);
    }

    public static void getName3() {
        System.out.println("父类静态方法11111111111111111");
    }

}
