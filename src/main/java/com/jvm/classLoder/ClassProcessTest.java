package com.jvm.classLoder;

import org.junit.Test;

import java.lang.reflect.Method;

/**
 * @Description :
 * @Author : jiangpan
 * @Date : 2019/4/21 17:22
 **/
public class ClassProcessTest {

    @Test
    public void testClassProcess(){
        String name = ClassProcess.process;
    }

    @Test
    public void testNoProcess(){
        String name = ClassProcess.noProcess;
    }

    @Test
    public void testNewProcess(){
        ClassProcess process= new ClassProcess();
    }

    @Test
    public void getProcess(){
        ClassProcess.getClassProcess();
    }

    @Test
    public void getProcesss(){
        ClassProcess[] ClassProcess =  new ClassProcess[0];
    }

    @Test
    public void getInvokeProcesss(){
        Method[] methods = ClassProcess.class.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method);
        }
    }
        @Test
    public void subClassProcess(){
           String name =  subClassProcess.noProcess;
    }


}
