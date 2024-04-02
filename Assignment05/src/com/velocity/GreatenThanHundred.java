package com.velocity;

//6. Write the program to check whether the no is greater than 100.

public class GreatenThanHundred {

	public static void main(String[] args) {

		int num = 110;
		if (num > 100) {
			System.out.println("The number is greater than hundred");
		} else if (num >= 100) {
			System.out.println("Number is Greater than hundred");
		} else {
			System.out.println("Provided input is not greated than hundred");
		}
	}
}
