package com.javaex.ex07;

import java.util.Scanner;

public class FriendApp {

    public static void main(String[] args) {

        Friend[] friendArray = new Friend[3];
        Scanner sc = new Scanner(System.in);

        System.out.println("친구를 3명 등록해 주세요");

        
        //for문 시작
        //친구정보 3명 입력 로직 --> 반복문 사용
        for(int i=0; i<friendArray.length; i++) {
        	System.out.print("이름: ");
        	String name = sc.next();
        	System.out.print("핸드폰: ");
        	String phone = sc.next();
        	System.out.print("학교: ");
        	String school = sc.next();
        	
        	Friend friend = new Friend(name, phone, school);
        	
        	friendArray[i] = friend;
        	System.out.println("---------------------------------");
        }
      
        //for문 끝
        
        
        // 친구정보 출력
        for (int i = 0; i < friendArray.length; i++) {
           //친구정보 출력 메소드 호출
        		System.out.println("이름:" + friendArray[i].getName() + "  핸드폰:" + 
      			friendArray[i].getHp()+ "  학교:" + friendArray[i].getSchool());
        }

        sc.close();
    }

}
