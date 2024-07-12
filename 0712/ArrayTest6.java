import java.util.Scanner;

public class ArrayTest6 {
//10개의 정수를 입력받아 배열에 저장한 후 짝수 번째 입력된 값의 합과 홀수 번째 입력된 값의 
//평균을 출력하는 프로그램을 작성하시오. 평균은 반올림하여 소수첫째자리까지 출력한다.
	public static void main(String[] args) {
	

		Scanner sc = new Scanner(System.in);
		int[] num = new int[10];
		int odd = 0;
		int even = 0;
		for(int i=0; i<num.length; i++) {
			num[i] =sc.nextInt();
			if(i%2 ==0 ) odd += num[i];
			else even += num[i];
		}
		
		System.out.println("sum :"+even);
		System.out.println("avg : "+Math.round((odd/(double)(num.length/2))*10)/10d);
		
//		int arr[] = new int[10]; // 데이터가 아주 큰 값을 넣을 수 있으니 int배열 선언하면 안됨.
//		int sum1 = 0;
//		int sum2 = 0;
//		double avg = 0.0; // 홀수의 평균
//		Scanner sc = new Scanner(System.in);
//		int idx = 0 ;
//		int cnt =0;
//		for(int i=0; i<arr.length; i++) {
//			++idx;
//			int input = sc.nextInt();
//			if(idx %2 == 0 ) {
//				sum1+= arr[i];
//			}else {
//				sum2 +=arr[i];
//				cnt++;
//			}
//		}
//		avg = sum2/cnt;	
//		System.out.println(sum1);
//		System.out.println(sum2);
		
	}

}
//입력 : 95 100 88 65 76 89 58 93 77 99
//sum = 446
//avg = 78.8

