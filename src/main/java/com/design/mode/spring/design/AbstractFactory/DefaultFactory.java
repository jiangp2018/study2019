package com.design.mode.spring.design.AbstractFactory;

import com.design.mode.spring.design.factory.SimpleFactory.Computer;
import com.design.mode.spring.design.factory.SimpleFactory.DerDe;
import com.design.mode.spring.design.factory.SimpleFactory.Lenov;

/**
 * @Description :
 * @Author : jiangpan
 * @Date : 2019/7/22 22:33
 **/
public class DefaultFactory  extends AbstractFactory{

    @Override
    Computer getDerDeName() {
        return new DerDe();
    }

    @Override
    Computer getLenovName() {
        return new Lenov();
    }
}
