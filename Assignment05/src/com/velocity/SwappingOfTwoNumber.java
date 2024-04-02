package com.velocity;

//8. Write a program to swap the two numbers.

public class SwappingOfTwoNumber {

	static int a = 10;
	static int b = 20;
	static int c;

	public static void main(String[] args) {
		/*
		 * int a=2; int b=4; int c=9;
		 */
		System.out.println("Before Swapping");
		System.out.println("a :" + a + " " + "b :" + b);
		c = a;
		System.out.println(a);
		a = b;
		System.out.println(b);
		b = c;
		System.out.println(c);
		System.out.println("After Swapping");
		System.out.println("a :" + a + " " + "b :" + b);
	}
}
