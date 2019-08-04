package com.jvm.classLoder;

/**
 * @Description :
 * @Author : jiangpan
 * @Date : 2019/4/21 18:03
 **/
public class subClassProcess extends ClassProcess implements  ExpinalInterface {

    static {
        System.out.println("subClassProcess");
    }
}
