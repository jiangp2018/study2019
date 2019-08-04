package com.thread.study;

import java.util.HashMap;
import java.util.Random;


public class commonVar {
  //线程共享变量 
	private  static int  date=0;
	private  static  HashMap<Thread,Integer > hashMap= new  HashMap<>();
	public static void main(String[] args) {
	new commonVar().testCommonVar();
	
	}
  
	public  void testCommonVar(){
		for (int i = 1; i <= 3; i++) {
			new Thread(new Runnable() {
			@Override
			public void run() {
			Random random = new Random();
			int date = random.nextInt();
			hashMap.put(Thread.currentThread(),date);
		 	//ssint mydate= date;
		    System.out.println(Thread.currentThread().getName() +date);
             new Thread1().getDate();
             new Thread2().getDate();
			   }
			}).start();
		}
	}
	
	
	
	  class Thread1 {
		public  void  getDate(){
			System.out.println("线程Thread1   "+Thread.currentThread().getName() +	hashMap.get(Thread.currentThread()));
		}
	}
	
	
	 class Thread2 {
		public  void  getDate(){
			System.out.println("线程Thread2  "+Thread.currentThread().getName() +hashMap.get(Thread.currentThread()));
		}
	}
	
	
}
