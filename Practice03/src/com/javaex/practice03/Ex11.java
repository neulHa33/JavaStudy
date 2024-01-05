package com.javaex.practice03;

import java.util.Scanner;

public class Ex11 {
	public static void main(String[] args) {
		System.out.println("숫자를 입력하세요");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 0;
		
		if(num % 2 == 0) {
			//짝수인 경우
			for(int i = 2; i<=num; i=i+2) {
				sum += i;
			}
		} else {
			//홀수인 경우
			for(int i = 1; i<=num; i=i+2) {
				sum += i;
			}
		}
		System.out.println("결과값: " + sum);
	}
}
