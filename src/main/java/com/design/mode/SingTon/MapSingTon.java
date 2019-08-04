package com.design.mode.SingTon;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Description : 通过应用map来实现单例
 * @Author : jiangpan
 * @Date : 2019/7/18 10:41
 **/
public class MapSingTon {

    private MapSingTon() {};

    private static Map<String, MapSingTon> map = new ConcurrentHashMap<>();

    public static MapSingTon getInstance(String name) {
        if (name == null) {
            MapSingTon mapSingTon = new MapSingTon();
            map.put("mapSingTon", mapSingTon);
            return mapSingTon;
        }
        if (map.containsKey(name)) {
            return map.get(name);
        } else {
            MapSingTon mapSingTon = new MapSingTon();
            map.put("mapSingTon", mapSingTon);
            return mapSingTon;
        }
    }


}
