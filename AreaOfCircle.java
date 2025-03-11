package com.study;

import java.util.Scanner;

public class AreaOfCircle {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Area of Circle");
		double pi=sc.nextDouble();
		
		System.out.println("Enter the Radious");
		int r=sc.nextInt();
		
		double area=pi*r*r;
		System.out.println("Area of Circle:"+area);
		sc.close();
		
	}

}
