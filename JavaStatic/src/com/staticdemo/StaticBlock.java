package com.staticdemo;

public class StaticBlock {
	//Designing static block
	
	static {
		System.out.println("This is static block..");
	}
	
   public static void main(String[] args) {
	   System.out.println("This is main method..");
   }
	
	
	//here ,we get"This is static block"output first bcz 
   //       it is executed first, before main method.
}
