package com.javaex.practice03;
import java.util.Scanner;
public class Ex19 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		
		while(true) {
			System.out.println("-------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-------------------------------");
			System.out.print("선택>");
			int a = sc.nextInt();
			
			if(a == 4) {
				System.out.println("프로그램 종료");
				break;
			} else if(a == 1) {
				System.out.print("예금액>");
				int plus = sc.nextInt();
				sum = sum + plus;
			} else if(a == 2) {
				System.out.print("출금액>");
				int minus = sc.nextInt();
				sum = sum - minus;
			} else if(a==3) {
				System.out.println("잔고액>" + sum);
			} else {
				System.out.println("다시입력해주세요");
			}
		}
		sc.close();
	}
}
