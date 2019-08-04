package com.design.mode.spring.design.Methodfavtory;

import com.design.mode.spring.design.factory.SimpleFactory.Computer;

/**
 * @Description :
 * @Author : jiangpan
 * @Date : 2019/7/22 22:01
 **/
public interface  MethodFactory {
      Computer getMethodFactoryName(String name);
}
