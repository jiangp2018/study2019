package com.jvm;

import org.junit.Test;


public class DisplacementStudy {
  
	//位移运算
	@Test
	public void displaceStudy(){
		// count=6 ,向低位移动 是除以那个数 x>>n  ,x/n 
		int count = 4 + (4 >> 1);
		int count2 = 4 + (4 >> 2);
		//向高位移动，就是乘以那个数   x<<n  ,x+(x*n) 
		int count3 = 4 + (4 << 1);
		int count4 = 4 + (4 << 2);
	}
	
}
