package com.jvm.classLoder;

/**
 * @Description :
 * @Author : jiangpan
 * @Date : 2019/4/22 17:20
 **/
public class StaticInit extends SuperStaticInit {

    public static int b = i;
   // public static final int num = 100 ;
    public static int num;

    public static void getName() {
        System.out.println("子类静态方法11111111111111111");
    }

    public void getName2() {
        System.out.println("子类方法11111111111111111");
    }

    public static void main(String[] Args) {
        StaticInit staticInit = new StaticInit();
    /*    getName();
        staticInit.getName2();*/
    }

    static {
        System.out.println("num==="+num);
        System.out.println("子类静态代码块static" + b);
    }

    public StaticInit() {
        System.out.println("子类构造方法num==="+num);
        System.out.println("子类构造方法");
    }
}



/*    public static void main(String[] Args) {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                Thread.currentThread().setName("线程1");
                System.out.println("线程1开始");
            }
        });

        final Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                Thread.currentThread().setName("线程2");
                System.out.println("线程2开始");
            }
            package com.jvm.classLoder;*/

