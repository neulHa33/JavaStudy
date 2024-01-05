package com.javaex.ex10;

public class Book {
    private int bookNo;
    private String title;
    private String author;
    private int stateCode = 1;
    
    public Book(int bookNo, String title, String author) {
    	this.bookNo = bookNo;
    	this.title = title;
    	this.author = author;
    }
    
    public int getBookNo() {
    	return bookNo;
    }
    
    public String getTitle() {
    	return title;
    }
    
    public String getAuthor() {
    	return author;
    }
    
    public int getStateCode() {
    	return stateCode;
    }
    
    public void setBookNo(int bookNo) {
    	this.bookNo = bookNo;
    }
    
    public void setTitle(String title) {
    	this.title = title;
    }
    
    public void setAuthor(String author) {
    	this.author = author;
    }
    
    public void setStateCode(int stateCode) {
    	this.stateCode = stateCode;
    }
    
    
    

    
}
