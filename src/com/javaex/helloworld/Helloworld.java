package com.javaex.helloworld;

import java.util.Scanner;

public class Helloworld {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요 ");
		int point = sc.nextInt();
		
		if(point%3==0) {
			System.out.println(point + "는 3의 배수입니다.");
		} else {
			System.out.println(point + "는 3의 배수가 아닙니다.");
		}
		
		sc.close();
	}

}
