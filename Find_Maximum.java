package com.bridgelabz.generics;

// Generic class 
public class Find_Maximum<T extends Comparable<T>> {

	// Constant variables
	private final T VAR1;
	private final T VAR2;
	private final T VAR3;

	// Constructor
	public Find_Maximum(T var1, T var2, T var3) {
		this.VAR1 = var1;
		this.VAR2 = var2;
		this.VAR3 = var3;
	}

	// Method by using generic
	public static <T extends Comparable<T>> T testMaximum(T var1, T var2, T var3) {

		T max = var3;
		// comparing numbers using compareTo method.
		if (var1.compareTo(var2) > 0 && var1.compareTo(max) > 0) {
			max = var1;
			System.out.println("\n\nTC-1.1 :- " + max + " is maximum.");
		} else if (var2.compareTo(var1) > 0 && var2.compareTo(max) > 0) {
			max = var2;
			System.out.println("\nTC-1.2 :- " + max + " is maximum.");
		} else {
			System.out.println("\nTC-1.3 :- " + max + " is maximum.");
		}
		return max;
	}
}