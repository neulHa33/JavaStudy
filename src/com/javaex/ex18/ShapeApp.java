package com.javaex.ex18;

public class ShapeApp {

	public static void main(String[] args) {
		//도형(부모)
		Shape s01 = new Shape();
		s01.setFillColor("노랑");
		s01.setLineColor("검정");
		//System.out.println(s01.toString());
		
		Ractangle[] rArray = new Ractangle[2];
		
		
		
		//사각형(자식-->부모)
		Ractangle r01 = new Ractangle(10, 10, "빨강", "검정");		
		Ractangle r02 = new Ractangle(20, 20, "노랑", "검정");
		//System.out.println(r01.toString());
		//System.out.println(r02.toString());

		//사각형(자식-->부모)
		Triangle t01 = new Triangle(100, 100, "빨강", "검정");		
		Triangle t02 = new Triangle(200, 200, "노랑", "검정");
		//System.out.println(t01.toString());
		//System.out.println(t02.toString());
		
		//사각형(자식-->부모)
		Circle c01 = new Circle(1000, "빨강", "검정");		
		Circle c02 = new Circle(2000, "노랑", "검정");
		//System.out.println(c01.toString());
		//System.out.println(c02.toString());
		
		rArray[0] = r01;
		rArray[1] = r02;
		
		for(int i=0; i<rArray.length; i++) {
			System.out.println(rArray[i].toString());
		}
		

		//배열
		
		
	}

}
