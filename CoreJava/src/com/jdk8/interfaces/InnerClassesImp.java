package com.jdk8.interfaces;

class test{
	
	public void printList(){
		System.out.println("test parent");
	}
}
public class InnerClassesImp {

	public static void main(String[] args) {
		test obj = new test(){
						public void printList(){
							System.out.println("test child");
						}
					};
					obj.printList();
	}

}
