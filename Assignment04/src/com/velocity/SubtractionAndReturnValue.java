package com.velocity;

/*2. Write the java program to design method for subtraction of two number 
     which returns int value to that method and result should be print into main method.*/

public class SubtractionAndReturnValue {

	public static int getSub(int a, int b) {
		int z = a - b;
		return z;
	}

	public static void main(String[] args) {

		System.out.println("Subtraction of 2 Number is>> " + getSub(20, 10));
	}
}
