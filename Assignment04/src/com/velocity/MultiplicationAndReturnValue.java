package com.velocity;

/*3. Write the java program to design method for multiplication of two number 
     which returns int value to that method and result should be print into main */

public class MultiplicationAndReturnValue {

	public int getMultiply(int a, int b) {

		int z = a * b;
		return z;
	}

	public static void main(String[] args) {

		MultiplicationAndReturnValue multiplicationAndReturnValue = new MultiplicationAndReturnValue();
		int z = multiplicationAndReturnValue.getMultiply(20, 20);
		System.out.println("Multiplication of 2 Number>> " + z);

	}
}
