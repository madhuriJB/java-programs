package com.study;
class Animal
{
	static void eat()
	{
		System.out.println("Eating");
	}
}

class Dog1 extends Animal
{
	static void sleep()
	{
		System.out.println("Sleeping");
	}
	
}

public class Dog extends Dog1{
	void bark()
	{
		System.out.println("Barking");
	}
	
	public static void main(String[] args) {
		Dog d=new Dog();
		eat();
		sleep();
		d.bark();
		
	}

}
