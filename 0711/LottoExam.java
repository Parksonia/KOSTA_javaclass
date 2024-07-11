
public class LottoExam {

	public static void main(String[] args) {

		//45개의 수를 배열에 저장(1~45)
		//배열을 섞기 어떻게 하지...?
		//아래와 같이 한다.
		//무작위로 2개 뽑기 (랜덤으로 0~44의 인덱스)
		// 임시 변수를 사용하여 무작위로 뽑은 두 값을 서로 스와핑
		//이 과정을 200번 하기로 함

		// 1~45의 공 만들기
		int[] ball = new int[45];
		for(int i=0; i<ball.length; i++) {
			ball[i] = i+1;

		}
		//인덱스를 무직위로 섞기 , 200번 반복
		for(int i=0; i<200; i++) {
			int idx1 = (int)(Math.random()*45); // 인덱스는 0부터 시작하니까 +1 안해도 됨
			int idx2 =(int)(Math.random()*45);
			int tmp = ball[idx1];
			ball[idx1] = ball[idx2];
			ball[idx2] = tmp;
		}
		//섞인 공을 6개 뽑기 
		for(int i=0; i<6; i++) {
			System.out.print(ball[i]+ " ");
		}
	}
}
