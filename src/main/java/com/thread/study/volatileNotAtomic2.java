package com.thread.study;

/**
 * @Description :ʹ��volatile ��һ���̶߳���--�� һ���̶߳���--
 * @Author : jiangpan
 * @Date : 2019/6/13 17:10
 **/
public class volatileNotAtomic2 {
    /**
     * ѭ����ʱ
     */
    private final static int count = 10000;
    private static volatile Long num = 0L;

    public static void main (String[] args){
        SubThread thread = new SubThread();
        thread.start();
        for (int i = 0; i< count; i++ ) {
            num++;
            Thread.currentThread().setName("++�߳�");
            System.out.println("��ȥ++���߳�");
        }
       while(thread.isAlive()){

       }

        System.out.println("����num��ֵ"+num);
    }



  static class SubThread extends Thread{
        @Override
        public void run() {
            for (int i = 0; i< count; i++ ) {
                num--;
                Thread.currentThread().setName("--�߳�");
                System.out.println("��ȥ---���߳�");
            }
        }
    }
}
