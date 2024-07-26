package com.test04;

public class Airplane extends Plane {

	Plane plane;

	public Airplane() {
	}

	public Airplane(String planeName, int fuelSize) {
		super(planeName, fuelSize);
	}

	// 운항- 부모의 추상메서드 구현
	// 일정 거리만큼 운항 연료가 감소됨
	@Override
	public void flight(int distance) {
		int cfuel = 0;

		cfuel = (distance / 10) * 30;

		fuelSize=fuelSize- cfuel;
	}

	@Override
	public String infoString() {

		return String.format("%s  %d",planeName,fuelSize);
	}

}
