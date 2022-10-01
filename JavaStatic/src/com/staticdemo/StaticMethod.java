package com.staticdemo;

public class StaticMethod {
	
	//Designing static method
	static void m1() {
		System.out.println("This is static method");                  
      }
	public static void main(String[] args) {
		
		//Calling method using class name
		StaticMethod.m1();
		
		//Calling method using object
		StaticMethod staticMethod=new StaticMethod();
		staticMethod.m1();
		
		//Calling method directly(within same class)
		m1();
		
		
		
	}
		

}
