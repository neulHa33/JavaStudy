package com.javaex.ex14;

public class GoodsApp {

	public static void main(String[] args) {
		
		//배열만들기
		Goods[] goodsArray = new Goods[5];
		
		//상품만들기
		Goods camera = new Goods("니콘", 400000);
		Goods computer = new Goods("LG그램", 900000);
		Goods cup = new Goods("머그컵", 2000);
		
		//배열에 상품 넣기
		goodsArray[0] = camera;
		goodsArray[1] = computer;
		goodsArray[2] = cup;
		
		//System.out.println(camera.getName());
		//System.out.println(goodsArray[0].getName());
		
		/*
		camera.showInfo();
		computer.showInfo();
		cup.showInfo();
		*/
		int count =0;
		for(int i=0; i<goodsArray.length; i++) {
			if(goodsArray[i] != null) { //주소가 있으면
				//카운트+
				goodsArray[i].showInfo();
				count=count+1;
				//count+=1;
				
				//count++;
			}
		}
		System.out.println("전체상품갯수:" + count);
		
		
		
	}

}
