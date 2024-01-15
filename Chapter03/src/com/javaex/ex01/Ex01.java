package com.javaex.ex01;

public class Ex01 {

	public static void main(String[] args) {
		Object obj = new Object();
		
		System.out.println(obj.getClass()); //클래스 정보
		System.out.println(obj.toString()); //java.lang.Object@4fb64261 
		System.out.println(obj.hashCode()); //일단 주소라고 알자
		System.out.println(obj.equals(obj));//두 개의 같이 같냐?
		
		System.out.println("===========================================");
		
		//클래스 정보
		System.out.println(obj.getClass()); //클래스 정보
		
		//obj.toString()
		System.out.println(obj.toString()); //클래스 정보
		System.out.println(obj); //클래스 정보
		
		//hashCode()
		Object obj01 = new Object();
		Object obj02 = new Object();
		Object obj03 = new Object();
		System.out.println(obj01.hashCode());
		System.out.println(obj02.hashCode());
		System.out.println(obj03.hashCode());
		
		//equals()
		System.out.println(obj01.equals(obj01));
		System.out.println(obj01.equals(obj02));
		
		System.out.println(obj01==obj01);
		System.out.println(obj01==obj03);
	}

}
