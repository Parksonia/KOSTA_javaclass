package com.test06.entity;

public class Juice extends Drink {

	static final int JUICE_PRICE = 200;
	
	public Juice() {
		super(JUICE_PRICE);
	}
	@Override
	public String toString() {

		return "주스";
	}
}
