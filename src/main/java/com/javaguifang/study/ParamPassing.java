package com.javaguifang.study;

public class ParamPassing {

    private static int intStatic = 222;
    private static String stringStatic = "123";
    private static StringBuilder stringBuilderStatic = new StringBuilder(12);

    public static void main(String[] args) {

        method(intStatic);
        System.out.println("method1:"+intStatic);
        method();
        System.out.println("method2:"+intStatic);

    }


    public static void method(int intStatic) {
        intStatic = 77;
    }

    public static void method() {
        intStatic = 88;
    }


    
}
