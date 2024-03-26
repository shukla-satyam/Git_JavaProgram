package com.velocity;

/*4. Write the java program to design method for division of two number 
     which returns int value to that method and result should be print into main method.*/

public class DivisonAndReturnValue {

	public static int getDivi(int a, int b) {
		int z = a / b;
		return z;
	}

	public static void main(String[] args) {

		int z = DivisonAndReturnValue.getDivi(10, 5);
		System.out.println("Divison of 2 Number>> " + z);
	}
}
