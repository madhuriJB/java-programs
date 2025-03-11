package com.study;

class Amazon2
{
	Amazon2()
	{
		System.out.println("This is Grnad Parent Constructor");
	}
}

class Amazon1 extends Amazon2
{
	Amazon1(String un, String Pw)
	{
		System.out.println("This is Parent Constructor");
	}
}
public class Amazon extends Amazon1 
{
	
	Amazon()
	{
		super("madhuri@gmail.com", "");
		System.out.println("This is Child Constructor");
	}
	
	public static void main(String[] args) {
		
		new Amazon();
	}

}
