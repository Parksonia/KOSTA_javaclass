package com.test01;

public class TestMain01 {

	public static void main(String[] args) {

		int[][] array = { { 12, 41, 36, 56, 21 },
						{ 82, 10, 12, 61, 45 },
						{ 14, 16, 18, 78, 65 },
						{ 45, 26, 72, 23, 34 }, };
		
		//합계,평균 구하기
		double sum =0.0;
		int tCnt=0;
		double avg = 0.0;
		
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				sum += array[i][j];
			}
			avg = sum/(array.length*array[i].length);
		}
		
		System.out.println("합계 :" +sum);
		System.out.println("평균 :" +avg);
	}

}
//출력
//합 계 :  767.0
//평 균 :  38.35