package com.study;

public class ImportingClasses {
//Math class methods//--> 1. only have static methods --> access classname.method name
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Math.addExact(20, 20));
		//2 methods 1) int int 2)long long
		
		System.out.println(Math.subtractExact(30, 40));
		//2 methods 1) int int 2)long long
		
		System.out.println(Math.multiplyExact(10, 10));
		//3 methods 1) int int 2)int long 3)long long
		
		System.out.println(Math.max(10.11, 20.22));
		//4 methods 1) double double 2) float float 3) int int 4)long long
		
		System.out.println(Math.min(400, 215));
		//4 methods 1) double double 2) float float 3) int int 4)long long
		
		System.out.println(Math.abs(-20)); //absolute --> -ve number convert to positive
		//4 Method double, float, int, long
		
		double pivalue=Math.PI; //here Math is a class and PI is a global variable.
		
		System.out.println(Math.random()); //ex. taking screenshots of multiple failed test cases
		
		
	}

}
