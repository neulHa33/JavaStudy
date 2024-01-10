package com.javaex.ex04;

public class Customer extends User{
	private int point;
	
	public Customer() {
		
	}
	
	public Customer(String id, String password, String name, int point) {
		super(id, password, name);
		this.point = point;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}
	
	public void showInfo() {
		System.out.println("#아이디:" + super.getId() + ", #패스워드:" + super.getPassword() + ", #이름:" + super.getName() + ", #포인트:" + point);
	}
}
