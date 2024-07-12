package chapter5;
//다음은 1과 9사이의 중복되지 않은 숫자로 이루어진 3자리 숫자를 만들어내는 프
//로그램이다. (1)~(2)에 알맞은 코드를 넣어서 프로그램을 완성하시오
public class Exe5_5 {

	public static void main(String[]args) {
		
		int[] ballArr = {1,2,3,4,5,6,7,8,9};
		 int[] ball3   = new int[3];
		 // 배열 ballArr의 임의의 요소 2개를 골라서 위치를 바꾼다. 20번 반복
		for(int x=0;x < 20;x++) {
			
		 int idx1 = (int)(Math.random() * ballArr.length);
		 int idx2 = (int)(Math.random() * ballArr.length); //math.random 으로 0~8의 인덱스가 나올 수 있게함
		 int tmp = 0;
		 
		 tmp = ballArr[idx1];
		 ballArr[idx1]=ballArr[idx2];
		 ballArr[idx2] = tmp;
 
		 }
		 // 배열 ballArr의 
//		for(int i=0; i<ball3.length; i++) {
//			ball3[i]=ballArr[i];
//		}
		//배열을 복사 할 수 있는 함수 사용 앞에서 3개의 수를 배열 ball3로 복사한다. (원본,0번째부터,대상,의0번쨰부터,3(2인덱스)까지)
		System.arraycopy(ballArr, 0, ball3, 0, 3);
		
		
		 for(int i=0;i<ball3.length;i++) {
		 System.out.print(ball3[i]);
		 }
		
	}
}
