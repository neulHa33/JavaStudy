package com.javaex.ex04;

public abstract class Shape {
    private int countSides;
    
    public abstract double getArea(); // 넓이

    public abstract double getPerimeter(); // 둘레 길이
    
    public Shape() {
    	
    }
    public Shape(int countSides) {
    	this.countSides = countSides;
    }
    
}
