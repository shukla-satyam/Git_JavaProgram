package com.velocity;

//5. Write the Java Program to calculate total of five subject marks and average of it.

public class CalculateAndAverage {

	public static int getAverage(int a, int b, int c, int d, int e) {
		int z = a + b + c + d + e;
		return z;

	}

	public static void main(String[] args) {

		int z = CalculateAndAverage.getAverage(60, 40, 50, 70, 50);
		System.out.println("Calculation of total five subject>> " + z);
		System.out.println("Average of 5 five marks is>> " + (z / 5));
	}
}
