package com.javaex.helloworld;

import java.util.Scanner;

public class Ex15 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("출력되는 내용을 입력하세요.");
		System.out.print("기호: ");
		String sign = sc.next();
		System.out.print("숫자1: ");
		int number1 = sc.nextInt();
		double num1 = number1;
		System.out.print("숫자2: ");
		int number2 = sc.nextInt();
		double num2 = number2;
		double answer;
		
		if(sign.equals("+")) {
			answer = num1 + num2;
			System.out.println("결과는: " + answer);
		} 
		
		else if(sign.equals("-")) {
			if(num1>=num2) {
				answer = num1 - num2;
			} else {
				answer = num2 - num1;
			}
			
			System.out.println("결과는: " + answer);
		}
		
		else if(sign.equals("*")) {
			answer = num1 * num2;
			System.out.println("결과는: " + answer);
		}
		
		else if(sign.equals("/")) {
			
			if(num1 == 0 || num2 == 0) {
				System.out.println("계산할 수 없습니다.");
			}else if(num1>=num2) {
				answer = num1/num2;
				System.out.println("결과는: " + answer);
			} else {
				answer = num2/num1;
				System.out.println("결과는: " + answer);
			}
		}
		
		else {
			System.out.println("계산할 수 없는 기호입니다.");
		}
		
		sc.close();
	}

}
