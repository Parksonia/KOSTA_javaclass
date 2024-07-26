package com.test04;

import java.util.ArrayList;
import java.util.Iterator;

public class PlaneTest {

	public static void main(String[] args) {

		
		ArrayList<Plane> planes = new ArrayList<>();
		// 객체 생성
		planes.add(new Airplane("L777",1000));
		planes.add(new Cargoplane("C50",1000));
		
		Airplane airplane = new Airplane();
		Cargoplane cargoplane  = new Cargoplane();
		
	
		//객체 정보 출력
		System.out.println("Plane fuelSize");
		System.out.println("---------------");
		for(int i=0; i<planes.size(); i++) {
			System.out.println(planes.get(i).infoString());
		
		}
		System.out.println("100운항");
		planes.get(0).flight(100);
		planes.get(1).flight(100);
		
		System.out.println("Plane fuelSize");
		System.out.println("---------------");
		for(int i=0; i<planes.size(); i++) {
			System.out.println(planes.get(i).infoString());
		
		}
		System.out.println("200주유");
		
		System.out.println("Plane fuelSize");
		System.out.println("---------------");
		for(int i=0; i<planes.size(); i++) {
			planes.get(i).refuel(200);
			System.out.println(planes.get(i).infoString());
		}
				
	}
}