package com.proxy.study.jdk;
import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;



public class ProxyTest {
	public static void main(String[] args) throws IOException {
		huangniuInterface hl = (huangniuInterface) new ProxyBuyTicket().getInstance(new People());
		hl.buyTickek(10);
		byte date [] = ProxyGenerator.generateProxyClass("myproxy", new Class[]{huangniuInterface.class});
        OutputStream os = new FileOutputStream("C:/Users/jiangp/Desktop/$myproxy11.class");
        os.write(date);
        if(os!=null){
        	os.close();
        }
       
	}
}
