package com.javaex.ex05;

public class SongApp {

	public static void main(String[] args) {
		
		Song s01 = new Song();
		s01.setTitle("좋은날");
		s01.setArtist("아이유");
		s01.setAlbum("Real");
		s01.setComposer("이민수");
		s01.setYear(2010);
		s01.setTrack(3);
		//테스트
		//System.out.println(s01.toString());
		
		Song s02 = new Song();
		s02.setTitle("거짓말");
		s02.setArtist("BIGBANG");
		s02.setAlbum("Always");
		s02.setComposer("G-DRAGON");
		s02.setYear(2007);
		s02.setTrack(2);
		//테스트
		//System.out.println(s01.toString());
		
		Song s03 = new Song();
		s03.setTitle("벚꽃엔딩");
		s03.setArtist("버스커버스커");
		s03.setAlbum("버스커버스커1집");
		s03.setComposer("장범준");
		s03.setYear(2012);
		s03.setTrack(4);
		//테스트
		//System.out.println(s01.toString());
		
 		s01.showInfo();
		s02.showInfo();
		s03.showInfo();
		
	}

}
