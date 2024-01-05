package com.javaex.ex01;

public class MemberApp {

	public static void main(String[] args) {
		Member[] memberArray = new Member[3];
		Member j = new Member("정우성", "jws", 50000);
		Member y = new Member("유재석", "yjs", 30000);
		Member l = new Member("이효리", "lhr", 40000);
		
		
		memberArray[0] = j;
		memberArray[1] = y;
		memberArray[2] = l;
		
		for(int i=0; i<memberArray.length; i++) {
			memberArray[i].showInfo();
		}
	}

}
