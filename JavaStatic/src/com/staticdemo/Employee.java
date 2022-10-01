package com.staticdemo;

public class Employee {
	
	String name="Aakash";
	int id=102;
	int salary=100000;
	static String orgName="Velocity";
	
	public static void main(String[] args) {
		 
		//Creating object
		Employee employee=new Employee();
		
		System.out.println("Employee name= "+employee.name);
		System.out.println("Employee id= "+employee.id);
		System.out.println("Employee salary= "+employee.salary);
		System.out.println("Employee orgName= "+employee.orgName);
		
		
		
	}

}
