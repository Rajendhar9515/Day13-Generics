package com.bridgelabz.generics;

public class Main_Find_Maximum {
	//main method
	public static void main(String[] args) {
		
		// Displayed welcome message 
	    System.out.println("\t FIND MAXIMUM USING GENERIC \n");
	    
	    // Test Cases for integers.
	    Find_Maximum<Integer> ITC1 = new Find_Maximum<Integer>(45 , 38 , 24 , 15 , 42); //TC-1.1 :- max num at first position.
	    ITC1.testMaximum();
	    Find_Maximum<Integer> ITC2 = new Find_Maximum<Integer>(18, 28, 19 , 10 , 12);  //TC-1.2 :- max num at second position.
	    ITC2.testMaximum();
	    Find_Maximum<Integer> ITC3 = new Find_Maximum<Integer>(75, 52, 120 , 80 , 117); //TC-1.3 :- max num at third position.
	    ITC3.testMaximum();
	    
	    // Test cases for floats. 
	    Find_Maximum<Float> FTC1 = new Find_Maximum<Float>(15.5f, 12.8f, 9.56f , 7.24f , 13.53f); 
	    FTC1.testMaximum();
	    Find_Maximum<Float> FTC2 = new Find_Maximum<Float>(12.4f, 25.8f, 15.7f , 17.2f , 2.84f); 
	    FTC2.testMaximum();
	    Find_Maximum<Float> FTC3 = new Find_Maximum<Float>(14.2f, 18.7f, 28.9f , 14.5f , 22.3f); 
	    FTC3.testMaximum();
	    
	    // Test cases for Strings. 
	    Find_Maximum<String> STC1 = new Find_Maximum<String>("Yesdhani", "Nikhil", "Ajay", "Sam", "Ram");  //TC-1.1 :- max string at first position.
	    STC1.testMaximum();
	    Find_Maximum<String> STC2 = new Find_Maximum<String>("car", "train", "bike", "bus", "jeep");  //TC-1.2 :- max string at second position.
	    STC2.testMaximum();
	    Find_Maximum<String> STC3 = new Find_Maximum<String>("bat", "ball", "wickets", "Stump", "jersey"); //TC-1.3 :- max string at third position. 
	    STC3.testMaximum();
	}
}
