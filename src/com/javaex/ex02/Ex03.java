package com.javaex.ex02;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요: ");
		
		int no = sc.nextInt();
		
		if(no>0) {
			if(no%2 == 0) {
				System.out.println("짝수");
			} else {
				System.out.println("홀수");
			}
			
		}else {
			if(no==0) {
				System.out.println("나머지는 0");
			} else {
				System.out.println("음수");
			}
		}
		
		sc.close();
	}

	

}
