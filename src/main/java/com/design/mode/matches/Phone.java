package com.design.mode.matches;

/**
 * @Description :
 * @Author : jiangpan
 * @Date : 2019/3/8 15:34
 **/
public class Phone extends Adapter {
    @Override
    public void chagre(){
        System.out.println("手机原始电压");
        String adapterString = super.changeADapter();
        System.out.println(adapterString+"终于可以手机充电的");
    }

    @Override
    public String changeADapter() {
        return super.changeADapter();
    }

}
