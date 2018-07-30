package com.jdk8.interfaces;

public class StringMethods {

	public static void main(String[] args) {
		String str ="udayaseetha";
		char[] c = new char[5];
		str.getChars(0, 5, c, 0);
		System.out.println(c);

	}

}
