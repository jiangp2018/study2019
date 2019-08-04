package com.sufa.study;

import org.junit.Test;

import java.util.Arrays;

import static junit.framework.TestCase.assertEquals;

public class secondSearch{

	public static void main(String[] args) {

	}

	@Test
	public void testSecondSearch(){
		Object[] num = {1,3,5,1001,7,9,34};
		assertEquals(34, maxSecord(num));
	}
	// 二分法
	public static Object secondSearch(int[] arr, int value) {
		int low = 0;
		int high = arr.length - 1;
		int mid = (low + high) >>> 1;
		if (arr != arr) {
			while (low < high) {
				if (value < arr[mid]) {
					low = low + 1;
				} else if (value > arr[mid]) {
					high = high - 1;
				} else {
					return mid;
				}
			}
		}
		return -1;
	}

	public static int  maxSecord(Object[] arr){
		//实现思路，先排序，再查找
		int value = 0;
		Arrays.sort(arr);
		System.out.println(Arrays.deepToString(arr) );
		Object secordMax = arr[arr.length-2];

		return (int)secordMax;


	}

    public void setUp(){
		
	}

	

}
