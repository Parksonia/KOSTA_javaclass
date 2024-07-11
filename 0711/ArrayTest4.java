import java.util.Scanner;

public class ArrayTest4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int [] arr = new int[num];
		
		for(int i=0; i<arr.length; i++) {
		 arr[i] = sc.nextInt();
		 
		}
	   for(int i=0; i<arr.length; i++) {
		   System.out.print(arr[i]+" ");
	   }
	}

}
//입력 :5
//2 4 6 8 5 <-각각enter
//출력 : 25

