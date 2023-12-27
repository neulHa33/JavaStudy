package com.javaex.helloworld;

import java.util.Scanner;

public class Ex20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("알파벳 1글자(소문자)를 입력하세요.");
		System.out.print("알파벳: ");
		String input = sc.next().toLowerCase();
		
		if (input.equals("a") || input.equals("e") || input.equals("o") || input.equals("u") || input.equals("i")) {
			System.out.println("모음입니다.");
		} else {
			System.out.println("자음입니다.");
		}
		
		sc.close();
	}
}
