package chapter7;

public class Exam7_1 {

	public static void main(String[] args) {

		SutdaDeck deck = new SutdaDeck();
		
		for (int i = 0; i < deck.cards.length; i++)
			System.out.print(deck.cards[i] + ",");
	}

}
//[실행결과]
//1K,2,3K,4,5,6,7,8K,9,10,1,2,3,4,5,6,7,8,9,10,
//0번째와 10번째 에 1이 들어감