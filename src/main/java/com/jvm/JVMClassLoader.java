package com.jvm;

import org.junit.Test;

import java.net.URL;

/**
 * @Description :java类加载器
 * @Author : jiangpan
 * @Date : 2019/1/26 21:09
 **/

public class JVMClassLoader {

    public static void main(String[] Args){
        JVMClassLoader classLoader = new JVMClassLoader();
        classLoader.bootStrapClassLoader();
    }


    @Test
    public void bootStrapClassLoader(){
      URL[] url = sun.misc.Launcher.getBootstrapClassPath().getURLs();
        for (URL url1 : url) {
            System.out.println(url1.toExternalForm());
        }
    }

    @Test
    public void ClassLoader(){
        URL[] url = sun.misc.Launcher.getBootstrapClassPath().getURLs();
        for (URL url1 : url) {
            System.out.println(url1.toExternalForm());
        }
    }

}
