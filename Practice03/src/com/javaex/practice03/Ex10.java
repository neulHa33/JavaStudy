package com.javaex.practice03;

import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int[] numArray = new int[5];
		int max = 0;
		System.out.println("숫자를 입력하세요");
	
		for(int i=0; i<5; i++) {
			
			
			System.out.print("숫자: ");
			int no = sc.nextInt();
			numArray[i] = no;
		}
		
		for(int i = 0; i<numArray.length; i++) {
			if(numArray[i]>max) {
				max = numArray[i];
			}
		}
		System.out.println("최대값은 " + max + "입니다.");
	}
}
