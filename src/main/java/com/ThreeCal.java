package com;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description :
 * @Author : jiangpan
 * @Date : 2019/5/29 15:19
 **/
public class ThreeCal {
  /*  public static void main(String[] args) {
        String temp = "";
        Boolean name = temp != null;
        System.out.println(name);
    }*/

    @Test
    public void testBreak() {
        List<String> list = new ArrayList();
        list.add("1");
        list.add("2");
        list.add("1");
        List<String> list1 = new ArrayList();
        list1.add("5");
        list1.add("1");
        list1.add("3");
        stop:
        for (String s : list) {
            for (String s1 : list1) {
                if (s1.equals(s)) {
                    break stop;
                }
            }
            System.out.println("====" + s);
        }
        System.out.println("==================结束");


    }
}
