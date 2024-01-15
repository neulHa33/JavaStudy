package com.javaex.ex04;

public class RectTriangle extends Shape {
    private double width;
    private double height;

    RectTriangle(double w, double h) {
    	this.width = w;
    	this.height = h;
    }
    
    public double getArea() {
    	return width*height/2;
    }
    
    public double getPerimeter() {
    	return width + height + Math.sqrt((width*width) + (height*height));
    }
   
}