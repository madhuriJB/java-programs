package com.study;
//Inheritance
class Parent_Class {
	static void add() 
	{
		int a=10;
		int b=20;
		int sum=a+b;
		System.out.println(sum);
	}
}

public class Student_Class extends Parent_Class {
	static void sub() 
	{
		int a=10;
		int b=20;
		int sub=a-b;
		System.out.println(sub);
	}

	public static void main(String[] args) {

		add();
		sub();
	}
}