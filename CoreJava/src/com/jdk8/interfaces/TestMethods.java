package com.jdk8.interfaces;

public interface TestMethods {

	void printList();
	default void firstMethodInInterface(){
		System.out.println("Successfully written implementation for java interface method");
	}
	default void firstMethodInInterface1(){
		System.out.println("Successfully written implementation for java interface method");
	}
	
	static void show(){
		System.out.println("My first static method in my Interface :");
	}
}
