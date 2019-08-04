package com.design.mode.spring.design.Methodfavtory;

import com.design.mode.spring.design.factory.SimpleFactory.Computer;
import com.design.mode.spring.design.factory.SimpleFactory.Lenov;

/**
 * @Description :
 * @Author : jiangpan
 * @Date : 2019/7/22 22:07
 **/
public class LenovMethodFactory  implements MethodFactory{

    public Computer getMethodFactoryName(String name) {
        if ("2".equals(name)) {
            return new Lenov();
        }
        return null;

    }
}
