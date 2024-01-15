package com.javaex.ex05;

public class Rectangle {
	private int width;
	private int height;
	
	public Rectangle() {
		
	}
	
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public boolean equals(Object obj) {
		Rectangle r = (Rectangle)obj;
		boolean result;
		
		if(this.height*this.width == r.height*r.width) {
			result = true;
		} else {
			result = false;
		}
		
		return result;
	}
}
