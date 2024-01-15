package com.javaex.ex02;

import java.util.Scanner;
import java.util.ArrayList;

public class FriendApp {

    public static void main(String[] args) {
    	ArrayList<Friend> pList = new ArrayList<Friend>();
    	
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.println("친구를 3등록해 주세요");
    	for(int i=0; i<3; i++) {
    		
        	String name = sc.next();
        	String hp = sc.next();
        	String school = sc.next();
        	
        	Friend f = new Friend(name, hp, school);
        	pList.add(f);
    	}
    	
    	for(int i=0; i<pList.size(); i++) {
    		System.out.println("이름:" + pList.get(i).getName() + "  핸드폰:" + pList.get(i).getHp() + "  학교:" + pList.get(i).getSchool());
    	}
    	
    	
    }

}
