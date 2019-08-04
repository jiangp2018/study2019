package com.design.mode.Observer;

import java.util.LinkedList;
import java.util.List;

/**
 * @Description :
 * @Author : jiangpan
 * @Date : 2019/3/8 11:03
 **/
public class XiaoMei {

    List<people> peoples = new LinkedList<>();
    public void playToMany(){
        for (people people : peoples) {
            people.playGame();
        }
    }


}
