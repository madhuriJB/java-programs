package com.study;

import java.util.Scanner;

public class ScannerProgram {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter 1st Value");
		int a=sc.nextInt();
		System.out.println("Enter 2nd Value");
		int b=sc.nextInt();
		
		int c=a+b;
		System.out.println("Result:"+c);
		
	}

}
