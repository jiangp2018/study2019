package com.thread.study;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

//synchronized ͬ��
/** @author jiangp 
 * synchronized : ��֤�߳�����ʵʱ�ɼ� �������滻��volatile
 * synchronized  : ���������� �����������
 * synchronized : �����Ƕ��� �����Ƿ�������static ������ ��static ����Ҫ���ֽ���
 * static synchronized������static��������ֱ�������ӷ��������ã��������޷�ʹ��this�����������Ĳ���this���������Class����
 *���ԣ�static synchronized����Ҳ�൱��ȫ�������൱����ס�˴���Ρ�
 *
 */

public class LockStudy {

	public static void main(String[] args) {
	  new   LockStudy() .sysTest();
	}

	public void sysTest() {
	final OutPrint outPrint = new OutPrint();
		// ���������̣߳���ӡ����
	   // �߳�1
	new Thread(new Runnable() {
		@Override
			public void run() {
				try {
					while (true) {
						Thread.sleep(100);
						outPrint.sysNamme("jiangpanpan");
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}).start();
		
		
		  // �߳�
		new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					while (true) {
						Thread.sleep(100);
						outPrint.sysNamme2("zhangdanhua");
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}).start();
	}
	
	
	//��ӡ����ʵ�����ִ�λ
   static 	class   OutPrint{
	   Lock Lock = new ReentrantLock(); 
		public  void  sysNamme(String name ){
			int   length = name.length();
			//Lock ͬ�������
			Lock.lock();
			try{
				for(int i=0;i<length;i++){
					System.out.print(name.charAt(i));
			  }   
				System.out.println();
			}catch(Exception e){
				e.printStackTrace();
			 }finally{
				 Lock.unlock();
			 }
		}

		//synchronized ͬ������  
		public  static  synchronized  void  sysNamme2(String name ){
		 	Lock lock = new  ReentrantLock();
		 	// ������������ʵ�ֻ���
			int   length = name.length();
			try {
				lock.tryLock();
				for(int i=0;i<length;i++){
					System.out.print(name.charAt(i));
				}
				   System.out.println();
			} catch (Exception e) {
				
			}finally{
				lock.unlock();
			}
			
				
		}
	}
    	
}
