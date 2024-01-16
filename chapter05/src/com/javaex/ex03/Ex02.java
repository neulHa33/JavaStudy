package com.javaex.ex03;

import java.io.*;

public class Ex02 {
    public static void main(String[] args) throws Exception {
        // 파일 읽기
        FileReader fr = new FileReader("C:\\javaStudy\\PhoneDB.txt");
        BufferedReader br = new BufferedReader(fr);

        // 파일 이어쓰기
        File tempFile = new File("C:\\javaStudy\\PhoneDB_temp.txt");
        FileWriter fwTemp = new FileWriter(tempFile);
        BufferedWriter bw = new BufferedWriter(fwTemp);

        
        bw.write("문하늘,010-2222-3333,02-1234-5678");
        bw.newLine();
        
      
        
        tempFile.renameTo(new File("C:\\javaStudy\\PhoneDB.txt"));
        
        while (true) {
            String str = br.readLine();

            if (str == null) {
                break;
            }

            String[] array = str.split(",");
            String name = array[0];
            String hp = array[1];
            String company = array[2];

            System.out.println("이름: " + name);
            System.out.println("핸드폰: " + hp);
            System.out.println("회사: " + company);
            System.out.println("");
            
            //기존 내용을 임시 파일에 복사
            bw.write(str);
            bw.newLine();
        }
        
        bw.close();
        fwTemp.close();
        br.close();
    }
}
