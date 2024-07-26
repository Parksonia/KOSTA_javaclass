package com.test05;

import java.util.HashMap;

public class Company {

	public static void main(String[] args) {

		HashMap<Integer, Employee> map = new HashMap<>();
		map.put(1, new Secretary("홍길동", 1, "Secretary", 800));
		map.put(2, new Secretary("이순신", 1, "Sales", 1200));

		String nameString = "name";
		String deString = "department";
		String salaryString = "salary";
		String taxString = "tax";

		System.out.println(String.format(String.format("%10s %25s %10s", nameString, deString, salaryString)));
		System.out.println("------------------------------------------------");
		for (Integer number : map.keySet()) {
			map.get(number).info();
			System.out.println();
		}

		// 모든 객체의 인센티브 100씩 지급한다.
		// Employee 는 인터페이스의 상속을 받지 않았기 때문에 instance of와 downcating이 필요하다
		for (Employee employee : map.values()) {
			if (employee instanceof Sales) {
				((Sales) employee).incentive(100);
			} else {
				((Secretary) employee).incentive(100);
			}
		}

		// 모든 객체의 정보와 세금을 출력한다. ( for문 이용 )
		System.out.println("\n인센티브 100지급\n");
		

		System.out.println(String.format(String.format("%10s %25s %10s %10s", nameString, deString, salaryString,taxString)));
		System.out.println("------------------------------------------------");

		for (Integer number : map.keySet()) {
			map.get(number).info();
			System.out.println(String.format("%10.2f", map.get(number).tax()));
		}

	}

}
