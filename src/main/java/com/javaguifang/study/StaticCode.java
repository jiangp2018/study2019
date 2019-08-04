package com.javaguifang.study;

public class StaticCode {
    static String prior = "done";
    public static String g() {
        String abc = last;
        return "hello world " ;
    }

    static String last = f() ? g() : prior;


    public static boolean f() {
        return true;
    }



    public  static  void main (String[] args){
        StaticCode StaticCodea= new  StaticCode();
    }
}