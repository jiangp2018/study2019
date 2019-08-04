package com.proxy.study.jdk;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import sun.misc.ProxyGenerator;



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
