package com.javaex.ex04;

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
		
		if(this.width == r.width && this.height == r.height) {
			result = true;
		} else {
			result = false;
		}
		
		return result;
	}
}
