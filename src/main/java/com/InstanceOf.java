package com;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description :
 * @Author : jiangpan
 * @Date : 2019/5/22 15:18
 **/
public class InstanceOf {

    public static void main (String[] Args){
        ArrayList arrayList = new ArrayList();
        System.out.println(arrayList instanceof List);//true
        List list = new ArrayList();
        System.out.println(list instanceof ArrayList);//true

        System.out.println(null instanceof List);//false


    }

}
