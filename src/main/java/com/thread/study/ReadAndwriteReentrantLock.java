package com.thread.study;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadAndwriteReentrantLock {
	// 锟斤拷写锟斤拷
	public static void main(String[] args) {
	 new ReadAndwriteReentrantLock().ReentrankReadWriteTest();

	}

	public  void ReentrankReadWriteTest() {
		ExecutorService executorService = Executors.newFixedThreadPool(3);

		 final ShareData shareData = new  ShareData();
		for (int i = 0; i < 3; i++) {
			executorService.submit(new Runnable() {
				// 锟斤拷锟斤拷锟�
				@Override
				public void run() {
					while (true) {
						// System.out.println("readDate"+Thread.currentThread().getName()
						// );
						shareData.readDate();
					}
				}

			});
			executorService.execute(new Runnable() {
				// 写锟斤拷锟�
				@Override
				public void run() {
					while (true) {
						// System.out.println("writeDate"+Thread.currentThread().getName()
						// );
						shareData.writeDate(new Random().nextInt(100));
					}
				}

			});
		}
	
	}

	class ShareData {
		private  int data ;
	    ReadWriteLock rwl = new ReentrantReadWriteLock();

		public void readDate() {
			rwl.readLock().lock();
			try {
//				System.out.println("准锟斤拷锟斤拷锟斤拷锟�);
//				System.out.println("锟斤拷锟斤拷锟斤拷锟斤拷"+Thread.currentThread().getName() +data);
				Thread.sleep((long)(Math.random()*1000));
			} catch (Exception e) {
               e.printStackTrace();
			} finally {
				rwl.readLock().unlock();
			}
		}

		public void writeDate(int data) {
			rwl.writeLock().lock();
			try {
				//System.out.println("准锟斤拷写锟斤拷锟�);
				this.data=data;
			//	System.out.println("写锟斤拷锟斤拷锟� +Thread.currentThread().getName() + data);
				Thread.sleep((long)(Math.random()*1000));
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				rwl.writeLock().unlock();
			}
		}
	}
}
