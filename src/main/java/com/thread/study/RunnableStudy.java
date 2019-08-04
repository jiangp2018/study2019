package com.thread.study;

public class RunnableStudy implements Runnable {

	public static void main(String[] args){
		RunnableStudy runnableStudy = new RunnableStudy();
		//new Thread().start();
		System.out.println(" ��ʼ");
		new Thread(runnableStudy).start();
	}
	
	@Override
	public void run() {
	System.out.println("implements ��ʼ");
	}
	
	
	
	
	
	
	
/*	class ThreadStudy extends Thread{
		ThreadStudy ThreadStudy = new  Thread();
		
	}*/
	
	

}
