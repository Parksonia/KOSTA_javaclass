package chapter6;

public class Exam6_20 {

	static int[] shuffle(int[] arr) {
		
		for(int i=0; i<100; i++) {
		int idx1 = (int)(Math.random()*9); 
		int idx2 = (int)(Math.random()*9);
		int tmp = arr[idx1];
		arr[idx1] = arr[idx2];
		arr[idx2] = tmp;
		}
		
		return arr;
	}

	public static void main(String[] args) {
		int[] original = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println(java.util.Arrays.toString(original));

		int[] result = shuffle(original); // 섞기(한번만 초기화 될 수 있도록 static으로)
		System.out.println(java.util.Arrays.toString(result));
	}

}
//출력
//[1, 2, 3, 4, 5, 6, 7, 8, 9]
//[4, 9, 8, 2, 1, 3, 7, 6, 5]
