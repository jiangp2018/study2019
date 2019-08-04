package com.design.mode.Decorator;

/**
 * @Description :
 * @Author : jiangpan
 * @Date : 2019/3/8 14:22
 **/
public class DecoratorTest {
    public static void main (String[] Args){
        Food food = new Meat(new Meat(null));
        Food food2 = new Meat(new Egg(food));
    }
}
