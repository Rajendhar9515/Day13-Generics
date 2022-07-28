package com.bridgelabz.generics;

public class Main_Find_Maximum {

	// main method
	public static void main(String[] args) {

		/** Displayed welcome message **/
		System.out.println("/t FIND MAXIMUM USING GENERICS \n");

		Find_Maximum object = new Find_Maximum();

		/** Test Cases **/
		object.integerMax(45, 38, 24); // TC-1.1 :- max num at first position.
		object.integerMax(18, 28, 19); // TC-1.2 :- max num at second position.
		object.integerMax(75, 52, 120); // TC-1.3 :- max num at third position.

		/** Test cases for floats. **/
		object.floatMax(15.5f, 12.8f, 9.56f);
		object.floatMax(12.4f, 25.8f, 15.7f);
		object.floatMax(14.2f, 18.7f, 28.9f);
	}
}
