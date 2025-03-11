package com.study;

public class GlobalVariable {
	
	static int a=10;//global variable
	static int b=20;//Global variable
	 
	static void addition()
	{
		int c=10; //local variable
	
		System.out.println(a+b);
	}
	
	static void subtraction()
	{
		System.out.println(a-b);
	}
	
	static void multiplication()
	{
		System.out.println(a*b);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addition();
		subtraction();
		multiplication();

	}

}
