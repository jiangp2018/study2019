package com.jvm;

/**
 * @Description :
 * @Author : jiangpan
 * @Date : 2019/4/14 23:00
 **/
public class FinallyAndReturn {
    public static void  main(String[] Arg ){
        System.out.println(testFinally());
    }


    public static int testFinally(){
        int x;
        try {
            x =2;
         return  x ;
        }catch (Exception e ){
            x = 3;
            return x;
        } finally{
            x = 5;
            return x ;
        }
    }

    public  int testFinally2(){
        int x;
        try {
            x =2;
            return x;
        }catch (Exception e ){
            x = 3;
            return x;
        } finally{
            x = 4;
        }
    }
}
