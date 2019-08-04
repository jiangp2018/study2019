package com.proxy.cgilb;
import com.proxy.study.jdk.huangniuInterface;
import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;



public class ProxyTest {
	public static void main(String[] args) throws IOException {
	//	People  people = (People) new CglibProxy().getInstance( People.class);
		// huangniuInterface hl = new ProxyBuyTicket().getInstance(new People());
		People  people = new People();
				people.buyTickek(12);
		byte date [] = ProxyGenerator.generateProxyClass("myproxy", new Class[]{huangniuInterface.class});
        OutputStream os = new FileOutputStream("C:/Users/jiangp/Desktop/$myproxy11.class");
        os.write(date);
        if(os!=null){
        	os.close();
        }
       
	}
}
