package com.test06.entity;

public class Coffee extends Drink {

	static final int COFFEE_PRICE =100;
	
	public Coffee() {
		super(COFFEE_PRICE);	
	}
	@Override
	public String toString() {
	
		return "커피";
	}
}
