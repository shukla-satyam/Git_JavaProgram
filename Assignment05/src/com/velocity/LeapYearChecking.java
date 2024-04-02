package com.velocity;

//2.write a program  to check whether year is leap year or not. (If else stmt).

public class LeapYearChecking {

	public static void main(String[] args) {

		int num = 2018;
		if (num % 4 == 0) {
			System.out.println("Given Year is Leap Year");
		} else {
			System.out.println("Given Year is Not Leap Year");
		}

	}

}
