package com.study;

public class Student {
	Student()
	{
		this("madhuri@gmail.com");// this calling statement
		System.out.println("1");
	}
	 
	 Student(String email)
	 {
		 this("Madhuri", 11, 29);
	 }
	 
	 Student(String name, int id, long number)
	 {
		 System.out.println("Name:"+name);
		 System.out.println("ID:"+id);
		 System.out.println("Number:"+number);
	 }
	
	public static void main(String[] args) {
		new Student();
	}

}
