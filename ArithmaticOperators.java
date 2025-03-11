package com.study;

public class ArithmaticOperators {
	
	static void add() {
		int a=10;
		int b=20;
		int sum=(a+b);
		System.out.println(sum);
	}
	
	static void sub() {
		int a=10;
		int b=20;
		int sub=(a-b);
		System.out.println(sub);
	}
	
	static void mul() {
		int a=10;
		int b=20;
		int mul=(a*b);
		System.out.println(mul);
	}
	
	static void div() {
		int a=10;
		int b=20;
		int div=(b/a);
		System.out.println(div);
	}
	
	static void mod() {
		int a=10;
		int b=20;
		int mod=(b%a);
		System.out.println(mod);
	}
	public static void main(String[] args) {
		add();//this is how we called static method
		sub();
		mul();
		div();
		mod();
	}

}
