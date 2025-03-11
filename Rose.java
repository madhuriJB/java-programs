package com.study;

class Flowers
{
	Flowers(String name)
	{
		System.out.println("These are flowers");
	}
}

class Lotus extends Flowers
{
	Lotus()
	{
		super("Lotus");
		System.out.println("I am Lotus");
	}
	
}

public class Rose extends Lotus{
	
	Rose()
	{
		System.out.println("I am Rose");
	}
	
	public static void main(String[] args) {
		new Rose();
		
	}

}
