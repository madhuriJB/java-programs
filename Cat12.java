package com.study;

class Animal12
{
	void sound()
	{
		System.out.println("Animal makes sound");
	}
}
public class Cat12 extends Animal12 {
	
	void sound()
	{
		super.sound();
		System.out.println("Cat Meows");
		
	}
	public static void main(String[] args) {
		Cat12 ct=new Cat12();
		ct.sound();
	}

}
