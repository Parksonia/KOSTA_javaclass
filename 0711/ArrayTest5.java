import java.util.Scanner;

//정수를 입력받다가 0이 입력되면 0을 제외하고 그 때까지의 입력 받은 개수를 출력 후 
//입력받은 정수를 차례로 출력하되 그 수가 홀수이면 2배한 값을 짝수인 경우에는 2로 나눈 값을 출력하는 프로그램
//단, 입력되는 정수는 100개 이하이다.
public class ArrayTest5 {

	public static void main(String[] args) {
	
		//1.정수가 최대 100개 저장될 배열 생성
		
		int [] arr = new int[100];
		
		//2.입력 회수를 저장할 변수 선언
		int cnt = 0;
		Scanner sc = new Scanner(System.in);
		//3.반복문을 통해 입력받은 값을 배열에 저장, 단 0을 입력받으면 반복문 빠져나옴 입력받을때마다 입력회수를 증가시킴
		for(int i=0; i<arr.length; i++) {
			
			arr[i] = sc.nextInt();
			if(arr[i]== 0) break;
			else {
			cnt++;
			}
		}
		
		//4.입력 횟수만큼 배열의 데이터를 하나씩 가져와 홀수에 *2 짝수는 /2 히여 출력
		for(int i=0; i< cnt; i++) { //인덱스 크기는 100이고 입력수는 그것보다 작을 수 있으니 실제 입력받은 갯수인 cnt만큼 돌려야 함
			if(arr[i]%2==0) {
				System.out.print(arr[i]/2 +" ");
			}else{
				System.out.print(arr[i]*2+" ");
			}
		}
				
	}

}
