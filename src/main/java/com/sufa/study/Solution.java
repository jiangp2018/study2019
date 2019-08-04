package com.sufa.study;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {

    public static void main (String[] Args){
        Long start =  System.currentTimeMillis();
        int[] res = twoSumByTwoHashMap(new int[]{1,2,4,6,136,357}, 358);
        System.out.println(res[0]+"+"+res[1]);
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    //暴力法
    public static  int[] twoSumByViolence(int[] nums, int target) {
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            int sub = target - nums[i];
            for (int j = i + 1; j < length; j++) {
                if (nums[j] == sub) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

   //hashMap
    public static  int[] twoSumByTwoHashMap(int[] nums, int target) {
        //先放到map里面，再从map里面查询
        HashMap<Integer, Integer> map = new HashMap<>();
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < length; i++) {
            int sub = target - nums[i];
            if (map.containsKey(sub)) {
                for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                    if (entry.getKey().equals(sub)) {
                        return new int[]{i, entry.getValue()};
                    }
                }
            }
        }
        return null;
    }


    //hashMap
    public static int[] twoSumByOneHashMap(int[] nums, int target) {
        //先放到map里面，再从map里面查询
        HashMap<Integer, Integer> map = new HashMap<>();
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            int sub = target - nums[i];
            if (map.containsKey(sub)) {
                for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                    if (!entry.getKey().equals(i)) {
                        return new int[]{map.get(sub), entry.getValue()};
                    }
                }
            }
            map.put(nums[i], i);
        }
        return null;
    }

}