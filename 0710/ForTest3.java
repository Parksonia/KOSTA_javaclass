import java.util.Scanner;

public class ForTest3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt(); // 5 입력

		// (1)
		// *****
		// *****
		// *****
		// *****
		// *****

		for (int i = 0; i < cnt; i++) { // 반복문에서 약속처럼 변수명으로 사용 i,j,k
			for (int j = 0; j < cnt; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();

		// (2)
		// cnt =5, i(행) j(열)
		// i=0
		// *
		// **
		// ***
		// ****
		// *****

		for (int k = 0; k < cnt; k++) {
			for (int h = 0; h < k + 1; h++) {
				System.out.print("*");

			}

			System.out.println();
		}
		System.out.println();

		// (3)
		// cnt-i
		// *****
		// ****
		// ***
		// **
		// *

		for (int i = 0; i < cnt; i++) {
			for (int j = cnt; j > i; j--) { // int j=0; j<cnt-i; j++로 해도 됨
				System.out.print("*");
			}

			System.out.println();
		}
		System.out.println();

		// (4)
		//
		// * space4 +*1 cnt5
		// ** space3 +*2
		// ***
		// ****
		// *****
		for (int i = 0; i < cnt; i++) {
			for (int j = 1; j < cnt - i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < i + 1; k++) {
				System.out.print("*");
			}
			System.out.println(); // 줄바꿈
		}
		System.out.println();

		// (5)
		// *****
		// ****
		// ***
		// **
		// *

		for (int i = 0; i < cnt; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}

			for (int j = 0; j < cnt - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// (6) 피라미드
		// * space:4 *1
		// *** s:3 *3
		// ***** s:2 *5
		// ******* s:1
		// *********s:0

		for (int i = 0; i < cnt; i++) { // for(int i=0,st=1,i<cnt;i++,st+=2){
			for (int j = 1; j < cnt - i; j++) { // for(int j=0; j<cnt-i-1; j++) {
				System.out.print(" "); // System.out.print(" ");
			} // }
			for (int k = 0; k < 2 * i + 1; k++) { // for(int j=0; j<st: j++){
				System.out.print("*"); // System.out.print("*")
			} // }

			System.out.println();
		}
	}
}
