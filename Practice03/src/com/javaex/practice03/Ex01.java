package com.javaex.practice03;

public class Ex01 {
	/*
	 * while문
	 * index=0
	 * index=1
	 * index=2
	 * for문
	 * order=0
	 * order=1
	 * order=2
	 */
	
	public static void main(String[] args) {
		System.out.println("while문");
		int index = 0;
		while(index<3) {
			System.out.println("index=" + index);
			index++;
		}
		System.out.println("for문");
		for(int order = 0; order<3; order++) {
			System.out.println("order=" + order);
		}
	}
}
