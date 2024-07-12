import java.util.Scanner;

public class ArrayTest3 {

	//1부터 10까지의 정수를 입력받다가 입력된 정수가 범위를 벗어나면 그 때까지 1번 이상 입력된 각 숫자의 개수를 작은 수부터 출력하는 프로그램을 작성하시오.
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int [] cnt = new int [11];  // 입력 받은 수가 인덱스로 활용됨 마지막 입력되는 0 까지 포함
		
		
		while(true) {
			// 반복문으로 입력 받고 범위(1~9) 초과시 break;
			
			int input = sc.nextInt(); 
			if(input<1 || input>9) break;
			// 입력 받은 값의 개수가 카운 트 될 수 있도록 ++ 해줌, 입력 받지 않은 값들은 0으로 초기화됨
			cnt[input]++;
		}

		for(int i=0; i<cnt.length;i++) {
			if(cnt[i]==0) continue;  //입력되지 않은 수는 0으로 초기화 있으니 출력 pass
			System.out.println(String.format("%d : %d개", i,cnt[i]));
		}
		
	}

}
//입력 :5 6 10 9 3 5 3 5 0
//출력 
//3 : 2개
//5 : 3개
//6 : 1개
//9 : 1개
//10 : 1개