package com.javaex.ex15;

public class Student extends Person{

	//필드
	//private String name;
	//private int age;	
	private String schollName;

	//생성자
	public Student() {
	}
	
	public Student(String schollName) {
		this.schollName = schollName;
		System.out.println("Student(1)");
	}
	

	public Student(String name, int age, String schoolName) {
		//부모의 생성자 호출
		//name, age 부모
		
		//super(name, age);
		
		super();
		super.setName(name);
		super.setAge(age);
		
		
		//자신메모리에 올리는일
		//schoolName 자신
		this.schollName = schoolName;
		System.out.println("Student(3)");
	}
	

	public String getSchollName() {
		return schollName;
	}

	
	//메소드 -gs
	public void setSchollName(String schollName) {
		this.schollName = schollName;
	}





	/*
	public String toString() {
		return "학교:" + schollName + " 이름:" + getName() + " 나이" + getAge();
	}
	*/
	//메소드 -일반
	@Override
	public String toString() {
		return "Student [schollName=" + schollName + ", getName()=" + getName() + ", getAge()=" + getAge() + "]";
	}

	

	
	
	
}
