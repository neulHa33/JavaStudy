package com.javaex.ex02;

import java.util.Arrays;

public class MyList<T> {
	
	//필드
	private T[] oArray;
	private int crtPos;
	
	//생성자
	public MyList() {
		oArray = (T[]) new Object[3];
		crtPos = 0;
	}
	
	//메소드 gs
	
	
	//메소드 일반
	public void add(T o) {
		//현재 배열개수 +1 배열을 새로 만든다.
		//이전배열의 값을 새배열에 옮긴다.
		//마지막방에 새주소를 추가한다.
		oArray[crtPos] = o;
		crtPos += 1;
	}
	
	public int size() {
		return crtPos;
	}
	
	public T get(int index) {
		return oArray[index];//index 방 안에있는 주소
	}

	@Override
	public String toString() {
		return "MyList [oArray=" + Arrays.toString(oArray) + ", crtPos=" + crtPos + "]";
	}
	
	
}
