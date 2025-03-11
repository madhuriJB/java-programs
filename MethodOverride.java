package com.study;


class Override
{
	void add() //if we keep method as final it cant be overriden and give you Compile time error
	{
		int a=10;
		int b=20;
		System.out.println(a+b);
	}
}
public class MethodOverride extends Override{
	
	void add() //Compile time error
	{

		int a=40;
		int b=10;
		System.out.println(a-b);
	}	
	
	public static void main(String[] args) {
		MethodOverride mo=new MethodOverride();
		mo.add();
	}

}
