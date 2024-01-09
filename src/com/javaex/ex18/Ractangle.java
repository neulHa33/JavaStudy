package com.javaex.ex18;

public class Ractangle extends Shape {

	// 필드
	private int width;
	private int height;

	// 생성자
	public Ractangle() {
		// super();
	}

	public Ractangle(int width, int height, String fillColor, String lineColor) {
		/*
		 * super(); super.setFillColor(fillColor); super.setLineColor(lineColor);
		 * this.width = width; this.height = height;
		 */

		super(fillColor, lineColor);
		this.width = width;
		this.height = height;
	}

	// 메소드 -gs
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}


	// 메소드 -일반
	@Override
	public String toString() {
		return "Ractangle [width=" + width + ", height=" + height + ", getFillColor()=" + getFillColor()
				+ ", getLineColor()=" + getLineColor() + "]";
	}


	
}
