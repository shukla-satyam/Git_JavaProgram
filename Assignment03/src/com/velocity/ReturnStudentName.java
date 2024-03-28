package com.velocity;

//1. Design the separate method as String getStudentName (String name) which return student name and print it.

public class ReturnStudentName {

	public String getStudentName(String name) {

		return name;

	}

	public static void main(String[] args) {

		ReturnStudentName returnStudentName = new ReturnStudentName();
		String s = returnStudentName.getStudentName("Sanket");
		System.out.println("Student name is>>" + s);
	}

}
