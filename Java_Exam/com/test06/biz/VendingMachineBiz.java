package com.test06.biz;

import com.test06.entity.Coffee;
import com.test06.entity.Coke;
import com.test06.entity.Drink;
import com.test06.entity.Juice;

public class VendingMachineBiz implements IvendingMachineBiz {

	int balance = 1000;

	Drink[] drinks = new Drink[3]; // 구입 목록 배열 ,drink타입을 저장 할 수 있는 배열, 초기값 3
	// ArrayList<Drink> cartDrinks = new ArrayList<>(); // 구입 목록 배열 객체를 저장해야함
	int count = 0; // 현재 저장된 배열의 개수

	public VendingMachineBiz() {
	}

	@Override
	public void cartDrink(Drink drink) {

//      3) 잔액과 구매가격을 비교하여 부족한 경우에 에러 메시지를 출력한다.
//      4) 현재 갖고 있는 잔액에서 구매가격만큼 뺀다.
		if (drink.getPrice() > balance) { // 이미 객체 생성하면서 음료에 맞게 drink의 price초기화 됨
			System.out.println("잔액이 부족하여 " + drink.toString() + " 구매 불가능 합니다. ");
			return;
		} else {
			balance -= drink.getPrice();
		}

		System.out.println(drink.toString() + " 를 구입했습니다. 현재 잔액 : " + balance + " 원");

//		-cartDrink()는 음료수 구매 로직을 구현하는 메서드이다
//        1) 현재 잔액을 출력한다. ( Sample Run 참조 )
//        2) 매개변수로 넘겨받은 Drink 타입에 대한 메시지를 출력한다. (실행결과 참조)
//           메시지 출력시 Drink 타입의 toString() 메소드를 사용한다.

//        5) 배열에 저장된 개수와 배열의 크기가 같으면, 기존의 배열보다 사이즈가    
//            3배인 배열을 생성한 후, 기존의 배열 내용을 새로운 배열에 복사하고  
//            새로운 배열과 기존 배열을 바꾼다.
		// 넣기 전에 공간이 부족할 수 있으니 늘려줌...?

		if (drinks.length == count) {
			Drink[] tmpDrinks = new Drink[drinks.length * 3];
			System.arraycopy(drinks, 0, tmpDrinks, 0, drinks.length);
			drinks = tmpDrinks;// 같은 배열 주소를 참조하게 되어 공간이 늘어난거임
		}

//        6) 배열에 구매한 개수만큼 저장하고 count값을 증가시킨다
		drinks[count++] = drink;

	}

	@Override
	public void printCart() {
//		5번 메뉴 눌렀을 때 
//		1) 배열에 저장된 데이터 타입에 따른 개수를 count한다. 
//    	2) 배열에 저장된 총 구매금액을 계산한다.
//    	3) 구매목록과 남은 잔액을 출력한다.( 실행결과 참조 ) 

		int cfCnt = 0;
		int jCnt = 0;
		int ckCnt = 0;
		int sum = 0;
		System.out.println("=====음료수  구입  목록=====");

		for (Drink d : drinks) {
			if (d instanceof Coffee) {
				cfCnt++;
				sum += d.getPrice(); // 나올때마다 더하기
			} else if (d instanceof Juice) {
				jCnt++;
				sum += d.getPrice();
			} else if (d instanceof Coke) {
				sum += ckCnt++;
			}
		}

		System.out.println("쥬스 : " + jCnt + " 개");
		System.out.println("커피 : " + cfCnt + " 개");
		System.out.println("콜라 : " + ckCnt + " 개");
		System.out.println("============================");
		System.out.println("사용 금액:" + sum);
		System.out.println("남은 잔액:" + balance);

	}

	@Override
	public void printDrinkList(Drink[] drinkList) {
// 			1번 메뉴 눌렀을 때 
//		   1) drinkList 배열에 저장된 내용을 출력한다. ( 실행결과 참조 )
//         음료수명은 한글로 출력한다. ( 예: 커피, 코크, 주스 )
//         2) 마지막에는 잔액을 출력한다. ( 실행결과  참조 )
		System.out.println("============================");
		System.out.println(String.format("%s%10s","음료수명","가격"));
		System.out.println("============================");
		for(Drink d:drinkList) {
			System.out.println(String.format("%s%15d 원",d.toString(),d.getPrice()));
		}
		System.out.println("----------------------------");
		System.out.println("현재 잔액 : "+balance+" 원");
		

	}

}
