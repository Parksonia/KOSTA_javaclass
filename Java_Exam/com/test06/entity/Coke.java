package com.test06.entity;

public class Coke extends Drink {

	static final int COKE_PRICE =50;
	public Coke() {
		super(COKE_PRICE);
	}

	@Override
	public String toString() {
	
		return "콜라";
	}
}
