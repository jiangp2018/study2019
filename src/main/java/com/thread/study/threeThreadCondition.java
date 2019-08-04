package com.thread.study;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
 * 1���ڲ��಻��ֱ���� static main ʹ�� ��������class ǰ����� static 
 *:2���̵߳ȴ� this.wait ;�����߳� this.notify ; ��ȡ�����߳� this��notifyAll() 
 * 3: �̹߳��������� �ŵ� ���� 
 * 4�� ѭ���߳� 50 �Σ��ŵ� �߳� run {  ��������}
 * 5�� �߳��� wait �� while��condition������Ϊ jdk ��������ִ�е� ����ֹ�ٻ���
 * 6: ��������Ӧ�þ�����С�� �����Ӳ�����
 */
public class threeThreadCondition {
	// 1�� ���߳� ѭ�� 10 �����߳�ѭ��100 �����߳� ѭ�� 10 �����߳�ѭ��100 ��ѭ��50��
	// 2:����ִ��
	public static void main(String[] args) {
		final Business business = new Business();
		 ExecutorService executorService = Executors.newCachedThreadPool();
		
		//executorService.submit(new Runnable() {

		 new Thread((new Runnable() {
			@Override
			public void run() {
				//  ѭ��50��
				for (int i = 1; i <= 5; i++) {
					business.subThread(i);
					//Thread.currentThread().setName("���߳�"+i);
				}
			}
		})).start();
	

		//executorService.submit(new Runnable(){
		new Thread((new Runnable(){
			@Override
			public void run() {
				//  ѭ��50��
				for (int i = 1; i <= 5; i++) {
					business.meddionThread(i);
					//Thread.currentThread().setName("���߳�"+i);
				}
			}
		})).start();
		
		 //  ѭ��50��
		for (int i = 1; i <= 5; i++) {
			//Thread.currentThread().setName("���߳�"+i);
			business.mainThread(i);
		}
		
       
	}

	// ���߳�ѭ�� 10
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
               //  ���߳� ѭ�� 10 
			try {
				for (int k = 1; k <= 1; k++) {
					System.out.println( Thread.currentThread().getName() + i+"�����߳���ѭ����һ" + k + "��");
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
					System.out.println(Thread.currentThread().getName()+ i+"���߳���ѭ����һ" + k + "��");
				}
				count=2;
			    condition3.signal();
			} catch (Exception e) {
				reentrantLock.unlock();
			}
			// ���߳�ѭ��10
				
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
				System.out.println(Thread.currentThread().getName() + i+"��ѭ����һ" + k + "��");
			}
			count = 0;
			condition1.signal();
		} catch (Exception e) {
			reentrantLock.unlock();
		}
		// ���߳�ѭ��10

	}
		
	}

}
