package com.study;

import java.util.Scanner;

public class AreaOfTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the base of the Triangle");
		double base=sc.nextInt();
		
		System.out.println("Enter the height of the Triangle");
		double height=sc.nextInt();
		
		double area= 0.5*base*height;
		System.out.println("Area Of Triangle:"+area);
		
		sc.close();
	}

}
