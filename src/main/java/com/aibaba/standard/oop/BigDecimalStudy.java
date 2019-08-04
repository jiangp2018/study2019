package com.aibaba.standard.oop;

import org.junit.Test;

import java.math.BigDecimal;

/**
 * @Description : new bigDecimal(double): 会导致精度增加位数的长度
 * @Author : jiangpan
 * @Date : 2019/6/21 15:57
 **/
public class BigDecimalStudy {

    @Test
    public void newBigDecimal() {
        Double d = 0.8;
        BigDecimal decimal = new BigDecimal(d);
        System.out.println("new BigDecimal " + decimal);
    }

    @Test
    public void BigDecimalValueOf() {
        double d = 0.8;
        BigDecimal decimal = BigDecimal.valueOf(d);
        System.out.println("valueOf " + decimal);
    }

    @Test
    public void newBigDecimalByString() {
        String d = "0.8";
        BigDecimal decimal = new BigDecimal(d);
        System.out.println("valueOf " + decimal);
    }
}
