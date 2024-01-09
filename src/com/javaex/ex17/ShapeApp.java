package com.javaex.ex17;

public class ShapeApp {

	public static void main(String[] args) {
		// 관리를 위한 배열생성
		Ractangle[] rArray = new Ractangle[3]; // 사각형
		Triangle[] tArray = new Triangle[3]; // 삼각형
		Circle[] cArray = new Circle[3]; // 원

		// 사각형 생성
		Ractangle r01 = new Ractangle(5, 10, "파랑", "빨강");
		Ractangle r02 = new Ractangle(10, 10, "노랑", "노랑");
		Ractangle r03 = new Ractangle(20, 20, "빨강", "빨강");

		// 배열에 사각형(주소) 담기
		rArray[0] = r01;
		rArray[1] = r02;
		rArray[2] = r03;

		// 배열의 통해 사각형 그리기
		for (int i = 0; i < rArray.length; i++) {
			rArray[i].draw();
		}
		//////////////////////////////////////////////////
		// 삼각형 생성
		Triangle t01 = new Triangle(5, 10, "파랑", "빨강");
		Triangle t02 = new Triangle(10, 10, "노랑", "노랑");
		Triangle t03 = new Triangle(20, 20, "빨강", "빨강");

		// 배열에 삼각형(주소) 담기
		tArray[0] = t01;
		tArray[1] = t02;
		tArray[2] = t03;

		// 배열을 통해서 삼각형 그리기
		for (int i = 0; i < tArray.length; i++) {
			tArray[i].draw();
		}

		//////////////////////////////////////////////////
		// 원 생성
		Circle c01 = new Circle(10, "파랑", "빨강");
		Circle c02 = new Circle(20, "노랑", "노랑");
		Circle c03 = new Circle(30, "빨강", "빨강");

		// 배열에 원(주소) 담기
		cArray[0] = c01;
		cArray[1] = c02;
		cArray[2] = c03;

		// 배열을 통해서 삼각형 그리기
		for (int i = 0; i < cArray.length; i++) {
			cArray[i].draw();
		}

	}

}
