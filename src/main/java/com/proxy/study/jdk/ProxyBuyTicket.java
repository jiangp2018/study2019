package com.proxy.study.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyBuyTicket implements InvocationHandler {
	private People  people;
	
	public Object  getInstance(People people2){
		this.people=people2;
		try {
			Class clazz= people2.getClass();
			System.out.println("clazz="+clazz);
			System.out.println("clazz.getClassLoader()="+clazz.getClassLoader());
			System.out.println("clazz.getClassLoader().getParent()="+clazz.getClassLoader().getParent());
			return Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
		} catch (Exception e) {
			e.printStackTrace();
		}	finally{
			System.out.println("finally ");
		}
		return null;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		System.out.println("jdk");
		method.invoke(people, args);
		return null;
	}

}
