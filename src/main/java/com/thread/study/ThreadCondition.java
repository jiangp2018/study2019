package com.thread.study;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/*
 * 1���ڲ��಻��ֱ���� static main ʹ�� ��������class ǰ����� static 
 *:2���̵߳ȴ� this.wait ;�����߳� this.notify ; ��ȡ�����߳� this��notifyAll() 
 * 3: �̹߳��������� �ŵ� ���� 
 * 4�� ѭ���߳� 50 �Σ��ŵ� �߳� run {  ��������}
 * 5�� �߳��� wait �� while��condition������Ϊ jdk ��������ִ�е� ����ֹ�ٻ���
 * 6: ��������Ӧ�þ�����С�� �����Ӳ�����
 */
public class ThreadCondition {
	// 1�� ���߳� ѭ�� 10 �����߳�ѭ��100 �����߳� ѭ�� 10 �����߳�ѭ��100 ��ѭ��50��
	// 2:����ִ��
	public static void main(String[] args) {
		new ThreadCondition().testThread();
	}

	public void testThread() {
		final Business business = new Business();
		new Thread(new Runnable() {
			@Override
			public void run() {
				//  ѭ��50��
				Thread.currentThread().setName("���߳�");
				for (int i = 1; i <= 50; i++) {
					business.subThread(i);
				}
			}
		}).start();
        //  ѭ��50��
		for (int i = 1; i <= 50; i++) {
			Thread.currentThread().setName("���߳�");
			business.mainThread(i);
		}
	}

	// ���߳�ѭ�� 10
	 class Business {
		ReentrantLock reentrantLock =new  ReentrantLock();
		Condition  condition  = reentrantLock.newCondition();
	    private	Boolean whoRunnable = true;

		public  void subThread(int i) {
			reentrantLock.lock();
			while (!whoRunnable) {
				try {
					condition.await();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
               //  ���߳� ѭ�� 10 
			try {
				for (int k = 1; k <= 10; k++) {
					System.out.println( Thread.currentThread().getName() +"�������߳�" + i + "����ѭ����һ" + k + "��");
				}
			whoRunnable = false;
			condition.signal();
			} catch (Exception e) {
				reentrantLock.unlock();
  			}	
		}

		public  void mainThread(int i) {
			reentrantLock.lock();
			while (whoRunnable) {
				try {
					condition.await();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			try {
				for (int k = 1; k <= 10; k++) {
					System.out.println("�������߳�" + i + "����ѭ����һ" + k + "��");
				}
			    whoRunnable = true;
			    condition.signal();
			} catch (Exception e) {
				reentrantLock.unlock();
			}
			// ���߳�ѭ��10
				
		}
	}

}
