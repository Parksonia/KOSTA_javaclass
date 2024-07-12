import java.util.Scanner;

// 가람이는 주사위 놀이를 하다가 주사위를 10번 던져서 각 숫자가 몇 번씩 나왔는지 알아보려고 한다
//한번 던질 때마다 나온 주사위의 숫자를 입력받아서 각 숫자가 몇번씩 나왔는지 출력하는 프로그램을 작성하시오
public class TArrayTest6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int [] cnt = new int [7];
		
		int count =0 ;
		
		for(int i=0; i<10; i++) {
			
			int input = sc.nextInt();
			cnt[input]++;  //
		
		}
		for(int i=1; i<cnt.length; i++) {
			
			System.out.println(String.format("%d : %d",i,cnt[i]));
		}
		
		
	}

}


// 입력 5 6 3 4 5 5 2 2 4 6 

//출력
//1:0
//2:2
//3:1
//4:2
//5:3
//6:2
