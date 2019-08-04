package com.design.mode.Observer;

/**
 * @Description :
 * @Author : jiangpan
 * @Date : 2019/3/8 11:10
 **/
public class ObserverTest {

    public static void main(String[] args){
        XiaoJiang jiang = new XiaoJiang();
        XiaoMei mei = new XiaoMei();
        XiaoPan pan = new XiaoPan();
        mei.peoples.add(jiang);
        mei.peoples.add(pan);
        mei.playToMany();
    }
}
