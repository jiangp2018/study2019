package com.aibaba.standard.oop;

import org.junit.Test;

/**
 * @Description :浮点数相加减都会有问题，因为计算机都是加法运算
 * 浮点数类型单精度、双精度、延伸单精度、 延伸双精度。
 * 总结 ：尽量使用双精度，减少精度损失
 * @Author : jiangpan
 * @Date : 2019/6/5 16:58
 **/
public class Floating {

    @Test
    public void testFloatDec(){
        Float f1 = 1F;
        Float f2 = 0.9F;
        System.out.println(f1-f2);

    }

    @Test
    public void testDoubleDec(){
        double f1 = 1.0;
        double f2 = 0.8;
        System.out.println(f1-f2);
    }

    @Test
    public void testDoubleAdd(){
        double f1 = 1d;
        double f2 = 0.84  ;
        System.out.println("add===="+f1+f2);
    }

    @Test
    public void testDoubleMuluty(){
        double f1 = 0.9d;
        float f2 = 0.9f;
        double f3 = 1.0;
        System.out.println("f1/f3===="+f1/f3);
        System.out.println("f2/f3===="+f2/f3);
    }
}
