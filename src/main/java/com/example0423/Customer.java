package com.example0423;


public class Customer {
    private CustomerType type;
 
    private int years;
 
    private int discount;
 
    // Standard getters and setters
 
    public enum CustomerType {
        INDIVIDUAL,
        BUSINESS;
    }
    
    public Customer(CustomerType ct, int y) {
    	this.type = ct;
    	this.years = y;
    }

	public int getDiscount() {
		// TODO Auto-generated method stub
		return discount;
	}
    
    public int getYears() {
    	return years;
    }
    
    public CustomerType getType() {
    	return type;
    }
    
    public void setDiscount(int d) {
    	this.discount = d;
    }
    
    public void setYears(int y) {
    	this.years = y;
    }
    
    public void setType (CustomerType c) {
    	this.type = c;
    }


}



