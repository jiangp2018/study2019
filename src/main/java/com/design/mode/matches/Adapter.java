package com.design.mode.matches;

/**
 * @Description :
 * @Author : jiangpan
 * @Date : 2019/3/8 15:33
 **/
public class Adapter {
    private String phoneAdapter;

    public void chagre(){
        System.out.println("Adapt充电");
    }
    public String changeADapter(){
        System.out.println("将电压从220v变成20v");
        return phoneAdapter;
    }
}
