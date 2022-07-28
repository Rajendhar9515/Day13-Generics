package com.bridgelabz.generics;

public class Find_Maximum {

	// Method with parameters as Integer
	public void integerMax(Integer num1, Integer num2, Integer num3) {

		// comparing numbers using compareTo method.
		if (num1.compareTo(num2) > 0 && num1.compareTo(num3) > 0) {
			System.out.println("\n" + num1 + " is maximum.");
		} else if (num2.compareTo(num1) > 0 && num2.compareTo(num3) > 0) {
			System.out.println("\n" + num2 + " is maximum.");
		} else {
			System.out.println("\n" + num3 + " is maximum.");
		}
	}

	// Method with parameters as Float
	public void floatMax(Float num1, Float num2, Float num3) {

		// comparing numbers using compareTo method.
		if (num1.compareTo(num2) > 0 && num1.compareTo(num3) > 0) {
			System.out.println("\n\nTC-1.1 :- " + num1 + " is maximum.");
		} else if (num2.compareTo(num1) > 0 && num2.compareTo(num3) > 0) {
			System.out.println("\nTC-1.2 :- " + num2 + " is maximum.");
		} else {
			System.out.println("\nTC-1.3 :- " + num3 + " is maximum.");
		}
	}

	// Method with parameters as String
	public void stringMax(String S1, String S2, String S3) {

		// comparing numbers using compareTo method.
		if (S1.compareTo(S2) > 0 && S1.compareTo(S3) > 0) {
			System.out.println("\n\nTC-1.1 :- " + S1 + " is maximum.");
		} else if (S2.compareTo(S1) > 0 && S2.compareTo(S3) > 0) {
			System.out.println("\nTC-1.2 :- " + S2 + " is maximum.");
		} else {
			System.out.println("\nTC-1.3 :- " + S3 + " is maximum.");
		}
	}
}
