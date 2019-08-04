package com.jvm.classLoder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @Description :
 * @Author : jiangpan
 * @Date : 2019/4/22 17:56
 **/
public class MyClassLoder extends ClassLoader {

    public static void main (String[] Args){
        MyClassLoder myClassLoder = new MyClassLoder();
        Object clazz = null ;
        try {
            clazz = myClassLoder.loadClass("/com/jvm/classLoder/StaticInit.class").newInstance();
            //clazz = myClassLoder.loadClass(StaticInit.class.getClass().toString());
            System.out.println("myclassload"+clazz.getClass().getClassLoader());
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(clazz.getClass());
        System.out.println("clssLoader "+clazz.getClass().getClassLoader());
        System.out.println(clazz instanceof com.jvm.classLoder.StaticInit);
    }


    @Override
    public Class<?> loadClass(String name) throws ClassNotFoundException {
        //读取文件的class
        //  InputStream path = this.getResourceAsStream(name.replace('\\', '/'));
        InputStream path = getClass().getResourceAsStream(name);
        if (path == null) {
            return super.loadClass(name);
        }

        byte[] b = null;
        try {
            b = new byte[path.available()];
            path.read(b);
            name = name.substring(0,name.lastIndexOf(".class"));
            name = name.replace("/", ".");
            name = name.substring(1, name.length());
            return defineClass(name, b, 0, b.length);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;

    }


}
