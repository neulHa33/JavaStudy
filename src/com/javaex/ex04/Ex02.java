package com.javaex.ex04;

public class Ex02 {
	public static void main(String[] args) {
		int[] intArray;
		intArray = new int[6];
		
		for(int i = 0; i<intArray.length; i++) {
			intArray[i] = (int)(Math.random()*45)+1;
			System.out.print(intArray[i] + " ");
		}
	}
}
