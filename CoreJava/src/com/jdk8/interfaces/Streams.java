package com.jdk8.interfaces;

import java.util.ArrayList;

public class Streams {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<100;i++){
			list.add(i);
		}
		list.parallelStream().forEach(System.out::println);
	}

}
