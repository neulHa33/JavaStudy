package com.javaex.ex08;

public class SongApp {

	public static void main(String[] args) {
		
		Song s01 = new Song("좋은날","아이유","Real","이민수",2010,3);
		//테스트
		//System.out.println(s01.toString());
		
		Song s02 = new Song("거짓말","BIGBANG","Always","G-DRAGON",2007,2);
		//테스트
		//System.out.println(s01.toString());
		
		Song s03 = new Song("벚꽃엔딩","버스커버스커","버스커버스커1집","장범준",2012,4);
		//테스트
		//System.out.println(s01.toString());
		
		s01.showInfo();
		s02.showInfo();
		s03.showInfo();
	}
}
