package com.eric.main;

import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;

public class Main {

	public static void main(String[] args) throws Exception{
		//JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
		//int result = compiler.run(null, null, null, "C:\\Users\\Eric\\Desktop\\Hello.java");
		//System.out.println(result == 0? "success":"fail");
		
		//Runtime runtime = Runtime.getRuntime();
		//Process process = runtime.exec("javac C:\\Users\\Eric\\Desktop\\Hello.java");
		System.out.println(Main.class.getClassLoader());
		System.out.println(String.class.getClassLoader());
		System.out.println(String.class.getClassLoader());
		System.out.println(String.class.getClassLoader());
	}

}
