package com.javaex.ex05;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalcApp {

    public static void main(String[] args) {
    	Add add = new Add();
    	Div div = new Div();
    	Mul mul = new Mul();
    	Sub sub = new Sub();
    	
    	while(true) {
    		Scanner sc = new Scanner(System.in);
        	System.out.print(">> ");
        	
        	try {
                int a = sc.nextInt();
                String s = sc.next();
                int b = sc.nextInt();
                
                if(s.equals("+")) {
            		sc.close();
            		System.out.println("종료합니다.");
            		break;
            	} else if(s.equals("-")) {
            		sub.setValue(a, b);
            		System.out.println(sub.calculate());
            	} else if(s.equals("*")) {
            		mul.setValue(a, b);
            		System.out.println(mul.calculate());
            	} else if(s.equals("/")) {
            		div.setValue(a, b);
            		System.out.println(div.calculate());
            	} else {
            		System.out.println("알 수 없는 연산입니다.");
            	}
            } catch (InputMismatchException e) {
            	String s = sc.next();
            	if(s.equals("/q")){
            		System.out.println("종료합니다.");
            		break;
            	}
            }
        	
    	}
    	
    }
}
