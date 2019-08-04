package com.design.mode.Decorator;

/**
 * @Description :
 * @Author : jiangpan
 * @Date : 2019/3/8 13:42
 **/
public class Egg extends Food {

    @Override
    public void eat() {
        System.out.println("EggEggEgg");
    }

    public Egg(Food basic ){
        System.out.println("EggEggEgg");
    }
}
