package com.PaymenetQuestion;

import org.junit.Assert;
import org.junit.Test;

/**
 * @Description :  测试同一个对象，另一个方法对他操作后，没有返回他，他的值会改变吗？
 * @Author : jiangpan
 * @Date : 2019/5/31 14:32
 **/
public class ReturnValueTest {

    @Test
    public void noReturnValueTest(){
        Demo demo = new Demo();
        demo.setName("蒋攀");
        doDemo(demo);
        System.out.println(demo.getFullName());
        Assert.assertEquals("!jiangpanpan", demo.getFullName());
    }

    private static void doDemo(Demo demo){
        demo.setFullName("jiangpanpan");
    }



    // 定义一个对象
    class Demo {
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getFullName() {
            return fullName;
        }

        public void setFullName(String fullName) {
            this.fullName = fullName;
        }

        private String  name;
        private String  fullName;
    }
}
