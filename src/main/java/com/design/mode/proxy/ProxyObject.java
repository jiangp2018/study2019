package com.design.mode.proxy;

/**
 * @Description : 被代理对象
 * @Author : jiangpan
 * @Date : 2019/7/30 19:02
 **/
public class ProxyObject implements FindHouseService{
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getHousePrice() {
        return housePrice;
    }

    public void setHousePrice(String housePrice) {
        this.housePrice = housePrice;
    }

    public String getHoseSize() {
        return hoseSize;
    }

    public void setHoseSize(String hoseSize) {
        this.hoseSize = hoseSize;
    }

    private String userName;
    private String housePrice;
    private String hoseSize;

    @Override
    public void findHouse(Object proxyObject) {
        System.out.println("===tegrt开始找房子了+++++++");

    }
}
