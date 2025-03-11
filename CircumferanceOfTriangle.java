package com.study;

import java.util.Scanner;

public class CircumferanceOfTriangle {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the first side of the triangle");
		double a=sc.nextDouble();
		
		System.out.println("Enter the second side of the triangle");
		double b=sc.nextDouble();
		
		System.out.println("Enter the Third side of the triangle");
		double c=sc.nextDouble();
		
		double circumferance=a+b+c;
		System.out.println("The circumference of the triangle:"+ circumferance);
	}

}
