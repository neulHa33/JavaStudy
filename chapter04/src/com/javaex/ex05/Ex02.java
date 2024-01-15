package com.javaex.ex05;

import java.util.HashSet;
import java.util.Set;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> iSet = new HashSet<Integer>();
		
		while (iSet.size() < 6) {
            int aa = (int) (Math.random() * 45) + 1;
            Integer ii = aa;
            iSet.add(ii);
        }
		
		for( int num : iSet) {
			System.out.print(num + " ");
		}
	}

}
