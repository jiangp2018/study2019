package com.thread.study;

/**
 * @Description :使用volatile ，一个线程对其--， 一个线程对其--
 * @Author : jiangpan
 * @Date : 2019/6/13 17:10
 **/
public class volatileNotAtomic2 {
    /**
     * 循环此时
     */
    private final static int count = 10000;
    private static volatile Long num = 0L;

    public static void main (String[] args){
        SubThread thread = new SubThread();
        thread.start();
        for (int i = 0; i< count; i++ ) {
            num++;
            Thread.currentThread().setName("++线程");
            System.out.println("进去++主线程");
        }
       while(thread.isAlive()){

       }

        System.out.println("最后的num的值"+num);
    }



  static class SubThread extends Thread{
        @Override
        public void run() {
            for (int i = 0; i< count; i++ ) {
                num--;
                Thread.currentThread().setName("--线程");
                System.out.println("进去---子线程");
            }
        }
    }
}
