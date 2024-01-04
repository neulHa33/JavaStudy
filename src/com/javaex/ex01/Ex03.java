package com.javaex.ex01;

public class Ex03 {
	public static void main(String[] args) {
		long result = add(100, 200);
		System.out.println(result);
		addPrint(10, 11);
	}
	
	public static long add(long n1, long n2) {
		long result = n1+n2;
		return result;
	
	}
	
	public static void addPrint(long n1, long n2) {
		long result = n1 + n2;
		System.out.println(result);
	}
}
