package chapter5;

// 2차원 배열 arr2에 담긴 모든 값의 총합과 평균을 구하는 프로그램을 완성하시오
public class Exe5_4 {

	public static void main(String[] args) {
		
		int[][] arr = {
				 { 5, 5, 5, 5, 5},
				 {10,10,10,10,10},
				 {20,20,20,20,20},
				 {30,30,30,30,30}
				 };
				 int total = 0;
				 float average = 0;
		
				 for(int i=0; i<arr.length; i++) { // 행에대한 접근
					 for(int j=0; j<arr[i].length; j++) { // 각행의 열에 접근
						 total += arr[i][j];
					 }
				 }
				 average = (float)total/(arr.length * arr[0].length);
				 
				 
				 System.out.println("totat="+total);
				 System.out.println("average="+average);

	}

}
