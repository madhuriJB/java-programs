package com.study;


class Vehical11
{
	Vehical11()
	{
		
		System.out.println("Vehicals");
	}
}

class Car11 extends Vehical11

{
  Car11()
  {
	  super();
	  System.out.println("This is Car");
  }
}

public class Bike extends Car11 {
	
	Bike()
	{
		System.out.println("This is Bike");
	}
	public static void main(String[] args) {
		new Bike();
	}

}
