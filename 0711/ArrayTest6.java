import java.util.Scanner;

//1. 세자리 이하의 정수를 차례로 입력 받다가 999가 입력되면 프로그램을 종료하고 그때까지 입력된 최대값과 최소값을 출력하는 프로그램을 작성해라
// 입력받는 정수는 100개 이하이다.
public class ArrayTest6 {

	public static void main(String[] args) {
		
		int[]arr = new int[100]; //
		Scanner sc= new Scanner(System.in);
		
		int min =1000; //
		int max = -999;
		int cnt = 0;
		for(int i=0;;i++) {
			arr[i] =sc.nextInt();
			if(arr[i]==999)break;
			cnt++;
		}
		
		//min,max = arr[0] 으로 초기화 하는것이 낫다.
		for(int i=0; i<cnt; i++) {  
			if(arr[i]<min) {
				min = arr[i];
			}
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		System.out.println("max :"+max+" min: "+min);
		

	}

}
