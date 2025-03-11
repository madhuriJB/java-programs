package com.study;

public class NonStaticParameterized {
	//int a=2;
	//int b=4;
	
	void add(int a, int b) 
	{
		System.out.println(a+b);
	}

	void sub(int a, int b)
	{
		System.out.println(a-b);
	}
	
	void mul(int a, int b)
	{
		System.out.println(a*b);
	}
	
	void Name(String name)
	{
		System.out.println(name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NonStaticParameterized ns = new NonStaticParameterized();
		ns.add(2, 4);
		ns.sub(2, 4);
		ns.mul(8, 2);
		ns.Name("Madhuri");
	}

}
