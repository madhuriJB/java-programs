package com.study;

class Parent
{
	void dispay()
	{
		System.out.println("This is Parent");
	}
}
public class Child extends Parent {
	
	void display()
	{
		System.out.println("This is Child");
	}
	public static void main(String[] args) {
		
		Child c=new Child();
		c.display();
	}

}
