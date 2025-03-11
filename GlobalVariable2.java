package com.study;

public class GlobalVariable2 {
	
	double pi=3.14; //instance variable
	static double r=2.2;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("The area of circle");
		GlobalVariable2 gb=new GlobalVariable2();
		double area=gb.pi*r*r;
		System.out.println(area);
	}

}
