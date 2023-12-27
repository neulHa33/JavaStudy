package com.javaex.helloworld;

import java.util.Scanner;

public class Ex17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("수익을 입력해 주세요.");
		System.out.print("금익: ");
		int num = sc.nextInt();
		double price = num;
		double tax;
		
		if(price>=0 && price <=1000) {
			tax = price*0.09;
			System.out.println("소득세는 " + tax + " 입니다.");
		} else if(price>1000 && price <= 4000) {
			tax = 1000*0.09 + 0.18*(price-1000);
			System.out.println("소득세는 " + tax + " 입니다.");
		} else if(price>4000 && price <= 8000) {
			tax = 1000*0.09 + 0.18*3000 + 0.27*(price-4000);
			System.out.println("소득세는 " + tax + " 입니다.");
		} else if(price>=8000) {
			tax = 1000*0.09 + 0.18*3000 + 4000*0.27 + 0.36*(price-8000);
			System.out.println("소득세는 " + tax + " 입니다.");
		} else {
			System.out.println("잘못 입력했습니다.");
		}
		
		sc.close();
	}
}
