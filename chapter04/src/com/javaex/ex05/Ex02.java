package com.javaex.ex05;

import java.util.HashSet;
import java.util.Set;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> iSet = new HashSet<Integer>();
		
		for(int i=0; i<6; i++) {
			int aa = (int)(Math.random()*45)+1;
			Integer ii = new Integer(aa);
			iSet.add(ii);
		}
		
		for( Integer num : iSet) {
			System.out.print(num.toString() + " ");
		}
	}

}
