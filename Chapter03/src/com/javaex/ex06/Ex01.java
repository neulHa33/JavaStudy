package com.javaex.ex06;

public class Ex01 {

	public static void main(String[] args) {
		String s01 = "안녕하세요";
		String s02 = "안녕하세요"; //같은 문자열을 가진 객체를 찾아서 연결한다
								//같은게 있으면 새로 만들지 않는다
		
		System.out.println(s01);
		System.out.println(s02);
		
		System.out.println(s01 == s02); //주소가 같다
		
		s01 = "안녕";
		System.out.println(s01);
		System.out.println(s02);
		
		System.out.println(s01 == s02); 
	}

}
