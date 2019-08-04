package com.aibaba.standard.collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @Description : subList 的坑
 * 1：增删改原列表子列表都会报错
 * 2：不能强装成ArrayList
 * 3：对子列表进行增删改操作都会反映到源列表中
 * @Author : jiangpan
 * @Date : 2019/6/21 17:20
 **/
public class ArrayListStudy {
    private static ArrayList<Integer> list;

    static {
        list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
    }

    /**************************************************subList***************************/

    @Test
    public void subListToArrayListTest(){
        ArrayList arrayList = (ArrayList) list.subList(1,list.size());
    }

    @Test
    public void subListDeleteToListTest(){
        List arrayList = list.subList(1,list.size());
        arrayList.size();
        System.out.println(arrayList.remove(1));
        System.out.println(list.toString());
        System.out.println("暖宝宝不不 ");
    }

    @Test
    public void subListAddToListTest(){
        List arrayList = list.subList(1,list.size());
        arrayList.size();
        System.out.println(arrayList.add(4));
        System.out.println(list.toString());
    }

    @Test
    public void subListToDeleteList(){
        List arrayList = list.subList(0,list.size());

        System.out.println(list.remove(1));
        System.out.println(list.toString());
        /** 删除子列表会报错 **/
        System.out.println(arrayList.size());
    }

    @Test
    public void subListToAddList(){
        List arrayList = list.subList(0,list.size());

        System.out.println(list.add(1));
        System.out.println(list.toString());
        /** 增删改原列表子列表都会报错 **/
        System.out.println(arrayList.size());
    }

    /******************************************toList*******************************/
    /**
     * 没有懂这条
     */
    @Test
    public void ArrayListToArray(){
        Integer[] num = list.toArray(new Integer[0]);
        System.out.println(Arrays.toString(num));
    }

    @Test
    /**
     * addAll 添加集合，不能添加空集合
     */
    public void ArrayListAddAll(){
        List<Integer> arrays = null;
        list.addAll(arrays);
    }



    /**
     * addAll 添加集合，不能添加空集合
     */
    @Test
    public void ArraySizeGrop(){
        List<Integer> arrays = new ArrayList<>(6);
        for (int i = 0; i < 10; i++) {
            if (i == 6) {
                arrays.add(i);
            } else  {
                arrays.add(i);
            }
            System.out.println("当前i = "+ i +"当前size = " + arrays.size());
        }
    }

    @Test
    public void ArrayDefaultSize() {
        List<Integer> arrays = new ArrayList<>(1);
        arrays.add(1);
        arrays.add(2);
        System.out.println("当前当前size = " + arrays.size());
    }

    @Test
    public void emptyList() {
        // 都是final的
        Collections.emptyList().add(122);
        Collections.emptyMap();
    }

    @Test
    public void ArraysToList() {
        // 都是final的
       char[] c = {1,2,3,4,5};
       Arrays.asList(c).add(new char[]{2});
    }

    @Test
    public void listToArraysWithNotEnough(){
        Integer[] integers = new Integer[2];
        list.toArray(integers);
        System.out.println(Arrays.asList(integers));
    }
}
