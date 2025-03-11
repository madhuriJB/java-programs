package com.study;

public class FinalVariable {
	final static double pi=3.14;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//pi=9; // The variable which are final variable can't be updated.
		System.out.println(pi);

	}

}

//Any variable which is final in nature will never change its value.
//Yes both local and global variables can be final.
//If local variable is final its value will not be changed throughout the method.
//If global variable is final its value will not be changed throughout the class.
