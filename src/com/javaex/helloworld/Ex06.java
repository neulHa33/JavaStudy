package com.javaex.helloworld;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		int age;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나이를 입력해주세요");
		System.out.print("나이: ");
		age = sc.nextInt();
		
		if(age>=19 && age<65) {
			System.out.println("1번그룹");
		} else {
			System.out.print("2번그룹");
		}
		
		System.out.println(" 입니다.");
		sc.close();
;	}
}
