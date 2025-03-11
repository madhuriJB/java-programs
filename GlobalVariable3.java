package com.study;

public class GlobalVariable3 
{
	int a=30;
	static double c=1.2;
	
	public static void main(String[] args) {
		GlobalVariable3 gb=new GlobalVariable3();
		gb.a=100;
		System.out.println(gb.a);// To update non-static global variable.
		
		
		c=2.4;
		System.out.println(c);// To update static global variable.
		
		
		
		/*
		int Madhuri=100;
		Madhuri=200;
		System.out.println(Madhuri);
		*/
		

	}
}

//To update global variable value create object and with the ref variable you can called it.
//Local variable can be updated at very next line but not for global variable.
//You can't declare and initialized global variables in two lines. if you want to initialized it after declaration you have to do it in main method