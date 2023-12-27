package com.javaex.helloworld;

import java.util.Scanner;

public class Helloworld {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("근무 시간 :  ");
		
		int workTime = sc.nextInt();
		int salary;
		
		if(workTime<9) {
			salary = workTime * 10000;
			
		} else {
			salary = 8*10000 + (workTime -8)*12000;
			
		}
		
		System.out.println("임금은 " + salary + "원 입니다.");
		
		sc.close();
	}

}
