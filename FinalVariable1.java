package com.study;

public class FinalVariable1 {
	
	static void areaOfCircle()
	{
		final double pi=3.14;
		
		int radious=10;
		double area= pi*radious*radious;
		System.out.println(area);
	}
	
	public static void main(String[] args) {
		areaOfCircle();
	}

}
