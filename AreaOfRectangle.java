package com.study;

import java.util.Scanner;

public class AreaOfRectangle {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the length of the Rectangle ");
		double length=sc.nextDouble();
		
		System.out.println("Enter the breadth  of the Rectangle ");
		double breadth =sc.nextDouble();
		
		double area=length*breadth ;
		System.out.println("AreaOfRectangle:"+area);
		
	}

}
