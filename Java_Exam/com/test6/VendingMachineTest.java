package com.test6;

import java.util.Scanner;

import com.test06.biz.VendingMachineBiz;
import com.test06.entity.Coffee;
import com.test06.entity.Coke;
import com.test06.entity.Drink;
import com.test06.entity.Juice;

public class VendingMachineTest {
	static Scanner scanner = new Scanner(System.in);

	
	public static void main(String[] args) {

//		-사용자 입력을 받기 위한 메뉴를 화면에 출력한다. ( 실행결과  참조 )
//		-지정된 메뉴번호 이외의 값dmf 입력하면 예외메시지를 출력한다.(실행결과  참조)
//		-메뉴번호 9값을 입력하면 종료 메시지를 출력하고 프로그램을 종료한다.
//		-printMenu() 메서드는 메뉴를 출력하는 메서드이다.
		VendingMachineBiz vmb = new VendingMachineBiz();
		VendingMachineTest vmt = new VendingMachineTest();
		
		Drink[] drinkList = new Drink[3];// 단순한 음료 정qh 담기
		drinkList[0] = new Coffee();
		drinkList[1] = new Coke();
		drinkList[2] = new Juice();
		int sel;
		 
		
		while(true) {
			sel = printMenu();
			if(sel == 9 ) {
				System.out.println("프로그램 종료");
				break;
			}
			switch(sel) {
			case 1: vmb.printDrinkList(drinkList); break;// 전체 음료수 및 잔액보기
			case 2: vmb.cartDrink(new Juice()); break; //객체 생성시 상수값 super로 보냄
			case 3: vmb.cartDrink(new Coffee()); break; //위에서 생성한 객체를 활용해도 됨... drinks 배열을 만듦
			case 4: vmb.cartDrink(new Coke()); break;
			case 5: vmb.printCart(); break; 
			
			}
		}
	}

	public static int printMenu() {
		int sel;
		System.out.println("============================");
		System.out.println("[음료수 자판기 관리 시스템]");
		System.out.println("============================");
		System.out.println("1.전체 음료수 및 잔액 보기");
		System.out.println("2.쥬스 구입하기 ( 200원 )");
		System.out.println("3.커피 구입하기 ( 100원 )");
		System.out.println("4.코크 구입하기 ( 50원 )");
		System.out.println("5.구입한 음료수 목록 보기");
		System.out.println("9.종료");
		System.out.println("============================");
		System.out.print("메뉴 입력 =>");
		try {
			sel = Integer.parseInt(scanner.nextLine());
			if(sel<0 ||sel>6 &&sel !=9) {
				throw new Exception("선택 오류");
		} 
		}catch (Exception e) {
			System.out.println("메뉴값을 확인 후 다시 입력하세요");
		}
				
		return sel;
	}

}
