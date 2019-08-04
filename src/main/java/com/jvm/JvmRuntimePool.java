package com.jvm;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description :
 * @Author : jiangpan
 * @Date : 2019/2/28 9:53
 **/
public class JvmRuntimePool {

     public static void main (String[] args) {
         List<String> list = new ArrayList<>();
         int i = 0;
         int c = 0;
         String str = "111";
         String str2 = "111";
         while (true) {
             list.add(String.valueOf(i++).intern());
             System.out.printf(""+i);
         }
     }


}
