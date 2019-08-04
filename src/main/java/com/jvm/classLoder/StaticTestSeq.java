package com.jvm.classLoder;

public class StaticTestSeq {
    private  static  volatile boolean firstFlag = true;
    private static StaticTestSeq instance = new StaticTestSeq();

 
    private StaticTestSeq() {
        if(firstFlag) {
            System.out.println("Flag is true, do something...");
        } else {
            System.out.println("Flag is false, nothing to do.");
        }
    }
    public static StaticTestSeq getInstance() {
        return instance;
    }
 
    public boolean getFirstFlag() {
        return firstFlag;
    }
 
    public static void main(String[] args) {
        new StaticTestSeq();
      /*  StaticTestSeq seq = StaticTestSeq.getInstance();
        System.out.println("Get flag: "+seq.getFirstFlag());*/
    }
}
