package com.aibaba.standard.collection;

import org.junit.Test;

import java.util.HashMap;

/**
 * @Description :
 * @Author : jiangpan
 * @Date : 2019/6/23 15:20
 **/
public class MapStudy {
    private static HashMap<String, String> map = new HashMap<>();
    static {
        map.put("123", "456");
    }

    @Test
    public void TestEntrySet() {
        map.keySet().add("");
      //  map.forEach();
    }
}
