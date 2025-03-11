package com.study;

public class NonStaticMethod2 {
	int a=10;
	int b=20;

	void add()
	{
		System.out.println(a+b);
	}
	
	void sub()
	{
		System.out.println(a-b);
	}
	
	static void mul()
	{
		System.out.println(10*20);
	}

	static void div()
	{
		System.out.println(20/10);
	}
	public static void main(String[] args) {
		NonStaticMethod2 ns= new NonStaticMethod2();
		ns.add();
		ns.sub();
		mul();
		div();

	}

}
