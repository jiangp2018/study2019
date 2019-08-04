package com.jvm;

import javax.xml.bind.SchemaOutputResolver;
import java.net.SocketTimeoutException;

/**
 * @Description :
 * @Author : jiangpan
 * @Date : 2019/4/30 22:08
 **/
public class IaddI {

    public static void main(String[] args) {
        /*int i = 2;
        int y = 2;
        int j = i++;
        int k = ++y;
        System.out.println(j + "==," + "k==" + k);
        System.out.println(i + "==," + "y==" + y);*/
        String str = "jiangpan";
        char[] bytes = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int l = 0; l < bytes.length; l++) {
            sb.append(bytes[l]);
            sb.append(",");
        }
        System.out.println(sb.toString());


        String str1 = "jiangpan";
        char[] bytes1 = str1.toCharArray();
        StringBuilder sb1 = new StringBuilder();
        for (int l = 0; l < bytes1.length; ++l) {
            sb1.append(bytes1[l]);
            sb1.append(",");
        }
        System.out.println(sb1.toString());
    }

}
