package com.thread.study;
/**
 * 对线程想通的业务逻辑 放到class 中
 * 或者定义两个class implements  runnable  
 * 原理：保证多线程都操作同一份数据，
 * 
 *
 *
 */
public class ThreadPratice2 {
	// 连个线程对j ++ ,两个线程对j--
	private   int  k=5;
	public static void main(String[] args) {
		new ThreadPratice2().testThread2();
		new ThreadPratice2().testThread1();
	}

	
	//  方法一 
	public void testThread1() {
		final ShareVarClass shareVarClass = new ShareVarClass();
		for (int i = 0; i < 2; i++) {
			new Thread(new Runnable() {
				@Override
				public void run() {
					int y = 0;
					while (y < 10) {
						y++;
						shareVarClass.dec();
					}
				}

			}).start();
		}

		for (int i = 0; i < 2; i++) {

			new Thread(new Runnable() {
				@Override
				public void run() {
					int y = 0;
					while (y < 10) {
						y++;
						shareVarClass.indec();
					}
				}

			}).start();
		}

	}

	class ShareVarClass {
		int j = 10;

		// j++
		public synchronized void indec() {
			System.out.println("j++ " + Thread.currentThread().getName() + ++j);
			// return j++ ;
		}

		public synchronized void dec() {
			System.out.println("j--)" + Thread.currentThread().getName() + --j);

			// System.out.println( j--);
			// return j-- ;
		}
	}

	// 方法二
	public void testThread2() {
	for (int i = 0; i < 3; i++) {
		new  Thread( new ThreadDecrease()).start();
	}
		for (int i = 0; i < 3; i++) {
			new  Thread( new ThreadIncrease()).start();
		}

	}
	
	
	
	class ThreadDecrease implements  Runnable  {
		@Override
		public void run() {
			synchronized(ThreadDecrease.class){
		/*		try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}*/
			System.out.println("k-- " + Thread.currentThread().getName() + --k);
			}
		}
		
	}
	
	
	class ThreadIncrease implements  Runnable  {

		@Override
		public void run() {
			synchronized(ThreadIncrease.class){
				System.out.println("k++ " + Thread.currentThread().getName() + ++k);

			}
		}
	}
	
	
	
	
}
