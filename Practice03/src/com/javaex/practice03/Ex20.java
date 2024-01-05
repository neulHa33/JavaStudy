package com.javaex.practice03;
import java.util.Scanner;
public class Ex20 {
	public static void main(String[] args) {
		System.out.println("============================");
		System.out.println("      [숫자맞추기게임 시작]     ");
		System.out.println("============================");
		int num = 29;
		
		while(true) {
			System.out.print(">>");
			Scanner sc = new Scanner(System.in);
			int s = sc.nextInt();
			
			if(num==s) {
				System.out.println("맞았습니다.");
				System.out.print("게임을 종료하시겠습니까?(y/n) >>" );
				sc.nextLine(); //버퍼 지우기
				String c = sc.nextLine();
				
				if(c.equals("y")) {
					System.out.println("============================");
					System.out.println("      [숫자맞추기게임 종료]     ");
					System.out.println("============================");
					break;
				} else if(c.equals("n")) {
					System.out.println("============================");
					System.out.println("      [숫자맞추기게임 시작]     ");
					System.out.println("============================");
					continue;
				} else {
					System.out.println("유효하지 않은 입력입니다.");
				}
			} else if(num<s) {
				System.out.println("더 낮게");
			} else if(num>s) {
				System.out.println("더 높게");
			}
		}
	}
}
