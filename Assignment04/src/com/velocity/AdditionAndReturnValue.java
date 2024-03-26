package com.velocity;

/* 1. Write the java program to design method for addition of two number which returns 
 	  int results to that method and result should be print into main method. */

public class AdditionAndReturnValue {

	public int getAdd(int a, int b) {
		int z = a + b;
		return z;
	}

	public static void main(String[] args) {

		AdditionAndReturnValue additionAndReturnValue = new AdditionAndReturnValue();
		int z = additionAndReturnValue.getAdd(10, 20);
		System.out.println("Addition of 2 Number is>> " + z);

	}
}
