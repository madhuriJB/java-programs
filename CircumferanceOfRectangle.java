package com.study;

import java.util.Scanner;

public class CircumferanceOfRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the length of the Rectangle");
		double length=sc.nextDouble();
		
		System.out.println("Enter the breadth of the Rectangle");
		double breadth=sc.nextDouble();
		
		double circumferance=2*(length+breadth);
		System.out.println("Circumferance Of Rectangle:"+ circumferance);
		

	}

}
