package com.design.mode.Factory.singleFactory;

/**
 * @Description :
 * @Author : jiangpan
 * @Date : 2019/3/11 10:08
 **/
public class singleFactory {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public singleFactory(Class clazz) throws IllegalAccessException, InstantiationException {
        Animal animal = (Animal) clazz.newInstance();
        animal.dump();
        animal.eat();
    }
    public Integer dump(Integer num ){
        return num;
    }
}
