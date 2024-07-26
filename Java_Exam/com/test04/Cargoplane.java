package com.test04;

public class Cargoplane extends Plane {

	Plane plane;
	public Cargoplane() {}
	public Cargoplane(String planeName,int fuelSize) {
		super(planeName, fuelSize);
	}
	//운항
	@Override
	public void flight(int distance) {
		int cfuel = 0;

		cfuel = (distance / 10) * 50;

		fuelSize =fuelSize-cfuel;
		
	}
	@Override
	public String infoString() {
	
		return String.format("%s  %d",planeName,fuelSize);
	}
}
