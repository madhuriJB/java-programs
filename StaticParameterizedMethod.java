package com.study;

public class StaticParameterizedMethod {
	
	static void add(int x, int y)
	{
		System.out.println(x+y);
	}
	
	static void sub(int x, int y)
	{
		System.out.println(x-y);
	}
	
	static void mul(double x, double y, int z)
	{
		System.out.println(x*y*z);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add(10, 20);
		sub(20, 10);
		mul(1.5, 5.5, 12);

	}

}
