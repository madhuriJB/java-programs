package com.study;

public class NonStaticMethod {
	
	int a=10;
	int b=20;

	void add() 
	{
		System.out.println(a+b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NonStaticMethod ns=new NonStaticMethod();
		ns.add();
		
	}

}
