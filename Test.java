package com.study;

class Animal2 {

	public void sound() 
	{
		System.out.println("Animal makes sound");
	}
}

class Dog2 extends Animal2 {
	public void sound() 
	{
		System.out.println("Dog barks");
	}
}

class Cat2 extends Animal2 {
	public void sound() 
	{
		System.out.println("Cat meows");
	}

}

public class Test {
	public static void main(String[] args) {
		Dog2 d = new Dog2();
		d.sound();

		//Cat2 c = new Cat2();
		//c.sound();
	}
}

