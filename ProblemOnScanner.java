package com.study;

import java.util.Scanner;

public class ProblemOnScanner {
	
	
	static void add(int a, int b)
	{
		int sum=a+b;
		System.out.println(sum);
	}
	
	static void sub(int a, int b)
	{
		int sub=a-b;
		System.out.println(sub);
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the value of a");
		int a=sc.nextInt();
		
		System.out.println("Enter the value of b");
		int b=sc.nextInt();
		
		System.out.println("Addition of two numbers:");
		add(a, b);
		
	}

}
