package com.thread.study;
/*
 * 1���ڲ��಻��ֱ���� static main ʹ�� ��������class ǰ����� static 
 *:2���̵߳ȴ� this.wait ;�����߳� this.notify ; ��ȡ�����߳� this��notifyAll() 
 * 3: �̹߳��������� �ŵ� ���� 
 * 4�� ѭ���߳� 50 �Σ��ŵ� �߳� run {  ��������}
 * 5�� �߳��� wait �� while��condition������Ϊ jdk ��������ִ�е� ����ֹ�ٻ���
 * 6: ��������Ӧ�þ�����С�� �����Ӳ�����
 */
public class ThreadPractice {
	// 1�� ���߳� ѭ�� 10 �����߳�ѭ��100 �����߳� ѭ�� 10 �����߳�ѭ��100 ��ѭ��50��
	// 2:����ִ��
	public static void main(String[] args) {
		new ThreadPractice().testThread();
	}

	public void testThread() {
		final Business business = new Business();
		new Thread(new Runnable() {
			@Override
			public void run() {
				//  ѭ��50��
				for (int i = 1; i <= 50; i++) {
					business.subThread(i);
				}
			}
		}).start();
        //  ѭ��50��
		for (int i = 1; i <= 50; i++) {
			business.mainThread(i);
		}
	}

	// ���߳�ѭ�� 10
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
               //  ���߳� ѭ�� 10 
				for (int k = 1; k <= 10; k++) {
					System.out.println("�������߳�" + i + "����ѭ����һ" + k + "��");
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
			// ���߳�ѭ��10
				for (int k = 1; k <= 10; k++) {
					System.out.println("�������߳�" + i + "����ѭ����һ" + k + "��");
				}
			whoRunnable = true;
			this.notify();
		}
	}

}
