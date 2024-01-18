package com.javaex.ex01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Scanner;

public class PersonApp {
	public static void main(String[] args) throws Exception {
		ArrayList<Person> pList = new ArrayList<Person>();
		
		//파일 읽기
		String path = "C:\\javaStudy\\phoneDB.txt";
		Reader fr = new FileReader(path);
		BufferedReader br = new BufferedReader(fr);
		
		//파일 쓰기
		Writer fw = new FileWriter(path, true);
		BufferedWriter bw = new BufferedWriter(fw);
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("******************************************");
		System.out.println("*             전화번호 관리 프로그램           *");
		System.out.println("******************************************");
		
		while(true) {
			br = new BufferedReader(new FileReader(path));
			System.out.println();
			System.out.println("1.리스트   2.등록    3.삭제    4.검색    5.종료");
			System.out.println("------------------------------------------");
			System.out.print(">메뉴번호:");
			
			int s = sc.nextInt();
			if(s == 5) {
				System.out.println("******************************************");
				System.out.println("*                 감사합니다                *");
				System.out.println("******************************************");
				break;
				
			} else if(s == 1) {
				//1.리스트
				pList.clear();
				System.out.println("<1.리스트>");
				String str;
				while ((str = br.readLine()) != null) {
			        String[] array = str.split(",");
			        if (array.length == 3) {
			            String name = array[0];
			            String hp = array[1];
			            String company = array[2];

			            Person p = new Person(name, hp, company);
			            pList.add(p);
			        } else {
			            
			        }
			    }
				
				for(int i=0; i<pList.size(); i++) {
					System.out.print(i+1 + ".");
					System.out.println( "\t" +pList.get(i).getName()  + "\t" + pList.get(i).getHp() + "\t" + pList.get(i).getCompany());
				}
				
			} else if(s == 2) {
				//2.등록
				System.out.println("<2.등록>");
				System.out.print(">이름:");
				String name = sc.next();
				System.out.print(">휴대전화:");
				String hp = sc.next();
				System.out.print(">회사전화:");
				String company = sc.next();
				
				bw.newLine();
				bw.write(name + "," +hp + "," + company);
   			    bw.flush();  
				
				System.out.println("[등록되었습니다.]");	
				
				br.close();
				
			} else if(s == 3) {
				
				System.out.println("<3.삭제>");
				//3.삭제
				System.out.print(">번호:");
				int num = sc.nextInt();
				
				pList.remove(num-1);
				
				//파일 내용 지우고 다시 쓰기
				try (FileOutputStream fos = new FileOutputStream(path, false)) {

		        } catch (IOException e) {
		            e.printStackTrace();
		        }
		        
				for(int i=0; i<pList.size(); i++) {
					if(i==pList.size()-1) {
					bw.write(pList.get(i).getName()  + "," + pList.get(i).getHp() + "," + pList.get(i).getCompany());
					
					}
					else {
						bw.write(pList.get(i).getName()  + "," + pList.get(i).getHp() + "," + pList.get(i).getCompany());
						bw.newLine();
					}
				}
				
   			    bw.flush(); 
   			    
   				br.close();
   				
   				System.out.println("[삭제되었습니다.]");
   				
			} else if(s == 4) {
				//검색
				pList.clear();
				System.out.println("<4.검색>");
				System.out.print(">이름:");
				String string = sc.next();
			    
				String str;
				
				while ((str = br.readLine()) != null) {
			        String[] array = str.split(",");
			        if (array.length == 3) {
			            String name = array[0];
			            String hp = array[1];
			            String company = array[2];

			            Person p = new Person(name, hp, company);
			            pList.add(p);
			        } else {
			            
			        }
			    }
				
				for(int i=0; i<pList.size(); i++) {
					if((pList.get(i).getName()).contains(string)) {
						System.out.print(i+1 + ".");
						System.out.println( "\t" +pList.get(i).getName()  + "\t" + pList.get(i).getHp() + "\t" + pList.get(i).getCompany());
					} 
				}
			
				
			} else {
				//없는메뉴 선택
				System.out.println("[다시 입력해 주세요.]");
			}
			
		}

		bw.close();
		br.close();
	}
}

