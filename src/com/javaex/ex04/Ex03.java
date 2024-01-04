package com.javaex.ex04;

public class Ex03 {
	public static void main(String[] args) {
		//int[] intArray = new int[3];
		int[] intArray = {1,2,3};
		
		System.out.println(intArray[0]);
		System.out.println(intArray[1]);
		System.out.println(intArray[2]);
		
		for(int i=0; i<3; i++) {
			System.out.println(intArray[i]);
		}
		
		for(int i=0; i<intArray.length; i++) {
			System.out.println(intArray[i]);
		}
	}
}
