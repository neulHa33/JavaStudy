package com.javaex.helloworld;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		int age;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나이를 입력해주세요");
		System.out.print("나이: ");
		age = sc.nextInt();
		
		if(age>=0 && age<8) {
			System.out.println("취학전아동/무료 입니다.");
		} else if(age>=8 && age <14) {
			System.out.println("초등학생/2000원 입니다.");
		} else if(age>=14 && age <17) {
			System.out.println("중학생/3000원 입니다.");
		} else if(age>=17 && age< 20) {
			System.out.println("고등학생/4000원 입니다.");
		} else if(age>=20) {
			System.out.println("성인/5000원 입니다.");
		} else {
			System.out.println("0 이상의 숫자를 입력해주세요.");
		}
		
		sc.close();
	}
}
