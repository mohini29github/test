package com.staticdemo;

public class StaticVariable {
	//Calling static variable by different ways
	
	                    //Declaration of static variable
     static int x;
                        //Initialization of static variable
     static int y=10;
     
     public static void main(String[] args) {
    	 
    	 //calling static variable-by using class name
    	 System.out.println("The value of y= "+StaticVariable.y);
    	 
    	 //calling static variable-by object creation
    	 StaticVariable staticVariable=new StaticVariable();
    	 System.out.println("The value of y with objet= "+staticVariable.y);
    	 
    	 //Calling static variable- directly within same class
    	 System.out.println("The value of y directly= "+y);
    	 
     }
	
	
	
}
