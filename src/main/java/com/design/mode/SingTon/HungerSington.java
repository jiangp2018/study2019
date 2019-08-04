package com.design.mode.SingTon;

/**
 * @Description : 饿汉式模式, 全局只有一份配置
 * @Author : jiangpan
 * @Date : 2019/7/18 11:04
 **/
public class HungerSington {

    private static HungerSington hungerSington = null;

    private HungerSington() {
    }

    ;

    public synchronized final static HungerSington getInstance() {
        // 双重检查
        if (hungerSington == null) {
            return hungerSington = new HungerSington();
        }
        return hungerSington;
    }

    public final static HungerSington getInstance1() {
        if (hungerSington == null) {
            synchronized (hungerSington) {
                if (hungerSington == null) {
                    hungerSington = new HungerSington();
                }
            }
        }

        return hungerSington;
    }

}
