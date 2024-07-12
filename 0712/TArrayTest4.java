import java.util.Scanner;

public class TArrayTest4 {
//2행 4열의 배열 두 개를 만들어서 입력을 받고 두 배열의 곱을 구하여 출력하는 프로그램을 작성하시오.
	public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			int [][] arr1 = new int[2][4];
			int [][] arr2 = new int[2][4]; // 배열 두개 받기
		
			//arr1
			System.out.println("first array");
			for(int i=0; i<arr1.length; i++) {
			
				String[] input = sc.nextLine().split(" ");
				for(int j = 0; j<arr1[i].length; j++) {
					arr1[i][j] =Integer.parseInt(input[j]);
				}
			}
			
			//arr2
			System.out.println("Second array");
			for(int i=0; i<arr2.length; i++) {
			
				String[] input = sc.nextLine().split(" ");
				for(int j = 0; j<arr2[i].length; j++) {
					arr2[i][j] =Integer.parseInt(input[j]);
				}
			}
			//arr1 * arr2 출력
			for(int i=0; i<arr1.length; i++) {
				for(int j=0; j<arr1[i].length; j++ ) {
					System.out.print(arr1[i][j]*arr2[i][j]+"\t");
				}
			System.out.println();
			}
	}

}



//입력
//first array
//1 2 3 4
//5 6 7 8
//second array
//1 4 7 8
//3 6 9 8

//출력
//1 8 21 32
//15 36 63 64