package com.study;

import java.util.Scanner;

public class CircumferanceOfSquare {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Circumferance of Square");
		double side=sc.nextDouble();
		
		double circumferance =4*side;
		
		System.out.println("The Circumferance of Square:"+ circumferance );
		
	}

}
