import java.util.Scanner;

public class ArrayTest5 {
//	정수를 입력받다가 0이 입력되면 마지막에 입력된 0을 제외하고 그 때까지 입력된 정수의 일의 자리 숫자가 각각 
//	몇 개인지 작은 수부터 출력하는 프로그램을 작성하시오. (0개인 숫자는 출력하지 않는다.)
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] cnt = new int[10]; // 1의자리의 카운트를 저장할 배열

		while (true) {

			int input = sc.nextInt();
			if (input == 0)
				break;

			if (1 <= input && input <= 9) {
				cnt[input]++; //cnt[input%10]++ 하면 if조건 안써도 됨..
			}

		}
		for(int i=0; i<cnt.length; i++) {
			if(cnt[i]==0)continue;
			System.out.println(String.format("%d : %d개",i,cnt[i]));
		}

	}
}
