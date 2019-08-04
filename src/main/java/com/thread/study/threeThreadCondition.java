package com.thread.study;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
 * 1：内部类不能直接在 static main 使用 ，或者再class 前面加上 static 
 *:2：线程等待 this.wait ;换起线程 this.notify ; 获取所有线程 this。notifyAll() 
 * 3: 线程公共的属性 放到 类中 
 * 4： 循环线程 50 次，放到 线程 run {  方法里面}
 * 5： 线程中 wait 用 while（condition），因为 jdk 就是这样执行的 ，防止假唤醒
 * 6: 锁的粒度应该尽量最小化 ，增加并发量
 */
public class threeThreadCondition {
	// 1： 子线程 循环 10 ，主线程循环100 ，子线程 循环 10 ，主线程循环100 ，循环50次
	// 2:交互执行
	public static void main(String[] args) {
		final Business business = new Business();
		 ExecutorService executorService = Executors.newCachedThreadPool();
		
		//executorService.submit(new Runnable() {

		 new Thread((new Runnable() {
			@Override
			public void run() {
				//  循环50次
				for (int i = 1; i <= 5; i++) {
					business.subThread(i);
					//Thread.currentThread().setName("子线程"+i);
				}
			}
		})).start();
	

		//executorService.submit(new Runnable(){
		new Thread((new Runnable(){
			@Override
			public void run() {
				//  循环50次
				for (int i = 1; i <= 5; i++) {
					business.meddionThread(i);
					//Thread.currentThread().setName("中线程"+i);
				}
			}
		})).start();
		
		 //  循环50次
		for (int i = 1; i <= 5; i++) {
			//Thread.currentThread().setName("主线程"+i);
			business.mainThread(i);
		}
		
       
	}

	// 子线程循环 10
	 static class Business {
		 Lock reentrantLock =new  ReentrantLock();
		Condition  condition1  = reentrantLock.newCondition();
		Condition  condition2  = reentrantLock.newCondition();
		Condition  condition3  = reentrantLock.newCondition();
	    private int	 count = 0;
		public  void subThread(int i) {
			reentrantLock.lock();
			while (count!=0) {
				try {
					condition1.await();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
               //  子线程 循环 10 
			try {
				for (int k = 1; k <= 1; k++) {
					System.out.println( Thread.currentThread().getName() + i+"，子线程我循环第一" + k + "次");
				}
				count = 1;
			condition2.signal();
			} catch (Exception e) {
				reentrantLock.unlock();
  			}	
		}

		
	public  void meddionThread(int i) {
			reentrantLock.lock();
			while (count!=1) {
				try {
					condition2.await();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			try {
				for (int k = 1; k <= 1; k++) {
					System.out.println(Thread.currentThread().getName()+ i+"中线程我循环第一" + k + "次");
				}
				count=2;
			    condition3.signal();
			} catch (Exception e) {
				reentrantLock.unlock();
			}
			// 主线程循环10
				
		}
	

	public void mainThread(int i) {
		reentrantLock.lock();
		while (count != 2) {
			try {
				condition3.await();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		try {
			for (int k = 1; k <= 1; k++) {
				System.out.println(Thread.currentThread().getName() + i+"我循环第一" + k + "次");
			}
			count = 0;
			condition1.signal();
		} catch (Exception e) {
			reentrantLock.unlock();
		}
		// 主线程循环10

	}
		
	}

}
