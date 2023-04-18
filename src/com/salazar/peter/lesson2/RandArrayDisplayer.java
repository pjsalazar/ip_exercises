package com.salazar.peter.lesson2;

public class RandArrayDisplayer {

	private int[] randArr;
	
	public static void main (String[] args) {
		RandArrayDisplayer rad = new RandArrayDisplayer();
		rad.process();
	}
	
	private void process() {
		fillArray(10);
		printArray();
	}
	
	private void printArray() {
		for (int i = 0; i < randArr.length; i++) {
			System.out.print(i + ":");
			System.out.println(randArr[i]);
		}
	}
	
	private void fillArray(int length) {
		
		randArr = new int[length];
		
		for (int i = 0; i < length; i++) {
			randArr[i] = (int)(Math.random() * 100);
		}
	}
}
