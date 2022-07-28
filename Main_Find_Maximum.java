package com.bridgelabz.generics;

public class Main_Find_Maximum {
	
	// main method
	public static void main(String[] args) {
		
		// Displayed welcome message
		System.out.println("\t FIND MAXIMUM USING GENERICS \n");

		Find_Maximum object = new Find_Maximum();

		// Test Cases for integers.
		object.findMax(45, 38, 24); // TC-1.1 :- max num at first position.
		object.findMax(18, 28, 19); // TC-1.2 :- max num at second position.
		object.findMax(75, 52, 120); // TC-1.3 :- max num at third position.

		// Test cases for floats.
		object.findMax(15.5f, 12.8f, 9.56f); // TC-1.1 :- max num at first position.
		object.findMax(12.4f, 25.8f, 15.7f); // TC-1.2 :- max num at second position.
		object.findMax(14.2f, 18.7f, 28.9f); // TC-1.3 :- max num at third position.

		// Test cases for Strings.
		object.findMax("Yesdhani", "Nikhil", "Ajay"); // TC-1.1 :- max string at first position.
		object.findMax("car", "cycle", "bike"); // TC-1.2 :- max string at second position.
		object.findMax("bat", "ball", "wickets"); // TC-1.3 :- max string at third position.
	}
}
