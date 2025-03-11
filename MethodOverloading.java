package com.study;

public class MethodOverloading {

	static void add(int a, int b)
	{
			
		System.out.println(a+b);
	}
	
	static void add(int a, double b)
	{
		System.out.println(a*b);
	}
	
	void sub(int a, int b)
	{
		System.out.println(a-b);
	}
	
	void sub(int a, float c)
	{
		System.out.println(a+c);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading mo = new MethodOverloading();
		add(10, 50);
		add(20,3.14);
		mo.sub(20, 10);
		mo.sub(20, 2.12f);
	}

}
