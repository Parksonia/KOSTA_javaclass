import java.util.Scanner;

public class ArrayTest7 {
	//피보나치 수열
	//100이하의 자연수를 입력받아 첫번째 항은 100으로 두 번째 항은 입력받은 수로 초기화 하고
	//다음 항부터는 전전항에서 전항을 뺀 수로 채워나가는 수열을 작성하여 그 수가 음수가 나올 때까지
	//출력하는 프로그램을 작성하시오.
	//입력
	//62
	//출력
	//100 62 38 24 14 10 4 6 -2
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] arr = new int [100];
		arr[0]=100;
		arr[1] =sc.nextInt(); //62 입력

	
		for(int i=2; i<arr.length; i++) {
			arr[i] =arr[i-2]-arr[i-1];
			if(arr[i]<0) break;
		}
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == 0) continue;
			System.out.print(arr[i]+"\t");
			
		}
	
	}

}
//배열 없이 하기 
//int ppre = 100;
//int pre =sc.nextInt();
//
//int curr =0 ;
//
//while(true) {
//	curr = ppre-pre;		   
//	System.out.println(curr);
//	if(curr<0)break;
//	ppre = pre;
//	pre =curr;
//}
//
//
//System.out.println();

