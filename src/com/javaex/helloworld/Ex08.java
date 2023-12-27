package com.javaex.helloworld;

import java.util.Scanner;

public class Ex08 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("키와 몸무게를 입력해주세요.");
		System.out.print("키: ");
		double height = sc.nextInt();
		System.out.print("몸무게: ");
		double weight = sc.nextInt();
		
		double value = (height - 100) * 0.9;
		if(value==weight) {
			System.out.println("표준 입니다.");
		} else if(value>weight) {
			System.out.println("저체중 입니다.");
		} else {
			System.out.println("과체중 입니다.");
		}
		
		System.out.println("표준체중: " + value);
		sc.close();
	}
}
