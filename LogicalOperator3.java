package com.study;

public class LogicalOperator3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//OR Not
		
		int a=10, b=20;
		if(!(a==b || b>=a)) 
		{
			System.out.println("Block is Executed");
		}else {
			System.out.println("Not Executed");
		}

	}

}
