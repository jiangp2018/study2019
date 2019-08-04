package com.gpProxy.study;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class GPProxy {
	
	//换行符
	private static String rn="/r/n";
	// 自己的代理
	public static Object newProxyInstance(ClassLoader loader,
			Class<?>[] interfaces, InvocationHandler h)
			throws IllegalArgumentException {
	try {
		//1.生成源代码
		getProxyClass(loader,interfaces[0]);
		//2、将生成的源代码输出到磁盘，保存为.java文件
        String path=GPProxy.class.getResource("").getPath();
        File  file = new File(path+"$myproxy0.java");
		FileWriter fw = new FileWriter(file);
		fw.write(path);
		fw.flush();
		fw.close();
	} catch (IOException e) {
		e.printStackTrace();
	}
	 return h;
             
	}

	
	public static String getProxyClass(ClassLoader loader, Class<?> interfaces){
		StringBuilder sb = new StringBuilder();
		sb.append("package com.gpProxy.study"+ rn);
		sb.append("import com.gpProxy.study"+ rn);
		sb.append("public class $myProxy"+ rn);
		sb.append("public class $myProxy implements  "+ interfaces.getName()+"{"+rn );
		sb.append("GPInvocationHandler h;" + rn);
		sb.append("public $Proxy0(GPInvocationHandler h) {" + rn);
		sb.append("this.h = h;" + rn);
		sb.append("}" + rn);
		
		for (Method m : interfaces.getMethods()) {
			sb.append("public " + m.getReturnType().getName() + " " + m.getName() + "(){" + rn);
			sb.append("try{" + rn);
			sb.append("Method m = " + interfaces.getName() + ".class.getMethod(\"" +m.getName()+"\",new Class[]{});" + rn);
			sb.append("this.h.invoke(this,m,null);" + rn);
			sb.append("}catch(Throwable e){e.printStackTrace();}" + rn);
			sb.append("}" + rn);
		}
		
		sb.append("}");
		return sb.toString();

	}

}
