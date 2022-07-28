package com.bridgelabz.generics;

public class Main_Find_Maximum {

	// main method
	public static void main(String[] args) {

		// Displayed welcome message
		System.out.println("/t FIND MAXIMUM USING GENERICS \n");

		// Test Cases for integer.
		Find_Maximum.testMaximum(45, 38, 24, 22, 32); // TC-1.1 :- max num at first position.
		Find_Maximum.testMaximum(18, 28, 19, 9, 17); // TC-1.2 :- max num at second position.
		Find_Maximum.testMaximum(75, 52, 12, 35, 47); // TC-1.3 :- max num at third position.

		// Test cases for floats.
		Find_Maximum.testMaximum(15.5f, 12.8f, 9.56f, 14.5f, 17.5f);
		Find_Maximum.testMaximum(12.4f, 25.8f, 15.7f, 4.7f, 8.9f);
		Find_Maximum.testMaximum(14.2f, 18.7f, 28.9f, 12.3f, 19.6f);

		// Test cases for Strings.
		Find_Maximum.testMaximum("Raj", "Ajay", "Pavan", "Rakesh", "Somu"); // TC-1.1 :- max string at first position.
		Find_Maximum.testMaximum("Car", "Cycle", "Bus", "Zeep", "Bike"); // TC-1.2 :- max string at second position.
		Find_Maximum.testMaximum("Bat", "Ball", "Stump", "Wickets", "Jersey"); // TC-1.3 :- max string at third
																				// position.
	}
}
