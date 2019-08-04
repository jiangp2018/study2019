package com.jdk8.inteface.Impl;

import com.jdk8.inteface.AbstractInteface;

/**
 * @Description :
 * @Author : jiangpan
 * @Date : 2019/7/3 10:21
 **/
public class AbstractIntefaceImpl  {
    public static void main (String[] args){
     /*   AbstractInteface ab = new AbstractInteface() {
            @Override
            public Object convert(Object from) {
                return null;
            }
        };*/

        AbstractInteface<String, Integer> con = from -> Integer.valueOf(from);
        Integer value = con.convert("456");
        System.out.println(value);

        AbstractInteface<String, Integer> con2 = Integer::valueOf;





    }
}
