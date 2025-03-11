package com.study;

import java.util.Scanner;

public class CircumferanceOfCircle {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the value of PI");
		double pi=sc.nextDouble();
		
		System.out.println("Enter the value of radious");
		int radious=sc.nextInt();
		
		double circumference=2*pi*radious;
		System.out.println("Result:"+circumference);
		
		sc.close();
	}

}
