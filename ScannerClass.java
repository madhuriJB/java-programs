package com.study;

import java.util.Scanner;

public class ScannerClass {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int a=sc.nextInt();
		byte b=sc.nextByte();
		float c=sc.nextFloat();
		double d=sc.nextDouble();
		boolean e=sc.nextBoolean();
		short f=sc.nextShort();
		long g=sc.nextLong();
		String h=sc.next();
		
		sc.close();
		
	}

}
