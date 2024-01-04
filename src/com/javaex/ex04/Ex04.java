package com.javaex.ex04;

public class Ex04 {
	public static void main(String[] args) {
		
		int[] intArray = new int[5];
		
		for(int i=0; i<=4; i++) {	
			intArray[i] = (int)(Math.random()*45)+1;
			
			System.out.print(intArray[i]+ "  ");
		}
	}
}
