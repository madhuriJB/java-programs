package com.study;


class Methods
{
	void add(int a, int b)
	{
		System.out.println(a+b);
	}
	
	void sub(int a, int b)
	{
		System.out.println(a-b);
	}
}
public class Calc extends Methods{
	public static void main(String[] args) {
		Calc cl=new Calc();
		cl.add(10, 20);
		cl.sub(50, 40);
		
		
	}
	
	
}
