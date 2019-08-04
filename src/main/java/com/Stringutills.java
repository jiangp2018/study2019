package com;

import java.util.HashSet;
import java.util.Set;

/**
 * @Description :
 * @Author : jiangpan
 * @Date : 2019/5/22 15:20
 **/
public class Stringutills {

    public static void main(String[] Args) {
        String str = "GROUP_LISTORDER,GROUP_ORGSYNC,GROUP_USERSYNC";
        Set<String> set = new HashSet();

        String[] strs = str.split(",");
        System.out.println(strs);
        for (String value : strs) {
            set.add(value.trim());
        }
        System.out.println(set.size());
    }
}
