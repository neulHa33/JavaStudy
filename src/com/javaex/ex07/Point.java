package com.javaex.ex07;

public class Point {

	// 필드
	private int x;
	private int y;

	// 생성자
	public Point() {
		//메모리에 올리는일
		System.out.println("Point()");
	}
	
	public Point(int x) {
		//메모리에 올리는일
		this.x = x;
		System.out.println("Point(int x)");
	}
	
	/*
	public Point(int y) {
		//메모리에 올리는일
		this.y = y;
	}
	*/
	
	public Point(int x, int y) {
		//메모리에 올리는일
		this(x);
		this.y = y;
		System.out.println("Point(int x, int y)");
		
	}
	
	
	// 메소드 gs
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}



	// 메소드 일반
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	public void draw(){
	    System.out.println("점[x=" +this.x + ",  y="+this.y + "] 을 그렸습니다.");
	}
	
	
}
