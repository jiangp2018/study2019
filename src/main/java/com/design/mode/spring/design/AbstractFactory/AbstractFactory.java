package com.design.mode.spring.design.AbstractFactory;

import com.design.mode.spring.design.factory.SimpleFactory.Computer;

/**
 * @Description : 抽象工厂
 * @Author : jiangpan
 * @Date : 2019/7/22 22:27
 **/
public abstract class AbstractFactory {
    abstract Computer getDerDeName();
    abstract Computer getLenovName();
}
