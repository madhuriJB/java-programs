package com.study;

public class LocalVariable {
	
	void add(int a, int b)
	{
		System.out.println(a+b);
	}
	
	void add(int x, float y, double z)
	{
		System.out.println(x+y+z);
	}
	
	static void Name()
	{
		String name = "Madhuri";
		System.out.println(name);
	}
	
	static void sub(int a, double b)
	{
		System.out.println(a-b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalVariable v = new LocalVariable();
		v.add(10, 30);
		v.add(5, 1.2f, 2.23);
		sub(30, 10);
		Name();
		
		
	}

}
