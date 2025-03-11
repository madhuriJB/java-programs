package com.study;

class Employee
{
	
	static void fname(String name)
	{
		System.out.println(name);
	}
	
}

public class Tester extends Employee
{
	static void lname(String name)
	{
		System.out.println(name);
	}
		
	public static void main(String[] args) 
		{
		
		fname("Madhuri");
		lname("Brahmane");
			
		}
}
