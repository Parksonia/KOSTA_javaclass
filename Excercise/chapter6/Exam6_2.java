package chapter6;

public class Exam6_2 {

	public static void main(String[] args) {
		SutdaCard card1 = new SutdaCard(3, false);
		SutdaCard card2 = new SutdaCard(); //파라미터가 없는데 출력결과 보면 1K 가 출력된걸 보고 기본생성자에 값이 1과 true로 초기화 해야한다는걸 추측

		System.out.println(card1.info());
		System.out.println(card2.info());
	}
}

//실행결과
//3
//1K
