package com.design.mode.Decorator;

/**
 * @Description :
 * @Author : jiangpan
 * @Date : 2019/3/8 14:18
 **/
public class Meat extends Food {

    @Override
    public void eat() {
        super.eat();
    }
    public Meat(Food basic){
        System.out.println("meatmeat");
    }
}
