package com.javaex.ex03;

import java.util.ArrayList;
import java.util.Scanner;

public class GoodsApp {

    public static void main(String[] args) {
    	ArrayList<Goods> pList = new ArrayList<Goods>();
    	Scanner sc = new Scanner(System.in);
    	System.out.println("상품을 입력해주세요(종료 q)");
    	
    	while(true) {
    		String s = sc.nextLine();
    		if(s.equals("q")) {
    			sc.close();
    			System.out.println("[입력완료]");
    			break;
    		} else {
    			String[] array = s.split(",");
    			Goods g = new Goods();
    			g.setName(array[0]);
    			g.setPrice(Integer.valueOf(array[1]));
    			g.setCount(Integer.valueOf(array[2]));
    			pList.add(g);
    		}
    	}
    	
    	int sum = 0;
    	for(int i=0; i<pList.size(); i++) {
    		System.out.println(pList.get(i).getName() + "(가격:" + pList.get(i).getPrice() + "원)이 " + pList.get(i).getCount() + " 개 입고 되었습니다.");
    		sum += pList.get(i).getCount();
    	}
    	
    	System.out.println("모든 상품의 갯수는 " + sum + "개입니다.");
    	
    	
    }

}
