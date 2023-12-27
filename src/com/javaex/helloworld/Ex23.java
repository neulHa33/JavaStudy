package com.javaex.helloworld;

import java.util.Scanner;

public class Ex23 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("태어난 연도를 입력해 주세요.");
		System.out.print("년도: ");
		int year = sc.nextInt();
		System.out.println("올해:2023");
		System.out.println("태어난해:" + year);
		int age = 2023-year;
		System.out.println("나이:" + age);
		System.out.println("=====================================");
		
		if(age<20) {
			System.out.println("20살미만 건강검진대상이 아님");
		} else if(age>=20) {
			System.out.println("20살이상");
			if(age%2 == 0) {
				System.out.println("건강검진해");
				if(age>=40) {
					System.out.println("암 검사");
				} else {
					System.out.println("암 검사X");
				}
			} else {
				System.out.println("건강검진해 아님");
			}
		}
		
		
		sc.close();
	}
}
