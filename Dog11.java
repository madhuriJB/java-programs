package com.study;

class Animal11
{
	static void sleep()
	{
		System.out.println("sleeping");
	}
}

class Cat extends Animal11
{
	 static void eat()
	{
		System.out.println("eating");
	}
	
}
public class Dog11 extends Animal11
{
	static void bark()
	{
		System.out.println("barking");
	}

	public static void main(String[] args) 
	{
		//Cat c=new Cat();
		//eat();
		bark();
		sleep();
	}

}
