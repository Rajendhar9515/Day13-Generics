package com.bridgelabz.generics;

public class Find_Maximum {
	
	// Method by using generic
	public <T extends Comparable<T>> T findMax(T var1, T var2, T var3) {

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
