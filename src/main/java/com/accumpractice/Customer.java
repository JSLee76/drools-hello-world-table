package com.accumpractice;


public class Customer {

	private int name;
	private int discount;
	private int day;
	private String type;

	public Customer(int name, String type, int day, int discount) {
		this.name = name;
		this.type = type;
		this.day = day;
		this.discount = discount;
	}
	
	public int getName() {
		return name;
	}

	public void setName(int name) {
		this.name = name;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}
	
	public int getDay() {
		return day;
	}
	
	public void setDay(int d) {
		this.day = d;
	}
	
	public String toString() {
		return "Name: "+ name + " Type: "+ type +" Day: "+ day +" Discount: "+ discount;
		
	}

}