package com.velocity;

//4.Write a program to print month of year. Case 1 January case 2 February case n....use switch case

public class MonthOfYear {

	public static void main(String[] args) {
		
		int num=7;
		switch(num) {
		
		case 1:
			System.out.println("January");
			
		case 2:
			System.out.println("Febuary");
		
		case 3:
			System.out.println("March");
			
		case 4:
			System.out.println("April");
			
		case 5:
			System.out.println("May");
		
		case 6:
			System.out.println("June");
			
		case 7:
			System.out.println("July");
				
		case 8:
			System.out.println("Augst");
			
		case 9:
			System.out.println("Spetember");
			
		case 10:
			System.out.println("October");
					
		case 11:
			System.out.println("November");
				
		case 12:
			System.out.println("December");
			break;
		default:
			System.out.println("Exit from the Year");	
		}
	}
}
