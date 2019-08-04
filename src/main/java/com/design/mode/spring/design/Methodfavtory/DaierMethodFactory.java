package com.design.mode.spring.design.Methodfavtory;

import com.design.mode.spring.design.factory.SimpleFactory.Computer;
import com.design.mode.spring.design.factory.SimpleFactory.DerDe;

/**
 * @Description :
 * @Author : jiangpan
 * @Date : 2019/7/22 22:07
 **/
public class DaierMethodFactory implements MethodFactory{

    public Computer getMethodFactoryName(String name) {
        if ("1".equals(name)) {
            return new DerDe();
        }
        return null;
    }
}
