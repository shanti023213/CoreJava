package com.jdk8.interfaces;

public class StaticMethodOnvok {
	
	public static String foo(){ System.out.println("Test foo called"); return "";
	}
	public static void main(String args[]){
		StaticMethodOnvok obj = null; 
		System.out.println(obj.foo());
	}

}

