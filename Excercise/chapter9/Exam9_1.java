package chapter9;

public class Exam9_1 {

	public static void main(String[] args) {
		SutdaCard c1 = new SutdaCard(3, true);
		SutdaCard c2 = new SutdaCard(3, true);
		System.out.println("c1=" + c1);
		System.out.println("c2=" + c2);
		System.out.println("c1.equals(c2):" + c1.equals(c2));
	}
}

class SutdaCard {
	int num;
	boolean isKwang;

	SutdaCard() {
		this(1, true);
	}

	SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}

	/*
	   (1) 매개변수로 넘겨진 객체의 num, isKwang과 
	                멤버변수 num, isKwang을 비교하도록 오버라이딩 하시오.
	 */
	
	@Override
	public boolean equals(Object obj) { // Object의 equals를 오버라이딩 하는 거니까 Object의 equals 메서드와 동일해야함 매개변수도 같을 수 밖에 없음 

		if(!(obj instanceof SutdaCard)) return false; // 이걸 써줘야함 다른 클래스가 들어올 수 있자나~
		SutdaCard sutdaCard = (SutdaCard)obj;	// 다운캐스팅 	
		return sutdaCard.num == num && sutdaCard.isKwang == isKwang;
}
	
	public String toString() {
		return num + (isKwang ? "K" : "");
	}
}
