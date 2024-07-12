
public class TArrayTest1 {

	public static void main(String[] args) {
		
		int[][] arr1; 
		arr1 = new int[5][3]; // 5행 3열의 다차원배열
		//arr1 ={{1,2,3},{4,5.6}}  error 할당 했을때는 초기화 x, 하나씩 초기화 해야함
		
		arr1[0][0] = 1; // 하나씩 초가화 
		arr1[0][1] = 2;
		arr1[0][2] = 3;
		arr1[1][0] = 4;
		arr1[1][1] = 5;
		arr1[1][2] = 6;
		
		int [][] arr2 = new int[2][2];
		
		int[][] arr3 = new int[][] {{1,2,3},{1,2,3}}; // 선언과 초기화 동시에 할때는 크기를 작성하면 안됨

	}

}
