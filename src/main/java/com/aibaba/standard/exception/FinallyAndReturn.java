package com.aibaba.standard.exception;

/**
 * @Description :
 * @Author : jiangpan
 * @Date : 2019/6/23 22:02
 **/
public class FinallyAndReturn {
    public static void main (String[] args){
        System.out.println(testFinally());
    }

    public static  String testFinally() {
        try {
            int i = 100;
            return "290";
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("finally");
            return "900";
        }

    }

}
