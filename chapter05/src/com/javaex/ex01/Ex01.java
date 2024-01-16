package com.javaex.ex01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.IOException;

public class Ex01 {
	public static void main(String[] args ) throws IOException {
		InputStream in = new FileInputStream("C:\\javaStudy\\img.jpg");
		OutputStream out = new FileOutputStream("C:\\javaStudy\\byteimg.jpg");
		
		System.out.println("복사시작");
		while(true) {
			int data = in.read();
			
			if(data == -1) {
				System.out.println("복사 끝" + data);
				break;
			} 
			
			out.write(data);
		}
		
		
		in.close();
	}
}
