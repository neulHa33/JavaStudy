package com.javaex.ex17;

public class ShapeApp {

	public static void main(String[] args) {
		
		Ractangle r01= new Ractangle(5, 10, "파랑", "빨강");
		Ractangle r02= new Ractangle(10, 10, "노랑", "노랑");
		Ractangle r03= new Ractangle(20, 20, "빨강", "빨강");
	
		r01.draw();
		r02.draw();
		r03.draw();
		

	}

}
