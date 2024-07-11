package chapter4;
//int타입의 변수 num 이 있을 때, 각 자리의 합을 더한 결과를 출력하는 코드를 

//완성하라. 만일 변수 num의 값이 12345라면, ‘1+2+3+4+5’의 결과인 15를 출력하라. (1)
//에 알맞은 코드를 넣으시오.
// [주의] 문자열로 변환하지 말고 숫자로만 처리해야 한다.

public class Exe4_10 {

	public static void main(String[] args) {

		int num = 12345; // 한자리씩 잘라내어 계산하기
		int sum = 0;

		for (int i = 0;; i++) { //for(;num!=0;) <-tip i를 정의할 필요가 없음.
			sum += (num % 10); //끝자리를 더하고
			num = num / 10; //num의 끝자리 버리고 재정의
			if (num == 0) {
				break;
			}

		}

		System.out.println(sum);
	}

}
