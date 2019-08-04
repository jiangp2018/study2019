package com.thread.study;

//synchronized ͬ��
/** @author jiangp 
 * synchronized : ��֤�߳����ʵʱ�ɼ� �������滻��volatile
 * synchronized  : ���������� �����������
 * synchronized : ����Ƕ��� ���Ƿ�������static ������ ��static ����Ҫ���ֽ���
 * static synchronized������static��������ֱ������ӷ�������ã��������޷�ʹ��this����������Ĳ���this���������Class����
 *���ԣ�static synchronized����Ҳ�൱��ȫ�����൱����ס�˴���Ρ�
 *
 */

public class SynchroizedStudy {

	public static void main(String[] args) {
	  new   SynchroizedStudy() .sysTest();
	}

	public void sysTest() {
	 final OutPrint outPrint = new OutPrint();
    new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					while(true){
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
							while(true){
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
		String xxx="";
		public  void  sysNamme(String name ){
			int   length = name.length();
			// synchroizedd ͬ�������
			synchronized(OutPrint.class){
				for(int i=0;i<length;i++){
					System.out.print(name.charAt(i));
				}
				System.out.println();
			}
		}

		//synchronized ͬ������  
		public  static  synchronized  void  sysNamme2(String name ){
			int   length = name.length();
				for(int i=0;i<length;i++){
					System.out.print(name.charAt(i));
				}
				System.out.println();
			
		}
	}
    	
}
