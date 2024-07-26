package com.test04;

//추상 클래스 자식이 메서드 구현해라 
public abstract class Plane {

	String planeName;
	int fuelSize;
	
	
	
	public String getPlaneName() {
		return planeName;
	}
	public void setPlaneName(String planeName) {
		this.planeName = planeName;
	}
	public int getFuelSize() {
		return fuelSize;
	}
	public void setFuelSize(int fuelSize) {
		this.fuelSize = fuelSize;
	}
	
	
	
	//기본 생성자
	public Plane() {}
	// 인자 있는 생성자
	public Plane(String plnaeName,int fuelSize) {
		this.planeName = plnaeName;
		this.fuelSize = 1000;
	}
	//주유 메서드
	public void refuel(int fuel) {
		fuelSize+=fuel;
	}
	
	public abstract void flight(int distance) ;
	
	
	public String infoString() {
		return getPlaneName()+" "+getFuelSize();
	}
}

