package com.staticdemo;

public class Test {
	//Why static variable call single copy
	
	int x=10;          //Declaration
	static int y=10;   //Initialization

	public static void main(String[] args) {
		
		Test test1 = new Test(); //Creating object of class
		System.out.println("Non static x= "+test1.x++); //10
		System.out.println("Static y= "+y++);           //10
		
		Test test2 = new Test(); //Creating object of class
		System.out.println("Non static x= "+test2.x++); //10
		System.out.println("Static y= "+y++);           //11
		
		
		Test test3 = new Test(); //Creating object of class
		System.out.println("Non static x= "+test3.x++);//10
		System.out.println("Static y= "+y++);          //12
		
	    Test test4 = new Test(); //Creating object of class
	    System.out.println("Non static x= "+test4.x++);//10
	    System.out.println("Static y= "+y++);          //13
	
	
	}//int x=10 non-static, create while object creation
	//int  y=20,static,     create while class crate/load
}//                         created once copy continue
