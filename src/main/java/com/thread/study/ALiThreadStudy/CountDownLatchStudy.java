package com.thread.study.ALiThreadStudy;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/**
 * @Description : ������������ˣ�ϵͳ����
 * @Author : jiangpan
 * @Date : 2019/6/13 22:50
 **/
public class CountDownLatchStudy {
    public static void main(String[] args) {
        CountDownLatch count = new CountDownLatch(2);
        new XiaoJiang(count).writeCode();
        new XiaoWei(count).writeSql();
        try {
            count.await(1, TimeUnit.MILLISECONDS);
            System.out.println("������ɡ�ʱ�䵽��ϵͳ����,count="+count.getCount());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }


    static class XiaoJiang {
        private final CountDownLatch countDownLatch;

        public XiaoJiang(CountDownLatch countDown) {
            this.countDownLatch = countDown;
        }

        public void writeCode() {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i < 10; i++) {
                        Thread.currentThread().setName("xiaojiangThread");
                        System.out.println(Thread.currentThread().getName() + i + "��ִ������" + "count" + countDownLatch.getCount());
                    }
                    System.out.println(Thread.currentThread().getName() + "�������"+countDownLatch.getCount());
                    countDownLatch.countDown();
                }

            }).start();
            System.out.println(Thread.currentThread().getName() + "======");


        }

    }


    static class XiaoWei {
        private final CountDownLatch countDownLatch;

        public XiaoWei(CountDownLatch countDown) {
            this.countDownLatch = countDown;
        }

        public void writeSql() {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i < 100; i++) {
                        Thread.currentThread().setName("XiaoWeiThread");
                        System.out.println(Thread.currentThread().getName() + i + "��ִ������" + "count" + countDownLatch.getCount());
                    }
                    System.out.println(Thread.currentThread().getName() + "�������"+countDownLatch.getCount());
                    countDownLatch.countDown();
                }

            }).start();
            System.out.println(Thread.currentThread().getName() + "======");


        }

    }
}
