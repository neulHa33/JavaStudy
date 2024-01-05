package com.javaex.practice03;

public class Ex09 {
	public static void main(String[] args) {
		for(int i = 1; i<=10; i++) {
			for(int j = 0; j<=9; j++) {
				int k = i+j;
				System.out.print(k + "    ");
			}
			System.out.println();
		}
	}
}
