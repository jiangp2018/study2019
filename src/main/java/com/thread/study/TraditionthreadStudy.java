package com.thread.study;

import org.junit.Test;

public class TraditionthreadStudy {
	//创建线程1
	@Test
	public void thread1() {
		Thread thread = new Thread(new Thread() {
			@Override
			public void run() {
			while(true){
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			System.out.println("thread1" + Thread.currentThread().getName());
			}
		}

	});
		thread.run();
		thread.start();
		// System.out.println(Thread.currentThread().getName());

}
	
	
	//创建线程2
	@Test
	public void thread2() {
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				while (true) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("thread2"
							+ Thread.currentThread().getName());
				}
			}
		});
	   thread.start();
	}
	
}
