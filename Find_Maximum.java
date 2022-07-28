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

}
