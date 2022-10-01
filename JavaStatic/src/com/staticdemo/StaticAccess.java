package com.staticdemo;

public class StaticAccess {
	//How to access static members from non-static members.
	
	void m2() {            //non-static method
		System.out.println("This is non-static method");
		m1();
	}
	static void m1() {    //static method
		System.out.println("This is static method");
	}	
	
	public static void main(String[] args) {
		StaticAccess staticAccess=new StaticAccess(); //Creating object
		staticAccess.m2();              //Calling static method using object
	}

}
// we can call- static from non-static 
// but cannot call- non-static from static (bcz static members stored )
//              in memory before non-static0