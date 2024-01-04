package com.javaex.ex04;

public class Ex07 {
	public static void main(String[] args) {
		
		//A배열 만들기
		int[] arrA = new int[3];
		arrA[0] = 3;
		arrA[1] = 6;
		arrA[2] = 9;
		
		//B배열 만들기
		int[] arrB = new int[3];
		
		//A배열의 값 B배열에 복사
		for(int i=0; i<arrA.length; i++) {
			arrB[i] = arrA[i];
		}
		
		//A배열출력
		for(int i=0; i<arrA.length; i++) {
			System.out.println(arrA[i]);
		}
		System.out.println("---------------------------------");
		
		//B배열출력
		for(int i=0; i<arrB.length; i++) {
			System.out.println(arrB[i]);
		}
		System.out.println("-----------------------------------");
		
		arrA[2] = 10000;
		
		//A배열과 B배열 값이 다른지 확인
		//A배열 출력
		for(int i=0; i<arrA.length; i++) {
			System.out.println(arrA[i]);
		}
		System.out.println("-----------------------------------");
		//B배열 출력
		for(int i=0; i<arrB.length; i++) {
			System.out.println(arrB[i]);
		}
	}
}
