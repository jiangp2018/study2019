package com.aibaba.standard.oop;

import org.junit.Test;

/**
 * @Description :分隔符后面有空的情况：如1,2,3,,4,7
 * @Author : jiangpan
 * @Date : 2019/6/21 16:38
 **/
public class spiltStudy {

    @Test
    public void stringIsNull(){
        String str = "1,3,,0,";
        String c = str.substring(str.lastIndexOf(","), str.length());
        int size = 0;
        if (",".equals(c)) {
            size = -1;
        }
        String[] strs = str.split(",");
        // size += strs.length;
        for (String s : strs) {
            System.out.println(s);
        }
        System.out.println( strs[strs.length -1]);
    }


    // 总结split 最后为空的值不算入数组中，中间的是要算的
    // string 是从零开始计算的
    @Test
    public void testSpilt() {
        String str = "a,b,c,f,,1,,8,,,";
        String lastValue = str.substring(str.lastIndexOf(",") + 1, str.length());
        String[] strs = str.split(",");
        int lengths = strs.length;
        if (lastValue == null) {
            lengths = lengths - 1;
        }
        System.out.println(lengths);
    }
}
