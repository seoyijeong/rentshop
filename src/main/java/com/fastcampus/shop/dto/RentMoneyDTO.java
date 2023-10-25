package com.fastcampus.shop.dto;

public class RentMoneyDTO {
	
	private int cust_no;
	private String cust_name;
	private String grade;
	private int total_price;
	
	
	
	public RentMoneyDTO() {}
	public RentMoneyDTO(int cust_no, String cust_name, String grade, int total_price) {
		super();
		this.cust_no = cust_no;
		this.cust_name = cust_name;
		this.grade = grade;
		this.total_price = total_price;
	}
	public int getCust_no() {
		return cust_no;
	}
	public void setCust_no(int cust_no) {
		this.cust_no = cust_no;
	}
	public String getCust_name() {
		return cust_name;
	}
	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public int getTotal_price() {
		return total_price;
	}
	public void setTotal_price(int total_price) {
		this.total_price = total_price;
	}
	@Override
	public String toString() {
		return "RentMoneyDTO [cust_no=" + cust_no + ", cust_name=" + cust_name + ", grade=" + grade + ", total_price="
				+ total_price + "]";
	}
	
}
