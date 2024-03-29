package com.thread.study;
/*
 * 1：内部类不能直接在 static main 使用 ，或者再class 前面加上 static 
 *:2：线程等待 this.wait ;换起线程 this.notify ; 获取所有线程 this。notifyAll() 
 * 3: 线程公共的属性 放到 类中 
 * 4： 循环线程 50 次，放到 线程 run {  方法里面}
 * 5： 线程中 wait 用 while（condition），因为 jdk 就是这样执行的 ，防止假唤醒
 * 6: 锁的粒度应该尽量最小化 ，增加并发量
 */
public class ThreadPractice {
	// 1： 子线程 循环 10 ，主线程循环100 ，子线程 循环 10 ，主线程循环100 ，循环50次
	// 2:交互执行
	public static void main(String[] args) {
		new ThreadPractice().testThread();
	}

	public void testThread() {
		final Business business = new Business();
		new Thread(new Runnable() {
			@Override
			public void run() {
				//  循环50次
				for (int i = 1; i <= 50; i++) {
					business.subThread(i);
				}
			}
		}).start();
        //  循环50次
		for (int i = 1; i <= 50; i++) {
			business.mainThread(i);
		}
	}

	// 子线程循环 10
	class Business {
	private	Boolean whoRunnable = true;

		public synchronized  void subThread(int i) {
			while (!whoRunnable) {
				try {
					this.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
               //  子线程 循环 10 
				for (int k = 1; k <= 10; k++) {
					System.out.println("我是子线程" + i + "，我循环第一" + k + "次");
				}
	
			whoRunnable = false;
			this.notify();
		}

		public synchronized void mainThread(int i) {
			while (whoRunnable) {
				try {
					this.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			// 主线程循环10
				for (int k = 1; k <= 10; k++) {
					System.out.println("我是主线程" + i + "，我循环第一" + k + "次");
				}
			whoRunnable = true;
			this.notify();
		}
	}

}
