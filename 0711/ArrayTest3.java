//정수 5개의 배열을 할당, 선언하고 1,2,3,4,5 로 초기화 하여, 다음과 같이 출력하시오
//출력 :5,4,3,2,1

public class ArrayTest3 {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5}; // int[] arr = new int[]{1,2,3,4,5}; 와 같다
		for(int i=arr.length-1; i >= 0; i--) { // 인덱스가 초과되면 안됨 주의 
			System.out.print(arr[i]+" ");
		}
	}

}
