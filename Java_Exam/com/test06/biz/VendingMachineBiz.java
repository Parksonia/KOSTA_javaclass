package com.test06.biz;

import com.test06.entity.Drink;


public class VendingMachineBiz implements IvendingMachineBiz {

	int balance = 1000;
	Drink[] cartDrinks = new Drink[3]; // 구입 목록 배열 객체를 저장해야함
	int count = 0 ; // 배열의 갯수
	
	public VendingMachineBiz() {}

	
	@Override
	public void cartDrink(Drink drink) {
		cartDrinks[count++] = drink; // cartDrink 음료 종류 담기
	    
//		-cartDrink()는 음료수 구매 로직을 구현하는 메서드이다
//        1) 현재 잔액을 출력한다. ( Sample Run 참조 )
//        2) 매개변수로 넘겨받은 Drink 타입에 대한 메시지를 출력한다. (실행결과 참조)
//           메시지 출력시 Drink 타입의 toString() 메소드를 사용한다.
//        3) 잔액과 구매가격을 비교하여 부족한 경우에 에러 메시지를 출력한다.
//        4) 현재 갖고 있는 잔액에서 구매가격만큼 뺀다.
//        5) 배열에 저장된 개수와 배열의 크기가 같으면, 기존의 배열보다 사이즈가    
//            3배인 배열을 생성한 후, 기존의 배열 내용을 새로운 배열에 복사하고  
//            새로운 배열과 기존 배열을 바꾼다.
//        6) 배열에 구매한 개수만큼 저장하고 count값을 증가시킨다
		
	}

	@Override
	public void printCart() {
//		1) 배열에 저장된 데이터 타입에 따른 개수를 count한다. 
//    	2) 배열에 저장된 총 구매금액을 계산한다.
//    	3) 구매목록과 남은 잔액을 출력한다.( 실행결과 참조 ) 
	
	}

	@Override
	public void printDrinkList(Drink[] drinklist) {

//		   1) drinkList 배열에 저장된 내용을 출력한다. ( 실행결과 참조 )
//         음료수명은 한글로 출력한다. ( 예: 커피, 코크, 주스 )
//         2) 마지막에는 잔액을 출력한다. ( 실행결과  참조 )

	}

}
