package com.study;


class Vehical
{
	static void drive()
	{
		System.out.println("This is Car");
	}
}

public class Car extends Vehical
{
	
	static void drive()
	{
		System.out.println("This is Vehical");
	}
	

	public static void main(String[] args) {
		//Vehical vh =new Vehical(); should avoid to create object of parent class. Always create object of child class.
		Car cr=new Car();
		//drive1();
		cr.drive();
	}
	

}


