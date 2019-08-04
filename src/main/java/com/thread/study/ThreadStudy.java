package com.thread.study;

public class ThreadStudy extends Thread{
	
	public static void main(String[] args){
		ThreadStudy  threadStudy = new  ThreadStudy();
		threadStudy.start();
	}

	@Override
	public void run() {
	System.out.println("Thread=================");
		super.run();
	}
}
