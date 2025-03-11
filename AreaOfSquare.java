package com.study;

import java.util.Scanner;

public class AreaOfSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the side of the square");
		int side=sc.nextInt();
		
	
		int area=side*side;
		System.out.println("Area of Square:"+area);

	}

}
