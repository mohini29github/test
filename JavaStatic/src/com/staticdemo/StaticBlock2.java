package com.staticdemo;

public class StaticBlock2 {
	//Designing static block
	
	static {
		System.out.println("This is 1st block");
	}
    static {
    	System.out.println("This is 2nd block");
    }
	static {
		System.out.println("This is 3rd block");
	}
	
	public static void main(String[] args) {
		System.out.println("This is main method");
	}
	
	
} // Block executed first, then go to main method.
