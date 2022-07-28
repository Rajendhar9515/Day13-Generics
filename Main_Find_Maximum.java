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
	}

}
