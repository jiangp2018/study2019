package com.aibaba.standard.oop;

import org.junit.Test;

/**
 * @Description : || 、| 、 & 、&& 的区别
 * @Author : jiangpan
 * @Date : 2019/6/5 16:34
 **/
public class CalStudy {

    /**
     * || 、|  ，都为false，才会变成false ,或者
     */
    @Test
    public void test() {
        boolean a = false;
        boolean b = true;
        Boolean res = b | a;
        boolean a1 = false;
        boolean b1 = true;
        Boolean res1 = a1 || b1;
        System.out.println("res=" + res);
        System.out.println("res1=" + res1);

    }


    /**
     * && 、&  都为真，才为真 &&具有短路原则，并且的意思
     */
    @Test
    public void testAND() {
        boolean a = false;
        boolean b = true;
        Boolean res = b & a;
        boolean a1 = false;
        boolean b1 = true;
        Boolean res1 = a1 && b1;
        System.out.println("res=" + res);
        System.out.println("res1=" + res1);
    }
}
