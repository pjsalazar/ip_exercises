package com.salazar.peter.lesson1;

public class  LoopingTest{
	// Create a class that displays numbers 1 - 10 using a while statement.
	// Repeat the output in reverse order using a for statement.
	// Display only the even numbers 1 - 20 using a loop of some kind.


	public static void main(String[] args) {
		printRange(10);
		printRev(10);
		printEvens(20);
	}

	public static void printRange(int max) {
		// Prints integers from 1 to max

		int i = 1;
		while (i <= 10) {
			System.out.println(i++);
			if (i > 100) {
				break;
			}
		}
	}

	public static void printRev(int max) {
		// Prints integers from max to 1 (descending)
		
		for (int i = max; i >= 1; i--) {
			System.out.println(i);
		}
	}	

	public static void printEvens(int max) {
		// Print even integers from 1 to max

		for (int i = 2; i <= 20; i=i+2) {
			System.out.println(i);
		}
	}
}