package com.javaex.ex04;

public class Point {

	// 필드
	private int x;
	private int y;

	// 생성자

	// 메소드-gs
	// -일반
	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getX() {
		return this.x;
	}

	public int getY() {
		return this.y;
	}


	public void draw(){
	    System.out.println("점[x=" +this.x + ",  y="+this.y + "] 을 그렸습니다.");
	}

}
