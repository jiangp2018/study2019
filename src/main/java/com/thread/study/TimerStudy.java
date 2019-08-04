package com.thread.study;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/*
 * �� �Լ������Լ���
 * 2��num%2 ȡģ����
 * Timer ��ʱ��������  Timer��schedlu(Timertask ,ʱ�� ���ӳ�ʱ��)
 * TimerTask ��ʱ�������� 
 */

public class TimerStudy {
	// ż����7 ��������3  
	 static int  count=0;
	 static int num =0;
	public static void main(String[] args){		
		  myTimerTest3();
		// TimerTest2();
		
	}
	 //ѭ����ը
	public static void myTimerTest3() {
		final Timer timer = new Timer();
		// TimerTask tt = new TimerTask() ;
		timer.schedule(new myTimer(), 3000);
	}
	 
	public static class myTimer extends TimerTask {
		@Override
		public void run() {
		//	Calendar.getInstance().get
			++num;	
			System.out.println(new Date().getSeconds());
			System.out.println("�ҵĵڶ�����ʱ����");
			new Timer().schedule(new myTimer(), 3000+(3000*(num%2)));
		}
	}
	 
	 
	 
	 // ����ը ��3�� 7 ��3 �� 7 �� 3 ��7
	// @Test
	public  static void  TimerTest2(){
		// ż����7 ��������3  
		Timer timer = new Timer();
	    TimerTask task = new TimerTask() {
	    
			@Override
			public void run() {
				System.out.println(new Date().getSeconds());
				++num;	
			}
		/*	++count;
			num=count%2;
			System.out.println("num="+ num +"�ҵĵڶ�����ʱ����");*/
		};
		timer.schedule(task, 2000, 2000+(2000*(num/2)));
	}
	 // 2 , 4 , 6 , 10  ,  12 , 16 
}
