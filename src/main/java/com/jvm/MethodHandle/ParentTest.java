package com.jvm.MethodHandle;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodType;

import static java.lang.invoke.MethodHandles.lookup;

/**
 * @author coolerwu on 2018/8/13.
 * @version 1.0
 * @time 20:58
 */
public class ParentTest {
    class GrandFather {
        public void thinking() {
            System.out.println("i am grandfather.");
        }
    }

    class Father extends GrandFather {
        @Override
        public void thinking() {
            System.out.println("i am father.");
        }
    }

    class Son extends Father {
        @Override
        public void thinking() {
            // 调用超类的方法
            MethodType methodType = MethodType.methodType(void.class);
            try {
                MethodHandle methodHandle = lookup().findSpecial(GrandFather.class, "thinking", methodType, getClass());
                try {
                    methodHandle.invoke(this);
                } catch (Throwable throwable) {
                    throwable.printStackTrace();
                }
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }

        }
    }

    public static void main(String[] args) {
        new ParentTest().new Son().thinking();
    }
}
