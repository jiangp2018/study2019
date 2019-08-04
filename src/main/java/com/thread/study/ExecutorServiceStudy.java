package com.thread.study;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;


public class ExecutorServiceStudy  {
    public  static void main (String [] args ){
    	// 1����Ҫ�����̣߳��ʹ��������߳�
    //  ExecutorService executorService  = Executors.newCachedThreadPool();
   	//ExecutorService executorService = Executors.newCachedThreadPool(new threadFactoryStudy());
    	// 2: �����̶���С���̣߳���������������ָ���߳��������͵����߳�����
   // ExecutorService executorService = Executors.newFixedThreadPool(100);
    	  // ExecutorService  executorService  =  Executors.newFixedThreadPool(100, new threadFactoryStudy());
    // 3��
  //   ExecutorService executorService = Executors.newSingleThreadExecutor();
 ///    ExecutorService  executorService  =  Executors.newSingleThreadExecutor( new threadFactoryStudy());
   	ExecutorService executorService = Executors.newScheduledThreadPool(5);
    //5 defaulthread
    	// ThreadFactory executorService = Executors.defaultThreadFactory();
    	for ( int i = 1; i <= 10; i++) {
    	final int  count = i;
    //	 executorService.newThread(new Runnable() {
         executorService.execute(new Runnable(){
        	@Override
        	public void run() {
        		try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
        		System.out.println(  Thread.currentThread().getName() + "newCachedThreadPool   " +count);
        		
        	}
        	   
           });
	}

	  
	//   ExecutorService    executorService = new  ThreadPool
   }

    
static  class threadFactoryStudy implements ThreadFactory{	
	@Override
	public Thread newThread(Runnable r) {
		 System.out.println( Thread.currentThread().getName()   +  "||Thread");
		return  new Thread();
	}
   }

}
