package com.javaex.helloworld;

import java.util.Scanner;

public class Ex11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 숫자: ");
		int num1 = sc.nextInt();
		System.out.print("두번째 숫자: ");
		int num2 = sc.nextInt();
		
		int answer;
		int remainder;
		
		if(num1>num2) {
			answer = num1/num2;
			remainder = num1%num2;
		} else if(num1<num2) {
			answer = num2/num1;
			remainder = num2%num1;       
		} else {
			answer = 1;
			remainder = 0;
		}
		
		System.out.println("몫: " + answer);
		System.out.println("나머지: " + remainder);
		sc.close();
	}
}
