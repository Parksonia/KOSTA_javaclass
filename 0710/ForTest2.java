
public class ForTest2 {

	public static void main(String[] args) {

		// 1+2+3+4+......했을 경우 합이100이거나 넘는 합의 값과 그때의 마지막 더해지는 값 구하기
		int i = 0;
		int sum = 0;
//		for(i=0; i<100; i++) {  for(i=0;;i++) 조건식을 주지 않으면 무한 루프를 돈다.
//
//			sum +=i;
//			if(sum>=100) break;
//		
//		}
//		System.out.println(sum);
//		System.out.println(i); //증감식을 가지 않기 때문에 마지막 i값이 출력됨.
//	}

		for (i = 1; sum < 100; i++) {
			sum += i;
		}
		System.out.println(sum);
		System.out.println(i - 1); // i++까지 하고 for문을 빠져나오기 때문에 -1해준다.
	}
}
