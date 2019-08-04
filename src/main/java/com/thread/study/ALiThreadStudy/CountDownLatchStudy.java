package com.thread.study.ALiThreadStudy;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/**
 * @Description : 三个任务都完成了，系统上线
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
            System.out.println("任务完成、时间到，系统上线,count="+count.getCount());
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
                        System.out.println(Thread.currentThread().getName() + i + "个执行任务" + "count" + countDownLatch.getCount());
                    }
                    System.out.println(Thread.currentThread().getName() + "完成任务"+countDownLatch.getCount());
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
                        System.out.println(Thread.currentThread().getName() + i + "个执行任务" + "count" + countDownLatch.getCount());
                    }
                    System.out.println(Thread.currentThread().getName() + "完成任务"+countDownLatch.getCount());
                    countDownLatch.countDown();
                }

            }).start();
            System.out.println(Thread.currentThread().getName() + "======");


        }

    }
}
