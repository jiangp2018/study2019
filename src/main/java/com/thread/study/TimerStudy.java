package com.thread.study;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

import javax.management.timer.TimerMBean;

import org.junit.Test;

/*
 * ① 自己调用自己，
 * 2：num%2 取模运行
 * Timer 定时调度器，  Timer。schedlu(Timertask ,时间 ，延迟时间)
 * TimerTask 定时调度任务 
 */

public class TimerStudy {
	// 偶数是7 ，技术是3  
	 static int  count=0;
	 static int num =0;
	public static void main(String[] args){		
		  myTimerTest3();
		// TimerTest2();
		
	}
	 //循环爆炸
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
			System.out.println("我的第二个定时任务");
			new Timer().schedule(new myTimer(), 3000+(3000*(num%2)));
		}
	}
	 
	 
	 
	 // 交替炸 ，3， 7 ，3 ， 7 ， 3 ，7
	// @Test
	public  static void  TimerTest2(){
		// 偶数是7 ，技术是3  
		Timer timer = new Timer();
	    TimerTask task = new TimerTask() {
	    
			@Override
			public void run() {
				System.out.println(new Date().getSeconds());
				++num;	
			}
		/*	++count;
			num=count%2;
			System.out.println("num="+ num +"我的第二个定时任务");*/
		};
		timer.schedule(task, 2000, 2000+(2000*(num/2)));
	}
	 // 2 , 4 , 6 , 10  ,  12 , 16 
}
