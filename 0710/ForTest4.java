import java.util.Scanner;

public class ForTest4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt =sc.nextInt();
		//int a='a';
		int n=1;
		for(int i=0,a='a'; i<cnt; i++) {
			for(int j=0; j<i+1; j++) {
				System.out.print((char)(a+j));
			}
			
			for(int j=cnt; j>i; j--) {
				System.out.print(n++);
			}
			a= ++a +i ;
		
			System.out.println();
		
		}
		
	}
}
//cnt =4 일 경우 
//a 1 2 3 4
//b c 5 6 7
//d e f 8 9
//g h i j 10
//
//cnt  = 5일 경우
//a 1 2 3 4 5
//b c 6 7 8 9 
//d e f 10 11 12
//g h i j 13 14
//k l m n o 15