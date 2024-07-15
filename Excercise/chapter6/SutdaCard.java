package chapter6;

public class SutdaCard {

	int num;
	boolean isKwang;

	public SutdaCard() {
		num = 1;
		isKwang = true;
	}

	public SutdaCard(int num, boolean isKwang) { // 파라미터 변수와 멤버변수가 이름이 동일할때
		this.num = num; // 멤버 변수에 this를 붙여준다.
		this.isKwang = isKwang;

	}

	public String info() {
		return num + (isKwang ? "k" : ""); // isKwang이 true이면 k
	}

}
