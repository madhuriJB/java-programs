package com.study;

public class ConstructorOverloading {
	
	ConstructorOverloading ()
	{
		System.out.println("This is my first constructor");
	}
	
	ConstructorOverloading(int a, int b)
	{
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ConstructorOverloading();
		new ConstructorOverloading(20, 30);
		
	}

}
