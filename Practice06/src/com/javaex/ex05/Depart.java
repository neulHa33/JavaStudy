package com.javaex.ex05;

public class Depart extends Employee{

	 //코드작성
	private String depart;
	
	public Depart() {
		
	}
	
	public Depart(String name, int salary, String depart) {
		super(name, salary);
		this.depart = depart;
	}

	public String getDepart() {
		return depart;
	}

	public void setDepart(String depart) {
		this.depart = depart;
	}
	
	public void getInformation() {
		System.out.println("이름:" + super.getName() + "  연봉:" + super.getSalary() + "  부서:" + depart);
	}
}
