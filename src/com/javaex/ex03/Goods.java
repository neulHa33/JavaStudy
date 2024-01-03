package com.javaex.ex03;

public class Goods {

	//필드
	private String name;
	private int price;
	
	
	//생성자
	//메소드-gs
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getName() {
		
		return name;
	}
	
	public int getPrice() {
		return price;
	}
	
	//메소드-일반
	public void showInfo(){
		System.out.println("----------------------------------------");
		System.out.println("상품명:" +this.name + ",  가격:"+this.price  );
		System.out.println("----------------------------------------");
	}

	
}
