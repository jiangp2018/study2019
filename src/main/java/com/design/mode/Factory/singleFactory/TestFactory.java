package com.design.mode.Factory.singleFactory;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;

import static org.mockito.Mockito.*;

/**
 * @Description :
 * @Author : jiangpan
 * @Date : 2019/3/11 10:25
 **/

public class TestFactory {
    @Mock
    private singleFactory factory;
    @Mock
    private ArrayList mockedList;

    /**
     *
     */
    @Test
    public void testFactory() {
        singleFactory factory = mock(singleFactory.class);
        Assert.assertEquals(factory.dump(3000).toString(), "0");
        System.out.println(factory.dump(300));
        verify(factory, times(1)).dump(300);
    }

    @Test
    public void whenFactory() {
        when(factory.getName()).thenReturn("name");
        Assert.assertEquals(factory.getName(),"name");
        System.out.println(factory.getName());
        System.out.println(factory.getName());
        try {
            when(factory.getName()).thenThrow(new RuntimeException());
            //Assert.fail();
        } catch (Exception e) {
            System.out.println("捕获异常成功");
            e.printStackTrace();
        }
/*
        when(factory.getName()).
*/
    }





    @Before
    public void initFactory(){
        MockitoAnnotations.initMocks(this);
    }


    @Test
    public void testMock() {
        //使用mock对象
        mockedList.add("two");
        mockedList.clear();
        //做验证
        verify(mockedList).add("two");
        verify(mockedList).clear();
    }


}
